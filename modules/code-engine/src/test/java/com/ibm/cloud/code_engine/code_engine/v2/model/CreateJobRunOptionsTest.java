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

import com.ibm.cloud.code_engine.code_engine.v2.model.CreateJobRunOptions;
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
 * Unit test class for the CreateJobRunOptions model.
 */
public class CreateJobRunOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateJobRunOptions() throws Throwable {
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

    CreateJobRunOptions createJobRunOptionsModel = new CreateJobRunOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .imageReference("icr.io/codeengine/helloworld")
      .imageSecret("my-secret")
      .jobName("my-job")
      .name("my-job-run")
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runComputeResourceTokenEnabled(true)
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runMode("task")
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleArraySizeVariableOverride(Long.valueOf("2"))
      .scaleArraySpec("1-5,7-8,10")
      .scaleCpuLimit("1")
      .scaleEphemeralStorageLimit("4G")
      .scaleMaxExecutionTime(Long.valueOf("7200"))
      .scaleMemoryLimit("4G")
      .scaleRetryLimit(Long.valueOf("3"))
      .build();
    assertEquals(createJobRunOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createJobRunOptionsModel.imageReference(), "icr.io/codeengine/helloworld");
    assertEquals(createJobRunOptionsModel.imageSecret(), "my-secret");
    assertEquals(createJobRunOptionsModel.jobName(), "my-job");
    assertEquals(createJobRunOptionsModel.name(), "my-job-run");
    assertEquals(createJobRunOptionsModel.runArguments(), java.util.Arrays.asList("testString"));
    assertEquals(createJobRunOptionsModel.runAsUser(), Long.valueOf("1001"));
    assertEquals(createJobRunOptionsModel.runCommands(), java.util.Arrays.asList("testString"));
    assertEquals(createJobRunOptionsModel.runComputeResourceTokenEnabled(), Boolean.valueOf(true));
    assertEquals(createJobRunOptionsModel.runEnvVariables(), java.util.Arrays.asList(envVarPrototypeModel));
    assertEquals(createJobRunOptionsModel.runMode(), "task");
    assertEquals(createJobRunOptionsModel.runServiceAccount(), "default");
    assertEquals(createJobRunOptionsModel.runVolumeMounts(), java.util.Arrays.asList(volumeMountPrototypeModel));
    assertEquals(createJobRunOptionsModel.scaleArraySizeVariableOverride(), Long.valueOf("2"));
    assertEquals(createJobRunOptionsModel.scaleArraySpec(), "1-5,7-8,10");
    assertEquals(createJobRunOptionsModel.scaleCpuLimit(), "1");
    assertEquals(createJobRunOptionsModel.scaleEphemeralStorageLimit(), "4G");
    assertEquals(createJobRunOptionsModel.scaleMaxExecutionTime(), Long.valueOf("7200"));
    assertEquals(createJobRunOptionsModel.scaleMemoryLimit(), "4G");
    assertEquals(createJobRunOptionsModel.scaleRetryLimit(), Long.valueOf("3"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateJobRunOptionsError() throws Throwable {
    new CreateJobRunOptions.Builder().build();
  }

}