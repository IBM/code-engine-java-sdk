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

package com.ibm.cloud.code_engine.code_engine.v1;

import com.ibm.cloud.code_engine.code_engine.v1.model.ProjectConfigGetOptions;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1ProjectKubeConfig;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains examples of how to use the Code Engine service.
 *
 * The following configuration properties are assumed to be defined:
 * CODE_ENGINE_URL=&lt;service base url&gt;
 * CODE_ENGINE_AUTH_TYPE=iam
 * CODE_ENGINE_APIKEY=&lt;IAM apikey&gt;
 * CODE_ENGINE_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class CodeEngineExamples {
  private static final Logger logger = LoggerFactory.getLogger(CodeEngineExamples.class);
  protected CodeEngineExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../code_engine_v1.env");
  }

  /**
   * The main() function invokes operations of the Code Engine service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    CodeEngine codeEngineService = CodeEngine.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(CodeEngine.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("projectConfigGet() result:");
      // begin-project_config_get
      ProjectConfigGetOptions projectConfigGetOptions = new ProjectConfigGetOptions.Builder()
        .xDelegatedRefreshToken("testString")
        .projectGuid("testString")
        .build();

      Response<V1ProjectKubeConfig> response = codeEngineService.projectConfigGet(projectConfigGetOptions).execute();
      V1ProjectKubeConfig v1ProjectKubeConfig = response.getResult();

      System.out.println(v1ProjectKubeConfig);
      // end-project_config_get
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
