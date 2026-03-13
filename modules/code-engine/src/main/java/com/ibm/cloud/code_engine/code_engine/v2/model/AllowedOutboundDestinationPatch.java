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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * The request model for allowed outbound destination update operations.
 *
 * Classes which extend this class:
 * - AllowedOutboundDestinationPatchCidrBlockDataPatch
 * - AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch
 */
public class AllowedOutboundDestinationPatch extends GenericModel {

  /**
   * Optional property to specify the isolation policy of the private path service gateway. If set to `shared`, other
   * projects within the same account or enterprise account family can connect to Private Path service, too. If set to
   * `dedicated` the gateway can only be used by a single Code Engine project. If not specified the isolation policy
   * will be set to `shared`.
   */
  public interface IsolationPolicy {
    /** shared. */
    String SHARED = "shared";
    /** dedicated. */
    String DEDICATED = "dedicated";
  }

  @SerializedName("cidr_block")
  protected String cidrBlock;
  @SerializedName("isolation_policy")
  protected String isolationPolicy;

  protected AllowedOutboundDestinationPatch() { }

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
   * Gets the isolationPolicy.
   *
   * Optional property to specify the isolation policy of the private path service gateway. If set to `shared`, other
   * projects within the same account or enterprise account family can connect to Private Path service, too. If set to
   * `dedicated` the gateway can only be used by a single Code Engine project. If not specified the isolation policy
   * will be set to `shared`.
   *
   * @return the isolationPolicy
   */
  public String isolationPolicy() {
    return isolationPolicy;
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

