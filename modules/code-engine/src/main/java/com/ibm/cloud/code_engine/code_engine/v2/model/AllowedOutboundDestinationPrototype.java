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
 * AllowedOutboundDestinationPrototype is the request model for allowed outbound destination create operations.
 *
 * Classes which extend this class:
 * - AllowedOutboundDestinationPrototypeCidrBlockDataPrototype
 */
public class AllowedOutboundDestinationPrototype extends GenericModel {

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
  protected String name;

  protected AllowedOutboundDestinationPrototype() { }

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
   * Gets the name.
   *
   * The name of the CIDR block.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

