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

/**
 * Allowed outbound destination of type CIDR block.
 */
public class AllowedOutboundDestinationCidrBlockData extends AllowedOutboundDestination {

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


  protected AllowedOutboundDestinationCidrBlockData() { }
}

