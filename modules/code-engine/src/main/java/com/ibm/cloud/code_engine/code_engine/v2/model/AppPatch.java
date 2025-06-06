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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * App is the request model for app update operations.
 */
public class AppPatch extends GenericModel {

  /**
   * Optional value controlling which of the system managed domain mappings will be setup for the application. Valid
   * values are 'local_public', 'local_private' and 'local'. Visibility can only be 'local_private' if the project
   * supports application private visibility.
   */
  public interface ManagedDomainMappings {
    /** local. */
    String LOCAL = "local";
    /** local_private. */
    String LOCAL_PRIVATE = "local_private";
    /** local_public. */
    String LOCAL_PUBLIC = "local_public";
  }

  /**
   * Optional name of the service account. For built-in service accounts, you can use the shortened names `manager` ,
   * `none`, `reader`, and `writer`.
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

  @SerializedName("image_port")
  protected Long imagePort;
  @SerializedName("image_reference")
  protected String imageReference;
  @SerializedName("image_secret")
  protected String imageSecret;
  @SerializedName("managed_domain_mappings")
  protected String managedDomainMappings;
  @SerializedName("probe_liveness")
  protected ProbePrototype probeLiveness;
  @SerializedName("probe_readiness")
  protected ProbePrototype probeReadiness;
  @SerializedName("run_arguments")
  protected List<String> runArguments;
  @SerializedName("run_as_user")
  protected Long runAsUser;
  @SerializedName("run_commands")
  protected List<String> runCommands;
  @SerializedName("run_compute_resource_token_enabled")
  protected Boolean runComputeResourceTokenEnabled;
  @SerializedName("run_env_variables")
  protected List<EnvVarPrototype> runEnvVariables;
  @SerializedName("run_service_account")
  protected String runServiceAccount;
  @SerializedName("run_volume_mounts")
  protected List<VolumeMountPrototype> runVolumeMounts;
  @SerializedName("scale_concurrency")
  protected Long scaleConcurrency;
  @SerializedName("scale_concurrency_target")
  protected Long scaleConcurrencyTarget;
  @SerializedName("scale_cpu_limit")
  protected String scaleCpuLimit;
  @SerializedName("scale_down_delay")
  protected Long scaleDownDelay;
  @SerializedName("scale_ephemeral_storage_limit")
  protected String scaleEphemeralStorageLimit;
  @SerializedName("scale_initial_instances")
  protected Long scaleInitialInstances;
  @SerializedName("scale_max_instances")
  protected Long scaleMaxInstances;
  @SerializedName("scale_memory_limit")
  protected String scaleMemoryLimit;
  @SerializedName("scale_min_instances")
  protected Long scaleMinInstances;
  @SerializedName("scale_request_timeout")
  protected Long scaleRequestTimeout;

  /**
   * Builder.
   */
  public static class Builder {
    private Long imagePort;
    private String imageReference;
    private String imageSecret;
    private String managedDomainMappings;
    private ProbePrototype probeLiveness;
    private ProbePrototype probeReadiness;
    private List<String> runArguments;
    private Long runAsUser;
    private List<String> runCommands;
    private Boolean runComputeResourceTokenEnabled;
    private List<EnvVarPrototype> runEnvVariables;
    private String runServiceAccount;
    private List<VolumeMountPrototype> runVolumeMounts;
    private Long scaleConcurrency;
    private Long scaleConcurrencyTarget;
    private String scaleCpuLimit;
    private Long scaleDownDelay;
    private String scaleEphemeralStorageLimit;
    private Long scaleInitialInstances;
    private Long scaleMaxInstances;
    private String scaleMemoryLimit;
    private Long scaleMinInstances;
    private Long scaleRequestTimeout;

