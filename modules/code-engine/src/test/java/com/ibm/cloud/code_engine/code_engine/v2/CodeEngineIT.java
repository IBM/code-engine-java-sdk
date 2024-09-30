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

package com.ibm.cloud.code_engine.code_engine.v2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ibm.cloud.code_engine.code_engine.v2.model.*;
import com.ibm.cloud.sdk.core.util.GsonSingleton;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.code_engine.code_engine.v2.utils.TestUtilities;
import com.ibm.cloud.code_engine.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

/**
 * Integration test class for the CodeEngine service.
 */
public class CodeEngineIT extends SdkIntegrationTestBase {
    public CodeEngine service = null;
    public static Map<String, String> config = null;
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    protected String e2eTestProjectId;

    /**
     * This method provides our config filename to the base class.
     */

    public String getConfigFilename() {
        return "../../code_engine_v2.env";
    }

    // helper function to read file content
    public String readFromFile(String fileName) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = null;
        BufferedReader bufReader = null;
        InputStreamReader isReader = null;
        try {
            inputStream = classLoader.getResourceAsStream(fileName);
            isReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            bufReader = new BufferedReader(isReader);
            return bufReader
                    .lines()
                    .collect(Collectors.joining("\n"));
        } finally {
            if (isReader != null) {
                isReader.close();
            }
            if (bufReader != null) {
                bufReader.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @BeforeClass
    public void constructService() {
        // Ask super if we should skip the tests.
        if (skipTests()) {
            return;
        }

        service = CodeEngine.newInstance();
        assertNotNull(service);
        assertNotNull(service.getServiceUrl());

        // Load up our test-specific config properties.
        config = CredentialUtils.getServiceProperties(CodeEngine.DEFAULT_SERVICE_NAME);
        assertNotNull(config);
        assertFalse(config.isEmpty());
        assertEquals(service.getServiceUrl(), config.get("URL"));

        service.enableRetries(4, 30);

        System.out.println("Setup complete.");
    }

    @Test
    public void testListProjects() throws Exception {
        try {
            ListProjectsOptions listProjectsOptions = new ListProjectsOptions.Builder()
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<ProjectList> response = service.listProjects(listProjectsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ProjectList projectListResult = response.getResult();

            assertNotNull(projectListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListProjects"})
    public void testListProjectsWithPager() throws Exception {
        try {
            ListProjectsOptions options = new ListProjectsOptions.Builder()
                    .limit(Long.valueOf("100"))
                    .build();

            // Test getNext().
            List<Project> allResults = new ArrayList<>();
            ProjectsPager pager = new ProjectsPager(service, options);
            while (pager.hasNext()) {
                List<Project> nextPage = pager.getNext();
                assertNotNull(nextPage);
                allResults.addAll(nextPage);
            }
            assertFalse(allResults.isEmpty());

            // Test getAll();
            pager = new ProjectsPager(service, options);
            List<Project> allItems = pager.getAll();
            assertNotNull(allItems);
            assertFalse(allItems.isEmpty());

            assertEquals(allItems.size(), allResults.size());
            System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListProjects"})
    public void testCreateProject() throws Exception {
        try {
            CreateProjectOptions createProjectOptions = new CreateProjectOptions.Builder()
                    .name("sdk-e2e-java-" + System.currentTimeMillis())
                    .tags(java.util.Arrays.asList("testString"))
                    .build();

            // Invoke operation
            Response<Project> response = service.createProject(createProjectOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);

            Project projectResult = response.getResult();
            assertNotNull(projectResult);
            e2eTestProjectId = projectResult.getId();

            GetProjectOptions getProjectOptions = new GetProjectOptions.Builder()
                    .id(e2eTestProjectId)
                    .build();

            //
            // Assume that the project creation takes some time
            Project project = null;
            for (int i = 0; i < 20; i++) {
                Thread.sleep(10000, 0);
                try {
                    Response<Project> getResponse = service.getProject(getProjectOptions).execute();
                    project = getResponse.getResult();
                    System.out.println(
                            String.format("Obtained status of project '%s' (guid: '%s'): %s.", project.getName(), project.getId(),
                                    project.getStatus()));
                    if ("active".equals(project.getStatus())) {
                        break;
                    }
                } catch (ServiceResponseException e) {
                    if (e.getStatusCode() == 403) {
                        // This is expected and acceptable
                        // The API returns a 403 in case the project is not ready yet
                    } else {
                        throw e;
                    }
                }
            }
            assertNotNull(project);
            assertEquals(project.getStatus(), "active");
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateProject"})
    public void testGetProject() throws Exception {
        try {
            GetProjectOptions getProjectOptions = new GetProjectOptions.Builder()
                    .id(e2eTestProjectId)
                    .build();

            // Invoke operation
            Response<Project> response = service.getProject(getProjectOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Project projectResult = response.getResult();

            assertNotNull(projectResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetProject"})
    public void testGetProjectEgressIps() throws Exception {
        try {
            GetProjectEgressIpsOptions getProjectEgressIpsOptions = new GetProjectEgressIpsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .build();

            // Invoke operation
            Response<ProjectEgressIPAddresses> response = service.getProjectEgressIps(getProjectEgressIpsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ProjectEgressIPAddresses projectEgressIpAddressesResult = response.getResult();

            assertNotNull(projectEgressIpAddressesResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetProjectEgressIps"})
    public void testListApps() throws Exception {
        try {
            ListAppsOptions listAppsOptions = new ListAppsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<AppList> response = service.listApps(listAppsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            AppList appListResult = response.getResult();

            assertNotNull(appListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListApps"})
    public void testListAppsWithPager() throws Exception {
        try {
            ListAppsOptions options = new ListAppsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Test getNext().
            List<App> allResults = new ArrayList<>();
            AppsPager pager = new AppsPager(service, options);
            while (pager.hasNext()) {
                List<App> nextPage = pager.getNext();
                assertNotNull(nextPage);
                allResults.addAll(nextPage);
            }
            assertFalse(allResults.isEmpty());

            // Test getAll();
            pager = new AppsPager(service, options);
            List<App> allItems = pager.getAll();
            assertNotNull(allItems);
            assertFalse(allItems.isEmpty());

            assertEquals(allItems.size(), allResults.size());
            System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListApps"})
    public void testCreateApp() throws Exception {
        try {
            EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
                    .key("MY_VARIABLE")
                    .name("SOME")
                    .prefix("PREFIX_")
                    .reference("my-secret")
                    .type("literal")
                    .value("VALUE")
                    .build();

            VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
                    .mountPath("/app")
                    .name("codeengine-mount-b69u90")
                    .reference("my-secret")
                    .type("secret")
                    .build();

            CreateAppOptions createAppOptions = new CreateAppOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .imageReference("icr.io/codeengine/helloworld")
                    .name("my-app")
                    .imagePort(Long.valueOf("8080"))
                    .imageSecret("my-secret")
                    .managedDomainMappings("local_public")
                    .runArguments(java.util.Arrays.asList("testString"))
                    .runAsUser(Long.valueOf("1001"))
                    .runCommands(java.util.Arrays.asList("testString"))
                    .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
                    .runServiceAccount("default")
                    .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
                    .scaleConcurrency(Long.valueOf("100"))
                    .scaleConcurrencyTarget(Long.valueOf("80"))
                    .scaleCpuLimit("1")
                    .scaleEphemeralStorageLimit("4G")
                    .scaleInitialInstances(Long.valueOf("1"))
                    .scaleMaxInstances(Long.valueOf("10"))
                    .scaleMemoryLimit("4G")
                    .scaleMinInstances(Long.valueOf("0"))
                    .scaleRequestTimeout(Long.valueOf("300"))
                    .build();

            // Invoke operation
            Response<App> response = service.createApp(createAppOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            App appResult = response.getResult();

            assertNotNull(appResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateApp"})
    public void testGetApp() throws Exception {
        try {
            GetAppOptions getAppOptions = new GetAppOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-app")
                    .build();

            // Invoke operation
            Response<App> response = service.getApp(getAppOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            App appResult = response.getResult();

            assertNotNull(appResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetApp"})
    public void testUpdateApp() throws Exception {
        try {
            EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
                    .key("MY_VARIABLE")
                    .name("SOME")
                    .prefix("PREFIX_")
                    .reference("my-secret")
                    .type("literal")
                    .value("VALUE")
                    .build();

            VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
                    .mountPath("/app")
                    .name("codeengine-mount-b69u90")
                    .reference("my-secret")
                    .type("secret")
                    .build();

            AppPatch appPatchModel = new AppPatch.Builder()
                    .imagePort(Long.valueOf("8080"))
                    .imageReference("icr.io/codeengine/helloworld")
                    .imageSecret("my-secret")
                    .managedDomainMappings("local_public")
                    .runArguments(java.util.Arrays.asList("testString"))
                    .runAsUser(Long.valueOf("1001"))
                    .runCommands(java.util.Arrays.asList("testString"))
                    .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
                    .runServiceAccount("default")
                    .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
                    .scaleConcurrency(Long.valueOf("100"))
                    .scaleConcurrencyTarget(Long.valueOf("80"))
                    .scaleCpuLimit("1")
                    .scaleEphemeralStorageLimit("4G")
                    .scaleInitialInstances(Long.valueOf("1"))
                    .scaleMaxInstances(Long.valueOf("10"))
                    .scaleMemoryLimit("4G")
                    .scaleMinInstances(Long.valueOf("0"))
                    .scaleRequestTimeout(Long.valueOf("300"))
                    .build();
            Map<String, Object> appPatchModelAsPatch = appPatchModel.asPatch();

            UpdateAppOptions updateAppOptions = new UpdateAppOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-app")
                    .ifMatch("*")
                    .app(appPatchModelAsPatch)
                    .build();

            // Invoke operation
            Response<App> response = service.updateApp(updateAppOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            App appResult = response.getResult();

            assertNotNull(appResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testUpdateApp"})
    public void testListAppRevisions() throws Exception {
        try {
            ListAppRevisionsOptions listAppRevisionsOptions = new ListAppRevisionsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .appName("my-app")
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<AppRevisionList> response = service.listAppRevisions(listAppRevisionsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            AppRevisionList appRevisionListResult = response.getResult();

            assertNotNull(appRevisionListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListAppRevisions"})
    public void testListAppRevisionsWithPager() throws Exception {
        try {
            ListAppRevisionsOptions options = new ListAppRevisionsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .appName("my-app")
                    .limit(Long.valueOf("100"))
                    .build();

            // Test getNext().
            List<AppRevision> allResults = new ArrayList<>();
            AppRevisionsPager pager = new AppRevisionsPager(service, options);
            while (pager.hasNext()) {
                List<AppRevision> nextPage = pager.getNext();
                assertNotNull(nextPage);
                allResults.addAll(nextPage);
            }
            assertFalse(allResults.isEmpty());

            // Test getAll();
            pager = new AppRevisionsPager(service, options);
            List<AppRevision> allItems = pager.getAll();
            assertNotNull(allItems);
            assertFalse(allItems.isEmpty());

            assertEquals(allItems.size(), allResults.size());
            System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListAppRevisions"})
    public void testGetAppRevision() throws Exception {
        try {
            GetAppRevisionOptions getAppRevisionOptions = new GetAppRevisionOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .appName("my-app")
                    .name("my-app-00001")
                    .build();

            // Invoke operation
            Response<AppRevision> response = service.getAppRevision(getAppRevisionOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            AppRevision appRevisionResult = response.getResult();

            assertNotNull(appRevisionResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetAppRevision"})
    public void testListJobs() throws Exception {
        try {
            ListJobsOptions listJobsOptions = new ListJobsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<JobList> response = service.listJobs(listJobsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            JobList jobListResult = response.getResult();

            assertNotNull(jobListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListJobs"})
    public void testListJobsWithPager() throws Exception {
        try {
            ListJobsOptions options = new ListJobsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Test getNext().
            List<Job> allResults = new ArrayList<>();
            JobsPager pager = new JobsPager(service, options);
            while (pager.hasNext()) {
                List<Job> nextPage = pager.getNext();
                assertNotNull(nextPage);
                allResults.addAll(nextPage);
            }
            assertFalse(allResults.isEmpty());

            // Test getAll();
            pager = new JobsPager(service, options);
            List<Job> allItems = pager.getAll();
            assertNotNull(allItems);
            assertFalse(allItems.isEmpty());

            assertEquals(allItems.size(), allResults.size());
            System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListJobs"})
    public void testCreateJob() throws Exception {
        try {
            EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
                    .key("MY_VARIABLE")
                    .name("SOME")
                    .prefix("PREFIX_")
                    .reference("my-secret")
                    .type("literal")
                    .value("VALUE")
                    .build();

            VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
                    .mountPath("/app")
                    .name("codeengine-mount-b69u90")
                    .reference("my-secret")
                    .type("secret")
                    .build();

            CreateJobOptions createJobOptions = new CreateJobOptions.Builder()
                    .projectId(e2eTestProjectId)
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

            // Invoke operation
            Response<Job> response = service.createJob(createJobOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Job jobResult = response.getResult();

            assertNotNull(jobResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateJob"})
    public void testGetJob() throws Exception {
        try {
            GetJobOptions getJobOptions = new GetJobOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-job")
                    .build();

            // Invoke operation
            Response<Job> response = service.getJob(getJobOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Job jobResult = response.getResult();

            assertNotNull(jobResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetJob"})
    public void testUpdateJob() throws Exception {
        try {
            EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
                    .key("MY_VARIABLE")
                    .name("SOME")
                    .prefix("PREFIX_")
                    .reference("my-secret")
                    .type("literal")
                    .value("VALUE")
                    .build();

            VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
                    .mountPath("/app")
                    .name("codeengine-mount-b69u90")
                    .reference("my-secret")
                    .type("secret")
                    .build();

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

            UpdateJobOptions updateJobOptions = new UpdateJobOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-job")
                    .ifMatch("*")
                    .job(jobPatchModelAsPatch)
                    .build();

            // Invoke operation
            Response<Job> response = service.updateJob(updateJobOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Job jobResult = response.getResult();

            assertNotNull(jobResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testUpdateJob"})
    public void testListJobRuns() throws Exception {
        try {
            ListJobRunsOptions listJobRunsOptions = new ListJobRunsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .jobName("my-job")
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<JobRunList> response = service.listJobRuns(listJobRunsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            JobRunList jobRunListResult = response.getResult();

            assertNotNull(jobRunListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListJobRuns"})
    public void testListJobRunsWithPager() throws Exception {
        try {
            ListJobRunsOptions options = new ListJobRunsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .jobName("my-job")
                    .limit(Long.valueOf("100"))
                    .build();

            // Test getNext().
            List<JobRun> allResults = new ArrayList<>();
            JobRunsPager pager = new JobRunsPager(service, options);
            while (pager.hasNext()) {
                List<JobRun> nextPage = pager.getNext();
                assertNotNull(nextPage);
                allResults.addAll(nextPage);
            }
            assertFalse(allResults.isEmpty());

            // Test getAll();
            pager = new JobRunsPager(service, options);
            List<JobRun> allItems = pager.getAll();
            assertNotNull(allItems);
            assertFalse(allItems.isEmpty());

            assertEquals(allItems.size(), allResults.size());
            System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListJobRuns"})
    public void testCreateJobRun() throws Exception {
        try {
            EnvVarPrototype envVarPrototypeModel = new EnvVarPrototype.Builder()
                    .key("MY_VARIABLE")
                    .name("SOME")
                    .prefix("PREFIX_")
                    .reference("my-secret")
                    .type("literal")
                    .value("VALUE")
                    .build();

            VolumeMountPrototype volumeMountPrototypeModel = new VolumeMountPrototype.Builder()
                    .mountPath("/app")
                    .name("codeengine-mount-b69u90")
                    .reference("my-secret")
                    .type("secret")
                    .build();

            CreateJobRunOptions createJobRunOptions = new CreateJobRunOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .imageReference("icr.io/codeengine/helloworld")
                    .jobName("my-job")
                    .name("my-job-run")
                    .runArguments(java.util.Arrays.asList("testString"))
                    .runAsUser(Long.valueOf("1001"))
                    .runCommands(java.util.Arrays.asList("testString"))
                    .runEnvVariables(java.util.Arrays.asList(envVarPrototypeModel))
                    .runMode("task")
                    .runVolumeMounts(java.util.Arrays.asList(volumeMountPrototypeModel))
                    .scaleArraySpec("1-5,7-8,10")
                    .scaleCpuLimit("1")
                    .scaleEphemeralStorageLimit("4G")
                    .scaleMaxExecutionTime(Long.valueOf("7200"))
                    .scaleMemoryLimit("4G")
                    .scaleRetryLimit(Long.valueOf("3"))
                    .build();

            // Invoke operation
            Response<JobRun> response = service.createJobRun(createJobRunOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);

            JobRun jobRunResult = response.getResult();

            assertNotNull(jobRunResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateJobRun"})
    public void testGetJobRun() throws Exception {
        try {
            GetJobRunOptions getJobRunOptions = new GetJobRunOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-job-run")
                    .build();

            // Invoke operation
            Response<JobRun> response = service.getJobRun(getJobRunOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            JobRun jobRunResult = response.getResult();

            assertNotNull(jobRunResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetJobRun"})
    public void testListBuilds() throws Exception {
        try {
            ListBuildsOptions listBuildsOptions = new ListBuildsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<BuildList> response = service.listBuilds(listBuildsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            BuildList buildListResult = response.getResult();

            assertNotNull(buildListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListBuilds"})
    public void testListBuildsWithPager() throws Exception {
        try {
            ListBuildsOptions options = new ListBuildsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Test getNext().
            List<Build> allResults = new ArrayList<>();
            BuildsPager pager = new BuildsPager(service, options);
            while (pager.hasNext()) {
                List<Build> nextPage = pager.getNext();
                assertNotNull(nextPage);
                allResults.addAll(nextPage);
            }
            assertFalse(allResults.isEmpty());

            // Test getAll();
            pager = new BuildsPager(service, options);
            List<Build> allItems = pager.getAll();
            assertNotNull(allItems);
            assertFalse(allItems.isEmpty());

            assertEquals(allItems.size(), allResults.size());
            System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListBuilds"})
    public void testCreateBuild() throws Exception {
        try {
            CreateBuildOptions createBuildOptions = new CreateBuildOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-build")
                    .outputImage("private.de.icr.io/icr_namespace/image-name")
                    .outputSecret("ce-auto-icr-private-eu-de")
                    .sourceUrl("https://github.com/IBM/CodeEngine")
                    .strategyType("dockerfile")
                    .sourceContextDir("some/subfolder")
                    .sourceRevision("main")
                    .sourceSecret("my-secret")
                    .sourceType("git")
                    .strategySize("medium")
                    .strategySpecFile("Dockerfile")
                    .timeout(Long.valueOf("600"))
                    .build();

            // Invoke operation
            Response<Build> response = service.createBuild(createBuildOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Build buildResult = response.getResult();

            assertNotNull(buildResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateBuild"})
    public void testGetBuild() throws Exception {
        try {
            GetBuildOptions getBuildOptions = new GetBuildOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-build")
                    .build();

            // Invoke operation
            Response<Build> response = service.getBuild(getBuildOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Build buildResult = response.getResult();

            assertNotNull(buildResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetBuild"})
    public void testUpdateBuild() throws Exception {
        try {
            BuildPatch buildPatchModel = new BuildPatch.Builder()
                    .outputImage("private.de.icr.io/icr_namespace/image-name")
                    .outputSecret("ce-auto-icr-private-eu-de")
                    .sourceContextDir("some/subfolder")
                    .sourceRevision("main")
                    .sourceSecret("my-secret")
                    .sourceType("git")
                    .sourceUrl("https://github.com/IBM/CodeEngine")
                    .strategySize("medium")
                    .strategySpecFile("Dockerfile")
                    .strategyType("dockerfile")
                    .timeout(Long.valueOf("600"))
                    .build();
            Map<String, Object> buildPatchModelAsPatch = buildPatchModel.asPatch();

            UpdateBuildOptions updateBuildOptions = new UpdateBuildOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-build")
                    .ifMatch("*")
                    .build(buildPatchModelAsPatch)
                    .build();

            // Invoke operation
            Response<Build> response = service.updateBuild(updateBuildOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Build buildResult = response.getResult();

            assertNotNull(buildResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testUpdateBuild"})
    public void testCreateBuildRun() throws Exception {
        try {
            CreateBuildRunOptions createBuildRunOptions = new CreateBuildRunOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .buildName("my-build")
                    .name("my-build-run")
                    .outputImage("private.de.icr.io/icr_namespace/image-name")
                    .outputSecret("ce-auto-icr-private-eu-de")
                    .serviceAccount("default")
                    .sourceContextDir("some/subfolder")
                    .sourceRevision("main")
                    .sourceSecret("my-secret")
                    .sourceType("git")
                    .sourceUrl("https://github.com/IBM/CodeEngine")
                    .strategySize("medium")
                    .strategySpecFile("Dockerfile")
                    .strategyType("dockerfile")
                    .timeout(Long.valueOf("600"))
                    .build();

            // Invoke operation
            Response<BuildRun> response = service.createBuildRun(createBuildRunOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);

            BuildRun buildRunResult = response.getResult();

            assertNotNull(buildRunResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateBuildRun"})
    public void testGetBuildRun() throws Exception {
        try {
            GetBuildRunOptions getBuildRunOptions = new GetBuildRunOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-build-run")
                    .build();

            // Invoke operation
            Response<BuildRun> response = service.getBuildRun(getBuildRunOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            BuildRun buildRunResult = response.getResult();

            assertNotNull(buildRunResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetBuildRun"})
    public void testListBuildRuns() throws Exception {
        try {
            ListBuildRunsOptions listBuildRunsOptions = new ListBuildRunsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .buildName("my-build")
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<BuildRunList> response = service.listBuildRuns(listBuildRunsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            BuildRunList buildRunListResult = response.getResult();

            assertNotNull(buildRunListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListBuildRuns"})
    public void testListBuildRunsWithPager() throws Exception {
        try {
            ListBuildRunsOptions options = new ListBuildRunsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .buildName("my-build")
                    .limit(Long.valueOf("100"))
                    .build();

            // Test getNext().
            List<BuildRun> allResults = new ArrayList<>();
            BuildRunsPager pager = new BuildRunsPager(service, options);
            while (pager.hasNext()) {
                List<BuildRun> nextPage = pager.getNext();
                assertNotNull(nextPage);
                allResults.addAll(nextPage);
            }
            // FIXME assertFalse(allResults.isEmpty());

            // Test getAll();
            pager = new BuildRunsPager(service, options);
            List<BuildRun> allItems = pager.getAll();
            assertNotNull(allItems);
            // FIXME FassertFalse(allItems.isEmpty());

            assertEquals(allItems.size(), allResults.size());
            System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListBuildRunsWithPager"})
    public void testListConfigMaps() throws Exception {
        try {
            ListConfigMapsOptions listConfigMapsOptions = new ListConfigMapsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<ConfigMapList> response = service.listConfigMaps(listConfigMapsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ConfigMapList configMapListResult = response.getResult();

            assertNotNull(configMapListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListConfigMaps"})
    public void testListConfigMapsWithPager() throws Exception {
        try {
            ListConfigMapsOptions options = new ListConfigMapsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Test getNext().
            List<ConfigMap> allResults = new ArrayList<>();
            ConfigMapsPager pager = new ConfigMapsPager(service, options);
            while (pager.hasNext()) {
                List<ConfigMap> nextPage = pager.getNext();
                assertNotNull(nextPage);
                allResults.addAll(nextPage);
            }
            assertFalse(allResults.isEmpty());

            // Test getAll();
            pager = new ConfigMapsPager(service, options);
            List<ConfigMap> allItems = pager.getAll();
            assertNotNull(allItems);
            assertFalse(allItems.isEmpty());

            assertEquals(allItems.size(), allResults.size());
            System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListConfigMaps"})
    public void testCreateConfigMap() throws Exception {
        try {
            CreateConfigMapOptions createConfigMapOptions = new CreateConfigMapOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-config-map")
                    .data(java.util.Collections.singletonMap("foo", "testString"))
                    .build();

            // Invoke operation
            Response<ConfigMap> response = service.createConfigMap(createConfigMapOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            ConfigMap configMapResult = response.getResult();

            assertNotNull(configMapResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateConfigMap"})
    public void testGetConfigMap() throws Exception {
        try {
            GetConfigMapOptions getConfigMapOptions = new GetConfigMapOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-config-map")
                    .build();

            // Invoke operation
            Response<ConfigMap> response = service.getConfigMap(getConfigMapOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ConfigMap configMapResult = response.getResult();

            assertNotNull(configMapResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetConfigMap"})
    public void testReplaceConfigMap() throws Exception {
        try {
            ReplaceConfigMapOptions replaceConfigMapOptions = new ReplaceConfigMapOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-config-map")
                    .ifMatch("*")
                    .data(java.util.Collections.singletonMap("foo", "testString"))
                    .build();

            // Invoke operation
            Response<ConfigMap> response = service.replaceConfigMap(replaceConfigMapOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ConfigMap configMapResult = response.getResult();

            assertNotNull(configMapResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testReplaceConfigMap"})
    public void testListSecrets() throws Exception {
        try {
            ListSecretsOptions listSecretsOptions = new ListSecretsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<SecretList> response = service.listSecrets(listSecretsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            SecretList secretListResult = response.getResult();

            assertNotNull(secretListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListSecrets"})
    public void testListSecretsWithPager() throws Exception {
        try {
            ListSecretsOptions options = new ListSecretsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Test getNext().
            List<Secret> allResults = new ArrayList<>();
            SecretsPager pager = new SecretsPager(service, options);
            while (pager.hasNext()) {
                List<Secret> nextPage = pager.getNext();
                assertNotNull(nextPage);
                allResults.addAll(nextPage);
            }
            assertFalse(allResults.isEmpty());

            // Test getAll();
            pager = new SecretsPager(service, options);
            List<Secret> allItems = pager.getAll();
            assertNotNull(allItems);
            assertFalse(allItems.isEmpty());

            assertEquals(allItems.size(), allResults.size());
            System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListSecrets"})
    public void testCreateGenericSecret() throws Exception {
        try {
            SecretDataGenericSecretData secretData = new SecretDataGenericSecretData();
            secretData.setProperties(java.util.Collections.singletonMap("foo", "testString"));
            CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .format("generic")
                    .name("my-secret")
                    .data(secretData)
                    .build();

            // Invoke operation
            Response<Secret> response = service.createSecret(createSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateGenericSecret"})
    public void testCreateSSHSecret() throws Exception {
        try {
            SecretDataSSHSecretData SshSecretData = new SecretDataSSHSecretData();
            SshSecretData.setSshKey(readFromFile("sshkey.pem"));
            CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .format("ssh_auth")
                    .name("my-ssh-secret")
                    .data(SshSecretData)
                    .build();

            // Invoke operation
            Response<Secret> response = service.createSecret(createSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateSSHSecret"})
    public void testCreateBasicAuthSecret() throws Exception {
        try {
            SecretDataBasicAuthSecretData BasicAuthSecretData = new SecretDataBasicAuthSecretData();
            BasicAuthSecretData.setUsername("user1");
            BasicAuthSecretData.setPassword("pass1");
            CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .format("basic_auth")
                    .name("my-basic-auth-secret")
                    .data(BasicAuthSecretData)
                    .build();

            // Invoke operation
            Response<Secret> response = service.createSecret(createSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateBasicAuthSecret"})
    public void testCreateRegistrySecret() throws Exception {
        try {
            SecretDataRegistrySecretData RegistrySecretData = new SecretDataRegistrySecretData();
            RegistrySecretData.setUsername("user1");
            RegistrySecretData.setPassword("pass1");
            RegistrySecretData.setEmail("email@email.com");
            RegistrySecretData.setServer("github.com");
            CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .format("registry")
                    .name("my-registry-secret")
                    .data(RegistrySecretData)
                    .build();

            // Invoke operation
            Response<Secret> response = service.createSecret(createSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateRegistrySecret"})
    public void testGetGenericSecret() throws Exception {
        try {
            GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-secret")
                    .build();

            // Invoke operation
            Response<Secret> response = service.getSecret(getSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetGenericSecret"})
    public void testGetSSHSecret() throws Exception {
        try {
            GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-ssh-secret")
                    .build();

            // Invoke operation
            Response<Secret> response = service.getSecret(getSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetSSHSecret"})
    public void testGetBasicAuthSecret() throws Exception {
        try {
            GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-basic-auth-secret")
                    .build();

            // Invoke operation
            Response<Secret> response = service.getSecret(getSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetBasicAuthSecret"})
    public void testGetRegistrySecret() throws Exception {
        try {
            GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-registry-secret")
                    .build();

            // Invoke operation
            Response<Secret> response = service.getSecret(getSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetRegistrySecret"})
    public void testReplaceGenericSecret() throws Exception {
        try {
            SecretDataGenericSecretData secretData = new SecretDataGenericSecretData();
            secretData.setProperties(java.util.Collections.singletonMap("foo", "testString2"));
            ReplaceSecretOptions replaceSecretOptions = new ReplaceSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-secret")
                    .ifMatch("*")
                    .data(secretData)
                    .format("generic")
                    .build();

            // Invoke operation
            Response<Secret> response = service.replaceSecret(replaceSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testReplaceGenericSecret"})
    public void testReplaceSSHSecret() throws Exception {
        try {
            SecretDataSSHSecretData SshSecretData = new SecretDataSSHSecretData();
            SshSecretData.setSshKey(readFromFile("sshkey.pem"));
            ReplaceSecretOptions replaceSecretOptions = new ReplaceSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-ssh-secret")
                    .ifMatch("*")
                    .data(SshSecretData)
                    .format("ssh_auth")
                    .build();

            // Invoke operation
            Response<Secret> response = service.replaceSecret(replaceSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testReplaceSSHSecret"})
    public void testReplaceBasicAuthSecret() throws Exception {
        try {
            SecretDataBasicAuthSecretData BasicAuthSecretData = new SecretDataBasicAuthSecretData();
            BasicAuthSecretData.setUsername("user2");
            BasicAuthSecretData.setPassword("pass2");
            ReplaceSecretOptions replaceSecretOptions = new ReplaceSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-basic-auth-secret")
                    .ifMatch("*")
                    .data(BasicAuthSecretData)
                    .format("basic_auth")
                    .build();

            // Invoke operation
            Response<Secret> response = service.replaceSecret(replaceSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testReplaceBasicAuthSecret"})
    public void testReplaceRegistrySecret() throws Exception {
        try {
            SecretDataRegistrySecretData RegistrySecretData = new SecretDataRegistrySecretData();
            RegistrySecretData.setUsername("user2");
            RegistrySecretData.setPassword("pass2");
            RegistrySecretData.setEmail("email@email.com");
            RegistrySecretData.setServer("github.com");
            ReplaceSecretOptions replaceSecretOptions = new ReplaceSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-registry-secret")
                    .ifMatch("*")
                    .data(RegistrySecretData)
                    .format("registry")
                    .build();

            // Invoke operation
            Response<Secret> response = service.replaceSecret(replaceSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testReplaceRegistrySecret"})
    public void testCreateServiceAccessSecret() throws Exception {
        try {
            ServiceInstanceRefPrototype SaRef = new ServiceInstanceRefPrototype.Builder()
                    .id("498131b4-d4b0-42ff-8592-ab3a2f6e3be6").build();
            ResourceKeyRefPrototype RKRef = new ResourceKeyRefPrototype.Builder().build();
            ServiceAccessSecretPrototypeProps serviceAccess = new ServiceAccessSecretPrototypeProps.Builder()
                    .serviceInstance(SaRef).resourceKey(RKRef).build();
            CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .format("service_access")
                    .name("my-service-access-secret")
                    .serviceAccess(serviceAccess)
                    .build();

            // Invoke operation
            Response<Secret> response = service.createSecret(createSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateServiceAccessSecret"})
    public void testGetServiceAccessSecret() throws Exception {
        try {
            GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-service-access-secret")
                    .build();

            // Invoke operation
            Response<Secret> response = service.getSecret(getSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetServiceAccessSecret"})
    public void testCreateBinding() throws Exception {
        try {
            ComponentRef component = new ComponentRef.Builder()
                    .name("my-app")
                    .resourceType("app_v2")
                    .build();
            CreateBindingOptions createBindingOptions = new CreateBindingOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .prefix("MY_BINDING")
                    .component(component)
                    .secretName("my-service-access-secret")
                    .build();

            // Invoke operation
            Response<Binding> response = service.createBinding(createBindingOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Binding bindingResult = response.getResult();
            assertNotNull(bindingResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateBinding"})
    public void testGetBinding() throws Exception {
        try {

            GetBindingOptions getBindingOptions = new GetBindingOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .id("a172ced-4c9a75c-0b02fe7-386425e")
                    .build();

            // Invoke operation
            Response<Binding> response = service.getBinding(getBindingOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Binding bindingResult = response.getResult();

            assertNotNull(bindingResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetBinding"})
    public void testListBindings() throws Exception {
        try {
            ListBindingsOptions listBindingsOptions = new ListBindingsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .build();

            // Invoke operation
            Response<BindingList> response = service.listBindings(listBindingsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            BindingList bindingListResult = response.getResult();

            assertNotNull(bindingListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListBindings"})
    public void testCreateTLSSecret() throws Exception {
        try {
            SecretDataTLSSecretData TlsSecretData = new SecretDataTLSSecretData();
            TlsSecretData.setTlsKey(readFromFile("domainmapping.key"));
            TlsSecretData.setTlsCert(readFromFile("domainmapping.crt"));
            CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .format("tls")
                    .name("my-tls-secret")
                    .data(TlsSecretData)
                    .build();

            // Invoke operation
            Response<Secret> response = service.createSecret(createSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateTLSSecret"})
    public void testCreateDomainMapping() throws Exception {
        try {
            ComponentRef componentRefModel = new ComponentRef.Builder()
                    .name("my-app")
                    .resourceType("app_v2")
                    .build();
            CreateDomainMappingOptions createDomainMappingOptions = new CreateDomainMappingOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .component(componentRefModel)
                    .name("api-unit-test-tls.e2e-board.info")
                    .tlsSecret("my-tls-secret")
                    .build();

            // Invoke operation
            Response<DomainMapping> response = service.createDomainMapping(createDomainMappingOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            DomainMapping domainMappingResult = response.getResult();

            assertNotNull(domainMappingResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateDomainMapping"})
    public void testGetDomainMapping() throws Exception {
        try {
            GetDomainMappingOptions getDomainMappingOptions = new GetDomainMappingOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("api-unit-test-tls.e2e-board.info")
                    .build();

            // Invoke operation
            Response<DomainMapping> response = service.getDomainMapping(getDomainMappingOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            DomainMapping domainMappingResult = response.getResult();
            assertNotNull(domainMappingResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetDomainMapping"})
    public void testCreateApp2() throws Exception {
        try {
            CreateAppOptions createAppOptions = new CreateAppOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .imageReference("icr.io/codeengine/helloworld")
                    .name("my-app-2")
                    .build();

            // Invoke operation
            Response<App> response = service.createApp(createAppOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            App appResult = response.getResult();

            assertNotNull(appResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateApp2"})
    public void testUpdateDomainMapping() throws Exception {
        try {
            ComponentRef componentRefModel = new ComponentRef.Builder()
                    .name("my-app-2")
                    .resourceType("app_v2")
                    .build();
            DomainMappingPatch domainMappingPatchModel = new DomainMappingPatch.Builder()
                    .component(componentRefModel)
                    .build();
            Map<String, Object> domainMappingPatchModelAsPatch = domainMappingPatchModel.asPatch();
            UpdateDomainMappingOptions updateDomainMappingOptions = new UpdateDomainMappingOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("api-unit-test-tls.e2e-board.info")
                    .ifMatch("*")
                    .domainMapping(domainMappingPatchModelAsPatch)
                    .build();

            // Invoke operation
            Response<DomainMapping> response = service.updateDomainMapping(updateDomainMappingOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            DomainMapping domainMappingResult = response.getResult();
            assertNotNull(domainMappingResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testUpdateDomainMapping"})
    public void testDeleteDomainMapping() throws Exception {
        try {
            DeleteDomainMappingOptions deleteDomainMappingOptions = new DeleteDomainMappingOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("api-unit-test-tls.e2e-board.info")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteDomainMapping(deleteDomainMappingOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteDomainMapping"})
    public void testGetTLSSecret() throws Exception {
        try {
            GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-tls-secret")
                    .build();

            // Invoke operation
            Response<Secret> response = service.getSecret(getSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetTLSSecret"})
    public void testReplaceTLSSecret() throws Exception {
        try {
            SecretDataTLSSecretData TlsSecretData = new SecretDataTLSSecretData();
            TlsSecretData.setTlsKey(readFromFile("domain.key"));
            TlsSecretData.setTlsCert(readFromFile("domain.crt"));
            ReplaceSecretOptions replaceSecretOptions = new ReplaceSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-tls-secret")
                    .ifMatch("*")
                    .data(TlsSecretData)
                    .format("tls")
                    .build();

            // Invoke operation
            Response<Secret> response = service.replaceSecret(replaceSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Secret secretResult = response.getResult();

            assertNotNull(secretResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testReplaceTLSSecret"})
    public void testListFunctionRuntimes() throws Exception {
        try {
            ListFunctionRuntimesOptions listFunctionRuntimesOptions = new ListFunctionRuntimesOptions();
            // Invoke operation
            Response<FunctionRuntimeList> response = service.listFunctionRuntimes(listFunctionRuntimesOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            FunctionRuntimeList functionRuntimeListResult = response.getResult();
            assertNotNull(functionRuntimeListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListFunctionRuntimes"})
    public void testListFunctions() throws Exception {
        try {
            ListFunctionsOptions listFunctionsOptions = new ListFunctionsOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .limit(Long.valueOf("100"))
                    .build();

            // Invoke operation
            Response<FunctionList> response = service.listFunctions(listFunctionsOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            FunctionList functionListResult = response.getResult();
            assertNotNull(functionListResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListFunctions"})
    public void testCreateFunction() throws Exception {
        try {
            CreateFunctionOptions createFunctionOptions = new CreateFunctionOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .codeReference("data:text/plain;base64,YXN5bmMgZnVuY3Rpb24gbWFpbihwYXJhbXMpIHsKICByZXR1cm4gewogICAgICBzdGF0dXNDb2RlOiAyMDAsCiAgICAgIGhlYWRlcnM6IHsgJ0NvbnRlbnQtVHlwZSc6ICdhcHBsaWNhdGlvbi9qc29uJyB9LAogICAgICBib2R5OiBwYXJhbXMgfTsKfQptb2R1bGUuZXhwb3J0cy5tYWluID0gbWFpbjs=")
                    .name("my-function")
                    .runtime("nodejs-20")
                    .build();

            // Invoke operation
            Response<Function> response = service.createFunction(createFunctionOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 201);

            Function function = response.getResult();
            assertNotNull(function);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testCreateFunction"})
    public void testGetFunction() throws Exception {
        try {
            GetFunctionOptions getFunctionOptions = new GetFunctionOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-function")
                    .build();

            // Invoke operation
            Response<Function> response = service.getFunction(getFunctionOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Function function = response.getResult();
            assertNotNull(function);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testGetFunction"})
    public void testUpdateFunction() throws Exception {
        try {
            FunctionPatch functionPatchModel = new FunctionPatch.Builder()
                    .scaleMaxExecutionTime(Long.valueOf("30"))
                    .build();
            Map<String, Object> functionPatchModelAsPatch = functionPatchModel.asPatch();
            UpdateFunctionOptions updateFunctionOptions = new UpdateFunctionOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-function")
                    .ifMatch("*")
                    .function(functionPatchModelAsPatch)
                    .build();

            // Invoke operation
            Response<Function> response = service.updateFunction(updateFunctionOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Function function = response.getResult();
            assertNotNull(function);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testUpdateFunction"})
    public void testDeleteFunction() throws Exception {
        try {
            DeleteFunctionOptions deleteFunctionOptions = new DeleteFunctionOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-function")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteFunction(deleteFunctionOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteFunction"})
    public void testDeleteTLSSecret() throws Exception {
        try {
            DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-tls-secret")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteSecret(deleteSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteTLSSecret"})
    public void testDeleteBinding() throws Exception {
        try {

            DeleteBindingOptions deleteBindingOptions = new DeleteBindingOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .id("a172ced-4c9a75c-0b02fe7-386425e")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteBinding(deleteBindingOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteBinding"})
    public void testDeleteAppRevision() throws Exception {
        try {
            DeleteAppRevisionOptions deleteAppRevisionOptions = new DeleteAppRevisionOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .appName("my-app")
                    .name("my-app-00003")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteAppRevision(deleteAppRevisionOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteAppRevision"})
    public void testDeleteApp() throws Exception {
        try {
            DeleteAppOptions deleteAppOptions = new DeleteAppOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-app")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteApp(deleteAppOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteApp"})
    public void testDeleteJobRun() throws Exception {
        try {
            DeleteJobRunOptions deleteJobRunOptions = new DeleteJobRunOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-job-run")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteJobRun(deleteJobRunOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteJobRun"})
    public void testDeleteJob() throws Exception {
        try {
            DeleteJobOptions deleteJobOptions = new DeleteJobOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-job")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteJob(deleteJobOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteJob"})
    public void testDeleteBuildRun() throws Exception {
        try {
            DeleteBuildRunOptions deleteBuildRunOptions = new DeleteBuildRunOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-build-run")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteBuildRun(deleteBuildRunOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteBuildRun"})
    public void testDeleteBuild() throws Exception {
        try {
            DeleteBuildOptions deleteBuildOptions = new DeleteBuildOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-build")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteBuild(deleteBuildOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteBuild"})
    public void testDeleteConfigMap() throws Exception {
        try {
            DeleteConfigMapOptions deleteConfigMapOptions = new DeleteConfigMapOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-config-map")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteConfigMap(deleteConfigMapOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteConfigMap"})
    public void testDeleteGenericSecret() throws Exception {
        try {
            DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-secret")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteSecret(deleteSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteGenericSecret"})
    public void testDeleteServiceAccessSecret() throws Exception {
        try {
            DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-service-access-secret")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteSecret(deleteSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteServiceAccessSecret"})
    public void testDeleteSSHSecret() throws Exception {
        try {
            DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-ssh-secret")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteSecret(deleteSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteSSHSecret"})
    public void testDeleteBasicAuthSecret() throws Exception {
        try {
            DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-basic-auth-secret")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteSecret(deleteSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteBasicAuthSecret"})
    public void testDeleteRegistrySecret() throws Exception {
        try {
            DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
                    .projectId(e2eTestProjectId)
                    .name("my-registry-secret")
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteSecret(deleteSecretOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testDeleteRegistrySecret"})
    public void testDeleteProject() throws Exception {
        try {
            DeleteProjectOptions deleteProjectOptions = new DeleteProjectOptions.Builder()
                    .id(e2eTestProjectId)
                    .build();

            // Invoke operation
            Response<Void> response = service.deleteProject(deleteProjectOptions).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 202);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s%nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @AfterClass
    public void tearDown() {
        // Add any clean up logic here
        System.out.println("Clean up complete.");
    }
}
