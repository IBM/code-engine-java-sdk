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

import com.ibm.cloud.code_engine.code_engine.v2.model.RoleRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RoleRefPrototype model.
 */
public class RoleRefPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRoleRefPrototype() throws Throwable {
    RoleRefPrototype roleRefPrototypeModel = new RoleRefPrototype.Builder()
      .crn("crn:v1:bluemix:public:iam::::serviceRole:Writer")
      .build();
    assertEquals(roleRefPrototypeModel.crn(), "crn:v1:bluemix:public:iam::::serviceRole:Writer");

    String json = TestUtilities.serialize(roleRefPrototypeModel);

    RoleRefPrototype roleRefPrototypeModelNew = TestUtilities.deserialize(json, RoleRefPrototype.class);
    assertTrue(roleRefPrototypeModelNew instanceof RoleRefPrototype);
    assertEquals(roleRefPrototypeModelNew.crn(), "crn:v1:bluemix:public:iam::::serviceRole:Writer");
  }
}