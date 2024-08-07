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
 * Request model for function update operations.
 */
public class FunctionPatch extends GenericModel {

  /**
   * Optional value controlling which of the system managed domain mappings will be setup for the function. Valid values
   * are 'local_public', 'local_private' and 'local'. Visibility can only be 'local_private' if the project supports
   * function private visibility.
   */
  public interface ManagedDomainMappings {
    /** local. */
    String LOCAL = "local";
    /** local_private. */
    String LOCAL_PRIVATE = "local_private";
    /** local_public. */
    String LOCAL_PUBLIC = "local_public";
  }

  @SerializedName("code_binary")
  protected Boolean codeBinary;
  @SerializedName("code_main")
  protected String codeMain;
  @SerializedName("code_reference")
  protected String codeReference;
  @SerializedName("code_secret")
  protected String codeSecret;
  @SerializedName("managed_domain_mappings")
  protected String managedDomainMappings;
  @SerializedName("run_env_variables")
  protected List<EnvVarPrototype> runEnvVariables;
  protected String runtime;
  @SerializedName("scale_concurrency")
  protected Long scaleConcurrency;
  @SerializedName("scale_cpu_limit")
  protected String scaleCpuLimit;
  @SerializedName("scale_down_delay")
  protected Long scaleDownDelay;
  @SerializedName("scale_max_execution_time")
  protected Long scaleMaxExecutionTime;
  @SerializedName("scale_memory_limit")
  protected String scaleMemoryLimit;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean codeBinary;
    private String codeMain;
    private String codeReference;
    private String codeSecret;
    private String managedDomainMappings;
    private List<EnvVarPrototype> runEnvVariables;
    private String runtime;
    private Long scaleConcurrency;
    private String scaleCpuLimit;
    private Long scaleDownDelay;
    private Long scaleMaxExecutionTime;
    private String scaleMemoryLimit;

    /**
     * Instantiates a new Builder from an existing FunctionPatch instance.
     *
     * @param functionPatch the instance to initialize the Builder with
     */
    private Builder(FunctionPatch functionPatch) {
      this.codeBinary = functionPatch.codeBinary;
      this.codeMain = functionPatch.codeMain;
      this.codeReference = functionPatch.codeReference;
      this.codeSecret = functionPatch.codeSecret;
      this.managedDomainMappings = functionPatch.managedDomainMappings;
      this.runEnvVariables = functionPatch.runEnvVariables;
      this.runtime = functionPatch.runtime;
      this.scaleConcurrency = functionPatch.scaleConcurrency;
      this.scaleCpuLimit = functionPatch.scaleCpuLimit;
      this.scaleDownDelay = functionPatch.scaleDownDelay;
      this.scaleMaxExecutionTime = functionPatch.scaleMaxExecutionTime;
      this.scaleMemoryLimit = functionPatch.scaleMemoryLimit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a FunctionPatch.
     *
     * @return the new FunctionPatch instance
     */
    public FunctionPatch build() {
      return new FunctionPatch(this);
    }

    /**
     * Adds a new element to runEnvVariables.
     *
     * @param runEnvVariables the new element to be added
     * @return the FunctionPatch builder
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
     * Set the codeBinary.
     *
     * @param codeBinary the codeBinary
     * @return the FunctionPatch builder
     */
    public Builder codeBinary(Boolean codeBinary) {
      this.codeBinary = codeBinary;
      return this;
    }

    /**
     * Set the codeMain.
     *
     * @param codeMain the codeMain
     * @return the FunctionPatch builder
     */
    public Builder codeMain(String codeMain) {
      this.codeMain = codeMain;
      return this;
    }

    /**
     * Set the codeReference.
     *
     * @param codeReference the codeReference
     * @return the FunctionPatch builder
     */
    public Builder codeReference(String codeReference) {
      this.codeReference = codeReference;
      return this;
    }

    /**
     * Set the codeSecret.
     *
     * @param codeSecret the codeSecret
     * @return the FunctionPatch builder
     */
    public Builder codeSecret(String codeSecret) {
      this.codeSecret = codeSecret;
      return this;
    }

    /**
     * Set the managedDomainMappings.
     *
     * @param managedDomainMappings the managedDomainMappings
     * @return the FunctionPatch builder
     */
    public Builder managedDomainMappings(String managedDomainMappings) {
      this.managedDomainMappings = managedDomainMappings;
      return this;
    }

    /**
     * Set the runEnvVariables.
     * Existing runEnvVariables will be replaced.
     *
     * @param runEnvVariables the runEnvVariables
     * @return the FunctionPatch builder
     */
    public Builder runEnvVariables(List<EnvVarPrototype> runEnvVariables) {
      this.runEnvVariables = runEnvVariables;
      return this;
    }

    /**
     * Set the runtime.
     *
     * @param runtime the runtime
     * @return the FunctionPatch builder
     */
    public Builder runtime(String runtime) {
      this.runtime = runtime;
      return this;
    }

    /**
     * Set the scaleConcurrency.
     *
     * @param scaleConcurrency the scaleConcurrency
     * @return the FunctionPatch builder
     */
    public Builder scaleConcurrency(long scaleConcurrency) {
      this.scaleConcurrency = scaleConcurrency;
      return this;
    }

    /**
     * Set the scaleCpuLimit.
     *
     * @param scaleCpuLimit the scaleCpuLimit
     * @return the FunctionPatch builder
     */
    public Builder scaleCpuLimit(String scaleCpuLimit) {
      this.scaleCpuLimit = scaleCpuLimit;
      return this;
    }

    /**
     * Set the scaleDownDelay.
     *
     * @param scaleDownDelay the scaleDownDelay
     * @return the FunctionPatch builder
     */
    public Builder scaleDownDelay(long scaleDownDelay) {
      this.scaleDownDelay = scaleDownDelay;
      return this;
    }

    /**
     * Set the scaleMaxExecutionTime.
     *
     * @param scaleMaxExecutionTime the scaleMaxExecutionTime
     * @return the FunctionPatch builder
     */
    public Builder scaleMaxExecutionTime(long scaleMaxExecutionTime) {
      this.scaleMaxExecutionTime = scaleMaxExecutionTime;
      return this;
    }

    /**
     * Set the scaleMemoryLimit.
     *
     * @param scaleMemoryLimit the scaleMemoryLimit
     * @return the FunctionPatch builder
     */
    public Builder scaleMemoryLimit(String scaleMemoryLimit) {
      this.scaleMemoryLimit = scaleMemoryLimit;
      return this;
    }
  }

