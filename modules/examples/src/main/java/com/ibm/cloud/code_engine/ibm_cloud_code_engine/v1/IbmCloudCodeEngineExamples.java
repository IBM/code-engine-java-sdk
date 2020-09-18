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

import com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1.model.ListKubeconfigOptions;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.http.Response;

import java.io.Reader;
import java.io.StringReader;
import io.kubernetes.client.util.KubeConfig;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ConfigMapList;

public class IbmCloudCodeEngineExamples {

  public static void main(String[] args) throws Exception {

    // Create an IAM authenticator.
    IamAuthenticator authenticator = new IamAuthenticator(System.getenv("CE_API_KEY"));
    authenticator.setClientIdAndSecret("bx", "bx");

    // Construct the Code Engine Client
    IbmCloudCodeEngine ceClient = new IbmCloudCodeEngine("Code Engine Client", authenticator);
    ceClient.setServiceUrl("https://api." + System.getenv("CE_PROJECT_REGION") + ".codeengine.cloud.ibm.com/api/v1");

    // Get an IAM refresh token using the authenticator.
    String refreshToken = authenticator.requestToken().getRefreshToken();

    // Get Code Egnine project config using the Code Engine Client
    ListKubeconfigOptions options = new ListKubeconfigOptions.Builder()
      .id(System.getenv("CE_PROJECT_ID"))
      .refreshToken(refreshToken)
      .build();
    Response<String> kubeConfigResponse = ceClient.listKubeconfig(options).execute();
    
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
