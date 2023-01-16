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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The projectConfigGet options.
 */
public class ProjectConfigGetOptions extends GenericModel {

  protected String xDelegatedRefreshToken;
  protected String projectGuid;
  protected String endpoint;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDelegatedRefreshToken;
    private String projectGuid;
    private String endpoint;

    /**
     * Instantiates a new Builder from an existing ProjectConfigGetOptions instance.
     *
     * @param projectConfigGetOptions the instance to initialize the Builder with
     */
    private Builder(ProjectConfigGetOptions projectConfigGetOptions) {
      this.xDelegatedRefreshToken = projectConfigGetOptions.xDelegatedRefreshToken;
      this.projectGuid = projectConfigGetOptions.projectGuid;
      this.endpoint = projectConfigGetOptions.endpoint;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param xDelegatedRefreshToken the xDelegatedRefreshToken
     * @param projectGuid the projectGuid
     */
    public Builder(String xDelegatedRefreshToken, String projectGuid) {
      this.xDelegatedRefreshToken = xDelegatedRefreshToken;
      this.projectGuid = projectGuid;
    }

    /**
     * Builds a ProjectConfigGetOptions.
     *
     * @return the new ProjectConfigGetOptions instance
     */
    public ProjectConfigGetOptions build() {
      return new ProjectConfigGetOptions(this);
    }

    /**
     * Set the xDelegatedRefreshToken.
     *
     * @param xDelegatedRefreshToken the xDelegatedRefreshToken
     * @return the ProjectConfigGetOptions builder
     */
    public Builder xDelegatedRefreshToken(String xDelegatedRefreshToken) {
      this.xDelegatedRefreshToken = xDelegatedRefreshToken;
      return this;
    }

    /**
     * Set the projectGuid.
     *
     * @param projectGuid the projectGuid
     * @return the ProjectConfigGetOptions builder
     */
    public Builder projectGuid(String projectGuid) {
      this.projectGuid = projectGuid;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the ProjectConfigGetOptions builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }
  }

  protected ProjectConfigGetOptions() { }

  protected ProjectConfigGetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDelegatedRefreshToken,
      "xDelegatedRefreshToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectGuid,
      "projectGuid cannot be empty");
    xDelegatedRefreshToken = builder.xDelegatedRefreshToken;
    projectGuid = builder.projectGuid;
    endpoint = builder.endpoint;
  }

  /**
   * New builder.
   *
   * @return a ProjectConfigGetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xDelegatedRefreshToken.
   *
   * Delegated Refresh Token.
   *
   * @return the xDelegatedRefreshToken
   */
  public String xDelegatedRefreshToken() {
    return xDelegatedRefreshToken;
  }

  /**
   * Gets the projectGuid.
   *
   * Project GUID.
   *
   * @return the projectGuid
   */
  public String projectGuid() {
    return projectGuid;
  }

  /**
   * Gets the endpoint.
   *
   * Choose whether the URLs within the given project config should point either to public or private network addresses.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }
}

