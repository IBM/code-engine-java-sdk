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
 * The updateFunction options.
 */
public class UpdateFunctionOptions extends GenericModel {

  protected String projectId;
  protected String name;
  protected String ifMatch;
  protected Map<String, Object> function;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private String ifMatch;
    private Map<String, Object> function;

    /**
     * Instantiates a new Builder from an existing UpdateFunctionOptions instance.
     *
     * @param updateFunctionOptions the instance to initialize the Builder with
     */
    private Builder(UpdateFunctionOptions updateFunctionOptions) {
      this.projectId = updateFunctionOptions.projectId;
      this.name = updateFunctionOptions.name;
      this.ifMatch = updateFunctionOptions.ifMatch;
      this.function = updateFunctionOptions.function;
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
     * @param function the function
     */
    public Builder(String projectId, String name, String ifMatch, Map<String, Object> function) {
      this.projectId = projectId;
      this.name = name;
      this.ifMatch = ifMatch;
      this.function = function;
    }

    /**
     * Builds a UpdateFunctionOptions.
     *
     * @return the new UpdateFunctionOptions instance
     */
    public UpdateFunctionOptions build() {
      return new UpdateFunctionOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the UpdateFunctionOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateFunctionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateFunctionOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the function.
     *
     * @param function the function
     * @return the UpdateFunctionOptions builder
     */
    public Builder function(Map<String, Object> function) {
      this.function = function;
      return this;
    }
  }

  protected UpdateFunctionOptions() { }

  protected UpdateFunctionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.function,
      "function cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    ifMatch = builder.ifMatch;
    function = builder.function;
  }

  /**
   * New builder.
   *
   * @return a UpdateFunctionOptions builder
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
   * The name of your function.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the ifMatch.
   *
   * Version of the function settings to be updated. Specify the version that you retrieved as entity_tag (ETag header)
   * when reading the function. This value helps identifying parallel usage of this API. Pass * to indicate to update
   * any version available. This might result in stale updates.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the function.
   *
   * Function patch.
   *
   * @return the function
   */
  public Map<String, Object> function() {
    return function;
  }
}

