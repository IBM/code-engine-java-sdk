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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteApp options.
 */
public class DeleteAppOptions extends GenericModel {

  protected String projectId;
  protected String name;
  protected Boolean keepServiceAccess;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private Boolean keepServiceAccess;

    /**
     * Instantiates a new Builder from an existing DeleteAppOptions instance.
     *
     * @param deleteAppOptions the instance to initialize the Builder with
     */
    private Builder(DeleteAppOptions deleteAppOptions) {
      this.projectId = deleteAppOptions.projectId;
      this.name = deleteAppOptions.name;
      this.keepServiceAccess = deleteAppOptions.keepServiceAccess;
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
     * Builds a DeleteAppOptions.
     *
     * @return the new DeleteAppOptions instance
     */
    public DeleteAppOptions build() {
      return new DeleteAppOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the DeleteAppOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DeleteAppOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the keepServiceAccess.
     *
     * @param keepServiceAccess the keepServiceAccess
     * @return the DeleteAppOptions builder
     */
    public Builder keepServiceAccess(Boolean keepServiceAccess) {
      this.keepServiceAccess = keepServiceAccess;
      return this;
    }
  }

  protected DeleteAppOptions() { }

  protected DeleteAppOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    projectId = builder.projectId;
    name = builder.name;
    keepServiceAccess = builder.keepServiceAccess;
  }

  /**
   * New builder.
   *
   * @return a DeleteAppOptions builder
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
   * The name of your application.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the keepServiceAccess.
   *
   * Determines if connected service access secrets remain intact after app deletion.
   *
   * @return the keepServiceAccess
   */
  public Boolean keepServiceAccess() {
    return keepServiceAccess;
  }
}

