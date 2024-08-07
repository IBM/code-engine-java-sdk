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

import com.ibm.cloud.code_engine.code_engine.v2.model.GetFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetFunctionOptions model.
 */
public class GetFunctionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetFunctionOptions() throws Throwable {
    GetFunctionOptions getFunctionOptionsModel = new GetFunctionOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-function")
      .build();
    assertEquals(getFunctionOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(getFunctionOptionsModel.name(), "my-function");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetFunctionOptionsError() throws Throwable {
    new GetFunctionOptions.Builder().build();
  }

}