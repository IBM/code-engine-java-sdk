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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains a list of Function runtimes.
 */
public class FunctionRuntimeList extends GenericModel {

  @SerializedName("function_runtimes")
  protected List<FunctionRuntime> functionRuntimes;

  protected FunctionRuntimeList() { }

  /**
   * Gets the functionRuntimes.
   *
   * List of all Function runtimes.
   *
   * @return the functionRuntimes
   */
  public List<FunctionRuntime> getFunctionRuntimes() {
    return functionRuntimes;
  }
}

