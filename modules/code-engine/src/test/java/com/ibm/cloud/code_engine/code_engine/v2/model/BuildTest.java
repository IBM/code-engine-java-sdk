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

import com.ibm.cloud.code_engine.code_engine.v2.model.Build;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildParam;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildStatus;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Build model.
 */
public class BuildTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBuild() throws Throwable {
    Build buildModel = new Build();
    assertNull(buildModel.getEntityTag());
    assertNull(buildModel.getName());
    assertNull(buildModel.getOutputImage());
    assertNull(buildModel.getOutputSecret());
    assertNull(buildModel.getRunBuildParams());
    assertNull(buildModel.getSourceContextDir());
    assertNull(buildModel.getSourceRevision());
    assertNull(buildModel.getSourceSecret());
    assertNull(buildModel.getSourceType());
    assertNull(buildModel.getSourceUrl());
    assertNull(buildModel.getStatusDetails());
    assertNull(buildModel.getStrategySize());
    assertNull(buildModel.getStrategySpecFile());
    assertNull(buildModel.getStrategyType());
    assertNull(buildModel.getTimeout());
  }
}