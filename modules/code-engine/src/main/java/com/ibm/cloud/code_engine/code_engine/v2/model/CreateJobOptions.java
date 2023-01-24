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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createJob options.
 */
public class CreateJobOptions extends GenericModel {

  /**
   * The mode for runs of the job. Valid values are `task` and `daemon`. In `task` mode, the `max_execution_time` and
   * `retry_limit` options apply. In `daemon` mode, since there is no timeout and failed instances are restarted
   * indefinitely, the `max_execution_time` and `retry_limit` options are not allowed.
   */
  public interface RunMode {
    /** task. */
    String TASK = "task";
    /** daemon. */
    String DAEMON = "daemon";
  }

  /**
   * The name of the service account. For built-in service accounts, you can use the shortened names `manager`, `none`,
   * `reader`, and `writer`.
   */
  public interface RunServiceAccount {
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

  protected String projectId;
  protected String imageReference;
  protected String name;
  protected String imageSecret;
  protected List<String> runArguments;
  protected Long runAsUser;
  protected List<String> runCommands;
  protected List<EnvVarPrototype> runEnvVariables;
  protected String runMode;
  protected String runServiceAccount;
  protected List<VolumeMountPrototype> runVolumeMounts;
  protected String scaleArraySpec;
  protected String scaleCpuLimit;
  protected String scaleEphemeralStorageLimit;
  protected Long scaleMaxExecutionTime;
  protected String scaleMemoryLimit;
  protected Long scaleRetryLimit;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String imageReference;
    private String name;
    private String imageSecret;
    private List<String> runArguments;
    private Long runAsUser;
    private List<String> runCommands;
    private List<EnvVarPrototype> runEnvVariables;
    private String runMode;
    private String runServiceAccount;
    private List<VolumeMountPrototype> runVolumeMounts;
    private String scaleArraySpec;
    private String scaleCpuLimit;
    private String scaleEphemeralStorageLimit;
    private Long scaleMaxExecutionTime;
    private String scaleMemoryLimit;
    private Long scaleRetryLimit;

    /**
     * Instantiates a new Builder from an existing CreateJobOptions instance.
     *
     * @param createJobOptions the instance to initialize the Builder with
     */
    private Builder(CreateJobOptions createJobOptions) {
      this.projectId = createJobOptions.projectId;
      this.imageReference = createJobOptions.imageReference;
      this.name = createJobOptions.name;
      this.imageSecret = createJobOptions.imageSecret;
      this.runArguments = createJobOptions.runArguments;
      this.runAsUser = createJobOptions.runAsUser;
      this.runCommands = createJobOptions.runCommands;
      this.runEnvVariables = createJobOptions.runEnvVariables;
      this.runMode = createJobOptions.runMode;
      this.runServiceAccount = createJobOptions.runServiceAccount;
      this.runVolumeMounts = createJobOptions.runVolumeMounts;
      this.scaleArraySpec = createJobOptions.scaleArraySpec;
      this.scaleCpuLimit = createJobOptions.scaleCpuLimit;
      this.scaleEphemeralStorageLimit = createJobOptions.scaleEphemeralStorageLimit;
      this.scaleMaxExecutionTime = createJobOptions.scaleMaxExecutionTime;
      this.scaleMemoryLimit = createJobOptions.scaleMemoryLimit;
      this.scaleRetryLimit = createJobOptions.scaleRetryLimit;
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
     * @param imageReference the imageReference
     * @param name the name
     */
    public Builder(String projectId, String imageReference, String name) {
      this.projectId = projectId;
      this.imageReference = imageReference;
      this.name = name;
    }

    /**
     * Builds a CreateJobOptions.
     *
     * @return the new CreateJobOptions instance
     */
    public CreateJobOptions build() {
      return new CreateJobOptions(this);
    }

    /**
     * Adds an runArguments to runArguments.
     *
     * @param runArguments the new runArguments
     * @return the CreateJobOptions builder
     */
    public Builder addRunArguments(String runArguments) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(runArguments,
        "runArguments cannot be null");
      if (this.runArguments == null) {
        this.runArguments = new ArrayList<String>();
      }
      this.runArguments.add(runArguments);
      return this;
    }

