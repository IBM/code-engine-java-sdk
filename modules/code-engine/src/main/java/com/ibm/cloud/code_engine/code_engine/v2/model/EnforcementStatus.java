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
 * Describes the model of the CBR enforcement status.
 */
public class EnforcementStatus extends GenericModel {

  /**
   * Detailed information on the condition of the CBR enforcement.
   */
  public interface Enforcement {
    /** applied. */
    String APPLIED = "applied";
    /** out_of_sync. */
    String OUT_OF_SYNC = "out_of_sync";
    /** none. */
    String NONE = "none";
    /** unknown. */
    String UNKNOWN = "unknown";
  }

  /**
   * Indicates whether the private dataplane access to the project is blocked, partially_restricted, or allowed.
   */
  public interface InboundPrivate {
    /** blocked. */
    String BLOCKED = "blocked";
    /** partially_restricted. */
    String PARTIALLY_RESTRICTED = "partially_restricted";
    /** allowed. */
    String ALLOWED = "allowed";
    /** unknown. */
    String UNKNOWN = "unknown";
  }

  /**
   * Indicates whether the public dataplane access to the project is blocked or allowed.
   */
  public interface InboundPublic {
    /** blocked. */
    String BLOCKED = "blocked";
    /** allowed. */
    String ALLOWED = "allowed";
    /** unknown. */
    String UNKNOWN = "unknown";
  }

  protected String enforcement;
  @SerializedName("inbound_private")
  protected String inboundPrivate;
  @SerializedName("inbound_public")
  protected String inboundPublic;
  @SerializedName("last_synced_at")
  protected String lastSyncedAt;

  protected EnforcementStatus() { }

  /**
   * Gets the enforcement.
   *
   * Detailed information on the condition of the CBR enforcement.
   *
   * @return the enforcement
   */
  public String getEnforcement() {
    return enforcement;
  }

  /**
   * Gets the inboundPrivate.
   *
   * Indicates whether the private dataplane access to the project is blocked, partially_restricted, or allowed.
   *
   * @return the inboundPrivate
   */
  public String getInboundPrivate() {
    return inboundPrivate;
  }

  /**
   * Gets the inboundPublic.
   *
   * Indicates whether the public dataplane access to the project is blocked or allowed.
   *
   * @return the inboundPublic
   */
  public String getInboundPublic() {
    return inboundPublic;
  }

  /**
   * Gets the lastSyncedAt.
   *
   * Date time information specifying when the last synchronization happened.
   *
   * @return the lastSyncedAt
   */
  public String getLastSyncedAt() {
    return lastSyncedAt;
  }
}

