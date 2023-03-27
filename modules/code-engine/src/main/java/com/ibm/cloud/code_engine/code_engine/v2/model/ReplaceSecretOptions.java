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
package com.ibm.cloud.code_engine.code_engine.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceSecret options.
 */
public class ReplaceSecretOptions extends GenericModel {

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
    /** tls. */
    String TLS = "tls";
    /** service_access. */
    String SERVICE_ACCESS = "service_access";
    /** registry. */
    String REGISTRY = "registry";
    /** other. */
    String OTHER = "other";
  }

  protected String projectId;
  protected String name;
  protected String ifMatch;
  protected SecretData data;
  protected String format;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private String ifMatch;
    private SecretData data;
    private String format;

    /**
     * Instantiates a new Builder from an existing ReplaceSecretOptions instance.
     *
     * @param replaceSecretOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceSecretOptions replaceSecretOptions) {
      this.projectId = replaceSecretOptions.projectId;
      this.name = replaceSecretOptions.name;
      this.ifMatch = replaceSecretOptions.ifMatch;
      this.data = replaceSecretOptions.data;
      this.format = replaceSecretOptions.format;
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
     * @param name the name
     * @param ifMatch the ifMatch
     */
    public Builder(String projectId, String name, String ifMatch) {
      this.projectId = projectId;
      this.name = name;
      this.ifMatch = ifMatch;
    }

    /**
     * Builds a ReplaceSecretOptions.
     *
     * @return the new ReplaceSecretOptions instance
     */
    public ReplaceSecretOptions build() {
      return new ReplaceSecretOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ReplaceSecretOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceSecretOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the ReplaceSecretOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the ReplaceSecretOptions builder
     */
    public Builder data(SecretData data) {
      this.data = data;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the ReplaceSecretOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }
  }

  protected ReplaceSecretOptions() { }

  protected ReplaceSecretOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    ifMatch = builder.ifMatch;
    data = builder.data;
    format = builder.format;
  }

  /**
   * New builder.
   *
   * @return a ReplaceSecretOptions builder
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
   * Gets the name.
   *
   * The name of your secret.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the ifMatch.
   *
   * Version of the secret settings to be updated. Specify the version that you retrieved as entity_tag (ETag header)
   * when reading the secret. This value helps identifying parallel usage of this API. Pass * to indicate to update any
   * version available. This might result in stale updates.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the data.
   *
   * Data container that allows to specify config parameters and their values as a key-value map. Each key field must
   * consist of alphanumeric characters, `-`, `_` or `.` and must not be exceed a max length of 253 characters. Each
   * value field can consists of any character and must not be exceed a max length of 1048576 characters.
   *
   * @return the data
   */
  public SecretData data() {
    return data;
  }

  /**
   * Gets the format.
   *
   * Specify the format of the secret.
   *
   * @return the format
   */
  public String format() {
    return format;
  }
}

