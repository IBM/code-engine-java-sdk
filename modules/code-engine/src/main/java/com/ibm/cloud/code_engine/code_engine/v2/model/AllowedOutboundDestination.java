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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AllowedOutboundDestination Describes the model of an allowed outbound destination.
 *
 * Classes which extend this class:
 * - AllowedOutboundDestinationCidrBlockData
 */
public class AllowedOutboundDestination extends GenericModel {

  /**
   * Specify the type of the allowed outbound destination. Allowed types are: 'cidr_block'.
   */
  public interface Type {
    /** cidr_block. */
    String CIDR_BLOCK = "cidr_block";
  }

  @SerializedName("entity_tag")
  protected String entityTag;
  protected String type;
  @SerializedName("cidr_block")
  protected String cidrBlock;
  protected String name;

  protected AllowedOutboundDestination() { }

  /**
   * Gets the entityTag.
   *
   * The version of the allowed outbound destination, which is used to achieve optimistic locking.
   *
   * @return the entityTag
   */
  public String getEntityTag() {
    return entityTag;
  }

  /**
   * Gets the type.
   *
   * Specify the type of the allowed outbound destination. Allowed types are: 'cidr_block'.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the cidrBlock.
   *
   * The IP address range.
   *
   * @return the cidrBlock
   */
  public String getCidrBlock() {
    return cidrBlock;
  }

  /**
   * Gets the name.
   *
   * The name of the CIDR block.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

