/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.code_engine.code_engine.v2.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Function is the response model for function resources.
 */
public class Function extends GenericModel {

  /**
   * Optional value controlling which of the system managed domain mappings will be setup for the function. Valid values
   * are 'local_public', 'local_private' and 'local'. Visibility can only be 'local_private' if the project supports
   * function private visibility.
   */
  public interface ManagedDomainMappings {
    /** local. */
    String LOCAL = "local";
    /** local_private. */
    String LOCAL_PRIVATE = "local_private";
    /** local_public. */
    String LOCAL_PUBLIC = "local_public";
  }

  /**
   * The type of the function.
   */
  public interface ResourceType {
    /** function_v2. */
    String FUNCTION_V2 = "function_v2";
  }

  /**
   * The current status of the function.
   */
  public interface Status {
    /** offline. */
    String OFFLINE = "offline";
    /** deploying. */
    String DEPLOYING = "deploying";
    /** ready. */
    String READY = "ready";
    /** failed. */
    String FAILED = "failed";
  }

  @SerializedName("code_binary")
  protected Boolean codeBinary;
  @SerializedName("code_main")
  protected String codeMain;
  @SerializedName("code_reference")
  protected String codeReference;
  @SerializedName("code_secret")
  protected String codeSecret;
  @SerializedName("computed_env_variables")
  protected List<EnvVar> computedEnvVariables;
  @SerializedName("created_at")
  protected String createdAt;
  protected String endpoint;
  @SerializedName("endpoint_internal")
  protected String endpointInternal;
  @SerializedName("entity_tag")
  protected String entityTag;
  protected String href;
  protected String id;
  @SerializedName("managed_domain_mappings")
  protected String managedDomainMappings;
  protected String name;
  @SerializedName("project_id")
  protected String projectId;
  protected String region;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("run_env_variables")
  protected List<EnvVar> runEnvVariables;
  protected String runtime;
  @SerializedName("scale_concurrency")
  protected Long scaleConcurrency;
  @SerializedName("scale_cpu_limit")
  protected String scaleCpuLimit;
  @SerializedName("scale_down_delay")
  protected Long scaleDownDelay;
  @SerializedName("scale_max_execution_time")
  protected Long scaleMaxExecutionTime;
  @SerializedName("scale_memory_limit")
  protected String scaleMemoryLimit;
  protected String status;
  @SerializedName("status_details")
  protected FunctionStatus statusDetails;

  protected Function() { }

  /**
   * Gets the codeBinary.
   *
   * Specifies whether the code is binary or not. Defaults to false when `code_reference` is set to a data URL. When
   * `code_reference` is set to a code bundle URL, this field is always true.
   *
   * @return the codeBinary
   */
  public Boolean isCodeBinary() {
    return codeBinary;
  }

  /**
   * Gets the codeMain.
   *
   * Specifies the name of the function that should be invoked.
   *
   * @return the codeMain
   */
  public String getCodeMain() {
    return codeMain;
  }

  /**
   * Gets the codeReference.
   *
   * Specifies either a reference to a code bundle or the source code itself. To specify the source code, use the data
   * URL scheme and include the source code as base64 encoded. The data URL scheme is defined in [RFC
   * 2397](https://tools.ietf.org/html/rfc2397).
   *
   * @return the codeReference
   */
  public String getCodeReference() {
    return codeReference;
  }

  /**
   * Gets the codeSecret.
   *
   * The name of the secret that is used to access the specified `code_reference`. The secret is used to authenticate
   * with a non-public endpoint that is specified as`code_reference`.
   *
   * @return the codeSecret
   */
  public String getCodeSecret() {
    return codeSecret;
  }

  /**
   * Gets the computedEnvVariables.
   *
   * References to config maps, secrets or literal values, which are defined and set by Code Engine and are exposed as
   * environment variables in the function.
   *
   * @return the computedEnvVariables
   */
  public List<EnvVar> getComputedEnvVariables() {
    return computedEnvVariables;
  }

