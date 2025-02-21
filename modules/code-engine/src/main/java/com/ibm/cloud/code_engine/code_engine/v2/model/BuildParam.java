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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response model for build params.
 */
public class BuildParam extends GenericModel {

  /**
   * Specify the type of the build param.
   */
  public interface Type {
    /** literal. */
    String LITERAL = "literal";
    /** config_map_key_reference. */
    String CONFIG_MAP_KEY_REFERENCE = "config_map_key_reference";
    /** secret_key_reference. */
    String SECRET_KEY_REFERENCE = "secret_key_reference";
  }

  protected String key;
  protected String name;
  protected String reference;
  protected String type;
  protected String value;

  protected BuildParam() { }

  /**
   * Gets the key.
   *
   * The key to reference as build param.
   *
   * @return the key
   */
  public String getKey() {
    return key;
  }

  /**
   * Gets the name.
   *
   * The name of the build param.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the reference.
   *
   * The name of the secret or config map.
   *
   * @return the reference
   */
  public String getReference() {
    return reference;
  }

  /**
   * Gets the type.
   *
   * Specify the type of the build param.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the value.
   *
   * The literal value of the build param.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

