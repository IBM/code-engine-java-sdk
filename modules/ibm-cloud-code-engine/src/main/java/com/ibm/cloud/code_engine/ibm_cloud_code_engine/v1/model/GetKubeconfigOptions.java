/*
 * (C) Copyright IBM Corp. 2021.
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
 * The getKubeconfig options.
 */
public class GetKubeconfigOptions extends GenericModel {

  protected String xDelegatedRefreshToken;
  protected String id;
  protected String accept;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDelegatedRefreshToken;
    private String id;
    private String accept;

    private Builder(GetKubeconfigOptions getKubeconfigOptions) {
      this.xDelegatedRefreshToken = getKubeconfigOptions.xDelegatedRefreshToken;
      this.id = getKubeconfigOptions.id;
      this.accept = getKubeconfigOptions.accept;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param xDelegatedRefreshToken the xDelegatedRefreshToken
     * @param id the id
     */
    public Builder(String xDelegatedRefreshToken, String id) {
      this.xDelegatedRefreshToken = xDelegatedRefreshToken;
      this.id = id;
    }

    /**
     * Builds a GetKubeconfigOptions.
     *
     * @return the new GetKubeconfigOptions instance
     */
    public GetKubeconfigOptions build() {
      return new GetKubeconfigOptions(this);
    }

    /**
     * Set the xDelegatedRefreshToken.
     *
     * @param xDelegatedRefreshToken the xDelegatedRefreshToken
     * @return the GetKubeconfigOptions builder
     */
    public Builder xDelegatedRefreshToken(String xDelegatedRefreshToken) {
      this.xDelegatedRefreshToken = xDelegatedRefreshToken;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetKubeconfigOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the GetKubeconfigOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }
  }

  protected GetKubeconfigOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDelegatedRefreshToken,
      "xDelegatedRefreshToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    xDelegatedRefreshToken = builder.xDelegatedRefreshToken;
    id = builder.id;
    accept = builder.accept;
  }

  /**
   * New builder.
   *
   * @return a GetKubeconfigOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xDelegatedRefreshToken.
   *
   * This IAM Delegated Refresh Token is specifically valid for Code Engine. Generate this token with the [Create an IAM
   * access token and delegated refresh token for a user or service
   * ID](https://cloud.ibm.com/apidocs/iam-identity-token-api#gettoken-apikey-delegatedrefreshtoken) API. Specify the
   * `receiver_client_ids` value to be `ce` and the `delegated_refresh_token_expiry` value to be `3600`.
   *
   * @return the xDelegatedRefreshToken
   */
  public String xDelegatedRefreshToken() {
    return xDelegatedRefreshToken;
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
   * The type of the response: text/plain or application/json. A character encoding can be specified by including a
   * `charset` parameter. For example, 'text/plain;charset=utf-8'.
   *
   * @return the accept
   */
  public String accept() {
    return accept;
  }
}

