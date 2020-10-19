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

/*
 * IBM OpenAPI SDK Code Generator Version: 99-SNAPSHOT-29f65b85-20201019-110440
 */

package com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1;

import com.ibm.cloud.code_engine.common.SdkCommon;
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
 * The purpose is to provide an API to get Kubeconfig for IBM Cloud Code Engine Project.
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
   * Retrieve KUBECONFIG for a specified project.
   *
   * Returns the KUBECONFIG, similar to the output of `kubectl config view --minify=true`.
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
    builder.header("Accept", "text/plain");
    builder.header("Refresh-Token", listKubeconfigOptions.refreshToken());
    ResponseConverter<String> responseConverter = ResponseConverterUtils.getString();
    return createServiceCall(builder.build(), responseConverter);
  }

}
