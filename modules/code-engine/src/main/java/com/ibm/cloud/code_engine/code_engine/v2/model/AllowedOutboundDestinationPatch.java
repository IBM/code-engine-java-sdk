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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * AllowedOutboundDestinationPatch is the request model for allowed outbound destination update operations.
 *
 * Classes which extend this class:
 * - AllowedOutboundDestinationPatchCidrBlockDataPatch
 */
public class AllowedOutboundDestinationPatch extends GenericModel {

  /**
   * Specify the type of the allowed outbound destination. Allowed types are: 'cidr_block'.
   */
  public interface Type {
    /** cidr_block. */
    String CIDR_BLOCK = "cidr_block";
  }

  protected String type;
  @SerializedName("cidr_block")
  protected String cidrBlock;

  protected AllowedOutboundDestinationPatch() { }

  /**
   * Gets the type.
   *
   * Specify the type of the allowed outbound destination. Allowed types are: 'cidr_block'.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the cidrBlock.
   *
   * The IPv4 address range.
   *
   * @return the cidrBlock
   */
  public String cidrBlock() {
    return cidrBlock;
  }

  /**
   * Construct a JSON merge-patch from the AllowedOutboundDestinationPatch.
   *
   * Note that properties of the AllowedOutboundDestinationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the AllowedOutboundDestinationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

