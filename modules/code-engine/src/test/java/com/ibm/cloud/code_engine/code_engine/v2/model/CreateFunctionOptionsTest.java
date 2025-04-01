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

import com.ibm.cloud.code_engine.code_engine.v2.model.CreateFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVarPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateFunctionOptions model.
 */
public class CreateFunctionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateFunctionOptions() throws Throwable {
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();
    assertEquals(envVarPrototypeModel.key(), "MY_VARIABLE");
    assertEquals(envVarPrototypeModel.name(), "SOME");
    assertEquals(envVarPrototypeModel.prefix(), "PREFIX_");
    assertEquals(envVarPrototypeModel.reference(), "my-secret");
    assertEquals(envVarPrototypeModel.type(), "literal");
    assertEquals(envVarPrototypeModel.value(), "VALUE");

    CreateFunctionOptions createFunctionOptionsModel = new CreateFunctionOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .codeReference("data:text/plain;base64,<base64encoded-source-code>")
      .name("my-function")
      .runtime("nodejs-20")
      .codeBinary(false)
      .codeMain("main")
      .codeSecret("my-secret")
      .managedDomainMappings("local_public")
      .runComputeResourceTokenEnabled(true)
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .scaleConcurrency(Long.valueOf("1"))
      .scaleCpuLimit("1")
      .scaleDownDelay(Long.valueOf("300"))
      .scaleMaxExecutionTime(Long.valueOf("60"))
      .scaleMemoryLimit("1G")
      .build();
    assertEquals(createFunctionOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createFunctionOptionsModel.codeReference(), "data:text/plain;base64,<base64encoded-source-code>");
    assertEquals(createFunctionOptionsModel.name(), "my-function");
    assertEquals(createFunctionOptionsModel.runtime(), "nodejs-20");
    assertEquals(createFunctionOptionsModel.codeBinary(), Boolean.valueOf(false));
    assertEquals(createFunctionOptionsModel.codeMain(), "main");
    assertEquals(createFunctionOptionsModel.codeSecret(), "my-secret");
    assertEquals(createFunctionOptionsModel.managedDomainMappings(), "local_public");
    assertEquals(createFunctionOptionsModel.runComputeResourceTokenEnabled(), Boolean.valueOf(true));
    assertEquals(createFunctionOptionsModel.runEnvVariables(), java.util.Arrays.asList(envVarPrototypeModel));
    assertEquals(createFunctionOptionsModel.scaleConcurrency(), Long.valueOf("1"));
    assertEquals(createFunctionOptionsModel.scaleCpuLimit(), "1");
    assertEquals(createFunctionOptionsModel.scaleDownDelay(), Long.valueOf("300"));
    assertEquals(createFunctionOptionsModel.scaleMaxExecutionTime(), Long.valueOf("60"));
    assertEquals(createFunctionOptionsModel.scaleMemoryLimit(), "1G");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateFunctionOptionsError() throws Throwable {
    new CreateFunctionOptions.Builder().build();
  }

}