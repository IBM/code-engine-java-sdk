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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties for Service Access Secret Prototypes.
 */
public class ServiceAccessSecretPrototypeProps extends GenericModel {

  @SerializedName("resource_key")
  protected ResourceKeyRefPrototype resourceKey;
  protected RoleRefPrototype role;
  @SerializedName("service_instance")
  protected ServiceInstanceRefPrototype serviceInstance;
  protected ServiceIDRef serviceid;

  /**
   * Builder.
   */
  public static class Builder {
    private ResourceKeyRefPrototype resourceKey;
    private RoleRefPrototype role;
    private ServiceInstanceRefPrototype serviceInstance;
    private ServiceIDRef serviceid;

    /**
     * Instantiates a new Builder from an existing ServiceAccessSecretPrototypeProps instance.
     *
     * @param serviceAccessSecretPrototypeProps the instance to initialize the Builder with
     */
    private Builder(ServiceAccessSecretPrototypeProps serviceAccessSecretPrototypeProps) {
      this.resourceKey = serviceAccessSecretPrototypeProps.resourceKey;
      this.role = serviceAccessSecretPrototypeProps.role;
      this.serviceInstance = serviceAccessSecretPrototypeProps.serviceInstance;
      this.serviceid = serviceAccessSecretPrototypeProps.serviceid;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param resourceKey the resourceKey
     * @param serviceInstance the serviceInstance
     */
    public Builder(ResourceKeyRefPrototype resourceKey, ServiceInstanceRefPrototype serviceInstance) {
      this.resourceKey = resourceKey;
      this.serviceInstance = serviceInstance;
    }

    /**
     * Builds a ServiceAccessSecretPrototypeProps.
     *
     * @return the new ServiceAccessSecretPrototypeProps instance
     */
    public ServiceAccessSecretPrototypeProps build() {
      return new ServiceAccessSecretPrototypeProps(this);
    }

    /**
     * Set the resourceKey.
     *
     * @param resourceKey the resourceKey
     * @return the ServiceAccessSecretPrototypeProps builder
     */
    public Builder resourceKey(ResourceKeyRefPrototype resourceKey) {
      this.resourceKey = resourceKey;
      return this;
    }

    /**
     * Set the role.
     *
     * @param role the role
     * @return the ServiceAccessSecretPrototypeProps builder
     */
    public Builder role(RoleRefPrototype role) {
      this.role = role;
      return this;
    }

    /**
     * Set the serviceInstance.
     *
     * @param serviceInstance the serviceInstance
     * @return the ServiceAccessSecretPrototypeProps builder
     */
    public Builder serviceInstance(ServiceInstanceRefPrototype serviceInstance) {
      this.serviceInstance = serviceInstance;
      return this;
    }

    /**
     * Set the serviceid.
     *
     * @param serviceid the serviceid
     * @return the ServiceAccessSecretPrototypeProps builder
     */
    public Builder serviceid(ServiceIDRef serviceid) {
      this.serviceid = serviceid;
      return this;
    }
  }

  protected ServiceAccessSecretPrototypeProps() { }

  protected ServiceAccessSecretPrototypeProps(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceKey,
      "resourceKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.serviceInstance,
      "serviceInstance cannot be null");
    resourceKey = builder.resourceKey;
    role = builder.role;
    serviceInstance = builder.serviceInstance;
    serviceid = builder.serviceid;
  }

  /**
   * New builder.
   *
   * @return a ServiceAccessSecretPrototypeProps builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourceKey.
   *
   * The service credential associated with the secret.
   *
   * @return the resourceKey
   */
  public ResourceKeyRefPrototype resourceKey() {
    return resourceKey;
  }

  /**
   * Gets the role.
   *
   * A reference to the Role and Role CRN for service binding.
   *
   * @return the role
   */
  public RoleRefPrototype role() {
    return role;
  }

  /**
   * Gets the serviceInstance.
   *
   * The IBM Cloud service instance associated with the secret.
   *
   * @return the serviceInstance
   */
  public ServiceInstanceRefPrototype serviceInstance() {
    return serviceInstance;
  }

  /**
   * Gets the serviceid.
   *
   * A reference to a Service ID.
   *
   * @return the serviceid
   */
  public ServiceIDRef serviceid() {
    return serviceid;
  }
}

