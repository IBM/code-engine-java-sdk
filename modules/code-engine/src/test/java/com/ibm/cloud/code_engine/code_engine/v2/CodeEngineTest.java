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

package com.ibm.cloud.code_engine.code_engine.v2;

import com.ibm.cloud.code_engine.code_engine.v2.CodeEngine;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestination;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationCidrBlockData;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationList;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationPatchCidrBlockDataPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationPrototypeCidrBlockDataPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.App;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppInstance;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppInstanceList;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppInstancesPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppList;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevision;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevisionList;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevisionStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevisionsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.Binding;
import com.ibm.cloud.code_engine.code_engine.v2.model.BindingList;
import com.ibm.cloud.code_engine.code_engine.v2.model.BindingsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.Build;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildList;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildRun;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildRunList;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildRunStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildRunsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.ComponentRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.ConfigMap;
import com.ibm.cloud.code_engine.code_engine.v2.model.ConfigMapList;
import com.ibm.cloud.code_engine.code_engine.v2.model.ConfigMapsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.ContainerStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.ContainerStatusDetails;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateBindingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateBuildRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateJobOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateJobRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateProjectOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.CreateSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteAppRevisionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteBindingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteBuildRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteJobOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteJobRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteProjectOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DeleteSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.DomainMapping;
import com.ibm.cloud.code_engine.code_engine.v2.model.DomainMappingList;
import com.ibm.cloud.code_engine.code_engine.v2.model.DomainMappingPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.DomainMappingStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.DomainMappingsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVar;
import com.ibm.cloud.code_engine.code_engine.v2.model.EnvVarPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.Function;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionList;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionRuntime;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionRuntimeList;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetAppRevisionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetBindingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetBuildRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetJobOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetJobRunOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetProjectEgressIpsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetProjectOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetProjectStatusDetailsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.GetSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.IndexDetails;
import com.ibm.cloud.code_engine.code_engine.v2.model.Job;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobList;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRun;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRunList;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRunStatus;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRunsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAppInstancesOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAppRevisionsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAppsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListBindingsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListBuildRunsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListBuildsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListConfigMapsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListDomainMappingsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListFirstMetadata;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListFunctionRuntimesOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListFunctionsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListJobRunsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListJobsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListNextMetadata;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListProjectsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListSecretsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.OperatorSecretProps;
import com.ibm.cloud.code_engine.code_engine.v2.model.OperatorSecretPrototypeProps;
import com.ibm.cloud.code_engine.code_engine.v2.model.Probe;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProbePrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.Project;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectEgressIPAddresses;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectList;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectStatusDetails;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.ReplaceConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ReplaceSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ResourceKeyRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.ResourceKeyRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.RoleRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.RoleRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.Secret;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretData;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretDataBasicAuthSecretData;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretDataGenericSecretData;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretDataRegistrySecretData;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretDataSSHSecretData;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretDataTLSSecretData;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretList;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceAccessSecretProps;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceAccessSecretPrototypeProps;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceIDRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceIDRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceInstanceRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.ServiceInstanceRefPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateAllowedOutboundDestinationOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateJobOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.VolumeMount;
import com.ibm.cloud.code_engine.code_engine.v2.model.VolumeMountPrototype;
import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CodeEngine service.
 */
