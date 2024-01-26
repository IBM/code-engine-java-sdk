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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties for the IBM Cloud Operator Secret.
 */
public class OperatorSecretProps extends GenericModel {

  @SerializedName("apikey_id")
  protected String apikeyId;
  @SerializedName("resource_group_ids")
  protected List<String> resourceGroupIds;
  protected ServiceIDRef serviceid;
  @SerializedName("user_managed")
  protected Boolean userManaged;

  protected OperatorSecretProps() { }

  /**
   * Gets the apikeyId.
   *
   * The ID of the apikey associated with the operator secret.
   *
   * @return the apikeyId
   */
  public String getApikeyId() {
    return apikeyId;
  }

  /**
   * Gets the resourceGroupIds.
   *
   * The list of resource groups (by ID) that the operator secret can bind services in.
   *
   * @return the resourceGroupIds
   */
  public List<String> getResourceGroupIds() {
    return resourceGroupIds;
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

  /**
   * Gets the userManaged.
   *
   * Specifies whether the operator secret is user managed.
   *
   * @return the userManaged
   */
  public Boolean isUserManaged() {
    return userManaged;
  }
}

