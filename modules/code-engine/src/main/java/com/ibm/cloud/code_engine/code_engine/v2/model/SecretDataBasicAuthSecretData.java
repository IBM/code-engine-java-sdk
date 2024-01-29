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

import java.util.HashMap;
import java.util.Map;

/**
 * SecretDataBasicAuthSecretData.
 */
public class SecretDataBasicAuthSecretData extends SecretData {


  public SecretDataBasicAuthSecretData() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String username;
    private String password;
    private Map<String, String> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing SecretDataBasicAuthSecretData instance.
     *
     * @param secretDataBasicAuthSecretData the instance to initialize the Builder with
     */
    public Builder(SecretData secretDataBasicAuthSecretData) {
      this.username = secretDataBasicAuthSecretData.username;
      this.password = secretDataBasicAuthSecretData.password;
      this.dynamicProperties = secretDataBasicAuthSecretData.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param username the username
     * @param password the password
     */
    public Builder(String username, String password) {
      this.username = username;
      this.password = password;
    }

    /**
     * Builds a SecretDataBasicAuthSecretData.
     *
     * @return the new SecretDataBasicAuthSecretData instance
     */
    public SecretDataBasicAuthSecretData build() {
      return new SecretDataBasicAuthSecretData(this);
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the SecretDataBasicAuthSecretData builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the SecretDataBasicAuthSecretData builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the SecretDataBasicAuthSecretData builder
     */
    public Builder add(String name, String value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, String>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected SecretDataBasicAuthSecretData(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.username,
      "username cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    username = builder.username;
    password = builder.password;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a SecretDataBasicAuthSecretData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Sets the username.
   *
   * @param username the new username
   */
  public void setUsername(final String username) {
    this.username = username;
  }

  /**
   * Sets the password.
   *
   * @param password the new password
   */
  public void setPassword(final String password) {
    this.password = password;
  }
}