  protected FunctionPatch() { }

  protected FunctionPatch(Builder builder) {
    codeBinary = builder.codeBinary;
    codeMain = builder.codeMain;
    codeReference = builder.codeReference;
    codeSecret = builder.codeSecret;
    managedDomainMappings = builder.managedDomainMappings;
    runEnvVariables = builder.runEnvVariables;
    runtime = builder.runtime;
    scaleConcurrency = builder.scaleConcurrency;
    scaleCpuLimit = builder.scaleCpuLimit;
    scaleDownDelay = builder.scaleDownDelay;
    scaleMaxExecutionTime = builder.scaleMaxExecutionTime;
    scaleMemoryLimit = builder.scaleMemoryLimit;
  }

  /**
   * New builder.
   *
   * @return a FunctionPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the codeBinary.
   *
   * Specifies whether the code is binary or not. Defaults to false when `code_reference` is set to a data URL. When
   * `code_reference` is set to a code bundle URL, this field is always true.
   *
   * @return the codeBinary
   */
  public Boolean codeBinary() {
    return codeBinary;
  }

  /**
   * Gets the codeMain.
   *
   * Specifies the name of the function that should be invoked.
   *
   * @return the codeMain
   */
  public String codeMain() {
    return codeMain;
  }

  /**
   * Gets the codeReference.
   *
   * Specifies either a reference to a code bundle or the source code itself. To specify the source code, use the data
   * URL scheme and include the source code as base64 encoded. The data URL scheme is defined in [RFC
   * 2397](https://tools.ietf.org/html/rfc2397).
   *
   * @return the codeReference
   */
  public String codeReference() {
    return codeReference;
  }

  /**
   * Gets the codeSecret.
   *
   * The name of the secret that is used to access the specified `code_reference`. The secret is used to authenticate
   * with a non-public endpoint that is specified as`code_reference`.
   *
   * @return the codeSecret
   */
  public String codeSecret() {
    return codeSecret;
  }

  /**
   * Gets the managedDomainMappings.
   *
   * Optional value controlling which of the system managed domain mappings will be setup for the function. Valid values
   * are 'local_public', 'local_private' and 'local'. Visibility can only be 'local_private' if the project supports
   * function private visibility.
   *
   * @return the managedDomainMappings
   */
  public String managedDomainMappings() {
    return managedDomainMappings;
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
   * Gets the runtime.
   *
   * The managed runtime used to execute the injected code.
   *
   * @return the runtime
   */
  public String runtime() {
    return runtime;
  }

  /**
   * Gets the scaleConcurrency.
   *
   * Number of parallel requests handled by a single instance, supported only by Node.js, default is `1`.
   *
   * @return the scaleConcurrency
   */
  public Long scaleConcurrency() {
    return scaleConcurrency;
  }

  /**
   * Gets the scaleCpuLimit.
   *
   * Optional amount of CPU set for the instance of the function. For valid values see [Supported memory and CPU
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
   * Optional amount of time in seconds that delays the scale down behavior for a function.
   *
   * @return the scaleDownDelay
   */
  public Long scaleDownDelay() {
    return scaleDownDelay;
  }

  /**
   * Gets the scaleMaxExecutionTime.
   *
   * Timeout in secs after which the function is terminated.
   *
   * @return the scaleMaxExecutionTime
   */
  public Long scaleMaxExecutionTime() {
    return scaleMaxExecutionTime;
  }

  /**
   * Gets the scaleMemoryLimit.
   *
   * Optional amount of memory set for the instance of the function. For valid values see [Supported memory and CPU
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
   * Construct a JSON merge-patch from the FunctionPatch.
   *
   * Note that properties of the FunctionPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the FunctionPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

