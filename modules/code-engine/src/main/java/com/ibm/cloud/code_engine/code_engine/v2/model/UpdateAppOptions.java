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
 * The updateApp options.
 */
public class UpdateAppOptions extends GenericModel {

  protected String projectId;
  protected String name;
  protected String ifMatch;
  protected Map<String, Object> app;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private String ifMatch;
    private Map<String, Object> app;

    /**
     * Instantiates a new Builder from an existing UpdateAppOptions instance.
     *
     * @param updateAppOptions the instance to initialize the Builder with
     */
    private Builder(UpdateAppOptions updateAppOptions) {
      this.projectId = updateAppOptions.projectId;
      this.name = updateAppOptions.name;
      this.ifMatch = updateAppOptions.ifMatch;
      this.app = updateAppOptions.app;
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
     * @param app the app
     */
    public Builder(String projectId, String name, String ifMatch, Map<String, Object> app) {
      this.projectId = projectId;
      this.name = name;
      this.ifMatch = ifMatch;
      this.app = app;
    }

    /**
     * Builds a UpdateAppOptions.
     *
     * @return the new UpdateAppOptions instance
     */
    public UpdateAppOptions build() {
      return new UpdateAppOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the UpdateAppOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateAppOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateAppOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the app.
     *
     * @param app the app
     * @return the UpdateAppOptions builder
     */
    public Builder app(Map<String, Object> app) {
      this.app = app;
      return this;
    }
  }

  protected UpdateAppOptions() { }

  protected UpdateAppOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.app,
      "app cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    ifMatch = builder.ifMatch;
    app = builder.app;
  }

  /**
   * New builder.
   *
   * @return a UpdateAppOptions builder
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
   * Gets the ifMatch.
   *
   * Version of the app settings to be updated. Specify the version that you retrieved as entity_tag (ETag header) when
   * reading the app. This value helps identifying parallel usage of this API. Pass * to indicate to update any version
   * available. This might result in stale updates.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the app.
   *
   * App patch.
   *
   * @return the app
   */
  public Map<String, Object> app() {
    return app;
  }
}

