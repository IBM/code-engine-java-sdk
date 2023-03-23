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

import com.ibm.cloud.code_engine.code_engine.v2.model.CreateConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateConfigMapOptions model.
 */
public class CreateConfigMapOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateConfigMapOptions() throws Throwable {
    CreateConfigMapOptions createConfigMapOptionsModel = new CreateConfigMapOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-config-map")
      .data(java.util.Collections.singletonMap("foo", "testString"))
      .build();
    assertEquals(createConfigMapOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createConfigMapOptionsModel.name(), "my-config-map");
    assertEquals(createConfigMapOptionsModel.data(), java.util.Collections.singletonMap("foo", "testString"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigMapOptionsError() throws Throwable {
    new CreateConfigMapOptions.Builder().build();
  }

}