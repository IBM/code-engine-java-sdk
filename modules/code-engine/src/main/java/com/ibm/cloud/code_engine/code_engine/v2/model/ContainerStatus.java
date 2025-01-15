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
 * The status of a container.
 */
public class ContainerStatus extends GenericModel {

  @SerializedName("current_state")
  protected ContainerStatusDetails currentState;
  @SerializedName("last_observed_state")
  protected ContainerStatusDetails lastObservedState;

  protected ContainerStatus() { }

  /**
   * Gets the currentState.
   *
   * Details of the observed container status.
   *
   * @return the currentState
   */
  public ContainerStatusDetails getCurrentState() {
    return currentState;
  }

  /**
   * Gets the lastObservedState.
   *
   * Details of the observed container status.
   *
   * @return the lastObservedState
   */
  public ContainerStatusDetails getLastObservedState() {
    return lastObservedState;
  }
}

