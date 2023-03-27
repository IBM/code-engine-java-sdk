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

import com.ibm.cloud.code_engine.code_engine.v2.model.SecretDataRegistrySecretData;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretDataRegistrySecretData model.
 */
public class SecretDataRegistrySecretDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretDataRegistrySecretData() throws Throwable {
    SecretDataRegistrySecretData secretDataRegistrySecretDataModel = new SecretDataRegistrySecretData.Builder()
      .username("testString")
      .password("testString")
      .server("testString")
      .email("testString")
      .add("foo", "testString")
      .build();
    assertEquals(secretDataRegistrySecretDataModel.getUsername(), "testString");
    assertEquals(secretDataRegistrySecretDataModel.getPassword(), "testString");
    assertEquals(secretDataRegistrySecretDataModel.getServer(), "testString");
    assertEquals(secretDataRegistrySecretDataModel.getEmail(), "testString");
    assertEquals(secretDataRegistrySecretDataModel.get("foo"), "testString");

    String json = TestUtilities.serialize(secretDataRegistrySecretDataModel);

    SecretDataRegistrySecretData secretDataRegistrySecretDataModelNew = TestUtilities.deserialize(json, SecretDataRegistrySecretData.class);
    assertTrue(secretDataRegistrySecretDataModelNew instanceof SecretDataRegistrySecretData);
    assertEquals(secretDataRegistrySecretDataModelNew.getUsername(), "testString");
    assertEquals(secretDataRegistrySecretDataModelNew.getPassword(), "testString");
    assertEquals(secretDataRegistrySecretDataModelNew.getServer(), "testString");
    assertEquals(secretDataRegistrySecretDataModelNew.getEmail(), "testString");
    assertEquals(secretDataRegistrySecretDataModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecretDataRegistrySecretDataError() throws Throwable {
    new SecretDataRegistrySecretData.Builder().build();
  }

}