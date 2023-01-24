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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The detailed status of the job run.
 */
public class JobRunStatus extends GenericModel {

  @SerializedName("completion_time")
  protected String completionTime;
  protected Long failed;
  protected Long pending;
  protected Long requested;
  protected Long running;
  @SerializedName("start_time")
  protected String startTime;
  protected Long succeeded;
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

