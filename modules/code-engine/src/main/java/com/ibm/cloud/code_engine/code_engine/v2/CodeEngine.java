/*
 * (C) Copyright IBM Corp. 2025.
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
 * IBM OpenAPI SDK Code Generator Version: 3.94.1-71478489-20240820-161623
 */

package com.ibm.cloud.code_engine.code_engine.v2;

import com.google.gson.JsonObject;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestination;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationList;
import com.ibm.cloud.code_engine.code_engine.v2.model.App;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppInstanceList;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppList;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevision;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevisionList;
import com.ibm.cloud.code_engine.code_engine.v2.model.Binding;
import com.ibm.cloud.code_engine.code_engine.v2.model.BindingList;
import com.ibm.cloud.code_engine.code_engine.v2.model.Build;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildList;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildRun;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildRunList;
import com.ibm.cloud.code_engine.code_engine.v2.model.ConfigMap;
import com.ibm.cloud.code_engine.code_engine.v2.model.ConfigMapList;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateBindingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateBuildRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateJobOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateJobRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateProjectOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteAppRevisionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteBindingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteBuildRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteJobOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteJobRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteProjectOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DomainMapping;
import com.ibm.cloud.code_engine.code_engine.v2.model.DomainMappingList;
import com.ibm.cloud.code_engine.code_engine.v2.model.Function;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionList;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionRuntimeList;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetAppRevisionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetBindingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetBuildRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetJobOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetJobRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetProjectEgressIpsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetProjectOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetProjectStatusDetailsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.Job;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobList;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRun;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRunList;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAppInstancesOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAppRevisionsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAppsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListBindingsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListBuildRunsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListBuildsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListConfigMapsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListDomainMappingsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListFunctionRuntimesOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListFunctionsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListJobRunsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListJobsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListProjectsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListSecretsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.Project;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectEgressIPAddresses;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectList;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectStatusDetails;
import com.ibm.cloud.code_engine.code_engine.v2.model.ReplaceConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ReplaceSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.Secret;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretList;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateJobOptions;
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
 * API Version: 2.0.0
 */
public class CodeEngine extends BaseService {

  /**
   * Default service name used when configuring the `CodeEngine` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "code_engine";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://api.au-syd.codeengine.cloud.ibm.com/v2";

  private String version;

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
   * Gets the version.
   *
   * The API version, in format `YYYY-MM-DD`. For the API behavior documented here, specify any date between
   * `2021-03-31` and `2025-01-10`.
   *
   * @return the version
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * Sets the version.
   *
   * @param version the new version
   */
  public void setVersion(final String version) {
    this.version = version;
  }

