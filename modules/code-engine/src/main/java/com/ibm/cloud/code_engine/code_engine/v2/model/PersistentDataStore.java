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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Describes the model of a persistent data store.
 */
public class PersistentDataStore extends GenericModel {

  /**
   * Specify the storage type of the persistent data store.
   */
  public interface StorageType {
    /** object_storage. */
    String OBJECT_STORAGE = "object_storage";
  }

  @SerializedName("created_at")
  protected String createdAt;
  protected StorageData data;
  @SerializedName("entity_tag")
  protected String entityTag;
  protected String id;
  protected String name;
  @SerializedName("project_id")
  protected String projectId;
  protected String region;
  @SerializedName("storage_type")
  protected String storageType;

  protected PersistentDataStore() { }

  /**
   * Gets the createdAt.
   *
   * The timestamp when the resource was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
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
  public StorageData getData() {
    return data;
  }

  /**
   * Gets the entityTag.
   *
   * The version of the persistent data store, which is used to achieve optimistic locking.
   *
   * @return the entityTag
   */
  public String getEntityTag() {
    return entityTag;
  }

  /**
   * Gets the id.
   *
   * The identifier of the resource.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name of the persistent data store.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project in which the resource is located.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the region.
   *
   * The region of the project the resource is located in. Possible values: 'au-syd', 'br-sao', 'ca-tor', 'eu-de',
   * 'eu-gb', 'jp-osa', 'jp-tok', 'us-east', 'us-south'.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the storageType.
   *
   * Specify the storage type of the persistent data store.
   *
   * @return the storageType
   */
  public String getStorageType() {
    return storageType;
  }
}

