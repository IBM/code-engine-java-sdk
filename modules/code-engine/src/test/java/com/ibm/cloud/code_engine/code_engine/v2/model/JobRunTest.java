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

import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVar;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRun;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRunStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.VolumeMount;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobRun model.
 */
public class JobRunTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobRun() throws Throwable {
    JobRun jobRunModel = new JobRun();
    assertNull(jobRunModel.getComputedEnvVariables());
    assertNull(jobRunModel.getImageReference());
    assertNull(jobRunModel.getImageSecret());
    assertNull(jobRunModel.getJobName());
    assertNull(jobRunModel.getName());
    assertNull(jobRunModel.getRunArguments());
    assertNull(jobRunModel.getRunAsUser());
    assertNull(jobRunModel.getRunCommands());
    assertNull(jobRunModel.getRunEnvVariables());
    assertNull(jobRunModel.getRunMode());
    assertNull(jobRunModel.getRunServiceAccount());
    assertNull(jobRunModel.getRunVolumeMounts());
    assertNull(jobRunModel.getScaleArraySizeVariableOverride());
    assertNull(jobRunModel.getScaleArraySpec());
    assertNull(jobRunModel.getScaleCpuLimit());
    assertNull(jobRunModel.getScaleEphemeralStorageLimit());
    assertNull(jobRunModel.getScaleMaxExecutionTime());
    assertNull(jobRunModel.getScaleMemoryLimit());
    assertNull(jobRunModel.getScaleRetryLimit());
    assertNull(jobRunModel.getStatusDetails());
  }
}