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
 * The listAppInstances options.
 */
public class ListAppInstancesOptions extends GenericModel {

  protected String projectId;
  protected String appName;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String appName;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListAppInstancesOptions instance.
     *
     * @param listAppInstancesOptions the instance to initialize the Builder with
     */
    private Builder(ListAppInstancesOptions listAppInstancesOptions) {
      this.projectId = listAppInstancesOptions.projectId;
      this.appName = listAppInstancesOptions.appName;
      this.limit = listAppInstancesOptions.limit;
      this.start = listAppInstancesOptions.start;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param projectId the projectId
     * @param appName the appName
     */
    public Builder(String projectId, String appName) {
      this.projectId = projectId;
      this.appName = appName;
    }

    /**
     * Builds a ListAppInstancesOptions.
     *
     * @return the new ListAppInstancesOptions instance
     */
    public ListAppInstancesOptions build() {
      return new ListAppInstancesOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ListAppInstancesOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the appName.
     *
     * @param appName the appName
     * @return the ListAppInstancesOptions builder
     */
    public Builder appName(String appName) {
      this.appName = appName;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListAppInstancesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListAppInstancesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListAppInstancesOptions() { }

  protected ListAppInstancesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.appName,
      "appName cannot be empty");
    projectId = builder.projectId;
    appName = builder.appName;
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListAppInstancesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the appName.
   *
   * The name of your application.
   *
   * @return the appName
   */
  public String appName() {
    return appName;
  }

  /**
   * Gets the limit.
   *
   * Optional maximum number of apps per page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the start.
   *
   * An optional token that indicates the beginning of the page of results to be returned. If omitted, the first page of
   * results is returned. This value is obtained from the 'start' query parameter in the `next` object of the operation
   * response.
   *
   * @return the start
   */
  public String start() {
    return start;
  }
}

