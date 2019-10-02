/*
 * (C) Copyright IBM Corp. 2019.
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
package com.ibm.cloud.mysdk.example_service.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.mysdk.common.SdkCommon;
import com.ibm.cloud.mysdk.example_service.v1.model.CreateResourceOptions;
import com.ibm.cloud.mysdk.example_service.v1.model.GetResourceOptions;
import com.ibm.cloud.mysdk.example_service.v1.model.ListResourcesOptions;
import com.ibm.cloud.mysdk.example_service.v1.model.Resource;
import com.ibm.cloud.mysdk.example_service.v1.model.Resources;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.Map;
import java.util.Map.Entry;

/**
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator).
 *
 * @version v1
 */
public class ExampleService extends BaseService {

  private static final String SERVICE_NAME = "example_service";
  private static final String SERVICE_URL = "http://cloud.ibm.com/mysdk/v1";

  /**
   * Constructs a new `ExampleService` client with the specified Authenticator.
   *
   * @param authenticator the Authenticator instance to be configured for this service
   */
  public ExampleService(Authenticator authenticator) {
    super(SERVICE_NAME, authenticator);
    if ((getServiceUrl() == null) || getServiceUrl().isEmpty()) {
      setServiceUrl(SERVICE_URL);
    }
  }

  /**
   * List all resources.
   *
   * @param listResourcesOptions the {@link ListResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link Resources}
   */
  public ServiceCall<Resources> listResources(ListResourcesOptions listResourcesOptions) {
    String[] pathSegments = { "resources" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("example_service", "v1", "listResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listResourcesOptions != null) {
      if (listResourcesOptions.limit() != null) {
          builder.query("limit", String.valueOf(listResourcesOptions.limit()));
      }
    }
    ResponseConverter<Resources> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Resources>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all resources.
   *
   * @return a {@link ServiceCall} with a response type of {@link Resources}
   */
  public ServiceCall<Resources> listResources() {
    return listResources(null);
  }

  /**
   * Create a resource.
   *
   * @param createResourceOptions the {@link CreateResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link Resource}
   */
  public ServiceCall<Resource> createResource(CreateResourceOptions createResourceOptions) {
    String[] pathSegments = { "resources" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("example_service", "v1", "createResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createResourceOptions != null) {
      final JsonObject contentJson = new JsonObject();
      if (createResourceOptions.resourceId() != null) {
          contentJson.addProperty("resource_id", createResourceOptions.resourceId());
      }
      if (createResourceOptions.name() != null) {
          contentJson.addProperty("name", createResourceOptions.name());
      }
      if (createResourceOptions.tag() != null) {
          contentJson.addProperty("tag", createResourceOptions.tag());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Resource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Resource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a resource.
   *
   * @return a {@link ServiceCall} with a response type of {@link Resource}
   */
  public ServiceCall<Resource> createResource() {
    return createResource(null);
  }

  /**
   * Info for a specific resource.
   *
   * @param getResourceOptions the {@link GetResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a response type of {@link Resource}
   */
  public ServiceCall<Resource> getResource(GetResourceOptions getResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getResourceOptions,
      "getResourceOptions cannot be null");
    String[] pathSegments = { "resources" };
    String[] pathParameters = { getResourceOptions.resourceId() };
    RequestBuilder builder =
      RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("example_service", "v1", "getResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");

    ResponseConverter<Resource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Resource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}