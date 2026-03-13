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
 * AllowedOutboundStatusDetails.
 *
 * Classes which extend this class:
 * - AllowedOutboundStatusDetailsPrivatePathServiceGatewayStatusDetails
 */
public class AllowedOutboundStatusDetails extends GenericModel {

  /**
   * Optional information to provide more context in case of a 'failed' or 'deploying' status.
   */
  public interface Reason {
    /** ready. */
    String READY = "ready";
    /** private_path_crn_invalid. */
    String PRIVATE_PATH_CRN_INVALID = "private_path_crn_invalid";
    /** private_path_not_in_same_region. */
    String PRIVATE_PATH_NOT_IN_SAME_REGION = "private_path_not_in_same_region";
    /** private_path_not_in_same_account_family. */
    String PRIVATE_PATH_NOT_IN_SAME_ACCOUNT_FAMILY = "private_path_not_in_same_account_family";
    /** private_path_not_found. */
    String PRIVATE_PATH_NOT_FOUND = "private_path_not_found";
    /** private_path_not_published. */
    String PRIVATE_PATH_NOT_PUBLISHED = "private_path_not_published";
    /** private_path_connection_already_exists. */
    String PRIVATE_PATH_CONNECTION_ALREADY_EXISTS = "private_path_connection_already_exists";
    /** private_path_connection_approval_denied. */
    String PRIVATE_PATH_CONNECTION_APPROVAL_DENIED = "private_path_connection_approval_denied";
    /** private_path_connection_approval_pending. */
    String PRIVATE_PATH_CONNECTION_APPROVAL_PENDING = "private_path_connection_approval_pending";
    /** deploying. */
    String DEPLOYING = "deploying";
    /** failed. */
    String FAILED = "failed";
  }

  @SerializedName("endpoint_gateway")
  protected EndpointGatewayDetails endpointGateway;
  @SerializedName("private_path_service_gateway")
  protected PrivatePathServiceGatewayDetails privatePathServiceGateway;
  protected String reason;

  protected AllowedOutboundStatusDetails() { }

  /**
   * Gets the endpointGateway.
   *
   * Optional information about the endpoint gateway located in the Code Engine VPC that connects to the private path
   * service gateway.
   *
   * @return the endpointGateway
   */
  public EndpointGatewayDetails getEndpointGateway() {
    return endpointGateway;
  }

  /**
   * Gets the privatePathServiceGateway.
   *
   * Optional information about the private path service gateway that this allowed outbound destination points to.
   *
   * @return the privatePathServiceGateway
   */
  public PrivatePathServiceGatewayDetails getPrivatePathServiceGateway() {
    return privatePathServiceGateway;
  }

  /**
   * Gets the reason.
   *
   * Optional information to provide more context in case of a 'failed' or 'deploying' status.
   *
   * @return the reason
   */
  public String getReason() {
    return reason;
  }
}

