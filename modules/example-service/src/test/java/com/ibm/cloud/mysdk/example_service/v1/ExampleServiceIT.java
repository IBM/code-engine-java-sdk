package com.ibm.cloud.mysdk.example_service.v1;

import com.ibm.cloud.mysdk.example_service.v1.ExampleService;
import com.ibm.cloud.mysdk.example_service.v1.model.*;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.exception.NotFoundException;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

/**
 * This class contains integration tests for example service.
 */
public class ExampleServiceIT {

    // Example service v1 integration
    public ExampleService service = new ExampleService("Example Service", new NoAuthAuthenticator());

    @Test
    public void testListResources() {

        service.setServiceUrl("http://localhost:3000");
        Resources resourcesObj = service.listResources().execute().getResult();

        Resource firstResource = resourcesObj.getResources().get(0);
        assertTrue(firstResource.resourceId().equals("1"));
        assertEquals(firstResource.name(), "The Great Gatsby");
        assertEquals(firstResource.tag(), "Book");

        Resource secondResource = resourcesObj.getResources().get(1);
        assertTrue(secondResource.resourceId().equals("2"));
        assertEquals(secondResource.name(), "Pride and Prejudice");
        assertEquals(secondResource.tag(), "Book");
    }

    @Test
    public void testGetResource() {
        service.setServiceUrl("http://localhost:3000");

        GetResourceOptions options = new GetResourceOptions.Builder().resourceId("1").build();
        Resource resourceObj = service.getResource(options).execute().getResult();

        assertTrue(resourceObj.resourceId().equals("1"));
        assertEquals(resourceObj.name(), "The Great Gatsby");
        assertEquals(resourceObj.tag(), "Book");
    }

    @Test
    public void testGetResourceNotFound() {
        service.setServiceUrl("http://localhost:3000");
        try {
            GetResourceOptions options = new GetResourceOptions.Builder().resourceId("111").build();
            service.getResource(options).execute().getResult();

        } catch (NotFoundException e) {
            assertEquals(e.getMessage(), "resource not found");
        }
    }

    @Test
    public void testCreateResource() {
        service.setServiceUrl("http://localhost:3000");
        CreateResourceOptions options = new CreateResourceOptions.Builder().resourceId("3").name("To Kill a Mockingbird").tag("Book").build();
        Response<Resource> response = service.createResource(options).execute();
        assertEquals(response.getStatusCode(), 201);

        Resource resourceObj = response.getResult();
        assertTrue(resourceObj.resourceId().equals("3"));
        assertEquals(resourceObj.name(), "To Kill a Mockingbird");
        assertEquals(resourceObj.tag(), "Book");
    }
}
