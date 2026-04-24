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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Optional information about the endpoint gateway located in the Code Engine VPC that connects to the private path
 * service gateway.
 */
public class EndpointGatewayDetails extends GenericModel {

  @SerializedName("account_id")
  protected String accountId;
  @SerializedName("created_at")
  protected String createdAt;
  protected List<String> ips;
  protected String name;

  protected EndpointGatewayDetails() { }

  /**
   * Gets the accountId.
   *
   * The ID of the account that created the endpoint gateway, e.g. 4329073d16d2f3663f74bfa955259139.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the createdAt.
   *
   * The timestamp when the endpoint gateway was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the ips.
   *
   * The reserved IPs bound to this endpoint gateway.
   *
   * @return the ips
   */
  public List<String> getIps() {
    return ips;
  }

  /**
   * Gets the name.
   *
   * The name for this endpoint gateway. The name is unique across all endpoint gateways in the VPC.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

