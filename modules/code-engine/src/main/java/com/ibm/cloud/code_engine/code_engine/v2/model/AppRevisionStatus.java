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
 * The detailed status of the application revision.
 */
public class AppRevisionStatus extends GenericModel {

  /**
   * Optional information to provide more context in case of a 'failed' or 'warning' status.
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

  @SerializedName("actual_instances")
  protected Long actualInstances;
  protected String reason;

  protected AppRevisionStatus() { }

  /**
   * Gets the actualInstances.
   *
   * The number of running instances of the revision.
   *
   * @return the actualInstances
   */
  public Long getActualInstances() {
    return actualInstances;
  }

  /**
   * Gets the reason.
   *
   * Optional information to provide more context in case of a 'failed' or 'warning' status.
   *
   * @return the reason
   */
  public String getReason() {
    return reason;
  }
}

