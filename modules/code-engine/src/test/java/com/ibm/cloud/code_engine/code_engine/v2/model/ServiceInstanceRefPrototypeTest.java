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

import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceInstanceRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ServiceInstanceRefPrototype model.
 */
public class ServiceInstanceRefPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServiceInstanceRefPrototype() throws Throwable {
    ServiceInstanceRefPrototype serviceInstanceRefPrototypeModel = new ServiceInstanceRefPrototype.Builder()
      .id("4e49b3e0-27a8-48d2-a784-c7ee48bb863b")
      .build();
    assertEquals(serviceInstanceRefPrototypeModel.id(), "4e49b3e0-27a8-48d2-a784-c7ee48bb863b");

    String json = TestUtilities.serialize(serviceInstanceRefPrototypeModel);

    ServiceInstanceRefPrototype serviceInstanceRefPrototypeModelNew = TestUtilities.deserialize(json, ServiceInstanceRefPrototype.class);
    assertTrue(serviceInstanceRefPrototypeModelNew instanceof ServiceInstanceRefPrototype);
    assertEquals(serviceInstanceRefPrototypeModelNew.id(), "4e49b3e0-27a8-48d2-a784-c7ee48bb863b");
  }
}