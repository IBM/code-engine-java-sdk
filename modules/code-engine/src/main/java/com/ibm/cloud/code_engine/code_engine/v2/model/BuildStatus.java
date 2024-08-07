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
 * The detailed status of the build.
 */
public class BuildStatus extends GenericModel {

  /**
   * Optional information to provide more context in case of a 'failed' or 'warning' status.
   */
  public interface Reason {
    /** registered. */
    String REGISTERED = "registered";
    /** strategy_not_found. */
    String STRATEGY_NOT_FOUND = "strategy_not_found";
    /** cluster_build_strategy_not_found. */
    String CLUSTER_BUILD_STRATEGY_NOT_FOUND = "cluster_build_strategy_not_found";
    /** set_owner_reference_failed. */
    String SET_OWNER_REFERENCE_FAILED = "set_owner_reference_failed";
    /** spec_source_secret_not_found. */
    String SPEC_SOURCE_SECRET_NOT_FOUND = "spec_source_secret_not_found";
    /** spec_output_secret_ref_not_found. */
    String SPEC_OUTPUT_SECRET_REF_NOT_FOUND = "spec_output_secret_ref_not_found";
    /** spec_runtime_secret_ref_not_found. */
    String SPEC_RUNTIME_SECRET_REF_NOT_FOUND = "spec_runtime_secret_ref_not_found";
    /** multiple_secret_ref_not_found. */
    String MULTIPLE_SECRET_REF_NOT_FOUND = "multiple_secret_ref_not_found";
    /** runtime_paths_can_not_be_empty. */
    String RUNTIME_PATHS_CAN_NOT_BE_EMPTY = "runtime_paths_can_not_be_empty";
    /** remote_repository_unreachable. */
    String REMOTE_REPOSITORY_UNREACHABLE = "remote_repository_unreachable";
    /** failed. */
    String FAILED = "failed";
  }

  protected String reason;

  protected BuildStatus() { }

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

