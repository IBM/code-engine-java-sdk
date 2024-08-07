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
 * The replaceConfigMap options.
 */
public class ReplaceConfigMapOptions extends GenericModel {

  protected String projectId;
  protected String name;
  protected String ifMatch;
  protected Map<String, String> data;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private String ifMatch;
    private Map<String, String> data;

    /**
     * Instantiates a new Builder from an existing ReplaceConfigMapOptions instance.
     *
     * @param replaceConfigMapOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceConfigMapOptions replaceConfigMapOptions) {
      this.projectId = replaceConfigMapOptions.projectId;
      this.name = replaceConfigMapOptions.name;
      this.ifMatch = replaceConfigMapOptions.ifMatch;
      this.data = replaceConfigMapOptions.data;
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
     */
    public Builder(String projectId, String name, String ifMatch) {
      this.projectId = projectId;
      this.name = name;
      this.ifMatch = ifMatch;
    }

    /**
     * Builds a ReplaceConfigMapOptions.
     *
     * @return the new ReplaceConfigMapOptions instance
     */
    public ReplaceConfigMapOptions build() {
      return new ReplaceConfigMapOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ReplaceConfigMapOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceConfigMapOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the ReplaceConfigMapOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the ReplaceConfigMapOptions builder
     */
    public Builder data(Map<String, String> data) {
      this.data = data;
      return this;
    }
  }

  protected ReplaceConfigMapOptions() { }

  protected ReplaceConfigMapOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    ifMatch = builder.ifMatch;
    data = builder.data;
  }

  /**
   * New builder.
   *
   * @return a ReplaceConfigMapOptions builder
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
   * The name of your configmap.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the ifMatch.
   *
   * Version of the config map settings to be updated. Specify the version that you retrieved as entity_tag (ETag
   * header) when reading the config map. This value helps identifying parallel usage of this API. Pass * to indicate to
   * update any version available. This might result in stale updates.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the data.
   *
   * The key-value pair for the config map. Values must be specified in `KEY=VALUE` format. Each `KEY` field must
   * consist of alphanumeric characters, `-`, `_` or `.` and must not be exceed a max length of 253 characters. Each
   * `VALUE` field can consists of any character and must not be exceed a max length of 1048576 characters.
   *
   * @return the data
   */
  public Map<String, String> data() {
    return data;
  }
}

