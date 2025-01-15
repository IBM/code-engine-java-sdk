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

import com.ibm.cloud.code_engine.code_engine.v2.model.ComponentRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateBindingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateBindingOptions model.
 */
public class CreateBindingOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateBindingOptions() throws Throwable {
    ComponentRef componentRefModel = new ComponentRef.Builder()
      .name("my-app-1")
      .resourceType("app_v2")
      .build();
    assertEquals(componentRefModel.name(), "my-app-1");
    assertEquals(componentRefModel.resourceType(), "app_v2");

    CreateBindingOptions createBindingOptionsModel = new CreateBindingOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .component(componentRefModel)
      .prefix("MY_COS")
      .secretName("my-service-access")
      .build();
    assertEquals(createBindingOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createBindingOptionsModel.component(), componentRefModel);
    assertEquals(createBindingOptionsModel.prefix(), "MY_COS");
    assertEquals(createBindingOptionsModel.secretName(), "my-service-access");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBindingOptionsError() throws Throwable {
    new CreateBindingOptions.Builder().build();
  }

}