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
 * Details of the observed container status.
 */
public class ContainerStatusDetails extends GenericModel {

  /**
   * The status of the container.
   */
  public interface ContainerStatus {
    /** running. */
    String RUNNING = "running";
    /** pending. */
    String PENDING = "pending";
    /** terminated. */
    String TERMINATED = "terminated";
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

