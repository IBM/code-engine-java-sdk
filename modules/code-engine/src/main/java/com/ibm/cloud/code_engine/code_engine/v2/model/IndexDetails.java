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
 * IndexDetails.
 */
public class IndexDetails extends GenericModel {

  /**
   * Current status of the job run index.
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
    /** unknown. */
    String UNKNOWN = "unknown";
  }

  @SerializedName("finished_at")
  protected String finishedAt;
  @SerializedName("last_failure_reason")
  protected String lastFailureReason;
  protected Long retries;
  @SerializedName("started_at")
  protected String startedAt;
  protected String status;

  protected IndexDetails() { }

  /**
   * Gets the finishedAt.
   *
   * The timestamp when the job run index finished processing.
   *
   * @return the finishedAt
   */
  public String getFinishedAt() {
    return finishedAt;
  }

  /**
   * Gets the lastFailureReason.
   *
   * Reason why latest retry of the job run index failed. Possible values include but are not limited to `OOMKilled`,
   * `ContainerExitedCode1` or `ExceededEphemeralStorage`.
   *
   * @return the lastFailureReason
   */
  public String getLastFailureReason() {
    return lastFailureReason;
  }

  /**
   * Gets the retries.
   *
   * Number of retries of this job run index.
   *
   * @return the retries
   */
  public Long getRetries() {
    return retries;
  }

  /**
   * Gets the startedAt.
   *
   * The timestamp when the job run index started processing.
   *
   * @return the startedAt
   */
  public String getStartedAt() {
    return startedAt;
  }

  /**
   * Gets the status.
   *
   * Current status of the job run index.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

