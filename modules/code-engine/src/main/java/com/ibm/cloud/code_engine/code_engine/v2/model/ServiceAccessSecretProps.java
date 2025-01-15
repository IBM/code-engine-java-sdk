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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties for Service Access Secrets.
 */
public class ServiceAccessSecretProps extends GenericModel {

  @SerializedName("resource_key")
  protected ResourceKeyRef resourceKey;
  protected RoleRef role;
  @SerializedName("service_instance")
  protected ServiceInstanceRef serviceInstance;
  protected ServiceIDRef serviceid;

  protected ServiceAccessSecretProps() { }

  /**
   * Gets the resourceKey.
   *
   * The service credential associated with the secret.
   *
   * @return the resourceKey
   */
  public ResourceKeyRef getResourceKey() {
    return resourceKey;
  }

  /**
   * Gets the role.
   *
   * A reference to the Role and Role CRN for service binding.
   *
   * @return the role
   */
  public RoleRef getRole() {
    return role;
  }

  /**
   * Gets the serviceInstance.
   *
   * The IBM Cloud service instance associated with the secret.
   *
   * @return the serviceInstance
   */
  public ServiceInstanceRef getServiceInstance() {
    return serviceInstance;
  }

  /**
   * Gets the serviceid.
   *
   * A reference to a Service ID.
   *
   * @return the serviceid
   */
  public ServiceIDRef getServiceid() {
    return serviceid;
  }
}

