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

import com.ibm.cloud.code_engine.code_engine.v2.model.VolumeMountPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumeMountPrototype model.
 */
public class VolumeMountPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeMountPrototype() throws Throwable {
    VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
      .mountPath("/app")
      .name("codeengine-mount-b69u90")
      .readOnly(true)
      .reference("my-secret")
      .subPath("some-path")
      .type("secret")
      .build();
    assertEquals(volumeMountPrototypeModel.mountPath(), "/app");
    assertEquals(volumeMountPrototypeModel.name(), "codeengine-mount-b69u90");
    assertEquals(volumeMountPrototypeModel.readOnly(), Boolean.valueOf(true));
    assertEquals(volumeMountPrototypeModel.reference(), "my-secret");
    assertEquals(volumeMountPrototypeModel.subPath(), "some-path");
    assertEquals(volumeMountPrototypeModel.type(), "secret");

    String json = TestUtilities.serialize(volumeMountPrototypeModel);

    VolumeMountPrototype volumeMountPrototypeModelNew = TestUtilities.deserialize(json, VolumeMountPrototype.class);
    assertTrue(volumeMountPrototypeModelNew instanceof VolumeMountPrototype);
    assertEquals(volumeMountPrototypeModelNew.mountPath(), "/app");
    assertEquals(volumeMountPrototypeModelNew.name(), "codeengine-mount-b69u90");
    assertEquals(volumeMountPrototypeModelNew.readOnly(), Boolean.valueOf(true));
    assertEquals(volumeMountPrototypeModelNew.reference(), "my-secret");
    assertEquals(volumeMountPrototypeModelNew.subPath(), "some-path");
    assertEquals(volumeMountPrototypeModelNew.type(), "secret");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumeMountPrototypeError() throws Throwable {
    new VolumeMountPrototype.Builder().build();
  }

}