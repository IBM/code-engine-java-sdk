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
 * The createPersistentDataStore options.
 */
public class CreatePersistentDataStoreOptions extends GenericModel {

  /**
   * Specify the storage type of the persistent data store.
   */
  public interface StorageType {
    /** object_storage. */
    String OBJECT_STORAGE = "object_storage";
  }

  protected String projectId;
  protected String name;
  protected String storageType;
  protected StorageData data;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private String storageType;
    private StorageData data;

    /**
     * Instantiates a new Builder from an existing CreatePersistentDataStoreOptions instance.
     *
     * @param createPersistentDataStoreOptions the instance to initialize the Builder with
     */
    private Builder(CreatePersistentDataStoreOptions createPersistentDataStoreOptions) {
      this.projectId = createPersistentDataStoreOptions.projectId;
      this.name = createPersistentDataStoreOptions.name;
      this.storageType = createPersistentDataStoreOptions.storageType;
      this.data = createPersistentDataStoreOptions.data;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param projectId the projectId
     * @param name the name
     * @param storageType the storageType
     */
    public Builder(String projectId, String name, String storageType) {
      this.projectId = projectId;
      this.name = name;
      this.storageType = storageType;
    }

    /**
     * Builds a CreatePersistentDataStoreOptions.
     *
     * @return the new CreatePersistentDataStoreOptions instance
     */
    public CreatePersistentDataStoreOptions build() {
      return new CreatePersistentDataStoreOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreatePersistentDataStoreOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreatePersistentDataStoreOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the storageType.
     *
     * @param storageType the storageType
     * @return the CreatePersistentDataStoreOptions builder
     */
    public Builder storageType(String storageType) {
      this.storageType = storageType;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the CreatePersistentDataStoreOptions builder
     */
    public Builder data(StorageData data) {
      this.data = data;
      return this;
    }
  }

  protected CreatePersistentDataStoreOptions() { }

  protected CreatePersistentDataStoreOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.storageType,
      "storageType cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    storageType = builder.storageType;
    data = builder.data;
  }

  /**
   * New builder.
   *
   * @return a CreatePersistentDataStoreOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the name.
   *
   * The name of the persistent data store.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the storageType.
   *
   * Specify the storage type of the persistent data store.
   *
   * @return the storageType
   */
  public String storageType() {
    return storageType;
  }

  /**
   * Gets the data.
   *
   * Data container that allows to specify config parameters and their values as a key-value map. Each key field must
   * consist of alphanumeric characters, `-`, `_` or `.` and must not exceed a max length of 253 characters. Each value
   * field can consists of any character and must not exceed a max length of 1048576 characters.
   *
   * @return the data
   */
  public StorageData data() {
    return data;
  }
}

