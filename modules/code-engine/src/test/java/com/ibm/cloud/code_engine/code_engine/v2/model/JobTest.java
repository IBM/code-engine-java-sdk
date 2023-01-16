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

import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVar;
import com.ibm.cloud.code_engine.code_engine.v2.model.Job;
import com.ibm.cloud.code_engine.code_engine.v2.model.VolumeMount;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Job model.
 */
public class JobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJob() throws Throwable {
    Job jobModel = new Job();
    assertNull(jobModel.getCreatedAt());
    assertNull(jobModel.getEntityTag());
    assertNull(jobModel.getHref());
    assertNull(jobModel.getId());
    assertNull(jobModel.getImageReference());
    assertNull(jobModel.getImageSecret());
    assertNull(jobModel.getName());
    assertNull(jobModel.getProjectId());
    assertNull(jobModel.getResourceType());
    assertNull(jobModel.getRunArguments());
    assertNull(jobModel.getRunAsUser());
    assertNull(jobModel.getRunCommands());
    assertNull(jobModel.getRunEnvVariables());
    assertNull(jobModel.getRunMode());
    assertNull(jobModel.getRunServiceAccount());
    assertNull(jobModel.getRunVolumeMounts());
    assertNull(jobModel.getScaleArraySpec());
    assertNull(jobModel.getScaleCpuLimit());
    assertNull(jobModel.getScaleEphemeralStorageLimit());
    assertNull(jobModel.getScaleMaxExecutionTime());
    assertNull(jobModel.getScaleMemoryLimit());
    assertNull(jobModel.getScaleRetryLimit());
  }
}