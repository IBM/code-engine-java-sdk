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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The detailed status of the job run.
 */
public class JobRunStatus extends GenericModel {

  @SerializedName("completion_time")
  protected String completionTime;
  protected Long failed;
  @SerializedName("failed_indices")
  protected String failedIndices;
  @SerializedName("indices_details")
  protected Map<String, IndexDetails> indicesDetails;
  protected Long pending;
  @SerializedName("pending_indices")
  protected String pendingIndices;
  protected Long requested;
  protected Long running;
  @SerializedName("running_indices")
  protected String runningIndices;
  @SerializedName("start_time")
  protected String startTime;
  protected Long succeeded;
  @SerializedName("succeeded_indices")
  protected String succeededIndices;
  protected Long unknown;

  protected JobRunStatus() { }

  /**
   * Gets the completionTime.
   *
   * Time the job run completed.
   *
   * @return the completionTime
   */
  public String getCompletionTime() {
    return completionTime;
  }

  /**
   * Gets the failed.
   *
   * Number of failed job run instances.
   *
   * @return the failed
   */
  public Long getFailed() {
    return failed;
  }

  /**
   * Gets the failedIndices.
   *
   * List of job run indices that failed.
   *
   * @return the failedIndices
   */
  public String getFailedIndices() {
    return failedIndices;
  }

  /**
   * Gets the indicesDetails.
   *
   * Detailed process information per index.
   *
   * @return the indicesDetails
   */
  public Map<String, IndexDetails> getIndicesDetails() {
    return indicesDetails;
  }

  /**
   * Gets the pending.
   *
   * Number of pending job run instances.
   *
   * @return the pending
   */
  public Long getPending() {
    return pending;
  }

  /**
   * Gets the pendingIndices.
   *
   * List of job run indices that are pending.
   *
   * @return the pendingIndices
   */
  public String getPendingIndices() {
    return pendingIndices;
  }

  /**
   * Gets the requested.
   *
   * Number of requested job run instances.
   *
   * @return the requested
   */
  public Long getRequested() {
    return requested;
  }

  /**
   * Gets the running.
   *
   * Number of running job run instances.
   *
   * @return the running
   */
  public Long getRunning() {
    return running;
  }

  /**
   * Gets the runningIndices.
   *
   * List of job run indices that are running.
   *
   * @return the runningIndices
   */
  public String getRunningIndices() {
    return runningIndices;
  }

  /**
   * Gets the startTime.
   *
   * Time the job run started.
   *
   * @return the startTime
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Gets the succeeded.
   *
   * Number of succeeded job run instances.
   *
   * @return the succeeded
   */
  public Long getSucceeded() {
    return succeeded;
  }

  /**
   * Gets the succeededIndices.
   *
   * List of job run indices that succeeded.
   *
   * @return the succeededIndices
   */
  public String getSucceededIndices() {
    return succeededIndices;
  }

  /**
   * Gets the unknown.
   *
   * Number of job run instances with unknown state.
   *
   * @return the unknown
   */
  public Long getUnknown() {
    return unknown;
  }
}

