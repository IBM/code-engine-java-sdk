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
 * Response model for Function runtime objects.
 */
public class FunctionRuntime extends GenericModel {

  @SerializedName("default")
  protected Boolean xDefault;
  protected Boolean deprecated;
  protected String family;
  protected String id;
  protected String name;
  protected Boolean optimized;

  protected FunctionRuntime() { }

  /**
   * Gets the xDefault.
   *
   * Whether the function runtime is the default for the code bundle family.
   *
   * @return the xDefault
   */
  public Boolean isXDefault() {
    return xDefault;
  }

  /**
   * Gets the deprecated.
   *
   * Whether the function runtime is deprecated.
   *
   * @return the deprecated
   */
  public Boolean isDeprecated() {
    return deprecated;
  }

  /**
   * Gets the family.
   *
   * The code bundle family of the function runtime.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the id.
   *
   * The ID of the function runtime.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name of the function runtime.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the optimized.
   *
   * Whether the function runtime is optimized.
   *
   * @return the optimized
   */
  public Boolean isOptimized() {
    return optimized;
  }
}

