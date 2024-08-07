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

import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVarPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionPatch;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FunctionPatch model.
 */
public class FunctionPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFunctionPatch() throws Throwable {
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

    FunctionPatch functionPatchModel = new FunctionPatch.Builder()
      .codeBinary(false)
      .codeMain("main")
      .codeReference("data:text/plain;base64,<base64encoded-source-code>")
      .codeSecret("my-secret")
      .managedDomainMappings("local_public")
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runtime("nodejs-18")
      .scaleConcurrency(Long.valueOf("1"))
      .scaleCpuLimit("1")
      .scaleDownDelay(Long.valueOf("300"))
      .scaleMaxExecutionTime(Long.valueOf("60"))
      .scaleMemoryLimit("1G")
      .build();
    assertEquals(functionPatchModel.codeBinary(), Boolean.valueOf(false));
    assertEquals(functionPatchModel.codeMain(), "main");
    assertEquals(functionPatchModel.codeReference(), "data:text/plain;base64,<base64encoded-source-code>");
    assertEquals(functionPatchModel.codeSecret(), "my-secret");
    assertEquals(functionPatchModel.managedDomainMappings(), "local_public");
    assertEquals(functionPatchModel.runEnvVariables(), java.util.Arrays.asList(envVarPrototypeModel));
    assertEquals(functionPatchModel.runtime(), "nodejs-18");
    assertEquals(functionPatchModel.scaleConcurrency(), Long.valueOf("1"));
    assertEquals(functionPatchModel.scaleCpuLimit(), "1");
    assertEquals(functionPatchModel.scaleDownDelay(), Long.valueOf("300"));
    assertEquals(functionPatchModel.scaleMaxExecutionTime(), Long.valueOf("60"));
    assertEquals(functionPatchModel.scaleMemoryLimit(), "1G");

    String json = TestUtilities.serialize(functionPatchModel);

    FunctionPatch functionPatchModelNew = TestUtilities.deserialize(json, FunctionPatch.class);
    assertTrue(functionPatchModelNew instanceof FunctionPatch);
    assertEquals(functionPatchModelNew.codeBinary(), Boolean.valueOf(false));
    assertEquals(functionPatchModelNew.codeMain(), "main");
    assertEquals(functionPatchModelNew.codeReference(), "data:text/plain;base64,<base64encoded-source-code>");
    assertEquals(functionPatchModelNew.codeSecret(), "my-secret");
    assertEquals(functionPatchModelNew.managedDomainMappings(), "local_public");
    assertEquals(functionPatchModelNew.runtime(), "nodejs-18");
    assertEquals(functionPatchModelNew.scaleConcurrency(), Long.valueOf("1"));
    assertEquals(functionPatchModelNew.scaleCpuLimit(), "1");
    assertEquals(functionPatchModelNew.scaleDownDelay(), Long.valueOf("300"));
    assertEquals(functionPatchModelNew.scaleMaxExecutionTime(), Long.valueOf("60"));
    assertEquals(functionPatchModelNew.scaleMemoryLimit(), "1G");
  }
  @Test
  public void testFunctionPatchAsPatch() throws Throwable {
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();

    FunctionPatch functionPatchModel = new FunctionPatch.Builder()
      .codeBinary(false)
      .codeMain("main")
      .codeReference("data:text/plain;base64,<base64encoded-source-code>")
      .codeSecret("my-secret")
      .managedDomainMappings("local_public")
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runtime("nodejs-18")
      .scaleConcurrency(Long.valueOf("1"))
      .scaleCpuLimit("1")
      .scaleDownDelay(Long.valueOf("300"))
      .scaleMaxExecutionTime(Long.valueOf("60"))
      .scaleMemoryLimit("1G")
      .build();

    Map<String, Object> mergePatch = functionPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("code_binary"));
    assertEquals(mergePatch.get("code_main"), "main");
    assertEquals(mergePatch.get("code_reference"), "data:text/plain;base64,<base64encoded-source-code>");
    assertEquals(mergePatch.get("code_secret"), "my-secret");
    assertEquals(mergePatch.get("managed_domain_mappings"), "local_public");
    assertTrue(mergePatch.containsKey("run_env_variables"));
    assertEquals(mergePatch.get("runtime"), "nodejs-18");
    assertTrue(mergePatch.containsKey("scale_concurrency"));
    assertEquals(mergePatch.get("scale_cpu_limit"), "1");
    assertTrue(mergePatch.containsKey("scale_down_delay"));
    assertTrue(mergePatch.containsKey("scale_max_execution_time"));
    assertEquals(mergePatch.get("scale_memory_limit"), "1G");
  }

}