    /**
     * Instantiates a new Builder from an existing AppPatch instance.
     *
     * @param appPatch the instance to initialize the Builder with
     */
    private Builder(AppPatch appPatch) {
      this.imagePort = appPatch.imagePort;
      this.imageReference = appPatch.imageReference;
      this.imageSecret = appPatch.imageSecret;
      this.managedDomainMappings = appPatch.managedDomainMappings;
      this.probeLiveness = appPatch.probeLiveness;
      this.probeReadiness = appPatch.probeReadiness;
      this.runArguments = appPatch.runArguments;
      this.runAsUser = appPatch.runAsUser;
      this.runCommands = appPatch.runCommands;
      this.runComputeResourceTokenEnabled = appPatch.runComputeResourceTokenEnabled;
      this.runEnvVariables = appPatch.runEnvVariables;
      this.runServiceAccount = appPatch.runServiceAccount;
      this.runVolumeMounts = appPatch.runVolumeMounts;
      this.scaleConcurrency = appPatch.scaleConcurrency;
      this.scaleConcurrencyTarget = appPatch.scaleConcurrencyTarget;
      this.scaleCpuLimit = appPatch.scaleCpuLimit;
      this.scaleDownDelay = appPatch.scaleDownDelay;
      this.scaleEphemeralStorageLimit = appPatch.scaleEphemeralStorageLimit;
      this.scaleInitialInstances = appPatch.scaleInitialInstances;
      this.scaleMaxInstances = appPatch.scaleMaxInstances;
      this.scaleMemoryLimit = appPatch.scaleMemoryLimit;
      this.scaleMinInstances = appPatch.scaleMinInstances;
      this.scaleRequestTimeout = appPatch.scaleRequestTimeout;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AppPatch.
     *
     * @return the new AppPatch instance
     */
    public AppPatch build() {
      return new AppPatch(this);
    }

    /**
     * Adds a new element to runArguments.
     *
     * @param runArguments the new element to be added
     * @return the AppPatch builder
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
     * @return the AppPatch builder
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
     * @return the AppPatch builder
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
     * @return the AppPatch builder
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
     * Set the imagePort.
     *
     * @param imagePort the imagePort
     * @return the AppPatch builder
     */
    public Builder imagePort(long imagePort) {
      this.imagePort = imagePort;
      return this;
    }

    /**
     * Set the imageReference.
     *
     * @param imageReference the imageReference
     * @return the AppPatch builder
     */
    public Builder imageReference(String imageReference) {
      this.imageReference = imageReference;
      return this;
    }

    /**
     * Set the imageSecret.
     *
     * @param imageSecret the imageSecret
     * @return the AppPatch builder
     */
    public Builder imageSecret(String imageSecret) {
      this.imageSecret = imageSecret;
      return this;
    }

    /**
     * Set the managedDomainMappings.
     *
     * @param managedDomainMappings the managedDomainMappings
     * @return the AppPatch builder
     */
    public Builder managedDomainMappings(String managedDomainMappings) {
      this.managedDomainMappings = managedDomainMappings;
      return this;
    }

    /**
     * Set the probeLiveness.
     *
     * @param probeLiveness the probeLiveness
     * @return the AppPatch builder
     */
    public Builder probeLiveness(ProbePrototype probeLiveness) {
      this.probeLiveness = probeLiveness;
      return this;
    }

    /**
     * Set the probeReadiness.
     *
     * @param probeReadiness the probeReadiness
     * @return the AppPatch builder
     */
    public Builder probeReadiness(ProbePrototype probeReadiness) {
      this.probeReadiness = probeReadiness;
      return this;
    }

    /**
     * Set the runArguments.
     * Existing runArguments will be replaced.
     *
     * @param runArguments the runArguments
     * @return the AppPatch builder
     */
    public Builder runArguments(List<String> runArguments) {
      this.runArguments = runArguments;
      return this;
    }

    /**
     * Set the runAsUser.
     *
     * @param runAsUser the runAsUser
     * @return the AppPatch builder
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
     * @return the AppPatch builder
     */
    public Builder runCommands(List<String> runCommands) {
      this.runCommands = runCommands;
      return this;
    }

    /**
     * Set the runComputeResourceTokenEnabled.
     *
     * @param runComputeResourceTokenEnabled the runComputeResourceTokenEnabled
     * @return the AppPatch builder
     */
    public Builder runComputeResourceTokenEnabled(Boolean runComputeResourceTokenEnabled) {
      this.runComputeResourceTokenEnabled = runComputeResourceTokenEnabled;
      return this;
    }

    /**
     * Set the runEnvVariables.
     * Existing runEnvVariables will be replaced.
     *
     * @param runEnvVariables the runEnvVariables
     * @return the AppPatch builder
     */
    public Builder runEnvVariables(List<EnvVarPrototype> runEnvVariables) {
      this.runEnvVariables = runEnvVariables;
      return this;
    }

    /**
     * Set the runServiceAccount.
     *
     * @param runServiceAccount the runServiceAccount
     * @return the AppPatch builder
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
     * @return the AppPatch builder
     */
    public Builder runVolumeMounts(List<VolumeMountPrototype> runVolumeMounts) {
      this.runVolumeMounts = runVolumeMounts;
      return this;
    }

    /**
     * Set the scaleConcurrency.
     *
     * @param scaleConcurrency the scaleConcurrency
     * @return the AppPatch builder
     */
    public Builder scaleConcurrency(long scaleConcurrency) {
      this.scaleConcurrency = scaleConcurrency;
      return this;
    }

    /**
     * Set the scaleConcurrencyTarget.
     *
     * @param scaleConcurrencyTarget the scaleConcurrencyTarget
     * @return the AppPatch builder
     */
    public Builder scaleConcurrencyTarget(long scaleConcurrencyTarget) {
      this.scaleConcurrencyTarget = scaleConcurrencyTarget;
      return this;
    }

    /**
     * Set the scaleCpuLimit.
     *
     * @param scaleCpuLimit the scaleCpuLimit
     * @return the AppPatch builder
     */
    public Builder scaleCpuLimit(String scaleCpuLimit) {
      this.scaleCpuLimit = scaleCpuLimit;
      return this;
    }

    /**
     * Set the scaleDownDelay.
     *
     * @param scaleDownDelay the scaleDownDelay
     * @return the AppPatch builder
     */
    public Builder scaleDownDelay(long scaleDownDelay) {
      this.scaleDownDelay = scaleDownDelay;
      return this;
    }

    /**
     * Set the scaleEphemeralStorageLimit.
     *
     * @param scaleEphemeralStorageLimit the scaleEphemeralStorageLimit
     * @return the AppPatch builder
     */
    public Builder scaleEphemeralStorageLimit(String scaleEphemeralStorageLimit) {
      this.scaleEphemeralStorageLimit = scaleEphemeralStorageLimit;
      return this;
    }

    /**
     * Set the scaleInitialInstances.
     *
     * @param scaleInitialInstances the scaleInitialInstances
     * @return the AppPatch builder
     */
    public Builder scaleInitialInstances(long scaleInitialInstances) {
      this.scaleInitialInstances = scaleInitialInstances;
      return this;
    }

    /**
     * Set the scaleMaxInstances.
     *
     * @param scaleMaxInstances the scaleMaxInstances
     * @return the AppPatch builder
     */
    public Builder scaleMaxInstances(long scaleMaxInstances) {
      this.scaleMaxInstances = scaleMaxInstances;
      return this;
    }

    /**
     * Set the scaleMemoryLimit.
     *
     * @param scaleMemoryLimit the scaleMemoryLimit
     * @return the AppPatch builder
     */
    public Builder scaleMemoryLimit(String scaleMemoryLimit) {
      this.scaleMemoryLimit = scaleMemoryLimit;
      return this;
    }

    /**
     * Set the scaleMinInstances.
     *
     * @param scaleMinInstances the scaleMinInstances
     * @return the AppPatch builder
     */
    public Builder scaleMinInstances(long scaleMinInstances) {
      this.scaleMinInstances = scaleMinInstances;
      return this;
    }

    /**
     * Set the scaleRequestTimeout.
     *
     * @param scaleRequestTimeout the scaleRequestTimeout
     * @return the AppPatch builder
     */
    public Builder scaleRequestTimeout(long scaleRequestTimeout) {
      this.scaleRequestTimeout = scaleRequestTimeout;
      return this;
    }
  }

