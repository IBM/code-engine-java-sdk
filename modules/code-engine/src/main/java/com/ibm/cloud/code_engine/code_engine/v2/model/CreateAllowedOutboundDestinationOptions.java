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
 * The createAllowedOutboundDestination options.
 */
public class CreateAllowedOutboundDestinationOptions extends GenericModel {

  protected String projectId;
  protected AllowedOutboundDestinationPrototype allowedOutboundDestination;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private AllowedOutboundDestinationPrototype allowedOutboundDestination;

    /**
     * Instantiates a new Builder from an existing CreateAllowedOutboundDestinationOptions instance.
     *
     * @param createAllowedOutboundDestinationOptions the instance to initialize the Builder with
     */
    private Builder(CreateAllowedOutboundDestinationOptions createAllowedOutboundDestinationOptions) {
      this.projectId = createAllowedOutboundDestinationOptions.projectId;
      this.allowedOutboundDestination = createAllowedOutboundDestinationOptions.allowedOutboundDestination;
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
     * @param allowedOutboundDestination the allowedOutboundDestination
     */
    public Builder(String projectId, AllowedOutboundDestinationPrototype allowedOutboundDestination) {
      this.projectId = projectId;
      this.allowedOutboundDestination = allowedOutboundDestination;
    }

    /**
     * Builds a CreateAllowedOutboundDestinationOptions.
     *
     * @return the new CreateAllowedOutboundDestinationOptions instance
     */
    public CreateAllowedOutboundDestinationOptions build() {
      return new CreateAllowedOutboundDestinationOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateAllowedOutboundDestinationOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the allowedOutboundDestination.
     *
     * @param allowedOutboundDestination the allowedOutboundDestination
     * @return the CreateAllowedOutboundDestinationOptions builder
     */
    public Builder allowedOutboundDestination(AllowedOutboundDestinationPrototype allowedOutboundDestination) {
      this.allowedOutboundDestination = allowedOutboundDestination;
      return this;
    }
  }

  protected CreateAllowedOutboundDestinationOptions() { }

  protected CreateAllowedOutboundDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.allowedOutboundDestination,
      "allowedOutboundDestination cannot be null");
    projectId = builder.projectId;
    allowedOutboundDestination = builder.allowedOutboundDestination;
  }

  /**
   * New builder.
   *
   * @return a CreateAllowedOutboundDestinationOptions builder
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
   * Gets the allowedOutboundDestination.
   *
   * AllowedOutboundDestination prototype.
   *
   * @return the allowedOutboundDestination
   */
  public AllowedOutboundDestinationPrototype allowedOutboundDestination() {
    return allowedOutboundDestination;
  }
}

