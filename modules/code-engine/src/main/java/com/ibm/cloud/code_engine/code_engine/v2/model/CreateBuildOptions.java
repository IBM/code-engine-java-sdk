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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createBuild options.
 */
public class CreateBuildOptions extends GenericModel {

  /**
   * The strategy to use for building the image.
   */
  public interface StrategyType {
    /** dockerfile. */
    String DOCKERFILE = "dockerfile";
    /** buildpacks. */
    String BUILDPACKS = "buildpacks";
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

  /**
   * Optional size for the build, which determines the amount of resources used. Build sizes are `small`, `medium`,
   * `large`, `xlarge`, `xxlarge`.
   */
  public interface StrategySize {
    /** small. */
    String SMALL = "small";
    /** medium. */
    String MEDIUM = "medium";
    /** large. */
    String LARGE = "large";
    /** xlarge. */
    String XLARGE = "xlarge";
    /** xxlarge. */
    String XXLARGE = "xxlarge";
  }

  protected String projectId;
  protected String name;
  protected String outputImage;
  protected String outputSecret;
  protected String strategyType;
  protected List<BuildParamPrototype> runBuildParams;
  protected String sourceContextDir;
  protected String sourceRevision;
  protected String sourceSecret;
  protected String sourceType;
  protected String sourceUrl;
  protected String strategySize;
  protected String strategySpecFile;
  protected Long timeout;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private String outputImage;
    private String outputSecret;
    private String strategyType;
    private List<BuildParamPrototype> runBuildParams;
    private String sourceContextDir;
    private String sourceRevision;
    private String sourceSecret;
    private String sourceType;
    private String sourceUrl;
    private String strategySize;
    private String strategySpecFile;
    private Long timeout;

