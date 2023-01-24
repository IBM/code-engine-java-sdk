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
package com.ibm.cloud.code_engine.code_engine.v2.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AppRevision is the response model for app revision resources.
 */
public class AppRevision extends GenericModel {

  /**
   * The type of the app revision.
   */
  public interface ResourceType {
    /** app_revision_v2. */
    String APP_REVISION_V2 = "app_revision_v2";
  }

  /**
   * Optional name of the service account. For built-in service accounts, you can use the shortened names `manager` ,
   * `none`, `reader`, and `writer`.
   */
  public interface RunServiceAccount {
    /** default. */
    String X_DEFAULT = "default";
    /** manager. */
    String MANAGER = "manager";
    /** reader. */
    String READER = "reader";
    /** writer. */
    String WRITER = "writer";
    /** none. */
    String NONE = "none";
  }

  /**
   * The current status of the app revision.
   */
  public interface Status {
    /** ready. */
    String READY = "ready";
    /** loading. */
    String LOADING = "loading";
    /** warning. */
    String WARNING = "warning";
    /** failed. */
    String FAILED = "failed";
  }

  @SerializedName("app_name")
  protected String appName;
  @SerializedName("created_at")
  protected String createdAt;
  protected String href;
  protected String id;
  @SerializedName("image_port")
  protected Long imagePort;
  @SerializedName("image_reference")
  protected String imageReference;
  @SerializedName("image_secret")
  protected String imageSecret;
  protected String name;
  @SerializedName("project_id")
  protected String projectId;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("run_arguments")
  protected List<String> runArguments;
  @SerializedName("run_as_user")
  protected Long runAsUser;
  @SerializedName("run_commands")
  protected List<String> runCommands;
  @SerializedName("run_env_variables")
  protected List<EnvVar> runEnvVariables;
  @SerializedName("run_service_account")
  protected String runServiceAccount;
  @SerializedName("run_volume_mounts")
  protected List<VolumeMount> runVolumeMounts;
  @SerializedName("scale_concurrency")
  protected Long scaleConcurrency;
  @SerializedName("scale_concurrency_target")
  protected Long scaleConcurrencyTarget;
  @SerializedName("scale_cpu_limit")
  protected String scaleCpuLimit;
  @SerializedName("scale_ephemeral_storage_limit")
  protected String scaleEphemeralStorageLimit;
  @SerializedName("scale_initial_instances")
  protected Long scaleInitialInstances;
  @SerializedName("scale_max_instances")
  protected Long scaleMaxInstances;
  @SerializedName("scale_memory_limit")
  protected String scaleMemoryLimit;
  @SerializedName("scale_min_instances")
  protected Long scaleMinInstances;
  @SerializedName("scale_request_timeout")
  protected Long scaleRequestTimeout;
  protected String status;
  @SerializedName("status_details")
  protected AppRevisionStatus statusDetails;

  protected AppRevision() { }

  /**
   * Gets the appName.
   *
   * Name of the associated app.
   *
   * @return the appName
   */
  public String getAppName() {
    return appName;
  }

  /**
   * Gets the createdAt.
   *
   * The date when the resource was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * When you provision a new revision,  a URL is created identifying the location of the instance.
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
   * Gets the imagePort.
   *
   * Optional port the app listens on. While the app will always be exposed via port `443` for end users, this port is
   * used to connect to the port that is exposed by the container image.
   *
   * @return the imagePort
   */
  public Long getImagePort() {
    return imagePort;
  }

  /**
   * Gets the imageReference.
   *
   * The name of the image that is used for this job. The format is `REGISTRY/NAMESPACE/REPOSITORY:TAG` where `REGISTRY`
   * and `TAG` are optional. If `REGISTRY` is not specified, the default is `docker.io`. If `TAG` is not specified, the
   * default is `latest`. If the image reference points to a registry that requires authentication, make sure to also
   * specify the property `image_secret`.
   *
   * @return the imageReference
   */
  public String getImageReference() {
    return imageReference;
  }

  /**
   * Gets the imageSecret.
   *
   * Optional name of the image registry access secret. The image registry access secret is used to authenticate with a
   * private registry when you download the container image. If the image reference points to a registry that requires
   * authentication, the app will be created but cannot reach the ready status, until this property is provided, too.
   *
   * @return the imageSecret
   */
  public String getImageSecret() {
    return imageSecret;
  }

  /**
   * Gets the name.
   *
   * The name of the app revison.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project the resource is located in.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the resourceType.
   *
   * The type of the app revision.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the runArguments.
   *
   * Optional arguments for the app that are passed to start the container. If not specified an empty string array will
   * be applied and the arguments specified by the container image, will be used to start the container.
   *
   * @return the runArguments
   */
  public List<String> getRunArguments() {
    return runArguments;
  }

