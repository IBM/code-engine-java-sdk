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
 * The listBuildRuns options.
 */
public class ListBuildRunsOptions extends GenericModel {

  protected String projectId;
  protected String buildName;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String buildName;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListBuildRunsOptions instance.
     *
     * @param listBuildRunsOptions the instance to initialize the Builder with
     */
    private Builder(ListBuildRunsOptions listBuildRunsOptions) {
      this.projectId = listBuildRunsOptions.projectId;
      this.buildName = listBuildRunsOptions.buildName;
      this.limit = listBuildRunsOptions.limit;
      this.start = listBuildRunsOptions.start;
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
     * Builds a ListBuildRunsOptions.
     *
     * @return the new ListBuildRunsOptions instance
     */
    public ListBuildRunsOptions build() {
      return new ListBuildRunsOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ListBuildRunsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the buildName.
     *
     * @param buildName the buildName
     * @return the ListBuildRunsOptions builder
     */
    public Builder buildName(String buildName) {
      this.buildName = buildName;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListBuildRunsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListBuildRunsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListBuildRunsOptions() { }

  protected ListBuildRunsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    projectId = builder.projectId;
    buildName = builder.buildName;
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListBuildRunsOptions builder
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
   * Gets the buildName.
   *
   * Optional name of the build that should be filtered for.
   *
   * @return the buildName
   */
  public String buildName() {
    return buildName;
  }

  /**
   * Gets the limit.
   *
   * Optional maximum number of build runs per page.
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
   * results is returned. This value is obtained from the 'start' query parameter in the 'next_url' field of the
   * operation response.
   *
   * @return the start
   */
  public String start() {
    return start;
  }
}

