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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listBuilds options.
 */
public class ListBuildsOptions extends GenericModel {

  protected String projectId;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListBuildsOptions instance.
     *
     * @param listBuildsOptions the instance to initialize the Builder with
     */
    private Builder(ListBuildsOptions listBuildsOptions) {
      this.projectId = listBuildsOptions.projectId;
      this.limit = listBuildsOptions.limit;
      this.start = listBuildsOptions.start;
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
     */
    public Builder(String projectId) {
      this.projectId = projectId;
    }

    /**
     * Builds a ListBuildsOptions.
     *
     * @return the new ListBuildsOptions instance
     */
    public ListBuildsOptions build() {
      return new ListBuildsOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ListBuildsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListBuildsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListBuildsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListBuildsOptions() { }

  protected ListBuildsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    projectId = builder.projectId;
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListBuildsOptions builder
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
   * Gets the limit.
   *
   * Optional maximum number of builds per page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the start.
   *
   * The token to continue traversing paginated list of builds.
   *
   * @return the start
   */
  public String start() {
    return start;
  }
}

