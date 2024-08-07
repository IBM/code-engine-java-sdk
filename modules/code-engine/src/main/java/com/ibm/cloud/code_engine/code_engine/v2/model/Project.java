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
 * Describes the model of a project.
 */
public class Project extends GenericModel {

  /**
   * The type of the project.
   */
  public interface ResourceType {
    /** project_v2. */
    String PROJECT_V2 = "project_v2";
  }

  /**
   * The current state of the project. For example, when the project is created and is ready for use, the status of the
   * project is active.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
    /** pending_removal. */
    String PENDING_REMOVAL = "pending_removal";
    /** hard_deleting. */
    String HARD_DELETING = "hard_deleting";
    /** hard_deletion_failed. */
    String HARD_DELETION_FAILED = "hard_deletion_failed";
    /** hard_deleted. */
    String HARD_DELETED = "hard_deleted";
    /** deleting. */
    String DELETING = "deleting";
    /** deletion_failed. */
    String DELETION_FAILED = "deletion_failed";
    /** soft_deleted. */
    String SOFT_DELETED = "soft_deleted";
    /** preparing. */
    String PREPARING = "preparing";
    /** creating. */
    String CREATING = "creating";
    /** creation_failed. */
    String CREATION_FAILED = "creation_failed";
  }

  @SerializedName("account_id")
  protected String accountId;
  @SerializedName("created_at")
  protected String createdAt;
  protected String crn;
  protected String href;
  protected String id;
  protected String name;
  protected String region;
  @SerializedName("resource_group_id")
  protected String resourceGroupId;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;

  protected Project() { }

  /**
   * Gets the accountId.
   *
   * An alphanumeric value identifying the account ID.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the createdAt.
   *
   * The timestamp when the project was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN of the project.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * When you provision a new resource, a URL is created identifying the location of the instance.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The ID of the project.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name of the project.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the region.
   *
   * The region for your project deployment. Possible values: 'au-syd', 'br-sao', 'ca-tor', 'eu-de', 'eu-gb', 'jp-osa',
   * 'jp-tok', 'us-east', 'us-south'.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the resourceGroupId.
   *
   * The ID of the resource group.
   *
   * @return the resourceGroupId
   */
  public String getResourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the resourceType.
   *
   * The type of the project.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the status.
   *
   * The current state of the project. For example, when the project is created and is ready for use, the status of the
   * project is active.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

