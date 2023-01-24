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
 * The createBuildRun options.
 */
public class CreateBuildRunOptions extends GenericModel {

  /**
   * Optional service account which is used for resource control.
   */
  public interface ServiceAccount {
    /** default. */
    String X_DEFAULT = "default";
    /** manager. */
    String MANAGER = "manager";
    /** reader. */
    String READER = "reader";
    /** writer. */
    String WRITER = "writer";
    /** none. */
    String NONE = "none";
  }

  /**
   * Specifies the type of source to determine if your build source is in a repository or based on local source code.
   * * local - For builds from local source code.
   * * git - For builds from git version controlled source code.
   */
  public interface SourceType {
    /** local. */
    String LOCAL = "local";
    /** git. */
    String GIT = "git";
  }

  protected String projectId;
  protected String buildName;
  protected String name;
  protected String outputImage;
  protected String outputSecret;
  protected String serviceAccount;
  protected String sourceContextDir;
  protected String sourceRevision;
  protected String sourceSecret;
  protected String sourceType;
  protected String sourceUrl;
  protected String strategySize;
  protected String strategySpecFile;
  protected String strategyType;
  protected Long timeout;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String buildName;
    private String name;
    private String outputImage;
    private String outputSecret;
    private String serviceAccount;
    private String sourceContextDir;
    private String sourceRevision;
    private String sourceSecret;
    private String sourceType;
    private String sourceUrl;
    private String strategySize;
    private String strategySpecFile;
    private String strategyType;
    private Long timeout;

