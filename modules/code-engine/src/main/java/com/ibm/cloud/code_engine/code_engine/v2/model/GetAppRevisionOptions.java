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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getAppRevision options.
 */
public class GetAppRevisionOptions extends GenericModel {

  protected String projectId;
  protected String appName;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String appName;
    private String name;

    /**
     * Instantiates a new Builder from an existing GetAppRevisionOptions instance.
     *
     * @param getAppRevisionOptions the instance to initialize the Builder with
     */
    private Builder(GetAppRevisionOptions getAppRevisionOptions) {
      this.projectId = getAppRevisionOptions.projectId;
      this.appName = getAppRevisionOptions.appName;
      this.name = getAppRevisionOptions.name;
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
     * @param appName the appName
     * @param name the name
     */
    public Builder(String projectId, String appName, String name) {
      this.projectId = projectId;
      this.appName = appName;
      this.name = name;
    }

    /**
     * Builds a GetAppRevisionOptions.
     *
     * @return the new GetAppRevisionOptions instance
     */
    public GetAppRevisionOptions build() {
      return new GetAppRevisionOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the GetAppRevisionOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the appName.
     *
     * @param appName the appName
     * @return the GetAppRevisionOptions builder
     */
    public Builder appName(String appName) {
      this.appName = appName;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GetAppRevisionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected GetAppRevisionOptions() { }

  protected GetAppRevisionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.appName,
      "appName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    projectId = builder.projectId;
    appName = builder.appName;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a GetAppRevisionOptions builder
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
   * Gets the appName.
   *
   * The name of your application.
   *
   * @return the appName
   */
  public String appName() {
    return appName;
  }

  /**
   * Gets the name.
   *
   * The name of your application revision.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

