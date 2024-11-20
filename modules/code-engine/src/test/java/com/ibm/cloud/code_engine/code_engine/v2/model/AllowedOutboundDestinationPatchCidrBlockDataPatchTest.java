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

import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationPatchCidrBlockDataPatch;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AllowedOutboundDestinationPatchCidrBlockDataPatch model.
 */
public class AllowedOutboundDestinationPatchCidrBlockDataPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAllowedOutboundDestinationPatchCidrBlockDataPatch() throws Throwable {
    AllowedOutboundDestinationPatchCidrBlockDataPatch allowedOutboundDestinationPatchCidrBlockDataPatchModel = new AllowedOutboundDestinationPatchCidrBlockDataPatch.Builder()
      .type("cidr_block")
      .cidrBlock("testString")
      .build();
    assertEquals(allowedOutboundDestinationPatchCidrBlockDataPatchModel.type(), "cidr_block");
    assertEquals(allowedOutboundDestinationPatchCidrBlockDataPatchModel.cidrBlock(), "testString");

    String json = TestUtilities.serialize(allowedOutboundDestinationPatchCidrBlockDataPatchModel);

    AllowedOutboundDestinationPatchCidrBlockDataPatch allowedOutboundDestinationPatchCidrBlockDataPatchModelNew = TestUtilities.deserialize(json, AllowedOutboundDestinationPatchCidrBlockDataPatch.class);
    assertTrue(allowedOutboundDestinationPatchCidrBlockDataPatchModelNew instanceof AllowedOutboundDestinationPatchCidrBlockDataPatch);
    assertEquals(allowedOutboundDestinationPatchCidrBlockDataPatchModelNew.type(), "cidr_block");
    assertEquals(allowedOutboundDestinationPatchCidrBlockDataPatchModelNew.cidrBlock(), "testString");
  }
  @Test
  public void testAllowedOutboundDestinationPatchCidrBlockDataPatchAsPatch() throws Throwable {
    AllowedOutboundDestinationPatchCidrBlockDataPatch allowedOutboundDestinationPatchCidrBlockDataPatchModel = new AllowedOutboundDestinationPatchCidrBlockDataPatch.Builder()
      .type("cidr_block")
      .cidrBlock("testString")
      .build();

    Map<String, Object> mergePatch = allowedOutboundDestinationPatchCidrBlockDataPatchModel.asPatch();

    assertEquals(mergePatch.get("type"), "cidr_block");
    assertEquals(mergePatch.get("cidr_block"), "testString");
  }

}