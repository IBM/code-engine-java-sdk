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
 * StorageDataObjectStorageData.
 *
 * This type supports additional properties of type String.
 */
public class StorageDataObjectStorageData extends StorageData {


  public StorageDataObjectStorageData() {
    super();
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketLocation;
    private String bucketName;
    private String secretName;
    private Map<String, String> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing StorageDataObjectStorageData instance.
     *
     * @param storageDataObjectStorageData the instance to initialize the Builder with
     */
    public Builder(StorageData storageDataObjectStorageData) {
      this.bucketLocation = storageDataObjectStorageData.bucketLocation;
      this.bucketName = storageDataObjectStorageData.bucketName;
      this.secretName = storageDataObjectStorageData.secretName;
      this.dynamicProperties = storageDataObjectStorageData.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketLocation the bucketLocation
     * @param bucketName the bucketName
     * @param secretName the secretName
     */
    public Builder(String bucketLocation, String bucketName, String secretName) {
      this.bucketLocation = bucketLocation;
      this.bucketName = bucketName;
      this.secretName = secretName;
    }

    /**
     * Builds a StorageDataObjectStorageData.
     *
     * @return the new StorageDataObjectStorageData instance
     */
    public StorageDataObjectStorageData build() {
      return new StorageDataObjectStorageData(this);
    }

    /**
     * Set the bucketLocation.
     *
     * @param bucketLocation the bucketLocation
     * @return the StorageDataObjectStorageData builder
     */
    public Builder bucketLocation(String bucketLocation) {
      this.bucketLocation = bucketLocation;
      return this;
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the StorageDataObjectStorageData builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the secretName.
     *
     * @param secretName the secretName
     * @return the StorageDataObjectStorageData builder
     */
    public Builder secretName(String secretName) {
      this.secretName = secretName;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the StorageDataObjectStorageData builder
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

  protected StorageDataObjectStorageData(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketLocation,
      "bucketLocation cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketName,
      "bucketName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretName,
      "secretName cannot be null");
    bucketLocation = builder.bucketLocation;
    bucketName = builder.bucketName;
    secretName = builder.secretName;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a StorageDataObjectStorageData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Sets the bucketLocation.
   *
   * @param bucketLocation the new bucketLocation
   */
  public void setBucketLocation(final String bucketLocation) {
    this.bucketLocation = bucketLocation;
  }

  /**
   * Sets the bucketName.
   *
   * @param bucketName the new bucketName
   */
  public void setBucketName(final String bucketName) {
    this.bucketName = bucketName;
  }

  /**
   * Sets the secretName.
   *
   * @param secretName the new secretName
   */
  public void setSecretName(final String secretName) {
    this.secretName = secretName;
  }
}
