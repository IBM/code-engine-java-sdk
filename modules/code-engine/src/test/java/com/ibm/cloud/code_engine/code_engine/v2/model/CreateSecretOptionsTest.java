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

import com.ibm.cloud.code_engine.code_engine.v2.model.CreateSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.OperatorSecretPrototypeProps;
import com.ibm.cloud.code_engine.code_engine.v2.model.ResourceKeyRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.RoleRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretDataGenericSecretData;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceAccessSecretPrototypeProps;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceIDRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceIDRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceInstanceRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSecretOptions model.
 */
public class CreateSecretOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSecretOptions() throws Throwable {
    SecretDataGenericSecretData secretDataModel = new SecretDataGenericSecretData.Builder()
      .add("foo", "testString")
      .build();
    assertEquals(secretDataModel.get("foo"), "testString");

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
      .id("ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637")
      .build();
    assertEquals(serviceIdRefModel.crn(), "testString");
    assertEquals(serviceIdRefModel.id(), "ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637");

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

    CreateSecretOptions createSecretOptionsModel = new CreateSecretOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .format("generic")
      .name("my-secret")
      .data(secretDataModel)
      .serviceAccess(serviceAccessSecretPrototypePropsModel)
      .serviceOperator(operatorSecretPrototypePropsModel)
      .build();
    assertEquals(createSecretOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createSecretOptionsModel.format(), "generic");
    assertEquals(createSecretOptionsModel.name(), "my-secret");
    assertEquals(createSecretOptionsModel.data(), secretDataModel);
    assertEquals(createSecretOptionsModel.serviceAccess(), serviceAccessSecretPrototypePropsModel);
    assertEquals(createSecretOptionsModel.serviceOperator(), operatorSecretPrototypePropsModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretOptionsError() throws Throwable {
    new CreateSecretOptions.Builder().build();
  }

}