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

import java.util.HashMap;
import java.util.Map;

/**
 * Secret Data field used by HMAC secrets.
 *
 * This type supports additional properties of type String.
 */
public class SecretDataHMACAuthSecretData extends SecretData {


  public SecretDataHMACAuthSecretData() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String accessKeyId;
    private String secretAccessKey;
    private Map<String, String> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing SecretDataHMACAuthSecretData instance.
     *
     * @param secretDataHmacAuthSecretData the instance to initialize the Builder with
     */
    public Builder(SecretData secretDataHmacAuthSecretData) {
      this.accessKeyId = secretDataHmacAuthSecretData.accessKeyId;
      this.secretAccessKey = secretDataHmacAuthSecretData.secretAccessKey;
      this.dynamicProperties = secretDataHmacAuthSecretData.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param accessKeyId the accessKeyId
     * @param secretAccessKey the secretAccessKey
     */
    public Builder(String accessKeyId, String secretAccessKey) {
      this.accessKeyId = accessKeyId;
      this.secretAccessKey = secretAccessKey;
    }

    /**
     * Builds a SecretDataHMACAuthSecretData.
     *
     * @return the new SecretDataHMACAuthSecretData instance
     */
    public SecretDataHMACAuthSecretData build() {
      return new SecretDataHMACAuthSecretData(this);
    }

    /**
     * Set the accessKeyId.
     *
     * @param accessKeyId the accessKeyId
     * @return the SecretDataHMACAuthSecretData builder
     */
    public Builder accessKeyId(String accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }

    /**
     * Set the secretAccessKey.
     *
     * @param secretAccessKey the secretAccessKey
     * @return the SecretDataHMACAuthSecretData builder
     */
    public Builder secretAccessKey(String secretAccessKey) {
      this.secretAccessKey = secretAccessKey;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the SecretDataHMACAuthSecretData builder
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

  protected SecretDataHMACAuthSecretData(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.accessKeyId,
      "accessKeyId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretAccessKey,
      "secretAccessKey cannot be null");
    accessKeyId = builder.accessKeyId;
    secretAccessKey = builder.secretAccessKey;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a SecretDataHMACAuthSecretData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Sets the accessKeyId.
   *
   * @param accessKeyId the new accessKeyId
   */
  public void setAccessKeyId(final String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  /**
   * Sets the secretAccessKey.
   *
   * @param secretAccessKey the new secretAccessKey
   */
  public void setSecretAccessKey(final String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }
}
