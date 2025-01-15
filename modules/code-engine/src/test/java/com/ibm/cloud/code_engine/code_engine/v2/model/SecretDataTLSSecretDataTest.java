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

import com.ibm.cloud.code_engine.code_engine.v2.model.SecretDataTLSSecretData;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretDataTLSSecretData model.
 */
public class SecretDataTLSSecretDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecretDataTLSSecretData() throws Throwable {
    SecretDataTLSSecretData secretDataTlsSecretDataModel = new SecretDataTLSSecretData.Builder()
      .tlsCert("testString")
      .tlsKey("testString")
      .add("foo", "testString")
      .build();
    assertEquals(secretDataTlsSecretDataModel.getTlsCert(), "testString");
    assertEquals(secretDataTlsSecretDataModel.getTlsKey(), "testString");
    assertEquals(secretDataTlsSecretDataModel.get("foo"), "testString");

    String json = TestUtilities.serialize(secretDataTlsSecretDataModel);

    SecretDataTLSSecretData secretDataTlsSecretDataModelNew = TestUtilities.deserialize(json, SecretDataTLSSecretData.class);
    assertTrue(secretDataTlsSecretDataModelNew instanceof SecretDataTLSSecretData);
    assertEquals(secretDataTlsSecretDataModelNew.getTlsCert(), "testString");
    assertEquals(secretDataTlsSecretDataModelNew.getTlsKey(), "testString");
    assertEquals(secretDataTlsSecretDataModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecretDataTLSSecretDataError() throws Throwable {
    new SecretDataTLSSecretData.Builder().build();
  }

}