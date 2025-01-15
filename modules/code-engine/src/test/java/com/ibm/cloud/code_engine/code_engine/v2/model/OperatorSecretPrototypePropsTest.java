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

import com.ibm.cloud.code_engine.code_engine.v2.model.OperatorSecretPrototypeProps;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceIDRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the OperatorSecretPrototypeProps model.
 */
public class OperatorSecretPrototypePropsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOperatorSecretPrototypeProps() throws Throwable {
    ServiceIDRefPrototype serviceIdRefPrototypeModel = new ServiceIDRefPrototype.Builder()
      .id("ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637")
      .build();
    assertEquals(serviceIdRefPrototypeModel.id(), "ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637");

    OperatorSecretPrototypeProps operatorSecretPrototypePropsModel = new OperatorSecretPrototypeProps.Builder()
      .resourceGroupIds(java.util.Arrays.asList("testString"))
      .serviceid(serviceIdRefPrototypeModel)
      .build();
    assertEquals(operatorSecretPrototypePropsModel.resourceGroupIds(), java.util.Arrays.asList("testString"));
    assertEquals(operatorSecretPrototypePropsModel.serviceid(), serviceIdRefPrototypeModel);

    String json = TestUtilities.serialize(operatorSecretPrototypePropsModel);

    OperatorSecretPrototypeProps operatorSecretPrototypePropsModelNew = TestUtilities.deserialize(json, OperatorSecretPrototypeProps.class);
    assertTrue(operatorSecretPrototypePropsModelNew instanceof OperatorSecretPrototypeProps);
    assertEquals(operatorSecretPrototypePropsModelNew.serviceid().toString(), serviceIdRefPrototypeModel.toString());
  }
}