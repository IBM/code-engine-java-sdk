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
 * Response model for probes.
 */
public class Probe extends GenericModel {

  /**
   * Specifies whether to use HTTP or TCP for the probe checks. The default is TCP.
   */
  public interface Type {
    /** tcp. */
    String TCP = "tcp";
    /** http. */
    String HTTP = "http";
  }

  @SerializedName("failure_threshold")
  protected Long failureThreshold;
  @SerializedName("initial_delay")
  protected Long initialDelay;
  protected Long interval;
  protected String path;
  protected Long port;
  protected Long timeout;
  protected String type;

  protected Probe() { }

  /**
   * Gets the failureThreshold.
   *
   * The number of consecutive, unsuccessful checks for the probe to be considered failed.
   *
   * @return the failureThreshold
   */
  public Long getFailureThreshold() {
    return failureThreshold;
  }

  /**
   * Gets the initialDelay.
   *
   * The amount of time in seconds to wait before the first probe check is performed.
   *
   * @return the initialDelay
   */
  public Long getInitialDelay() {
    return initialDelay;
  }

  /**
   * Gets the interval.
   *
   * The amount of time in seconds between probe checks.
   *
   * @return the interval
   */
  public Long getInterval() {
    return interval;
  }

  /**
   * Gets the path.
   *
   * The path of the HTTP request to the resource. A path is only supported for a probe with a `type` of `http`.
   *
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * Gets the port.
   *
   * The port on which to probe the resource.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the timeout.
   *
   * The amount of time in seconds that the probe waits for a response from the application before it times out and
   * fails.
   *
   * @return the timeout
   */
  public Long getTimeout() {
    return timeout;
  }

  /**
   * Gets the type.
   *
   * Specifies whether to use HTTP or TCP for the probe checks. The default is TCP.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

