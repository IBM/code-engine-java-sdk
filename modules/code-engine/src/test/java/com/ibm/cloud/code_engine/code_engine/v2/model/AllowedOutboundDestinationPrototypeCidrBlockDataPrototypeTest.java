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

import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationPrototypeCidrBlockDataPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AllowedOutboundDestinationPrototypeCidrBlockDataPrototype model.
 */
public class AllowedOutboundDestinationPrototypeCidrBlockDataPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAllowedOutboundDestinationPrototypeCidrBlockDataPrototype() throws Throwable {
    AllowedOutboundDestinationPrototypeCidrBlockDataPrototype allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModel = new AllowedOutboundDestinationPrototypeCidrBlockDataPrototype.Builder()
      .type("cidr_block")
      .cidrBlock("testString")
      .name("testString")
      .build();
    assertEquals(allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModel.type(), "cidr_block");
    assertEquals(allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModel.cidrBlock(), "testString");
    assertEquals(allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModel.name(), "testString");

    String json = TestUtilities.serialize(allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModel);

    AllowedOutboundDestinationPrototypeCidrBlockDataPrototype allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModelNew = TestUtilities.deserialize(json, AllowedOutboundDestinationPrototypeCidrBlockDataPrototype.class);
    assertTrue(allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModelNew instanceof AllowedOutboundDestinationPrototypeCidrBlockDataPrototype);
    assertEquals(allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModelNew.type(), "cidr_block");
    assertEquals(allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModelNew.cidrBlock(), "testString");
    assertEquals(allowedOutboundDestinationPrototypeCidrBlockDataPrototypeModelNew.name(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAllowedOutboundDestinationPrototypeCidrBlockDataPrototypeError() throws Throwable {
    new AllowedOutboundDestinationPrototypeCidrBlockDataPrototype.Builder().build();
  }

}