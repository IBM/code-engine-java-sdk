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
 * Prototype model for build params.
 */
public class BuildParamPrototype extends GenericModel {

  /**
   * Specify the type of the build param.
   */
  public interface Type {
    /** literal. */
    String LITERAL = "literal";
    /** config_map_key_reference. */
    String CONFIG_MAP_KEY_REFERENCE = "config_map_key_reference";
    /** secret_key_reference. */
    String SECRET_KEY_REFERENCE = "secret_key_reference";
  }

  protected String key;
  protected String name;
  protected String reference;
  protected String type;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String key;
    private String name;
    private String reference;
    private String type;
    private String value;

    /**
     * Instantiates a new Builder from an existing BuildParamPrototype instance.
     *
     * @param buildParamPrototype the instance to initialize the Builder with
     */
    private Builder(BuildParamPrototype buildParamPrototype) {
      this.key = buildParamPrototype.key;
      this.name = buildParamPrototype.name;
      this.reference = buildParamPrototype.reference;
      this.type = buildParamPrototype.type;
      this.value = buildParamPrototype.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a BuildParamPrototype.
     *
     * @return the new BuildParamPrototype instance
     */
    public BuildParamPrototype build() {
      return new BuildParamPrototype(this);
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the BuildParamPrototype builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BuildParamPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the reference.
     *
     * @param reference the reference
     * @return the BuildParamPrototype builder
     */
    public Builder reference(String reference) {
      this.reference = reference;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the BuildParamPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the BuildParamPrototype builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected BuildParamPrototype() { }

  protected BuildParamPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    key = builder.key;
    name = builder.name;
    reference = builder.reference;
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a BuildParamPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the key.
   *
   * The key to reference as build param.
   *
   * @return the key
   */
  public String key() {
    return key;
  }

  /**
   * Gets the name.
   *
   * The name of the build param.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the reference.
   *
   * The name of the secret or config map.
   *
   * @return the reference
   */
  public String reference() {
    return reference;
  }

  /**
   * Gets the type.
   *
   * Specify the type of the build param.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the value.
   *
   * The literal value of the build param.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

