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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Prototype model of a volume mount.
 */
public class VolumeMountPrototype extends GenericModel {

  /**
   * Specify the type of the volume mount. Allowed types are: 'config_map', 'persistent_data_store', 'secret'.
   */
  public interface Type {
    /** config_map. */
    String CONFIG_MAP = "config_map";
    /** persistent_data_store. */
    String PERSISTENT_DATA_STORE = "persistent_data_store";
    /** secret. */
    String SECRET = "secret";
  }

  @SerializedName("mount_path")
  protected String mountPath;
  protected String name;
  @SerializedName("read_only")
  protected Boolean readOnly;
  protected String reference;
  @SerializedName("sub_path")
  protected String subPath;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String mountPath;
    private String name;
    private Boolean readOnly;
    private String reference;
    private String subPath;
    private String type;

    /**
     * Instantiates a new Builder from an existing VolumeMountPrototype instance.
     *
     * @param volumeMountPrototype the instance to initialize the Builder with
     */
    private Builder(VolumeMountPrototype volumeMountPrototype) {
      this.mountPath = volumeMountPrototype.mountPath;
      this.name = volumeMountPrototype.name;
      this.readOnly = volumeMountPrototype.readOnly;
      this.reference = volumeMountPrototype.reference;
      this.subPath = volumeMountPrototype.subPath;
      this.type = volumeMountPrototype.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param mountPath the mountPath
     * @param reference the reference
     * @param type the type
     */
    public Builder(String mountPath, String reference, String type) {
      this.mountPath = mountPath;
      this.reference = reference;
      this.type = type;
    }

    /**
     * Builds a VolumeMountPrototype.
     *
     * @return the new VolumeMountPrototype instance
     */
    public VolumeMountPrototype build() {
      return new VolumeMountPrototype(this);
    }

    /**
     * Set the mountPath.
     *
     * @param mountPath the mountPath
     * @return the VolumeMountPrototype builder
     */
    public Builder mountPath(String mountPath) {
      this.mountPath = mountPath;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumeMountPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the readOnly.
     *
     * @param readOnly the readOnly
     * @return the VolumeMountPrototype builder
     */
    public Builder readOnly(Boolean readOnly) {
      this.readOnly = readOnly;
      return this;
    }

    /**
     * Set the reference.
     *
     * @param reference the reference
     * @return the VolumeMountPrototype builder
     */
    public Builder reference(String reference) {
      this.reference = reference;
      return this;
    }

    /**
     * Set the subPath.
     *
     * @param subPath the subPath
     * @return the VolumeMountPrototype builder
     */
    public Builder subPath(String subPath) {
      this.subPath = subPath;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the VolumeMountPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected VolumeMountPrototype() { }

  protected VolumeMountPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mountPath,
      "mountPath cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.reference,
      "reference cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    mountPath = builder.mountPath;
    name = builder.name;
    readOnly = builder.readOnly;
    reference = builder.reference;
    subPath = builder.subPath;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a VolumeMountPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mountPath.
   *
   * The path that should be mounted.
   *
   * @return the mountPath
   */
  public String mountPath() {
    return mountPath;
  }

  /**
   * Gets the name.
   *
   * Optional name of the mount. If not set, it will be generated based on the `ref` and a random ID. In case the `ref`
   * is longer than 58 characters, it will be cut off.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the readOnly.
   *
   * Optional flag to specify if the volume mount is read only.
   *
   * @return the readOnly
   */
  public Boolean readOnly() {
    return readOnly;
  }

  /**
   * Gets the reference.
   *
   * The name of the referenced secret, config map, or persistent data store.
   *
   * @return the reference
   */
  public String reference() {
    return reference;
  }

  /**
   * Gets the subPath.
   *
   * The path mounted at the mount path.
   *
   * @return the subPath
   */
  public String subPath() {
    return subPath;
  }

  /**
   * Gets the type.
   *
   * Specify the type of the volume mount. Allowed types are: 'config_map', 'persistent_data_store', 'secret'.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

