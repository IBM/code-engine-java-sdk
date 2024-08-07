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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains a list of apps and pagination information.
 */
public class AppList extends GenericModel {

  protected List<App> apps;
  protected ListFirstMetadata first;
  protected Long limit;
  protected ListNextMetadata next;

  protected AppList() { }

  /**
   * Gets the apps.
   *
   * List of all apps.
   *
   * @return the apps
   */
  public List<App> getApps() {
    return apps;
  }

  /**
   * Gets the first.
   *
   * Describes properties needed to retrieve the first page of a result list.
   *
   * @return the first
   */
  public ListFirstMetadata getFirst() {
    return first;
  }

  /**
   * Gets the limit.
   *
   * Maximum number of resources per page.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the next.
   *
   * Describes properties needed to retrieve the next page of a result list.
   *
   * @return the next
   */
  public ListNextMetadata getNext() {
    return next;
  }
}

