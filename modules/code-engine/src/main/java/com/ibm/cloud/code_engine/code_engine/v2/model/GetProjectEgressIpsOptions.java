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
 * The getProjectEgressIps options.
 */
public class GetProjectEgressIpsOptions extends GenericModel {

  protected String projectId;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;

    /**
     * Instantiates a new Builder from an existing GetProjectEgressIpsOptions instance.
     *
     * @param getProjectEgressIpsOptions the instance to initialize the Builder with
     */
    private Builder(GetProjectEgressIpsOptions getProjectEgressIpsOptions) {
      this.projectId = getProjectEgressIpsOptions.projectId;
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
     * Builds a GetProjectEgressIpsOptions.
     *
     * @return the new GetProjectEgressIpsOptions instance
     */
    public GetProjectEgressIpsOptions build() {
      return new GetProjectEgressIpsOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the GetProjectEgressIpsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }
  }

  protected GetProjectEgressIpsOptions() { }

  protected GetProjectEgressIpsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    projectId = builder.projectId;
  }

  /**
   * New builder.
   *
   * @return a GetProjectEgressIpsOptions builder
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
}

