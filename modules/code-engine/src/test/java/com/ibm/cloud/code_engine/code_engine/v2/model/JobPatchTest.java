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

import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVarPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.VolumeMountPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobPatch model.
 */
public class JobPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobPatch() throws Throwable {
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("MY_PROPERTY")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("OTHER")
      .build();
    assertEquals(envVarPrototypeModel.key(), "MY_VARIABLE");
    assertEquals(envVarPrototypeModel.name(), "MY_PROPERTY");
    assertEquals(envVarPrototypeModel.prefix(), "PREFIX_");
    assertEquals(envVarPrototypeModel.reference(), "my-secret");
    assertEquals(envVarPrototypeModel.type(), "literal");
    assertEquals(envVarPrototypeModel.value(), "OTHER");

    VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
      .mountPath("/app")
      .name("codeengine-mount-b69u90")
      .reference("my-secret")
      .type("secret")
      .build();
    assertEquals(volumeMountPrototypeModel.mountPath(), "/app");
    assertEquals(volumeMountPrototypeModel.name(), "codeengine-mount-b69u90");
    assertEquals(volumeMountPrototypeModel.reference(), "my-secret");
    assertEquals(volumeMountPrototypeModel.type(), "secret");

    JobPatch jobPatchModel = new JobPatch.Builder()
      .imageReference("icr.io/codeengine/helloworld")
      .imageSecret("my-secret")
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runMode("task")
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleArraySpec("1-5,7-8,10")
      .scaleCpuLimit("1")
      .scaleEphemeralStorageLimit("4G")
      .scaleMaxExecutionTime(Long.valueOf("7200"))
      .scaleMemoryLimit("4G")
      .scaleRetryLimit(Long.valueOf("3"))
      .build();
    assertEquals(jobPatchModel.imageReference(), "icr.io/codeengine/helloworld");
    assertEquals(jobPatchModel.imageSecret(), "my-secret");
    assertEquals(jobPatchModel.runArguments(), java.util.Arrays.asList("testString"));
    assertEquals(jobPatchModel.runAsUser(), Long.valueOf("1001"));
    assertEquals(jobPatchModel.runCommands(), java.util.Arrays.asList("testString"));
    assertEquals(jobPatchModel.runEnvVariables(), java.util.Arrays.asList(envVarPrototypeModel));
    assertEquals(jobPatchModel.runMode(), "task");
    assertEquals(jobPatchModel.runServiceAccount(), "default");
    assertEquals(jobPatchModel.runVolumeMounts(), java.util.Arrays.asList(volumeMountPrototypeModel));
    assertEquals(jobPatchModel.scaleArraySpec(), "1-5,7-8,10");
    assertEquals(jobPatchModel.scaleCpuLimit(), "1");
    assertEquals(jobPatchModel.scaleEphemeralStorageLimit(), "4G");
    assertEquals(jobPatchModel.scaleMaxExecutionTime(), Long.valueOf("7200"));
    assertEquals(jobPatchModel.scaleMemoryLimit(), "4G");
    assertEquals(jobPatchModel.scaleRetryLimit(), Long.valueOf("3"));

    String json = TestUtilities.serialize(jobPatchModel);

    JobPatch jobPatchModelNew = TestUtilities.deserialize(json, JobPatch.class);
    assertTrue(jobPatchModelNew instanceof JobPatch);
    assertEquals(jobPatchModelNew.imageReference(), "icr.io/codeengine/helloworld");
    assertEquals(jobPatchModelNew.imageSecret(), "my-secret");
    assertEquals(jobPatchModelNew.runAsUser(), Long.valueOf("1001"));
    assertEquals(jobPatchModelNew.runMode(), "task");
    assertEquals(jobPatchModelNew.runServiceAccount(), "default");
    assertEquals(jobPatchModelNew.scaleArraySpec(), "1-5,7-8,10");
    assertEquals(jobPatchModelNew.scaleCpuLimit(), "1");
    assertEquals(jobPatchModelNew.scaleEphemeralStorageLimit(), "4G");
    assertEquals(jobPatchModelNew.scaleMaxExecutionTime(), Long.valueOf("7200"));
    assertEquals(jobPatchModelNew.scaleMemoryLimit(), "4G");
    assertEquals(jobPatchModelNew.scaleRetryLimit(), Long.valueOf("3"));
  }
  @Test
  public void testJobPatchAsPatch() throws Throwable {
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("MY_PROPERTY")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("OTHER")
      .build();

    VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
      .mountPath("/app")
      .name("codeengine-mount-b69u90")
      .reference("my-secret")
      .type("secret")
      .build();

    JobPatch jobPatchModel = new JobPatch.Builder()
      .imageReference("icr.io/codeengine/helloworld")
      .imageSecret("my-secret")
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runMode("task")
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleArraySpec("1-5,7-8,10")
      .scaleCpuLimit("1")
      .scaleEphemeralStorageLimit("4G")
      .scaleMaxExecutionTime(Long.valueOf("7200"))
      .scaleMemoryLimit("4G")
      .scaleRetryLimit(Long.valueOf("3"))
      .build();

    Map<String, Object> mergePatch = jobPatchModel.asPatch();

    assertEquals(mergePatch.get("image_reference"), "icr.io/codeengine/helloworld");
    assertEquals(mergePatch.get("image_secret"), "my-secret");
    assertTrue(mergePatch.containsKey("run_arguments"));
    assertTrue(mergePatch.containsKey("run_as_user"));
    assertTrue(mergePatch.containsKey("run_commands"));
    assertTrue(mergePatch.containsKey("run_env_variables"));
    assertEquals(mergePatch.get("run_mode"), "task");
    assertEquals(mergePatch.get("run_service_account"), "default");
    assertTrue(mergePatch.containsKey("run_volume_mounts"));
    assertEquals(mergePatch.get("scale_array_spec"), "1-5,7-8,10");
    assertEquals(mergePatch.get("scale_cpu_limit"), "1");
    assertEquals(mergePatch.get("scale_ephemeral_storage_limit"), "4G");
    assertTrue(mergePatch.containsKey("scale_max_execution_time"));
    assertEquals(mergePatch.get("scale_memory_limit"), "4G");
    assertTrue(mergePatch.containsKey("scale_retry_limit"));
  }

}