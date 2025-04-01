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

import com.ibm.cloud.code_engine.code_engine.v2.model.CreateJobOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVarPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.VolumeMountPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateJobOptions model.
 */
public class CreateJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateJobOptions() throws Throwable {
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

    CreateJobOptions createJobOptionsModel = new CreateJobOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .imageReference("icr.io/codeengine/helloworld")
      .name("my-job")
      .imageSecret("my-secret")
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runComputeResourceTokenEnabled(true)
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
    assertEquals(createJobOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createJobOptionsModel.imageReference(), "icr.io/codeengine/helloworld");
    assertEquals(createJobOptionsModel.name(), "my-job");
    assertEquals(createJobOptionsModel.imageSecret(), "my-secret");
    assertEquals(createJobOptionsModel.runArguments(), java.util.Arrays.asList("testString"));
    assertEquals(createJobOptionsModel.runAsUser(), Long.valueOf("1001"));
    assertEquals(createJobOptionsModel.runCommands(), java.util.Arrays.asList("testString"));
    assertEquals(createJobOptionsModel.runComputeResourceTokenEnabled(), Boolean.valueOf(true));
    assertEquals(createJobOptionsModel.runEnvVariables(), java.util.Arrays.asList(envVarPrototypeModel));
    assertEquals(createJobOptionsModel.runMode(), "task");
    assertEquals(createJobOptionsModel.runServiceAccount(), "default");
    assertEquals(createJobOptionsModel.runVolumeMounts(), java.util.Arrays.asList(volumeMountPrototypeModel));
    assertEquals(createJobOptionsModel.scaleArraySpec(), "1-5,7-8,10");
    assertEquals(createJobOptionsModel.scaleCpuLimit(), "1");
    assertEquals(createJobOptionsModel.scaleEphemeralStorageLimit(), "4G");
    assertEquals(createJobOptionsModel.scaleMaxExecutionTime(), Long.valueOf("7200"));
    assertEquals(createJobOptionsModel.scaleMemoryLimit(), "4G");
    assertEquals(createJobOptionsModel.scaleRetryLimit(), Long.valueOf("3"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateJobOptionsError() throws Throwable {
    new CreateJobOptions.Builder().build();
  }

}