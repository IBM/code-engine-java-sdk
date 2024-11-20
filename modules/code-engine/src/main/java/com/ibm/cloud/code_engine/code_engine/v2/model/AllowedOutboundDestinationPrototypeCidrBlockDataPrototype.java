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

/**
 * Create an allowed outbound destination by using a CIDR block.
 */
public class AllowedOutboundDestinationPrototypeCidrBlockDataPrototype extends AllowedOutboundDestinationPrototype {

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
    private String name;

    /**
     * Instantiates a new Builder from an existing AllowedOutboundDestinationPrototypeCidrBlockDataPrototype instance.
     *
     * @param allowedOutboundDestinationPrototypeCidrBlockDataPrototype the instance to initialize the Builder with
     */
    public Builder(AllowedOutboundDestinationPrototype allowedOutboundDestinationPrototypeCidrBlockDataPrototype) {
      this.type = allowedOutboundDestinationPrototypeCidrBlockDataPrototype.type;
      this.cidrBlock = allowedOutboundDestinationPrototypeCidrBlockDataPrototype.cidrBlock;
      this.name = allowedOutboundDestinationPrototypeCidrBlockDataPrototype.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param cidrBlock the cidrBlock
     * @param name the name
     */
    public Builder(String type, String cidrBlock, String name) {
      this.type = type;
      this.cidrBlock = cidrBlock;
      this.name = name;
    }

    /**
     * Builds a AllowedOutboundDestinationPrototypeCidrBlockDataPrototype.
     *
     * @return the new AllowedOutboundDestinationPrototypeCidrBlockDataPrototype instance
     */
    public AllowedOutboundDestinationPrototypeCidrBlockDataPrototype build() {
      return new AllowedOutboundDestinationPrototypeCidrBlockDataPrototype(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the AllowedOutboundDestinationPrototypeCidrBlockDataPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the cidrBlock.
     *
     * @param cidrBlock the cidrBlock
     * @return the AllowedOutboundDestinationPrototypeCidrBlockDataPrototype builder
     */
    public Builder cidrBlock(String cidrBlock) {
      this.cidrBlock = cidrBlock;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the AllowedOutboundDestinationPrototypeCidrBlockDataPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected AllowedOutboundDestinationPrototypeCidrBlockDataPrototype() { }

  protected AllowedOutboundDestinationPrototypeCidrBlockDataPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cidrBlock,
      "cidrBlock cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    type = builder.type;
    cidrBlock = builder.cidrBlock;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a AllowedOutboundDestinationPrototypeCidrBlockDataPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

