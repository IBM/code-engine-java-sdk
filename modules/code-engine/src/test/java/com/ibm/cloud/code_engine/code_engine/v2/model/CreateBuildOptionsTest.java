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

import com.ibm.cloud.code_engine.code_engine.v2.model.CreateBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateBuildOptions model.
 */
public class CreateBuildOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateBuildOptions() throws Throwable {
    CreateBuildOptions createBuildOptionsModel = new CreateBuildOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-build")
      .outputImage("private.de.icr.io/icr_namespace/image-name")
      .outputSecret("ce-auto-icr-private-eu-de")
      .strategyType("dockerfile")
      .sourceContextDir("some/subfolder")
      .sourceRevision("main")
      .sourceSecret("testString")
      .sourceType("git")
      .sourceUrl("https://github.com/IBM/CodeEngine")
      .strategySize("medium")
      .strategySpecFile("Dockerfile")
      .timeout(Long.valueOf("600"))
      .build();
    assertEquals(createBuildOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createBuildOptionsModel.name(), "my-build");
    assertEquals(createBuildOptionsModel.outputImage(), "private.de.icr.io/icr_namespace/image-name");
    assertEquals(createBuildOptionsModel.outputSecret(), "ce-auto-icr-private-eu-de");
    assertEquals(createBuildOptionsModel.strategyType(), "dockerfile");
    assertEquals(createBuildOptionsModel.sourceContextDir(), "some/subfolder");
    assertEquals(createBuildOptionsModel.sourceRevision(), "main");
    assertEquals(createBuildOptionsModel.sourceSecret(), "testString");
    assertEquals(createBuildOptionsModel.sourceType(), "git");
    assertEquals(createBuildOptionsModel.sourceUrl(), "https://github.com/IBM/CodeEngine");
    assertEquals(createBuildOptionsModel.strategySize(), "medium");
    assertEquals(createBuildOptionsModel.strategySpecFile(), "Dockerfile");
    assertEquals(createBuildOptionsModel.timeout(), Long.valueOf("600"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBuildOptionsError() throws Throwable {
    new CreateBuildOptions.Builder().build();
  }

}