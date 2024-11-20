/*
 * (C) Copyright IBM Corp. 2024.
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

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Update an allowed outbound destination by using a CIDR block.
 */
public class AllowedOutboundDestinationPatchCidrBlockDataPatch extends AllowedOutboundDestinationPatch {

  /**
   * Specify the type of the allowed outbound destination. Allowed types are: 'cidr_block'.
   */
  public interface Type {
    /** cidr_block. */
    String CIDR_BLOCK = "cidr_block";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String cidrBlock;

    /**
     * Instantiates a new Builder from an existing AllowedOutboundDestinationPatchCidrBlockDataPatch instance.
     *
     * @param allowedOutboundDestinationPatchCidrBlockDataPatch the instance to initialize the Builder with
     */
    public Builder(AllowedOutboundDestinationPatch allowedOutboundDestinationPatchCidrBlockDataPatch) {
      this.type = allowedOutboundDestinationPatchCidrBlockDataPatch.type;
      this.cidrBlock = allowedOutboundDestinationPatchCidrBlockDataPatch.cidrBlock;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AllowedOutboundDestinationPatchCidrBlockDataPatch.
     *
     * @return the new AllowedOutboundDestinationPatchCidrBlockDataPatch instance
     */
    public AllowedOutboundDestinationPatchCidrBlockDataPatch build() {
      return new AllowedOutboundDestinationPatchCidrBlockDataPatch(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the AllowedOutboundDestinationPatchCidrBlockDataPatch builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the cidrBlock.
     *
     * @param cidrBlock the cidrBlock
     * @return the AllowedOutboundDestinationPatchCidrBlockDataPatch builder
     */
    public Builder cidrBlock(String cidrBlock) {
      this.cidrBlock = cidrBlock;
      return this;
    }
  }

  protected AllowedOutboundDestinationPatchCidrBlockDataPatch() { }

  protected AllowedOutboundDestinationPatchCidrBlockDataPatch(Builder builder) {
    type = builder.type;
    cidrBlock = builder.cidrBlock;
  }

  /**
   * New builder.
   *
   * @return a AllowedOutboundDestinationPatchCidrBlockDataPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the AllowedOutboundDestinationPatchCidrBlockDataPatch.
   *
   * Note that properties of the AllowedOutboundDestinationPatchCidrBlockDataPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the AllowedOutboundDestinationPatchCidrBlockDataPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