  /**
   * Gets the runAsUser.
   *
   * Optional user ID (UID) to run the app (e.g., `1001`).
   *
   * @return the runAsUser
   */
  public Long getRunAsUser() {
    return runAsUser;
  }

  /**
   * Gets the runCommands.
   *
   * Optional commands for the app that are passed to start the container. If not specified an empty string array will
   * be applied and the command specified by the container image, will be used to start the container.
   *
   * @return the runCommands
   */
  public List<String> getRunCommands() {
    return runCommands;
  }

  /**
   * Gets the runEnvVariables.
   *
   * References to config maps, secrets or a literal values, which are exposed as environment variables in the
   * application.
   *
   * @return the runEnvVariables
   */
  public List<EnvVar> getRunEnvVariables() {
    return runEnvVariables;
  }

  /**
   * Gets the runServiceAccount.
   *
   * Optional name of the service account. For built-in service accounts, you can use the shortened names `manager` ,
   * `none`, `reader`, and `writer`.
   *
   * @return the runServiceAccount
   */
  public String getRunServiceAccount() {
    return runServiceAccount;
  }

  /**
   * Gets the runVolumeMounts.
   *
   * Mounts of config maps or secrets.
   *
   * @return the runVolumeMounts
   */
  public List<VolumeMount> getRunVolumeMounts() {
    return runVolumeMounts;
  }

  /**
   * Gets the scaleConcurrency.
   *
   * Optional maximum number of requests that can be processed concurrently per instance.
   *
   * @return the scaleConcurrency
   */
  public Long getScaleConcurrency() {
    return scaleConcurrency;
  }

  /**
   * Gets the scaleConcurrencyTarget.
   *
   * Optional threshold of concurrent requests per instance at which one or more additional instances are created. Use
   * this value to scale up instances based on concurrent number of requests. This option defaults to the value of the
   * `scale_concurrency` option, if not specified.
   *
   * @return the scaleConcurrencyTarget
   */
  public Long getScaleConcurrencyTarget() {
    return scaleConcurrencyTarget;
  }

  /**
   * Gets the scaleCpuLimit.
   *
   * Optional number of CPU set for the instance of the app. For valid values see [Supported memory and CPU
   * combinations](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo).
   *
   * @return the scaleCpuLimit
   */
  public String getScaleCpuLimit() {
    return scaleCpuLimit;
  }

  /**
   * Gets the scaleEphemeralStorageLimit.
   *
   * Optional amount of ephemeral storage to set for the instance of the app. The amount specified as ephemeral storage,
   * must not exceed the amount of `scale_memory_limit`. The units for specifying ephemeral storage are Megabyte (M) or
   * Gigabyte (G), whereas G and M are the shorthand expressions for GB and MB. For more information see [Units of
   * measurement](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo#unit-measurements).
   *
   * @return the scaleEphemeralStorageLimit
   */
  public String getScaleEphemeralStorageLimit() {
    return scaleEphemeralStorageLimit;
  }

  /**
   * Gets the scaleInitialInstances.
   *
   * Optional initial number of instances that are created upon app creation or app update.
   *
   * @return the scaleInitialInstances
   */
  public Long getScaleInitialInstances() {
    return scaleInitialInstances;
  }

  /**
   * Gets the scaleMaxInstances.
   *
   * Optional maximum number of instances for this app. If you set this value to `0`, this property does not set a upper
   * scaling limit. However, the app scaling is still limited by the project quota for instances. See [Limits and quotas
   * for Code Engine](https://cloud.ibm.com/docs/codeengine?topic=codeengine-limits).
   *
   * @return the scaleMaxInstances
   */
  public Long getScaleMaxInstances() {
    return scaleMaxInstances;
  }

  /**
   * Gets the scaleMemoryLimit.
   *
   * Optional amount of memory set for the instance of the app. For valid values see [Supported memory and CPU
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
   * Gets the scaleMinInstances.
   *
   * Optional minimum number of instances for this app. If you set this value to `0`, the app will scale down to zero,
   * if not hit by any request for some time.
   *
   * @return the scaleMinInstances
   */
  public Long getScaleMinInstances() {
    return scaleMinInstances;
  }

  /**
   * Gets the scaleRequestTimeout.
   *
   * Optional amount of time in seconds that is allowed for a running app to respond to a request.
   *
   * @return the scaleRequestTimeout
   */
  public Long getScaleRequestTimeout() {
    return scaleRequestTimeout;
  }

  /**
   * Gets the status.
   *
   * The current status of the app revision.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusDetails.
   *
   * The detailed status of the application revision.
   *
   * @return the statusDetails
   */
  public AppRevisionStatus getStatusDetails() {
    return statusDetails;
  }
}

