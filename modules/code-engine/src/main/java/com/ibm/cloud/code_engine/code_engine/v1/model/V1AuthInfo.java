/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.code_engine.code_engine.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * V1AuthInfo.
 */
public class V1AuthInfo extends GenericModel {

  @SerializedName("client-id")
  protected String clientId;
  @SerializedName("client-secret")
  protected String clientSecret;
  @SerializedName("id-token")
  protected String idToken;
  @SerializedName("idp-issuer-url")
  protected String idpIssuerUrl;
  @SerializedName("refresh-token")
  protected String refreshToken;

  protected V1AuthInfo() { }

  /**
   * Gets the clientId.
   *
   * @return the clientId
   */
  public String getClientId() {
    return clientId;
  }

  /**
   * Gets the clientSecret.
   *
   * @return the clientSecret
   */
  public String getClientSecret() {
    return clientSecret;
  }

  /**
   * Gets the idToken.
   *
   * @return the idToken
   */
  public String getIdToken() {
    return idToken;
  }

  /**
   * Gets the idpIssuerUrl.
   *
   * @return the idpIssuerUrl
   */
  public String getIdpIssuerUrl() {
    return idpIssuerUrl;
  }

  /**
   * Gets the refreshToken.
   *
   * @return the refreshToken
   */
  public String getRefreshToken() {
    return refreshToken;
  }
}

