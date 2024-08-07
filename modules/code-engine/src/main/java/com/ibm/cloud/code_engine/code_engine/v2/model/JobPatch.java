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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Request model for job update operations.
 */
public class JobPatch extends GenericModel {

  /**
   * The mode for runs of the job. Valid values are `task` and `daemon`. In `task` mode, the `max_execution_time` and
   * `retry_limit` properties apply. In `daemon` mode, since there is no timeout and failed instances are restarted
   * indefinitely, the `max_execution_time` and `retry_limit` properties are not allowed.
   */
  public interface RunMode {
    /** task. */
    String TASK = "task";
    /** daemon. */
    String DAEMON = "daemon";
  }

  /**
   * The name of the service account. For built-in service accounts, you can use the shortened names `manager`, `none`,
   * `reader`, and `writer`. This property must not be set on a job run, which references a job template.
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

  @SerializedName("image_reference")
  protected String imageReference;
  @SerializedName("image_secret")
  protected String imageSecret;
  @SerializedName("run_arguments")
  protected List<String> runArguments;
  @SerializedName("run_as_user")
  protected Long runAsUser;
  @SerializedName("run_commands")
  protected List<String> runCommands;
  @SerializedName("run_env_variables")
  protected List<EnvVarPrototype> runEnvVariables;
  @SerializedName("run_mode")
  protected String runMode;
  @SerializedName("run_service_account")
  protected String runServiceAccount;
  @SerializedName("run_volume_mounts")
  protected List<VolumeMountPrototype> runVolumeMounts;
  @SerializedName("scale_array_spec")
  protected String scaleArraySpec;
  @SerializedName("scale_cpu_limit")
  protected String scaleCpuLimit;
  @SerializedName("scale_ephemeral_storage_limit")
  protected String scaleEphemeralStorageLimit;
  @SerializedName("scale_max_execution_time")
  protected Long scaleMaxExecutionTime;
  @SerializedName("scale_memory_limit")
  protected String scaleMemoryLimit;
  @SerializedName("scale_retry_limit")
  protected Long scaleRetryLimit;

  /**
   * Builder.
   */
  public static class Builder {
    private String imageReference;
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
     * Instantiates a new Builder from an existing JobPatch instance.
     *
     * @param jobPatch the instance to initialize the Builder with
     */
    private Builder(JobPatch jobPatch) {
      this.imageReference = jobPatch.imageReference;
      this.imageSecret = jobPatch.imageSecret;
      this.runArguments = jobPatch.runArguments;
      this.runAsUser = jobPatch.runAsUser;
      this.runCommands = jobPatch.runCommands;
      this.runEnvVariables = jobPatch.runEnvVariables;
      this.runMode = jobPatch.runMode;
      this.runServiceAccount = jobPatch.runServiceAccount;
      this.runVolumeMounts = jobPatch.runVolumeMounts;
      this.scaleArraySpec = jobPatch.scaleArraySpec;
      this.scaleCpuLimit = jobPatch.scaleCpuLimit;
      this.scaleEphemeralStorageLimit = jobPatch.scaleEphemeralStorageLimit;
      this.scaleMaxExecutionTime = jobPatch.scaleMaxExecutionTime;
      this.scaleMemoryLimit = jobPatch.scaleMemoryLimit;
      this.scaleRetryLimit = jobPatch.scaleRetryLimit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobPatch.
     *
     * @return the new JobPatch instance
     */
    public JobPatch build() {
      return new JobPatch(this);
    }

    /**
     * Adds a new element to runArguments.
     *
     * @param runArguments the new element to be added
     * @return the JobPatch builder
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
     * Adds a new element to runCommands.
     *
     * @param runCommands the new element to be added
     * @return the JobPatch builder
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
     * Adds a new element to runEnvVariables.
     *
     * @param runEnvVariables the new element to be added
     * @return the JobPatch builder
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
     * Adds a new element to runVolumeMounts.
     *
     * @param runVolumeMounts the new element to be added
     * @return the JobPatch builder
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
     * Set the imageReference.
     *
     * @param imageReference the imageReference
     * @return the JobPatch builder
     */
    public Builder imageReference(String imageReference) {
      this.imageReference = imageReference;
      return this;
    }

    /**
     * Set the imageSecret.
     *
     * @param imageSecret the imageSecret
     * @return the JobPatch builder
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
     * @return the JobPatch builder
     */
    public Builder runArguments(List<String> runArguments) {
      this.runArguments = runArguments;
      return this;
    }

    /**
     * Set the runAsUser.
     *
     * @param runAsUser the runAsUser
     * @return the JobPatch builder
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
     * @return the JobPatch builder
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
     * @return the JobPatch builder
     */
    public Builder runEnvVariables(List<EnvVarPrototype> runEnvVariables) {
      this.runEnvVariables = runEnvVariables;
      return this;
    }

    /**
     * Set the runMode.
     *
     * @param runMode the runMode
     * @return the JobPatch builder
     */
    public Builder runMode(String runMode) {
      this.runMode = runMode;
      return this;
    }

    /**
     * Set the runServiceAccount.
     *
     * @param runServiceAccount the runServiceAccount
     * @return the JobPatch builder
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
     * @return the JobPatch builder
     */
    public Builder runVolumeMounts(List<VolumeMountPrototype> runVolumeMounts) {
      this.runVolumeMounts = runVolumeMounts;
      return this;
    }

    /**
     * Set the scaleArraySpec.
     *
     * @param scaleArraySpec the scaleArraySpec
     * @return the JobPatch builder
     */
    public Builder scaleArraySpec(String scaleArraySpec) {
      this.scaleArraySpec = scaleArraySpec;
      return this;
    }

    /**
     * Set the scaleCpuLimit.
     *
     * @param scaleCpuLimit the scaleCpuLimit
     * @return the JobPatch builder
     */
    public Builder scaleCpuLimit(String scaleCpuLimit) {
      this.scaleCpuLimit = scaleCpuLimit;
      return this;
    }

    /**
     * Set the scaleEphemeralStorageLimit.
     *
     * @param scaleEphemeralStorageLimit the scaleEphemeralStorageLimit
     * @return the JobPatch builder
     */
    public Builder scaleEphemeralStorageLimit(String scaleEphemeralStorageLimit) {
      this.scaleEphemeralStorageLimit = scaleEphemeralStorageLimit;
      return this;
    }

    /**
     * Set the scaleMaxExecutionTime.
     *
     * @param scaleMaxExecutionTime the scaleMaxExecutionTime
     * @return the JobPatch builder
     */
    public Builder scaleMaxExecutionTime(long scaleMaxExecutionTime) {
      this.scaleMaxExecutionTime = scaleMaxExecutionTime;
      return this;
    }

    /**
     * Set the scaleMemoryLimit.
     *
     * @param scaleMemoryLimit the scaleMemoryLimit
     * @return the JobPatch builder
     */
    public Builder scaleMemoryLimit(String scaleMemoryLimit) {
      this.scaleMemoryLimit = scaleMemoryLimit;
      return this;
    }

    /**
     * Set the scaleRetryLimit.
     *
     * @param scaleRetryLimit the scaleRetryLimit
     * @return the JobPatch builder
     */
    public Builder scaleRetryLimit(long scaleRetryLimit) {
      this.scaleRetryLimit = scaleRetryLimit;
      return this;
    }
  }

