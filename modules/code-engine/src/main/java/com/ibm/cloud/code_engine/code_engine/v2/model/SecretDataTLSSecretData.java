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

import java.util.HashMap;
import java.util.Map;

/**
 * SecretDataTLSSecretData.
 */
public class SecretDataTLSSecretData extends SecretData {


  public SecretDataTLSSecretData() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String tlsCert;
    private String tlsKey;
    private Map<String, String> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing SecretDataTLSSecretData instance.
     *
     * @param secretDataTlsSecretData the instance to initialize the Builder with
     */
    public Builder(SecretData secretDataTlsSecretData) {
      this.tlsCert = secretDataTlsSecretData.tlsCert;
      this.tlsKey = secretDataTlsSecretData.tlsKey;
      this.dynamicProperties = secretDataTlsSecretData.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param tlsCert the tlsCert
     * @param tlsKey the tlsKey
     */
    public Builder(String tlsCert, String tlsKey) {
      this.tlsCert = tlsCert;
      this.tlsKey = tlsKey;
    }

    /**
     * Builds a SecretDataTLSSecretData.
     *
     * @return the new SecretDataTLSSecretData instance
     */
    public SecretDataTLSSecretData build() {
      return new SecretDataTLSSecretData(this);
    }

    /**
     * Set the tlsCert.
     *
     * @param tlsCert the tlsCert
     * @return the SecretDataTLSSecretData builder
     */
    public Builder tlsCert(String tlsCert) {
      this.tlsCert = tlsCert;
      return this;
    }

    /**
     * Set the tlsKey.
     *
     * @param tlsKey the tlsKey
     * @return the SecretDataTLSSecretData builder
     */
    public Builder tlsKey(String tlsKey) {
      this.tlsKey = tlsKey;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the SecretDataTLSSecretData builder
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

  protected SecretDataTLSSecretData(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsCert,
      "tlsCert cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsKey,
      "tlsKey cannot be null");
    tlsCert = builder.tlsCert;
    tlsKey = builder.tlsKey;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a SecretDataTLSSecretData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Sets the tlsCert.
   *
   * @param tlsCert the new tlsCert
   */
  public void setTlsCert(final String tlsCert) {
    this.tlsCert = tlsCert;
  }

  /**
   * Sets the tlsKey.
   *
   * @param tlsKey the new tlsKey
   */
  public void setTlsKey(final String tlsKey) {
    this.tlsKey = tlsKey;
  }
}
