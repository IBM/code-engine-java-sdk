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

import com.ibm.cloud.code_engine.code_engine.v2.model.ComponentRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDomainMappingOptions model.
 */
public class CreateDomainMappingOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDomainMappingOptions() throws Throwable {
    ComponentRef componentRefModel = new ComponentRef.Builder()
      .name("my-app-1")
      .resourceType("app_v2")
      .build();
    assertEquals(componentRefModel.name(), "my-app-1");
    assertEquals(componentRefModel.resourceType(), "app_v2");

    CreateDomainMappingOptions createDomainMappingOptionsModel = new CreateDomainMappingOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .component(componentRefModel)
      .name("www.example.com")
      .tlsSecret("my-tls-secret")
      .build();
    assertEquals(createDomainMappingOptionsModel.projectId(), "15314cc3-85b4-4338-903f-c28cdee6d005");
    assertEquals(createDomainMappingOptionsModel.component(), componentRefModel);
    assertEquals(createDomainMappingOptionsModel.name(), "www.example.com");
    assertEquals(createDomainMappingOptionsModel.tlsSecret(), "my-tls-secret");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDomainMappingOptionsError() throws Throwable {
    new CreateDomainMappingOptions.Builder().build();
  }

}