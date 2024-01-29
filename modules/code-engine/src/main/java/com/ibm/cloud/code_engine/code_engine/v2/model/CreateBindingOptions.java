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
 * The createBinding options.
 */
public class CreateBindingOptions extends GenericModel {

  protected String projectId;
  protected ComponentRef component;
  protected String prefix;
  protected String secretName;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private ComponentRef component;
    private String prefix;
    private String secretName;

    /**
     * Instantiates a new Builder from an existing CreateBindingOptions instance.
     *
     * @param createBindingOptions the instance to initialize the Builder with
     */
    private Builder(CreateBindingOptions createBindingOptions) {
      this.projectId = createBindingOptions.projectId;
      this.component = createBindingOptions.component;
      this.prefix = createBindingOptions.prefix;
      this.secretName = createBindingOptions.secretName;
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
     * @param component the component
     * @param prefix the prefix
     * @param secretName the secretName
     */
    public Builder(String projectId, ComponentRef component, String prefix, String secretName) {
      this.projectId = projectId;
      this.component = component;
      this.prefix = prefix;
      this.secretName = secretName;
    }

    /**
     * Builds a CreateBindingOptions.
     *
     * @return the new CreateBindingOptions instance
     */
    public CreateBindingOptions build() {
      return new CreateBindingOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateBindingOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the component.
     *
     * @param component the component
     * @return the CreateBindingOptions builder
     */
    public Builder component(ComponentRef component) {
      this.component = component;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the CreateBindingOptions builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    /**
     * Set the secretName.
     *
     * @param secretName the secretName
     * @return the CreateBindingOptions builder
     */
    public Builder secretName(String secretName) {
      this.secretName = secretName;
      return this;
    }
  }

  protected CreateBindingOptions() { }

  protected CreateBindingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.component,
      "component cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.prefix,
      "prefix cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretName,
      "secretName cannot be null");
    projectId = builder.projectId;
    component = builder.component;
    prefix = builder.prefix;
    secretName = builder.secretName;
  }

  /**
   * New builder.
   *
   * @return a CreateBindingOptions builder
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
   * Gets the component.
   *
   * A reference to another component.
   *
   * @return the component
   */
  public ComponentRef component() {
    return component;
  }

  /**
   * Gets the prefix.
   *
   * Optional value that is set as prefix in the component that is bound. Will be generated if not provided.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
  }

  /**
   * Gets the secretName.
   *
   * The service access secret that is binding to a component.
   *
   * @return the secretName
   */
  public String secretName() {
    return secretName;
  }
}

