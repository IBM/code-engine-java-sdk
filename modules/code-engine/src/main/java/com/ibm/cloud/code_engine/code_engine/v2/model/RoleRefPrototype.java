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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A reference to the Role and Role CRN for service binding.
 */
public class RoleRefPrototype extends GenericModel {

  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    /**
     * Instantiates a new Builder from an existing RoleRefPrototype instance.
     *
     * @param roleRefPrototype the instance to initialize the Builder with
     */
    private Builder(RoleRefPrototype roleRefPrototype) {
      this.crn = roleRefPrototype.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RoleRefPrototype.
     *
     * @return the new RoleRefPrototype instance
     */
    public RoleRefPrototype build() {
      return new RoleRefPrototype(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the RoleRefPrototype builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected RoleRefPrototype() { }

  protected RoleRefPrototype(Builder builder) {
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a RoleRefPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * CRN of the IAM Role for this service access secret.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

