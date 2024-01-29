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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties for the IBM Cloud Operator Secret Prototype.
 */
public class OperatorSecretPrototypeProps extends GenericModel {

  @SerializedName("resource_group_ids")
  protected List<String> resourceGroupIds;
  protected ServiceIDRefPrototype serviceid;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> resourceGroupIds;
    private ServiceIDRefPrototype serviceid;

    /**
     * Instantiates a new Builder from an existing OperatorSecretPrototypeProps instance.
     *
     * @param operatorSecretPrototypeProps the instance to initialize the Builder with
     */
    private Builder(OperatorSecretPrototypeProps operatorSecretPrototypeProps) {
      this.resourceGroupIds = operatorSecretPrototypeProps.resourceGroupIds;
      this.serviceid = operatorSecretPrototypeProps.serviceid;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a OperatorSecretPrototypeProps.
     *
     * @return the new OperatorSecretPrototypeProps instance
     */
    public OperatorSecretPrototypeProps build() {
      return new OperatorSecretPrototypeProps(this);
    }

    /**
     * Adds an resourceGroupIds to resourceGroupIds.
     *
     * @param resourceGroupIds the new resourceGroupIds
     * @return the OperatorSecretPrototypeProps builder
     */
    public Builder addResourceGroupIds(String resourceGroupIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resourceGroupIds,
        "resourceGroupIds cannot be null");
      if (this.resourceGroupIds == null) {
        this.resourceGroupIds = new ArrayList<String>();
      }
      this.resourceGroupIds.add(resourceGroupIds);
      return this;
    }

    /**
     * Set the resourceGroupIds.
     * Existing resourceGroupIds will be replaced.
     *
     * @param resourceGroupIds the resourceGroupIds
     * @return the OperatorSecretPrototypeProps builder
     */
    public Builder resourceGroupIds(List<String> resourceGroupIds) {
      this.resourceGroupIds = resourceGroupIds;
      return this;
    }

    /**
     * Set the serviceid.
     *
     * @param serviceid the serviceid
     * @return the OperatorSecretPrototypeProps builder
     */
    public Builder serviceid(ServiceIDRefPrototype serviceid) {
      this.serviceid = serviceid;
      return this;
    }
  }

  protected OperatorSecretPrototypeProps() { }

  protected OperatorSecretPrototypeProps(Builder builder) {
    resourceGroupIds = builder.resourceGroupIds;
    serviceid = builder.serviceid;
  }

  /**
   * New builder.
   *
   * @return a OperatorSecretPrototypeProps builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourceGroupIds.
   *
   * The list of resource groups (by ID) that the operator secret can bind services in.
   *
   * @return the resourceGroupIds
   */
  public List<String> resourceGroupIds() {
    return resourceGroupIds;
  }

  /**
   * Gets the serviceid.
   *
   * A reference to the Service ID.
   *
   * @return the serviceid
   */
  public ServiceIDRefPrototype serviceid() {
    return serviceid;
  }
}

