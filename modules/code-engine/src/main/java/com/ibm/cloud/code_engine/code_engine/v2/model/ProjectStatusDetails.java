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
 * Describes the model of a project status details.
 */
public class ProjectStatusDetails extends GenericModel {

  /**
   * Status of the domain created for the project.
   */
  public interface Domain {
    /** unknown. */
    String UNKNOWN = "unknown";
    /** ready. */
    String READY = "ready";
  }

  /**
   * Defines whether a project is enabled for management and consumption.
   */
  public interface Project {
    /** enabled. */
    String ENABLED = "enabled";
    /** disabled. */
    String DISABLED = "disabled";
  }

  /**
   * Status of the Virtual Private Endpoint that exposes the project on the IBM Cloud private network.
   */
  public interface Vpe {
    /** ready. */
    String READY = "ready";
    /** unknown. */
    String UNKNOWN = "unknown";
  }

  protected CbrStatus cbr;
  protected String domain;
  protected String project;
  protected String vpe;
  @SerializedName("vpe_not_enabled")
  protected Boolean vpeNotEnabled;

  protected ProjectStatusDetails() { }

  /**
   * Gets the cbr.
   *
   * Status of the Context-based-restriction configuration applicable for this project.
   *
   * @return the cbr
   */
  public CbrStatus getCbr() {
    return cbr;
  }

  /**
   * Gets the domain.
   *
   * Status of the domain created for the project.
   *
   * @return the domain
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Gets the project.
   *
   * Defines whether a project is enabled for management and consumption.
   *
   * @return the project
   */
  public String getProject() {
    return project;
  }

  /**
   * Gets the vpe.
   *
   * Status of the Virtual Private Endpoint that exposes the project on the IBM Cloud private network.
   *
   * @return the vpe
   */
  public String getVpe() {
    return vpe;
  }

  /**
   * Gets the vpeNotEnabled.
   *
   * Return true when project is not VPE enabled.
   *
   * @return the vpeNotEnabled
   */
  public Boolean isVpeNotEnabled() {
    return vpeNotEnabled;
  }
}

