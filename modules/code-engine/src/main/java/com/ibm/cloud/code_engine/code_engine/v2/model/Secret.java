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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Describes the model of a secret.
 */
public class Secret extends GenericModel {

  /**
   * Specify the format of the secret.
   */
  public interface Format {
    /** generic. */
    String GENERIC = "generic";
    /** ssh_auth. */
    String SSH_AUTH = "ssh_auth";
    /** basic_auth. */
    String BASIC_AUTH = "basic_auth";
    /** hmac_auth. */
    String HMAC_AUTH = "hmac_auth";
    /** tls. */
    String TLS = "tls";
    /** service_access. */
    String SERVICE_ACCESS = "service_access";
    /** registry. */
    String REGISTRY = "registry";
    /** service_operator. */
    String SERVICE_OPERATOR = "service_operator";
    /** other. */
    String OTHER = "other";
  }

  /**
   * Specifies whether the secret is user generated.
   */
  public interface GeneratedBy {
    /** user. */
    String USER = "user";
    /** system. */
    String SYSTEM = "system";
  }

  /**
   * The type of the secret.
   */
  public interface ResourceType {
    /** secret_v2. */
    String SECRET_V2 = "secret_v2";
    /** secret_auth_ssh_v2. */
    String SECRET_AUTH_SSH_V2 = "secret_auth_ssh_v2";
    /** secret_basic_auth_v2. */
    String SECRET_BASIC_AUTH_V2 = "secret_basic_auth_v2";
    /** secret_generic_v2. */
    String SECRET_GENERIC_V2 = "secret_generic_v2";
    /** secret_operator_v2. */
    String SECRET_OPERATOR_V2 = "secret_operator_v2";
    /** secret_other_v2. */
    String SECRET_OTHER_V2 = "secret_other_v2";
    /** secret_registry_v2. */
    String SECRET_REGISTRY_V2 = "secret_registry_v2";
    /** secret_service_access_v2. */
    String SECRET_SERVICE_ACCESS_V2 = "secret_service_access_v2";
    /** secret_tls_v2. */
    String SECRET_TLS_V2 = "secret_tls_v2";
    /** secret_hmac_auth_v2. */
    String SECRET_HMAC_AUTH_V2 = "secret_hmac_auth_v2";
  }

  @SerializedName("created_at")
  protected String createdAt;
  protected Map<String, String> data;
  @SerializedName("entity_tag")
  protected String entityTag;
  protected String format;
  @SerializedName("generated_by")
  protected String generatedBy;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("project_id")
  protected String projectId;
  protected String region;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("service_access")
  protected ServiceAccessSecretProps serviceAccess;
  @SerializedName("service_operator")
  protected OperatorSecretProps serviceOperator;

  protected Secret() { }

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
   * Gets the data.
   *
   * Data container that allows to specify config parameters and their values as a key-value map. Each key field must
   * consist of alphanumeric characters, `-`, `_` or `.` and must not exceed a max length of 253 characters. Each value
   * field can consists of any character and must not exceed a max length of 1048576 characters.
   *
   * @return the data
   */
  public Map<String, String> getData() {
    return data;
  }

  /**
   * Gets the entityTag.
   *
   * The version of the secret instance, which is used to achieve optimistic locking.
   *
   * @return the entityTag
   */
  public String getEntityTag() {
    return entityTag;
  }

  /**
   * Gets the format.
   *
   * Specify the format of the secret.
   *
   * @return the format
   */
  public String getFormat() {
    return format;
  }

  /**
   * Gets the generatedBy.
   *
   * Specifies whether the secret is user generated.
   *
   * @return the generatedBy
   */
  public String getGeneratedBy() {
    return generatedBy;
  }

  /**
   * Gets the href.
   *
   * When you provision a new secret,  a URL is created identifying the location of the instance.
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
   * The name of the secret.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project in which the resource is located.
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
   * The type of the secret.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the serviceAccess.
   *
   * Properties for Service Access Secrets.
   *
   * @return the serviceAccess
   */
  public ServiceAccessSecretProps getServiceAccess() {
    return serviceAccess;
  }

  /**
   * Gets the serviceOperator.
   *
   * Properties for the IBM Cloud Operator Secret.
   *
   * @return the serviceOperator
   */
  public OperatorSecretProps getServiceOperator() {
    return serviceOperator;
  }
}

