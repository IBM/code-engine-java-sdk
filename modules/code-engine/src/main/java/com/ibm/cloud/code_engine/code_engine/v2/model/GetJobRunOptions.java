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
 * The getJobRun options.
 */
public class GetJobRunOptions extends GenericModel {

  protected String projectId;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;

    /**
     * Instantiates a new Builder from an existing GetJobRunOptions instance.
     *
     * @param getJobRunOptions the instance to initialize the Builder with
     */
    private Builder(GetJobRunOptions getJobRunOptions) {
      this.projectId = getJobRunOptions.projectId;
      this.name = getJobRunOptions.name;
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
     * @param name the name
     */
    public Builder(String projectId, String name) {
      this.projectId = projectId;
      this.name = name;
    }

    /**
     * Builds a GetJobRunOptions.
     *
     * @return the new GetJobRunOptions instance
     */
    public GetJobRunOptions build() {
      return new GetJobRunOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the GetJobRunOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GetJobRunOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected GetJobRunOptions() { }

  protected GetJobRunOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    projectId = builder.projectId;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a GetJobRunOptions builder
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
   * Gets the name.
   *
   * The name of your job run.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

