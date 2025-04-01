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

import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVar;
import com.ibm.cloud.code_engine.code_engine.v2.model.Function;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionStatus;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Function model.
 */
public class FunctionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFunction() throws Throwable {
    Function functionModel = new Function();
    assertNull(functionModel.isCodeBinary());
    assertNull(functionModel.getCodeMain());
    assertNull(functionModel.getCodeReference());
    assertNull(functionModel.getCodeSecret());
    assertNull(functionModel.getComputedEnvVariables());
    assertNull(functionModel.getEntityTag());
    assertNull(functionModel.getManagedDomainMappings());
    assertNull(functionModel.getName());
    assertNull(functionModel.isRunComputeResourceTokenEnabled());
    assertNull(functionModel.getRunEnvVariables());
    assertNull(functionModel.getRuntime());
    assertNull(functionModel.getScaleConcurrency());
    assertNull(functionModel.getScaleCpuLimit());
    assertNull(functionModel.getScaleDownDelay());
    assertNull(functionModel.getScaleMaxExecutionTime());
    assertNull(functionModel.getScaleMemoryLimit());
    assertNull(functionModel.getStatusDetails());
  }
}