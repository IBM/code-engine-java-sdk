package com.ibm.cloud.my_services.example_service.v1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import static org.testng.AssertJUnit.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.my_services.example_service.v1.model.CreateResourceOptions;
import com.ibm.cloud.my_services.example_service.v1.model.GetResourceOptions;
import com.ibm.cloud.my_services.example_service.v1.model.Resource;
import com.ibm.cloud.my_services.example_service.v1.model.Resources;
import com.ibm.cloud.my_services.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.NotFoundException;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;

/**
 * This class contains integration tests for example service.
 *
 * Notes:
 * 1. By providing the name of our config file ("example-service.env") via the
 *    getConfigFilename() method below, the base class (SdkIntegrationTestBase) will be able to
 *    mock up the getenv() method to cause the Java core's CredentialUtils class to "see" the
 *    config file via the mocked value of the IBM_CREDENTIALS_FILE env var.
 *
 * 2. The base class will automatically set the "skipTests" flag to true if it can't find the config file.
 *
 * 3. The base class contains a "before method" function that will automatically skip each test method if
 *    the "skipTests" flag is true.   This means that this subclass doesn't need to concern
 *    itself with skipping tests in the event that the config file is not available.
 *
 * 4. This example testcase uses the "dependsOnMethods" attribute of the @Test annotation to ensure that the test
 *    methods are executed in the the order they appear in this file.  Without this, there's no guaranteed ordering
 *    imposed by TestNG.
 *
 * 5. Be sure to following the instructions here:
 *    https://github.ibm.com/CloudEngineering/java-sdk-template/blob/master/README_FIRST.md#integration-tests
 *    to start up an instance of the Example Service prior to running the integraton test.
 *
 * 6. Before running this test, rename example-service.env.hide to example-service.env.
 */
public class ExampleServiceIT extends SdkIntegrationTestBase {

    // Example service v1 integration
    public ExampleService service = null;

    /**
     * This method provides our config filename to the base class.
     */
    public String getConfigFilename() {
        return "../../example-service.env";
    }

    /**
     * This method is invoked before any of the @Test-annotated methods, and is responsible for
     * creating the instance of the service that will be used by the rest of the test methods,
     * as well as any other required initialization.
     */
    @BeforeClass
    public void constructService() {
        // Ask super if we should skip the tests.
        if (skipTests()) {
            return;
        }

        /**
         * Construct our service client instance via external config (see the example-service.env file for details).
         * The newInstance() method will load up our config file and look for properties that start with
         * "EXAMPLE_SERVICE_" (the default service name associated with the Example Service, as specified by the
         * ExampleService.DEFAULT_SERVICE_NAME constant).
         * Specifically, newInstance() will construct an authenticator based on the value of the
         * EXAMPLE_SERVICE_AUTH_TYPE property.   After constructing the appropriate authenticator, it will construct
         * an instance of the service and then set the URL to the value specified by the EXAMPLE_SERVICE_URL property.
         */
        service = ExampleService.newInstance();
        assertNotNull(service);
        assertNotNull(service.getServiceUrl());
    }

    /**
     * Each of the @Test-annotated methods below will be skipped if the config file (example-service.env)
     * does not exist.
     */

    @Test
    public void testListResources() {
        assertNotNull(service);

        try {
            Response<Resources> response = service.listResources().execute();
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Resources result = response.getResult();
            assertNotNull(result);
            assertNotNull(result.getResources());
            assertEquals(result.getResources().size(), 2);

            Resource firstResource = result.getResources().get(0);
            assertEquals(firstResource.resourceId(), "1");
            assertEquals(firstResource.name(), "The Great Gatsby");
            assertEquals(firstResource.tag(), "Book");

            Resource secondResource = result.getResources().get(1);
            assertEquals(secondResource.resourceId(), "2");
            assertEquals(secondResource.name(), "Pride and Prejudice");
            assertEquals(secondResource.tag(), "Book");
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %s: %s\nError details: %s", e.getStatusCode(),
                    e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = {"testListResources"})
    public void testGetResource() {
        try {
            GetResourceOptions options = new GetResourceOptions.Builder()
                    .resourceId("1")
                    .build();
            Response<Resource> response = service.getResource(options).execute();
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            Resource resourceObj = response.getResult();
            assertNotNull(resourceObj);
            assertEquals(resourceObj.resourceId(), "1");
            assertEquals(resourceObj.name(), "The Great Gatsby");
            assertEquals(resourceObj.tag(), "Book");
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %s: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(dependsOnMethods = { "testGetResource" }, expectedExceptions = { NotFoundException.class })
    public void testGetResourceNotFound() {
        try {
            GetResourceOptions options = new GetResourceOptions.Builder()
                    .resourceId("BAD_RESOURCE_ID")
                    .build();
            service.getResource(options).execute().getResult();
        } catch (ServiceResponseException e) {
            assertEquals(e.getMessage(), "resource not found");
            assertEquals(e.getStatusCode(), 404);
            System.out.println(String.format("Service returned status code %s: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
            throw e;
        }
    }

    @Test(dependsOnMethods = { "testGetResourceNotFound" })
    public void testCreateResource() {
        try {
            CreateResourceOptions options = new CreateResourceOptions.Builder()
                    .resourceId("3")
                    .name("To Kill a Mockingbird")
                    .tag("Book")
                    .build();
            Response<Resource> response = service.createResource(options).execute();
            assertEquals(response.getStatusCode(), 201);

            Resource resourceObj = response.getResult();
            assertEquals(resourceObj.resourceId(), "3");
            assertEquals(resourceObj.name(), "To Kill a Mockingbird");
            assertEquals(resourceObj.tag(), "Book");
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %s: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }
}
