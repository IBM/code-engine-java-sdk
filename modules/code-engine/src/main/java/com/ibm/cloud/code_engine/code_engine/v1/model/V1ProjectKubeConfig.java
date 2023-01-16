/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.code_engine.code_engine.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * V1ProjectKubeConfig.
 */
public class V1ProjectKubeConfig extends GenericModel {

  protected String apiVersion;
  protected List<V1ClusterRef> clusters;
  protected List<V1ContextRef> contexts;
  @SerializedName("current-context")
  protected String currentContext;
  protected String kind;
  protected List<V1AuthInfoRef> users;

  protected V1ProjectKubeConfig() { }

  /**
   * Gets the apiVersion.
   *
   * @return the apiVersion
   */
  public String getApiVersion() {
    return apiVersion;
  }

  /**
   * Gets the clusters.
   *
   * @return the clusters
   */
  public List<V1ClusterRef> getClusters() {
    return clusters;
  }

  /**
   * Gets the contexts.
   *
   * @return the contexts
   */
  public List<V1ContextRef> getContexts() {
    return contexts;
  }

  /**
   * Gets the currentContext.
   *
   * @return the currentContext
   */
  public String getCurrentContext() {
    return currentContext;
  }

  /**
   * Gets the kind.
   *
   * @return the kind
   */
  public String getKind() {
    return kind;
  }

  /**
   * Gets the users.
   *
   * @return the users
   */
  public List<V1AuthInfoRef> getUsers() {
    return users;
  }
}

