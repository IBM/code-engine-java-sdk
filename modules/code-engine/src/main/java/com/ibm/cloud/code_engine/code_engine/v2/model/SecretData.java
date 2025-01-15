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
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Data container that allows to specify config parameters and their values as a key-value map. Each key field must
 * consist of alphanumeric characters, `-`, `_` or `.` and must not exceed a max length of 253 characters. Each value
 * field can consists of any character and must not exceed a max length of 1048576 characters.
 *
 * This type supports additional properties of type String.
 *
 * Classes which extend this class:
 * - SecretDataGenericSecretData
 * - SecretDataBasicAuthSecretData
 * - SecretDataRegistrySecretData
 * - SecretDataSSHSecretData
 * - SecretDataTLSSecretData
 */
public class SecretData extends DynamicModel<String> {

  @SerializedName("username")
  protected String username;
  @SerializedName("password")
  protected String password;
  @SerializedName("server")
  protected String server;
  @SerializedName("email")
  protected String email;
  @SerializedName("ssh_key")
  protected String sshKey;
  @SerializedName("known_hosts")
  protected String knownHosts;
  @SerializedName("tls_cert")
  protected String tlsCert;
  @SerializedName("tls_key")
  protected String tlsKey;

  protected SecretData() {
    super(new TypeToken<String>() { });
  }

  /**
   * Gets the username.
   *
   * Basic auth username.
   *
   * @return the username
   */
  public String getUsername() {
    return this.username;
  }

  /**
   * Gets the password.
   *
   * Basic auth password.
   *
   * @return the password
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * Gets the server.
   *
   * Registry server.
   *
   * @return the server
   */
  public String getServer() {
    return this.server;
  }

  /**
   * Gets the email.
   *
   * Registry email address.
   *
   * @return the email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Gets the sshKey.
   *
   * SSH key.
   *
   * @return the sshKey
   */
  public String getSshKey() {
    return this.sshKey;
  }

  /**
   * Gets the knownHosts.
   *
   * Known hosts.
   *
   * @return the knownHosts
   */
  public String getKnownHosts() {
    return this.knownHosts;
  }

  /**
   * Gets the tlsCert.
   *
   * The TLS certificate used in a TLS secret.
   *
   * @return the tlsCert
   */
  public String getTlsCert() {
    return this.tlsCert;
  }

  /**
   * Gets the tlsKey.
   *
   * The TLS key used in a TLS secret.
   *
   * @return the tlsKey
   */
  public String getTlsKey() {
    return this.tlsKey;
  }
}
