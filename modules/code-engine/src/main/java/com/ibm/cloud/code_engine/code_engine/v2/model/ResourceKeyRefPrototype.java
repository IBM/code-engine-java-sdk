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
 * The service credential associated with the secret.
 */
public class ResourceKeyRefPrototype extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing ResourceKeyRefPrototype instance.
     *
     * @param resourceKeyRefPrototype the instance to initialize the Builder with
     */
    private Builder(ResourceKeyRefPrototype resourceKeyRefPrototype) {
      this.id = resourceKeyRefPrototype.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResourceKeyRefPrototype.
     *
     * @return the new ResourceKeyRefPrototype instance
     */
    public ResourceKeyRefPrototype build() {
      return new ResourceKeyRefPrototype(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ResourceKeyRefPrototype builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected ResourceKeyRefPrototype() { }

  protected ResourceKeyRefPrototype(Builder builder) {
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a ResourceKeyRefPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * ID of the service credential associated with the secret.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

