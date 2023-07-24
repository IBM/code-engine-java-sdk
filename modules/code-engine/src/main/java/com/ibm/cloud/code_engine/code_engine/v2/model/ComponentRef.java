/*
 * (C) Copyright IBM Corp. 2023.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A reference to another component.
 */
public class ComponentRef extends GenericModel {

  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String resourceType;

    /**
     * Instantiates a new Builder from an existing ComponentRef instance.
     *
     * @param componentRef the instance to initialize the Builder with
     */
    private Builder(ComponentRef componentRef) {
      this.name = componentRef.name;
      this.resourceType = componentRef.resourceType;
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
     * @param resourceType the resourceType
     */
    public Builder(String name, String resourceType) {
      this.name = name;
      this.resourceType = resourceType;
    }

    /**
     * Builds a ComponentRef.
     *
     * @return the new ComponentRef instance
     */
    public ComponentRef build() {
      return new ComponentRef(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ComponentRef builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceType.
     *
     * @param resourceType the resourceType
     * @return the ComponentRef builder
     */
    public Builder resourceType(String resourceType) {
      this.resourceType = resourceType;
      return this;
    }
  }

  protected ComponentRef() { }

  protected ComponentRef(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceType,
      "resourceType cannot be null");
    name = builder.name;
    resourceType = builder.resourceType;
  }

  /**
   * New builder.
   *
   * @return a ComponentRef builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name of the referenced component.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceType.
   *
   * The type of the referenced resource.
   *
   * @return the resourceType
   */
  public String resourceType() {
    return resourceType;
  }
}

