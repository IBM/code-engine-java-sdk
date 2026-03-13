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
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AllowedOutboundDestinationPrototype is the request model for allowed outbound destination create operations.
 *
 * Classes which extend this class:
 * - AllowedOutboundDestinationPrototypeCidrBlockDataPrototype
 * - AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype
 */
public class AllowedOutboundDestinationPrototype extends GenericModel {

  /**
   * Specify the type of the allowed outbound destination. Allowed types are: `cidr_block` and
   * `private_path_service_gateway`.
   */
  public interface Type {
    /** cidr_block. */
    String CIDR_BLOCK = "cidr_block";
    /** private_path_service_gateway. */
    String PRIVATE_PATH_SERVICE_GATEWAY = "private_path_service_gateway";
  }

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

  protected String type;
  protected String name;
  @SerializedName("cidr_block")
  protected String cidrBlock;
  @SerializedName("private_path_service_gateway_crn")
  protected String privatePathServiceGatewayCrn;
  @SerializedName("isolation_policy")
  protected String isolationPolicy;

  protected AllowedOutboundDestinationPrototype() { }

  /**
   * Gets the type.
   *
   * Specify the type of the allowed outbound destination. Allowed types are: `cidr_block` and
   * `private_path_service_gateway`.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the name.
   *
   * The name of the allowed outbound destination.
   *
   * @return the name
   */
  public String name() {
    return name;
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
   * Gets the privatePathServiceGatewayCrn.
   *
   * The CRN of the Private Path service. The CRN can be obtained in the resource details of the target Private Path
   * service. [Learn more](https://cloud.ibm.com/docs/vpc?topic=vpc-pps-ui-communicate).
   *
   * @return the privatePathServiceGatewayCrn
   */
  public String privatePathServiceGatewayCrn() {
    return privatePathServiceGatewayCrn;
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
}

