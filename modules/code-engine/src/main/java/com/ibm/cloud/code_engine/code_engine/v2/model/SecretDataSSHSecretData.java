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
 * Secret Data field used by SSH secrets.
 *
 * This type supports additional properties of type String.
 */
public class SecretDataSSHSecretData extends SecretData {


  public SecretDataSSHSecretData() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String sshKey;
    private String knownHosts;
    private Map<String, String> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing SecretDataSSHSecretData instance.
     *
     * @param secretDataSshSecretData the instance to initialize the Builder with
     */
    public Builder(SecretData secretDataSshSecretData) {
      this.sshKey = secretDataSshSecretData.sshKey;
      this.knownHosts = secretDataSshSecretData.knownHosts;
      this.dynamicProperties = secretDataSshSecretData.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sshKey the sshKey
     */
    public Builder(String sshKey) {
      this.sshKey = sshKey;
    }

    /**
     * Builds a SecretDataSSHSecretData.
     *
     * @return the new SecretDataSSHSecretData instance
     */
    public SecretDataSSHSecretData build() {
      return new SecretDataSSHSecretData(this);
    }

    /**
     * Set the sshKey.
     *
     * @param sshKey the sshKey
     * @return the SecretDataSSHSecretData builder
     */
    public Builder sshKey(String sshKey) {
      this.sshKey = sshKey;
      return this;
    }

    /**
     * Set the knownHosts.
     *
     * @param knownHosts the knownHosts
     * @return the SecretDataSSHSecretData builder
     */
    public Builder knownHosts(String knownHosts) {
      this.knownHosts = knownHosts;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the SecretDataSSHSecretData builder
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

  protected SecretDataSSHSecretData(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sshKey,
      "sshKey cannot be null");
    sshKey = builder.sshKey;
    knownHosts = builder.knownHosts;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a SecretDataSSHSecretData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Sets the sshKey.
   *
   * @param sshKey the new sshKey
   */
  public void setSshKey(final String sshKey) {
    this.sshKey = sshKey;
  }

  /**
   * Sets the knownHosts.
   *
   * @param knownHosts the new knownHosts
   */
  public void setKnownHosts(final String knownHosts) {
    this.knownHosts = knownHosts;
  }
}
