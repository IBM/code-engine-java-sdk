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
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Data container that allows to specify config parameters and their values as a key-value map. Each key field must
 * consist of alphanumeric characters, `-`, `_` or `.` and must not exceed a max length of 253 characters. Each value
 * field can consists of any character and must not exceed a max length of 1048576 characters.
 *
 * This type supports additional properties of type String.
 *
 * Classes which extend this class:
 * - StorageDataObjectStorageData
 */
public class StorageData extends DynamicModel<String> {

  @SerializedName("bucket_location")
  protected String bucketLocation;
  @SerializedName("bucket_name")
  protected String bucketName;
  @SerializedName("secret_name")
  protected String secretName;

  protected StorageData() {
    super(new TypeToken<String>() { });
  }

  /**
   * Gets the bucketLocation.
   *
   * Specify the location of the bucket.
   *
   * @return the bucketLocation
   */
  public String getBucketLocation() {
    return this.bucketLocation;
  }

  /**
   * Gets the bucketName.
   *
   * Specify the name of the bucket.
   *
   * @return the bucketName
   */
  public String getBucketName() {
    return this.bucketName;
  }

  /**
   * Gets the secretName.
   *
   * Specify the name of the HMAC secret.
   *
   * @return the secretName
   */
  public String getSecretName() {
    return this.secretName;
  }
}