    /**
     * Adds an runCommands to runCommands.
     *
     * @param runCommands the new runCommands
     * @return the CreateJobOptions builder
     */
    public Builder addRunCommands(String runCommands) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(runCommands,
        "runCommands cannot be null");
      if (this.runCommands == null) {
        this.runCommands = new ArrayList<String>();
      }
      this.runCommands.add(runCommands);
      return this;
    }

    /**
     * Adds an runEnvVariables to runEnvVariables.
     *
     * @param runEnvVariables the new runEnvVariables
     * @return the CreateJobOptions builder
     */
    public Builder addRunEnvVariables(EnvVarPrototype runEnvVariables) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(runEnvVariables,
        "runEnvVariables cannot be null");
      if (this.runEnvVariables == null) {
        this.runEnvVariables = new ArrayList<EnvVarPrototype>();
      }
      this.runEnvVariables.add(runEnvVariables);
      return this;
    }

    /**
     * Adds an runVolumeMounts to runVolumeMounts.
     *
     * @param runVolumeMounts the new runVolumeMounts
     * @return the CreateJobOptions builder
     */
    public Builder addRunVolumeMounts(VolumeMountPrototype runVolumeMounts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(runVolumeMounts,
        "runVolumeMounts cannot be null");
      if (this.runVolumeMounts == null) {
        this.runVolumeMounts = new ArrayList<VolumeMountPrototype>();
      }
      this.runVolumeMounts.add(runVolumeMounts);
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateJobOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the imageReference.
     *
     * @param imageReference the imageReference
     * @return the CreateJobOptions builder
     */
    public Builder imageReference(String imageReference) {
      this.imageReference = imageReference;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateJobOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the imageSecret.
     *
     * @param imageSecret the imageSecret
     * @return the CreateJobOptions builder
     */
    public Builder imageSecret(String imageSecret) {
      this.imageSecret = imageSecret;
      return this;
    }

    /**
     * Set the runArguments.
     * Existing runArguments will be replaced.
     *
     * @param runArguments the runArguments
     * @return the CreateJobOptions builder
     */
    public Builder runArguments(List<String> runArguments) {
      this.runArguments = runArguments;
      return this;
    }

    /**
     * Set the runAsUser.
     *
     * @param runAsUser the runAsUser
     * @return the CreateJobOptions builder
     */
    public Builder runAsUser(long runAsUser) {
      this.runAsUser = runAsUser;
      return this;
    }

    /**
     * Set the runCommands.
     * Existing runCommands will be replaced.
     *
     * @param runCommands the runCommands
     * @return the CreateJobOptions builder
     */
    public Builder runCommands(List<String> runCommands) {
      this.runCommands = runCommands;
      return this;
    }

    /**
     * Set the runEnvVariables.
     * Existing runEnvVariables will be replaced.
     *
     * @param runEnvVariables the runEnvVariables
     * @return the CreateJobOptions builder
     */
    public Builder runEnvVariables(List<EnvVarPrototype> runEnvVariables) {
      this.runEnvVariables = runEnvVariables;
      return this;
    }

    /**
     * Set the runMode.
     *
     * @param runMode the runMode
     * @return the CreateJobOptions builder
     */
    public Builder runMode(String runMode) {
      this.runMode = runMode;
      return this;
    }

    /**
     * Set the runServiceAccount.
     *
     * @param runServiceAccount the runServiceAccount
     * @return the CreateJobOptions builder
     */
    public Builder runServiceAccount(String runServiceAccount) {
      this.runServiceAccount = runServiceAccount;
      return this;
    }

    /**
     * Set the runVolumeMounts.
     * Existing runVolumeMounts will be replaced.
     *
     * @param runVolumeMounts the runVolumeMounts
     * @return the CreateJobOptions builder
     */
    public Builder runVolumeMounts(List<VolumeMountPrototype> runVolumeMounts) {
      this.runVolumeMounts = runVolumeMounts;
      return this;
    }

    /**
     * Set the scaleArraySpec.
     *
     * @param scaleArraySpec the scaleArraySpec
     * @return the CreateJobOptions builder
     */
    public Builder scaleArraySpec(String scaleArraySpec) {
      this.scaleArraySpec = scaleArraySpec;
      return this;
    }

    /**
     * Set the scaleCpuLimit.
     *
     * @param scaleCpuLimit the scaleCpuLimit
     * @return the CreateJobOptions builder
     */
    public Builder scaleCpuLimit(String scaleCpuLimit) {
      this.scaleCpuLimit = scaleCpuLimit;
      return this;
    }

    /**
     * Set the scaleEphemeralStorageLimit.
     *
     * @param scaleEphemeralStorageLimit the scaleEphemeralStorageLimit
     * @return the CreateJobOptions builder
     */
    public Builder scaleEphemeralStorageLimit(String scaleEphemeralStorageLimit) {
      this.scaleEphemeralStorageLimit = scaleEphemeralStorageLimit;
      return this;
    }

    /**
     * Set the scaleMaxExecutionTime.
     *
     * @param scaleMaxExecutionTime the scaleMaxExecutionTime
     * @return the CreateJobOptions builder
     */
    public Builder scaleMaxExecutionTime(long scaleMaxExecutionTime) {
      this.scaleMaxExecutionTime = scaleMaxExecutionTime;
      return this;
    }

    /**
     * Set the scaleMemoryLimit.
     *
     * @param scaleMemoryLimit the scaleMemoryLimit
     * @return the CreateJobOptions builder
     */
    public Builder scaleMemoryLimit(String scaleMemoryLimit) {
      this.scaleMemoryLimit = scaleMemoryLimit;
      return this;
    }

    /**
     * Set the scaleRetryLimit.
     *
     * @param scaleRetryLimit the scaleRetryLimit
     * @return the CreateJobOptions builder
     */
    public Builder scaleRetryLimit(long scaleRetryLimit) {
      this.scaleRetryLimit = scaleRetryLimit;
      return this;
    }
  }

  protected CreateJobOptions() { }

  protected CreateJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.imageReference,
      "imageReference cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    projectId = builder.projectId;
    imageReference = builder.imageReference;
    name = builder.name;
    imageSecret = builder.imageSecret;
    runArguments = builder.runArguments;
    runAsUser = builder.runAsUser;
    runCommands = builder.runCommands;
    runEnvVariables = builder.runEnvVariables;
    runMode = builder.runMode;
    runServiceAccount = builder.runServiceAccount;
    runVolumeMounts = builder.runVolumeMounts;
    scaleArraySpec = builder.scaleArraySpec;
    scaleCpuLimit = builder.scaleCpuLimit;
    scaleEphemeralStorageLimit = builder.scaleEphemeralStorageLimit;
    scaleMaxExecutionTime = builder.scaleMaxExecutionTime;
    scaleMemoryLimit = builder.scaleMemoryLimit;
    scaleRetryLimit = builder.scaleRetryLimit;
  }

  /**
   * New builder.
   *
   * @return a CreateJobOptions builder
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
   * Gets the imageReference.
   *
   * The name of the image that is used for this job. The format is `REGISTRY/NAMESPACE/REPOSITORY:TAG` where `REGISTRY`
   * and `TAG` are optional. If `REGISTRY` is not specified, the default is `docker.io`. If `TAG` is not specified, the
   * default is `latest`. If the image reference points to a registry that requires authentication, make sure to also
   * specify the property `image_secret`.
   *
   * @return the imageReference
   */
  public String imageReference() {
    return imageReference;
  }

  /**
   * Gets the name.
   *
   * The name of the job. Use a name that is unique within the project.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the imageSecret.
   *
   * The name of the image registry access secret. The image registry access secret is used to authenticate with a
   * private registry when you download the container image. If the image reference points to a registry that requires
   * authentication, the job / job runs will be created but submitted job runs will fail, until this property is
   * provided, too.
   *
   * @return the imageSecret
   */
  public String imageSecret() {
    return imageSecret;
  }

  /**
   * Gets the runArguments.
   *
   * Set arguments for the job that are passed to start job run containers. If not specified an empty string array will
   * be applied and the arguments specified by the container image, will be used to start the container.
   *
   * @return the runArguments
   */
  public List<String> runArguments() {
    return runArguments;
  }

  /**
   * Gets the runAsUser.
   *
   * The user ID (UID) to run the application (e.g., 1001).
   *
   * @return the runAsUser
   */
  public Long runAsUser() {
    return runAsUser;
  }

  /**
   * Gets the runCommands.
   *
   * Set commands for the job that are passed to start job run containers. If not specified an empty string array will
   * be applied and the command specified by the container image, will be used to start the container.
   *
   * @return the runCommands
   */
  public List<String> runCommands() {
    return runCommands;
  }

  /**
   * Gets the runEnvVariables.
   *
   * Optional references to config maps, secrets or a literal values.
   *
   * @return the runEnvVariables
   */
  public List<EnvVarPrototype> runEnvVariables() {
    return runEnvVariables;
  }

  /**
   * Gets the runMode.
   *
   * The mode for runs of the job. Valid values are `task` and `daemon`. In `task` mode, the `max_execution_time` and
   * `retry_limit` options apply. In `daemon` mode, since there is no timeout and failed instances are restarted
   * indefinitely, the `max_execution_time` and `retry_limit` options are not allowed.
   *
   * @return the runMode
   */
  public String runMode() {
    return runMode;
  }

  /**
   * Gets the runServiceAccount.
   *
   * The name of the service account. For built-in service accounts, you can use the shortened names `manager`, `none`,
   * `reader`, and `writer`.
   *
   * @return the runServiceAccount
   */
  public String runServiceAccount() {
    return runServiceAccount;
  }

  /**
   * Gets the runVolumeMounts.
   *
   * Optional mounts of config maps or a secrets.
   *
   * @return the runVolumeMounts
   */
  public List<VolumeMountPrototype> runVolumeMounts() {
    return runVolumeMounts;
  }

  /**
   * Gets the scaleArraySpec.
   *
   * Define a custom set of array indices as comma-separated list containing single values and hyphen-separated ranges
   * like `5,12-14,23,27`. Each instance can pick up its array index via environment variable `JOB_INDEX`. The number of
   * unique array indices specified here determines the number of job instances to run.
   *
   * @return the scaleArraySpec
   */
  public String scaleArraySpec() {
    return scaleArraySpec;
  }

  /**
   * Gets the scaleCpuLimit.
   *
   * Optional amount of CPU set for the instance of the job. For valid values see [Supported memory and CPU
   * combinations](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo).
   *
   * @return the scaleCpuLimit
   */
  public String scaleCpuLimit() {
    return scaleCpuLimit;
  }

  /**
   * Gets the scaleEphemeralStorageLimit.
   *
   * Optional amount of ephemeral storage to set for the instance of the job. The amount specified as ephemeral storage,
   * must not exceed the amount of `scale_memory_limit`. The units for specifying ephemeral storage are Megabyte (M) or
   * Gigabyte (G), whereas G and M are the shorthand expressions for GB and MB. For more information see [Units of
   * measurement](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo#unit-measurements).
   *
   * @return the scaleEphemeralStorageLimit
   */
  public String scaleEphemeralStorageLimit() {
    return scaleEphemeralStorageLimit;
  }

  /**
   * Gets the scaleMaxExecutionTime.
   *
   * The maximum execution time in seconds for runs of the job. This option can only be specified if `mode` is `task`.
   *
   * @return the scaleMaxExecutionTime
   */
  public Long scaleMaxExecutionTime() {
    return scaleMaxExecutionTime;
  }

  /**
   * Gets the scaleMemoryLimit.
   *
   * Optional amount of memory set for the instance of the job. For valid values see [Supported memory and CPU
   * combinations](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo). The units for specifying
   * memory are Megabyte (M) or Gigabyte (G), whereas G and M are the shorthand expressions for GB and MB. For more
   * information see [Units of
   * measurement](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo#unit-measurements).
   *
   * @return the scaleMemoryLimit
   */
  public String scaleMemoryLimit() {
    return scaleMemoryLimit;
  }

  /**
   * Gets the scaleRetryLimit.
   *
   * The number of times to rerun an instance of the job before the job is marked as failed. This option can only be
   * specified if `mode` is `task`.
   *
   * @return the scaleRetryLimit
   */
  public Long scaleRetryLimit() {
    return scaleRetryLimit;
  }
}

