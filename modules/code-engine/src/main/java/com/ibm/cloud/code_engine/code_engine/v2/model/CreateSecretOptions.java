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
 * The createSecret options.
 */
public class CreateSecretOptions extends GenericModel {

  /**
   * Specify the format of the secret. The format of the secret will determine how the secret is used.
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
  protected String format;
  protected String name;
  protected SecretData data;
  protected ServiceAccessSecretPrototypeProps serviceAccess;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String format;
    private String name;
    private SecretData data;
    private ServiceAccessSecretPrototypeProps serviceAccess;

    /**
     * Instantiates a new Builder from an existing CreateSecretOptions instance.
     *
     * @param createSecretOptions the instance to initialize the Builder with
     */
    private Builder(CreateSecretOptions createSecretOptions) {
      this.projectId = createSecretOptions.projectId;
      this.format = createSecretOptions.format;
      this.name = createSecretOptions.name;
      this.data = createSecretOptions.data;
      this.serviceAccess = createSecretOptions.serviceAccess;
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
     * @param format the format
     * @param name the name
     */
    public Builder(String projectId, String format, String name) {
      this.projectId = projectId;
      this.format = format;
      this.name = name;
    }

    /**
     * Builds a CreateSecretOptions.
     *
     * @return the new CreateSecretOptions instance
     */
    public CreateSecretOptions build() {
      return new CreateSecretOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateSecretOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the CreateSecretOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateSecretOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the CreateSecretOptions builder
     */
    public Builder data(SecretData data) {
      this.data = data;
      return this;
    }

    /**
     * Set the serviceAccess.
     *
     * @param serviceAccess the serviceAccess
     * @return the CreateSecretOptions builder
     */
    public Builder serviceAccess(ServiceAccessSecretPrototypeProps serviceAccess) {
      this.serviceAccess = serviceAccess;
      return this;
    }
  }

  protected CreateSecretOptions() { }

  protected CreateSecretOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.format,
      "format cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    projectId = builder.projectId;
    format = builder.format;
    name = builder.name;
    data = builder.data;
    serviceAccess = builder.serviceAccess;
  }

  /**
   * New builder.
   *
   * @return a CreateSecretOptions builder
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
   * Specify the format of the secret. The format of the secret will determine how the secret is used.
   *
   * @return the format
   */
  public String format() {
    return format;
  }

  /**
   * Gets the name.
   *
   * The name of the secret.
   *
   * @return the name
   */
  public String name() {
    return name;
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
   * Gets the serviceAccess.
   *
   * Properties for Service Access Secret Prototypes.
   *
   * @return the serviceAccess
   */
  public ServiceAccessSecretPrototypeProps serviceAccess() {
    return serviceAccess;
  }
}