  /**
   * List all projects.
   *
   * List all projects in the current account.
   *
   * @param listProjectsOptions the {@link ListProjectsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProjectList}
   */
  public ServiceCall<ProjectList> listProjects(ListProjectsOptions listProjectsOptions) {
    if (listProjectsOptions == null) {
      listProjectsOptions = new ListProjectsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listProjects");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listProjectsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listProjectsOptions.limit()));
    }
    if (listProjectsOptions.start() != null) {
      builder.query("start", String.valueOf(listProjectsOptions.start()));
    }
    ResponseConverter<ProjectList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProjectList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all projects.
   *
   * List all projects in the current account.
   *
   * @return a {@link ServiceCall} with a result of type {@link ProjectList}
   */
  public ServiceCall<ProjectList> listProjects() {
    return listProjects(null);
  }

  /**
   * Create a project.
   *
   * Create a Code Engine project on IBM Cloud. The project will be created in the region that corresponds to the API
   * endpoint that is being called.
   *
   * @param createProjectOptions the {@link CreateProjectOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Project}
   */
  public ServiceCall<Project> createProject(CreateProjectOptions createProjectOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createProjectOptions,
      "createProjectOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createProject");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createProjectOptions.name());
    if (createProjectOptions.resourceGroupId() != null) {
      contentJson.addProperty("resource_group_id", createProjectOptions.resourceGroupId());
    }
    if (createProjectOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createProjectOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Project> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Project>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a project.
   *
   * Display the details of a single project.
   *
   * @param getProjectOptions the {@link GetProjectOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Project}
   */
  public ServiceCall<Project> getProject(GetProjectOptions getProjectOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getProjectOptions,
      "getProjectOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getProjectOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getProject");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Project> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Project>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a project.
   *
   * Delete a project.
   *
   * @param deleteProjectOptions the {@link DeleteProjectOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteProject(DeleteProjectOptions deleteProjectOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteProjectOptions,
      "deleteProjectOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteProjectOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteProject");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List allowed outbound destinations.
   *
   * List all allowed outbound destinations in a project.
   *
   * @param listAllowedOutboundDestinationOptions the {@link ListAllowedOutboundDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllowedOutboundDestinationList}
   */
  public ServiceCall<AllowedOutboundDestinationList> listAllowedOutboundDestination(ListAllowedOutboundDestinationOptions listAllowedOutboundDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAllowedOutboundDestinationOptions,
      "listAllowedOutboundDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listAllowedOutboundDestinationOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/allowed_outbound_destinations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listAllowedOutboundDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllowedOutboundDestinationOptions.limit() != null) {
      builder.query("limit", String.valueOf(listAllowedOutboundDestinationOptions.limit()));
    }
    if (listAllowedOutboundDestinationOptions.start() != null) {
      builder.query("start", String.valueOf(listAllowedOutboundDestinationOptions.start()));
    }
    ResponseConverter<AllowedOutboundDestinationList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllowedOutboundDestinationList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an allowed outbound destination.
   *
   * Create an allowed outbound destination.
   *
   * @param createAllowedOutboundDestinationOptions the {@link CreateAllowedOutboundDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllowedOutboundDestination}
   */
  public ServiceCall<AllowedOutboundDestination> createAllowedOutboundDestination(CreateAllowedOutboundDestinationOptions createAllowedOutboundDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createAllowedOutboundDestinationOptions,
      "createAllowedOutboundDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createAllowedOutboundDestinationOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/allowed_outbound_destinations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createAllowedOutboundDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createAllowedOutboundDestinationOptions.allowedOutboundDestination()), "application/json");
    ResponseConverter<AllowedOutboundDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllowedOutboundDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get an allowed outbound destination.
   *
   * Display the details of an allowed outbound destination.
   *
   * @param getAllowedOutboundDestinationOptions the {@link GetAllowedOutboundDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllowedOutboundDestination}
   */
  public ServiceCall<AllowedOutboundDestination> getAllowedOutboundDestination(GetAllowedOutboundDestinationOptions getAllowedOutboundDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAllowedOutboundDestinationOptions,
      "getAllowedOutboundDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getAllowedOutboundDestinationOptions.projectId());
    pathParamsMap.put("name", getAllowedOutboundDestinationOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/allowed_outbound_destinations/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getAllowedOutboundDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<AllowedOutboundDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllowedOutboundDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an allowed outbound destination.
   *
   * Delete an allowed outbound destination.
   *
   * @param deleteAllowedOutboundDestinationOptions the {@link DeleteAllowedOutboundDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteAllowedOutboundDestination(DeleteAllowedOutboundDestinationOptions deleteAllowedOutboundDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAllowedOutboundDestinationOptions,
      "deleteAllowedOutboundDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteAllowedOutboundDestinationOptions.projectId());
    pathParamsMap.put("name", deleteAllowedOutboundDestinationOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/allowed_outbound_destinations/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteAllowedOutboundDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an allowed outbound destination.
   *
   * Update an allowed outbound destination.
   *
   * @param updateAllowedOutboundDestinationOptions the {@link UpdateAllowedOutboundDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllowedOutboundDestination}
   */
  public ServiceCall<AllowedOutboundDestination> updateAllowedOutboundDestination(UpdateAllowedOutboundDestinationOptions updateAllowedOutboundDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAllowedOutboundDestinationOptions,
      "updateAllowedOutboundDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", updateAllowedOutboundDestinationOptions.projectId());
    pathParamsMap.put("name", updateAllowedOutboundDestinationOptions.name());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/allowed_outbound_destinations/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "updateAllowedOutboundDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updateAllowedOutboundDestinationOptions.ifMatch());
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateAllowedOutboundDestinationOptions.allowedOutboundDestination()), "application/merge-patch+json");
    ResponseConverter<AllowedOutboundDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllowedOutboundDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List egress IP addresses.
   *
   * Lists all egress IP addresses (public and private) that are used by components running in this project. For
   * information about using egress IP addresses, see [Code Engine public and private IP
   * addresses](https://cloud.ibm.com/docs/codeengine?topic=codeengine-network-addresses).
   *
   * @param getProjectEgressIpsOptions the {@link GetProjectEgressIpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProjectEgressIPAddresses}
   */
  public ServiceCall<ProjectEgressIPAddresses> getProjectEgressIps(GetProjectEgressIpsOptions getProjectEgressIpsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getProjectEgressIpsOptions,
      "getProjectEgressIpsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getProjectEgressIpsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/egress_ips", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getProjectEgressIps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ProjectEgressIPAddresses> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProjectEgressIPAddresses>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the status details for a project.
   *
   * Retrieves status details about the given project.
   *
   * @param getProjectStatusDetailsOptions the {@link GetProjectStatusDetailsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProjectStatusDetails}
   */
  public ServiceCall<ProjectStatusDetails> getProjectStatusDetails(GetProjectStatusDetailsOptions getProjectStatusDetailsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getProjectStatusDetailsOptions,
      "getProjectStatusDetailsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getProjectStatusDetailsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/status_details", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getProjectStatusDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ProjectStatusDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProjectStatusDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List applications.
   *
   * List all applications in a project.
   *
   * @param listAppsOptions the {@link ListAppsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AppList}
   */
  public ServiceCall<AppList> listApps(ListAppsOptions listAppsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAppsOptions,
      "listAppsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listAppsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/apps", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listApps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    if (listAppsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listAppsOptions.limit()));
    }
    if (listAppsOptions.start() != null) {
      builder.query("start", String.valueOf(listAppsOptions.start()));
    }
    ResponseConverter<AppList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AppList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an application.
   *
   * Create an application.
   *
   * @param createAppOptions the {@link CreateAppOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link App}
   */
  public ServiceCall<App> createApp(CreateAppOptions createAppOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createAppOptions,
      "createAppOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createAppOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/apps", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createApp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("image_reference", createAppOptions.imageReference());
    contentJson.addProperty("name", createAppOptions.name());
    if (createAppOptions.imagePort() != null) {
      contentJson.addProperty("image_port", createAppOptions.imagePort());
    }
    if (createAppOptions.imageSecret() != null) {
      contentJson.addProperty("image_secret", createAppOptions.imageSecret());
    }
    if (createAppOptions.managedDomainMappings() != null) {
      contentJson.addProperty("managed_domain_mappings", createAppOptions.managedDomainMappings());
    }
    if (createAppOptions.probeLiveness() != null) {
      contentJson.add("probe_liveness", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAppOptions.probeLiveness()));
    }
    if (createAppOptions.probeReadiness() != null) {
      contentJson.add("probe_readiness", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAppOptions.probeReadiness()));
    }
    if (createAppOptions.runArguments() != null) {
      contentJson.add("run_arguments", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAppOptions.runArguments()));
    }
    if (createAppOptions.runAsUser() != null) {
      contentJson.addProperty("run_as_user", createAppOptions.runAsUser());
    }
    if (createAppOptions.runCommands() != null) {
      contentJson.add("run_commands", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAppOptions.runCommands()));
    }
    if (createAppOptions.runEnvVariables() != null) {
      contentJson.add("run_env_variables", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAppOptions.runEnvVariables()));
    }
    if (createAppOptions.runServiceAccount() != null) {
      contentJson.addProperty("run_service_account", createAppOptions.runServiceAccount());
    }
    if (createAppOptions.runVolumeMounts() != null) {
      contentJson.add("run_volume_mounts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAppOptions.runVolumeMounts()));
    }
    if (createAppOptions.scaleConcurrency() != null) {
      contentJson.addProperty("scale_concurrency", createAppOptions.scaleConcurrency());
    }
    if (createAppOptions.scaleConcurrencyTarget() != null) {
      contentJson.addProperty("scale_concurrency_target", createAppOptions.scaleConcurrencyTarget());
    }
    if (createAppOptions.scaleCpuLimit() != null) {
      contentJson.addProperty("scale_cpu_limit", createAppOptions.scaleCpuLimit());
    }
    if (createAppOptions.scaleDownDelay() != null) {
      contentJson.addProperty("scale_down_delay", createAppOptions.scaleDownDelay());
    }
    if (createAppOptions.scaleEphemeralStorageLimit() != null) {
      contentJson.addProperty("scale_ephemeral_storage_limit", createAppOptions.scaleEphemeralStorageLimit());
    }
    if (createAppOptions.scaleInitialInstances() != null) {
      contentJson.addProperty("scale_initial_instances", createAppOptions.scaleInitialInstances());
    }
    if (createAppOptions.scaleMaxInstances() != null) {
      contentJson.addProperty("scale_max_instances", createAppOptions.scaleMaxInstances());
    }
    if (createAppOptions.scaleMemoryLimit() != null) {
      contentJson.addProperty("scale_memory_limit", createAppOptions.scaleMemoryLimit());
    }
    if (createAppOptions.scaleMinInstances() != null) {
      contentJson.addProperty("scale_min_instances", createAppOptions.scaleMinInstances());
    }
    if (createAppOptions.scaleRequestTimeout() != null) {
      contentJson.addProperty("scale_request_timeout", createAppOptions.scaleRequestTimeout());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<App> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<App>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get an application.
   *
   * Display the details of an application.
   *
   * @param getAppOptions the {@link GetAppOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link App}
   */
  public ServiceCall<App> getApp(GetAppOptions getAppOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAppOptions,
      "getAppOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getAppOptions.projectId());
    pathParamsMap.put("name", getAppOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/apps/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getApp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<App> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<App>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an application.
   *
   * Delete an application.
   *
   * @param deleteAppOptions the {@link DeleteAppOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteApp(DeleteAppOptions deleteAppOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAppOptions,
      "deleteAppOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteAppOptions.projectId());
    pathParamsMap.put("name", deleteAppOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/apps/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteApp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an application.
   *
   * An application contains one or more revisions. A revision represents an immutable version of the configuration
   * properties of the application. Each update of an application configuration property creates a new revision of the
   * application. [Learn more](https://cloud.ibm.com/docs/codeengine?topic=codeengine-update-app).
   *
   * @param updateAppOptions the {@link UpdateAppOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link App}
   */
  public ServiceCall<App> updateApp(UpdateAppOptions updateAppOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAppOptions,
      "updateAppOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", updateAppOptions.projectId());
    pathParamsMap.put("name", updateAppOptions.name());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/apps/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "updateApp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updateAppOptions.ifMatch());
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateAppOptions.app()), "application/merge-patch+json");
    ResponseConverter<App> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<App>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List application revisions.
   *
   * List all application revisions in a particular application.
   *
   * @param listAppRevisionsOptions the {@link ListAppRevisionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AppRevisionList}
   */
  public ServiceCall<AppRevisionList> listAppRevisions(ListAppRevisionsOptions listAppRevisionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAppRevisionsOptions,
      "listAppRevisionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listAppRevisionsOptions.projectId());
    pathParamsMap.put("app_name", listAppRevisionsOptions.appName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/apps/{app_name}/revisions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listAppRevisions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAppRevisionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listAppRevisionsOptions.limit()));
    }
    if (listAppRevisionsOptions.start() != null) {
      builder.query("start", String.valueOf(listAppRevisionsOptions.start()));
    }
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<AppRevisionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AppRevisionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get an application revision.
   *
   * Display the details of an application revision.
   *
   * @param getAppRevisionOptions the {@link GetAppRevisionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AppRevision}
   */
  public ServiceCall<AppRevision> getAppRevision(GetAppRevisionOptions getAppRevisionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAppRevisionOptions,
      "getAppRevisionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getAppRevisionOptions.projectId());
    pathParamsMap.put("app_name", getAppRevisionOptions.appName());
    pathParamsMap.put("name", getAppRevisionOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/apps/{app_name}/revisions/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getAppRevision");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<AppRevision> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AppRevision>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an application revision.
   *
   * Delete an application revision.
   *
   * @param deleteAppRevisionOptions the {@link DeleteAppRevisionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteAppRevision(DeleteAppRevisionOptions deleteAppRevisionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAppRevisionOptions,
      "deleteAppRevisionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteAppRevisionOptions.projectId());
    pathParamsMap.put("app_name", deleteAppRevisionOptions.appName());
    pathParamsMap.put("name", deleteAppRevisionOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/apps/{app_name}/revisions/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteAppRevision");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List application instances.
   *
   * List all instances of an application.
   *
   * @param listAppInstancesOptions the {@link ListAppInstancesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AppInstanceList}
   */
  public ServiceCall<AppInstanceList> listAppInstances(ListAppInstancesOptions listAppInstancesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAppInstancesOptions,
      "listAppInstancesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listAppInstancesOptions.projectId());
    pathParamsMap.put("app_name", listAppInstancesOptions.appName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/apps/{app_name}/instances", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listAppInstances");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAppInstancesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listAppInstancesOptions.limit()));
    }
    if (listAppInstancesOptions.start() != null) {
      builder.query("start", String.valueOf(listAppInstancesOptions.start()));
    }
    ResponseConverter<AppInstanceList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AppInstanceList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List jobs.
   *
   * List all jobs in a project.
   *
   * @param listJobsOptions the {@link ListJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobList}
   */
  public ServiceCall<JobList> listJobs(ListJobsOptions listJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listJobsOptions,
      "listJobsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listJobsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/jobs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    if (listJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listJobsOptions.limit()));
    }
    if (listJobsOptions.start() != null) {
      builder.query("start", String.valueOf(listJobsOptions.start()));
    }
    ResponseConverter<JobList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a job.
   *
   * Create a job.
   *
   * @param createJobOptions the {@link CreateJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> createJob(CreateJobOptions createJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createJobOptions,
      "createJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createJobOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/jobs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("image_reference", createJobOptions.imageReference());
    contentJson.addProperty("name", createJobOptions.name());
    if (createJobOptions.imageSecret() != null) {
      contentJson.addProperty("image_secret", createJobOptions.imageSecret());
    }
    if (createJobOptions.runArguments() != null) {
      contentJson.add("run_arguments", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.runArguments()));
    }
    if (createJobOptions.runAsUser() != null) {
      contentJson.addProperty("run_as_user", createJobOptions.runAsUser());
    }
    if (createJobOptions.runCommands() != null) {
      contentJson.add("run_commands", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.runCommands()));
    }
    if (createJobOptions.runEnvVariables() != null) {
      contentJson.add("run_env_variables", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.runEnvVariables()));
    }
    if (createJobOptions.runMode() != null) {
      contentJson.addProperty("run_mode", createJobOptions.runMode());
    }
    if (createJobOptions.runServiceAccount() != null) {
      contentJson.addProperty("run_service_account", createJobOptions.runServiceAccount());
    }
    if (createJobOptions.runVolumeMounts() != null) {
      contentJson.add("run_volume_mounts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.runVolumeMounts()));
    }
    if (createJobOptions.scaleArraySpec() != null) {
      contentJson.addProperty("scale_array_spec", createJobOptions.scaleArraySpec());
    }
    if (createJobOptions.scaleCpuLimit() != null) {
      contentJson.addProperty("scale_cpu_limit", createJobOptions.scaleCpuLimit());
    }
    if (createJobOptions.scaleEphemeralStorageLimit() != null) {
      contentJson.addProperty("scale_ephemeral_storage_limit", createJobOptions.scaleEphemeralStorageLimit());
    }
    if (createJobOptions.scaleMaxExecutionTime() != null) {
      contentJson.addProperty("scale_max_execution_time", createJobOptions.scaleMaxExecutionTime());
    }
    if (createJobOptions.scaleMemoryLimit() != null) {
      contentJson.addProperty("scale_memory_limit", createJobOptions.scaleMemoryLimit());
    }
    if (createJobOptions.scaleRetryLimit() != null) {
      contentJson.addProperty("scale_retry_limit", createJobOptions.scaleRetryLimit());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a job.
   *
   * Display the details of a job.
   *
   * @param getJobOptions the {@link GetJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> getJob(GetJobOptions getJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getJobOptions,
      "getJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getJobOptions.projectId());
    pathParamsMap.put("name", getJobOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/jobs/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a job.
   *
   * Delete a job.
   *
   * @param deleteJobOptions the {@link DeleteJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteJob(DeleteJobOptions deleteJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteJobOptions,
      "deleteJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteJobOptions.projectId());
    pathParamsMap.put("name", deleteJobOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/jobs/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a job.
   *
   * Update the given job.
   *
   * @param updateJobOptions the {@link UpdateJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> updateJob(UpdateJobOptions updateJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateJobOptions,
      "updateJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", updateJobOptions.projectId());
    pathParamsMap.put("name", updateJobOptions.name());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/jobs/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "updateJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updateJobOptions.ifMatch());
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateJobOptions.job()), "application/merge-patch+json");
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List job runs.
   *
   * List all job runs in a project.
   *
   * @param listJobRunsOptions the {@link ListJobRunsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobRunList}
   */
  public ServiceCall<JobRunList> listJobRuns(ListJobRunsOptions listJobRunsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listJobRunsOptions,
      "listJobRunsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listJobRunsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/job_runs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listJobRuns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    if (listJobRunsOptions.jobName() != null) {
      builder.query("job_name", String.valueOf(listJobRunsOptions.jobName()));
    }
    if (listJobRunsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listJobRunsOptions.limit()));
    }
    if (listJobRunsOptions.start() != null) {
      builder.query("start", String.valueOf(listJobRunsOptions.start()));
    }
    ResponseConverter<JobRunList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobRunList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a job run.
   *
   * Create an job run.
   *
   * @param createJobRunOptions the {@link CreateJobRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobRun}
   */
  public ServiceCall<JobRun> createJobRun(CreateJobRunOptions createJobRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createJobRunOptions,
      "createJobRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createJobRunOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/job_runs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createJobRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    final JsonObject contentJson = new JsonObject();
    if (createJobRunOptions.imageReference() != null) {
      contentJson.addProperty("image_reference", createJobRunOptions.imageReference());
    }
    if (createJobRunOptions.imageSecret() != null) {
      contentJson.addProperty("image_secret", createJobRunOptions.imageSecret());
    }
    if (createJobRunOptions.jobName() != null) {
      contentJson.addProperty("job_name", createJobRunOptions.jobName());
    }
    if (createJobRunOptions.name() != null) {
      contentJson.addProperty("name", createJobRunOptions.name());
    }
    if (createJobRunOptions.runArguments() != null) {
      contentJson.add("run_arguments", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobRunOptions.runArguments()));
    }
    if (createJobRunOptions.runAsUser() != null) {
      contentJson.addProperty("run_as_user", createJobRunOptions.runAsUser());
    }
    if (createJobRunOptions.runCommands() != null) {
      contentJson.add("run_commands", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobRunOptions.runCommands()));
    }
    if (createJobRunOptions.runEnvVariables() != null) {
      contentJson.add("run_env_variables", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobRunOptions.runEnvVariables()));
    }
    if (createJobRunOptions.runMode() != null) {
      contentJson.addProperty("run_mode", createJobRunOptions.runMode());
    }
    if (createJobRunOptions.runServiceAccount() != null) {
      contentJson.addProperty("run_service_account", createJobRunOptions.runServiceAccount());
    }
    if (createJobRunOptions.runVolumeMounts() != null) {
      contentJson.add("run_volume_mounts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobRunOptions.runVolumeMounts()));
    }
    if (createJobRunOptions.scaleArraySizeVariableOverride() != null) {
      contentJson.addProperty("scale_array_size_variable_override", createJobRunOptions.scaleArraySizeVariableOverride());
    }
    if (createJobRunOptions.scaleArraySpec() != null) {
      contentJson.addProperty("scale_array_spec", createJobRunOptions.scaleArraySpec());
    }
    if (createJobRunOptions.scaleCpuLimit() != null) {
      contentJson.addProperty("scale_cpu_limit", createJobRunOptions.scaleCpuLimit());
    }
    if (createJobRunOptions.scaleEphemeralStorageLimit() != null) {
      contentJson.addProperty("scale_ephemeral_storage_limit", createJobRunOptions.scaleEphemeralStorageLimit());
    }
    if (createJobRunOptions.scaleMaxExecutionTime() != null) {
      contentJson.addProperty("scale_max_execution_time", createJobRunOptions.scaleMaxExecutionTime());
    }
    if (createJobRunOptions.scaleMemoryLimit() != null) {
      contentJson.addProperty("scale_memory_limit", createJobRunOptions.scaleMemoryLimit());
    }
    if (createJobRunOptions.scaleRetryLimit() != null) {
      contentJson.addProperty("scale_retry_limit", createJobRunOptions.scaleRetryLimit());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<JobRun> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobRun>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a job run.
   *
   * Display the details of a job run.
   *
   * @param getJobRunOptions the {@link GetJobRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobRun}
   */
  public ServiceCall<JobRun> getJobRun(GetJobRunOptions getJobRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getJobRunOptions,
      "getJobRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getJobRunOptions.projectId());
    pathParamsMap.put("name", getJobRunOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/job_runs/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getJobRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<JobRun> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobRun>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a job run.
   *
   * Delete a job run.
   *
   * @param deleteJobRunOptions the {@link DeleteJobRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteJobRun(DeleteJobRunOptions deleteJobRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteJobRunOptions,
      "deleteJobRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteJobRunOptions.projectId());
    pathParamsMap.put("name", deleteJobRunOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/job_runs/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteJobRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the function runtimes.
   *
   * List all valid function runtimes.
   *
   * @param listFunctionRuntimesOptions the {@link ListFunctionRuntimesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FunctionRuntimeList}
   */
  public ServiceCall<FunctionRuntimeList> listFunctionRuntimes(ListFunctionRuntimesOptions listFunctionRuntimesOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/function_runtimes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listFunctionRuntimes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<FunctionRuntimeList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FunctionRuntimeList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the function runtimes.
   *
   * List all valid function runtimes.
   *
   * @return a {@link ServiceCall} with a result of type {@link FunctionRuntimeList}
   */
  public ServiceCall<FunctionRuntimeList> listFunctionRuntimes() {
    return listFunctionRuntimes(null);
  }

  /**
   * List functions.
   *
   * List all functions in a project.
   *
   * @param listFunctionsOptions the {@link ListFunctionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FunctionList}
   */
  public ServiceCall<FunctionList> listFunctions(ListFunctionsOptions listFunctionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listFunctionsOptions,
      "listFunctionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listFunctionsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/functions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listFunctions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    if (listFunctionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listFunctionsOptions.limit()));
    }
    if (listFunctionsOptions.start() != null) {
      builder.query("start", String.valueOf(listFunctionsOptions.start()));
    }
    ResponseConverter<FunctionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FunctionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a function.
   *
   * Create a function.
   *
   * @param createFunctionOptions the {@link CreateFunctionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Function}
   */
  public ServiceCall<Function> createFunction(CreateFunctionOptions createFunctionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createFunctionOptions,
      "createFunctionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createFunctionOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/functions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createFunction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("code_reference", createFunctionOptions.codeReference());
    contentJson.addProperty("name", createFunctionOptions.name());
    contentJson.addProperty("runtime", createFunctionOptions.runtime());
    if (createFunctionOptions.codeBinary() != null) {
      contentJson.addProperty("code_binary", createFunctionOptions.codeBinary());
    }
    if (createFunctionOptions.codeMain() != null) {
      contentJson.addProperty("code_main", createFunctionOptions.codeMain());
    }
    if (createFunctionOptions.codeSecret() != null) {
      contentJson.addProperty("code_secret", createFunctionOptions.codeSecret());
    }
    if (createFunctionOptions.managedDomainMappings() != null) {
      contentJson.addProperty("managed_domain_mappings", createFunctionOptions.managedDomainMappings());
    }
    if (createFunctionOptions.runEnvVariables() != null) {
      contentJson.add("run_env_variables", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createFunctionOptions.runEnvVariables()));
    }
    if (createFunctionOptions.scaleConcurrency() != null) {
      contentJson.addProperty("scale_concurrency", createFunctionOptions.scaleConcurrency());
    }
    if (createFunctionOptions.scaleCpuLimit() != null) {
      contentJson.addProperty("scale_cpu_limit", createFunctionOptions.scaleCpuLimit());
    }
    if (createFunctionOptions.scaleDownDelay() != null) {
      contentJson.addProperty("scale_down_delay", createFunctionOptions.scaleDownDelay());
    }
    if (createFunctionOptions.scaleMaxExecutionTime() != null) {
      contentJson.addProperty("scale_max_execution_time", createFunctionOptions.scaleMaxExecutionTime());
    }
    if (createFunctionOptions.scaleMemoryLimit() != null) {
      contentJson.addProperty("scale_memory_limit", createFunctionOptions.scaleMemoryLimit());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Function> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Function>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a function.
   *
   * Display the details of a function.
   *
   * @param getFunctionOptions the {@link GetFunctionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Function}
   */
  public ServiceCall<Function> getFunction(GetFunctionOptions getFunctionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getFunctionOptions,
      "getFunctionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getFunctionOptions.projectId());
    pathParamsMap.put("name", getFunctionOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/functions/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getFunction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<Function> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Function>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a function.
   *
   * Delete a function.
   *
   * @param deleteFunctionOptions the {@link DeleteFunctionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteFunction(DeleteFunctionOptions deleteFunctionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteFunctionOptions,
      "deleteFunctionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteFunctionOptions.projectId());
    pathParamsMap.put("name", deleteFunctionOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/functions/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteFunction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a function.
   *
   * Update the given function.
   *
   * @param updateFunctionOptions the {@link UpdateFunctionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Function}
   */
  public ServiceCall<Function> updateFunction(UpdateFunctionOptions updateFunctionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateFunctionOptions,
      "updateFunctionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", updateFunctionOptions.projectId());
    pathParamsMap.put("name", updateFunctionOptions.name());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/functions/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "updateFunction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updateFunctionOptions.ifMatch());
    if (this.version != null) {
      builder.query("version", String.valueOf(this.version));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateFunctionOptions.function()), "application/merge-patch+json");
    ResponseConverter<Function> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Function>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List bindings.
   *
   * List all bindings in a project.
   *
   * @param listBindingsOptions the {@link ListBindingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BindingList}
   */
  public ServiceCall<BindingList> listBindings(ListBindingsOptions listBindingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBindingsOptions,
      "listBindingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listBindingsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/bindings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listBindings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listBindingsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBindingsOptions.limit()));
    }
    if (listBindingsOptions.start() != null) {
      builder.query("start", String.valueOf(listBindingsOptions.start()));
    }
    ResponseConverter<BindingList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BindingList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a binding.
   *
   * Create a binding. Creating a service binding with a Code Engine app will update the app, creating a new revision.
   * For more information see the
   * [documentaion](https://cloud.ibm.com/docs/codeengine?topic=codeengine-service-binding).
   *
   * @param createBindingOptions the {@link CreateBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Binding}
   */
  public ServiceCall<Binding> createBinding(CreateBindingOptions createBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBindingOptions,
      "createBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createBindingOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/bindings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.add("component", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBindingOptions.component()));
    contentJson.addProperty("prefix", createBindingOptions.prefix());
    contentJson.addProperty("secret_name", createBindingOptions.secretName());
    builder.bodyJson(contentJson);
    ResponseConverter<Binding> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Binding>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a binding.
   *
   * Display the details of a binding.
   *
   * @param getBindingOptions the {@link GetBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Binding}
   */
  public ServiceCall<Binding> getBinding(GetBindingOptions getBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBindingOptions,
      "getBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getBindingOptions.projectId());
    pathParamsMap.put("id", getBindingOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/bindings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Binding> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Binding>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a binding.
   *
   * Delete a binding.
   *
   * @param deleteBindingOptions the {@link DeleteBindingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteBinding(DeleteBindingOptions deleteBindingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBindingOptions,
      "deleteBindingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteBindingOptions.projectId());
    pathParamsMap.put("id", deleteBindingOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/bindings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteBinding");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List builds.
   *
   * List all builds in a project.
   *
   * @param listBuildsOptions the {@link ListBuildsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BuildList}
   */
  public ServiceCall<BuildList> listBuilds(ListBuildsOptions listBuildsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBuildsOptions,
      "listBuildsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listBuildsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/builds", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listBuilds");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listBuildsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBuildsOptions.limit()));
    }
    if (listBuildsOptions.start() != null) {
      builder.query("start", String.valueOf(listBuildsOptions.start()));
    }
    ResponseConverter<BuildList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BuildList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a build.
   *
   * Create a build.
   *
   * @param createBuildOptions the {@link CreateBuildOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Build}
   */
  public ServiceCall<Build> createBuild(CreateBuildOptions createBuildOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBuildOptions,
      "createBuildOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createBuildOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/builds", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createBuild");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createBuildOptions.name());
    contentJson.addProperty("output_image", createBuildOptions.outputImage());
    contentJson.addProperty("output_secret", createBuildOptions.outputSecret());
    contentJson.addProperty("strategy_type", createBuildOptions.strategyType());
    if (createBuildOptions.sourceContextDir() != null) {
      contentJson.addProperty("source_context_dir", createBuildOptions.sourceContextDir());
    }
    if (createBuildOptions.sourceRevision() != null) {
      contentJson.addProperty("source_revision", createBuildOptions.sourceRevision());
    }
    if (createBuildOptions.sourceSecret() != null) {
      contentJson.addProperty("source_secret", createBuildOptions.sourceSecret());
    }
    if (createBuildOptions.sourceType() != null) {
      contentJson.addProperty("source_type", createBuildOptions.sourceType());
    }
    if (createBuildOptions.sourceUrl() != null) {
      contentJson.addProperty("source_url", createBuildOptions.sourceUrl());
    }
    if (createBuildOptions.strategySize() != null) {
      contentJson.addProperty("strategy_size", createBuildOptions.strategySize());
    }
    if (createBuildOptions.strategySpecFile() != null) {
      contentJson.addProperty("strategy_spec_file", createBuildOptions.strategySpecFile());
    }
    if (createBuildOptions.timeout() != null) {
      contentJson.addProperty("timeout", createBuildOptions.timeout());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Build> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Build>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a build.
   *
   * Display the details of a build.
   *
   * @param getBuildOptions the {@link GetBuildOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Build}
   */
  public ServiceCall<Build> getBuild(GetBuildOptions getBuildOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBuildOptions,
      "getBuildOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getBuildOptions.projectId());
    pathParamsMap.put("name", getBuildOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/builds/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getBuild");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Build> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Build>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a build.
   *
   * Delete a build.
   *
   * @param deleteBuildOptions the {@link DeleteBuildOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteBuild(DeleteBuildOptions deleteBuildOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBuildOptions,
      "deleteBuildOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteBuildOptions.projectId());
    pathParamsMap.put("name", deleteBuildOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/builds/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteBuild");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a build.
   *
   * Update a build.
   *
   * @param updateBuildOptions the {@link UpdateBuildOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Build}
   */
  public ServiceCall<Build> updateBuild(UpdateBuildOptions updateBuildOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBuildOptions,
      "updateBuildOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", updateBuildOptions.projectId());
    pathParamsMap.put("name", updateBuildOptions.name());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/builds/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "updateBuild");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updateBuildOptions.ifMatch());
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateBuildOptions.build()), "application/merge-patch+json");
    ResponseConverter<Build> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Build>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List build runs.
   *
   * List all build runs in a project.
   *
   * @param listBuildRunsOptions the {@link ListBuildRunsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BuildRunList}
   */
  public ServiceCall<BuildRunList> listBuildRuns(ListBuildRunsOptions listBuildRunsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBuildRunsOptions,
      "listBuildRunsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listBuildRunsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/build_runs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listBuildRuns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listBuildRunsOptions.buildName() != null) {
      builder.query("build_name", String.valueOf(listBuildRunsOptions.buildName()));
    }
    if (listBuildRunsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBuildRunsOptions.limit()));
    }
    if (listBuildRunsOptions.start() != null) {
      builder.query("start", String.valueOf(listBuildRunsOptions.start()));
    }
    ResponseConverter<BuildRunList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BuildRunList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a build run.
   *
   * Create a build run.
   *
   * @param createBuildRunOptions the {@link CreateBuildRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BuildRun}
   */
  public ServiceCall<BuildRun> createBuildRun(CreateBuildRunOptions createBuildRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBuildRunOptions,
      "createBuildRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createBuildRunOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/build_runs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createBuildRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createBuildRunOptions.buildName() != null) {
      contentJson.addProperty("build_name", createBuildRunOptions.buildName());
    }
    if (createBuildRunOptions.name() != null) {
      contentJson.addProperty("name", createBuildRunOptions.name());
    }
    if (createBuildRunOptions.outputImage() != null) {
      contentJson.addProperty("output_image", createBuildRunOptions.outputImage());
    }
    if (createBuildRunOptions.outputSecret() != null) {
      contentJson.addProperty("output_secret", createBuildRunOptions.outputSecret());
    }
    if (createBuildRunOptions.serviceAccount() != null) {
      contentJson.addProperty("service_account", createBuildRunOptions.serviceAccount());
    }
    if (createBuildRunOptions.sourceContextDir() != null) {
      contentJson.addProperty("source_context_dir", createBuildRunOptions.sourceContextDir());
    }
    if (createBuildRunOptions.sourceRevision() != null) {
      contentJson.addProperty("source_revision", createBuildRunOptions.sourceRevision());
    }
    if (createBuildRunOptions.sourceSecret() != null) {
      contentJson.addProperty("source_secret", createBuildRunOptions.sourceSecret());
    }
    if (createBuildRunOptions.sourceType() != null) {
      contentJson.addProperty("source_type", createBuildRunOptions.sourceType());
    }
    if (createBuildRunOptions.sourceUrl() != null) {
      contentJson.addProperty("source_url", createBuildRunOptions.sourceUrl());
    }
    if (createBuildRunOptions.strategySize() != null) {
      contentJson.addProperty("strategy_size", createBuildRunOptions.strategySize());
    }
    if (createBuildRunOptions.strategySpecFile() != null) {
      contentJson.addProperty("strategy_spec_file", createBuildRunOptions.strategySpecFile());
    }
    if (createBuildRunOptions.strategyType() != null) {
      contentJson.addProperty("strategy_type", createBuildRunOptions.strategyType());
    }
    if (createBuildRunOptions.timeout() != null) {
      contentJson.addProperty("timeout", createBuildRunOptions.timeout());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BuildRun> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BuildRun>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a build run.
   *
   * Display the details of a build run.
   *
   * @param getBuildRunOptions the {@link GetBuildRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BuildRun}
   */
  public ServiceCall<BuildRun> getBuildRun(GetBuildRunOptions getBuildRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBuildRunOptions,
      "getBuildRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getBuildRunOptions.projectId());
    pathParamsMap.put("name", getBuildRunOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/build_runs/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getBuildRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<BuildRun> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BuildRun>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a build run.
   *
   * Delete a build run.
   *
   * @param deleteBuildRunOptions the {@link DeleteBuildRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteBuildRun(DeleteBuildRunOptions deleteBuildRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBuildRunOptions,
      "deleteBuildRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteBuildRunOptions.projectId());
    pathParamsMap.put("name", deleteBuildRunOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/build_runs/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteBuildRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List domain mappings.
   *
   * List all domain mappings in a project.
   *
   * @param listDomainMappingsOptions the {@link ListDomainMappingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DomainMappingList}
   */
  public ServiceCall<DomainMappingList> listDomainMappings(ListDomainMappingsOptions listDomainMappingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDomainMappingsOptions,
      "listDomainMappingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listDomainMappingsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/domain_mappings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listDomainMappings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDomainMappingsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDomainMappingsOptions.limit()));
    }
    if (listDomainMappingsOptions.start() != null) {
      builder.query("start", String.valueOf(listDomainMappingsOptions.start()));
    }
    ResponseConverter<DomainMappingList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DomainMappingList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a domain mapping.
   *
   * Create a domain mapping.
   *
   * @param createDomainMappingOptions the {@link CreateDomainMappingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DomainMapping}
   */
  public ServiceCall<DomainMapping> createDomainMapping(CreateDomainMappingOptions createDomainMappingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDomainMappingOptions,
      "createDomainMappingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createDomainMappingOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/domain_mappings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createDomainMapping");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.add("component", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDomainMappingOptions.component()));
    contentJson.addProperty("name", createDomainMappingOptions.name());
    contentJson.addProperty("tls_secret", createDomainMappingOptions.tlsSecret());
    builder.bodyJson(contentJson);
    ResponseConverter<DomainMapping> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DomainMapping>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a domain mapping.
   *
   * Get domain mapping.
   *
   * @param getDomainMappingOptions the {@link GetDomainMappingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DomainMapping}
   */
  public ServiceCall<DomainMapping> getDomainMapping(GetDomainMappingOptions getDomainMappingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDomainMappingOptions,
      "getDomainMappingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getDomainMappingOptions.projectId());
    pathParamsMap.put("name", getDomainMappingOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/domain_mappings/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getDomainMapping");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DomainMapping> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DomainMapping>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a domain mapping.
   *
   * Delete a domain mapping.
   *
   * @param deleteDomainMappingOptions the {@link DeleteDomainMappingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDomainMapping(DeleteDomainMappingOptions deleteDomainMappingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDomainMappingOptions,
      "deleteDomainMappingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteDomainMappingOptions.projectId());
    pathParamsMap.put("name", deleteDomainMappingOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/domain_mappings/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteDomainMapping");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a domain mapping.
   *
   * Update a domain mapping.
   *
   * @param updateDomainMappingOptions the {@link UpdateDomainMappingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DomainMapping}
   */
  public ServiceCall<DomainMapping> updateDomainMapping(UpdateDomainMappingOptions updateDomainMappingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDomainMappingOptions,
      "updateDomainMappingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", updateDomainMappingOptions.projectId());
    pathParamsMap.put("name", updateDomainMappingOptions.name());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/domain_mappings/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "updateDomainMapping");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updateDomainMappingOptions.ifMatch());
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateDomainMappingOptions.domainMapping()), "application/merge-patch+json");
    ResponseConverter<DomainMapping> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DomainMapping>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List config maps.
   *
   * List all config maps in a project.
   *
   * @param listConfigMapsOptions the {@link ListConfigMapsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigMapList}
   */
  public ServiceCall<ConfigMapList> listConfigMaps(ListConfigMapsOptions listConfigMapsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listConfigMapsOptions,
      "listConfigMapsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listConfigMapsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/config_maps", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listConfigMaps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listConfigMapsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listConfigMapsOptions.limit()));
    }
    if (listConfigMapsOptions.start() != null) {
      builder.query("start", String.valueOf(listConfigMapsOptions.start()));
    }
    ResponseConverter<ConfigMapList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigMapList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a config map.
   *
   * Create a config map.
   *
   * @param createConfigMapOptions the {@link CreateConfigMapOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigMap}
   */
  public ServiceCall<ConfigMap> createConfigMap(CreateConfigMapOptions createConfigMapOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createConfigMapOptions,
      "createConfigMapOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createConfigMapOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/config_maps", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createConfigMap");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createConfigMapOptions.name());
    if (createConfigMapOptions.data() != null) {
      contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createConfigMapOptions.data()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigMap> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigMap>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a config map.
   *
   * Display the details of a config map.
   *
   * @param getConfigMapOptions the {@link GetConfigMapOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigMap}
   */
  public ServiceCall<ConfigMap> getConfigMap(GetConfigMapOptions getConfigMapOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfigMapOptions,
      "getConfigMapOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getConfigMapOptions.projectId());
    pathParamsMap.put("name", getConfigMapOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/config_maps/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getConfigMap");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ConfigMap> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigMap>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a config map.
   *
   * Update a config map.
   *
   * @param replaceConfigMapOptions the {@link ReplaceConfigMapOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigMap}
   */
  public ServiceCall<ConfigMap> replaceConfigMap(ReplaceConfigMapOptions replaceConfigMapOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceConfigMapOptions,
      "replaceConfigMapOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", replaceConfigMapOptions.projectId());
    pathParamsMap.put("name", replaceConfigMapOptions.name());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/config_maps/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "replaceConfigMap");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replaceConfigMapOptions.ifMatch());
    final JsonObject contentJson = new JsonObject();
    if (replaceConfigMapOptions.data() != null) {
      contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfigMapOptions.data()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigMap> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigMap>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a config map.
   *
   * Delete a config map.
   *
   * @param deleteConfigMapOptions the {@link DeleteConfigMapOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteConfigMap(DeleteConfigMapOptions deleteConfigMapOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteConfigMapOptions,
      "deleteConfigMapOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteConfigMapOptions.projectId());
    pathParamsMap.put("name", deleteConfigMapOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/config_maps/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteConfigMap");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List secrets.
   *
   * List all secrets in a project.
   *
   * @param listSecretsOptions the {@link ListSecretsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecretList}
   */
  public ServiceCall<SecretList> listSecrets(ListSecretsOptions listSecretsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSecretsOptions,
      "listSecretsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", listSecretsOptions.projectId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/secrets", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "listSecrets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSecretsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSecretsOptions.limit()));
    }
    if (listSecretsOptions.start() != null) {
      builder.query("start", String.valueOf(listSecretsOptions.start()));
    }
    ResponseConverter<SecretList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecretList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a secret.
   *
   * Create a secret.
   *
   * @param createSecretOptions the {@link CreateSecretOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Secret}
   */
  public ServiceCall<Secret> createSecret(CreateSecretOptions createSecretOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSecretOptions,
      "createSecretOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", createSecretOptions.projectId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/secrets", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "createSecret");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("format", createSecretOptions.format());
    contentJson.addProperty("name", createSecretOptions.name());
    if (createSecretOptions.data() != null) {
      contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecretOptions.data()));
    }
    if (createSecretOptions.serviceAccess() != null) {
      contentJson.add("service_access", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecretOptions.serviceAccess()));
    }
    if (createSecretOptions.serviceOperator() != null) {
      contentJson.add("service_operator", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSecretOptions.serviceOperator()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Secret> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Secret>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a secret.
   *
   * Get a secret.
   *
   * @param getSecretOptions the {@link GetSecretOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Secret}
   */
  public ServiceCall<Secret> getSecret(GetSecretOptions getSecretOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecretOptions,
      "getSecretOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", getSecretOptions.projectId());
    pathParamsMap.put("name", getSecretOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/secrets/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "getSecret");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Secret> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Secret>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a secret.
   *
   * Update a secret.
   *
   * @param replaceSecretOptions the {@link ReplaceSecretOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Secret}
   */
  public ServiceCall<Secret> replaceSecret(ReplaceSecretOptions replaceSecretOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceSecretOptions,
      "replaceSecretOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", replaceSecretOptions.projectId());
    pathParamsMap.put("name", replaceSecretOptions.name());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/secrets/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "replaceSecret");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replaceSecretOptions.ifMatch());
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("format", replaceSecretOptions.format());
    if (replaceSecretOptions.data() != null) {
      contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceSecretOptions.data()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Secret> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Secret>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a secret.
   *
   * Delete a secret.
   *
   * @param deleteSecretOptions the {@link DeleteSecretOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSecret(DeleteSecretOptions deleteSecretOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSecretOptions,
      "deleteSecretOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("project_id", deleteSecretOptions.projectId());
    pathParamsMap.put("name", deleteSecretOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/projects/{project_id}/secrets/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("code_engine", "v2", "deleteSecret");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

}
