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

import com.ibm.cloud.code_engine.code_engine.v2.model.StorageDataObjectStorageData;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the StorageDataObjectStorageData model.
 */
public class StorageDataObjectStorageDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStorageDataObjectStorageData() throws Throwable {
    StorageDataObjectStorageData storageDataObjectStorageDataModel = new StorageDataObjectStorageData.Builder()
      .bucketLocation("testString")
      .bucketName("testString")
      .secretName("testString")
      .add("foo", "testString")
      .build();
    assertEquals(storageDataObjectStorageDataModel.getBucketLocation(), "testString");
    assertEquals(storageDataObjectStorageDataModel.getBucketName(), "testString");
    assertEquals(storageDataObjectStorageDataModel.getSecretName(), "testString");
    assertEquals(storageDataObjectStorageDataModel.get("foo"), "testString");

    String json = TestUtilities.serialize(storageDataObjectStorageDataModel);

    StorageDataObjectStorageData storageDataObjectStorageDataModelNew = TestUtilities.deserialize(json, StorageDataObjectStorageData.class);
    assertTrue(storageDataObjectStorageDataModelNew instanceof StorageDataObjectStorageData);
    assertEquals(storageDataObjectStorageDataModelNew.getBucketLocation(), "testString");
    assertEquals(storageDataObjectStorageDataModelNew.getBucketName(), "testString");
    assertEquals(storageDataObjectStorageDataModelNew.getSecretName(), "testString");
    assertEquals(storageDataObjectStorageDataModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStorageDataObjectStorageDataError() throws Throwable {
    new StorageDataObjectStorageData.Builder().build();
  }

}