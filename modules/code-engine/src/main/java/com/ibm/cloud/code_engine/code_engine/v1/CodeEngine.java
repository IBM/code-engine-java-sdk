/*
 * (C) Copyright IBM Corp. 2023.
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
 * IBM OpenAPI SDK Code Generator Version: 3.64.0-959a5845-20230112-195144
 */

package com.ibm.cloud.code_engine.code_engine.v1;

import com.ibm.cloud.code_engine.code_engine.v1.model.ProjectConfigGetOptions;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1ProjectKubeConfig;
import com.ibm.cloud.code_engine.common.SdkCommon;
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
 * REST API for Code Engine.
 *
 * API Version: 1.0.0
 */
public class CodeEngine extends BaseService {

  /**
   * Default service name used when configuring the `CodeEngine` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "code_engine";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://api.au-syd.codeengine.cloud.ibm.com/api/v1";

 /**
   * Class method which constructs an instance of the `CodeEngine` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `CodeEngine` client using external configuration
   */
  public static CodeEngine newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `CodeEngine` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `CodeEngine` client using external configuration
   */
  public static CodeEngine newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    CodeEngine service = new CodeEngine(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `CodeEngine` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public CodeEngine(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Get a project config.
   *
   * Returns the KUBECONFIG, similar to the output of `kubectl config view --minify=true`.
   *
   * @param projectConfigGetOptions the {@link ProjectConfigGetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link V1ProjectKubeConfig}
   */
  public ServiceCall<V1ProjectKubeConfig> projectConfigGet(ProjectConfigGetOptions projectConfigGetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(projectConfigGetOptions,
      "projectConfigGetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_guid", projectConfigGetOptions.projectGuid());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v1/project/{project_guid}/config", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v1", "projectConfigGet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Delegated-Refresh-Token", projectConfigGetOptions.xDelegatedRefreshToken());
    if (projectConfigGetOptions.endpoint() != null) {
      builder.query("endpoint", String.valueOf(projectConfigGetOptions.endpoint()));
    }
    ResponseConverter<V1ProjectKubeConfig> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<V1ProjectKubeConfig>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
