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

package com.ibm.cloud.code_engine.code_engine.v2;

import com.ibm.cloud.code_engine.code_engine.v2.model.App;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppInstance;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppInstancesPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevision;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppRevisionsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.AppsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.Binding;
import com.ibm.cloud.code_engine.code_engine.v2.model.BindingsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.Build;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildRun;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildRunsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.BuildsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.ComponentRef;
import com.ibm.cloud.code_engine.code_engine.v2.model.ConfigMap;
import com.ibm.cloud.code_engine.code_engine.v2.model.ConfigMapsPager;
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
import com.ibm.cloud.code_engine.code_engine.v2.model.DomainMappingPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.DomainMappingsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.Function;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionRuntimeList;
import com.ibm.cloud.code_engine.code_engine.v2.model.FunctionsPager;
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
import com.ibm.cloud.code_engine.code_engine.v2.model.Job;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobPatch;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRun;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobRunsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.JobsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAppInstancesOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAppRevisionsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListAppsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListBindingsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListBuildRunsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListBuildsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListConfigMapsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListDomainMappingsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListFunctionRuntimesOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListFunctionsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListJobRunsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListJobsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListProjectsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ListSecretsOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.Project;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectEgressIPAddresses;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectStatusDetails;
import com.ibm.cloud.code_engine.code_engine.v2.model.ProjectsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.ReplaceConfigMapOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.ReplaceSecretOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.Secret;
import com.ibm.cloud.code_engine.code_engine.v2.model.SecretsPager;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateAppOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateBuildOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateDomainMappingOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateFunctionOptions;
import com.ibm.cloud.code_engine.code_engine.v2.model.UpdateJobOptions;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.GsonSingleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains examples of how to use the Code Engine service.
 *
 * The following configuration properties are assumed to be defined:
 * CODE_ENGINE_URL=&lt;service base url&gt;
 * CODE_ENGINE_AUTH_TYPE=iam
 * CODE_ENGINE_APIKEY=&lt;IAM apikey&gt;
 * CODE_ENGINE_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class CodeEngineExamples {
  private static final Logger logger = LoggerFactory.getLogger(CodeEngineExamples.class);
  protected CodeEngineExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../code_engine_v2.env");
  }

  /**
   * The main() function invokes operations of the Code Engine service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {

    CodeEngine codeEngineService = CodeEngine.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(CodeEngine.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("listProjects() result:");
      // begin-list_projects
      ListProjectsOptions listProjectsOptions = new ListProjectsOptions.Builder()
        .limit(Long.valueOf("100"))
        .build();

      ProjectsPager pager = new ProjectsPager(codeEngineService, listProjectsOptions);
      List<Project> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Project> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_projects
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createProject() result:");
      // begin-create_project
      CreateProjectOptions createProjectOptions = new CreateProjectOptions.Builder()
        .name("my-project")
        .build();

      Response<Project> response = codeEngineService.createProject(createProjectOptions).execute();
      Project project = response.getResult();

      System.out.println(project);
      // end-create_project
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getProject() result:");
      // begin-get_project
      GetProjectOptions getProjectOptions = new GetProjectOptions.Builder()
        .id("15314cc3-85b4-4338-903f-c28cdee6d005")
        .build();

      Response<Project> response = codeEngineService.getProject(getProjectOptions).execute();
      Project project = response.getResult();

      System.out.println(project);
      // end-get_project
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getProjectEgressIps() result:");
      // begin-get_project_egress_ips
      GetProjectEgressIpsOptions getProjectEgressIpsOptions = new GetProjectEgressIpsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .build();

      Response<ProjectEgressIPAddresses> response = codeEngineService.getProjectEgressIps(getProjectEgressIpsOptions).execute();
      ProjectEgressIPAddresses projectEgressIpAddresses = response.getResult();

      System.out.println(projectEgressIpAddresses);
      // end-get_project_egress_ips
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getProjectStatusDetails() result:");
      // begin-get_project_status_details
      GetProjectStatusDetailsOptions getProjectStatusDetailsOptions = new GetProjectStatusDetailsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .build();

      Response<ProjectStatusDetails> response = codeEngineService.getProjectStatusDetails(getProjectStatusDetailsOptions).execute();
      ProjectStatusDetails projectStatusDetails = response.getResult();

      System.out.println(projectStatusDetails);
      // end-get_project_status_details
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listApps() result:");
      // begin-list_apps
      ListAppsOptions listAppsOptions = new ListAppsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .limit(Long.valueOf("100"))
        .build();

      AppsPager pager = new AppsPager(codeEngineService, listAppsOptions);
      List<App> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<App> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_apps
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createApp() result:");
      // begin-create_app
      CreateAppOptions createAppOptions = new CreateAppOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .imageReference("icr.io/codeengine/helloworld")
        .name("my-app")
        .build();

      Response<App> response = codeEngineService.createApp(createAppOptions).execute();
      App app = response.getResult();

      System.out.println(app);
      // end-create_app
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getApp() result:");
      // begin-get_app
      GetAppOptions getAppOptions = new GetAppOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-app")
        .build();

      Response<App> response = codeEngineService.getApp(getAppOptions).execute();
      App app = response.getResult();

      System.out.println(app);
      // end-get_app
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateApp() result:");
      // begin-update_app
      AppPatch appPatchModel = new AppPatch.Builder()
        .build();
      Map<String, Object> appPatchModelAsPatch = appPatchModel.asPatch();
      UpdateAppOptions updateAppOptions = new UpdateAppOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-app")
        .ifMatch("testString")
        .app(appPatchModelAsPatch)
        .build();

      Response<App> response = codeEngineService.updateApp(updateAppOptions).execute();
      App app = response.getResult();

      System.out.println(app);
      // end-update_app
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listAppRevisions() result:");
      // begin-list_app_revisions
      ListAppRevisionsOptions listAppRevisionsOptions = new ListAppRevisionsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .appName("my-app")
        .limit(Long.valueOf("100"))
        .build();

      AppRevisionsPager pager = new AppRevisionsPager(codeEngineService, listAppRevisionsOptions);
      List<AppRevision> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<AppRevision> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_app_revisions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAppRevision() result:");
      // begin-get_app_revision
      GetAppRevisionOptions getAppRevisionOptions = new GetAppRevisionOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .appName("my-app")
        .name("my-app-00001")
        .build();

      Response<AppRevision> response = codeEngineService.getAppRevision(getAppRevisionOptions).execute();
      AppRevision appRevision = response.getResult();

      System.out.println(appRevision);
      // end-get_app_revision
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listAppInstances() result:");
      // begin-list_app_instances
      ListAppInstancesOptions listAppInstancesOptions = new ListAppInstancesOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .appName("my-app")
        .limit(Long.valueOf("100"))
        .build();

      AppInstancesPager pager = new AppInstancesPager(codeEngineService, listAppInstancesOptions);
      List<AppInstance> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<AppInstance> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_app_instances
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listJobs() result:");
      // begin-list_jobs
      ListJobsOptions listJobsOptions = new ListJobsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .limit(Long.valueOf("100"))
        .build();

      JobsPager pager = new JobsPager(codeEngineService, listJobsOptions);
      List<Job> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Job> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createJob() result:");
      // begin-create_job
      CreateJobOptions createJobOptions = new CreateJobOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .imageReference("icr.io/codeengine/helloworld")
        .name("my-job")
        .build();

      Response<Job> response = codeEngineService.createJob(createJobOptions).execute();
      Job job = response.getResult();

      System.out.println(job);
      // end-create_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getJob() result:");
      // begin-get_job
      GetJobOptions getJobOptions = new GetJobOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-job")
        .build();

      Response<Job> response = codeEngineService.getJob(getJobOptions).execute();
      Job job = response.getResult();

      System.out.println(job);
      // end-get_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateJob() result:");
      // begin-update_job
      JobPatch jobPatchModel = new JobPatch.Builder()
        .build();
      Map<String, Object> jobPatchModelAsPatch = jobPatchModel.asPatch();
      UpdateJobOptions updateJobOptions = new UpdateJobOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-job")
        .ifMatch("testString")
        .job(jobPatchModelAsPatch)
        .build();

      Response<Job> response = codeEngineService.updateJob(updateJobOptions).execute();
      Job job = response.getResult();

      System.out.println(job);
      // end-update_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listJobRuns() result:");
      // begin-list_job_runs
      ListJobRunsOptions listJobRunsOptions = new ListJobRunsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .jobName("my-job")
        .limit(Long.valueOf("100"))
        .build();

      JobRunsPager pager = new JobRunsPager(codeEngineService, listJobRunsOptions);
      List<JobRun> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<JobRun> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_job_runs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createJobRun() result:");
      // begin-create_job_run
      CreateJobRunOptions createJobRunOptions = new CreateJobRunOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .build();

      Response<JobRun> response = codeEngineService.createJobRun(createJobRunOptions).execute();
      JobRun jobRun = response.getResult();

      System.out.println(jobRun);
      // end-create_job_run
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getJobRun() result:");
      // begin-get_job_run
      GetJobRunOptions getJobRunOptions = new GetJobRunOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-job-run")
        .build();

      Response<JobRun> response = codeEngineService.getJobRun(getJobRunOptions).execute();
      JobRun jobRun = response.getResult();

      System.out.println(jobRun);
      // end-get_job_run
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listFunctionRuntimes() result:");
      // begin-list_function_runtimes
      ListFunctionRuntimesOptions listFunctionRuntimesOptions = new ListFunctionRuntimesOptions();

      Response<FunctionRuntimeList> response = codeEngineService.listFunctionRuntimes(listFunctionRuntimesOptions).execute();
      FunctionRuntimeList functionRuntimeList = response.getResult();

      System.out.println(functionRuntimeList);
      // end-list_function_runtimes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listFunctions() result:");
      // begin-list_functions
      ListFunctionsOptions listFunctionsOptions = new ListFunctionsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .limit(Long.valueOf("100"))
        .build();

      FunctionsPager pager = new FunctionsPager(codeEngineService, listFunctionsOptions);
      List<Function> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Function> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_functions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createFunction() result:");
      // begin-create_function
      CreateFunctionOptions createFunctionOptions = new CreateFunctionOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .codeReference("data:text/plain;base64,<base64encoded-source-code>")
        .name("my-function")
        .runtime("nodejs-18")
        .build();

      Response<Function> response = codeEngineService.createFunction(createFunctionOptions).execute();
      Function function = response.getResult();

      System.out.println(function);
      // end-create_function
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getFunction() result:");
      // begin-get_function
      GetFunctionOptions getFunctionOptions = new GetFunctionOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-function")
        .build();

      Response<Function> response = codeEngineService.getFunction(getFunctionOptions).execute();
      Function function = response.getResult();

      System.out.println(function);
      // end-get_function
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateFunction() result:");
      // begin-update_function
      FunctionPatch functionPatchModel = new FunctionPatch.Builder()
        .build();
      Map<String, Object> functionPatchModelAsPatch = functionPatchModel.asPatch();
      UpdateFunctionOptions updateFunctionOptions = new UpdateFunctionOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-function")
        .ifMatch("testString")
        .function(functionPatchModelAsPatch)
        .build();

      Response<Function> response = codeEngineService.updateFunction(updateFunctionOptions).execute();
      Function function = response.getResult();

      System.out.println(function);
      // end-update_function
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listBindings() result:");
      // begin-list_bindings
      ListBindingsOptions listBindingsOptions = new ListBindingsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .limit(Long.valueOf("100"))
        .build();

      BindingsPager pager = new BindingsPager(codeEngineService, listBindingsOptions);
      List<Binding> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Binding> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_bindings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createBinding() result:");
      // begin-create_binding
      ComponentRef componentRefModel = new ComponentRef.Builder()
        .name("my-app-1")
        .resourceType("app_v2")
        .build();
      CreateBindingOptions createBindingOptions = new CreateBindingOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .component(componentRefModel)
        .prefix("MY_COS")
        .secretName("my-service-access")
        .build();

      Response<Binding> response = codeEngineService.createBinding(createBindingOptions).execute();
      Binding binding = response.getResult();

      System.out.println(binding);
      // end-create_binding
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBinding() result:");
      // begin-get_binding
      GetBindingOptions getBindingOptions = new GetBindingOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .id("a172ced-b5f21bc-71ba50c-1638604")
        .build();

      Response<Binding> response = codeEngineService.getBinding(getBindingOptions).execute();
      Binding binding = response.getResult();

      System.out.println(binding);
      // end-get_binding
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listBuilds() result:");
      // begin-list_builds
      ListBuildsOptions listBuildsOptions = new ListBuildsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .limit(Long.valueOf("100"))
        .build();

      BuildsPager pager = new BuildsPager(codeEngineService, listBuildsOptions);
      List<Build> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Build> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_builds
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createBuild() result:");
      // begin-create_build
      CreateBuildOptions createBuildOptions = new CreateBuildOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-build")
        .outputImage("private.de.icr.io/icr_namespace/image-name")
        .outputSecret("ce-auto-icr-private-eu-de")
        .strategyType("dockerfile")
        .build();

      Response<Build> response = codeEngineService.createBuild(createBuildOptions).execute();
      Build build = response.getResult();

      System.out.println(build);
      // end-create_build
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBuild() result:");
      // begin-get_build
      GetBuildOptions getBuildOptions = new GetBuildOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-build")
        .build();

      Response<Build> response = codeEngineService.getBuild(getBuildOptions).execute();
      Build build = response.getResult();

      System.out.println(build);
      // end-get_build
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateBuild() result:");
      // begin-update_build
      BuildPatch buildPatchModel = new BuildPatch.Builder()
        .build();
      Map<String, Object> buildPatchModelAsPatch = buildPatchModel.asPatch();
      UpdateBuildOptions updateBuildOptions = new UpdateBuildOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-build")
        .ifMatch("testString")
        .build(buildPatchModelAsPatch)
        .build();

      Response<Build> response = codeEngineService.updateBuild(updateBuildOptions).execute();
      Build build = response.getResult();

      System.out.println(build);
      // end-update_build
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listBuildRuns() result:");
      // begin-list_build_runs
      ListBuildRunsOptions listBuildRunsOptions = new ListBuildRunsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .buildName("my-build")
        .limit(Long.valueOf("100"))
        .build();

      BuildRunsPager pager = new BuildRunsPager(codeEngineService, listBuildRunsOptions);
      List<BuildRun> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<BuildRun> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_build_runs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createBuildRun() result:");
      // begin-create_build_run
      CreateBuildRunOptions createBuildRunOptions = new CreateBuildRunOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .build();

      Response<BuildRun> response = codeEngineService.createBuildRun(createBuildRunOptions).execute();
      BuildRun buildRun = response.getResult();

      System.out.println(buildRun);
      // end-create_build_run
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getBuildRun() result:");
      // begin-get_build_run
      GetBuildRunOptions getBuildRunOptions = new GetBuildRunOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-build-run")
        .build();

      Response<BuildRun> response = codeEngineService.getBuildRun(getBuildRunOptions).execute();
      BuildRun buildRun = response.getResult();

      System.out.println(buildRun);
      // end-get_build_run
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDomainMappings() result:");
      // begin-list_domain_mappings
      ListDomainMappingsOptions listDomainMappingsOptions = new ListDomainMappingsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .limit(Long.valueOf("100"))
        .build();

      DomainMappingsPager pager = new DomainMappingsPager(codeEngineService, listDomainMappingsOptions);
      List<DomainMapping> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DomainMapping> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_domain_mappings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDomainMapping() result:");
      // begin-create_domain_mapping
      ComponentRef componentRefModel = new ComponentRef.Builder()
        .name("my-app-1")
        .resourceType("app_v2")
        .build();
      CreateDomainMappingOptions createDomainMappingOptions = new CreateDomainMappingOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .component(componentRefModel)
        .name("www.example.com")
        .tlsSecret("my-tls-secret")
        .build();

      Response<DomainMapping> response = codeEngineService.createDomainMapping(createDomainMappingOptions).execute();
      DomainMapping domainMapping = response.getResult();

      System.out.println(domainMapping);
      // end-create_domain_mapping
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDomainMapping() result:");
      // begin-get_domain_mapping
      GetDomainMappingOptions getDomainMappingOptions = new GetDomainMappingOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("www.example.com")
        .build();

      Response<DomainMapping> response = codeEngineService.getDomainMapping(getDomainMappingOptions).execute();
      DomainMapping domainMapping = response.getResult();

      System.out.println(domainMapping);
      // end-get_domain_mapping
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDomainMapping() result:");
      // begin-update_domain_mapping
      DomainMappingPatch domainMappingPatchModel = new DomainMappingPatch.Builder()
        .build();
      Map<String, Object> domainMappingPatchModelAsPatch = domainMappingPatchModel.asPatch();
      UpdateDomainMappingOptions updateDomainMappingOptions = new UpdateDomainMappingOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("www.example.com")
        .ifMatch("testString")
        .domainMapping(domainMappingPatchModelAsPatch)
        .build();

      Response<DomainMapping> response = codeEngineService.updateDomainMapping(updateDomainMappingOptions).execute();
      DomainMapping domainMapping = response.getResult();

      System.out.println(domainMapping);
      // end-update_domain_mapping
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listConfigMaps() result:");
      // begin-list_config_maps
      ListConfigMapsOptions listConfigMapsOptions = new ListConfigMapsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .limit(Long.valueOf("100"))
        .build();

      ConfigMapsPager pager = new ConfigMapsPager(codeEngineService, listConfigMapsOptions);
      List<ConfigMap> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<ConfigMap> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_config_maps
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createConfigMap() result:");
      // begin-create_config_map
      CreateConfigMapOptions createConfigMapOptions = new CreateConfigMapOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-config-map")
        .build();

      Response<ConfigMap> response = codeEngineService.createConfigMap(createConfigMapOptions).execute();
      ConfigMap configMap = response.getResult();

      System.out.println(configMap);
      // end-create_config_map
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getConfigMap() result:");
      // begin-get_config_map
      GetConfigMapOptions getConfigMapOptions = new GetConfigMapOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-config-map")
        .build();

      Response<ConfigMap> response = codeEngineService.getConfigMap(getConfigMapOptions).execute();
      ConfigMap configMap = response.getResult();

      System.out.println(configMap);
      // end-get_config_map
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceConfigMap() result:");
      // begin-replace_config_map
      ReplaceConfigMapOptions replaceConfigMapOptions = new ReplaceConfigMapOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-config-map")
        .ifMatch("testString")
        .build();

      Response<ConfigMap> response = codeEngineService.replaceConfigMap(replaceConfigMapOptions).execute();
      ConfigMap configMap = response.getResult();

      System.out.println(configMap);
      // end-replace_config_map
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSecrets() result:");
      // begin-list_secrets
      ListSecretsOptions listSecretsOptions = new ListSecretsOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .limit(Long.valueOf("100"))
        .build();

      SecretsPager pager = new SecretsPager(codeEngineService, listSecretsOptions);
      List<Secret> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<Secret> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_secrets
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSecret() result:");
      // begin-create_secret
      CreateSecretOptions createSecretOptions = new CreateSecretOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .format("generic")
        .name("my-secret")
        .build();

      Response<Secret> response = codeEngineService.createSecret(createSecretOptions).execute();
      Secret secret = response.getResult();

      System.out.println(secret);
      // end-create_secret
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSecret() result:");
      // begin-get_secret
      GetSecretOptions getSecretOptions = new GetSecretOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-secret")
        .build();

      Response<Secret> response = codeEngineService.getSecret(getSecretOptions).execute();
      Secret secret = response.getResult();

      System.out.println(secret);
      // end-get_secret
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceSecret() result:");
      // begin-replace_secret
      ReplaceSecretOptions replaceSecretOptions = new ReplaceSecretOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-secret")
        .ifMatch("testString")
        .format("generic")
        .build();

      Response<Secret> response = codeEngineService.replaceSecret(replaceSecretOptions).execute();
      Secret secret = response.getResult();

      System.out.println(secret);
      // end-replace_secret
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_project
      DeleteProjectOptions deleteProjectOptions = new DeleteProjectOptions.Builder()
        .id("15314cc3-85b4-4338-903f-c28cdee6d005")
        .build();

      Response<Void> response = codeEngineService.deleteProject(deleteProjectOptions).execute();
      // end-delete_project
      System.out.printf("deleteProject() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_app
      DeleteAppOptions deleteAppOptions = new DeleteAppOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-app")
        .build();

      Response<Void> response = codeEngineService.deleteApp(deleteAppOptions).execute();
      // end-delete_app
      System.out.printf("deleteApp() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_app_revision
      DeleteAppRevisionOptions deleteAppRevisionOptions = new DeleteAppRevisionOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .appName("my-app")
        .name("my-app-00001")
        .build();

      Response<Void> response = codeEngineService.deleteAppRevision(deleteAppRevisionOptions).execute();
      // end-delete_app_revision
      System.out.printf("deleteAppRevision() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_job
      DeleteJobOptions deleteJobOptions = new DeleteJobOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-job")
        .build();

      Response<Void> response = codeEngineService.deleteJob(deleteJobOptions).execute();
      // end-delete_job
      System.out.printf("deleteJob() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_job_run
      DeleteJobRunOptions deleteJobRunOptions = new DeleteJobRunOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-job-run")
        .build();

      Response<Void> response = codeEngineService.deleteJobRun(deleteJobRunOptions).execute();
      // end-delete_job_run
      System.out.printf("deleteJobRun() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_function
      DeleteFunctionOptions deleteFunctionOptions = new DeleteFunctionOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-function")
        .build();

      Response<Void> response = codeEngineService.deleteFunction(deleteFunctionOptions).execute();
      // end-delete_function
      System.out.printf("deleteFunction() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_binding
      DeleteBindingOptions deleteBindingOptions = new DeleteBindingOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .id("a172ced-b5f21bc-71ba50c-1638604")
        .build();

      Response<Void> response = codeEngineService.deleteBinding(deleteBindingOptions).execute();
      // end-delete_binding
      System.out.printf("deleteBinding() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_build
      DeleteBuildOptions deleteBuildOptions = new DeleteBuildOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-build")
        .build();

      Response<Void> response = codeEngineService.deleteBuild(deleteBuildOptions).execute();
      // end-delete_build
      System.out.printf("deleteBuild() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_build_run
      DeleteBuildRunOptions deleteBuildRunOptions = new DeleteBuildRunOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-build-run")
        .build();

      Response<Void> response = codeEngineService.deleteBuildRun(deleteBuildRunOptions).execute();
      // end-delete_build_run
      System.out.printf("deleteBuildRun() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_domain_mapping
      DeleteDomainMappingOptions deleteDomainMappingOptions = new DeleteDomainMappingOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("www.example.com")
        .build();

      Response<Void> response = codeEngineService.deleteDomainMapping(deleteDomainMappingOptions).execute();
      // end-delete_domain_mapping
      System.out.printf("deleteDomainMapping() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_config_map
      DeleteConfigMapOptions deleteConfigMapOptions = new DeleteConfigMapOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-config-map")
        .build();

      Response<Void> response = codeEngineService.deleteConfigMap(deleteConfigMapOptions).execute();
      // end-delete_config_map
      System.out.printf("deleteConfigMap() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_secret
      DeleteSecretOptions deleteSecretOptions = new DeleteSecretOptions.Builder()
        .projectId("15314cc3-85b4-4338-903f-c28cdee6d005")
        .name("my-secret")
        .build();

      Response<Void> response = codeEngineService.deleteSecret(deleteSecretOptions).execute();
      // end-delete_secret
      System.out.printf("deleteSecret() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
