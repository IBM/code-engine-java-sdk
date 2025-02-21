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

package com.ibm.cloud.code_engine.code_engine.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AppInstance is the response model for app instance resources.
 */
public class AppInstance extends GenericModel {

  /**
   * The type of the app instance.
   */
  public interface ResourceType {
    /** app_instance_v2. */
    String APP_INSTANCE_V2 = "app_instance_v2";
  }

  /**
   * The current status of the instance.
   */
  public interface Status {
    /** pending. */
    String PENDING = "pending";
    /** running. */
    String RUNNING = "running";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
    /** failed. */
    String FAILED = "failed";
  }

  @SerializedName("app_name")
  protected String appName;
  @SerializedName("created_at")
  protected String createdAt;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("project_id")
  protected String projectId;
  protected String region;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("revision_name")
  protected String revisionName;
  @SerializedName("scale_cpu_limit")
  protected String scaleCpuLimit;
  @SerializedName("scale_ephemeral_storage_limit")
  protected String scaleEphemeralStorageLimit;
  @SerializedName("scale_memory_limit")
  protected String scaleMemoryLimit;
  protected String status;
  @SerializedName("status_details")
  protected AppInstanceStatusDetails statusDetails;

  protected AppInstance() { }

  /**
   * Gets the appName.
   *
   * The name of the application that is associated with this instance.
   *
   * @return the appName
   */
  public String getAppName() {
    return appName;
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
   * Gets the href.
   *
   * When you provision a new app instance, a URL is created identifying the location of the instance.
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
   * Gets the name.
   *
   * The name of the app instance.
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
   * The type of the app instance.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the revisionName.
   *
   * The name of the revision that is associated with this instance.
   *
   * @return the revisionName
   */
  public String getRevisionName() {
    return revisionName;
  }

  /**
   * Gets the scaleCpuLimit.
   *
   * The number of CPU set for the instance. For valid values see [Supported memory and CPU
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
   * The amount of ephemeral storage set for the instance. The amount specified as ephemeral storage, must not exceed
   * the amount of `scale_memory_limit`. The units for specifying ephemeral storage are Megabyte (M) or Gigabyte (G),
   * whereas G and M are the shorthand expressions for GB and MB. For more information see [Units of
   * measurement](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo#unit-measurements).
   *
   * @return the scaleEphemeralStorageLimit
   */
  public String getScaleEphemeralStorageLimit() {
    return scaleEphemeralStorageLimit;
  }

  /**
   * Gets the scaleMemoryLimit.
   *
   * The amount of memory set for the instance. For valid values see [Supported memory and CPU
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
   * The current status of the instance.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusDetails.
   *
   * The status of the pod and it's containers.
   *
   * @return the statusDetails
   */
  public AppInstanceStatusDetails getStatusDetails() {
    return statusDetails;
  }
}