    /**
     * Instantiates a new Builder from an existing CreateBuildRunOptions instance.
     *
     * @param createBuildRunOptions the instance to initialize the Builder with
     */
    private Builder(CreateBuildRunOptions createBuildRunOptions) {
      this.projectId = createBuildRunOptions.projectId;
      this.buildName = createBuildRunOptions.buildName;
      this.name = createBuildRunOptions.name;
      this.outputImage = createBuildRunOptions.outputImage;
      this.outputSecret = createBuildRunOptions.outputSecret;
      this.serviceAccount = createBuildRunOptions.serviceAccount;
      this.sourceContextDir = createBuildRunOptions.sourceContextDir;
      this.sourceRevision = createBuildRunOptions.sourceRevision;
      this.sourceSecret = createBuildRunOptions.sourceSecret;
      this.sourceType = createBuildRunOptions.sourceType;
      this.sourceUrl = createBuildRunOptions.sourceUrl;
      this.strategySize = createBuildRunOptions.strategySize;
      this.strategySpecFile = createBuildRunOptions.strategySpecFile;
      this.strategyType = createBuildRunOptions.strategyType;
      this.timeout = createBuildRunOptions.timeout;
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
     * Builds a CreateBuildRunOptions.
     *
     * @return the new CreateBuildRunOptions instance
     */
    public CreateBuildRunOptions build() {
      return new CreateBuildRunOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateBuildRunOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the buildName.
     *
     * @param buildName the buildName
     * @return the CreateBuildRunOptions builder
     */
    public Builder buildName(String buildName) {
      this.buildName = buildName;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateBuildRunOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the outputImage.
     *
     * @param outputImage the outputImage
     * @return the CreateBuildRunOptions builder
     */
    public Builder outputImage(String outputImage) {
      this.outputImage = outputImage;
      return this;
    }

    /**
     * Set the outputSecret.
     *
     * @param outputSecret the outputSecret
     * @return the CreateBuildRunOptions builder
     */
    public Builder outputSecret(String outputSecret) {
      this.outputSecret = outputSecret;
      return this;
    }

    /**
     * Set the serviceAccount.
     *
     * @param serviceAccount the serviceAccount
     * @return the CreateBuildRunOptions builder
     */
    public Builder serviceAccount(String serviceAccount) {
      this.serviceAccount = serviceAccount;
      return this;
    }

    /**
     * Set the sourceContextDir.
     *
     * @param sourceContextDir the sourceContextDir
     * @return the CreateBuildRunOptions builder
     */
    public Builder sourceContextDir(String sourceContextDir) {
      this.sourceContextDir = sourceContextDir;
      return this;
    }

    /**
     * Set the sourceRevision.
     *
     * @param sourceRevision the sourceRevision
     * @return the CreateBuildRunOptions builder
     */
    public Builder sourceRevision(String sourceRevision) {
      this.sourceRevision = sourceRevision;
      return this;
    }

    /**
     * Set the sourceSecret.
     *
     * @param sourceSecret the sourceSecret
     * @return the CreateBuildRunOptions builder
     */
    public Builder sourceSecret(String sourceSecret) {
      this.sourceSecret = sourceSecret;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the CreateBuildRunOptions builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the sourceUrl.
     *
     * @param sourceUrl the sourceUrl
     * @return the CreateBuildRunOptions builder
     */
    public Builder sourceUrl(String sourceUrl) {
      this.sourceUrl = sourceUrl;
      return this;
    }

    /**
     * Set the strategySize.
     *
     * @param strategySize the strategySize
     * @return the CreateBuildRunOptions builder
     */
    public Builder strategySize(String strategySize) {
      this.strategySize = strategySize;
      return this;
    }

    /**
     * Set the strategySpecFile.
     *
     * @param strategySpecFile the strategySpecFile
     * @return the CreateBuildRunOptions builder
     */
    public Builder strategySpecFile(String strategySpecFile) {
      this.strategySpecFile = strategySpecFile;
      return this;
    }

    /**
     * Set the strategyType.
     *
     * @param strategyType the strategyType
     * @return the CreateBuildRunOptions builder
     */
    public Builder strategyType(String strategyType) {
      this.strategyType = strategyType;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the CreateBuildRunOptions builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }
  }

  protected CreateBuildRunOptions() { }

  protected CreateBuildRunOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    projectId = builder.projectId;
    buildName = builder.buildName;
    name = builder.name;
    outputImage = builder.outputImage;
    outputSecret = builder.outputSecret;
    serviceAccount = builder.serviceAccount;
    sourceContextDir = builder.sourceContextDir;
    sourceRevision = builder.sourceRevision;
    sourceSecret = builder.sourceSecret;
    sourceType = builder.sourceType;
    sourceUrl = builder.sourceUrl;
    strategySize = builder.strategySize;
    strategySpecFile = builder.strategySpecFile;
    strategyType = builder.strategyType;
    timeout = builder.timeout;
  }

  /**
   * New builder.
   *
   * @return a CreateBuildRunOptions builder
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
   * Gets the buildName.
   *
   * Optional name of the build on which this build run is based on. If specified, the build run will inherit the
   * configuration of the referenced build. If not specified, make sure to specify at least the fields `strategy_type`,
   * `source_url`, `output_image` and `output_secret` to describe the build run.
   *
   * @return the buildName
   */
  public String buildName() {
    return buildName;
  }

  /**
   * Gets the name.
   *
   * Name of the build run. This field is optional, if the field `build_name` is specified and its value will be
   * generated like so: `[BUILD_NAME]-run-[timestamp with format: YYMMDD-hhmmss] if not set.`.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the outputImage.
   *
   * The name of the image.
   *
   * @return the outputImage
   */
  public String outputImage() {
    return outputImage;
  }

  /**
   * Gets the outputSecret.
   *
   * The secret that is required to access the image registry. Make sure that the secret is granted with push
   * permissions towards the specified container registry namespace.
   *
   * @return the outputSecret
   */
  public String outputSecret() {
    return outputSecret;
  }

  /**
   * Gets the serviceAccount.
   *
   * Optional service account which is used for resource control.
   *
   * @return the serviceAccount
   */
  public String serviceAccount() {
    return serviceAccount;
  }

  /**
   * Gets the sourceContextDir.
   *
   * Option directory in the repository that contains the buildpacks file or the Dockerfile.
   *
   * @return the sourceContextDir
   */
  public String sourceContextDir() {
    return sourceContextDir;
  }

  /**
   * Gets the sourceRevision.
   *
   * Commit, tag, or branch in the source repository to pull. This field is optional if the `source_type` is `git` and
   * uses the HEAD of default branch if not specified. If the `source_type` value is `local`, this field must be
   * omitted.
   *
   * @return the sourceRevision
   */
  public String sourceRevision() {
    return sourceRevision;
  }

  /**
   * Gets the sourceSecret.
   *
   * Name of the secret that is used access the repository source. This field is optional if the `source_type` is `git`.
   * Additionally, if the `source_url` points to a repository that requires authentication, the build will be created
   * but cannot access any source code, until this property is provided, too. If the `source_type` value is `local`,
   * this field must be omitted.
   *
   * @return the sourceSecret
   */
  public String sourceSecret() {
    return sourceSecret;
  }

  /**
   * Gets the sourceType.
   *
   * Specifies the type of source to determine if your build source is in a repository or based on local source code.
   * * local - For builds from local source code.
   * * git - For builds from git version controlled source code.
   *
   * @return the sourceType
   */
  public String sourceType() {
    return sourceType;
  }

  /**
   * Gets the sourceUrl.
   *
   * The URL of the code repository. This field is required if the `source_type` is `git`. If the `source_type` value is
   * `local`, this field must be omitted. If the repository is publicly available you can provide a 'https' URL like
   * `https://github.com/IBM/CodeEngine`. If the repository requires authentication, you need to provide a 'ssh' URL
   * like `git@github.com:IBM/CodeEngine.git` along with a `source_secret` that points to a secret of format `ssh_auth`.
   *
   * @return the sourceUrl
   */
  public String sourceUrl() {
    return sourceUrl;
  }

  /**
   * Gets the strategySize.
   *
   * Optional size for the build, which determines the amount of resources used. Build sizes are `small`, `medium`,
   * `large`, `xlarge`.
   *
   * @return the strategySize
   */
  public String strategySize() {
    return strategySize;
  }

  /**
   * Gets the strategySpecFile.
   *
   * Optional path to the specification file that is used for build strategies for building an image.
   *
   * @return the strategySpecFile
   */
  public String strategySpecFile() {
    return strategySpecFile;
  }

  /**
   * Gets the strategyType.
   *
   * The strategy to use for building the image.
   *
   * @return the strategyType
   */
  public String strategyType() {
    return strategyType;
  }

  /**
   * Gets the timeout.
   *
   * The maximum amount of time, in seconds, that can pass before the build must succeed or fail.
   *
   * @return the timeout
   */
  public Long timeout() {
    return timeout;
  }
}

