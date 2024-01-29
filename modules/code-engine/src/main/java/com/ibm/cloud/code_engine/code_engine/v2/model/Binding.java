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
 * Describes the model of a binding.
 */
public class Binding extends GenericModel {

  /**
   * The type of the binding.
   */
  public interface ResourceType {
    /** binding_v2. */
    String BINDING_V2 = "binding_v2";
  }

  protected ComponentRef component;
  protected String href;
  protected String id;
  protected String prefix;
  @SerializedName("project_id")
  protected String projectId;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("secret_name")
  protected String secretName;
  protected String status;

  protected Binding() { }

  /**
   * Gets the component.
   *
   * A reference to another component.
   *
   * @return the component
   */
  public ComponentRef getComponent() {
    return component;
  }

  /**
   * Gets the href.
   *
   * When you provision a new binding,  a URL is created identifying the location of the instance.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The ID of the binding.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the prefix.
   *
   * The value that is set as prefix in the component that is bound.
   *
   * @return the prefix
   */
  public String getPrefix() {
    return prefix;
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project the resource is located in.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the resourceType.
   *
   * The type of the binding.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the secretName.
   *
   * The service access secret that is bound to a component.
   *
   * @return the secretName
   */
  public String getSecretName() {
    return secretName;
  }

  /**
   * Gets the status.
   *
   * The current status of the binding.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

