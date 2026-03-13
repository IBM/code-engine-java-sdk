/*
 * (C) Copyright IBM Corp. 2026.
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

import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype model.
 */
public class AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype() throws Throwable {
    AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModel = new AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.Builder()
      .type("cidr_block")
      .name("allow-all")
      .privatePathServiceGatewayCrn("testString")
      .isolationPolicy("shared")
      .build();
    assertEquals(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModel.type(), "cidr_block");
    assertEquals(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModel.name(), "allow-all");
    assertEquals(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModel.privatePathServiceGatewayCrn(), "testString");
    assertEquals(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModel.isolationPolicy(), "shared");

    String json = TestUtilities.serialize(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModel);

    AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModelNew = TestUtilities.deserialize(json, AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.class);
    assertTrue(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModelNew instanceof AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype);
    assertEquals(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModelNew.type(), "cidr_block");
    assertEquals(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModelNew.name(), "allow-all");
    assertEquals(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModelNew.privatePathServiceGatewayCrn(), "testString");
    assertEquals(allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeModelNew.isolationPolicy(), "shared");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototypeError() throws Throwable {
    new AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.Builder().build();
  }

}