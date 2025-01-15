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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateAllowedOutboundDestination options.
 */
public class UpdateAllowedOutboundDestinationOptions extends GenericModel {

  protected String projectId;
  protected String name;
  protected String ifMatch;
  protected Map<String, Object> allowedOutboundDestination;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private String ifMatch;
    private Map<String, Object> allowedOutboundDestination;

    /**
     * Instantiates a new Builder from an existing UpdateAllowedOutboundDestinationOptions instance.
     *
     * @param updateAllowedOutboundDestinationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateAllowedOutboundDestinationOptions updateAllowedOutboundDestinationOptions) {
      this.projectId = updateAllowedOutboundDestinationOptions.projectId;
      this.name = updateAllowedOutboundDestinationOptions.name;
      this.ifMatch = updateAllowedOutboundDestinationOptions.ifMatch;
      this.allowedOutboundDestination = updateAllowedOutboundDestinationOptions.allowedOutboundDestination;
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
     * @param allowedOutboundDestination the allowedOutboundDestination
     */
    public Builder(String projectId, String name, String ifMatch, Map<String, Object> allowedOutboundDestination) {
      this.projectId = projectId;
      this.name = name;
      this.ifMatch = ifMatch;
      this.allowedOutboundDestination = allowedOutboundDestination;
    }

    /**
     * Builds a UpdateAllowedOutboundDestinationOptions.
     *
     * @return the new UpdateAllowedOutboundDestinationOptions instance
     */
    public UpdateAllowedOutboundDestinationOptions build() {
      return new UpdateAllowedOutboundDestinationOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the UpdateAllowedOutboundDestinationOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateAllowedOutboundDestinationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateAllowedOutboundDestinationOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the allowedOutboundDestination.
     *
     * @param allowedOutboundDestination the allowedOutboundDestination
     * @return the UpdateAllowedOutboundDestinationOptions builder
     */
    public Builder allowedOutboundDestination(Map<String, Object> allowedOutboundDestination) {
      this.allowedOutboundDestination = allowedOutboundDestination;
      return this;
    }
  }

  protected UpdateAllowedOutboundDestinationOptions() { }

  protected UpdateAllowedOutboundDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.allowedOutboundDestination,
      "allowedOutboundDestination cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    ifMatch = builder.ifMatch;
    allowedOutboundDestination = builder.allowedOutboundDestination;
  }

  /**
   * New builder.
   *
   * @return a UpdateAllowedOutboundDestinationOptions builder
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
   * The name of your allowed outbound destination.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the ifMatch.
   *
   * Version of the allowed outbound destination to be updated. Specify the version that you retrieved as entity_tag
   * (ETag header) when reading the allowed outbound destination. This value helps identifying parallel usage of this
   * API. Pass * to indicate to update any version available. This might result in stale updates.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the allowedOutboundDestination.
   *
   * AllowedOutboundDestination patch.
   *
   * @return the allowedOutboundDestination
   */
  public Map<String, Object> allowedOutboundDestination() {
    return allowedOutboundDestination;
  }
}

