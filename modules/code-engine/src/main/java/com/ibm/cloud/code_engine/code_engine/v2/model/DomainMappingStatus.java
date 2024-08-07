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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The detailed status of the domain mapping.
 */
public class DomainMappingStatus extends GenericModel {

  /**
   * Optional information to provide more context in case of a 'failed' or 'warning' status.
   */
  public interface Reason {
    /** ready. */
    String READY = "ready";
    /** domain_already_claimed. */
    String DOMAIN_ALREADY_CLAIMED = "domain_already_claimed";
    /** app_ref_failed. */
    String APP_REF_FAILED = "app_ref_failed";
    /** failed_reconcile_ingress. */
    String FAILED_RECONCILE_INGRESS = "failed_reconcile_ingress";
    /** deploying. */
    String DEPLOYING = "deploying";
    /** failed. */
    String FAILED = "failed";
  }

  protected String reason;

  protected DomainMappingStatus() { }

  /**
   * Gets the reason.
   *
   * Optional information to provide more context in case of a 'failed' or 'warning' status.
   *
   * @return the reason
   */
  public String getReason() {
    return reason;
  }
}

