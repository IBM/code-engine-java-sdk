/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listKubeconfig options.
 */
public class ListKubeconfigOptions extends GenericModel {

  protected String refreshToken;
  protected String id;
  protected String accept;

  /**
   * Builder.
   */
  public static class Builder {
    private String refreshToken;
    private String id;
    private String accept;

    private Builder(ListKubeconfigOptions listKubeconfigOptions) {
      this.refreshToken = listKubeconfigOptions.refreshToken;
      this.id = listKubeconfigOptions.id;
      this.accept = listKubeconfigOptions.accept;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param refreshToken the refreshToken
     * @param id the id
     */
    public Builder(String refreshToken, String id) {
      this.refreshToken = refreshToken;
      this.id = id;
    }

    /**
     * Builds a ListKubeconfigOptions.
     *
     * @return the new ListKubeconfigOptions instance
     */
    public ListKubeconfigOptions build() {
      return new ListKubeconfigOptions(this);
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the ListKubeconfigOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ListKubeconfigOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the ListKubeconfigOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }
  }

  protected ListKubeconfigOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    refreshToken = builder.refreshToken;
    id = builder.id;
    accept = builder.accept;
  }

  /**
   * New builder.
   *
   * @return a ListKubeconfigOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the refreshToken.
   *
   * The IAM Refresh token associated with the IBM Cloud account.
   *
   * @return the refreshToken
   */
  public String refreshToken() {
    return refreshToken;
  }

  /**
   * Gets the id.
   *
   * The id of the IBM Cloud Code Engine project.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the accept.
   *
   * The type of the response: text/html or application/json. A character encoding can be specified by including a
   * `charset` parameter. For example, 'text/html;charset=utf-8'.
   *
   * @return the accept
   */
  public String accept() {
    return accept;
  }
}