public class CodeEngineTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected CodeEngine codeEngineService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new CodeEngine(serviceName, null);
  }


  // Test the getter for the version global parameter
  @Test
  public void testGetVersion() throws Throwable {
    assertEquals(codeEngineService.getVersion(), "2025-01-10");
  }

  // Test the listProjects operation with a valid options model parameter
  @Test
  public void testListProjectsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"projects\": [{\"account_id\": \"4329073d16d2f3663f74bfa955259139\", \"created_at\": \"2021-03-29T12:18:13.992359829Z\", \"crn\": \"crn:v1:bluemix:public:codeengine:eu-de:a/4329073d16d2f3663f74bfa955259139:4e49b3e0-27a8-48d2-a784-c7ee48bb863b::\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"name\": \"project-name\", \"region\": \"us-east\", \"resource_group_id\": \"5c49eabcf5e85881a37e2d100a33b3df\", \"resource_type\": \"project_v2\", \"status\": \"active\"}]}";
    String listProjectsPath = "/projects";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListProjectsOptions model
    ListProjectsOptions listProjectsOptionsModel = new ListProjectsOptions.Builder()
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listProjects() with a valid options model and verify the result
    Response<ProjectList> response = codeEngineService.listProjects(listProjectsOptionsModel).execute();
    assertNotNull(response);
    ProjectList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listProjectsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listProjects operation with and without retries enabled
  @Test
  public void testListProjectsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListProjectsWOptions();

    codeEngineService.disableRetries();
    testListProjectsWOptions();
  }

  // Test the listProjects operation using the ProjectsPager.getNext() method
  @Test
  public void testListProjectsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"projects\":[{\"account_id\":\"4329073d16d2f3663f74bfa955259139\",\"created_at\":\"2021-03-29T12:18:13.992359829Z\",\"crn\":\"crn:v1:bluemix:public:codeengine:eu-de:a/4329073d16d2f3663f74bfa955259139:4e49b3e0-27a8-48d2-a784-c7ee48bb863b::\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"name\":\"project-name\",\"region\":\"us-east\",\"resource_group_id\":\"5c49eabcf5e85881a37e2d100a33b3df\",\"resource_type\":\"project_v2\",\"status\":\"active\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"projects\":[{\"account_id\":\"4329073d16d2f3663f74bfa955259139\",\"created_at\":\"2021-03-29T12:18:13.992359829Z\",\"crn\":\"crn:v1:bluemix:public:codeengine:eu-de:a/4329073d16d2f3663f74bfa955259139:4e49b3e0-27a8-48d2-a784-c7ee48bb863b::\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"name\":\"project-name\",\"region\":\"us-east\",\"resource_group_id\":\"5c49eabcf5e85881a37e2d100a33b3df\",\"resource_type\":\"project_v2\",\"status\":\"active\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListProjectsOptions listProjectsOptions = new ListProjectsOptions.Builder()
      .limit(Long.valueOf("100"))
      .build();

    List<Project> allResults = new ArrayList<>();
    ProjectsPager pager = new ProjectsPager(codeEngineService, listProjectsOptions);
    while (pager.hasNext()) {
      List<Project> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listProjects operation using the ProjectsPager.getAll() method
  @Test
  public void testListProjectsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"projects\":[{\"account_id\":\"4329073d16d2f3663f74bfa955259139\",\"created_at\":\"2021-03-29T12:18:13.992359829Z\",\"crn\":\"crn:v1:bluemix:public:codeengine:eu-de:a/4329073d16d2f3663f74bfa955259139:4e49b3e0-27a8-48d2-a784-c7ee48bb863b::\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"name\":\"project-name\",\"region\":\"us-east\",\"resource_group_id\":\"5c49eabcf5e85881a37e2d100a33b3df\",\"resource_type\":\"project_v2\",\"status\":\"active\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"projects\":[{\"account_id\":\"4329073d16d2f3663f74bfa955259139\",\"created_at\":\"2021-03-29T12:18:13.992359829Z\",\"crn\":\"crn:v1:bluemix:public:codeengine:eu-de:a/4329073d16d2f3663f74bfa955259139:4e49b3e0-27a8-48d2-a784-c7ee48bb863b::\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"name\":\"project-name\",\"region\":\"us-east\",\"resource_group_id\":\"5c49eabcf5e85881a37e2d100a33b3df\",\"resource_type\":\"project_v2\",\"status\":\"active\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListProjectsOptions listProjectsOptions = new ListProjectsOptions.Builder()
      .limit(Long.valueOf("100"))
      .build();

    ProjectsPager pager = new ProjectsPager(codeEngineService, listProjectsOptions);
    List<Project> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createProject operation with a valid options model parameter
  @Test
  public void testCreateProjectWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"account_id\": \"4329073d16d2f3663f74bfa955259139\", \"created_at\": \"2021-03-29T12:18:13.992359829Z\", \"crn\": \"crn:v1:bluemix:public:codeengine:eu-de:a/4329073d16d2f3663f74bfa955259139:4e49b3e0-27a8-48d2-a784-c7ee48bb863b::\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"name\": \"project-name\", \"region\": \"us-east\", \"resource_group_id\": \"5c49eabcf5e85881a37e2d100a33b3df\", \"resource_type\": \"project_v2\", \"status\": \"active\"}";
    String createProjectPath = "/projects";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateProjectOptions model
    CreateProjectOptions createProjectOptionsModel = new CreateProjectOptions.Builder()
      .name("my-project")
      .resourceGroupId("b91e849cedb04e7e92bd68c040c672dc")
      .tags(java.util.Arrays.asList("testString"))
      .build();

    // Invoke createProject() with a valid options model and verify the result
    Response<Project> response = codeEngineService.createProject(createProjectOptionsModel).execute();
    assertNotNull(response);
    Project responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createProjectPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createProject operation with and without retries enabled
  @Test
  public void testCreateProjectWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateProjectWOptions();

    codeEngineService.disableRetries();
    testCreateProjectWOptions();
  }

  // Test the createProject operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateProjectNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createProject(null).execute();
  }

  // Test the getProject operation with a valid options model parameter
  @Test
  public void testGetProjectWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"account_id\": \"4329073d16d2f3663f74bfa955259139\", \"created_at\": \"2021-03-29T12:18:13.992359829Z\", \"crn\": \"crn:v1:bluemix:public:codeengine:eu-de:a/4329073d16d2f3663f74bfa955259139:4e49b3e0-27a8-48d2-a784-c7ee48bb863b::\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"name\": \"project-name\", \"region\": \"us-east\", \"resource_group_id\": \"5c49eabcf5e85881a37e2d100a33b3df\", \"resource_type\": \"project_v2\", \"status\": \"active\"}";
    String getProjectPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetProjectOptions model
    GetProjectOptions getProjectOptionsModel = new GetProjectOptions.Builder()
      .id("15314cc3-85b4-4338-903f-c28cdee6d005")
      .build();

    // Invoke getProject() with a valid options model and verify the result
    Response<Project> response = codeEngineService.getProject(getProjectOptionsModel).execute();
    assertNotNull(response);
    Project responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getProjectPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getProject operation with and without retries enabled
  @Test
  public void testGetProjectWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetProjectWOptions();

    codeEngineService.disableRetries();
    testGetProjectWOptions();
  }

  // Test the getProject operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetProjectNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getProject(null).execute();
  }

  // Test the deleteProject operation with a valid options model parameter
  @Test
  public void testDeleteProjectWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteProjectPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteProjectOptions model
    DeleteProjectOptions deleteProjectOptionsModel = new DeleteProjectOptions.Builder()
      .id("15314cc3-85b4-4338-903f-c28cdee6d005")
      .build();

    // Invoke deleteProject() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteProject(deleteProjectOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteProjectPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteProject operation with and without retries enabled
  @Test
  public void testDeleteProjectWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteProjectWOptions();

    codeEngineService.disableRetries();
    testDeleteProjectWOptions();
  }

  // Test the deleteProject operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteProjectNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteProject(null).execute();
  }

  // Test the listAllowedOutboundDestination operation with a valid options model parameter
  @Test
  public void testListAllowedOutboundDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"allowed_outbound_destinations\": [{\"entity_tag\": \"2385407409\", \"type\": \"cidr_block\", \"cidr_block\": \"cidrBlock\", \"name\": \"name\"}], \"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listAllowedOutboundDestinationPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/allowed_outbound_destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAllowedOutboundDestinationOptions model
    ListAllowedOutboundDestinationOptions listAllowedOutboundDestinationOptionsModel = new ListAllowedOutboundDestinationOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listAllowedOutboundDestination() with a valid options model and verify the result
    Response<AllowedOutboundDestinationList> response = codeEngineService.listAllowedOutboundDestination(listAllowedOutboundDestinationOptionsModel).execute();
    assertNotNull(response);
    AllowedOutboundDestinationList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllowedOutboundDestinationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listAllowedOutboundDestination operation with and without retries enabled
  @Test
  public void testListAllowedOutboundDestinationWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListAllowedOutboundDestinationWOptions();

    codeEngineService.disableRetries();
    testListAllowedOutboundDestinationWOptions();
  }

  // Test the listAllowedOutboundDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAllowedOutboundDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listAllowedOutboundDestination(null).execute();
  }

  // Test the listAllowedOutboundDestination operation using the AllowedOutboundDestinationPager.getNext() method
  @Test
  public void testListAllowedOutboundDestinationWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"allowed_outbound_destinations\":[{\"entity_tag\":\"2385407409\",\"type\":\"cidr_block\",\"cidr_block\":\"cidrBlock\",\"name\":\"name\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"allowed_outbound_destinations\":[{\"entity_tag\":\"2385407409\",\"type\":\"cidr_block\",\"cidr_block\":\"cidrBlock\",\"name\":\"name\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListAllowedOutboundDestinationOptions listAllowedOutboundDestinationOptions = new ListAllowedOutboundDestinationOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    List<AllowedOutboundDestination> allResults = new ArrayList<>();
    AllowedOutboundDestinationPager pager = new AllowedOutboundDestinationPager(codeEngineService, listAllowedOutboundDestinationOptions);
    while (pager.hasNext()) {
      List<AllowedOutboundDestination> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listAllowedOutboundDestination operation using the AllowedOutboundDestinationPager.getAll() method
  @Test
  public void testListAllowedOutboundDestinationWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"allowed_outbound_destinations\":[{\"entity_tag\":\"2385407409\",\"type\":\"cidr_block\",\"cidr_block\":\"cidrBlock\",\"name\":\"name\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"allowed_outbound_destinations\":[{\"entity_tag\":\"2385407409\",\"type\":\"cidr_block\",\"cidr_block\":\"cidrBlock\",\"name\":\"name\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListAllowedOutboundDestinationOptions listAllowedOutboundDestinationOptions = new ListAllowedOutboundDestinationOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    AllowedOutboundDestinationPager pager = new AllowedOutboundDestinationPager(codeEngineService, listAllowedOutboundDestinationOptions);
    List<AllowedOutboundDestination> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createAllowedOutboundDestination operation with a valid options model parameter
  @Test
  public void testCreateAllowedOutboundDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entity_tag\": \"2385407409\", \"type\": \"cidr_block\", \"cidr_block\": \"cidrBlock\", \"name\": \"name\"}";
    String createAllowedOutboundDestinationPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/allowed_outbound_destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AllowedOutboundDestinationPrototypeCidrBlockDataPrototype model
    AllowedOutboundDestinationPrototypeCidrBlockDataPrototype allowedOutboundDestinationPrototypeModel = new AllowedOutboundDestinationPrototypeCidrBlockDataPrototype.Builder()
      .type("cidr_block")
      .cidrBlock("testString")
      .name("testString")
      .build();

    // Construct an instance of the CreateAllowedOutboundDestinationOptions model
    CreateAllowedOutboundDestinationOptions createAllowedOutboundDestinationOptionsModel = new CreateAllowedOutboundDestinationOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .allowedOutboundDestination(allowedOutboundDestinationPrototypeModel)
      .build();

    // Invoke createAllowedOutboundDestination() with a valid options model and verify the result
    Response<AllowedOutboundDestination> response = codeEngineService.createAllowedOutboundDestination(createAllowedOutboundDestinationOptionsModel).execute();
    assertNotNull(response);
    AllowedOutboundDestination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createAllowedOutboundDestinationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the createAllowedOutboundDestination operation with and without retries enabled
  @Test
  public void testCreateAllowedOutboundDestinationWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateAllowedOutboundDestinationWOptions();

    codeEngineService.disableRetries();
    testCreateAllowedOutboundDestinationWOptions();
  }

  // Test the createAllowedOutboundDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAllowedOutboundDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createAllowedOutboundDestination(null).execute();
  }

  // Test the getAllowedOutboundDestination operation with a valid options model parameter
  @Test
  public void testGetAllowedOutboundDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entity_tag\": \"2385407409\", \"type\": \"cidr_block\", \"cidr_block\": \"cidrBlock\", \"name\": \"name\"}";
    String getAllowedOutboundDestinationPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/allowed_outbound_destinations/my-allowed-outbound-destination";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAllowedOutboundDestinationOptions model
    GetAllowedOutboundDestinationOptions getAllowedOutboundDestinationOptionsModel = new GetAllowedOutboundDestinationOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-allowed-outbound-destination")
      .build();

    // Invoke getAllowedOutboundDestination() with a valid options model and verify the result
    Response<AllowedOutboundDestination> response = codeEngineService.getAllowedOutboundDestination(getAllowedOutboundDestinationOptionsModel).execute();
    assertNotNull(response);
    AllowedOutboundDestination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllowedOutboundDestinationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the getAllowedOutboundDestination operation with and without retries enabled
  @Test
  public void testGetAllowedOutboundDestinationWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetAllowedOutboundDestinationWOptions();

    codeEngineService.disableRetries();
    testGetAllowedOutboundDestinationWOptions();
  }

  // Test the getAllowedOutboundDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAllowedOutboundDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getAllowedOutboundDestination(null).execute();
  }

  // Test the deleteAllowedOutboundDestination operation with a valid options model parameter
  @Test
  public void testDeleteAllowedOutboundDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteAllowedOutboundDestinationPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/allowed_outbound_destinations/my-allowed-outbound-destination";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAllowedOutboundDestinationOptions model
    DeleteAllowedOutboundDestinationOptions deleteAllowedOutboundDestinationOptionsModel = new DeleteAllowedOutboundDestinationOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-allowed-outbound-destination")
      .build();

    // Invoke deleteAllowedOutboundDestination() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteAllowedOutboundDestination(deleteAllowedOutboundDestinationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAllowedOutboundDestinationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the deleteAllowedOutboundDestination operation with and without retries enabled
  @Test
  public void testDeleteAllowedOutboundDestinationWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteAllowedOutboundDestinationWOptions();

    codeEngineService.disableRetries();
    testDeleteAllowedOutboundDestinationWOptions();
  }

  // Test the deleteAllowedOutboundDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAllowedOutboundDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteAllowedOutboundDestination(null).execute();
  }

  // Test the updateAllowedOutboundDestination operation with a valid options model parameter
  @Test
  public void testUpdateAllowedOutboundDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entity_tag\": \"2385407409\", \"type\": \"cidr_block\", \"cidr_block\": \"cidrBlock\", \"name\": \"name\"}";
    String updateAllowedOutboundDestinationPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/allowed_outbound_destinations/my-allowed-outbound-destination";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AllowedOutboundDestinationPatchCidrBlockDataPatch model
    AllowedOutboundDestinationPatchCidrBlockDataPatch allowedOutboundDestinationPatchModel = new AllowedOutboundDestinationPatchCidrBlockDataPatch.Builder()
      .type("cidr_block")
      .cidrBlock("testString")
      .build();
    Map<String, Object> allowedOutboundDestinationPatchModelAsPatch = allowedOutboundDestinationPatchModel.asPatch();

    // Construct an instance of the UpdateAllowedOutboundDestinationOptions model
    UpdateAllowedOutboundDestinationOptions updateAllowedOutboundDestinationOptionsModel = new UpdateAllowedOutboundDestinationOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-allowed-outbound-destination")
      .ifMatch("testString")
      .allowedOutboundDestination(allowedOutboundDestinationPatchModelAsPatch)
      .build();

    // Invoke updateAllowedOutboundDestination() with a valid options model and verify the result
    Response<AllowedOutboundDestination> response = codeEngineService.updateAllowedOutboundDestination(updateAllowedOutboundDestinationOptionsModel).execute();
    assertNotNull(response);
    AllowedOutboundDestination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAllowedOutboundDestinationPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the updateAllowedOutboundDestination operation with and without retries enabled
  @Test
  public void testUpdateAllowedOutboundDestinationWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testUpdateAllowedOutboundDestinationWOptions();

    codeEngineService.disableRetries();
    testUpdateAllowedOutboundDestinationWOptions();
  }

  // Test the updateAllowedOutboundDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAllowedOutboundDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.updateAllowedOutboundDestination(null).execute();
  }

  // Test the getProjectEgressIps operation with a valid options model parameter
  @Test
  public void testGetProjectEgressIpsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"private\": [\"xPrivate\"], \"public\": [\"xPublic\"]}";
    String getProjectEgressIpsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/egress_ips";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetProjectEgressIpsOptions model
    GetProjectEgressIpsOptions getProjectEgressIpsOptionsModel = new GetProjectEgressIpsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .build();

    // Invoke getProjectEgressIps() with a valid options model and verify the result
    Response<ProjectEgressIPAddresses> response = codeEngineService.getProjectEgressIps(getProjectEgressIpsOptionsModel).execute();
    assertNotNull(response);
    ProjectEgressIPAddresses responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getProjectEgressIpsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getProjectEgressIps operation with and without retries enabled
  @Test
  public void testGetProjectEgressIpsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetProjectEgressIpsWOptions();

    codeEngineService.disableRetries();
    testGetProjectEgressIpsWOptions();
  }

  // Test the getProjectEgressIps operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetProjectEgressIpsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getProjectEgressIps(null).execute();
  }

  // Test the getProjectStatusDetails operation with a valid options model parameter
  @Test
  public void testGetProjectStatusDetailsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"domain\": \"unknown\", \"project\": \"enabled\", \"vpe_not_enabled\": false}";
    String getProjectStatusDetailsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/status_details";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetProjectStatusDetailsOptions model
    GetProjectStatusDetailsOptions getProjectStatusDetailsOptionsModel = new GetProjectStatusDetailsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .build();

    // Invoke getProjectStatusDetails() with a valid options model and verify the result
    Response<ProjectStatusDetails> response = codeEngineService.getProjectStatusDetails(getProjectStatusDetailsOptionsModel).execute();
    assertNotNull(response);
    ProjectStatusDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getProjectStatusDetailsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getProjectStatusDetails operation with and without retries enabled
  @Test
  public void testGetProjectStatusDetailsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetProjectStatusDetailsWOptions();

    codeEngineService.disableRetries();
    testGetProjectStatusDetailsWOptions();
  }

  // Test the getProjectStatusDetails operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetProjectStatusDetailsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getProjectStatusDetails(null).execute();
  }

  // Test the listApps operation with a valid options model parameter
  @Test
  public void testListAppsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"apps\": [{\"build\": \"my-build\", \"build_run\": \"my-build-run\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"endpoint\": \"https://my-app.vg67hzldruk.eu-de.codeengine.appdomain.cloud\", \"endpoint_internal\": \"http://my-app.vg67hzldruk.svc.cluster.local\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_port\": 8080, \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"managed_domain_mappings\": \"local_public\", \"name\": \"my-app\", \"probe_liveness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"probe_readiness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"app_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_concurrency\": 100, \"scale_concurrency_target\": 80, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_ephemeral_storage_limit\": \"4G\", \"scale_initial_instances\": 1, \"scale_max_instances\": 10, \"scale_memory_limit\": \"4G\", \"scale_min_instances\": 1, \"scale_request_timeout\": 300, \"status\": \"ready\", \"status_details\": {\"latest_created_revision\": \"my-app-00001\", \"latest_ready_revision\": \"my-app-00001\", \"reason\": \"ready\"}}], \"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listAppsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/apps";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAppsOptions model
    ListAppsOptions listAppsOptionsModel = new ListAppsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listApps() with a valid options model and verify the result
    Response<AppList> response = codeEngineService.listApps(listAppsOptionsModel).execute();
    assertNotNull(response);
    AppList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAppsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listApps operation with and without retries enabled
  @Test
  public void testListAppsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListAppsWOptions();

    codeEngineService.disableRetries();
    testListAppsWOptions();
  }

  // Test the listApps operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAppsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listApps(null).execute();
  }

  // Test the listApps operation using the AppsPager.getNext() method
  @Test
  public void testListAppsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"apps\":[{\"build\":\"my-build\",\"build_run\":\"my-build-run\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"endpoint\":\"https://my-app.vg67hzldruk.eu-de.codeengine.appdomain.cloud\",\"endpoint_internal\":\"http://my-app.vg67hzldruk.svc.cluster.local\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_port\":8080,\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"managed_domain_mappings\":\"local_public\",\"name\":\"my-app\",\"probe_liveness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"probe_readiness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_concurrency\":100,\"scale_concurrency_target\":80,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_ephemeral_storage_limit\":\"4G\",\"scale_initial_instances\":1,\"scale_max_instances\":10,\"scale_memory_limit\":\"4G\",\"scale_min_instances\":1,\"scale_request_timeout\":300,\"status\":\"ready\",\"status_details\":{\"latest_created_revision\":\"my-app-00001\",\"latest_ready_revision\":\"my-app-00001\",\"reason\":\"ready\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"apps\":[{\"build\":\"my-build\",\"build_run\":\"my-build-run\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"endpoint\":\"https://my-app.vg67hzldruk.eu-de.codeengine.appdomain.cloud\",\"endpoint_internal\":\"http://my-app.vg67hzldruk.svc.cluster.local\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_port\":8080,\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"managed_domain_mappings\":\"local_public\",\"name\":\"my-app\",\"probe_liveness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"probe_readiness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_concurrency\":100,\"scale_concurrency_target\":80,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_ephemeral_storage_limit\":\"4G\",\"scale_initial_instances\":1,\"scale_max_instances\":10,\"scale_memory_limit\":\"4G\",\"scale_min_instances\":1,\"scale_request_timeout\":300,\"status\":\"ready\",\"status_details\":{\"latest_created_revision\":\"my-app-00001\",\"latest_ready_revision\":\"my-app-00001\",\"reason\":\"ready\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListAppsOptions listAppsOptions = new ListAppsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    List<App> allResults = new ArrayList<>();
    AppsPager pager = new AppsPager(codeEngineService, listAppsOptions);
    while (pager.hasNext()) {
      List<App> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listApps operation using the AppsPager.getAll() method
  @Test
  public void testListAppsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"apps\":[{\"build\":\"my-build\",\"build_run\":\"my-build-run\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"endpoint\":\"https://my-app.vg67hzldruk.eu-de.codeengine.appdomain.cloud\",\"endpoint_internal\":\"http://my-app.vg67hzldruk.svc.cluster.local\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_port\":8080,\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"managed_domain_mappings\":\"local_public\",\"name\":\"my-app\",\"probe_liveness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"probe_readiness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_concurrency\":100,\"scale_concurrency_target\":80,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_ephemeral_storage_limit\":\"4G\",\"scale_initial_instances\":1,\"scale_max_instances\":10,\"scale_memory_limit\":\"4G\",\"scale_min_instances\":1,\"scale_request_timeout\":300,\"status\":\"ready\",\"status_details\":{\"latest_created_revision\":\"my-app-00001\",\"latest_ready_revision\":\"my-app-00001\",\"reason\":\"ready\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"apps\":[{\"build\":\"my-build\",\"build_run\":\"my-build-run\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"endpoint\":\"https://my-app.vg67hzldruk.eu-de.codeengine.appdomain.cloud\",\"endpoint_internal\":\"http://my-app.vg67hzldruk.svc.cluster.local\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_port\":8080,\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"managed_domain_mappings\":\"local_public\",\"name\":\"my-app\",\"probe_liveness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"probe_readiness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_concurrency\":100,\"scale_concurrency_target\":80,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_ephemeral_storage_limit\":\"4G\",\"scale_initial_instances\":1,\"scale_max_instances\":10,\"scale_memory_limit\":\"4G\",\"scale_min_instances\":1,\"scale_request_timeout\":300,\"status\":\"ready\",\"status_details\":{\"latest_created_revision\":\"my-app-00001\",\"latest_ready_revision\":\"my-app-00001\",\"reason\":\"ready\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListAppsOptions listAppsOptions = new ListAppsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    AppsPager pager = new AppsPager(codeEngineService, listAppsOptions);
    List<App> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createApp operation with a valid options model parameter
  @Test
  public void testCreateAppWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"build\": \"my-build\", \"build_run\": \"my-build-run\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"endpoint\": \"https://my-app.vg67hzldruk.eu-de.codeengine.appdomain.cloud\", \"endpoint_internal\": \"http://my-app.vg67hzldruk.svc.cluster.local\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_port\": 8080, \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"managed_domain_mappings\": \"local_public\", \"name\": \"my-app\", \"probe_liveness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"probe_readiness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"app_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_concurrency\": 100, \"scale_concurrency_target\": 80, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_ephemeral_storage_limit\": \"4G\", \"scale_initial_instances\": 1, \"scale_max_instances\": 10, \"scale_memory_limit\": \"4G\", \"scale_min_instances\": 1, \"scale_request_timeout\": 300, \"status\": \"ready\", \"status_details\": {\"latest_created_revision\": \"my-app-00001\", \"latest_ready_revision\": \"my-app-00001\", \"reason\": \"ready\"}}";
    String createAppPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/apps";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ProbePrototype model
    ProbePrototype probePrototypeModel = new ProbePrototype.Builder()
      .failureThreshold(Long.valueOf("5"))
      .initialDelay(Long.valueOf("5"))
      .interval(Long.valueOf("5"))
      .path("testString")
      .port(Long.valueOf("8080"))
      .timeout(Long.valueOf("300"))
      .type("tcp")
      .build();

    // Construct an instance of the EnvVarPrototype model
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();

    // Construct an instance of the VolumeMountPrototype model
    VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
      .mountPath("/app")
      .name("codeengine-mount-b69u90")
      .reference("my-secret")
      .type("secret")
      .build();

    // Construct an instance of the CreateAppOptions model
    CreateAppOptions createAppOptionsModel = new CreateAppOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .imageReference("icr.io/codeengine/helloworld")
      .name("my-app")
      .imagePort(Long.valueOf("8080"))
      .imageSecret("my-secret")
      .managedDomainMappings("local_public")
      .probeLiveness(probePrototypeModel)
      .probeReadiness(probePrototypeModel)
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleConcurrency(Long.valueOf("100"))
      .scaleConcurrencyTarget(Long.valueOf("80"))
      .scaleCpuLimit("1")
      .scaleDownDelay(Long.valueOf("300"))
      .scaleEphemeralStorageLimit("4G")
      .scaleInitialInstances(Long.valueOf("1"))
      .scaleMaxInstances(Long.valueOf("10"))
      .scaleMemoryLimit("4G")
      .scaleMinInstances(Long.valueOf("1"))
      .scaleRequestTimeout(Long.valueOf("300"))
      .build();

    // Invoke createApp() with a valid options model and verify the result
    Response<App> response = codeEngineService.createApp(createAppOptionsModel).execute();
    assertNotNull(response);
    App responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createAppPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the createApp operation with and without retries enabled
  @Test
  public void testCreateAppWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateAppWOptions();

    codeEngineService.disableRetries();
    testCreateAppWOptions();
  }

  // Test the createApp operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAppNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createApp(null).execute();
  }

  // Test the getApp operation with a valid options model parameter
  @Test
  public void testGetAppWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"build\": \"my-build\", \"build_run\": \"my-build-run\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"endpoint\": \"https://my-app.vg67hzldruk.eu-de.codeengine.appdomain.cloud\", \"endpoint_internal\": \"http://my-app.vg67hzldruk.svc.cluster.local\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_port\": 8080, \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"managed_domain_mappings\": \"local_public\", \"name\": \"my-app\", \"probe_liveness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"probe_readiness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"app_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_concurrency\": 100, \"scale_concurrency_target\": 80, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_ephemeral_storage_limit\": \"4G\", \"scale_initial_instances\": 1, \"scale_max_instances\": 10, \"scale_memory_limit\": \"4G\", \"scale_min_instances\": 1, \"scale_request_timeout\": 300, \"status\": \"ready\", \"status_details\": {\"latest_created_revision\": \"my-app-00001\", \"latest_ready_revision\": \"my-app-00001\", \"reason\": \"ready\"}}";
    String getAppPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/apps/my-app";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAppOptions model
    GetAppOptions getAppOptionsModel = new GetAppOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-app")
      .build();

    // Invoke getApp() with a valid options model and verify the result
    Response<App> response = codeEngineService.getApp(getAppOptionsModel).execute();
    assertNotNull(response);
    App responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAppPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the getApp operation with and without retries enabled
  @Test
  public void testGetAppWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetAppWOptions();

    codeEngineService.disableRetries();
    testGetAppWOptions();
  }

  // Test the getApp operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAppNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getApp(null).execute();
  }

  // Test the deleteApp operation with a valid options model parameter
  @Test
  public void testDeleteAppWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteAppPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/apps/my-app";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAppOptions model
    DeleteAppOptions deleteAppOptionsModel = new DeleteAppOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-app")
      .build();

    // Invoke deleteApp() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteApp(deleteAppOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAppPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the deleteApp operation with and without retries enabled
  @Test
  public void testDeleteAppWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteAppWOptions();

    codeEngineService.disableRetries();
    testDeleteAppWOptions();
  }

  // Test the deleteApp operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAppNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteApp(null).execute();
  }

  // Test the updateApp operation with a valid options model parameter
  @Test
  public void testUpdateAppWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"build\": \"my-build\", \"build_run\": \"my-build-run\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"endpoint\": \"https://my-app.vg67hzldruk.eu-de.codeengine.appdomain.cloud\", \"endpoint_internal\": \"http://my-app.vg67hzldruk.svc.cluster.local\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_port\": 8080, \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"managed_domain_mappings\": \"local_public\", \"name\": \"my-app\", \"probe_liveness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"probe_readiness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"app_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_concurrency\": 100, \"scale_concurrency_target\": 80, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_ephemeral_storage_limit\": \"4G\", \"scale_initial_instances\": 1, \"scale_max_instances\": 10, \"scale_memory_limit\": \"4G\", \"scale_min_instances\": 1, \"scale_request_timeout\": 300, \"status\": \"ready\", \"status_details\": {\"latest_created_revision\": \"my-app-00001\", \"latest_ready_revision\": \"my-app-00001\", \"reason\": \"ready\"}}";
    String updateAppPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/apps/my-app";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ProbePrototype model
    ProbePrototype probePrototypeModel = new ProbePrototype.Builder()
      .failureThreshold(Long.valueOf("5"))
      .initialDelay(Long.valueOf("5"))
      .interval(Long.valueOf("5"))
      .path("testString")
      .port(Long.valueOf("8080"))
      .timeout(Long.valueOf("300"))
      .type("tcp")
      .build();

    // Construct an instance of the EnvVarPrototype model
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();

    // Construct an instance of the VolumeMountPrototype model
    VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
      .mountPath("/app")
      .name("codeengine-mount-b69u90")
      .reference("my-secret")
      .type("secret")
      .build();

    // Construct an instance of the AppPatch model
    AppPatch appPatchModel = new AppPatch.Builder()
      .imagePort(Long.valueOf("8080"))
      .imageReference("icr.io/codeengine/helloworld")
      .imageSecret("my-secret")
      .managedDomainMappings("local_public")
      .probeLiveness(probePrototypeModel)
      .probeReadiness(probePrototypeModel)
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleConcurrency(Long.valueOf("100"))
      .scaleConcurrencyTarget(Long.valueOf("80"))
      .scaleCpuLimit("1")
      .scaleDownDelay(Long.valueOf("300"))
      .scaleEphemeralStorageLimit("4G")
      .scaleInitialInstances(Long.valueOf("1"))
      .scaleMaxInstances(Long.valueOf("10"))
      .scaleMemoryLimit("4G")
      .scaleMinInstances(Long.valueOf("1"))
      .scaleRequestTimeout(Long.valueOf("300"))
      .build();
    Map<String, Object> appPatchModelAsPatch = appPatchModel.asPatch();

    // Construct an instance of the UpdateAppOptions model
    UpdateAppOptions updateAppOptionsModel = new UpdateAppOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-app")
      .ifMatch("testString")
      .app(appPatchModelAsPatch)
      .build();

    // Invoke updateApp() with a valid options model and verify the result
    Response<App> response = codeEngineService.updateApp(updateAppOptionsModel).execute();
    assertNotNull(response);
    App responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAppPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the updateApp operation with and without retries enabled
  @Test
  public void testUpdateAppWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testUpdateAppWOptions();

    codeEngineService.disableRetries();
    testUpdateAppWOptions();
  }

  // Test the updateApp operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAppNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.updateApp(null).execute();
  }

  // Test the listAppRevisions operation with a valid options model parameter
  @Test
  public void testListAppRevisionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"revisions\": [{\"app_name\": \"my-app\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/revisions/my-app-00001\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_port\": 8080, \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"name\": \"my-app-00001\", \"probe_liveness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"probe_readiness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"app_revision_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_concurrency\": 100, \"scale_concurrency_target\": 80, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_ephemeral_storage_limit\": \"4G\", \"scale_initial_instances\": 1, \"scale_max_instances\": 10, \"scale_memory_limit\": \"4G\", \"scale_min_instances\": 1, \"scale_request_timeout\": 300, \"status\": \"ready\", \"status_details\": {\"actual_instances\": 1, \"reason\": \"ready\"}}]}";
    String listAppRevisionsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/apps/my-app/revisions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAppRevisionsOptions model
    ListAppRevisionsOptions listAppRevisionsOptionsModel = new ListAppRevisionsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .appName("my-app")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listAppRevisions() with a valid options model and verify the result
    Response<AppRevisionList> response = codeEngineService.listAppRevisions(listAppRevisionsOptionsModel).execute();
    assertNotNull(response);
    AppRevisionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAppRevisionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the listAppRevisions operation with and without retries enabled
  @Test
  public void testListAppRevisionsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListAppRevisionsWOptions();

    codeEngineService.disableRetries();
    testListAppRevisionsWOptions();
  }

  // Test the listAppRevisions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAppRevisionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listAppRevisions(null).execute();
  }

  // Test the listAppRevisions operation using the AppRevisionsPager.getNext() method
  @Test
  public void testListAppRevisionsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"revisions\":[{\"app_name\":\"my-app\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/revisions/my-app-00001\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_port\":8080,\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"name\":\"my-app-00001\",\"probe_liveness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"probe_readiness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_revision_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_concurrency\":100,\"scale_concurrency_target\":80,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_ephemeral_storage_limit\":\"4G\",\"scale_initial_instances\":1,\"scale_max_instances\":10,\"scale_memory_limit\":\"4G\",\"scale_min_instances\":1,\"scale_request_timeout\":300,\"status\":\"ready\",\"status_details\":{\"actual_instances\":1,\"reason\":\"ready\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"revisions\":[{\"app_name\":\"my-app\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/revisions/my-app-00001\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_port\":8080,\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"name\":\"my-app-00001\",\"probe_liveness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"probe_readiness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_revision_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_concurrency\":100,\"scale_concurrency_target\":80,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_ephemeral_storage_limit\":\"4G\",\"scale_initial_instances\":1,\"scale_max_instances\":10,\"scale_memory_limit\":\"4G\",\"scale_min_instances\":1,\"scale_request_timeout\":300,\"status\":\"ready\",\"status_details\":{\"actual_instances\":1,\"reason\":\"ready\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListAppRevisionsOptions listAppRevisionsOptions = new ListAppRevisionsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .appName("my-app")
      .limit(Long.valueOf("100"))
      .build();

    List<AppRevision> allResults = new ArrayList<>();
    AppRevisionsPager pager = new AppRevisionsPager(codeEngineService, listAppRevisionsOptions);
    while (pager.hasNext()) {
      List<AppRevision> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listAppRevisions operation using the AppRevisionsPager.getAll() method
  @Test
  public void testListAppRevisionsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"revisions\":[{\"app_name\":\"my-app\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/revisions/my-app-00001\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_port\":8080,\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"name\":\"my-app-00001\",\"probe_liveness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"probe_readiness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_revision_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_concurrency\":100,\"scale_concurrency_target\":80,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_ephemeral_storage_limit\":\"4G\",\"scale_initial_instances\":1,\"scale_max_instances\":10,\"scale_memory_limit\":\"4G\",\"scale_min_instances\":1,\"scale_request_timeout\":300,\"status\":\"ready\",\"status_details\":{\"actual_instances\":1,\"reason\":\"ready\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"revisions\":[{\"app_name\":\"my-app\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/revisions/my-app-00001\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_port\":8080,\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"name\":\"my-app-00001\",\"probe_liveness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"probe_readiness\":{\"failure_threshold\":5,\"initial_delay\":5,\"interval\":5,\"path\":\"path\",\"port\":8080,\"timeout\":300,\"type\":\"tcp\"},\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_revision_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_concurrency\":100,\"scale_concurrency_target\":80,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_ephemeral_storage_limit\":\"4G\",\"scale_initial_instances\":1,\"scale_max_instances\":10,\"scale_memory_limit\":\"4G\",\"scale_min_instances\":1,\"scale_request_timeout\":300,\"status\":\"ready\",\"status_details\":{\"actual_instances\":1,\"reason\":\"ready\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListAppRevisionsOptions listAppRevisionsOptions = new ListAppRevisionsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .appName("my-app")
      .limit(Long.valueOf("100"))
      .build();

    AppRevisionsPager pager = new AppRevisionsPager(codeEngineService, listAppRevisionsOptions);
    List<AppRevision> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getAppRevision operation with a valid options model parameter
  @Test
  public void testGetAppRevisionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"app_name\": \"my-app\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/revisions/my-app-00001\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_port\": 8080, \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"name\": \"my-app-00001\", \"probe_liveness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"probe_readiness\": {\"failure_threshold\": 5, \"initial_delay\": 5, \"interval\": 5, \"path\": \"path\", \"port\": 8080, \"timeout\": 300, \"type\": \"tcp\"}, \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"app_revision_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_concurrency\": 100, \"scale_concurrency_target\": 80, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_ephemeral_storage_limit\": \"4G\", \"scale_initial_instances\": 1, \"scale_max_instances\": 10, \"scale_memory_limit\": \"4G\", \"scale_min_instances\": 1, \"scale_request_timeout\": 300, \"status\": \"ready\", \"status_details\": {\"actual_instances\": 1, \"reason\": \"ready\"}}";
    String getAppRevisionPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/apps/my-app/revisions/my-app-00001";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAppRevisionOptions model
    GetAppRevisionOptions getAppRevisionOptionsModel = new GetAppRevisionOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .appName("my-app")
      .name("my-app-00001")
      .build();

    // Invoke getAppRevision() with a valid options model and verify the result
    Response<AppRevision> response = codeEngineService.getAppRevision(getAppRevisionOptionsModel).execute();
    assertNotNull(response);
    AppRevision responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAppRevisionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the getAppRevision operation with and without retries enabled
  @Test
  public void testGetAppRevisionWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetAppRevisionWOptions();

    codeEngineService.disableRetries();
    testGetAppRevisionWOptions();
  }

  // Test the getAppRevision operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAppRevisionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getAppRevision(null).execute();
  }

  // Test the deleteAppRevision operation with a valid options model parameter
  @Test
  public void testDeleteAppRevisionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteAppRevisionPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/apps/my-app/revisions/my-app-00001";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAppRevisionOptions model
    DeleteAppRevisionOptions deleteAppRevisionOptionsModel = new DeleteAppRevisionOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .appName("my-app")
      .name("my-app-00001")
      .build();

    // Invoke deleteAppRevision() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteAppRevision(deleteAppRevisionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAppRevisionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteAppRevision operation with and without retries enabled
  @Test
  public void testDeleteAppRevisionWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteAppRevisionWOptions();

    codeEngineService.disableRetries();
    testDeleteAppRevisionWOptions();
  }

  // Test the deleteAppRevision operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAppRevisionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteAppRevision(null).execute();
  }

  // Test the listAppInstances operation with a valid options model parameter
  @Test
  public void testListAppInstancesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"instances\": [{\"app_name\": \"my-app\", \"created_at\": \"2022-09-13T11:41:35+02:00\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/instances\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-app-00001-deployment-6c9b5cf966-wjs44\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"app_instance_v2\", \"restarts\": 4, \"revision_name\": \"my-app\", \"scale_cpu_limit\": \"1\", \"scale_ephemeral_storage_limit\": \"4G\", \"scale_memory_limit\": \"4G\", \"status\": \"pending\", \"system_container\": {\"current_state\": {\"completed_at\": \"2022-09-22T17:40:00Z\", \"container_status\": \"containerStatus\", \"exit_code\": 100, \"reason\": \"ready\", \"started_at\": \"2022-09-22T17:34:00Z\"}, \"last_observed_state\": {\"completed_at\": \"2022-09-22T17:40:00Z\", \"container_status\": \"containerStatus\", \"exit_code\": 100, \"reason\": \"ready\", \"started_at\": \"2022-09-22T17:34:00Z\"}}, \"user_container\": {\"current_state\": {\"completed_at\": \"2022-09-22T17:40:00Z\", \"container_status\": \"containerStatus\", \"exit_code\": 100, \"reason\": \"ready\", \"started_at\": \"2022-09-22T17:34:00Z\"}, \"last_observed_state\": {\"completed_at\": \"2022-09-22T17:40:00Z\", \"container_status\": \"containerStatus\", \"exit_code\": 100, \"reason\": \"ready\", \"started_at\": \"2022-09-22T17:34:00Z\"}}}], \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listAppInstancesPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/apps/my-app/instances";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAppInstancesOptions model
    ListAppInstancesOptions listAppInstancesOptionsModel = new ListAppInstancesOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .appName("my-app")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listAppInstances() with a valid options model and verify the result
    Response<AppInstanceList> response = codeEngineService.listAppInstances(listAppInstancesOptionsModel).execute();
    assertNotNull(response);
    AppInstanceList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAppInstancesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listAppInstances operation with and without retries enabled
  @Test
  public void testListAppInstancesWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListAppInstancesWOptions();

    codeEngineService.disableRetries();
    testListAppInstancesWOptions();
  }

  // Test the listAppInstances operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAppInstancesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listAppInstances(null).execute();
  }

  // Test the listAppInstances operation using the AppInstancesPager.getNext() method
  @Test
  public void testListAppInstancesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"instances\":[{\"app_name\":\"my-app\",\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/instances\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-app-00001-deployment-6c9b5cf966-wjs44\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_instance_v2\",\"restarts\":4,\"revision_name\":\"my-app\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_memory_limit\":\"4G\",\"status\":\"pending\",\"system_container\":{\"current_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"},\"last_observed_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"}},\"user_container\":{\"current_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"},\"last_observed_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"}}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"instances\":[{\"app_name\":\"my-app\",\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/instances\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-app-00001-deployment-6c9b5cf966-wjs44\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_instance_v2\",\"restarts\":4,\"revision_name\":\"my-app\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_memory_limit\":\"4G\",\"status\":\"pending\",\"system_container\":{\"current_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"},\"last_observed_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"}},\"user_container\":{\"current_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"},\"last_observed_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"}}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListAppInstancesOptions listAppInstancesOptions = new ListAppInstancesOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .appName("my-app")
      .limit(Long.valueOf("100"))
      .build();

    List<AppInstance> allResults = new ArrayList<>();
    AppInstancesPager pager = new AppInstancesPager(codeEngineService, listAppInstancesOptions);
    while (pager.hasNext()) {
      List<AppInstance> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listAppInstances operation using the AppInstancesPager.getAll() method
  @Test
  public void testListAppInstancesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"instances\":[{\"app_name\":\"my-app\",\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/instances\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-app-00001-deployment-6c9b5cf966-wjs44\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_instance_v2\",\"restarts\":4,\"revision_name\":\"my-app\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_memory_limit\":\"4G\",\"status\":\"pending\",\"system_container\":{\"current_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"},\"last_observed_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"}},\"user_container\":{\"current_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"},\"last_observed_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"}}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"instances\":[{\"app_name\":\"my-app\",\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/apps/my-app/instances\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-app-00001-deployment-6c9b5cf966-wjs44\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"app_instance_v2\",\"restarts\":4,\"revision_name\":\"my-app\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_memory_limit\":\"4G\",\"status\":\"pending\",\"system_container\":{\"current_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"},\"last_observed_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"}},\"user_container\":{\"current_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"},\"last_observed_state\":{\"completed_at\":\"2022-09-22T17:40:00Z\",\"container_status\":\"containerStatus\",\"exit_code\":100,\"reason\":\"ready\",\"started_at\":\"2022-09-22T17:34:00Z\"}}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListAppInstancesOptions listAppInstancesOptions = new ListAppInstancesOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .appName("my-app")
      .limit(Long.valueOf("100"))
      .build();

    AppInstancesPager pager = new AppInstancesPager(codeEngineService, listAppInstancesOptions);
    List<AppInstance> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listJobs operation with a valid options model parameter
  @Test
  public void testListJobsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"jobs\": [{\"build\": \"my-build\", \"build_run\": \"my-build-run\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/jobs/my-job\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"name\": \"my-job\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"job_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_mode\": \"task\", \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_array_spec\": \"1-5,7-8,10\", \"scale_cpu_limit\": \"1\", \"scale_ephemeral_storage_limit\": \"4G\", \"scale_max_execution_time\": 7200, \"scale_memory_limit\": \"4G\", \"scale_retry_limit\": 3}], \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listJobsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListJobsOptions model
    ListJobsOptions listJobsOptionsModel = new ListJobsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listJobs() with a valid options model and verify the result
    Response<JobList> response = codeEngineService.listJobs(listJobsOptionsModel).execute();
    assertNotNull(response);
    JobList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listJobs operation with and without retries enabled
  @Test
  public void testListJobsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListJobsWOptions();

    codeEngineService.disableRetries();
    testListJobsWOptions();
  }

  // Test the listJobs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListJobsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listJobs(null).execute();
  }

  // Test the listJobs operation using the JobsPager.getNext() method
  @Test
  public void testListJobsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"jobs\":[{\"build\":\"my-build\",\"build_run\":\"my-build-run\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/jobs/my-job\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"name\":\"my-job\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"job_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_mode\":\"task\",\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_array_spec\":\"1-5,7-8,10\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_max_execution_time\":7200,\"scale_memory_limit\":\"4G\",\"scale_retry_limit\":3}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"jobs\":[{\"build\":\"my-build\",\"build_run\":\"my-build-run\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/jobs/my-job\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"name\":\"my-job\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"job_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_mode\":\"task\",\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_array_spec\":\"1-5,7-8,10\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_max_execution_time\":7200,\"scale_memory_limit\":\"4G\",\"scale_retry_limit\":3}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListJobsOptions listJobsOptions = new ListJobsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    List<Job> allResults = new ArrayList<>();
    JobsPager pager = new JobsPager(codeEngineService, listJobsOptions);
    while (pager.hasNext()) {
      List<Job> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listJobs operation using the JobsPager.getAll() method
  @Test
  public void testListJobsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"jobs\":[{\"build\":\"my-build\",\"build_run\":\"my-build-run\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/jobs/my-job\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"name\":\"my-job\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"job_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_mode\":\"task\",\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_array_spec\":\"1-5,7-8,10\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_max_execution_time\":7200,\"scale_memory_limit\":\"4G\",\"scale_retry_limit\":3}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"jobs\":[{\"build\":\"my-build\",\"build_run\":\"my-build-run\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/jobs/my-job\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"name\":\"my-job\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"job_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_mode\":\"task\",\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_array_spec\":\"1-5,7-8,10\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_max_execution_time\":7200,\"scale_memory_limit\":\"4G\",\"scale_retry_limit\":3}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListJobsOptions listJobsOptions = new ListJobsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    JobsPager pager = new JobsPager(codeEngineService, listJobsOptions);
    List<Job> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createJob operation with a valid options model parameter
  @Test
  public void testCreateJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"build\": \"my-build\", \"build_run\": \"my-build-run\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/jobs/my-job\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"name\": \"my-job\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"job_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_mode\": \"task\", \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_array_spec\": \"1-5,7-8,10\", \"scale_cpu_limit\": \"1\", \"scale_ephemeral_storage_limit\": \"4G\", \"scale_max_execution_time\": 7200, \"scale_memory_limit\": \"4G\", \"scale_retry_limit\": 3}";
    String createJobPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the EnvVarPrototype model
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();

    // Construct an instance of the VolumeMountPrototype model
    VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
      .mountPath("/app")
      .name("codeengine-mount-b69u90")
      .reference("my-secret")
      .type("secret")
      .build();

    // Construct an instance of the CreateJobOptions model
    CreateJobOptions createJobOptionsModel = new CreateJobOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .imageReference("icr.io/codeengine/helloworld")
      .name("my-job")
      .imageSecret("my-secret")
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runMode("task")
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleArraySpec("1-5,7-8,10")
      .scaleCpuLimit("1")
      .scaleEphemeralStorageLimit("4G")
      .scaleMaxExecutionTime(Long.valueOf("7200"))
      .scaleMemoryLimit("4G")
      .scaleRetryLimit(Long.valueOf("3"))
      .build();

    // Invoke createJob() with a valid options model and verify the result
    Response<Job> response = codeEngineService.createJob(createJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the createJob operation with and without retries enabled
  @Test
  public void testCreateJobWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateJobWOptions();

    codeEngineService.disableRetries();
    testCreateJobWOptions();
  }

  // Test the createJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createJob(null).execute();
  }

  // Test the getJob operation with a valid options model parameter
  @Test
  public void testGetJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"build\": \"my-build\", \"build_run\": \"my-build-run\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/jobs/my-job\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"name\": \"my-job\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"job_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_mode\": \"task\", \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_array_spec\": \"1-5,7-8,10\", \"scale_cpu_limit\": \"1\", \"scale_ephemeral_storage_limit\": \"4G\", \"scale_max_execution_time\": 7200, \"scale_memory_limit\": \"4G\", \"scale_retry_limit\": 3}";
    String getJobPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/jobs/my-job";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetJobOptions model
    GetJobOptions getJobOptionsModel = new GetJobOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-job")
      .build();

    // Invoke getJob() with a valid options model and verify the result
    Response<Job> response = codeEngineService.getJob(getJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the getJob operation with and without retries enabled
  @Test
  public void testGetJobWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetJobWOptions();

    codeEngineService.disableRetries();
    testGetJobWOptions();
  }

  // Test the getJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getJob(null).execute();
  }

  // Test the deleteJob operation with a valid options model parameter
  @Test
  public void testDeleteJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteJobPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/jobs/my-job";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteJobOptions model
    DeleteJobOptions deleteJobOptionsModel = new DeleteJobOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-job")
      .build();

    // Invoke deleteJob() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteJob(deleteJobOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the deleteJob operation with and without retries enabled
  @Test
  public void testDeleteJobWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteJobWOptions();

    codeEngineService.disableRetries();
    testDeleteJobWOptions();
  }

  // Test the deleteJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteJob(null).execute();
  }

  // Test the updateJob operation with a valid options model parameter
  @Test
  public void testUpdateJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"build\": \"my-build\", \"build_run\": \"my-build-run\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/jobs/my-job\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"name\": \"my-job\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"job_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_mode\": \"task\", \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_array_spec\": \"1-5,7-8,10\", \"scale_cpu_limit\": \"1\", \"scale_ephemeral_storage_limit\": \"4G\", \"scale_max_execution_time\": 7200, \"scale_memory_limit\": \"4G\", \"scale_retry_limit\": 3}";
    String updateJobPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/jobs/my-job";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the EnvVarPrototype model
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();

    // Construct an instance of the VolumeMountPrototype model
    VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
      .mountPath("/app")
      .name("codeengine-mount-b69u90")
      .reference("my-secret")
      .type("secret")
      .build();

    // Construct an instance of the JobPatch model
    JobPatch jobPatchModel = new JobPatch.Builder()
      .imageReference("icr.io/codeengine/helloworld")
      .imageSecret("my-secret")
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runMode("task")
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleArraySpec("1-5,7-8,10")
      .scaleCpuLimit("1")
      .scaleEphemeralStorageLimit("4G")
      .scaleMaxExecutionTime(Long.valueOf("7200"))
      .scaleMemoryLimit("4G")
      .scaleRetryLimit(Long.valueOf("3"))
      .build();
    Map<String, Object> jobPatchModelAsPatch = jobPatchModel.asPatch();

    // Construct an instance of the UpdateJobOptions model
    UpdateJobOptions updateJobOptionsModel = new UpdateJobOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-job")
      .ifMatch("testString")
      .job(jobPatchModelAsPatch)
      .build();

    // Invoke updateJob() with a valid options model and verify the result
    Response<Job> response = codeEngineService.updateJob(updateJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateJobPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the updateJob operation with and without retries enabled
  @Test
  public void testUpdateJobWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testUpdateJobWOptions();

    codeEngineService.disableRetries();
    testUpdateJobWOptions();
  }

  // Test the updateJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.updateJob(null).execute();
  }

  // Test the listJobRuns operation with a valid options model parameter
  @Test
  public void testListJobRunsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"job_runs\": [{\"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/job_runs/my-job-run\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"job_name\": \"my-job\", \"name\": \"my-job-run\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"job_run_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_mode\": \"task\", \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_array_size_variable_override\": 2, \"scale_array_spec\": \"1-5,7-8,10\", \"scale_cpu_limit\": \"1\", \"scale_ephemeral_storage_limit\": \"4G\", \"scale_max_execution_time\": 7200, \"scale_memory_limit\": \"4G\", \"scale_retry_limit\": 3, \"status\": \"failed\", \"status_details\": {\"completion_time\": \"2022-09-22T17:40:00Z\", \"failed\": 0, \"failed_indices\": \"1,5\", \"indices_details\": {\"mapKey\": {\"finished_at\": \"2024-12-23T16:30:45Z\", \"last_failure_reason\": \"OOMKilled\", \"retries\": 3, \"started_at\": \"2024-12-23T16:20:30Z\", \"status\": \"running\"}}, \"pending\": 0, \"pending_indices\": \"9,12-15\", \"requested\": 0, \"running\": 0, \"running_indices\": \"10-11\", \"start_time\": \"2022-09-22T17:34:00Z\", \"succeeded\": 1, \"succeeded_indices\": \"2-4,6-8\", \"unknown\": 0}}], \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listJobRunsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/job_runs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListJobRunsOptions model
    ListJobRunsOptions listJobRunsOptionsModel = new ListJobRunsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .jobName("my-job")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listJobRuns() with a valid options model and verify the result
    Response<JobRunList> response = codeEngineService.listJobRuns(listJobRunsOptionsModel).execute();
    assertNotNull(response);
    JobRunList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobRunsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
    assertEquals(query.get("job_name"), "my-job");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listJobRuns operation with and without retries enabled
  @Test
  public void testListJobRunsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListJobRunsWOptions();

    codeEngineService.disableRetries();
    testListJobRunsWOptions();
  }

  // Test the listJobRuns operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListJobRunsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listJobRuns(null).execute();
  }

  // Test the listJobRuns operation using the JobRunsPager.getNext() method
  @Test
  public void testListJobRunsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"job_runs\":[{\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/job_runs/my-job-run\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"job_name\":\"my-job\",\"name\":\"my-job-run\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"job_run_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_mode\":\"task\",\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_array_size_variable_override\":2,\"scale_array_spec\":\"1-5,7-8,10\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_max_execution_time\":7200,\"scale_memory_limit\":\"4G\",\"scale_retry_limit\":3,\"status\":\"failed\",\"status_details\":{\"completion_time\":\"2022-09-22T17:40:00Z\",\"failed\":0,\"failed_indices\":\"1,5\",\"indices_details\":{\"mapKey\":{\"finished_at\":\"2024-12-23T16:30:45Z\",\"last_failure_reason\":\"OOMKilled\",\"retries\":3,\"started_at\":\"2024-12-23T16:20:30Z\",\"status\":\"running\"}},\"pending\":0,\"pending_indices\":\"9,12-15\",\"requested\":0,\"running\":0,\"running_indices\":\"10-11\",\"start_time\":\"2022-09-22T17:34:00Z\",\"succeeded\":1,\"succeeded_indices\":\"2-4,6-8\",\"unknown\":0}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"job_runs\":[{\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/job_runs/my-job-run\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"job_name\":\"my-job\",\"name\":\"my-job-run\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"job_run_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_mode\":\"task\",\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_array_size_variable_override\":2,\"scale_array_spec\":\"1-5,7-8,10\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_max_execution_time\":7200,\"scale_memory_limit\":\"4G\",\"scale_retry_limit\":3,\"status\":\"failed\",\"status_details\":{\"completion_time\":\"2022-09-22T17:40:00Z\",\"failed\":0,\"failed_indices\":\"1,5\",\"indices_details\":{\"mapKey\":{\"finished_at\":\"2024-12-23T16:30:45Z\",\"last_failure_reason\":\"OOMKilled\",\"retries\":3,\"started_at\":\"2024-12-23T16:20:30Z\",\"status\":\"running\"}},\"pending\":0,\"pending_indices\":\"9,12-15\",\"requested\":0,\"running\":0,\"running_indices\":\"10-11\",\"start_time\":\"2022-09-22T17:34:00Z\",\"succeeded\":1,\"succeeded_indices\":\"2-4,6-8\",\"unknown\":0}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListJobRunsOptions listJobRunsOptions = new ListJobRunsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .jobName("my-job")
      .limit(Long.valueOf("100"))
      .build();

    List<JobRun> allResults = new ArrayList<>();
    JobRunsPager pager = new JobRunsPager(codeEngineService, listJobRunsOptions);
    while (pager.hasNext()) {
      List<JobRun> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listJobRuns operation using the JobRunsPager.getAll() method
  @Test
  public void testListJobRunsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"job_runs\":[{\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/job_runs/my-job-run\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"job_name\":\"my-job\",\"name\":\"my-job-run\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"job_run_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_mode\":\"task\",\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_array_size_variable_override\":2,\"scale_array_spec\":\"1-5,7-8,10\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_max_execution_time\":7200,\"scale_memory_limit\":\"4G\",\"scale_retry_limit\":3,\"status\":\"failed\",\"status_details\":{\"completion_time\":\"2022-09-22T17:40:00Z\",\"failed\":0,\"failed_indices\":\"1,5\",\"indices_details\":{\"mapKey\":{\"finished_at\":\"2024-12-23T16:30:45Z\",\"last_failure_reason\":\"OOMKilled\",\"retries\":3,\"started_at\":\"2024-12-23T16:20:30Z\",\"status\":\"running\"}},\"pending\":0,\"pending_indices\":\"9,12-15\",\"requested\":0,\"running\":0,\"running_indices\":\"10-11\",\"start_time\":\"2022-09-22T17:34:00Z\",\"succeeded\":1,\"succeeded_indices\":\"2-4,6-8\",\"unknown\":0}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"job_runs\":[{\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/job_runs/my-job-run\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"image_reference\":\"icr.io/codeengine/helloworld\",\"image_secret\":\"my-secret\",\"job_name\":\"my-job\",\"name\":\"my-job-run\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"job_run_v2\",\"run_arguments\":[\"runArguments\"],\"run_as_user\":1001,\"run_commands\":[\"runCommands\"],\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"run_mode\":\"task\",\"run_service_account\":\"default\",\"run_volume_mounts\":[{\"mount_path\":\"/app\",\"name\":\"codeengine-mount-b69u90\",\"reference\":\"my-secret\",\"type\":\"secret\"}],\"scale_array_size_variable_override\":2,\"scale_array_spec\":\"1-5,7-8,10\",\"scale_cpu_limit\":\"1\",\"scale_ephemeral_storage_limit\":\"4G\",\"scale_max_execution_time\":7200,\"scale_memory_limit\":\"4G\",\"scale_retry_limit\":3,\"status\":\"failed\",\"status_details\":{\"completion_time\":\"2022-09-22T17:40:00Z\",\"failed\":0,\"failed_indices\":\"1,5\",\"indices_details\":{\"mapKey\":{\"finished_at\":\"2024-12-23T16:30:45Z\",\"last_failure_reason\":\"OOMKilled\",\"retries\":3,\"started_at\":\"2024-12-23T16:20:30Z\",\"status\":\"running\"}},\"pending\":0,\"pending_indices\":\"9,12-15\",\"requested\":0,\"running\":0,\"running_indices\":\"10-11\",\"start_time\":\"2022-09-22T17:34:00Z\",\"succeeded\":1,\"succeeded_indices\":\"2-4,6-8\",\"unknown\":0}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListJobRunsOptions listJobRunsOptions = new ListJobRunsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .jobName("my-job")
      .limit(Long.valueOf("100"))
      .build();

    JobRunsPager pager = new JobRunsPager(codeEngineService, listJobRunsOptions);
    List<JobRun> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createJobRun operation with a valid options model parameter
  @Test
  public void testCreateJobRunWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/job_runs/my-job-run\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"job_name\": \"my-job\", \"name\": \"my-job-run\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"job_run_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_mode\": \"task\", \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_array_size_variable_override\": 2, \"scale_array_spec\": \"1-5,7-8,10\", \"scale_cpu_limit\": \"1\", \"scale_ephemeral_storage_limit\": \"4G\", \"scale_max_execution_time\": 7200, \"scale_memory_limit\": \"4G\", \"scale_retry_limit\": 3, \"status\": \"failed\", \"status_details\": {\"completion_time\": \"2022-09-22T17:40:00Z\", \"failed\": 0, \"failed_indices\": \"1,5\", \"indices_details\": {\"mapKey\": {\"finished_at\": \"2024-12-23T16:30:45Z\", \"last_failure_reason\": \"OOMKilled\", \"retries\": 3, \"started_at\": \"2024-12-23T16:20:30Z\", \"status\": \"running\"}}, \"pending\": 0, \"pending_indices\": \"9,12-15\", \"requested\": 0, \"running\": 0, \"running_indices\": \"10-11\", \"start_time\": \"2022-09-22T17:34:00Z\", \"succeeded\": 1, \"succeeded_indices\": \"2-4,6-8\", \"unknown\": 0}}";
    String createJobRunPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/job_runs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the EnvVarPrototype model
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();

    // Construct an instance of the VolumeMountPrototype model
    VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
      .mountPath("/app")
      .name("codeengine-mount-b69u90")
      .reference("my-secret")
      .type("secret")
      .build();

    // Construct an instance of the CreateJobRunOptions model
    CreateJobRunOptions createJobRunOptionsModel = new CreateJobRunOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .imageReference("icr.io/codeengine/helloworld")
      .imageSecret("my-secret")
      .jobName("my-job")
      .name("my-job-run")
      .runArguments(java.util.Arrays.asList("testString"))
      .runAsUser(Long.valueOf("1001"))
      .runCommands(java.util.Arrays.asList("testString"))
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runMode("task")
      .runServiceAccount("default")
      .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
      .scaleArraySizeVariableOverride(Long.valueOf("2"))
      .scaleArraySpec("1-5,7-8,10")
      .scaleCpuLimit("1")
      .scaleEphemeralStorageLimit("4G")
      .scaleMaxExecutionTime(Long.valueOf("7200"))
      .scaleMemoryLimit("4G")
      .scaleRetryLimit(Long.valueOf("3"))
      .build();

    // Invoke createJobRun() with a valid options model and verify the result
    Response<JobRun> response = codeEngineService.createJobRun(createJobRunOptionsModel).execute();
    assertNotNull(response);
    JobRun responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createJobRunPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the createJobRun operation with and without retries enabled
  @Test
  public void testCreateJobRunWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateJobRunWOptions();

    codeEngineService.disableRetries();
    testCreateJobRunWOptions();
  }

  // Test the createJobRun operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateJobRunNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createJobRun(null).execute();
  }

  // Test the getJobRun operation with a valid options model parameter
  @Test
  public void testGetJobRunWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/job_runs/my-job-run\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"image_reference\": \"icr.io/codeengine/helloworld\", \"image_secret\": \"my-secret\", \"job_name\": \"my-job\", \"name\": \"my-job-run\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"job_run_v2\", \"run_arguments\": [\"runArguments\"], \"run_as_user\": 1001, \"run_commands\": [\"runCommands\"], \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"run_mode\": \"task\", \"run_service_account\": \"default\", \"run_volume_mounts\": [{\"mount_path\": \"/app\", \"name\": \"codeengine-mount-b69u90\", \"reference\": \"my-secret\", \"type\": \"secret\"}], \"scale_array_size_variable_override\": 2, \"scale_array_spec\": \"1-5,7-8,10\", \"scale_cpu_limit\": \"1\", \"scale_ephemeral_storage_limit\": \"4G\", \"scale_max_execution_time\": 7200, \"scale_memory_limit\": \"4G\", \"scale_retry_limit\": 3, \"status\": \"failed\", \"status_details\": {\"completion_time\": \"2022-09-22T17:40:00Z\", \"failed\": 0, \"failed_indices\": \"1,5\", \"indices_details\": {\"mapKey\": {\"finished_at\": \"2024-12-23T16:30:45Z\", \"last_failure_reason\": \"OOMKilled\", \"retries\": 3, \"started_at\": \"2024-12-23T16:20:30Z\", \"status\": \"running\"}}, \"pending\": 0, \"pending_indices\": \"9,12-15\", \"requested\": 0, \"running\": 0, \"running_indices\": \"10-11\", \"start_time\": \"2022-09-22T17:34:00Z\", \"succeeded\": 1, \"succeeded_indices\": \"2-4,6-8\", \"unknown\": 0}}";
    String getJobRunPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/job_runs/my-job-run";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetJobRunOptions model
    GetJobRunOptions getJobRunOptionsModel = new GetJobRunOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-job-run")
      .build();

    // Invoke getJobRun() with a valid options model and verify the result
    Response<JobRun> response = codeEngineService.getJobRun(getJobRunOptionsModel).execute();
    assertNotNull(response);
    JobRun responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobRunPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the getJobRun operation with and without retries enabled
  @Test
  public void testGetJobRunWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetJobRunWOptions();

    codeEngineService.disableRetries();
    testGetJobRunWOptions();
  }

  // Test the getJobRun operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobRunNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getJobRun(null).execute();
  }

  // Test the deleteJobRun operation with a valid options model parameter
  @Test
  public void testDeleteJobRunWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteJobRunPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/job_runs/my-job-run";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteJobRunOptions model
    DeleteJobRunOptions deleteJobRunOptionsModel = new DeleteJobRunOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-job-run")
      .build();

    // Invoke deleteJobRun() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteJobRun(deleteJobRunOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteJobRunPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteJobRun operation with and without retries enabled
  @Test
  public void testDeleteJobRunWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteJobRunWOptions();

    codeEngineService.disableRetries();
    testDeleteJobRunWOptions();
  }

  // Test the deleteJobRun operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteJobRunNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteJobRun(null).execute();
  }

  // Test the listFunctionRuntimes operation with a valid options model parameter
  @Test
  public void testListFunctionRuntimesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"function_runtimes\": [{\"default\": true, \"deprecated\": false, \"family\": \"nodejs\", \"id\": \"nodejs-18\", \"name\": \"Node.js 18\", \"optimized\": true}]}";
    String listFunctionRuntimesPath = "/function_runtimes";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListFunctionRuntimesOptions model
    ListFunctionRuntimesOptions listFunctionRuntimesOptionsModel = new ListFunctionRuntimesOptions();

    // Invoke listFunctionRuntimes() with a valid options model and verify the result
    Response<FunctionRuntimeList> response = codeEngineService.listFunctionRuntimes(listFunctionRuntimesOptionsModel).execute();
    assertNotNull(response);
    FunctionRuntimeList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listFunctionRuntimesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listFunctionRuntimes operation with and without retries enabled
  @Test
  public void testListFunctionRuntimesWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListFunctionRuntimesWOptions();

    codeEngineService.disableRetries();
    testListFunctionRuntimesWOptions();
  }

  // Test the listFunctions operation with a valid options model parameter
  @Test
  public void testListFunctionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"functions\": [{\"code_binary\": false, \"code_main\": \"main\", \"code_reference\": \"data:text/plain;base64,<base64encoded-source-code>\", \"code_secret\": \"my-secret\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"endpoint\": \"https://my-function.vg67hzldruk.eu-de.codeengine.appdomain.cloud\", \"endpoint_internal\": \"http://my-function.vg67hzldruk.svc.cluster.local\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/functions/my-function\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"managed_domain_mappings\": \"local_public\", \"name\": \"my-function\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"function_v2\", \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"runtime\": \"nodejs-18\", \"scale_concurrency\": 1, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_max_execution_time\": 60, \"scale_memory_limit\": \"1G\", \"status\": \"offline\", \"status_details\": {\"reason\": \"offline\"}}], \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listFunctionsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/functions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListFunctionsOptions model
    ListFunctionsOptions listFunctionsOptionsModel = new ListFunctionsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listFunctions() with a valid options model and verify the result
    Response<FunctionList> response = codeEngineService.listFunctions(listFunctionsOptionsModel).execute();
    assertNotNull(response);
    FunctionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listFunctionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listFunctions operation with and without retries enabled
  @Test
  public void testListFunctionsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListFunctionsWOptions();

    codeEngineService.disableRetries();
    testListFunctionsWOptions();
  }

  // Test the listFunctions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListFunctionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listFunctions(null).execute();
  }

  // Test the listFunctions operation using the FunctionsPager.getNext() method
  @Test
  public void testListFunctionsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"functions\":[{\"code_binary\":false,\"code_main\":\"main\",\"code_reference\":\"data:text/plain;base64,<base64encoded-source-code>\",\"code_secret\":\"my-secret\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"endpoint\":\"https://my-function.vg67hzldruk.eu-de.codeengine.appdomain.cloud\",\"endpoint_internal\":\"http://my-function.vg67hzldruk.svc.cluster.local\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/functions/my-function\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"managed_domain_mappings\":\"local_public\",\"name\":\"my-function\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"function_v2\",\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"runtime\":\"nodejs-18\",\"scale_concurrency\":1,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_max_execution_time\":60,\"scale_memory_limit\":\"1G\",\"status\":\"offline\",\"status_details\":{\"reason\":\"offline\"}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"functions\":[{\"code_binary\":false,\"code_main\":\"main\",\"code_reference\":\"data:text/plain;base64,<base64encoded-source-code>\",\"code_secret\":\"my-secret\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"endpoint\":\"https://my-function.vg67hzldruk.eu-de.codeengine.appdomain.cloud\",\"endpoint_internal\":\"http://my-function.vg67hzldruk.svc.cluster.local\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/functions/my-function\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"managed_domain_mappings\":\"local_public\",\"name\":\"my-function\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"function_v2\",\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"runtime\":\"nodejs-18\",\"scale_concurrency\":1,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_max_execution_time\":60,\"scale_memory_limit\":\"1G\",\"status\":\"offline\",\"status_details\":{\"reason\":\"offline\"}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListFunctionsOptions listFunctionsOptions = new ListFunctionsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    List<Function> allResults = new ArrayList<>();
    FunctionsPager pager = new FunctionsPager(codeEngineService, listFunctionsOptions);
    while (pager.hasNext()) {
      List<Function> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listFunctions operation using the FunctionsPager.getAll() method
  @Test
  public void testListFunctionsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"functions\":[{\"code_binary\":false,\"code_main\":\"main\",\"code_reference\":\"data:text/plain;base64,<base64encoded-source-code>\",\"code_secret\":\"my-secret\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"endpoint\":\"https://my-function.vg67hzldruk.eu-de.codeengine.appdomain.cloud\",\"endpoint_internal\":\"http://my-function.vg67hzldruk.svc.cluster.local\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/functions/my-function\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"managed_domain_mappings\":\"local_public\",\"name\":\"my-function\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"function_v2\",\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"runtime\":\"nodejs-18\",\"scale_concurrency\":1,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_max_execution_time\":60,\"scale_memory_limit\":\"1G\",\"status\":\"offline\",\"status_details\":{\"reason\":\"offline\"}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"functions\":[{\"code_binary\":false,\"code_main\":\"main\",\"code_reference\":\"data:text/plain;base64,<base64encoded-source-code>\",\"code_secret\":\"my-secret\",\"computed_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"created_at\":\"2022-09-13T11:41:35+02:00\",\"endpoint\":\"https://my-function.vg67hzldruk.eu-de.codeengine.appdomain.cloud\",\"endpoint_internal\":\"http://my-function.vg67hzldruk.svc.cluster.local\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/functions/my-function\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"managed_domain_mappings\":\"local_public\",\"name\":\"my-function\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"function_v2\",\"run_env_variables\":[{\"key\":\"MY_VARIABLE\",\"name\":\"SOME\",\"prefix\":\"PREFIX_\",\"reference\":\"my-secret\",\"type\":\"literal\",\"value\":\"VALUE\"}],\"runtime\":\"nodejs-18\",\"scale_concurrency\":1,\"scale_cpu_limit\":\"1\",\"scale_down_delay\":300,\"scale_max_execution_time\":60,\"scale_memory_limit\":\"1G\",\"status\":\"offline\",\"status_details\":{\"reason\":\"offline\"}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListFunctionsOptions listFunctionsOptions = new ListFunctionsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    FunctionsPager pager = new FunctionsPager(codeEngineService, listFunctionsOptions);
    List<Function> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createFunction operation with a valid options model parameter
  @Test
  public void testCreateFunctionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"code_binary\": false, \"code_main\": \"main\", \"code_reference\": \"data:text/plain;base64,<base64encoded-source-code>\", \"code_secret\": \"my-secret\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"endpoint\": \"https://my-function.vg67hzldruk.eu-de.codeengine.appdomain.cloud\", \"endpoint_internal\": \"http://my-function.vg67hzldruk.svc.cluster.local\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/functions/my-function\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"managed_domain_mappings\": \"local_public\", \"name\": \"my-function\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"function_v2\", \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"runtime\": \"nodejs-18\", \"scale_concurrency\": 1, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_max_execution_time\": 60, \"scale_memory_limit\": \"1G\", \"status\": \"offline\", \"status_details\": {\"reason\": \"offline\"}}";
    String createFunctionPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/functions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the EnvVarPrototype model
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();

    // Construct an instance of the CreateFunctionOptions model
    CreateFunctionOptions createFunctionOptionsModel = new CreateFunctionOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .codeReference("data:text/plain;base64,<base64encoded-source-code>")
      .name("my-function")
      .runtime("nodejs-18")
      .codeBinary(false)
      .codeMain("main")
      .codeSecret("my-secret")
      .managedDomainMappings("local_public")
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .scaleConcurrency(Long.valueOf("1"))
      .scaleCpuLimit("1")
      .scaleDownDelay(Long.valueOf("300"))
      .scaleMaxExecutionTime(Long.valueOf("60"))
      .scaleMemoryLimit("1G")
      .build();

    // Invoke createFunction() with a valid options model and verify the result
    Response<Function> response = codeEngineService.createFunction(createFunctionOptionsModel).execute();
    assertNotNull(response);
    Function responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createFunctionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the createFunction operation with and without retries enabled
  @Test
  public void testCreateFunctionWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateFunctionWOptions();

    codeEngineService.disableRetries();
    testCreateFunctionWOptions();
  }

  // Test the createFunction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateFunctionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createFunction(null).execute();
  }

  // Test the getFunction operation with a valid options model parameter
  @Test
  public void testGetFunctionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"code_binary\": false, \"code_main\": \"main\", \"code_reference\": \"data:text/plain;base64,<base64encoded-source-code>\", \"code_secret\": \"my-secret\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"endpoint\": \"https://my-function.vg67hzldruk.eu-de.codeengine.appdomain.cloud\", \"endpoint_internal\": \"http://my-function.vg67hzldruk.svc.cluster.local\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/functions/my-function\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"managed_domain_mappings\": \"local_public\", \"name\": \"my-function\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"function_v2\", \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"runtime\": \"nodejs-18\", \"scale_concurrency\": 1, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_max_execution_time\": 60, \"scale_memory_limit\": \"1G\", \"status\": \"offline\", \"status_details\": {\"reason\": \"offline\"}}";
    String getFunctionPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/functions/my-function";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetFunctionOptions model
    GetFunctionOptions getFunctionOptionsModel = new GetFunctionOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-function")
      .build();

    // Invoke getFunction() with a valid options model and verify the result
    Response<Function> response = codeEngineService.getFunction(getFunctionOptionsModel).execute();
    assertNotNull(response);
    Function responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getFunctionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the getFunction operation with and without retries enabled
  @Test
  public void testGetFunctionWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetFunctionWOptions();

    codeEngineService.disableRetries();
    testGetFunctionWOptions();
  }

  // Test the getFunction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetFunctionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getFunction(null).execute();
  }

  // Test the deleteFunction operation with a valid options model parameter
  @Test
  public void testDeleteFunctionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteFunctionPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/functions/my-function";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteFunctionOptions model
    DeleteFunctionOptions deleteFunctionOptionsModel = new DeleteFunctionOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-function")
      .build();

    // Invoke deleteFunction() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteFunction(deleteFunctionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteFunctionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the deleteFunction operation with and without retries enabled
  @Test
  public void testDeleteFunctionWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteFunctionWOptions();

    codeEngineService.disableRetries();
    testDeleteFunctionWOptions();
  }

  // Test the deleteFunction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFunctionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteFunction(null).execute();
  }

  // Test the updateFunction operation with a valid options model parameter
  @Test
  public void testUpdateFunctionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"code_binary\": false, \"code_main\": \"main\", \"code_reference\": \"data:text/plain;base64,<base64encoded-source-code>\", \"code_secret\": \"my-secret\", \"computed_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"created_at\": \"2022-09-13T11:41:35+02:00\", \"endpoint\": \"https://my-function.vg67hzldruk.eu-de.codeengine.appdomain.cloud\", \"endpoint_internal\": \"http://my-function.vg67hzldruk.svc.cluster.local\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/functions/my-function\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"managed_domain_mappings\": \"local_public\", \"name\": \"my-function\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"function_v2\", \"run_env_variables\": [{\"key\": \"MY_VARIABLE\", \"name\": \"SOME\", \"prefix\": \"PREFIX_\", \"reference\": \"my-secret\", \"type\": \"literal\", \"value\": \"VALUE\"}], \"runtime\": \"nodejs-18\", \"scale_concurrency\": 1, \"scale_cpu_limit\": \"1\", \"scale_down_delay\": 300, \"scale_max_execution_time\": 60, \"scale_memory_limit\": \"1G\", \"status\": \"offline\", \"status_details\": {\"reason\": \"offline\"}}";
    String updateFunctionPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/functions/my-function";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the EnvVarPrototype model
    EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
      .key("MY_VARIABLE")
      .name("SOME")
      .prefix("PREFIX_")
      .reference("my-secret")
      .type("literal")
      .value("VALUE")
      .build();

    // Construct an instance of the FunctionPatch model
    FunctionPatch functionPatchModel = new FunctionPatch.Builder()
      .codeBinary(false)
      .codeMain("main")
      .codeReference("data:text/plain;base64,<base64encoded-source-code>")
      .codeSecret("my-secret")
      .managedDomainMappings("local_public")
      .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
      .runtime("nodejs-18")
      .scaleConcurrency(Long.valueOf("1"))
      .scaleCpuLimit("1")
      .scaleDownDelay(Long.valueOf("300"))
      .scaleMaxExecutionTime(Long.valueOf("60"))
      .scaleMemoryLimit("1G")
      .build();
    Map<String, Object> functionPatchModelAsPatch = functionPatchModel.asPatch();

    // Construct an instance of the UpdateFunctionOptions model
    UpdateFunctionOptions updateFunctionOptionsModel = new UpdateFunctionOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-function")
      .ifMatch("testString")
      .function(functionPatchModelAsPatch)
      .build();

    // Invoke updateFunction() with a valid options model and verify the result
    Response<Function> response = codeEngineService.updateFunction(updateFunctionOptionsModel).execute();
    assertNotNull(response);
    Function responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateFunctionPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "2025-01-10");
  }

  // Test the updateFunction operation with and without retries enabled
  @Test
  public void testUpdateFunctionWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testUpdateFunctionWOptions();

    codeEngineService.disableRetries();
    testUpdateFunctionWOptions();
  }

  // Test the updateFunction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFunctionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.updateFunction(null).execute();
  }

  // Test the listBindings operation with a valid options model parameter
  @Test
  public void testListBindingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bindings\": [{\"component\": {\"name\": \"my-app-1\", \"resource_type\": \"app_v2\"}, \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/bindings/my-binding\", \"id\": \"a172ced-b5f21bc-71ba50c-1638604\", \"prefix\": \"MY_COS\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"resource_type\": \"binding_v2\", \"secret_name\": \"my-service-access\", \"status\": \"active\"}], \"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listBindingsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/bindings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListBindingsOptions model
    ListBindingsOptions listBindingsOptionsModel = new ListBindingsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listBindings() with a valid options model and verify the result
    Response<BindingList> response = codeEngineService.listBindings(listBindingsOptionsModel).execute();
    assertNotNull(response);
    BindingList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listBindingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listBindings operation with and without retries enabled
  @Test
  public void testListBindingsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListBindingsWOptions();

    codeEngineService.disableRetries();
    testListBindingsWOptions();
  }

  // Test the listBindings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListBindingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listBindings(null).execute();
  }

  // Test the listBindings operation using the BindingsPager.getNext() method
  @Test
  public void testListBindingsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"bindings\":[{\"component\":{\"name\":\"my-app-1\",\"resource_type\":\"app_v2\"},\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/bindings/my-binding\",\"id\":\"a172ced-b5f21bc-71ba50c-1638604\",\"prefix\":\"MY_COS\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"resource_type\":\"binding_v2\",\"secret_name\":\"my-service-access\",\"status\":\"active\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"bindings\":[{\"component\":{\"name\":\"my-app-1\",\"resource_type\":\"app_v2\"},\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/bindings/my-binding\",\"id\":\"a172ced-b5f21bc-71ba50c-1638604\",\"prefix\":\"MY_COS\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"resource_type\":\"binding_v2\",\"secret_name\":\"my-service-access\",\"status\":\"active\"}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListBindingsOptions listBindingsOptions = new ListBindingsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    List<Binding> allResults = new ArrayList<>();
    BindingsPager pager = new BindingsPager(codeEngineService, listBindingsOptions);
    while (pager.hasNext()) {
      List<Binding> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listBindings operation using the BindingsPager.getAll() method
  @Test
  public void testListBindingsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"bindings\":[{\"component\":{\"name\":\"my-app-1\",\"resource_type\":\"app_v2\"},\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/bindings/my-binding\",\"id\":\"a172ced-b5f21bc-71ba50c-1638604\",\"prefix\":\"MY_COS\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"resource_type\":\"binding_v2\",\"secret_name\":\"my-service-access\",\"status\":\"active\"}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"bindings\":[{\"component\":{\"name\":\"my-app-1\",\"resource_type\":\"app_v2\"},\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/bindings/my-binding\",\"id\":\"a172ced-b5f21bc-71ba50c-1638604\",\"prefix\":\"MY_COS\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"resource_type\":\"binding_v2\",\"secret_name\":\"my-service-access\",\"status\":\"active\"}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListBindingsOptions listBindingsOptions = new ListBindingsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    BindingsPager pager = new BindingsPager(codeEngineService, listBindingsOptions);
    List<Binding> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createBinding operation with a valid options model parameter
  @Test
  public void testCreateBindingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"component\": {\"name\": \"my-app-1\", \"resource_type\": \"app_v2\"}, \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/bindings/my-binding\", \"id\": \"a172ced-b5f21bc-71ba50c-1638604\", \"prefix\": \"MY_COS\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"resource_type\": \"binding_v2\", \"secret_name\": \"my-service-access\", \"status\": \"active\"}";
    String createBindingPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/bindings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ComponentRef model
    ComponentRef componentRefModel = new ComponentRef.Builder()
      .name("my-app-1")
      .resourceType("app_v2")
      .build();

    // Construct an instance of the CreateBindingOptions model
    CreateBindingOptions createBindingOptionsModel = new CreateBindingOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .component(componentRefModel)
      .prefix("MY_COS")
      .secretName("my-service-access")
      .build();

    // Invoke createBinding() with a valid options model and verify the result
    Response<Binding> response = codeEngineService.createBinding(createBindingOptionsModel).execute();
    assertNotNull(response);
    Binding responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createBindingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createBinding operation with and without retries enabled
  @Test
  public void testCreateBindingWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateBindingWOptions();

    codeEngineService.disableRetries();
    testCreateBindingWOptions();
  }

  // Test the createBinding operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBindingNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createBinding(null).execute();
  }

  // Test the getBinding operation with a valid options model parameter
  @Test
  public void testGetBindingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"component\": {\"name\": \"my-app-1\", \"resource_type\": \"app_v2\"}, \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/bindings/my-binding\", \"id\": \"a172ced-b5f21bc-71ba50c-1638604\", \"prefix\": \"MY_COS\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"resource_type\": \"binding_v2\", \"secret_name\": \"my-service-access\", \"status\": \"active\"}";
    String getBindingPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/bindings/a172ced-b5f21bc-71ba50c-1638604";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBindingOptions model
    GetBindingOptions getBindingOptionsModel = new GetBindingOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .id("a172ced-b5f21bc-71ba50c-1638604")
      .build();

    // Invoke getBinding() with a valid options model and verify the result
    Response<Binding> response = codeEngineService.getBinding(getBindingOptionsModel).execute();
    assertNotNull(response);
    Binding responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBindingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBinding operation with and without retries enabled
  @Test
  public void testGetBindingWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetBindingWOptions();

    codeEngineService.disableRetries();
    testGetBindingWOptions();
  }

  // Test the getBinding operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetBindingNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getBinding(null).execute();
  }

  // Test the deleteBinding operation with a valid options model parameter
  @Test
  public void testDeleteBindingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteBindingPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/bindings/a172ced-b5f21bc-71ba50c-1638604";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteBindingOptions model
    DeleteBindingOptions deleteBindingOptionsModel = new DeleteBindingOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .id("a172ced-b5f21bc-71ba50c-1638604")
      .build();

    // Invoke deleteBinding() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteBinding(deleteBindingOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteBindingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteBinding operation with and without retries enabled
  @Test
  public void testDeleteBindingWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteBindingWOptions();

    codeEngineService.disableRetries();
    testDeleteBindingWOptions();
  }

  // Test the deleteBinding operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteBindingNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteBinding(null).execute();
  }

  // Test the listBuilds operation with a valid options model parameter
  @Test
  public void testListBuildsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"builds\": [{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/builds/my-build\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-build\", \"output_image\": \"private.de.icr.io/icr_namespace/image-name\", \"output_secret\": \"ce-auto-icr-private-eu-de\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"build_v2\", \"source_context_dir\": \"some/subfolder\", \"source_revision\": \"main\", \"source_secret\": \"sourceSecret\", \"source_type\": \"git\", \"source_url\": \"https://github.com/IBM/CodeEngine\", \"status\": \"ready\", \"status_details\": {\"reason\": \"registered\"}, \"strategy_size\": \"medium\", \"strategy_spec_file\": \"Dockerfile\", \"strategy_type\": \"dockerfile\", \"timeout\": 600}], \"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listBuildsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/builds";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListBuildsOptions model
    ListBuildsOptions listBuildsOptionsModel = new ListBuildsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listBuilds() with a valid options model and verify the result
    Response<BuildList> response = codeEngineService.listBuilds(listBuildsOptionsModel).execute();
    assertNotNull(response);
    BuildList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listBuildsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listBuilds operation with and without retries enabled
  @Test
  public void testListBuildsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListBuildsWOptions();

    codeEngineService.disableRetries();
    testListBuildsWOptions();
  }

  // Test the listBuilds operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListBuildsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listBuilds(null).execute();
  }

  // Test the listBuilds operation using the BuildsPager.getNext() method
  @Test
  public void testListBuildsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"builds\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/builds/my-build\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-build\",\"output_image\":\"private.de.icr.io/icr_namespace/image-name\",\"output_secret\":\"ce-auto-icr-private-eu-de\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"build_v2\",\"source_context_dir\":\"some/subfolder\",\"source_revision\":\"main\",\"source_secret\":\"sourceSecret\",\"source_type\":\"git\",\"source_url\":\"https://github.com/IBM/CodeEngine\",\"status\":\"ready\",\"status_details\":{\"reason\":\"registered\"},\"strategy_size\":\"medium\",\"strategy_spec_file\":\"Dockerfile\",\"strategy_type\":\"dockerfile\",\"timeout\":600}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"builds\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/builds/my-build\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-build\",\"output_image\":\"private.de.icr.io/icr_namespace/image-name\",\"output_secret\":\"ce-auto-icr-private-eu-de\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"build_v2\",\"source_context_dir\":\"some/subfolder\",\"source_revision\":\"main\",\"source_secret\":\"sourceSecret\",\"source_type\":\"git\",\"source_url\":\"https://github.com/IBM/CodeEngine\",\"status\":\"ready\",\"status_details\":{\"reason\":\"registered\"},\"strategy_size\":\"medium\",\"strategy_spec_file\":\"Dockerfile\",\"strategy_type\":\"dockerfile\",\"timeout\":600}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListBuildsOptions listBuildsOptions = new ListBuildsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    List<Build> allResults = new ArrayList<>();
    BuildsPager pager = new BuildsPager(codeEngineService, listBuildsOptions);
    while (pager.hasNext()) {
      List<Build> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listBuilds operation using the BuildsPager.getAll() method
  @Test
  public void testListBuildsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"builds\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/builds/my-build\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-build\",\"output_image\":\"private.de.icr.io/icr_namespace/image-name\",\"output_secret\":\"ce-auto-icr-private-eu-de\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"build_v2\",\"source_context_dir\":\"some/subfolder\",\"source_revision\":\"main\",\"source_secret\":\"sourceSecret\",\"source_type\":\"git\",\"source_url\":\"https://github.com/IBM/CodeEngine\",\"status\":\"ready\",\"status_details\":{\"reason\":\"registered\"},\"strategy_size\":\"medium\",\"strategy_spec_file\":\"Dockerfile\",\"strategy_type\":\"dockerfile\",\"timeout\":600}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"builds\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/builds/my-build\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-build\",\"output_image\":\"private.de.icr.io/icr_namespace/image-name\",\"output_secret\":\"ce-auto-icr-private-eu-de\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"build_v2\",\"source_context_dir\":\"some/subfolder\",\"source_revision\":\"main\",\"source_secret\":\"sourceSecret\",\"source_type\":\"git\",\"source_url\":\"https://github.com/IBM/CodeEngine\",\"status\":\"ready\",\"status_details\":{\"reason\":\"registered\"},\"strategy_size\":\"medium\",\"strategy_spec_file\":\"Dockerfile\",\"strategy_type\":\"dockerfile\",\"timeout\":600}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListBuildsOptions listBuildsOptions = new ListBuildsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    BuildsPager pager = new BuildsPager(codeEngineService, listBuildsOptions);
    List<Build> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createBuild operation with a valid options model parameter
  @Test
  public void testCreateBuildWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/builds/my-build\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-build\", \"output_image\": \"private.de.icr.io/icr_namespace/image-name\", \"output_secret\": \"ce-auto-icr-private-eu-de\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"build_v2\", \"source_context_dir\": \"some/subfolder\", \"source_revision\": \"main\", \"source_secret\": \"sourceSecret\", \"source_type\": \"git\", \"source_url\": \"https://github.com/IBM/CodeEngine\", \"status\": \"ready\", \"status_details\": {\"reason\": \"registered\"}, \"strategy_size\": \"medium\", \"strategy_spec_file\": \"Dockerfile\", \"strategy_type\": \"dockerfile\", \"timeout\": 600}";
    String createBuildPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/builds";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateBuildOptions model
    CreateBuildOptions createBuildOptionsModel = new CreateBuildOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-build")
      .outputImage("private.de.icr.io/icr_namespace/image-name")
      .outputSecret("ce-auto-icr-private-eu-de")
      .strategyType("dockerfile")
      .sourceContextDir("some/subfolder")
      .sourceRevision("main")
      .sourceSecret("testString")
      .sourceType("git")
      .sourceUrl("https://github.com/IBM/CodeEngine")
      .strategySize("medium")
      .strategySpecFile("Dockerfile")
      .timeout(Long.valueOf("600"))
      .build();

    // Invoke createBuild() with a valid options model and verify the result
    Response<Build> response = codeEngineService.createBuild(createBuildOptionsModel).execute();
    assertNotNull(response);
    Build responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createBuildPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createBuild operation with and without retries enabled
  @Test
  public void testCreateBuildWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateBuildWOptions();

    codeEngineService.disableRetries();
    testCreateBuildWOptions();
  }

  // Test the createBuild operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBuildNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createBuild(null).execute();
  }

  // Test the getBuild operation with a valid options model parameter
  @Test
  public void testGetBuildWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/builds/my-build\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-build\", \"output_image\": \"private.de.icr.io/icr_namespace/image-name\", \"output_secret\": \"ce-auto-icr-private-eu-de\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"build_v2\", \"source_context_dir\": \"some/subfolder\", \"source_revision\": \"main\", \"source_secret\": \"sourceSecret\", \"source_type\": \"git\", \"source_url\": \"https://github.com/IBM/CodeEngine\", \"status\": \"ready\", \"status_details\": {\"reason\": \"registered\"}, \"strategy_size\": \"medium\", \"strategy_spec_file\": \"Dockerfile\", \"strategy_type\": \"dockerfile\", \"timeout\": 600}";
    String getBuildPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/builds/my-build";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBuildOptions model
    GetBuildOptions getBuildOptionsModel = new GetBuildOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-build")
      .build();

    // Invoke getBuild() with a valid options model and verify the result
    Response<Build> response = codeEngineService.getBuild(getBuildOptionsModel).execute();
    assertNotNull(response);
    Build responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBuildPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBuild operation with and without retries enabled
  @Test
  public void testGetBuildWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetBuildWOptions();

    codeEngineService.disableRetries();
    testGetBuildWOptions();
  }

  // Test the getBuild operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetBuildNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getBuild(null).execute();
  }

  // Test the deleteBuild operation with a valid options model parameter
  @Test
  public void testDeleteBuildWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteBuildPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/builds/my-build";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteBuildOptions model
    DeleteBuildOptions deleteBuildOptionsModel = new DeleteBuildOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-build")
      .build();

    // Invoke deleteBuild() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteBuild(deleteBuildOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteBuildPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteBuild operation with and without retries enabled
  @Test
  public void testDeleteBuildWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteBuildWOptions();

    codeEngineService.disableRetries();
    testDeleteBuildWOptions();
  }

  // Test the deleteBuild operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteBuildNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteBuild(null).execute();
  }

  // Test the updateBuild operation with a valid options model parameter
  @Test
  public void testUpdateBuildWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/builds/my-build\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-build\", \"output_image\": \"private.de.icr.io/icr_namespace/image-name\", \"output_secret\": \"ce-auto-icr-private-eu-de\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"build_v2\", \"source_context_dir\": \"some/subfolder\", \"source_revision\": \"main\", \"source_secret\": \"sourceSecret\", \"source_type\": \"git\", \"source_url\": \"https://github.com/IBM/CodeEngine\", \"status\": \"ready\", \"status_details\": {\"reason\": \"registered\"}, \"strategy_size\": \"medium\", \"strategy_spec_file\": \"Dockerfile\", \"strategy_type\": \"dockerfile\", \"timeout\": 600}";
    String updateBuildPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/builds/my-build";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the BuildPatch model
    BuildPatch buildPatchModel = new BuildPatch.Builder()
      .outputImage("private.de.icr.io/icr_namespace/image-name")
      .outputSecret("ce-auto-icr-private-eu-de")
      .sourceContextDir("some/subfolder")
      .sourceRevision("main")
      .sourceSecret("testString")
      .sourceType("git")
      .sourceUrl("https://github.com/IBM/CodeEngine")
      .strategySize("medium")
      .strategySpecFile("Dockerfile")
      .strategyType("dockerfile")
      .timeout(Long.valueOf("600"))
      .build();
    Map<String, Object> buildPatchModelAsPatch = buildPatchModel.asPatch();

    // Construct an instance of the UpdateBuildOptions model
    UpdateBuildOptions updateBuildOptionsModel = new UpdateBuildOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-build")
      .ifMatch("testString")
      .build(buildPatchModelAsPatch)
      .build();

    // Invoke updateBuild() with a valid options model and verify the result
    Response<Build> response = codeEngineService.updateBuild(updateBuildOptionsModel).execute();
    assertNotNull(response);
    Build responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateBuildPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateBuild operation with and without retries enabled
  @Test
  public void testUpdateBuildWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testUpdateBuildWOptions();

    codeEngineService.disableRetries();
    testUpdateBuildWOptions();
  }

  // Test the updateBuild operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateBuildNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.updateBuild(null).execute();
  }

  // Test the listBuildRuns operation with a valid options model parameter
  @Test
  public void testListBuildRunsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"build_runs\": [{\"build_name\": \"buildName\", \"created_at\": \"2022-09-13T11:41:35+02:00\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/build_runs/my-build-run\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-build-run\", \"output_image\": \"private.de.icr.io/icr_namespace/image-name\", \"output_secret\": \"ce-auto-icr-private-eu-de\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"build_run_v2\", \"service_account\": \"default\", \"source_context_dir\": \"some/subfolder\", \"source_revision\": \"main\", \"source_secret\": \"sourceSecret\", \"source_type\": \"git\", \"source_url\": \"https://github.com/IBM/CodeEngine\", \"status\": \"succeeded\", \"status_details\": {\"completion_time\": \"2022-09-22T17:40:00Z\", \"git_branch_name\": \"main\", \"git_commit_author\": \"John Doe\", \"git_commit_sha\": \"9a3d845c629d2b4a6b271b1d526dfafc1e7d9511\", \"output_digest\": \"sha256:9a3d845c629d2b4a6b271b1d526dfafc1e7d9511f8863b43b5bb0483ef626384\", \"reason\": \"succeeded\", \"source_timestamp\": \"2022-09-22T17:34:00Z\", \"start_time\": \"2022-09-22T17:34:00Z\"}, \"strategy_size\": \"medium\", \"strategy_spec_file\": \"Dockerfile\", \"strategy_type\": \"dockerfile\", \"timeout\": 600}], \"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listBuildRunsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/build_runs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListBuildRunsOptions model
    ListBuildRunsOptions listBuildRunsOptionsModel = new ListBuildRunsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .buildName("my-build")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listBuildRuns() with a valid options model and verify the result
    Response<BuildRunList> response = codeEngineService.listBuildRuns(listBuildRunsOptionsModel).execute();
    assertNotNull(response);
    BuildRunList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listBuildRunsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("build_name"), "my-build");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listBuildRuns operation with and without retries enabled
  @Test
  public void testListBuildRunsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListBuildRunsWOptions();

    codeEngineService.disableRetries();
    testListBuildRunsWOptions();
  }

  // Test the listBuildRuns operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListBuildRunsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listBuildRuns(null).execute();
  }

  // Test the listBuildRuns operation using the BuildRunsPager.getNext() method
  @Test
  public void testListBuildRunsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"build_runs\":[{\"build_name\":\"buildName\",\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/build_runs/my-build-run\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-build-run\",\"output_image\":\"private.de.icr.io/icr_namespace/image-name\",\"output_secret\":\"ce-auto-icr-private-eu-de\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"build_run_v2\",\"service_account\":\"default\",\"source_context_dir\":\"some/subfolder\",\"source_revision\":\"main\",\"source_secret\":\"sourceSecret\",\"source_type\":\"git\",\"source_url\":\"https://github.com/IBM/CodeEngine\",\"status\":\"succeeded\",\"status_details\":{\"completion_time\":\"2022-09-22T17:40:00Z\",\"git_branch_name\":\"main\",\"git_commit_author\":\"John Doe\",\"git_commit_sha\":\"9a3d845c629d2b4a6b271b1d526dfafc1e7d9511\",\"output_digest\":\"sha256:9a3d845c629d2b4a6b271b1d526dfafc1e7d9511f8863b43b5bb0483ef626384\",\"reason\":\"succeeded\",\"source_timestamp\":\"2022-09-22T17:34:00Z\",\"start_time\":\"2022-09-22T17:34:00Z\"},\"strategy_size\":\"medium\",\"strategy_spec_file\":\"Dockerfile\",\"strategy_type\":\"dockerfile\",\"timeout\":600}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"build_runs\":[{\"build_name\":\"buildName\",\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/build_runs/my-build-run\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-build-run\",\"output_image\":\"private.de.icr.io/icr_namespace/image-name\",\"output_secret\":\"ce-auto-icr-private-eu-de\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"build_run_v2\",\"service_account\":\"default\",\"source_context_dir\":\"some/subfolder\",\"source_revision\":\"main\",\"source_secret\":\"sourceSecret\",\"source_type\":\"git\",\"source_url\":\"https://github.com/IBM/CodeEngine\",\"status\":\"succeeded\",\"status_details\":{\"completion_time\":\"2022-09-22T17:40:00Z\",\"git_branch_name\":\"main\",\"git_commit_author\":\"John Doe\",\"git_commit_sha\":\"9a3d845c629d2b4a6b271b1d526dfafc1e7d9511\",\"output_digest\":\"sha256:9a3d845c629d2b4a6b271b1d526dfafc1e7d9511f8863b43b5bb0483ef626384\",\"reason\":\"succeeded\",\"source_timestamp\":\"2022-09-22T17:34:00Z\",\"start_time\":\"2022-09-22T17:34:00Z\"},\"strategy_size\":\"medium\",\"strategy_spec_file\":\"Dockerfile\",\"strategy_type\":\"dockerfile\",\"timeout\":600}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListBuildRunsOptions listBuildRunsOptions = new ListBuildRunsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .buildName("my-build")
      .limit(Long.valueOf("100"))
      .build();

    List<BuildRun> allResults = new ArrayList<>();
    BuildRunsPager pager = new BuildRunsPager(codeEngineService, listBuildRunsOptions);
    while (pager.hasNext()) {
      List<BuildRun> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listBuildRuns operation using the BuildRunsPager.getAll() method
  @Test
  public void testListBuildRunsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"build_runs\":[{\"build_name\":\"buildName\",\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/build_runs/my-build-run\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-build-run\",\"output_image\":\"private.de.icr.io/icr_namespace/image-name\",\"output_secret\":\"ce-auto-icr-private-eu-de\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"build_run_v2\",\"service_account\":\"default\",\"source_context_dir\":\"some/subfolder\",\"source_revision\":\"main\",\"source_secret\":\"sourceSecret\",\"source_type\":\"git\",\"source_url\":\"https://github.com/IBM/CodeEngine\",\"status\":\"succeeded\",\"status_details\":{\"completion_time\":\"2022-09-22T17:40:00Z\",\"git_branch_name\":\"main\",\"git_commit_author\":\"John Doe\",\"git_commit_sha\":\"9a3d845c629d2b4a6b271b1d526dfafc1e7d9511\",\"output_digest\":\"sha256:9a3d845c629d2b4a6b271b1d526dfafc1e7d9511f8863b43b5bb0483ef626384\",\"reason\":\"succeeded\",\"source_timestamp\":\"2022-09-22T17:34:00Z\",\"start_time\":\"2022-09-22T17:34:00Z\"},\"strategy_size\":\"medium\",\"strategy_spec_file\":\"Dockerfile\",\"strategy_type\":\"dockerfile\",\"timeout\":600}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"build_runs\":[{\"build_name\":\"buildName\",\"created_at\":\"2022-09-13T11:41:35+02:00\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/build_runs/my-build-run\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-build-run\",\"output_image\":\"private.de.icr.io/icr_namespace/image-name\",\"output_secret\":\"ce-auto-icr-private-eu-de\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"build_run_v2\",\"service_account\":\"default\",\"source_context_dir\":\"some/subfolder\",\"source_revision\":\"main\",\"source_secret\":\"sourceSecret\",\"source_type\":\"git\",\"source_url\":\"https://github.com/IBM/CodeEngine\",\"status\":\"succeeded\",\"status_details\":{\"completion_time\":\"2022-09-22T17:40:00Z\",\"git_branch_name\":\"main\",\"git_commit_author\":\"John Doe\",\"git_commit_sha\":\"9a3d845c629d2b4a6b271b1d526dfafc1e7d9511\",\"output_digest\":\"sha256:9a3d845c629d2b4a6b271b1d526dfafc1e7d9511f8863b43b5bb0483ef626384\",\"reason\":\"succeeded\",\"source_timestamp\":\"2022-09-22T17:34:00Z\",\"start_time\":\"2022-09-22T17:34:00Z\"},\"strategy_size\":\"medium\",\"strategy_spec_file\":\"Dockerfile\",\"strategy_type\":\"dockerfile\",\"timeout\":600}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListBuildRunsOptions listBuildRunsOptions = new ListBuildRunsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .buildName("my-build")
      .limit(Long.valueOf("100"))
      .build();

    BuildRunsPager pager = new BuildRunsPager(codeEngineService, listBuildRunsOptions);
    List<BuildRun> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createBuildRun operation with a valid options model parameter
  @Test
  public void testCreateBuildRunWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"build_name\": \"buildName\", \"created_at\": \"2022-09-13T11:41:35+02:00\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/build_runs/my-build-run\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-build-run\", \"output_image\": \"private.de.icr.io/icr_namespace/image-name\", \"output_secret\": \"ce-auto-icr-private-eu-de\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"build_run_v2\", \"service_account\": \"default\", \"source_context_dir\": \"some/subfolder\", \"source_revision\": \"main\", \"source_secret\": \"sourceSecret\", \"source_type\": \"git\", \"source_url\": \"https://github.com/IBM/CodeEngine\", \"status\": \"succeeded\", \"status_details\": {\"completion_time\": \"2022-09-22T17:40:00Z\", \"git_branch_name\": \"main\", \"git_commit_author\": \"John Doe\", \"git_commit_sha\": \"9a3d845c629d2b4a6b271b1d526dfafc1e7d9511\", \"output_digest\": \"sha256:9a3d845c629d2b4a6b271b1d526dfafc1e7d9511f8863b43b5bb0483ef626384\", \"reason\": \"succeeded\", \"source_timestamp\": \"2022-09-22T17:34:00Z\", \"start_time\": \"2022-09-22T17:34:00Z\"}, \"strategy_size\": \"medium\", \"strategy_spec_file\": \"Dockerfile\", \"strategy_type\": \"dockerfile\", \"timeout\": 600}";
    String createBuildRunPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/build_runs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateBuildRunOptions model
    CreateBuildRunOptions createBuildRunOptionsModel = new CreateBuildRunOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .buildName("testString")
      .name("testString")
      .outputImage("private.de.icr.io/icr_namespace/image-name")
      .outputSecret("ce-auto-icr-private-eu-de")
      .serviceAccount("default")
      .sourceContextDir("some/subfolder")
      .sourceRevision("main")
      .sourceSecret("testString")
      .sourceType("git")
      .sourceUrl("https://github.com/IBM/CodeEngine")
      .strategySize("medium")
      .strategySpecFile("Dockerfile")
      .strategyType("dockerfile")
      .timeout(Long.valueOf("600"))
      .build();

    // Invoke createBuildRun() with a valid options model and verify the result
    Response<BuildRun> response = codeEngineService.createBuildRun(createBuildRunOptionsModel).execute();
    assertNotNull(response);
    BuildRun responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createBuildRunPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createBuildRun operation with and without retries enabled
  @Test
  public void testCreateBuildRunWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateBuildRunWOptions();

    codeEngineService.disableRetries();
    testCreateBuildRunWOptions();
  }

  // Test the createBuildRun operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBuildRunNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createBuildRun(null).execute();
  }

  // Test the getBuildRun operation with a valid options model parameter
  @Test
  public void testGetBuildRunWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"build_name\": \"buildName\", \"created_at\": \"2022-09-13T11:41:35+02:00\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/build_runs/my-build-run\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-build-run\", \"output_image\": \"private.de.icr.io/icr_namespace/image-name\", \"output_secret\": \"ce-auto-icr-private-eu-de\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"build_run_v2\", \"service_account\": \"default\", \"source_context_dir\": \"some/subfolder\", \"source_revision\": \"main\", \"source_secret\": \"sourceSecret\", \"source_type\": \"git\", \"source_url\": \"https://github.com/IBM/CodeEngine\", \"status\": \"succeeded\", \"status_details\": {\"completion_time\": \"2022-09-22T17:40:00Z\", \"git_branch_name\": \"main\", \"git_commit_author\": \"John Doe\", \"git_commit_sha\": \"9a3d845c629d2b4a6b271b1d526dfafc1e7d9511\", \"output_digest\": \"sha256:9a3d845c629d2b4a6b271b1d526dfafc1e7d9511f8863b43b5bb0483ef626384\", \"reason\": \"succeeded\", \"source_timestamp\": \"2022-09-22T17:34:00Z\", \"start_time\": \"2022-09-22T17:34:00Z\"}, \"strategy_size\": \"medium\", \"strategy_spec_file\": \"Dockerfile\", \"strategy_type\": \"dockerfile\", \"timeout\": 600}";
    String getBuildRunPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/build_runs/my-build-run";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBuildRunOptions model
    GetBuildRunOptions getBuildRunOptionsModel = new GetBuildRunOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-build-run")
      .build();

    // Invoke getBuildRun() with a valid options model and verify the result
    Response<BuildRun> response = codeEngineService.getBuildRun(getBuildRunOptionsModel).execute();
    assertNotNull(response);
    BuildRun responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBuildRunPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBuildRun operation with and without retries enabled
  @Test
  public void testGetBuildRunWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetBuildRunWOptions();

    codeEngineService.disableRetries();
    testGetBuildRunWOptions();
  }

  // Test the getBuildRun operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetBuildRunNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getBuildRun(null).execute();
  }

  // Test the deleteBuildRun operation with a valid options model parameter
  @Test
  public void testDeleteBuildRunWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteBuildRunPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/build_runs/my-build-run";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteBuildRunOptions model
    DeleteBuildRunOptions deleteBuildRunOptionsModel = new DeleteBuildRunOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-build-run")
      .build();

    // Invoke deleteBuildRun() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteBuildRun(deleteBuildRunOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteBuildRunPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteBuildRun operation with and without retries enabled
  @Test
  public void testDeleteBuildRunWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteBuildRunWOptions();

    codeEngineService.disableRetries();
    testDeleteBuildRunWOptions();
  }

  // Test the deleteBuildRun operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteBuildRunNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteBuildRun(null).execute();
  }

  // Test the listDomainMappings operation with a valid options model parameter
  @Test
  public void testListDomainMappingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"domain_mappings\": [{\"cname_target\": \"custom.abcdabcdabc.us-east.codeengine.appdomain.cloud\", \"component\": {\"name\": \"my-app-1\", \"resource_type\": \"app_v2\"}, \"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/domain_mappings/www.example.com\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"www.example.com\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"domain_mapping_v2\", \"status\": \"ready\", \"status_details\": {\"reason\": \"ready\"}, \"tls_secret\": \"my-tls-secret\", \"user_managed\": false, \"visibility\": \"public\"}], \"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listDomainMappingsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/domain_mappings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDomainMappingsOptions model
    ListDomainMappingsOptions listDomainMappingsOptionsModel = new ListDomainMappingsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listDomainMappings() with a valid options model and verify the result
    Response<DomainMappingList> response = codeEngineService.listDomainMappings(listDomainMappingsOptionsModel).execute();
    assertNotNull(response);
    DomainMappingList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDomainMappingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listDomainMappings operation with and without retries enabled
  @Test
  public void testListDomainMappingsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListDomainMappingsWOptions();

    codeEngineService.disableRetries();
    testListDomainMappingsWOptions();
  }

  // Test the listDomainMappings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDomainMappingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listDomainMappings(null).execute();
  }

  // Test the listDomainMappings operation using the DomainMappingsPager.getNext() method
  @Test
  public void testListDomainMappingsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"domain_mappings\":[{\"cname_target\":\"custom.abcdabcdabc.us-east.codeengine.appdomain.cloud\",\"component\":{\"name\":\"my-app-1\",\"resource_type\":\"app_v2\"},\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/domain_mappings/www.example.com\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"www.example.com\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"domain_mapping_v2\",\"status\":\"ready\",\"status_details\":{\"reason\":\"ready\"},\"tls_secret\":\"my-tls-secret\",\"user_managed\":false,\"visibility\":\"public\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"domain_mappings\":[{\"cname_target\":\"custom.abcdabcdabc.us-east.codeengine.appdomain.cloud\",\"component\":{\"name\":\"my-app-1\",\"resource_type\":\"app_v2\"},\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/domain_mappings/www.example.com\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"www.example.com\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"domain_mapping_v2\",\"status\":\"ready\",\"status_details\":{\"reason\":\"ready\"},\"tls_secret\":\"my-tls-secret\",\"user_managed\":false,\"visibility\":\"public\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDomainMappingsOptions listDomainMappingsOptions = new ListDomainMappingsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    List<DomainMapping> allResults = new ArrayList<>();
    DomainMappingsPager pager = new DomainMappingsPager(codeEngineService, listDomainMappingsOptions);
    while (pager.hasNext()) {
      List<DomainMapping> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDomainMappings operation using the DomainMappingsPager.getAll() method
  @Test
  public void testListDomainMappingsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"domain_mappings\":[{\"cname_target\":\"custom.abcdabcdabc.us-east.codeengine.appdomain.cloud\",\"component\":{\"name\":\"my-app-1\",\"resource_type\":\"app_v2\"},\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/domain_mappings/www.example.com\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"www.example.com\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"domain_mapping_v2\",\"status\":\"ready\",\"status_details\":{\"reason\":\"ready\"},\"tls_secret\":\"my-tls-secret\",\"user_managed\":false,\"visibility\":\"public\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"domain_mappings\":[{\"cname_target\":\"custom.abcdabcdabc.us-east.codeengine.appdomain.cloud\",\"component\":{\"name\":\"my-app-1\",\"resource_type\":\"app_v2\"},\"created_at\":\"2022-09-13T11:41:35+02:00\",\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/domain_mappings/www.example.com\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"www.example.com\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"domain_mapping_v2\",\"status\":\"ready\",\"status_details\":{\"reason\":\"ready\"},\"tls_secret\":\"my-tls-secret\",\"user_managed\":false,\"visibility\":\"public\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDomainMappingsOptions listDomainMappingsOptions = new ListDomainMappingsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    DomainMappingsPager pager = new DomainMappingsPager(codeEngineService, listDomainMappingsOptions);
    List<DomainMapping> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createDomainMapping operation with a valid options model parameter
  @Test
  public void testCreateDomainMappingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"cname_target\": \"custom.abcdabcdabc.us-east.codeengine.appdomain.cloud\", \"component\": {\"name\": \"my-app-1\", \"resource_type\": \"app_v2\"}, \"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/domain_mappings/www.example.com\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"www.example.com\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"domain_mapping_v2\", \"status\": \"ready\", \"status_details\": {\"reason\": \"ready\"}, \"tls_secret\": \"my-tls-secret\", \"user_managed\": false, \"visibility\": \"public\"}";
    String createDomainMappingPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/domain_mappings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ComponentRef model
    ComponentRef componentRefModel = new ComponentRef.Builder()
      .name("my-app-1")
      .resourceType("app_v2")
      .build();

    // Construct an instance of the CreateDomainMappingOptions model
    CreateDomainMappingOptions createDomainMappingOptionsModel = new CreateDomainMappingOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .component(componentRefModel)
      .name("www.example.com")
      .tlsSecret("my-tls-secret")
      .build();

    // Invoke createDomainMapping() with a valid options model and verify the result
    Response<DomainMapping> response = codeEngineService.createDomainMapping(createDomainMappingOptionsModel).execute();
    assertNotNull(response);
    DomainMapping responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDomainMappingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDomainMapping operation with and without retries enabled
  @Test
  public void testCreateDomainMappingWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateDomainMappingWOptions();

    codeEngineService.disableRetries();
    testCreateDomainMappingWOptions();
  }

  // Test the createDomainMapping operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDomainMappingNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createDomainMapping(null).execute();
  }

  // Test the getDomainMapping operation with a valid options model parameter
  @Test
  public void testGetDomainMappingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"cname_target\": \"custom.abcdabcdabc.us-east.codeengine.appdomain.cloud\", \"component\": {\"name\": \"my-app-1\", \"resource_type\": \"app_v2\"}, \"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/domain_mappings/www.example.com\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"www.example.com\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"domain_mapping_v2\", \"status\": \"ready\", \"status_details\": {\"reason\": \"ready\"}, \"tls_secret\": \"my-tls-secret\", \"user_managed\": false, \"visibility\": \"public\"}";
    String getDomainMappingPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/domain_mappings/www.example.com";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDomainMappingOptions model
    GetDomainMappingOptions getDomainMappingOptionsModel = new GetDomainMappingOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("www.example.com")
      .build();

    // Invoke getDomainMapping() with a valid options model and verify the result
    Response<DomainMapping> response = codeEngineService.getDomainMapping(getDomainMappingOptionsModel).execute();
    assertNotNull(response);
    DomainMapping responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDomainMappingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDomainMapping operation with and without retries enabled
  @Test
  public void testGetDomainMappingWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetDomainMappingWOptions();

    codeEngineService.disableRetries();
    testGetDomainMappingWOptions();
  }

  // Test the getDomainMapping operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDomainMappingNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getDomainMapping(null).execute();
  }

  // Test the deleteDomainMapping operation with a valid options model parameter
  @Test
  public void testDeleteDomainMappingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDomainMappingPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/domain_mappings/www.example.com";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDomainMappingOptions model
    DeleteDomainMappingOptions deleteDomainMappingOptionsModel = new DeleteDomainMappingOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("www.example.com")
      .build();

    // Invoke deleteDomainMapping() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteDomainMapping(deleteDomainMappingOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDomainMappingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDomainMapping operation with and without retries enabled
  @Test
  public void testDeleteDomainMappingWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteDomainMappingWOptions();

    codeEngineService.disableRetries();
    testDeleteDomainMappingWOptions();
  }

  // Test the deleteDomainMapping operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDomainMappingNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteDomainMapping(null).execute();
  }

  // Test the updateDomainMapping operation with a valid options model parameter
  @Test
  public void testUpdateDomainMappingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"cname_target\": \"custom.abcdabcdabc.us-east.codeengine.appdomain.cloud\", \"component\": {\"name\": \"my-app-1\", \"resource_type\": \"app_v2\"}, \"created_at\": \"2022-09-13T11:41:35+02:00\", \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/domain_mappings/www.example.com\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"www.example.com\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"domain_mapping_v2\", \"status\": \"ready\", \"status_details\": {\"reason\": \"ready\"}, \"tls_secret\": \"my-tls-secret\", \"user_managed\": false, \"visibility\": \"public\"}";
    String updateDomainMappingPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/domain_mappings/www.example.com";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ComponentRef model
    ComponentRef componentRefModel = new ComponentRef.Builder()
      .name("my-app-1")
      .resourceType("app_v2")
      .build();

    // Construct an instance of the DomainMappingPatch model
    DomainMappingPatch domainMappingPatchModel = new DomainMappingPatch.Builder()
      .component(componentRefModel)
      .tlsSecret("my-tls-secret")
      .build();
    Map<String, Object> domainMappingPatchModelAsPatch = domainMappingPatchModel.asPatch();

    // Construct an instance of the UpdateDomainMappingOptions model
    UpdateDomainMappingOptions updateDomainMappingOptionsModel = new UpdateDomainMappingOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("www.example.com")
      .ifMatch("testString")
      .domainMapping(domainMappingPatchModelAsPatch)
      .build();

    // Invoke updateDomainMapping() with a valid options model and verify the result
    Response<DomainMapping> response = codeEngineService.updateDomainMapping(updateDomainMappingOptionsModel).execute();
    assertNotNull(response);
    DomainMapping responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDomainMappingPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDomainMapping operation with and without retries enabled
  @Test
  public void testUpdateDomainMappingWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testUpdateDomainMappingWOptions();

    codeEngineService.disableRetries();
    testUpdateDomainMappingWOptions();
  }

  // Test the updateDomainMapping operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDomainMappingNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.updateDomainMapping(null).execute();
  }

  // Test the listConfigMaps operation with a valid options model parameter
  @Test
  public void testListConfigMapsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"config_maps\": [{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"data\": {\"mapKey\": \"inner\"}, \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/config_maps/my-config-map\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-config-map\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"config_map_v2\"}], \"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}}";
    String listConfigMapsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/config_maps";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListConfigMapsOptions model
    ListConfigMapsOptions listConfigMapsOptionsModel = new ListConfigMapsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listConfigMaps() with a valid options model and verify the result
    Response<ConfigMapList> response = codeEngineService.listConfigMaps(listConfigMapsOptionsModel).execute();
    assertNotNull(response);
    ConfigMapList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listConfigMapsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listConfigMaps operation with and without retries enabled
  @Test
  public void testListConfigMapsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListConfigMapsWOptions();

    codeEngineService.disableRetries();
    testListConfigMapsWOptions();
  }

  // Test the listConfigMaps operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListConfigMapsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listConfigMaps(null).execute();
  }

  // Test the listConfigMaps operation using the ConfigMapsPager.getNext() method
  @Test
  public void testListConfigMapsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"config_maps\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"data\":{\"mapKey\":\"inner\"},\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/config_maps/my-config-map\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-config-map\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"config_map_v2\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"config_maps\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"data\":{\"mapKey\":\"inner\"},\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/config_maps/my-config-map\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-config-map\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"config_map_v2\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListConfigMapsOptions listConfigMapsOptions = new ListConfigMapsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    List<ConfigMap> allResults = new ArrayList<>();
    ConfigMapsPager pager = new ConfigMapsPager(codeEngineService, listConfigMapsOptions);
    while (pager.hasNext()) {
      List<ConfigMap> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listConfigMaps operation using the ConfigMapsPager.getAll() method
  @Test
  public void testListConfigMapsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"config_maps\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"data\":{\"mapKey\":\"inner\"},\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/config_maps/my-config-map\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-config-map\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"config_map_v2\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"config_maps\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"data\":{\"mapKey\":\"inner\"},\"entity_tag\":\"2385407409\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/config_maps/my-config-map\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-config-map\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"config_map_v2\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListConfigMapsOptions listConfigMapsOptions = new ListConfigMapsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    ConfigMapsPager pager = new ConfigMapsPager(codeEngineService, listConfigMapsOptions);
    List<ConfigMap> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createConfigMap operation with a valid options model parameter
  @Test
  public void testCreateConfigMapWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"data\": {\"mapKey\": \"inner\"}, \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/config_maps/my-config-map\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-config-map\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"config_map_v2\"}";
    String createConfigMapPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/config_maps";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateConfigMapOptions model
    CreateConfigMapOptions createConfigMapOptionsModel = new CreateConfigMapOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-config-map")
      .data(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Invoke createConfigMap() with a valid options model and verify the result
    Response<ConfigMap> response = codeEngineService.createConfigMap(createConfigMapOptionsModel).execute();
    assertNotNull(response);
    ConfigMap responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createConfigMapPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createConfigMap operation with and without retries enabled
  @Test
  public void testCreateConfigMapWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateConfigMapWOptions();

    codeEngineService.disableRetries();
    testCreateConfigMapWOptions();
  }

  // Test the createConfigMap operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigMapNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createConfigMap(null).execute();
  }

  // Test the getConfigMap operation with a valid options model parameter
  @Test
  public void testGetConfigMapWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"data\": {\"mapKey\": \"inner\"}, \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/config_maps/my-config-map\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-config-map\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"config_map_v2\"}";
    String getConfigMapPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/config_maps/my-config-map";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfigMapOptions model
    GetConfigMapOptions getConfigMapOptionsModel = new GetConfigMapOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-config-map")
      .build();

    // Invoke getConfigMap() with a valid options model and verify the result
    Response<ConfigMap> response = codeEngineService.getConfigMap(getConfigMapOptionsModel).execute();
    assertNotNull(response);
    ConfigMap responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfigMapPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getConfigMap operation with and without retries enabled
  @Test
  public void testGetConfigMapWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetConfigMapWOptions();

    codeEngineService.disableRetries();
    testGetConfigMapWOptions();
  }

  // Test the getConfigMap operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfigMapNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getConfigMap(null).execute();
  }

  // Test the replaceConfigMap operation with a valid options model parameter
  @Test
  public void testReplaceConfigMapWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"data\": {\"mapKey\": \"inner\"}, \"entity_tag\": \"2385407409\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/config_maps/my-config-map\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-config-map\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"config_map_v2\"}";
    String replaceConfigMapPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/config_maps/my-config-map";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ReplaceConfigMapOptions model
    ReplaceConfigMapOptions replaceConfigMapOptionsModel = new ReplaceConfigMapOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-config-map")
      .ifMatch("testString")
      .data(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Invoke replaceConfigMap() with a valid options model and verify the result
    Response<ConfigMap> response = codeEngineService.replaceConfigMap(replaceConfigMapOptionsModel).execute();
    assertNotNull(response);
    ConfigMap responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceConfigMapPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceConfigMap operation with and without retries enabled
  @Test
  public void testReplaceConfigMapWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testReplaceConfigMapWOptions();

    codeEngineService.disableRetries();
    testReplaceConfigMapWOptions();
  }

  // Test the replaceConfigMap operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceConfigMapNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.replaceConfigMap(null).execute();
  }

  // Test the deleteConfigMap operation with a valid options model parameter
  @Test
  public void testDeleteConfigMapWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteConfigMapPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/config_maps/my-config-map";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteConfigMapOptions model
    DeleteConfigMapOptions deleteConfigMapOptionsModel = new DeleteConfigMapOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-config-map")
      .build();

    // Invoke deleteConfigMap() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteConfigMap(deleteConfigMapOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteConfigMapPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteConfigMap operation with and without retries enabled
  @Test
  public void testDeleteConfigMapWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteConfigMapWOptions();

    codeEngineService.disableRetries();
    testDeleteConfigMapWOptions();
  }

  // Test the deleteConfigMap operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteConfigMapNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteConfigMap(null).execute();
  }

  // Test the listSecrets operation with a valid options model parameter
  @Test
  public void testListSecretsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"limit\": 100, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"secrets\": [{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"data\": {\"mapKey\": \"inner\"}, \"entity_tag\": \"2385407409\", \"format\": \"generic\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/secrets/my-secret\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-secret\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"secret_v2\", \"service_access\": {\"resource_key\": {\"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"name\": \"name\"}, \"role\": {\"crn\": \"crn:v1:bluemix:public:iam::::serviceRole:Writer\", \"name\": \"Manager\"}, \"service_instance\": {\"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"type\": \"type\"}, \"serviceid\": {\"crn\": \"crn\", \"id\": \"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}}, \"service_operator\": {\"apikey_id\": \"ApiKey-17041d26-55e4-40a8-8ab5-5a69b68e204b\", \"resource_group_ids\": [\"resourceGroupIds\"], \"serviceid\": {\"crn\": \"crn\", \"id\": \"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}, \"user_managed\": false}}]}";
    String listSecretsPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/secrets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSecretsOptions model
    ListSecretsOptions listSecretsOptionsModel = new ListSecretsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .start("testString")
      .build();

    // Invoke listSecrets() with a valid options model and verify the result
    Response<SecretList> response = codeEngineService.listSecrets(listSecretsOptionsModel).execute();
    assertNotNull(response);
    SecretList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSecretsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listSecrets operation with and without retries enabled
  @Test
  public void testListSecretsWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testListSecretsWOptions();

    codeEngineService.disableRetries();
    testListSecretsWOptions();
  }

  // Test the listSecrets operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSecretsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.listSecrets(null).execute();
  }

  // Test the listSecrets operation using the SecretsPager.getNext() method
  @Test
  public void testListSecretsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"secrets\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"data\":{\"mapKey\":\"inner\"},\"entity_tag\":\"2385407409\",\"format\":\"generic\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/secrets/my-secret\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-secret\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"secret_v2\",\"service_access\":{\"resource_key\":{\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"name\":\"name\"},\"role\":{\"crn\":\"crn:v1:bluemix:public:iam::::serviceRole:Writer\",\"name\":\"Manager\"},\"service_instance\":{\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"type\":\"type\"},\"serviceid\":{\"crn\":\"crn\",\"id\":\"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}},\"service_operator\":{\"apikey_id\":\"ApiKey-17041d26-55e4-40a8-8ab5-5a69b68e204b\",\"resource_group_ids\":[\"resourceGroupIds\"],\"serviceid\":{\"crn\":\"crn\",\"id\":\"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"},\"user_managed\":false}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"secrets\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"data\":{\"mapKey\":\"inner\"},\"entity_tag\":\"2385407409\",\"format\":\"generic\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/secrets/my-secret\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-secret\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"secret_v2\",\"service_access\":{\"resource_key\":{\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"name\":\"name\"},\"role\":{\"crn\":\"crn:v1:bluemix:public:iam::::serviceRole:Writer\",\"name\":\"Manager\"},\"service_instance\":{\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"type\":\"type\"},\"serviceid\":{\"crn\":\"crn\",\"id\":\"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}},\"service_operator\":{\"apikey_id\":\"ApiKey-17041d26-55e4-40a8-8ab5-5a69b68e204b\",\"resource_group_ids\":[\"resourceGroupIds\"],\"serviceid\":{\"crn\":\"crn\",\"id\":\"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"},\"user_managed\":false}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretsOptions listSecretsOptions = new ListSecretsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    List<Secret> allResults = new ArrayList<>();
    SecretsPager pager = new SecretsPager(codeEngineService, listSecretsOptions);
    while (pager.hasNext()) {
      List<Secret> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSecrets operation using the SecretsPager.getAll() method
  @Test
  public void testListSecretsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"secrets\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"data\":{\"mapKey\":\"inner\"},\"entity_tag\":\"2385407409\",\"format\":\"generic\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/secrets/my-secret\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-secret\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"secret_v2\",\"service_access\":{\"resource_key\":{\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"name\":\"name\"},\"role\":{\"crn\":\"crn:v1:bluemix:public:iam::::serviceRole:Writer\",\"name\":\"Manager\"},\"service_instance\":{\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"type\":\"type\"},\"serviceid\":{\"crn\":\"crn\",\"id\":\"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}},\"service_operator\":{\"apikey_id\":\"ApiKey-17041d26-55e4-40a8-8ab5-5a69b68e204b\",\"resource_group_ids\":[\"resourceGroupIds\"],\"serviceid\":{\"crn\":\"crn\",\"id\":\"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"},\"user_managed\":false}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"secrets\":[{\"created_at\":\"2022-09-13T11:41:35+02:00\",\"data\":{\"mapKey\":\"inner\"},\"entity_tag\":\"2385407409\",\"format\":\"generic\",\"href\":\"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/secrets/my-secret\",\"id\":\"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\",\"name\":\"my-secret\",\"project_id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"region\":\"us-east\",\"resource_type\":\"secret_v2\",\"service_access\":{\"resource_key\":{\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"name\":\"name\"},\"role\":{\"crn\":\"crn:v1:bluemix:public:iam::::serviceRole:Writer\",\"name\":\"Manager\"},\"service_instance\":{\"id\":\"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\",\"type\":\"type\"},\"serviceid\":{\"crn\":\"crn\",\"id\":\"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}},\"service_operator\":{\"apikey_id\":\"ApiKey-17041d26-55e4-40a8-8ab5-5a69b68e204b\",\"resource_group_ids\":[\"resourceGroupIds\"],\"serviceid\":{\"crn\":\"crn\",\"id\":\"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"},\"user_managed\":false}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSecretsOptions listSecretsOptions = new ListSecretsOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .limit(Long.valueOf("100"))
      .build();

    SecretsPager pager = new SecretsPager(codeEngineService, listSecretsOptions);
    List<Secret> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createSecret operation with a valid options model parameter
  @Test
  public void testCreateSecretWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"data\": {\"mapKey\": \"inner\"}, \"entity_tag\": \"2385407409\", \"format\": \"generic\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/secrets/my-secret\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-secret\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"secret_v2\", \"service_access\": {\"resource_key\": {\"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"name\": \"name\"}, \"role\": {\"crn\": \"crn:v1:bluemix:public:iam::::serviceRole:Writer\", \"name\": \"Manager\"}, \"service_instance\": {\"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"type\": \"type\"}, \"serviceid\": {\"crn\": \"crn\", \"id\": \"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}}, \"service_operator\": {\"apikey_id\": \"ApiKey-17041d26-55e4-40a8-8ab5-5a69b68e204b\", \"resource_group_ids\": [\"resourceGroupIds\"], \"serviceid\": {\"crn\": \"crn\", \"id\": \"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}, \"user_managed\": false}}";
    String createSecretPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/secrets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SecretDataGenericSecretData model
    SecretDataGenericSecretData secretDataModel = new SecretDataGenericSecretData.Builder()
      .add("foo", "testString")
      .build();

    // Construct an instance of the ResourceKeyRefPrototype model
    ResourceKeyRefPrototype resourceKeyRefPrototypeModel = new ResourceKeyRefPrototype.Builder()
      .id("4e49b3e0-27a8-48d2-a784-c7ee48bb863b")
      .build();

    // Construct an instance of the RoleRefPrototype model
    RoleRefPrototype roleRefPrototypeModel = new RoleRefPrototype.Builder()
      .crn("crn:v1:bluemix:public:iam::::serviceRole:Writer")
      .build();

    // Construct an instance of the ServiceInstanceRefPrototype model
    ServiceInstanceRefPrototype serviceInstanceRefPrototypeModel = new ServiceInstanceRefPrototype.Builder()
      .id("4e49b3e0-27a8-48d2-a784-c7ee48bb863b")
      .build();

    // Construct an instance of the ServiceIDRef model
    ServiceIDRef serviceIdRefModel = new ServiceIDRef.Builder()
      .crn("testString")
      .id("ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637")
      .build();

    // Construct an instance of the ServiceAccessSecretPrototypeProps model
    ServiceAccessSecretPrototypeProps serviceAccessSecretPrototypePropsModel = new ServiceAccessSecretPrototypeProps.Builder()
      .resourceKey(resourceKeyRefPrototypeModel)
      .role(roleRefPrototypeModel)
      .serviceInstance(serviceInstanceRefPrototypeModel)
      .serviceid(serviceIdRefModel)
      .build();

    // Construct an instance of the ServiceIDRefPrototype model
    ServiceIDRefPrototype serviceIdRefPrototypeModel = new ServiceIDRefPrototype.Builder()
      .id("ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637")
      .build();

    // Construct an instance of the OperatorSecretPrototypeProps model
    OperatorSecretPrototypeProps operatorSecretPrototypePropsModel = new OperatorSecretPrototypeProps.Builder()
      .resourceGroupIds(java.util.Arrays.asList("testString"))
      .serviceid(serviceIdRefPrototypeModel)
      .build();

    // Construct an instance of the CreateSecretOptions model
    CreateSecretOptions createSecretOptionsModel = new CreateSecretOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .format("generic")
      .name("my-secret")
      .data(secretDataModel)
      .serviceAccess(serviceAccessSecretPrototypePropsModel)
      .serviceOperator(operatorSecretPrototypePropsModel)
      .build();

    // Invoke createSecret() with a valid options model and verify the result
    Response<Secret> response = codeEngineService.createSecret(createSecretOptionsModel).execute();
    assertNotNull(response);
    Secret responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSecretPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSecret operation with and without retries enabled
  @Test
  public void testCreateSecretWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testCreateSecretWOptions();

    codeEngineService.disableRetries();
    testCreateSecretWOptions();
  }

  // Test the createSecret operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecretNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.createSecret(null).execute();
  }

  // Test the getSecret operation with a valid options model parameter
  @Test
  public void testGetSecretWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"data\": {\"mapKey\": \"inner\"}, \"entity_tag\": \"2385407409\", \"format\": \"generic\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/secrets/my-secret\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-secret\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"secret_v2\", \"service_access\": {\"resource_key\": {\"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"name\": \"name\"}, \"role\": {\"crn\": \"crn:v1:bluemix:public:iam::::serviceRole:Writer\", \"name\": \"Manager\"}, \"service_instance\": {\"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"type\": \"type\"}, \"serviceid\": {\"crn\": \"crn\", \"id\": \"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}}, \"service_operator\": {\"apikey_id\": \"ApiKey-17041d26-55e4-40a8-8ab5-5a69b68e204b\", \"resource_group_ids\": [\"resourceGroupIds\"], \"serviceid\": {\"crn\": \"crn\", \"id\": \"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}, \"user_managed\": false}}";
    String getSecretPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/secrets/my-secret";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSecretOptions model
    GetSecretOptions getSecretOptionsModel = new GetSecretOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-secret")
      .build();

    // Invoke getSecret() with a valid options model and verify the result
    Response<Secret> response = codeEngineService.getSecret(getSecretOptionsModel).execute();
    assertNotNull(response);
    Secret responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecretPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSecret operation with and without retries enabled
  @Test
  public void testGetSecretWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testGetSecretWOptions();

    codeEngineService.disableRetries();
    testGetSecretWOptions();
  }

  // Test the getSecret operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSecretNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.getSecret(null).execute();
  }

  // Test the replaceSecret operation with a valid options model parameter
  @Test
  public void testReplaceSecretWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2022-09-13T11:41:35+02:00\", \"data\": {\"mapKey\": \"inner\"}, \"entity_tag\": \"2385407409\", \"format\": \"generic\", \"href\": \"https://api.eu-de.codeengine.cloud.ibm.com/v2/projects/4e49b3e0-27a8-48d2-a784-c7ee48bb863b/secrets/my-secret\", \"id\": \"e33b1cv7-7390-4437-a5c2-130d5ccdddc3\", \"name\": \"my-secret\", \"project_id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"region\": \"us-east\", \"resource_type\": \"secret_v2\", \"service_access\": {\"resource_key\": {\"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"name\": \"name\"}, \"role\": {\"crn\": \"crn:v1:bluemix:public:iam::::serviceRole:Writer\", \"name\": \"Manager\"}, \"service_instance\": {\"id\": \"4e49b3e0-27a8-48d2-a784-c7ee48bb863b\", \"type\": \"type\"}, \"serviceid\": {\"crn\": \"crn\", \"id\": \"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}}, \"service_operator\": {\"apikey_id\": \"ApiKey-17041d26-55e4-40a8-8ab5-5a69b68e204b\", \"resource_group_ids\": [\"resourceGroupIds\"], \"serviceid\": {\"crn\": \"crn\", \"id\": \"ServiceId-8fa4bc74-6441-4e5b-af3a-2b1af325a637\"}, \"user_managed\": false}}";
    String replaceSecretPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/secrets/my-secret";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SecretDataGenericSecretData model
    SecretDataGenericSecretData secretDataModel = new SecretDataGenericSecretData.Builder()
      .add("foo", "testString")
      .build();

    // Construct an instance of the ReplaceSecretOptions model
    ReplaceSecretOptions replaceSecretOptionsModel = new ReplaceSecretOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-secret")
      .ifMatch("testString")
      .format("generic")
      .data(secretDataModel)
      .build();

    // Invoke replaceSecret() with a valid options model and verify the result
    Response<Secret> response = codeEngineService.replaceSecret(replaceSecretOptionsModel).execute();
    assertNotNull(response);
    Secret responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceSecretPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceSecret operation with and without retries enabled
  @Test
  public void testReplaceSecretWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testReplaceSecretWOptions();

    codeEngineService.disableRetries();
    testReplaceSecretWOptions();
  }

  // Test the replaceSecret operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSecretNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.replaceSecret(null).execute();
  }

  // Test the deleteSecret operation with a valid options model parameter
  @Test
  public void testDeleteSecretWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSecretPath = "/projects/15314cc3-85b4-4338-903f-c28cdee6d005/secrets/my-secret";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSecretOptions model
    DeleteSecretOptions deleteSecretOptionsModel = new DeleteSecretOptions.Builder()
      .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
      .name("my-secret")
      .build();

    // Invoke deleteSecret() with a valid options model and verify the result
    Response<Void> response = codeEngineService.deleteSecret(deleteSecretOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSecretPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSecret operation with and without retries enabled
  @Test
  public void testDeleteSecretWRetries() throws Throwable {
    codeEngineService.enableRetries(4, 30);
    testDeleteSecretWOptions();

    codeEngineService.disableRetries();
    testDeleteSecretWOptions();
  }

  // Test the deleteSecret operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSecretNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    codeEngineService.deleteSecret(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    codeEngineService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String version = "2025-01-10";

    codeEngineService = CodeEngine.newInstance(serviceName);
    String url = server.url("/").toString();
    codeEngineService.setServiceUrl(url);
    // Set any optional global params
    codeEngineService.setVersion(version);
  }
}