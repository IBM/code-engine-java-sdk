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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateJob options.
 */
public class UpdateJobOptions extends GenericModel {

  protected String projectId;
  protected String name;
  protected String ifMatch;
  protected Map<String, Object> job;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private String ifMatch;
    private Map<String, Object> job;

    /**
     * Instantiates a new Builder from an existing UpdateJobOptions instance.
     *
     * @param updateJobOptions the instance to initialize the Builder with
     */
    private Builder(UpdateJobOptions updateJobOptions) {
      this.projectId = updateJobOptions.projectId;
      this.name = updateJobOptions.name;
      this.ifMatch = updateJobOptions.ifMatch;
      this.job = updateJobOptions.job;
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
     * @param ifMatch the ifMatch
     * @param job the job
     */
    public Builder(String projectId, String name, String ifMatch, Map<String, Object> job) {
      this.projectId = projectId;
      this.name = name;
      this.ifMatch = ifMatch;
      this.job = job;
    }

    /**
     * Builds a UpdateJobOptions.
     *
     * @return the new UpdateJobOptions instance
     */
    public UpdateJobOptions build() {
      return new UpdateJobOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the UpdateJobOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateJobOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateJobOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the job.
     *
     * @param job the job
     * @return the UpdateJobOptions builder
     */
    public Builder job(Map<String, Object> job) {
      this.job = job;
      return this;
    }
  }

  protected UpdateJobOptions() { }

  protected UpdateJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.job,
      "job cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    ifMatch = builder.ifMatch;
    job = builder.job;
  }

  /**
   * New builder.
   *
   * @return a UpdateJobOptions builder
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
   * The name of your job.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the ifMatch.
   *
   * Version of the job settings to be updated. Specify the version that you retrieved as entity_tag (ETag header) when
   * reading the job. This value helps identifying parallel usage of this API. Pass * to indicate to update any version
   * available. This might result in stale updates.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the job.
   *
   * Job patch prototype.
   *
   * @return the job
   */
  public Map<String, Object> job() {
    return job;
  }
}