  /**
   * Gets the createdAt.
   *
   * The timestamp when the resource was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the endpoint.
   *
   * URL to invoke the function.
   *
   * @return the endpoint
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Gets the endpointInternal.
   *
   * URL to function that is only visible within the project.
   *
   * @return the endpointInternal
   */
  public String getEndpointInternal() {
    return endpointInternal;
  }

  /**
   * Gets the entityTag.
   *
   * The version of the function instance, which is used to achieve optimistic locking.
   *
   * @return the entityTag
   */
  public String getEntityTag() {
    return entityTag;
  }

  /**
   * Gets the href.
   *
   * When you provision a new function, a relative URL path is created identifying the location of the instance.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The identifier of the resource.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the managedDomainMappings.
   *
   * Optional value controlling which of the system managed domain mappings will be setup for the function. Valid values
   * are 'local_public', 'local_private' and 'local'. Visibility can only be 'local_private' if the project supports
   * function private visibility.
   *
   * @return the managedDomainMappings
   */
  public String getManagedDomainMappings() {
    return managedDomainMappings;
  }

  /**
   * Gets the name.
   *
   * The name of the function.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project in which the resource is located.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the region.
   *
   * The region of the project the resource is located in. Possible values: 'au-syd', 'br-sao', 'ca-tor', 'eu-de',
   * 'eu-gb', 'jp-osa', 'jp-tok', 'us-east', 'us-south'.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the resourceType.
   *
   * The type of the function.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the runEnvVariables.
   *
   * References to config maps, secrets or literal values, which are defined by the function owner and are exposed as
   * environment variables in the function.
   *
   * @return the runEnvVariables
   */
  public List<EnvVar> getRunEnvVariables() {
    return runEnvVariables;
  }

  /**
   * Gets the runtime.
   *
   * The managed runtime used to execute the injected code.
   *
   * @return the runtime
   */
  public String getRuntime() {
    return runtime;
  }

  /**
   * Gets the scaleConcurrency.
   *
   * Number of parallel requests handled by a single instance, supported only by Node.js, default is `1`.
   *
   * @return the scaleConcurrency
   */
  public Long getScaleConcurrency() {
    return scaleConcurrency;
  }

  /**
   * Gets the scaleCpuLimit.
   *
   * Optional amount of CPU set for the instance of the function. For valid values see [Supported memory and CPU
   * combinations](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo).
   *
   * @return the scaleCpuLimit
   */
  public String getScaleCpuLimit() {
    return scaleCpuLimit;
  }

  /**
   * Gets the scaleDownDelay.
   *
   * Optional amount of time in seconds that delays the scale down behavior for a function.
   *
   * @return the scaleDownDelay
   */
  public Long getScaleDownDelay() {
    return scaleDownDelay;
  }

  /**
   * Gets the scaleMaxExecutionTime.
   *
   * Timeout in secs after which the function is terminated.
   *
   * @return the scaleMaxExecutionTime
   */
  public Long getScaleMaxExecutionTime() {
    return scaleMaxExecutionTime;
  }

  /**
   * Gets the scaleMemoryLimit.
   *
   * Optional amount of memory set for the instance of the function. For valid values see [Supported memory and CPU
   * combinations](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo). The units for specifying
   * memory are Megabyte (M) or Gigabyte (G), whereas G and M are the shorthand expressions for GB and MB. For more
   * information see [Units of
   * measurement](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo#unit-measurements).
   *
   * @return the scaleMemoryLimit
   */
  public String getScaleMemoryLimit() {
    return scaleMemoryLimit;
  }

  /**
   * Gets the status.
   *
   * The current status of the function.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusDetails.
   *
   * The detailed status of the function.
   *
   * @return the statusDetails
   */
  public FunctionStatus getStatusDetails() {
    return statusDetails;
  }
}

