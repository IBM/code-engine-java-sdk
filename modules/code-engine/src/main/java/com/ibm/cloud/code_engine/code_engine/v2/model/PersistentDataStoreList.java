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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List of all persistent data stores.
 */
public class PersistentDataStoreList extends GenericModel {

  protected ListFirstMetadata first;
  protected Long limit;
  protected ListNextMetadata next;
  @SerializedName("persistent_data_stores")
  protected List<PersistentDataStore> persistentDataStores;

  protected PersistentDataStoreList() { }

  /**
   * Gets the first.
   *
   * Describes properties needed to retrieve the first page of a result list.
   *
   * @return the first
   */
  public ListFirstMetadata getFirst() {
    return first;
  }

  /**
   * Gets the limit.
   *
   * Maximum number of resources per page.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the next.
   *
   * Describes properties needed to retrieve the next page of a result list.
   *
   * @return the next
   */
  public ListNextMetadata getNext() {
    return next;
  }

  /**
   * Gets the persistentDataStores.
   *
   * List of persistent data stores.
   *
   * @return the persistentDataStores
   */
  public List<PersistentDataStore> getPersistentDataStores() {
    return persistentDataStores;
  }
}

