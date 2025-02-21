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

import com.ibm.cloud.code_engine.code_engine.v2.model.BuildParamPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateBuildRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateBuildRunOptions model.
 */
public class CreateBuildRunOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateBuildRunOptions() throws Throwable {
    BuildParamPrototype buildParamPrototypeModel = new BuildParamPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();
    assertEquals(buildParamPrototypeModel.key(), "MY_VARIABLE");
    assertEquals(buildParamPrototypeModel.name(), "SOME");
    assertEquals(buildParamPrototypeModel.reference(), "my-secret");
    assertEquals(buildParamPrototypeModel.type(), "literal");
    assertEquals(buildParamPrototypeModel.value(), "VALUE");

    CreateBuildRunOptions createBuildRunOptionsModel = new CreateBuildRunOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .buildName("testString")
      .name("testString")
      .outputImage("private.de.icr.io/icr_namespace/image-name")
      .outputSecret("ce-auto-icr-private-eu-de")
      .runBuildParams(java.util.Arrays.asList(buildParamPrototypeModel))
      .serviceAccount("default")
      .sourceContextDir("some/subfolder")
      .sourceRevision("main")
      .sourceSecret("testString")
      .sourceType("git")
      .sourceUrl("https://github.com/IBM/CodeEngine")
      .strategySize("medium")
      .strategySpecFile("Dockerfile")
      .strategyType("dockerfile")
      .timeout(Long.valueOf("600"))
      .build();
    assertEquals(createBuildRunOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createBuildRunOptionsModel.buildName(), "testString");
    assertEquals(createBuildRunOptionsModel.name(), "testString");
    assertEquals(createBuildRunOptionsModel.outputImage(), "private.de.icr.io/icr_namespace/image-name");
    assertEquals(createBuildRunOptionsModel.outputSecret(), "ce-auto-icr-private-eu-de");
    assertEquals(createBuildRunOptionsModel.runBuildParams(), java.util.Arrays.asList(buildParamPrototypeModel));
    assertEquals(createBuildRunOptionsModel.serviceAccount(), "default");
    assertEquals(createBuildRunOptionsModel.sourceContextDir(), "some/subfolder");
    assertEquals(createBuildRunOptionsModel.sourceRevision(), "main");
    assertEquals(createBuildRunOptionsModel.sourceSecret(), "testString");
    assertEquals(createBuildRunOptionsModel.sourceType(), "git");
    assertEquals(createBuildRunOptionsModel.sourceUrl(), "https://github.com/IBM/CodeEngine");
    assertEquals(createBuildRunOptionsModel.strategySize(), "medium");
    assertEquals(createBuildRunOptionsModel.strategySpecFile(), "Dockerfile");
    assertEquals(createBuildRunOptionsModel.strategyType(), "dockerfile");
    assertEquals(createBuildRunOptionsModel.timeout(), Long.valueOf("600"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBuildRunOptionsError() throws Throwable {
    new CreateBuildRunOptions.Builder().build();
  }

}