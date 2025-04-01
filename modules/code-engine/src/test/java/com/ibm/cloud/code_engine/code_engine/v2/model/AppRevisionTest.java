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

import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevision;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevisionStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVar;
import com.ibm.cloud.code_engine.code_engine.v2.model.Probe;
import com.ibm.cloud.code_engine.code_engine.v2.model.VolumeMount;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AppRevision model.
 */
public class AppRevisionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAppRevision() throws Throwable {
    AppRevision appRevisionModel = new AppRevision();
    assertNull(appRevisionModel.getAppName());
    assertNull(appRevisionModel.getComputedEnvVariables());
    assertNull(appRevisionModel.getImagePort());
    assertNull(appRevisionModel.getImageReference());
    assertNull(appRevisionModel.getImageSecret());
    assertNull(appRevisionModel.getProbeLiveness());
    assertNull(appRevisionModel.getProbeReadiness());
    assertNull(appRevisionModel.getRunArguments());
    assertNull(appRevisionModel.getRunAsUser());
    assertNull(appRevisionModel.getRunCommands());
    assertNull(appRevisionModel.isRunComputeResourceTokenEnabled());
    assertNull(appRevisionModel.getRunEnvVariables());
    assertNull(appRevisionModel.getRunServiceAccount());
    assertNull(appRevisionModel.getRunVolumeMounts());
    assertNull(appRevisionModel.getScaleConcurrency());
    assertNull(appRevisionModel.getScaleConcurrencyTarget());
    assertNull(appRevisionModel.getScaleCpuLimit());
    assertNull(appRevisionModel.getScaleDownDelay());
    assertNull(appRevisionModel.getScaleEphemeralStorageLimit());
    assertNull(appRevisionModel.getScaleInitialInstances());
    assertNull(appRevisionModel.getScaleMaxInstances());
    assertNull(appRevisionModel.getScaleMemoryLimit());
    assertNull(appRevisionModel.getScaleMinInstances());
    assertNull(appRevisionModel.getScaleRequestTimeout());
    assertNull(appRevisionModel.getStatusDetails());
  }
}