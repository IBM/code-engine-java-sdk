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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The detailed status of the function.
 */
public class FunctionStatus extends GenericModel {

  /**
   * Provides additional information about the status of the function.
   */
  public interface Reason {
    /** offline. */
    String OFFLINE = "offline";
    /** deploying_configuring_routes. */
    String DEPLOYING_CONFIGURING_ROUTES = "deploying_configuring_routes";
    /** ready_update_in_progress. */
    String READY_UPDATE_IN_PROGRESS = "ready_update_in_progress";
    /** deploying. */
    String DEPLOYING = "deploying";
    /** ready_last_update_failed. */
    String READY_LAST_UPDATE_FAILED = "ready_last_update_failed";
    /** ready. */
    String READY = "ready";
    /** unknown_reason. */
    String UNKNOWN_REASON = "unknown_reason";
    /** no_code_bundle. */
    String NO_CODE_BUNDLE = "no_code_bundle";
  }

  protected String reason;

  protected FunctionStatus() { }

  /**
   * Gets the reason.
   *
   * Provides additional information about the status of the function.
   *
   * @return the reason
   */
  public String getReason() {
    return reason;
  }
}

