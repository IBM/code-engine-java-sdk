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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Patch a build object.
 */
public class BuildPatch extends GenericModel {

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

  @SerializedName("output_image")
  protected String outputImage;
  @SerializedName("output_secret")
  protected String outputSecret;
  @SerializedName("source_context_dir")
  protected String sourceContextDir;
  @SerializedName("source_revision")
  protected String sourceRevision;
  @SerializedName("source_secret")
  protected String sourceSecret;
  @SerializedName("source_type")
  protected String sourceType;
  @SerializedName("source_url")
  protected String sourceUrl;
  @SerializedName("strategy_size")
  protected String strategySize;
  @SerializedName("strategy_spec_file")
  protected String strategySpecFile;
  @SerializedName("strategy_type")
  protected String strategyType;
  protected Long timeout;

  /**
   * Builder.
   */
  public static class Builder {
    private String outputImage;
    private String outputSecret;
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
     * Instantiates a new Builder from an existing BuildPatch instance.
     *
     * @param buildPatch the instance to initialize the Builder with
     */
    private Builder(BuildPatch buildPatch) {
      this.outputImage = buildPatch.outputImage;
      this.outputSecret = buildPatch.outputSecret;
      this.sourceContextDir = buildPatch.sourceContextDir;
      this.sourceRevision = buildPatch.sourceRevision;
      this.sourceSecret = buildPatch.sourceSecret;
      this.sourceType = buildPatch.sourceType;
      this.sourceUrl = buildPatch.sourceUrl;
      this.strategySize = buildPatch.strategySize;
      this.strategySpecFile = buildPatch.strategySpecFile;
      this.strategyType = buildPatch.strategyType;
      this.timeout = buildPatch.timeout;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BuildPatch.
     *
     * @return the new BuildPatch instance
     */
    public BuildPatch build() {
      return new BuildPatch(this);
    }

    /**
     * Set the outputImage.
     *
     * @param outputImage the outputImage
     * @return the BuildPatch builder
     */
    public Builder outputImage(String outputImage) {
      this.outputImage = outputImage;
      return this;
    }

    /**
     * Set the outputSecret.
     *
     * @param outputSecret the outputSecret
     * @return the BuildPatch builder
     */
    public Builder outputSecret(String outputSecret) {
      this.outputSecret = outputSecret;
      return this;
    }

    /**
     * Set the sourceContextDir.
     *
     * @param sourceContextDir the sourceContextDir
     * @return the BuildPatch builder
     */
    public Builder sourceContextDir(String sourceContextDir) {
      this.sourceContextDir = sourceContextDir;
      return this;
    }

    /**
     * Set the sourceRevision.
     *
     * @param sourceRevision the sourceRevision
     * @return the BuildPatch builder
     */
    public Builder sourceRevision(String sourceRevision) {
      this.sourceRevision = sourceRevision;
      return this;
    }

    /**
     * Set the sourceSecret.
     *
     * @param sourceSecret the sourceSecret
     * @return the BuildPatch builder
     */
    public Builder sourceSecret(String sourceSecret) {
      this.sourceSecret = sourceSecret;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the BuildPatch builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the sourceUrl.
     *
     * @param sourceUrl the sourceUrl
     * @return the BuildPatch builder
     */
    public Builder sourceUrl(String sourceUrl) {
      this.sourceUrl = sourceUrl;
      return this;
    }

    /**
     * Set the strategySize.
     *
     * @param strategySize the strategySize
     * @return the BuildPatch builder
     */
    public Builder strategySize(String strategySize) {
      this.strategySize = strategySize;
      return this;
    }

    /**
     * Set the strategySpecFile.
     *
     * @param strategySpecFile the strategySpecFile
     * @return the BuildPatch builder
     */
    public Builder strategySpecFile(String strategySpecFile) {
      this.strategySpecFile = strategySpecFile;
      return this;
    }

    /**
     * Set the strategyType.
     *
     * @param strategyType the strategyType
     * @return the BuildPatch builder
     */
    public Builder strategyType(String strategyType) {
      this.strategyType = strategyType;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the BuildPatch builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }
  }

  protected BuildPatch() { }

  protected BuildPatch(Builder builder) {
    outputImage = builder.outputImage;
    outputSecret = builder.outputSecret;
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
   * @return a BuildPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Construct a JSON merge-patch from the BuildPatch.
   *
   * Note that properties of the BuildPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the BuildPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