  protected AppPatch() { }

  protected AppPatch(Builder builder) {
    imagePort = builder.imagePort;
    imageReference = builder.imageReference;
    imageSecret = builder.imageSecret;
    managedDomainMappings = builder.managedDomainMappings;
    probeLiveness = builder.probeLiveness;
    probeReadiness = builder.probeReadiness;
    runArguments = builder.runArguments;
    runAsUser = builder.runAsUser;
    runCommands = builder.runCommands;
    runComputeResourceTokenEnabled = builder.runComputeResourceTokenEnabled;
    runEnvVariables = builder.runEnvVariables;
    runServiceAccount = builder.runServiceAccount;
    runVolumeMounts = builder.runVolumeMounts;
    scaleConcurrency = builder.scaleConcurrency;
    scaleConcurrencyTarget = builder.scaleConcurrencyTarget;
    scaleCpuLimit = builder.scaleCpuLimit;
    scaleDownDelay = builder.scaleDownDelay;
    scaleEphemeralStorageLimit = builder.scaleEphemeralStorageLimit;
    scaleInitialInstances = builder.scaleInitialInstances;
    scaleMaxInstances = builder.scaleMaxInstances;
    scaleMemoryLimit = builder.scaleMemoryLimit;
    scaleMinInstances = builder.scaleMinInstances;
    scaleRequestTimeout = builder.scaleRequestTimeout;
  }

