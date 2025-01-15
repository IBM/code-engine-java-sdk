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
 * The listProjects options.
 */
public class ListProjectsOptions extends GenericModel {

  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListProjectsOptions instance.
     *
     * @param listProjectsOptions the instance to initialize the Builder with
     */
    private Builder(ListProjectsOptions listProjectsOptions) {
      this.limit = listProjectsOptions.limit;
      this.start = listProjectsOptions.start;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListProjectsOptions.
     *
     * @return the new ListProjectsOptions instance
     */
    public ListProjectsOptions build() {
      return new ListProjectsOptions(this);
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListProjectsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListProjectsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListProjectsOptions() { }

  protected ListProjectsOptions(Builder builder) {
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListProjectsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the limit.
   *
   * Optional maximum number of projects per page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the start.
   *
   * An optional token that indicates the beginning of the page of results to be returned. Any additional query
   * parameters are ignored if a page token is present. If omitted, the first page of results is returned. This value is
   * obtained from the 'start' query parameter in the `next` object of the operation response.
   *
   * @return the start
   */
  public String start() {
    return start;
  }
}

