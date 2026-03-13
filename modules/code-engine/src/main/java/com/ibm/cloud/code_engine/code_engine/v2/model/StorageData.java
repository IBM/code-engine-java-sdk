/*
 * (C) Copyright IBM Corp. 2026.
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

  /**
   * Specify the location of the bucket.
   */
  public interface BucketLocation {
    /** au-syd. */
    String AU_SYD = "au-syd";
    /** br-sao. */
    String BR_SAO = "br-sao";
    /** ca-mon. */
    String CA_MON = "ca-mon";
    /** ca-tor. */
    String CA_TOR = "ca-tor";
    /** eu-de. */
    String EU_DE = "eu-de";
    /** eu-es. */
    String EU_ES = "eu-es";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** jp-osa. */
    String JP_OSA = "jp-osa";
    /** jp-tok. */
    String JP_TOK = "jp-tok";
    /** us-east. */
    String US_EAST = "us-east";
    /** us-south. */
    String US_SOUTH = "us-south";
    /** ap. */
    String AP = "ap";
    /** eu. */
    String EU = "eu";
    /** us. */
    String US = "us";
    /** ams03. */
    String AMS03 = "ams03";
    /** che01. */
    String CHE01 = "che01";
    /** mil01. */
    String MIL01 = "mil01";
    /** mon01. */
    String MON01 = "mon01";
    /** par01. */
    String PAR01 = "par01";
    /** sjc04. */
    String SJC04 = "sjc04";
    /** sng01. */
    String SNG01 = "sng01";
  }

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
