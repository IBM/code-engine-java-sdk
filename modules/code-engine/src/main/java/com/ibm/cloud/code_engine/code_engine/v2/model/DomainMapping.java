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
 * Response model for domain mapping definitions.
 */
public class DomainMapping extends GenericModel {

  /**
   * The type of the CE Resource.
   */
  public interface ResourceType {
    /** domain_mapping_v2. */
    String DOMAIN_MAPPING_V2 = "domain_mapping_v2";
  }

  /**
   * The current status of the domain mapping.
   */
  public interface Status {
    /** ready. */
    String READY = "ready";
    /** failed. */
    String FAILED = "failed";
    /** deploying. */
    String DEPLOYING = "deploying";
  }

  /**
   * Exposes whether the domain mapping is reachable through the public internet, or private IBM network, or only
   * through other components within the same Code Engine project.
   */
  public interface Visibility {
    /** custom. */
    String CUSTOM = "custom";
    /** private. */
    String X_PRIVATE = "private";
    /** project. */
    String PROJECT = "project";
    /** public. */
    String X_PUBLIC = "public";
  }

  @SerializedName("cname_target")
  protected String cnameTarget;
  protected ComponentRef component;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("entity_tag")
  protected String entityTag;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("project_id")
  protected String projectId;
  protected String region;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  @SerializedName("status_details")
  protected DomainMappingStatus statusDetails;
  @SerializedName("tls_secret")
  protected String tlsSecret;
  @SerializedName("user_managed")
  protected Boolean userManaged;
  protected String visibility;

  protected DomainMapping() { }

  /**
   * Gets the cnameTarget.
   *
   * Exposes the value of the CNAME record that needs to be configured in the DNS settings of the domain, to route
   * traffic properly to the target Code Engine region.
   *
   * @return the cnameTarget
   */
  public String getCnameTarget() {
    return cnameTarget;
  }

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
   * Gets the createdAt.
   *
   * The timestamp when the resource was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the entityTag.
   *
   * The version of the domain mapping instance, which is used to achieve optimistic locking.
   *
   * @return the entityTag
   */
  public String getEntityTag() {
    return entityTag;
  }

  /**
   * Gets the href.
   *
   * When you provision a new domain mapping, a URL is created identifying the location of the instance.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The identifier of the resource.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name of the domain mapping.
   *
   * @return the name
   */
  public String getName() {
    return name;
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
   * Gets the region.
   *
   * The region of the project the resource is located in. Possible values: 'au-syd', 'br-sao', 'ca-tor', 'eu-de',
   * 'eu-gb', 'jp-osa', 'jp-tok', 'us-east', 'us-south'.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the resourceType.
   *
   * The type of the CE Resource.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the status.
   *
   * The current status of the domain mapping.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusDetails.
   *
   * The detailed status of the domain mapping.
   *
   * @return the statusDetails
   */
  public DomainMappingStatus getStatusDetails() {
    return statusDetails;
  }

  /**
   * Gets the tlsSecret.
   *
   * The name of the TLS secret that holds the certificate and private key of this domain mapping.
   *
   * @return the tlsSecret
   */
  public String getTlsSecret() {
    return tlsSecret;
  }

  /**
   * Gets the userManaged.
   *
   * Exposes whether the domain mapping is managed by the user or by Code Engine.
   *
   * @return the userManaged
   */
  public Boolean isUserManaged() {
    return userManaged;
  }

  /**
   * Gets the visibility.
   *
   * Exposes whether the domain mapping is reachable through the public internet, or private IBM network, or only
   * through other components within the same Code Engine project.
   *
   * @return the visibility
   */
  public String getVisibility() {
    return visibility;
  }
}

