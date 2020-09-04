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

package com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1;

import com.ibm.cloud.code_engine.ibm_cloud_code_engine.v1.model.ListKubeconfigOptions;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IbmCloudCodeEngineExamples {
  private static final Logger logger = LoggerFactory.getLogger(IbmCloudCodeEngineExamples.class);
  protected IbmCloudCodeEngineExamples() { }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    IbmCloudCodeEngine service = IbmCloudCodeEngine.newInstance();

    try {
    // begin-list_kubeconfig
      ListKubeconfigOptions listKubeconfigOptions = new ListKubeconfigOptions.Builder()
      .refreshToken("testString")
      .id("testString")
      .build();

      service.listKubeconfig(listKubeconfigOptions).execute().getResult();
    // end-list_kubeconfig
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

  }
}
