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
package com.ibm.cloud.code_engine.code_engine.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Describes properties needed to retrieve the next page of a result list.
 */
public class ListNextMetadata extends GenericModel {

  protected String href;
  protected String start;

  protected ListNextMetadata() { }

  /**
   * Gets the href.
   *
   * Href that points to the next page.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the start.
   *
   * Token.
   *
   * @return the start
   */
  public String getStart() {
    return start;
  }
}