  /**
   * New builder.
   *
   * @return a AppPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the imagePort.
   *
   * Optional port the app listens on. While the app will always be exposed via port `443` for end users, this port is
   * used to connect to the port that is exposed by the container image.
   *
   * @return the imagePort
   */
  public Long imagePort() {
    return imagePort;
  }

  /**
   * Gets the imageReference.
   *
   * The name of the image that is used for this app. The format is `REGISTRY/NAMESPACE/REPOSITORY:TAG` where `REGISTRY`
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
   * Optional name of the image registry access secret. The image registry access secret is used to authenticate with a
   * private registry when you download the container image. If the image reference points to a registry that requires
   * authentication, the app will be created but cannot reach the ready status, until this property is provided, too.
   *
   * @return the imageSecret
   */
  public String imageSecret() {
    return imageSecret;
  }

  /**
   * Gets the managedDomainMappings.
   *
   * Optional value controlling which of the system managed domain mappings will be setup for the application. Valid
   * values are 'local_public', 'local_private' and 'local'. Visibility can only be 'local_private' if the project
   * supports application private visibility.
   *
   * @return the managedDomainMappings
   */
  public String managedDomainMappings() {
    return managedDomainMappings;
  }

  /**
   * Gets the probeLiveness.
   *
   * Request model for probes.
   *
   * @return the probeLiveness
   */
  public ProbePrototype probeLiveness() {
    return probeLiveness;
  }

  /**
   * Gets the probeReadiness.
   *
   * Request model for probes.
   *
   * @return the probeReadiness
   */
  public ProbePrototype probeReadiness() {
    return probeReadiness;
  }

  /**
   * Gets the runArguments.
   *
   * Optional arguments for the app that are passed to start the container. If not specified an empty string array will
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
   * Optional user ID (UID) to run the app.
   *
   * @return the runAsUser
   */
  public Long runAsUser() {
    return runAsUser;
  }

