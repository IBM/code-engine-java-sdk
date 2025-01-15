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

import com.ibm.cloud.code_engine.code_engine.v2.model.SecretDataBasicAuthSecretData;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretDataBasicAuthSecretData model.
 */
public class SecretDataBasicAuthSecretDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretDataBasicAuthSecretData() throws Throwable {
    SecretDataBasicAuthSecretData secretDataBasicAuthSecretDataModel = new SecretDataBasicAuthSecretData.Builder()
      .username("testString")
      .password("testString")
      .add("foo", "testString")
      .build();
    assertEquals(secretDataBasicAuthSecretDataModel.getUsername(), "testString");
    assertEquals(secretDataBasicAuthSecretDataModel.getPassword(), "testString");
    assertEquals(secretDataBasicAuthSecretDataModel.get("foo"), "testString");

    String json = TestUtilities.serialize(secretDataBasicAuthSecretDataModel);

    SecretDataBasicAuthSecretData secretDataBasicAuthSecretDataModelNew = TestUtilities.deserialize(json, SecretDataBasicAuthSecretData.class);
    assertTrue(secretDataBasicAuthSecretDataModelNew instanceof SecretDataBasicAuthSecretData);
    assertEquals(secretDataBasicAuthSecretDataModelNew.getUsername(), "testString");
    assertEquals(secretDataBasicAuthSecretDataModelNew.getPassword(), "testString");
    assertEquals(secretDataBasicAuthSecretDataModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecretDataBasicAuthSecretDataError() throws Throwable {
    new SecretDataBasicAuthSecretData.Builder().build();
  }

}