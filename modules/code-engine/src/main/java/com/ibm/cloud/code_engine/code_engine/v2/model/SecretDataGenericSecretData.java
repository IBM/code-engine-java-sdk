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
 * Data container that allows to specify config parameters and their values as a key-value map. Each key field must
 * consist of alphanumeric characters, `-`, `_` or `.` and must not be exceed a max length of 253 characters. Each value
 * field can consists of any character and must not be exceed a max length of 1048576 characters.
 */
public class SecretDataGenericSecretData extends SecretData {


  public SecretDataGenericSecretData() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing SecretDataGenericSecretData instance.
     *
     * @param secretDataGenericSecretData the instance to initialize the Builder with
     */
    public Builder(SecretData secretDataGenericSecretData) {
      this.dynamicProperties = secretDataGenericSecretData.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SecretDataGenericSecretData.
     *
     * @return the new SecretDataGenericSecretData instance
     */
    public SecretDataGenericSecretData build() {
      return new SecretDataGenericSecretData(this);
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the SecretDataGenericSecretData builder
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

  protected SecretDataGenericSecretData(Builder builder) {
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a SecretDataGenericSecretData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}
