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
 * Current status condition of a build run.
 */
public class BuildRunStatus extends GenericModel {

  /**
   * Optional information to provide more context in case of a 'failed' or 'warning' status.
   */
  public interface Reason {
    /** succeeded. */
    String SUCCEEDED = "succeeded";
    /** running. */
    String RUNNING = "running";
    /** pending. */
    String PENDING = "pending";
    /** failed_to_execute_build_run. */
    String FAILED_TO_EXECUTE_BUILD_RUN = "failed_to_execute_build_run";
    /** exceeded_ephemeral_storage. */
    String EXCEEDED_EPHEMERAL_STORAGE = "exceeded_ephemeral_storage";
    /** missing_registry_access. */
    String MISSING_REGISTRY_ACCESS = "missing_registry_access";
    /** missing_code_repo_access. */
    String MISSING_CODE_REPO_ACCESS = "missing_code_repo_access";
    /** missing_secrets. */
    String MISSING_SECRETS = "missing_secrets";
    /** unknown_strategy. */
    String UNKNOWN_STRATEGY = "unknown_strategy";
    /** invalid_build_configuration. */
    String INVALID_BUILD_CONFIGURATION = "invalid_build_configuration";
    /** pod_evicted_because_of_storage_quota_exceeds. */
    String POD_EVICTED_BECAUSE_OF_STORAGE_QUOTA_EXCEEDS = "pod_evicted_because_of_storage_quota_exceeds";
    /** pod_evicted. */
    String POD_EVICTED = "pod_evicted";
    /** missing_task_run. */
    String MISSING_TASK_RUN = "missing_task_run";
    /** task_run_generation_failed. */
    String TASK_RUN_GENERATION_FAILED = "task_run_generation_failed";
    /** build_not_found. */
    String BUILD_NOT_FOUND = "build_not_found";
    /** timeout. */
    String TIMEOUT = "timeout";
    /** failed. */
    String FAILED = "failed";
  }

  @SerializedName("completion_time")
  protected String completionTime;
  @SerializedName("output_digest")
  protected String outputDigest;
  protected String reason;
  @SerializedName("start_time")
  protected String startTime;

  protected BuildRunStatus() { }

  /**
   * Gets the completionTime.
   *
   * Time the build run completed.
   *
   * @return the completionTime
   */
  public String getCompletionTime() {
    return completionTime;
  }

  /**
   * Gets the outputDigest.
   *
   * Describes the time the build run completed.
   *
   * @return the outputDigest
   */
  public String getOutputDigest() {
    return outputDigest;
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

  /**
   * Gets the startTime.
   *
   * Time the build run started.
   *
   * @return the startTime
   */
  public String getStartTime() {
    return startTime;
  }
}

