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
 * The status of the pod and it's containers.
 */
public class AppInstanceStatusDetails extends GenericModel {

  protected Long restarts;
  @SerializedName("system_container")
  protected ContainerStatus systemContainer;
  @SerializedName("user_container")
  protected ContainerStatus userContainer;

  protected AppInstanceStatusDetails() { }

  /**
   * Gets the restarts.
   *
   * The number of restarts of the app instance.
   *
   * @return the restarts
   */
  public Long getRestarts() {
    return restarts;
  }

  /**
   * Gets the systemContainer.
   *
   * The status of a container.
   *
   * @return the systemContainer
   */
  public ContainerStatus getSystemContainer() {
    return systemContainer;
  }

  /**
   * Gets the userContainer.
   *
   * The status of a container.
   *
   * @return the userContainer
   */
  public ContainerStatus getUserContainer() {
    return userContainer;
  }
}

