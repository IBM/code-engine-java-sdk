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
 * Request model for probes.
 */
public class ProbePrototype extends GenericModel {

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

  /**
   * Builder.
   */
  public static class Builder {
    private Long failureThreshold;
    private Long initialDelay;
    private Long interval;
    private String path;
    private Long port;
    private Long timeout;
    private String type;

    /**
     * Instantiates a new Builder from an existing ProbePrototype instance.
     *
     * @param probePrototype the instance to initialize the Builder with
     */
    private Builder(ProbePrototype probePrototype) {
      this.failureThreshold = probePrototype.failureThreshold;
      this.initialDelay = probePrototype.initialDelay;
      this.interval = probePrototype.interval;
      this.path = probePrototype.path;
      this.port = probePrototype.port;
      this.timeout = probePrototype.timeout;
      this.type = probePrototype.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ProbePrototype.
     *
     * @return the new ProbePrototype instance
     */
    public ProbePrototype build() {
      return new ProbePrototype(this);
    }

    /**
     * Set the failureThreshold.
     *
     * @param failureThreshold the failureThreshold
     * @return the ProbePrototype builder
     */
    public Builder failureThreshold(long failureThreshold) {
      this.failureThreshold = failureThreshold;
      return this;
    }

    /**
     * Set the initialDelay.
     *
     * @param initialDelay the initialDelay
     * @return the ProbePrototype builder
     */
    public Builder initialDelay(long initialDelay) {
      this.initialDelay = initialDelay;
      return this;
    }

    /**
     * Set the interval.
     *
     * @param interval the interval
     * @return the ProbePrototype builder
     */
    public Builder interval(long interval) {
      this.interval = interval;
      return this;
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the ProbePrototype builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the ProbePrototype builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the ProbePrototype builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ProbePrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected ProbePrototype() { }

  protected ProbePrototype(Builder builder) {
    failureThreshold = builder.failureThreshold;
    initialDelay = builder.initialDelay;
    interval = builder.interval;
    path = builder.path;
    port = builder.port;
    timeout = builder.timeout;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a ProbePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the failureThreshold.
   *
   * The number of consecutive, unsuccessful checks for the probe to be considered failed.
   *
   * @return the failureThreshold
   */
  public Long failureThreshold() {
    return failureThreshold;
  }

  /**
   * Gets the initialDelay.
   *
   * The amount of time in seconds to wait before the first probe check is performed.
   *
   * @return the initialDelay
   */
  public Long initialDelay() {
    return initialDelay;
  }

  /**
   * Gets the interval.
   *
   * The amount of time in seconds between probe checks.
   *
   * @return the interval
   */
  public Long interval() {
    return interval;
  }

  /**
   * Gets the path.
   *
   * The path of the HTTP request to the resource. A path is only supported for a probe with a `type` of `http`.
   *
   * @return the path
   */
  public String path() {
    return path;
  }

  /**
   * Gets the port.
   *
   * The port on which to probe the resource.
   *
   * @return the port
   */
  public Long port() {
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
  public Long timeout() {
    return timeout;
  }

  /**
   * Gets the type.
   *
   * Specifies whether to use HTTP or TCP for the probe checks. The default is TCP.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

