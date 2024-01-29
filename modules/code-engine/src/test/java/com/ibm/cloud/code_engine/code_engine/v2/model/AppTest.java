/*
 * (C) Copyright IBM Corp. 2024.
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

import com.ibm.cloud.code_engine.code_engine.v2.model.App;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppStatus;
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
 * Unit test class for the App model.
 */
public class AppTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testApp() throws Throwable {
    App appModel = new App();
    assertNull(appModel.getEntityTag());
    assertNull(appModel.getImagePort());
    assertNull(appModel.getImageReference());
    assertNull(appModel.getImageSecret());
    assertNull(appModel.getManagedDomainMappings());
    assertNull(appModel.getName());
    assertNull(appModel.getProbeLiveness());
    assertNull(appModel.getProbeReadiness());
    assertNull(appModel.getRunArguments());
    assertNull(appModel.getRunAsUser());
    assertNull(appModel.getRunCommands());
    assertNull(appModel.getRunEnvVariables());
    assertNull(appModel.getRunServiceAccount());
    assertNull(appModel.getRunVolumeMounts());
    assertNull(appModel.getScaleConcurrency());
    assertNull(appModel.getScaleConcurrencyTarget());
    assertNull(appModel.getScaleCpuLimit());
    assertNull(appModel.getScaleDownDelay());
    assertNull(appModel.getScaleEphemeralStorageLimit());
    assertNull(appModel.getScaleInitialInstances());
    assertNull(appModel.getScaleMaxInstances());
    assertNull(appModel.getScaleMemoryLimit());
    assertNull(appModel.getScaleMinInstances());
    assertNull(appModel.getScaleRequestTimeout());
    assertNull(appModel.getStatusDetails());
  }
}