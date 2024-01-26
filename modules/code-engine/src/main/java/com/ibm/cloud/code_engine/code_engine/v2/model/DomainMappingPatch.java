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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Patch a domain mappings object.
 */
public class DomainMappingPatch extends GenericModel {

  protected ComponentRef component;
  @SerializedName("tls_secret")
  protected String tlsSecret;

  /**
   * Builder.
   */
  public static class Builder {
    private ComponentRef component;
    private String tlsSecret;

    /**
     * Instantiates a new Builder from an existing DomainMappingPatch instance.
     *
     * @param domainMappingPatch the instance to initialize the Builder with
     */
    private Builder(DomainMappingPatch domainMappingPatch) {
      this.component = domainMappingPatch.component;
      this.tlsSecret = domainMappingPatch.tlsSecret;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DomainMappingPatch.
     *
     * @return the new DomainMappingPatch instance
     */
    public DomainMappingPatch build() {
      return new DomainMappingPatch(this);
    }

    /**
     * Set the component.
     *
     * @param component the component
     * @return the DomainMappingPatch builder
     */
    public Builder component(ComponentRef component) {
      this.component = component;
      return this;
    }

    /**
     * Set the tlsSecret.
     *
     * @param tlsSecret the tlsSecret
     * @return the DomainMappingPatch builder
     */
    public Builder tlsSecret(String tlsSecret) {
      this.tlsSecret = tlsSecret;
      return this;
    }
  }

  protected DomainMappingPatch() { }

  protected DomainMappingPatch(Builder builder) {
    component = builder.component;
    tlsSecret = builder.tlsSecret;
  }

  /**
   * New builder.
   *
   * @return a DomainMappingPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the component.
   *
   * A reference to another component.
   *
   * @return the component
   */
  public ComponentRef component() {
    return component;
  }

  /**
   * Gets the tlsSecret.
   *
   * The name of the TLS secret that holds the certificate and private key of this domain mapping.
   *
   * @return the tlsSecret
   */
  public String tlsSecret() {
    return tlsSecret;
  }

  /**
   * Construct a JSON merge-patch from the DomainMappingPatch.
   *
   * Note that properties of the DomainMappingPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the DomainMappingPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

