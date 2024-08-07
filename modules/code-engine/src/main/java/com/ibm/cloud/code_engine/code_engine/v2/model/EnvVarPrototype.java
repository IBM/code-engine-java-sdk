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
 * Prototype model for environment variables.
 */
public class EnvVarPrototype extends GenericModel {

  /**
   * Specify the type of the environment variable.
   */
  public interface Type {
    /** literal. */
    String LITERAL = "literal";
    /** config_map_full_reference. */
    String CONFIG_MAP_FULL_REFERENCE = "config_map_full_reference";
    /** secret_full_reference. */
    String SECRET_FULL_REFERENCE = "secret_full_reference";
    /** config_map_key_reference. */
    String CONFIG_MAP_KEY_REFERENCE = "config_map_key_reference";
    /** secret_key_reference. */
    String SECRET_KEY_REFERENCE = "secret_key_reference";
  }

  protected String key;
  protected String name;
  protected String prefix;
  protected String reference;
  protected String type;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String key;
    private String name;
    private String prefix;
    private String reference;
    private String type;
    private String value;

    /**
     * Instantiates a new Builder from an existing EnvVarPrototype instance.
     *
     * @param envVarPrototype the instance to initialize the Builder with
     */
    private Builder(EnvVarPrototype envVarPrototype) {
      this.key = envVarPrototype.key;
      this.name = envVarPrototype.name;
      this.prefix = envVarPrototype.prefix;
      this.reference = envVarPrototype.reference;
      this.type = envVarPrototype.type;
      this.value = envVarPrototype.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnvVarPrototype.
     *
     * @return the new EnvVarPrototype instance
     */
    public EnvVarPrototype build() {
      return new EnvVarPrototype(this);
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the EnvVarPrototype builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the EnvVarPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the EnvVarPrototype builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    /**
     * Set the reference.
     *
     * @param reference the reference
     * @return the EnvVarPrototype builder
     */
    public Builder reference(String reference) {
      this.reference = reference;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the EnvVarPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the EnvVarPrototype builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected EnvVarPrototype() { }

  protected EnvVarPrototype(Builder builder) {
    key = builder.key;
    name = builder.name;
    prefix = builder.prefix;
    reference = builder.reference;
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a EnvVarPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the key.
   *
   * The key to reference as environment variable.
   *
   * @return the key
   */
  public String key() {
    return key;
  }

  /**
   * Gets the name.
   *
   * The name of the environment variable.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the prefix.
   *
   * A prefix that can be added to all keys of a full secret or config map reference.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
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
   * Specify the type of the environment variable.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the value.
   *
   * The literal value of the environment variable.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

