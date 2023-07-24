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

import com.ibm.cloud.code_engine.code_engine.v2.model.ResourceKeyRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.RoleRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceAccessSecretPrototypeProps;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceIDRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceInstanceRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ServiceAccessSecretPrototypeProps model.
 */
public class ServiceAccessSecretPrototypePropsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServiceAccessSecretPrototypeProps() throws Throwable {
    ResourceKeyRefPrototype resourceKeyRefPrototypeModel = new ResourceKeyRefPrototype.Builder()
      .id("4e49b3e0-27a8-48d2-a784-c7ee48bb863b")
      .build();
    assertEquals(resourceKeyRefPrototypeModel.id(), "4e49b3e0-27a8-48d2-a784-c7ee48bb863b");

    RoleRefPrototype roleRefPrototypeModel = new RoleRefPrototype.Builder()
      .crn("crn:v1:bluemix:public:iam::::serviceRole:Writer")
      .build();
    assertEquals(roleRefPrototypeModel.crn(), "crn:v1:bluemix:public:iam::::serviceRole:Writer");

    ServiceInstanceRefPrototype serviceInstanceRefPrototypeModel = new ServiceInstanceRefPrototype.Builder()
      .id("4e49b3e0-27a8-48d2-a784-c7ee48bb863b")
      .build();
    assertEquals(serviceInstanceRefPrototypeModel.id(), "4e49b3e0-27a8-48d2-a784-c7ee48bb863b");

    ServiceIDRef serviceIdRefModel = new ServiceIDRef.Builder()
      .crn("testString")
      .build();
    assertEquals(serviceIdRefModel.crn(), "testString");

    ServiceAccessSecretPrototypeProps serviceAccessSecretPrototypePropsModel = new ServiceAccessSecretPrototypeProps.Builder()
      .resourceKey(resourceKeyRefPrototypeModel)
      .role(roleRefPrototypeModel)
      .serviceInstance(serviceInstanceRefPrototypeModel)
      .serviceid(serviceIdRefModel)
      .build();
    assertEquals(serviceAccessSecretPrototypePropsModel.resourceKey(), resourceKeyRefPrototypeModel);
    assertEquals(serviceAccessSecretPrototypePropsModel.role(), roleRefPrototypeModel);
    assertEquals(serviceAccessSecretPrototypePropsModel.serviceInstance(), serviceInstanceRefPrototypeModel);
    assertEquals(serviceAccessSecretPrototypePropsModel.serviceid(), serviceIdRefModel);

    String json = TestUtilities.serialize(serviceAccessSecretPrototypePropsModel);

    ServiceAccessSecretPrototypeProps serviceAccessSecretPrototypePropsModelNew = TestUtilities.deserialize(json, ServiceAccessSecretPrototypeProps.class);
    assertTrue(serviceAccessSecretPrototypePropsModelNew instanceof ServiceAccessSecretPrototypeProps);
    assertEquals(serviceAccessSecretPrototypePropsModelNew.resourceKey().toString(), resourceKeyRefPrototypeModel.toString());
    assertEquals(serviceAccessSecretPrototypePropsModelNew.role().toString(), roleRefPrototypeModel.toString());
    assertEquals(serviceAccessSecretPrototypePropsModelNew.serviceInstance().toString(), serviceInstanceRefPrototypeModel.toString());
    assertEquals(serviceAccessSecretPrototypePropsModelNew.serviceid().toString(), serviceIdRefModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testServiceAccessSecretPrototypePropsError() throws Throwable {
    new ServiceAccessSecretPrototypeProps.Builder().build();
  }

}