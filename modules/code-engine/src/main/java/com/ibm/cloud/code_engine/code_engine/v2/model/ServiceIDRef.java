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
 * A reference to a Service ID.
 */
public class ServiceIDRef extends GenericModel {

  protected String crn;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String id;

    /**
     * Instantiates a new Builder from an existing ServiceIDRef instance.
     *
     * @param serviceIdRef the instance to initialize the Builder with
     */
    private Builder(ServiceIDRef serviceIdRef) {
      this.crn = serviceIdRef.crn;
      this.id = serviceIdRef.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceIDRef.
     *
     * @return the new ServiceIDRef instance
     */
    public ServiceIDRef build() {
      return new ServiceIDRef(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ServiceIDRef builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ServiceIDRef builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected ServiceIDRef() { }

  protected ServiceIDRef(Builder builder) {
    crn = builder.crn;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a ServiceIDRef builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * CRN value of a Service ID.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the id.
   *
   * The ID of the Service ID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

