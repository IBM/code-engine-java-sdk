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

import com.ibm.cloud.code_engine.code_engine.v2.model.BuildParamPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BuildParamPrototype model.
 */
public class BuildParamPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBuildParamPrototype() throws Throwable {
    BuildParamPrototype buildParamPrototypeModel = new BuildParamPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();
    assertEquals(buildParamPrototypeModel.key(), "MY_VARIABLE");
    assertEquals(buildParamPrototypeModel.name(), "SOME");
    assertEquals(buildParamPrototypeModel.reference(), "my-secret");
    assertEquals(buildParamPrototypeModel.type(), "literal");
    assertEquals(buildParamPrototypeModel.value(), "VALUE");

    String json = TestUtilities.serialize(buildParamPrototypeModel);

    BuildParamPrototype buildParamPrototypeModelNew = TestUtilities.deserialize(json, BuildParamPrototype.class);
    assertTrue(buildParamPrototypeModelNew instanceof BuildParamPrototype);
    assertEquals(buildParamPrototypeModelNew.key(), "MY_VARIABLE");
    assertEquals(buildParamPrototypeModelNew.name(), "SOME");
    assertEquals(buildParamPrototypeModelNew.reference(), "my-secret");
    assertEquals(buildParamPrototypeModelNew.type(), "literal");
    assertEquals(buildParamPrototypeModelNew.value(), "VALUE");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBuildParamPrototypeError() throws Throwable {
    new BuildParamPrototype.Builder().build();
  }

}