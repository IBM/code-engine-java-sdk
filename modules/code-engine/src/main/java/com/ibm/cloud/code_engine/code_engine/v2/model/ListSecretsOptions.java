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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listSecrets options.
 */
public class ListSecretsOptions extends GenericModel {

  /**
   * Secret format to filter results by.
   */
  public interface Format {
    /** generic. */
    String GENERIC = "generic";
    /** ssh_auth. */
    String SSH_AUTH = "ssh_auth";
    /** registry. */
    String REGISTRY = "registry";
    /** basic_auth. */
    String BASIC_AUTH = "basic_auth";
    /** tls. */
    String TLS = "tls";
    /** service_access. */
    String SERVICE_ACCESS = "service_access";
    /** service_operator. */
    String SERVICE_OPERATOR = "service_operator";
  }

  protected String projectId;
  protected String format;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String format;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListSecretsOptions instance.
     *
     * @param listSecretsOptions the instance to initialize the Builder with
     */
    private Builder(ListSecretsOptions listSecretsOptions) {
      this.projectId = listSecretsOptions.projectId;
      this.format = listSecretsOptions.format;
      this.limit = listSecretsOptions.limit;
      this.start = listSecretsOptions.start;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param projectId the projectId
     */
    public Builder(String projectId) {
      this.projectId = projectId;
    }

    /**
     * Builds a ListSecretsOptions.
     *
     * @return the new ListSecretsOptions instance
     */
    public ListSecretsOptions build() {
      return new ListSecretsOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ListSecretsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the ListSecretsOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSecretsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListSecretsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListSecretsOptions() { }

  protected ListSecretsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    projectId = builder.projectId;
    format = builder.format;
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListSecretsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the format.
   *
   * Secret format to filter results by.
   *
   * @return the format
   */
  public String format() {
    return format;
  }

  /**
   * Gets the limit.
   *
   * Optional maximum number of secrets per page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the start.
   *
   * An optional token that indicates the beginning of the page of results to be returned. If omitted, the first page of
   * results is returned. This value is obtained from the 'start' query parameter in the `next` object of the operation
   * response.
   *
   * @return the start
   */
  public String start() {
    return start;
  }
}