  /**
   * Gets the runCommands.
   *
   * Optional commands for the app that are passed to start the container. If not specified an empty string array will
   * be applied and the command specified by the container image, will be used to start the container.
   *
   * @return the runCommands
   */
  public List<String> runCommands() {
    return runCommands;
  }

  /**
   * Gets the runComputeResourceTokenEnabled.
   *
   * Optional flag to enable the use of a compute resource token mounted to the container file system.
   *
   * @return the runComputeResourceTokenEnabled
   */
  public Boolean runComputeResourceTokenEnabled() {
    return runComputeResourceTokenEnabled;
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
   * Gets the runServiceAccount.
   *
   * Optional name of the service account. For built-in service accounts, you can use the shortened names `manager` ,
   * `none`, `reader`, and `writer`.
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
   * Gets the scaleConcurrency.
   *
   * Optional maximum number of requests that can be processed concurrently per instance.
   *
   * @return the scaleConcurrency
   */
  public Long scaleConcurrency() {
    return scaleConcurrency;
  }

  /**
   * Gets the scaleConcurrencyTarget.
   *
   * Optional threshold of concurrent requests per instance at which one or more additional instances are created. Use
   * this value to scale up instances based on concurrent number of requests. This option defaults to the value of the
   * `scale_concurrency` option, if not specified.
   *
   * @return the scaleConcurrencyTarget
   */
  public Long scaleConcurrencyTarget() {
    return scaleConcurrencyTarget;
  }

  /**
   * Gets the scaleCpuLimit.
   *
   * Optional number of CPU set for the instance of the app. For valid values see [Supported memory and CPU
   * combinations](https://cloud.ibm.com/docs/codeengine?topic=codeengine-mem-cpu-combo).
   *
   * @return the scaleCpuLimit
   */
  public String scaleCpuLimit() {
    return scaleCpuLimit;
  }

  /**
   * Gets the scaleDownDelay.
   *
   * Optional amount of time in seconds that delays the scale-down behavior for an app instance.
   *
   * @return the scaleDownDelay
   */
  public Long scaleDownDelay() {
    return scaleDownDelay;
  }

  /**
   * Gets the scaleEphemeralStorageLimit.
   *
   * Optional amount of ephemeral storage to set for the instance of the app. The amount specified as ephemeral storage,
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
   * Gets the scaleInitialInstances.
   *
   * Optional initial number of instances that are created upon app creation or app update.
   *
   * @return the scaleInitialInstances
   */
  public Long scaleInitialInstances() {
    return scaleInitialInstances;
  }

  /**
   * Gets the scaleMaxInstances.
   *
   * Optional maximum number of instances for this app. If you set this value to `0`, this property does not set a upper
   * scaling limit. However, the app scaling is still limited by the project quota for instances. See [Limits and quotas
   * for Code Engine](https://cloud.ibm.com/docs/codeengine?topic=codeengine-limits).
   *
   * @return the scaleMaxInstances
   */
  public Long scaleMaxInstances() {
    return scaleMaxInstances;
  }

  /**
   * Gets the scaleMemoryLimit.
   *
   * Optional amount of memory set for the instance of the app. For valid values see [Supported memory and CPU
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
   * Gets the scaleMinInstances.
   *
   * Optional minimum number of instances for this app. If you set this value to `0`, the app will scale down to zero,
   * if not hit by any request for some time.
   *
   * @return the scaleMinInstances
   */
  public Long scaleMinInstances() {
    return scaleMinInstances;
  }

  /**
   * Gets the scaleRequestTimeout.
   *
   * Optional amount of time in seconds that is allowed for a running app to respond to a request.
   *
   * @return the scaleRequestTimeout
   */
  public Long scaleRequestTimeout() {
    return scaleRequestTimeout;
  }

  /**
   * Construct a JSON merge-patch from the AppPatch.
   *
   * Note that properties of the AppPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the AppPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

