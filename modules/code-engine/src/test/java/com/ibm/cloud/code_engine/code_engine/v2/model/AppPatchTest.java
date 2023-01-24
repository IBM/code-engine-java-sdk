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

import com.ibm.cloud.code_engine.code_engine.v2.model.AppPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVarPrototype;
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
 * Unit test class for the AppPatch model.
 */
public class AppPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAppPatch() throws Throwable {
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

    AppPatch appPatchModel = new AppPatch.Builder()
      .imagePort(Long.valueOf("8080"))
      .imageReference("icr.io/codeengine/helloworld")
      .imageSecret("my-secret")
      .managedDomainMappings("local_public")
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleConcurrency(Long.valueOf("100"))
      .scaleConcurrencyTarget(Long.valueOf("80"))
      .scaleCpuLimit("1")
      .scaleEphemeralStorageLimit("4G")
      .scaleInitialInstances(Long.valueOf("1"))
      .scaleMaxInstances(Long.valueOf("10"))
      .scaleMemoryLimit("4G")
      .scaleMinInstances(Long.valueOf("1"))
      .scaleRequestTimeout(Long.valueOf("300"))
      .build();
    assertEquals(appPatchModel.imagePort(), Long.valueOf("8080"));
    assertEquals(appPatchModel.imageReference(), "icr.io/codeengine/helloworld");
    assertEquals(appPatchModel.imageSecret(), "my-secret");
    assertEquals(appPatchModel.managedDomainMappings(), "local_public");
    assertEquals(appPatchModel.runArguments(), java.util.Arrays.asList("testString"));
    assertEquals(appPatchModel.runAsUser(), Long.valueOf("1001"));
    assertEquals(appPatchModel.runCommands(), java.util.Arrays.asList("testString"));
    assertEquals(appPatchModel.runEnvVariables(), java.util.Arrays.asList(envVarPrototypeModel));
    assertEquals(appPatchModel.runServiceAccount(), "default");
    assertEquals(appPatchModel.runVolumeMounts(), java.util.Arrays.asList(volumeMountPrototypeModel));
    assertEquals(appPatchModel.scaleConcurrency(), Long.valueOf("100"));
    assertEquals(appPatchModel.scaleConcurrencyTarget(), Long.valueOf("80"));
    assertEquals(appPatchModel.scaleCpuLimit(), "1");
    assertEquals(appPatchModel.scaleEphemeralStorageLimit(), "4G");
    assertEquals(appPatchModel.scaleInitialInstances(), Long.valueOf("1"));
    assertEquals(appPatchModel.scaleMaxInstances(), Long.valueOf("10"));
    assertEquals(appPatchModel.scaleMemoryLimit(), "4G");
    assertEquals(appPatchModel.scaleMinInstances(), Long.valueOf("1"));
    assertEquals(appPatchModel.scaleRequestTimeout(), Long.valueOf("300"));

    String json = TestUtilities.serialize(appPatchModel);

    AppPatch appPatchModelNew = TestUtilities.deserialize(json, AppPatch.class);
    assertTrue(appPatchModelNew instanceof AppPatch);
    assertEquals(appPatchModelNew.imagePort(), Long.valueOf("8080"));
    assertEquals(appPatchModelNew.imageReference(), "icr.io/codeengine/helloworld");
    assertEquals(appPatchModelNew.imageSecret(), "my-secret");
    assertEquals(appPatchModelNew.managedDomainMappings(), "local_public");
    assertEquals(appPatchModelNew.runAsUser(), Long.valueOf("1001"));
    assertEquals(appPatchModelNew.runServiceAccount(), "default");
    assertEquals(appPatchModelNew.scaleConcurrency(), Long.valueOf("100"));
    assertEquals(appPatchModelNew.scaleConcurrencyTarget(), Long.valueOf("80"));
    assertEquals(appPatchModelNew.scaleCpuLimit(), "1");
    assertEquals(appPatchModelNew.scaleEphemeralStorageLimit(), "4G");
    assertEquals(appPatchModelNew.scaleInitialInstances(), Long.valueOf("1"));
    assertEquals(appPatchModelNew.scaleMaxInstances(), Long.valueOf("10"));
    assertEquals(appPatchModelNew.scaleMemoryLimit(), "4G");
    assertEquals(appPatchModelNew.scaleMinInstances(), Long.valueOf("1"));
    assertEquals(appPatchModelNew.scaleRequestTimeout(), Long.valueOf("300"));
  }
  @Test
  public void testAppPatchAsPatch() throws Throwable {
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();

    VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
      .mountPath("/app")
      .name("codeengine-mount-b69u90")
      .reference("my-secret")
      .type("secret")
      .build();

    AppPatch appPatchModel = new AppPatch.Builder()
      .imagePort(Long.valueOf("8080"))
      .imageReference("icr.io/codeengine/helloworld")
      .imageSecret("my-secret")
      .managedDomainMappings("local_public")
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleConcurrency(Long.valueOf("100"))
      .scaleConcurrencyTarget(Long.valueOf("80"))
      .scaleCpuLimit("1")
      .scaleEphemeralStorageLimit("4G")
      .scaleInitialInstances(Long.valueOf("1"))
      .scaleMaxInstances(Long.valueOf("10"))
      .scaleMemoryLimit("4G")
      .scaleMinInstances(Long.valueOf("1"))
      .scaleRequestTimeout(Long.valueOf("300"))
      .build();

    Map<String, Object> mergePatch = appPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("image_port"));
    assertEquals(mergePatch.get("image_reference"), "icr.io/codeengine/helloworld");
    assertEquals(mergePatch.get("image_secret"), "my-secret");
    assertEquals(mergePatch.get("managed_domain_mappings"), "local_public");
    assertTrue(mergePatch.containsKey("run_arguments"));
    assertTrue(mergePatch.containsKey("run_as_user"));
    assertTrue(mergePatch.containsKey("run_commands"));
    assertTrue(mergePatch.containsKey("run_env_variables"));
    assertEquals(mergePatch.get("run_service_account"), "default");
    assertTrue(mergePatch.containsKey("run_volume_mounts"));
    assertTrue(mergePatch.containsKey("scale_concurrency"));
    assertTrue(mergePatch.containsKey("scale_concurrency_target"));
    assertEquals(mergePatch.get("scale_cpu_limit"), "1");
    assertEquals(mergePatch.get("scale_ephemeral_storage_limit"), "4G");
    assertTrue(mergePatch.containsKey("scale_initial_instances"));
    assertTrue(mergePatch.containsKey("scale_max_instances"));
    assertEquals(mergePatch.get("scale_memory_limit"), "4G");
    assertTrue(mergePatch.containsKey("scale_min_instances"));
    assertTrue(mergePatch.containsKey("scale_request_timeout"));
  }

}