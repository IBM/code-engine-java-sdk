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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response model for build run objects.
 */
public class BuildRun extends GenericModel {

  /**
   * The type of the build run.
   */
  public interface ResourceType {
    /** build_run_v2. */
    String BUILD_RUN_V2 = "build_run_v2";
  }

  /**
   * Optional service account, which is used for resource control.” or “Optional service account that is used for
   * resource control.
   */
  public interface ServiceAccount {
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
   * Specifies the type of source to determine if your build source is in a repository or based on local source code.
   * * local - For builds from local source code.
   * * git - For builds from git version controlled source code.
   */
  public interface SourceType {
    /** local. */
    String LOCAL = "local";
    /** git. */
    String GIT = "git";
  }

  /**
   * The current status of the build run.
   */
  public interface Status {
    /** succeeded. */
    String SUCCEEDED = "succeeded";
    /** running. */
    String RUNNING = "running";
    /** pending. */
    String PENDING = "pending";
    /** failed. */
    String FAILED = "failed";
  }

  @SerializedName("build_name")
  protected String buildName;
  @SerializedName("created_at")
  protected String createdAt;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("output_image")
  protected String outputImage;
  @SerializedName("output_secret")
  protected String outputSecret;
  @SerializedName("project_id")
  protected String projectId;
  protected String region;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("service_account")
  protected String serviceAccount;
  @SerializedName("source_context_dir")
  protected String sourceContextDir;
  @SerializedName("source_revision")
  protected String sourceRevision;
  @SerializedName("source_secret")
  protected String sourceSecret;
  @SerializedName("source_type")
  protected String sourceType;
  @SerializedName("source_url")
  protected String sourceUrl;
  protected String status;
  @SerializedName("status_details")
  protected BuildRunStatus statusDetails;
  @SerializedName("strategy_size")
  protected String strategySize;
  @SerializedName("strategy_spec_file")
  protected String strategySpecFile;
  @SerializedName("strategy_type")
  protected String strategyType;
  protected Long timeout;

  protected BuildRun() { }

  /**
   * Gets the buildName.
   *
   * Optional name of the build on which this build run is based on. If specified, the build run will inherit the
   * configuration of the referenced build. If not specified, make sure to specify at least the fields `strategy_type`,
   * `source_url`, `output_image` and `output_secret` to describe the build run.
   *
   * @return the buildName
   */
  public String getBuildName() {
    return buildName;
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
   * When you trigger a new build run,  a URL is created identifying the location of the instance.
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
   * The name of the build run.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the outputImage.
   *
   * The name of the image.
   *
   * @return the outputImage
   */
  public String getOutputImage() {
    return outputImage;
  }

  /**
   * Gets the outputSecret.
   *
   * The secret that is required to access the image registry. Make sure that the secret is granted with push
   * permissions towards the specified container registry namespace.
   *
   * @return the outputSecret
   */
  public String getOutputSecret() {
    return outputSecret;
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
   * The type of the build run.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the serviceAccount.
   *
   * Optional service account, which is used for resource control.” or “Optional service account that is used for
   * resource control.
   *
   * @return the serviceAccount
   */
  public String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Gets the sourceContextDir.
   *
   * Optional directory in the repository that contains the buildpacks file or the Dockerfile.
   *
   * @return the sourceContextDir
   */
  public String getSourceContextDir() {
    return sourceContextDir;
  }

  /**
   * Gets the sourceRevision.
   *
   * Commit, tag, or branch in the source repository to pull. This field is optional if the `source_type` is `git` and
   * uses the HEAD of default branch if not specified. If the `source_type` value is `local`, this field must be
   * omitted.
   *
   * @return the sourceRevision
   */
  public String getSourceRevision() {
    return sourceRevision;
  }

  /**
   * Gets the sourceSecret.
   *
   * Name of the secret that is used access the repository source. This field is optional if the `source_type` is `git`.
   * Additionally, if the `source_url` points to a repository that requires authentication, the build will be created
   * but cannot access any source code, until this property is provided, too. If the `source_type` value is `local`,
   * this field must be omitted.
   *
   * @return the sourceSecret
   */
  public String getSourceSecret() {
    return sourceSecret;
  }

  /**
   * Gets the sourceType.
   *
   * Specifies the type of source to determine if your build source is in a repository or based on local source code.
   * * local - For builds from local source code.
   * * git - For builds from git version controlled source code.
   *
   * @return the sourceType
   */
  public String getSourceType() {
    return sourceType;
  }

  /**
   * Gets the sourceUrl.
   *
   * The URL of the code repository. This field is required if the `source_type` is `git`. If the `source_type` value is
   * `local`, this field must be omitted. If the repository is publicly available you can provide a 'https' URL like
   * `https://github.com/IBM/CodeEngine`. If the repository requires authentication, you need to provide a 'ssh' URL
   * like `git@github.com:IBM/CodeEngine.git` along with a `source_secret` that points to a secret of format `ssh_auth`.
   *
   * @return the sourceUrl
   */
  public String getSourceUrl() {
    return sourceUrl;
  }

  /**
   * Gets the status.
   *
   * The current status of the build run.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusDetails.
   *
   * Current status condition of a build run.
   *
   * @return the statusDetails
   */
  public BuildRunStatus getStatusDetails() {
    return statusDetails;
  }

  /**
   * Gets the strategySize.
   *
   * Optional size for the build, which determines the amount of resources used. Build sizes are `small`, `medium`,
   * `large`, `xlarge`, `xxlarge`.
   *
   * @return the strategySize
   */
  public String getStrategySize() {
    return strategySize;
  }

  /**
   * Gets the strategySpecFile.
   *
   * Optional path to the specification file that is used for build strategies for building an image.
   *
   * @return the strategySpecFile
   */
  public String getStrategySpecFile() {
    return strategySpecFile;
  }

  /**
   * Gets the strategyType.
   *
   * The strategy to use for building the image.
   *
   * @return the strategyType
   */
  public String getStrategyType() {
    return strategyType;
  }

  /**
   * Gets the timeout.
   *
   * The maximum amount of time, in seconds, that can pass before the build must succeed or fail.
   *
   * @return the timeout
   */
  public Long getTimeout() {
    return timeout;
  }
}

