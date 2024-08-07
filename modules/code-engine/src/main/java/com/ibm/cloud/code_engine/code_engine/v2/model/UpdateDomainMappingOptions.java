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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateDomainMapping options.
 */
public class UpdateDomainMappingOptions extends GenericModel {

  protected String projectId;
  protected String name;
  protected String ifMatch;
  protected Map<String, Object> domainMapping;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String name;
    private String ifMatch;
    private Map<String, Object> domainMapping;

    /**
     * Instantiates a new Builder from an existing UpdateDomainMappingOptions instance.
     *
     * @param updateDomainMappingOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDomainMappingOptions updateDomainMappingOptions) {
      this.projectId = updateDomainMappingOptions.projectId;
      this.name = updateDomainMappingOptions.name;
      this.ifMatch = updateDomainMappingOptions.ifMatch;
      this.domainMapping = updateDomainMappingOptions.domainMapping;
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
     * @param name the name
     * @param ifMatch the ifMatch
     * @param domainMapping the domainMapping
     */
    public Builder(String projectId, String name, String ifMatch, Map<String, Object> domainMapping) {
      this.projectId = projectId;
      this.name = name;
      this.ifMatch = ifMatch;
      this.domainMapping = domainMapping;
    }

    /**
     * Builds a UpdateDomainMappingOptions.
     *
     * @return the new UpdateDomainMappingOptions instance
     */
    public UpdateDomainMappingOptions build() {
      return new UpdateDomainMappingOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the UpdateDomainMappingOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateDomainMappingOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateDomainMappingOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the domainMapping.
     *
     * @param domainMapping the domainMapping
     * @return the UpdateDomainMappingOptions builder
     */
    public Builder domainMapping(Map<String, Object> domainMapping) {
      this.domainMapping = domainMapping;
      return this;
    }
  }

  protected UpdateDomainMappingOptions() { }

  protected UpdateDomainMappingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.domainMapping,
      "domainMapping cannot be null");
    projectId = builder.projectId;
    name = builder.name;
    ifMatch = builder.ifMatch;
    domainMapping = builder.domainMapping;
  }

  /**
   * New builder.
   *
   * @return a UpdateDomainMappingOptions builder
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
   * Gets the name.
   *
   * The name of your domain mapping.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the ifMatch.
   *
   * Version of the domain mapping to be updated. Specify the version that you retrieved as entity_tag (ETag header)
   * when reading the domain mapping. This value helps identify parallel usage of this API. Pass * to indicate to update
   * any version available. This might result in stale updates.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the domainMapping.
   *
   * DomainMapping patch.
   *
   * @return the domainMapping
   */
  public Map<String, Object> domainMapping() {
    return domainMapping;
  }
}

