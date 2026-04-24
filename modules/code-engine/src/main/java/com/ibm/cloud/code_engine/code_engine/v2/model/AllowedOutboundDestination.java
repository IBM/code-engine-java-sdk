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
 * AllowedOutboundDestination Describes the model of an allowed outbound destination.
 *
 * Classes which extend this class:
 * - AllowedOutboundDestinationCidrBlockData
 * - AllowedOutboundDestinationPrivatePathServiceGatewayData
 */
public class AllowedOutboundDestination extends GenericModel {

  /**
   * The current status of the outbound destination.
   */
  public interface Status {
    /** ready. */
    String READY = "ready";
    /** failed. */
    String FAILED = "failed";
    /** deploying. */
    String DEPLOYING = "deploying";
  }

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

  @SerializedName("entity_tag")
  protected String entityTag;
  protected String name;
  @SerializedName("project_id")
  protected String projectId;
  protected String status;
  @SerializedName("status_details")
  protected AllowedOutboundStatusDetails statusDetails;
  protected String type;
  @SerializedName("cidr_block")
  protected String cidrBlock;
  @SerializedName("isolation_policy")
  protected String isolationPolicy;
  @SerializedName("private_path_service_gateway_crn")
  protected String privatePathServiceGatewayCrn;

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
   * Gets the name.
   *
   * The name of the allowed outbound destination.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project in which the resource is located.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the status.
   *
   * The current status of the outbound destination.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusDetails.
   *
   * @return the statusDetails
   */
  public AllowedOutboundStatusDetails getStatusDetails() {
    return statusDetails;
  }

  /**
   * Gets the type.
   *
   * Specify the type of the allowed outbound destination. Allowed types are: `cidr_block` and
   * `private_path_service_gateway`.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the cidrBlock.
   *
   * The IPv4 address range.
   *
   * @return the cidrBlock
   */
  public String getCidrBlock() {
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
  public String getIsolationPolicy() {
    return isolationPolicy;
  }

  /**
   * Gets the privatePathServiceGatewayCrn.
   *
   * The CRN of the Private Path service.
   *
   * @return the privatePathServiceGatewayCrn
   */
  public String getPrivatePathServiceGatewayCrn() {
    return privatePathServiceGatewayCrn;
  }
}

