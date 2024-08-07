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
 * SecretDataRegistrySecretData.
 */
public class SecretDataRegistrySecretData extends SecretData {


  public SecretDataRegistrySecretData() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String username;
    private String password;
    private String server;
    private String email;
    private Map<String, String> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing SecretDataRegistrySecretData instance.
     *
     * @param secretDataRegistrySecretData the instance to initialize the Builder with
     */
    public Builder(SecretData secretDataRegistrySecretData) {
      this.username = secretDataRegistrySecretData.username;
      this.password = secretDataRegistrySecretData.password;
      this.server = secretDataRegistrySecretData.server;
      this.email = secretDataRegistrySecretData.email;
      this.dynamicProperties = secretDataRegistrySecretData.getProperties();
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
     * @param server the server
     */
    public Builder(String username, String password, String server) {
      this.username = username;
      this.password = password;
      this.server = server;
    }

    /**
     * Builds a SecretDataRegistrySecretData.
     *
     * @return the new SecretDataRegistrySecretData instance
     */
    public SecretDataRegistrySecretData build() {
      return new SecretDataRegistrySecretData(this);
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the SecretDataRegistrySecretData builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the SecretDataRegistrySecretData builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the server.
     *
     * @param server the server
     * @return the SecretDataRegistrySecretData builder
     */
    public Builder server(String server) {
      this.server = server;
      return this;
    }

    /**
     * Set the email.
     *
     * @param email the email
     * @return the SecretDataRegistrySecretData builder
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the SecretDataRegistrySecretData builder
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

  protected SecretDataRegistrySecretData(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.username,
      "username cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.server,
      "server cannot be null");
    username = builder.username;
    password = builder.password;
    server = builder.server;
    email = builder.email;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a SecretDataRegistrySecretData builder
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

  /**
   * Sets the server.
   *
   * @param server the new server
   */
  public void setServer(final String server) {
    this.server = server;
  }

  /**
   * Sets the email.
   *
   * @param email the new email
   */
  public void setEmail(final String email) {
    this.email = email;
  }
}
