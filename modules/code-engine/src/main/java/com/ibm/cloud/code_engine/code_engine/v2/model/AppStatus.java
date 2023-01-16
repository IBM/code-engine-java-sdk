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
 * The detailed status of the application.
 */
public class AppStatus extends GenericModel {

  /**
   * Optional information to provide more context in case of a 'failed' or 'warning' status.
   */
  public interface Reason {
    /** ready. */
    String READY = "ready";
    /** deploying. */
    String DEPLOYING = "deploying";
    /** waiting_for_resources. */
    String WAITING_FOR_RESOURCES = "waiting_for_resources";
    /** no_revision_ready. */
    String NO_REVISION_READY = "no_revision_ready";
    /** ready_but_latest_revision_failed. */
    String READY_BUT_LATEST_REVISION_FAILED = "ready_but_latest_revision_failed";
  }

  @SerializedName("latest_created_revision")
  protected String latestCreatedRevision;
  @SerializedName("latest_ready_revision")
  protected String latestReadyRevision;
  protected String reason;

  protected AppStatus() { }

  /**
   * Gets the latestCreatedRevision.
   *
   * Latest app revision that has been created.
   *
   * @return the latestCreatedRevision
   */
  public String getLatestCreatedRevision() {
    return latestCreatedRevision;
  }

  /**
   * Gets the latestReadyRevision.
   *
   * Latest app revision that reached a ready state.
   *
   * @return the latestReadyRevision
   */
  public String getLatestReadyRevision() {
    return latestReadyRevision;
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

