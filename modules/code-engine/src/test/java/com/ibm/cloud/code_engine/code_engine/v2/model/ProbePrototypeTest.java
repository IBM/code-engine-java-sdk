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

import com.ibm.cloud.code_engine.code_engine.v2.model.ProbePrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ProbePrototype model.
 */
public class ProbePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testProbePrototype() throws Throwable {
    ProbePrototype probePrototypeModel = new ProbePrototype.Builder()
      .failureThreshold(Long.valueOf("5"))
      .initialDelay(Long.valueOf("5"))
      .interval(Long.valueOf("5"))
      .path("testString")
      .port(Long.valueOf("8080"))
      .timeout(Long.valueOf("300"))
      .type("tcp")
      .build();
    assertEquals(probePrototypeModel.failureThreshold(), Long.valueOf("5"));
    assertEquals(probePrototypeModel.initialDelay(), Long.valueOf("5"));
    assertEquals(probePrototypeModel.interval(), Long.valueOf("5"));
    assertEquals(probePrototypeModel.path(), "testString");
    assertEquals(probePrototypeModel.port(), Long.valueOf("8080"));
    assertEquals(probePrototypeModel.timeout(), Long.valueOf("300"));
    assertEquals(probePrototypeModel.type(), "tcp");

    String json = TestUtilities.serialize(probePrototypeModel);

    ProbePrototype probePrototypeModelNew = TestUtilities.deserialize(json, ProbePrototype.class);
    assertTrue(probePrototypeModelNew instanceof ProbePrototype);
    assertEquals(probePrototypeModelNew.failureThreshold(), Long.valueOf("5"));
    assertEquals(probePrototypeModelNew.initialDelay(), Long.valueOf("5"));
    assertEquals(probePrototypeModelNew.interval(), Long.valueOf("5"));
    assertEquals(probePrototypeModelNew.path(), "testString");
    assertEquals(probePrototypeModelNew.port(), Long.valueOf("8080"));
    assertEquals(probePrototypeModelNew.timeout(), Long.valueOf("300"));
    assertEquals(probePrototypeModelNew.type(), "tcp");
  }
}