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
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ComponentRef model.
 */
public class ComponentRefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testComponentRef() throws Throwable {
    ComponentRef componentRefModel = new ComponentRef.Builder()
      .name("my-app-1")
      .resourceType("app_v2")
      .build();
    assertEquals(componentRefModel.name(), "my-app-1");
    assertEquals(componentRefModel.resourceType(), "app_v2");

    String json = TestUtilities.serialize(componentRefModel);

    ComponentRef componentRefModelNew = TestUtilities.deserialize(json, ComponentRef.class);
    assertTrue(componentRefModelNew instanceof ComponentRef);
    assertEquals(componentRefModelNew.name(), "my-app-1");
    assertEquals(componentRefModelNew.resourceType(), "app_v2");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testComponentRefError() throws Throwable {
    new ComponentRef.Builder().build();
  }

}