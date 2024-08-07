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
 * Details of the observed container status.
 */
public class ContainerStatusDetails extends GenericModel {

  /**
   * The reason the container is not yet running or has failed. Only populated in non-running states.
   */
  public interface Reason {
    /** ready. */
    String READY = "ready";
    /** waiting. */
    String WAITING = "waiting";
    /** deploying. */
    String DEPLOYING = "deploying";
    /** deploying_waiting_for_resources. */
    String DEPLOYING_WAITING_FOR_RESOURCES = "deploying_waiting_for_resources";
    /** initial_scale_never_achieved. */
    String INITIAL_SCALE_NEVER_ACHIEVED = "initial_scale_never_achieved";
    /** fetch_image_failed_unknown_manifest. */
    String FETCH_IMAGE_FAILED_UNKNOWN_MANIFEST = "fetch_image_failed_unknown_manifest";
    /** fetch_image_failed_unknown_repository. */
    String FETCH_IMAGE_FAILED_UNKNOWN_REPOSITORY = "fetch_image_failed_unknown_repository";
    /** fetch_image_failed_registry_not_found. */
    String FETCH_IMAGE_FAILED_REGISTRY_NOT_FOUND = "fetch_image_failed_registry_not_found";
    /** fetch_image_failed_missing_pull_secret. */
    String FETCH_IMAGE_FAILED_MISSING_PULL_SECRET = "fetch_image_failed_missing_pull_secret";
    /** fetch_image_failed_wrong_pull_credentials. */
    String FETCH_IMAGE_FAILED_WRONG_PULL_CREDENTIALS = "fetch_image_failed_wrong_pull_credentials";
    /** fetch_image_failed_missing_pull_credentials. */
    String FETCH_IMAGE_FAILED_MISSING_PULL_CREDENTIALS = "fetch_image_failed_missing_pull_credentials";
    /** container_failed_exit_code_0. */
    String CONTAINER_FAILED_EXIT_CODE_0 = "container_failed_exit_code_0";
    /** container_failed_exit_code_1. */
    String CONTAINER_FAILED_EXIT_CODE_1 = "container_failed_exit_code_1";
    /** container_failed_exit_code_139. */
    String CONTAINER_FAILED_EXIT_CODE_139 = "container_failed_exit_code_139";
    /** container_failed_exit_code_24. */
    String CONTAINER_FAILED_EXIT_CODE_24 = "container_failed_exit_code_24";
    /** image_pull_back_off. */
    String IMAGE_PULL_BACK_OFF = "image_pull_back_off";
    /** invalid_tar_header_image_pull_err. */
    String INVALID_TAR_HEADER_IMAGE_PULL_ERR = "invalid_tar_header_image_pull_err";
  }

  @SerializedName("completed_at")
  protected String completedAt;
  @SerializedName("container_status")
  protected String containerStatus;
  @SerializedName("exit_code")
  protected Long exitCode;
  protected String reason;
  @SerializedName("started_at")
  protected String startedAt;

  protected ContainerStatusDetails() { }

  /**
   * Gets the completedAt.
   *
   * The time the container terminated. Only populated in an observed failure state.
   *
   * @return the completedAt
   */
  public String getCompletedAt() {
    return completedAt;
  }

  /**
   * Gets the containerStatus.
   *
   * The status of the container.
   *
   * @return the containerStatus
   */
  public String getContainerStatus() {
    return containerStatus;
  }

  /**
   * Gets the exitCode.
   *
   * The exit code of the last termination of the container. Only populated in an observed failure state.
   *
   * @return the exitCode
   */
  public Long getExitCode() {
    return exitCode;
  }

  /**
   * Gets the reason.
   *
   * The reason the container is not yet running or has failed. Only populated in non-running states.
   *
   * @return the reason
   */
  public String getReason() {
    return reason;
  }

  /**
   * Gets the startedAt.
   *
   * The time the container started.
   *
   * @return the startedAt
   */
  public String getStartedAt() {
    return startedAt;
  }
}

