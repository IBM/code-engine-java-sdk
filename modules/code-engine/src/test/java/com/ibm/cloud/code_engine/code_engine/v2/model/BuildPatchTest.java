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

import com.ibm.cloud.code_engine.code_engine.v2.model.BuildPatch;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BuildPatch model.
 */
public class BuildPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBuildPatch() throws Throwable {
    BuildPatch buildPatchModel = new BuildPatch.Builder()
      .outputImage("private.de.icr.io/icr_namespace/image-name")
      .outputSecret("ce-auto-icr-private-eu-de")
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
    assertEquals(buildPatchModel.outputImage(), "private.de.icr.io/icr_namespace/image-name");
    assertEquals(buildPatchModel.outputSecret(), "ce-auto-icr-private-eu-de");
    assertEquals(buildPatchModel.sourceContextDir(), "some/subfolder");
    assertEquals(buildPatchModel.sourceRevision(), "main");
    assertEquals(buildPatchModel.sourceSecret(), "testString");
    assertEquals(buildPatchModel.sourceType(), "git");
    assertEquals(buildPatchModel.sourceUrl(), "https://github.com/IBM/CodeEngine");
    assertEquals(buildPatchModel.strategySize(), "medium");
    assertEquals(buildPatchModel.strategySpecFile(), "Dockerfile");
    assertEquals(buildPatchModel.strategyType(), "dockerfile");
    assertEquals(buildPatchModel.timeout(), Long.valueOf("600"));

    String json = TestUtilities.serialize(buildPatchModel);

    BuildPatch buildPatchModelNew = TestUtilities.deserialize(json, BuildPatch.class);
    assertTrue(buildPatchModelNew instanceof BuildPatch);
    assertEquals(buildPatchModelNew.outputImage(), "private.de.icr.io/icr_namespace/image-name");
    assertEquals(buildPatchModelNew.outputSecret(), "ce-auto-icr-private-eu-de");
    assertEquals(buildPatchModelNew.sourceContextDir(), "some/subfolder");
    assertEquals(buildPatchModelNew.sourceRevision(), "main");
    assertEquals(buildPatchModelNew.sourceSecret(), "testString");
    assertEquals(buildPatchModelNew.sourceType(), "git");
    assertEquals(buildPatchModelNew.sourceUrl(), "https://github.com/IBM/CodeEngine");
    assertEquals(buildPatchModelNew.strategySize(), "medium");
    assertEquals(buildPatchModelNew.strategySpecFile(), "Dockerfile");
    assertEquals(buildPatchModelNew.strategyType(), "dockerfile");
    assertEquals(buildPatchModelNew.timeout(), Long.valueOf("600"));
  }
  @Test
  public void testBuildPatchAsPatch() throws Throwable {
    BuildPatch buildPatchModel = new BuildPatch.Builder()
      .outputImage("private.de.icr.io/icr_namespace/image-name")
      .outputSecret("ce-auto-icr-private-eu-de")
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

    Map<String, Object> mergePatch = buildPatchModel.asPatch();

    assertEquals(mergePatch.get("output_image"), "private.de.icr.io/icr_namespace/image-name");
    assertEquals(mergePatch.get("output_secret"), "ce-auto-icr-private-eu-de");
    assertEquals(mergePatch.get("source_context_dir"), "some/subfolder");
    assertEquals(mergePatch.get("source_revision"), "main");
    assertEquals(mergePatch.get("source_secret"), "testString");
    assertEquals(mergePatch.get("source_type"), "git");
    assertEquals(mergePatch.get("source_url"), "https://github.com/IBM/CodeEngine");
    assertEquals(mergePatch.get("strategy_size"), "medium");
    assertEquals(mergePatch.get("strategy_spec_file"), "Dockerfile");
    assertEquals(mergePatch.get("strategy_type"), "dockerfile");
    assertTrue(mergePatch.containsKey("timeout"));
  }

}