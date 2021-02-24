/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1;

import com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1.model.GetKubeconfigOptions;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.http.Response;

import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONObject;
import io.kubernetes.client.util.KubeConfig;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ConfigMapList;

/**
 * Provides an example of using the IbmCloudCodeEngine package to interact with the Code Engine API.
 */
public class IbmCloudCodeEngineExamples {

  // Suppress utility class error by making private constructor
  private IbmCloudCodeEngineExamples() {
    throw new IllegalStateException("Just an example");
  }

  /**
   * Class method which runs the example.
   *
   * @param args argumments provided to the example program
   */
  public static void main(String[] args) throws Exception {

    // Create an IAM authenticator.
    IamAuthenticator authenticator = new IamAuthenticator(System.getenv("CE_API_KEY"));
    authenticator.setClientIdAndSecret("bx", "bx");

    // Construct the Code Engine Client
    IbmCloudCodeEngine ceClient = new IbmCloudCodeEngine("Code Engine Client", authenticator);
    ceClient.setServiceUrl("https://api." + System.getenv("CE_PROJECT_REGION") + ".codeengine.cloud.ibm.com/api/v1");

    // Get an IAM delegated refresh token using an HTTP client
    URL iamUrl = new URL("https://iam.cloud.ibm.com/identity/token?"
      + "grant_type=urn:ibm:params:oauth:grant-type:apikey&"
      + "response_type=delegated_refresh_token&"
      + "receiver_client_ids=ce&"
      + "delegated_refresh_token_expiry=3600&"
      + "apikey="
      + System.getenv("CE_API_KEY"));
    HttpURLConnection iamConnection = (HttpURLConnection) iamUrl.openConnection();
    iamConnection.setRequestMethod("POST");
    iamConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    BufferedReader iamInput = new BufferedReader(new InputStreamReader(iamConnection.getInputStream()));
    String iamResponse = "";
    String iamInputLine = "";
    while ((iamInputLine = iamInput.readLine()) != null) {
      iamResponse = iamResponse + iamInputLine;
    }
    iamInput.close();
    JSONObject iamJson = new JSONObject(iamResponse);
    String delegatedRefreshToken = iamJson.getString("delegated_refresh_token");

    // Get Code Egnine project config using the Code Engine Client
    GetKubeconfigOptions options = new GetKubeconfigOptions.Builder()
      .id(System.getenv("CE_PROJECT_ID"))
      .xDelegatedRefreshToken(delegatedRefreshToken)
      .build();
    Response<String> kubeConfigResponse = ceClient.getKubeconfig(options).execute();

    // Setup Kubernetes client using the project config
    String kubeConfigString = kubeConfigResponse.getResult();
    Reader kubeConfigReader = new StringReader(kubeConfigString);
    KubeConfig config = KubeConfig.loadKubeConfig(kubeConfigReader);
    ApiClient client = Config.fromConfig(config);
    Configuration.setDefaultApiClient(client);

    // Get something from project.
    CoreV1Api api = new CoreV1Api();
    V1ConfigMapList configMapList = api.listNamespacedConfigMap(config.getNamespace(), null, null, null, null, null, null, null, null, null);
    System.out.printf("Project %s has %d configmaps.", System.getenv("CE_PROJECT_ID"), configMapList.getItems().size());
  }
}
