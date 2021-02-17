/*
 * (C) Copyright IBM Corp. 2021.
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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.15.0-45841b53-20201019-214802
 */

package com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1;

import com.ibm.cloud.code_engine.common.SdkCommon;
import com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1.model.GetKubeconfigOptions;
import com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1.model.ListKubeconfigOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * The purpose is to provide an API to get Kubeconfig file for IBM Cloud Code Engine Project.
 *
 * @version v1
 */
public class IbmCloudCodeEngine extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "ibm_cloud_code_engine";

  public static final String DEFAULT_SERVICE_URL = "https://ibm-cloud-code-engine.cloud.ibm.com/api/v1";

 /**
   * Class method which constructs an instance of the `IbmCloudCodeEngine` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `IbmCloudCodeEngine` client using external configuration
   */
  public static IbmCloudCodeEngine newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `IbmCloudCodeEngine` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `IbmCloudCodeEngine` client using external configuration
   */
  public static IbmCloudCodeEngine newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    IbmCloudCodeEngine service = new IbmCloudCodeEngine(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `IbmCloudCodeEngine` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public IbmCloudCodeEngine(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Deprecated soon: Retrieve KUBECONFIG for a specified project.
   *
   * **Deprecated soon**: This API will be deprecated soon. Use the [GET /project/{id}/config](#get-kubeconfig) API
   * instead. Returns the KUBECONFIG file, similar to the output of `kubectl config view --minify=true`.
   *
   * @param listKubeconfigOptions the {@link ListKubeconfigOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> listKubeconfig(ListKubeconfigOptions listKubeconfigOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listKubeconfigOptions,
      "listKubeconfigOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listKubeconfigOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/namespaces/{id}/config", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ibm_cloud_code_engine", "v1", "listKubeconfig");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Refresh-Token", listKubeconfigOptions.refreshToken());
    if (listKubeconfigOptions.accept() != null) {
      builder.header("Accept", listKubeconfigOptions.accept());
    }
    ResponseConverter<String> responseConverter = ResponseConverterUtils.getString();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve KUBECONFIG for a specified project.
   *
   * Returns the KUBECONFIG, similar to the output of `kubectl config view --minify=true`. There are 2 tokens in the
   * Request Header and a query parameter that you must provide.
   *  These values can be generated as follows: 1. Auth Header Pass the generated IAM Token as the Authorization header
   * from the CLI as `token=cat $HOME/.bluemix/config.json | jq .IAMToken -r`. Generate the token with the [Create an
   * IAM access token for a user or service ID using an API
   * key](https://cloud.ibm.com/apidocs/iam-identity-token-api#gettoken-apikey) API.
   *
   * 2. X-Delegated-Refresh-Token Header Generate an IAM Delegated Refresh Token for Code Engine with the [Create an IAM
   * access token and delegated refresh token for a user or service
   * ID](https://cloud.ibm.com/apidocs/iam-identity-token-api#gettoken-apikey-delegatedrefreshtoken) API. Specify the
   * `receiver_client_ids` value to be `ce` and the `delegated_refresh_token_expiry` value to be `3600`.
   *
   * 3. Project ID In order to retrieve the Kubeconfig file for a specific Code Engine project, use the CLI to extract
   * the ID
   * `id=ibmcloud ce project get -n ${CE_PROJECT_NAME} -o jsonpath={.guid}` You must be logged into the account where
   * the project was created to retrieve the ID.
   *
   * @param getKubeconfigOptions the {@link GetKubeconfigOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> getKubeconfig(GetKubeconfigOptions getKubeconfigOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getKubeconfigOptions,
      "getKubeconfigOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getKubeconfigOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/project/{id}/config", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ibm_cloud_code_engine", "v1", "getKubeconfig");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("X-Delegated-Refresh-Token", getKubeconfigOptions.xDelegatedRefreshToken());
    if (getKubeconfigOptions.accept() != null) {
      builder.header("Accept", getKubeconfigOptions.accept());
    }
    ResponseConverter<String> responseConverter = ResponseConverterUtils.getString();
    return createServiceCall(builder.build(), responseConverter);
  }

}
