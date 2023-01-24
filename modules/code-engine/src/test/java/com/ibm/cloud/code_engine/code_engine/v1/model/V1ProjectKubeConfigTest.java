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

package com.ibm.cloud.code_engine.code_engine.v1.model;

import com.ibm.cloud.code_engine.code_engine.v1.model.V1AuthInfo;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1AuthInfoRef;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1AuthProviderRef;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1Cluster;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1ClusterRef;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1Context;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1ContextRef;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1ProjectKubeConfig;
import com.ibm.cloud.code_engine.code_engine.v1.model.V1UserRef;
import com.ibm.cloud.code_engine.code_engine.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the V1ProjectKubeConfig model.
 */
public class V1ProjectKubeConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testV1ProjectKubeConfig() throws Throwable {
    V1ProjectKubeConfig v1ProjectKubeConfigModel = new V1ProjectKubeConfig();
    assertNull(v1ProjectKubeConfigModel.getApiVersion());
    assertNull(v1ProjectKubeConfigModel.getClusters());
    assertNull(v1ProjectKubeConfigModel.getContexts());
    assertNull(v1ProjectKubeConfigModel.getCurrentContext());
    assertNull(v1ProjectKubeConfigModel.getKind());
    assertNull(v1ProjectKubeConfigModel.getUsers());
  }
}