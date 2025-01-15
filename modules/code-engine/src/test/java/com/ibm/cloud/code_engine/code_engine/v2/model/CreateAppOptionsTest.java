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

import com.ibm.cloud.code_engine.code_engine.v2.model.CreateAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVarPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProbePrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.VolumeMountPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateAppOptions model.
 */
public class CreateAppOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateAppOptions() throws Throwable {
    ProbePrototype probePrototypeModel = new ProbePrototype.Builder()
      .failureThreshold(Long.valueOf("5"))
      .initialDelay(Long.valueOf("5"))
      .interval(Long.valueOf("5"))
      .path("testString")
      .port(Long.valueOf("8080"))
      .timeout(Long.valueOf("300"))
      .type("tcp")
      .build();
    assertEquals(probePrototypeModel.failureThreshold(), Long.valueOf("5"));
    assertEquals(probePrototypeModel.initialDelay(), Long.valueOf("5"));
    assertEquals(probePrototypeModel.interval(), Long.valueOf("5"));
    assertEquals(probePrototypeModel.path(), "testString");
    assertEquals(probePrototypeModel.port(), Long.valueOf("8080"));
    assertEquals(probePrototypeModel.timeout(), Long.valueOf("300"));
    assertEquals(probePrototypeModel.type(), "tcp");

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

    CreateAppOptions createAppOptionsModel = new CreateAppOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .imageReference("icr.io/codeengine/helloworld")
      .name("my-app")
      .imagePort(Long.valueOf("8080"))
      .imageSecret("my-secret")
      .managedDomainMappings("local_public")
      .probeLiveness(probePrototypeModel)
      .probeReadiness(probePrototypeModel)
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleConcurrency(Long.valueOf("100"))
      .scaleConcurrencyTarget(Long.valueOf("80"))
      .scaleCpuLimit("1")
      .scaleDownDelay(Long.valueOf("300"))
      .scaleEphemeralStorageLimit("4G")
      .scaleInitialInstances(Long.valueOf("1"))
      .scaleMaxInstances(Long.valueOf("10"))
      .scaleMemoryLimit("4G")
      .scaleMinInstances(Long.valueOf("1"))
      .scaleRequestTimeout(Long.valueOf("300"))
      .build();
    assertEquals(createAppOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createAppOptionsModel.imageReference(), "icr.io/codeengine/helloworld");
    assertEquals(createAppOptionsModel.name(), "my-app");
    assertEquals(createAppOptionsModel.imagePort(), Long.valueOf("8080"));
    assertEquals(createAppOptionsModel.imageSecret(), "my-secret");
    assertEquals(createAppOptionsModel.managedDomainMappings(), "local_public");
    assertEquals(createAppOptionsModel.probeLiveness(), probePrototypeModel);
    assertEquals(createAppOptionsModel.probeReadiness(), probePrototypeModel);
    assertEquals(createAppOptionsModel.runArguments(), java.util.Arrays.asList("testString"));
    assertEquals(createAppOptionsModel.runAsUser(), Long.valueOf("1001"));
    assertEquals(createAppOptionsModel.runCommands(), java.util.Arrays.asList("testString"));
    assertEquals(createAppOptionsModel.runEnvVariables(), java.util.Arrays.asList(envVarPrototypeModel));
    assertEquals(createAppOptionsModel.runServiceAccount(), "default");
    assertEquals(createAppOptionsModel.runVolumeMounts(), java.util.Arrays.asList(volumeMountPrototypeModel));
    assertEquals(createAppOptionsModel.scaleConcurrency(), Long.valueOf("100"));
    assertEquals(createAppOptionsModel.scaleConcurrencyTarget(), Long.valueOf("80"));
    assertEquals(createAppOptionsModel.scaleCpuLimit(), "1");
    assertEquals(createAppOptionsModel.scaleDownDelay(), Long.valueOf("300"));
    assertEquals(createAppOptionsModel.scaleEphemeralStorageLimit(), "4G");
    assertEquals(createAppOptionsModel.scaleInitialInstances(), Long.valueOf("1"));
    assertEquals(createAppOptionsModel.scaleMaxInstances(), Long.valueOf("10"));
    assertEquals(createAppOptionsModel.scaleMemoryLimit(), "4G");
    assertEquals(createAppOptionsModel.scaleMinInstances(), Long.valueOf("1"));
    assertEquals(createAppOptionsModel.scaleRequestTimeout(), Long.valueOf("300"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAppOptionsError() throws Throwable {
    new CreateAppOptions.Builder().build();
  }

}