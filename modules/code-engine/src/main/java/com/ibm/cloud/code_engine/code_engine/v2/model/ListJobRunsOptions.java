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
 * The listJobRuns options.
 */
public class ListJobRunsOptions extends GenericModel {

  protected String projectId;
  protected String jobName;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String jobName;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListJobRunsOptions instance.
     *
     * @param listJobRunsOptions the instance to initialize the Builder with
     */
    private Builder(ListJobRunsOptions listJobRunsOptions) {
      this.projectId = listJobRunsOptions.projectId;
      this.jobName = listJobRunsOptions.jobName;
      this.limit = listJobRunsOptions.limit;
      this.start = listJobRunsOptions.start;
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
     * Builds a ListJobRunsOptions.
     *
     * @return the new ListJobRunsOptions instance
     */
    public ListJobRunsOptions build() {
      return new ListJobRunsOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ListJobRunsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the jobName.
     *
     * @param jobName the jobName
     * @return the ListJobRunsOptions builder
     */
    public Builder jobName(String jobName) {
      this.jobName = jobName;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListJobRunsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListJobRunsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListJobRunsOptions() { }

  protected ListJobRunsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    projectId = builder.projectId;
    jobName = builder.jobName;
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListJobRunsOptions builder
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
   * Gets the jobName.
   *
   * Optional name of the job that you want to use to filter.
   *
   * @return the jobName
   */
  public String jobName() {
    return jobName;
  }

  /**
   * Gets the limit.
   *
   * Optional maximum number of job runs per page.
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