  protected JobPatch() { }

  protected JobPatch(Builder builder) {
    imageReference = builder.imageReference;
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
   * @return a JobPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the imageSecret.
   *
   * The name of the image registry access secret. The image registry access secret is used to authenticate with a
   * private registry when you download the container image. If the image reference points to a registry that requires
   * authentication, the job / job runs will be created but submitted job runs will fail, until this property is
   * provided, too. This property must not be set on a job run, which references a job template.
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
   * The user ID (UID) to run the job.
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
   * Optional references to config maps, secrets or literal values.
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
   * `retry_limit` properties apply. In `daemon` mode, since there is no timeout and failed instances are restarted
   * indefinitely, the `max_execution_time` and `retry_limit` properties are not allowed.
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
   * `reader`, and `writer`. This property must not be set on a job run, which references a job template.
   *
   * @return the runServiceAccount
   */
  public String runServiceAccount() {
    return runServiceAccount;
  }

  /**
   * Gets the runVolumeMounts.
   *
   * Optional mounts of config maps or a secrets. In case this is provided, existing `run_volume_mounts` will be
   * overwritten.
   *
   * @return the runVolumeMounts
   */
  public List<VolumeMountPrototype> runVolumeMounts() {
    return runVolumeMounts;
  }

  /**
   * Gets the scaleArraySpec.
   *
   * Define a custom set of array indices as a comma-separated list containing single values and hyphen-separated
   * ranges, such as  5,12-14,23,27. Each instance gets its array index value from the environment variable JOB_INDEX.
   * The number of unique array indices that you specify with this parameter determines the number of job instances to
   * run.
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
   * The maximum execution time in seconds for runs of the job. This property can only be specified if `run_mode` is
   * `task`.
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
   * The number of times to rerun an instance of the job before the job is marked as failed. This property can only be
   * specified if `run_mode` is `task`.
   *
   * @return the scaleRetryLimit
   */
  public Long scaleRetryLimit() {
    return scaleRetryLimit;
  }

  /**
   * Construct a JSON merge-patch from the JobPatch.
   *
   * Note that properties of the JobPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the JobPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

