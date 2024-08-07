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
 * The createConfigMap options.
 */
public class CreateConfigMapOptions extends GenericModel {

  protected String projectId;
  protected String name;
  protected Map<String, String> data;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private Map<String, String> data;

    /**
     * Instantiates a new Builder from an existing CreateConfigMapOptions instance.
     *
     * @param createConfigMapOptions the instance to initialize the Builder with
     */
    private Builder(CreateConfigMapOptions createConfigMapOptions) {
      this.projectId = createConfigMapOptions.projectId;
      this.name = createConfigMapOptions.name;
      this.data = createConfigMapOptions.data;
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
     * Builds a CreateConfigMapOptions.
     *
     * @return the new CreateConfigMapOptions instance
     */
    public CreateConfigMapOptions build() {
      return new CreateConfigMapOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateConfigMapOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateConfigMapOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the CreateConfigMapOptions builder
     */
    public Builder data(Map<String, String> data) {
      this.data = data;
      return this;
    }
  }

  protected CreateConfigMapOptions() { }

  protected CreateConfigMapOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    data = builder.data;
  }

  /**
   * New builder.
   *
   * @return a CreateConfigMapOptions builder
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
   * The name of the configmap. Use a name that is unique within the project.
   *
   * @return the name
   */
  public String name() {
    return name;
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

