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
 * The createDomainMapping options.
 */
public class CreateDomainMappingOptions extends GenericModel {

  protected String projectId;
  protected ComponentRef component;
  protected String name;
  protected String tlsSecret;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private ComponentRef component;
    private String name;
    private String tlsSecret;

    /**
     * Instantiates a new Builder from an existing CreateDomainMappingOptions instance.
     *
     * @param createDomainMappingOptions the instance to initialize the Builder with
     */
    private Builder(CreateDomainMappingOptions createDomainMappingOptions) {
      this.projectId = createDomainMappingOptions.projectId;
      this.component = createDomainMappingOptions.component;
      this.name = createDomainMappingOptions.name;
      this.tlsSecret = createDomainMappingOptions.tlsSecret;
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
     * @param name the name
     * @param tlsSecret the tlsSecret
     */
    public Builder(String projectId, ComponentRef component, String name, String tlsSecret) {
      this.projectId = projectId;
      this.component = component;
      this.name = name;
      this.tlsSecret = tlsSecret;
    }

    /**
     * Builds a CreateDomainMappingOptions.
     *
     * @return the new CreateDomainMappingOptions instance
     */
    public CreateDomainMappingOptions build() {
      return new CreateDomainMappingOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateDomainMappingOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the component.
     *
     * @param component the component
     * @return the CreateDomainMappingOptions builder
     */
    public Builder component(ComponentRef component) {
      this.component = component;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDomainMappingOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the tlsSecret.
     *
     * @param tlsSecret the tlsSecret
     * @return the CreateDomainMappingOptions builder
     */
    public Builder tlsSecret(String tlsSecret) {
      this.tlsSecret = tlsSecret;
      return this;
    }
  }

  protected CreateDomainMappingOptions() { }

  protected CreateDomainMappingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.component,
      "component cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsSecret,
      "tlsSecret cannot be null");
    projectId = builder.projectId;
    component = builder.component;
    name = builder.name;
    tlsSecret = builder.tlsSecret;
  }

  /**
   * New builder.
   *
   * @return a CreateDomainMappingOptions builder
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
   * Gets the name.
   *
   * The name of the domain mapping.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the tlsSecret.
   *
   * The name of the TLS secret that holds the certificate and private key of this domain mapping.
   *
   * @return the tlsSecret
   */
  public String tlsSecret() {
    return tlsSecret;
  }
}

