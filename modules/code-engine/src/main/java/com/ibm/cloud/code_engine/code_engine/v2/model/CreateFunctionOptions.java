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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createFunction options.
 */
public class CreateFunctionOptions extends GenericModel {

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

  protected String projectId;
  protected String codeReference;
  protected String name;
  protected String runtime;
  protected Boolean codeBinary;
  protected String codeMain;
  protected String codeSecret;
  protected String managedDomainMappings;
  protected List<EnvVarPrototype> runEnvVariables;
  protected Long scaleConcurrency;
  protected String scaleCpuLimit;
  protected Long scaleDownDelay;
  protected Long scaleMaxExecutionTime;
  protected String scaleMemoryLimit;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String codeReference;
    private String name;
    private String runtime;
    private Boolean codeBinary;
    private String codeMain;
    private String codeSecret;
    private String managedDomainMappings;
    private List<EnvVarPrototype> runEnvVariables;
    private Long scaleConcurrency;
    private String scaleCpuLimit;
    private Long scaleDownDelay;
    private Long scaleMaxExecutionTime;
    private String scaleMemoryLimit;

    /**
     * Instantiates a new Builder from an existing CreateFunctionOptions instance.
     *
     * @param createFunctionOptions the instance to initialize the Builder with
     */
    private Builder(CreateFunctionOptions createFunctionOptions) {
      this.projectId = createFunctionOptions.projectId;
      this.codeReference = createFunctionOptions.codeReference;
      this.name = createFunctionOptions.name;
      this.runtime = createFunctionOptions.runtime;
      this.codeBinary = createFunctionOptions.codeBinary;
      this.codeMain = createFunctionOptions.codeMain;
      this.codeSecret = createFunctionOptions.codeSecret;
      this.managedDomainMappings = createFunctionOptions.managedDomainMappings;
      this.runEnvVariables = createFunctionOptions.runEnvVariables;
      this.scaleConcurrency = createFunctionOptions.scaleConcurrency;
      this.scaleCpuLimit = createFunctionOptions.scaleCpuLimit;
      this.scaleDownDelay = createFunctionOptions.scaleDownDelay;
      this.scaleMaxExecutionTime = createFunctionOptions.scaleMaxExecutionTime;
      this.scaleMemoryLimit = createFunctionOptions.scaleMemoryLimit;
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
     * @param codeReference the codeReference
     * @param name the name
     * @param runtime the runtime
     */
    public Builder(String projectId, String codeReference, String name, String runtime) {
      this.projectId = projectId;
      this.codeReference = codeReference;
      this.name = name;
      this.runtime = runtime;
    }

    /**
     * Builds a CreateFunctionOptions.
     *
     * @return the new CreateFunctionOptions instance
     */
    public CreateFunctionOptions build() {
      return new CreateFunctionOptions(this);
    }

    /**
     * Adds a new element to runEnvVariables.
     *
     * @param runEnvVariables the new element to be added
     * @return the CreateFunctionOptions builder
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
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateFunctionOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the codeReference.
     *
     * @param codeReference the codeReference
     * @return the CreateFunctionOptions builder
     */
    public Builder codeReference(String codeReference) {
      this.codeReference = codeReference;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateFunctionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the runtime.
     *
     * @param runtime the runtime
     * @return the CreateFunctionOptions builder
     */
    public Builder runtime(String runtime) {
      this.runtime = runtime;
      return this;
    }

    /**
     * Set the codeBinary.
     *
     * @param codeBinary the codeBinary
     * @return the CreateFunctionOptions builder
     */
    public Builder codeBinary(Boolean codeBinary) {
      this.codeBinary = codeBinary;
      return this;
    }

    /**
     * Set the codeMain.
     *
     * @param codeMain the codeMain
     * @return the CreateFunctionOptions builder
     */
    public Builder codeMain(String codeMain) {
      this.codeMain = codeMain;
      return this;
    }

    /**
     * Set the codeSecret.
     *
     * @param codeSecret the codeSecret
     * @return the CreateFunctionOptions builder
     */
    public Builder codeSecret(String codeSecret) {
      this.codeSecret = codeSecret;
      return this;
    }

    /**
     * Set the managedDomainMappings.
     *
     * @param managedDomainMappings the managedDomainMappings
     * @return the CreateFunctionOptions builder
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
     * @return the CreateFunctionOptions builder
     */
    public Builder runEnvVariables(List<EnvVarPrototype> runEnvVariables) {
      this.runEnvVariables = runEnvVariables;
      return this;
    }

    /**
     * Set the scaleConcurrency.
     *
     * @param scaleConcurrency the scaleConcurrency
     * @return the CreateFunctionOptions builder
     */
    public Builder scaleConcurrency(long scaleConcurrency) {
      this.scaleConcurrency = scaleConcurrency;
      return this;
    }

    /**
     * Set the scaleCpuLimit.
     *
     * @param scaleCpuLimit the scaleCpuLimit
     * @return the CreateFunctionOptions builder
     */
    public Builder scaleCpuLimit(String scaleCpuLimit) {
      this.scaleCpuLimit = scaleCpuLimit;
      return this;
    }

    /**
     * Set the scaleDownDelay.
     *
     * @param scaleDownDelay the scaleDownDelay
     * @return the CreateFunctionOptions builder
     */
    public Builder scaleDownDelay(long scaleDownDelay) {
      this.scaleDownDelay = scaleDownDelay;
      return this;
    }

    /**
     * Set the scaleMaxExecutionTime.
     *
     * @param scaleMaxExecutionTime the scaleMaxExecutionTime
     * @return the CreateFunctionOptions builder
     */
    public Builder scaleMaxExecutionTime(long scaleMaxExecutionTime) {
      this.scaleMaxExecutionTime = scaleMaxExecutionTime;
      return this;
    }

    /**
     * Set the scaleMemoryLimit.
     *
     * @param scaleMemoryLimit the scaleMemoryLimit
     * @return the CreateFunctionOptions builder
     */
    public Builder scaleMemoryLimit(String scaleMemoryLimit) {
      this.scaleMemoryLimit = scaleMemoryLimit;
      return this;
    }
  }

  protected CreateFunctionOptions() { }

  protected CreateFunctionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.codeReference,
      "codeReference cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.runtime,
      "runtime cannot be null");
    projectId = builder.projectId;
    codeReference = builder.codeReference;
    name = builder.name;
    runtime = builder.runtime;
    codeBinary = builder.codeBinary;
    codeMain = builder.codeMain;
    codeSecret = builder.codeSecret;
    managedDomainMappings = builder.managedDomainMappings;
    runEnvVariables = builder.runEnvVariables;
    scaleConcurrency = builder.scaleConcurrency;
    scaleCpuLimit = builder.scaleCpuLimit;
    scaleDownDelay = builder.scaleDownDelay;
    scaleMaxExecutionTime = builder.scaleMaxExecutionTime;
    scaleMemoryLimit = builder.scaleMemoryLimit;
  }

  /**
   * New builder.
   *
   * @return a CreateFunctionOptions builder
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
   * Gets the name.
   *
   * The name of the function. Use a name that is unique within the project.
   *
   * @return the name
   */
  public String name() {
    return name;
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
}