    /**
     * Instantiates a new Builder from an existing CreateBuildOptions instance.
     *
     * @param createBuildOptions the instance to initialize the Builder with
     */
    private Builder(CreateBuildOptions createBuildOptions) {
      this.projectId = createBuildOptions.projectId;
      this.name = createBuildOptions.name;
      this.outputImage = createBuildOptions.outputImage;
      this.outputSecret = createBuildOptions.outputSecret;
      this.strategyType = createBuildOptions.strategyType;
      this.runBuildParams = createBuildOptions.runBuildParams;
      this.sourceContextDir = createBuildOptions.sourceContextDir;
      this.sourceRevision = createBuildOptions.sourceRevision;
      this.sourceSecret = createBuildOptions.sourceSecret;
      this.sourceType = createBuildOptions.sourceType;
      this.sourceUrl = createBuildOptions.sourceUrl;
      this.strategySize = createBuildOptions.strategySize;
      this.strategySpecFile = createBuildOptions.strategySpecFile;
      this.timeout = createBuildOptions.timeout;
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
     * @param outputImage the outputImage
     * @param outputSecret the outputSecret
     * @param strategyType the strategyType
     */
    public Builder(String projectId, String name, String outputImage, String outputSecret, String strategyType) {
      this.projectId = projectId;
      this.name = name;
      this.outputImage = outputImage;
      this.outputSecret = outputSecret;
      this.strategyType = strategyType;
    }

    /**
     * Builds a CreateBuildOptions.
     *
     * @return the new CreateBuildOptions instance
     */
    public CreateBuildOptions build() {
      return new CreateBuildOptions(this);
    }

    /**
     * Adds a new element to runBuildParams.
     *
     * @param runBuildParams the new element to be added
     * @return the CreateBuildOptions builder
     */
    public Builder addRunBuildParams(BuildParamPrototype runBuildParams) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(runBuildParams,
        "runBuildParams cannot be null");
      if (this.runBuildParams == null) {
        this.runBuildParams = new ArrayList<BuildParamPrototype>();
      }
      this.runBuildParams.add(runBuildParams);
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateBuildOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateBuildOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the outputImage.
     *
     * @param outputImage the outputImage
     * @return the CreateBuildOptions builder
     */
    public Builder outputImage(String outputImage) {
      this.outputImage = outputImage;
      return this;
    }

    /**
     * Set the outputSecret.
     *
     * @param outputSecret the outputSecret
     * @return the CreateBuildOptions builder
     */
    public Builder outputSecret(String outputSecret) {
      this.outputSecret = outputSecret;
      return this;
    }

    /**
     * Set the strategyType.
     *
     * @param strategyType the strategyType
     * @return the CreateBuildOptions builder
     */
    public Builder strategyType(String strategyType) {
      this.strategyType = strategyType;
      return this;
    }

    /**
     * Set the runBuildParams.
     * Existing runBuildParams will be replaced.
     *
     * @param runBuildParams the runBuildParams
     * @return the CreateBuildOptions builder
     */
    public Builder runBuildParams(List<BuildParamPrototype> runBuildParams) {
      this.runBuildParams = runBuildParams;
      return this;
    }

    /**
     * Set the sourceContextDir.
     *
     * @param sourceContextDir the sourceContextDir
     * @return the CreateBuildOptions builder
     */
    public Builder sourceContextDir(String sourceContextDir) {
      this.sourceContextDir = sourceContextDir;
      return this;
    }

    /**
     * Set the sourceRevision.
     *
     * @param sourceRevision the sourceRevision
     * @return the CreateBuildOptions builder
     */
    public Builder sourceRevision(String sourceRevision) {
      this.sourceRevision = sourceRevision;
      return this;
    }

    /**
     * Set the sourceSecret.
     *
     * @param sourceSecret the sourceSecret
     * @return the CreateBuildOptions builder
     */
    public Builder sourceSecret(String sourceSecret) {
      this.sourceSecret = sourceSecret;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the CreateBuildOptions builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the sourceUrl.
     *
     * @param sourceUrl the sourceUrl
     * @return the CreateBuildOptions builder
     */
    public Builder sourceUrl(String sourceUrl) {
      this.sourceUrl = sourceUrl;
      return this;
    }

    /**
     * Set the strategySize.
     *
     * @param strategySize the strategySize
     * @return the CreateBuildOptions builder
     */
    public Builder strategySize(String strategySize) {
      this.strategySize = strategySize;
      return this;
    }

    /**
     * Set the strategySpecFile.
     *
     * @param strategySpecFile the strategySpecFile
     * @return the CreateBuildOptions builder
     */
    public Builder strategySpecFile(String strategySpecFile) {
      this.strategySpecFile = strategySpecFile;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the CreateBuildOptions builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }
  }

  protected CreateBuildOptions() { }

  protected CreateBuildOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.outputImage,
      "outputImage cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.outputSecret,
      "outputSecret cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.strategyType,
      "strategyType cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    outputImage = builder.outputImage;
    outputSecret = builder.outputSecret;
    strategyType = builder.strategyType;
    runBuildParams = builder.runBuildParams;
    sourceContextDir = builder.sourceContextDir;
    sourceRevision = builder.sourceRevision;
    sourceSecret = builder.sourceSecret;
    sourceType = builder.sourceType;
    sourceUrl = builder.sourceUrl;
    strategySize = builder.strategySize;
    strategySpecFile = builder.strategySpecFile;
    timeout = builder.timeout;
  }

  /**
   * New builder.
   *
   * @return a CreateBuildOptions builder
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
   * The name of the build. Use a name that is unique within the project.
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
   * Gets the runBuildParams.
   *
   * Optional references to config maps and secret keys, or literal values that are exposed as build arguments within
   * the Docker file.
   *
   * @return the runBuildParams
   */
  public List<BuildParamPrototype> runBuildParams() {
    return runBuildParams;
  }

  /**
   * Gets the sourceContextDir.
   *
   * Optional directory in the repository that contains the buildpacks file or the Dockerfile.
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
   * `large`, `xlarge`, `xxlarge`.
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

