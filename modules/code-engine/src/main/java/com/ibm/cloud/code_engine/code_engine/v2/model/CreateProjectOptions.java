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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createProject options.
 */
public class CreateProjectOptions extends GenericModel {

  protected String name;
  protected String resourceGroupId;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String resourceGroupId;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing CreateProjectOptions instance.
     *
     * @param createProjectOptions the instance to initialize the Builder with
     */
    private Builder(CreateProjectOptions createProjectOptions) {
      this.name = createProjectOptions.name;
      this.resourceGroupId = createProjectOptions.resourceGroupId;
      this.tags = createProjectOptions.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a CreateProjectOptions.
     *
     * @return the new CreateProjectOptions instance
     */
    public CreateProjectOptions build() {
      return new CreateProjectOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateProjectOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateProjectOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the CreateProjectOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateProjectOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected CreateProjectOptions() { }

  protected CreateProjectOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
    resourceGroupId = builder.resourceGroupId;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a CreateProjectOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name of the project.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Optional ID of the resource group for your project deployment. If this field is not defined, the default resource
   * group of the account will be used.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the tags.
   *
   * Optional list of labels to assign to your project. Tags are not part of the project resource that is returned by
   * the server, but can be obtained and managed through the Global Tagging API in IBM Cloud. Find more information on
   * [Global Tagging API docs](https://cloud.ibm.com/apidocs/tagging).
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }
}

