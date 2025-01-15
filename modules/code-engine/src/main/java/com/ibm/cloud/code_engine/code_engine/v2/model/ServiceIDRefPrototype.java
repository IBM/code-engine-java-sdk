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
 * A reference to the Service ID.
 */
public class ServiceIDRefPrototype extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing ServiceIDRefPrototype instance.
     *
     * @param serviceIdRefPrototype the instance to initialize the Builder with
     */
    private Builder(ServiceIDRefPrototype serviceIdRefPrototype) {
      this.id = serviceIdRefPrototype.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceIDRefPrototype.
     *
     * @return the new ServiceIDRefPrototype instance
     */
    public ServiceIDRefPrototype build() {
      return new ServiceIDRefPrototype(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ServiceIDRefPrototype builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected ServiceIDRefPrototype() { }

  protected ServiceIDRefPrototype(Builder builder) {
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a ServiceIDRefPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

