# MySDK Java SDK (example service)

Java client library to use the MySDK Services.

<details>
<summary>Table of Contents</summary>

* [Overview](#overview)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Using the SDK](#using-the-sdk)
  * [Constructing service clients](#constructing-service-clients)
  * [Authentication](#authentication)
  * [Passing operation parameters via an options model](#passing-operation-parameters-via-an-options-model)
  * [Receiving operation responses](#receiving-operation-responses)
  * [Error Handling](#error-handling)
  * [Default headers](#default-headers)
  * [Sending request headers](#sending-request-headers)
  * [Synchronous and asynchronous requests](#synchronous-and-asynchronous-requests)
* [Example Service Integration Test](#example-service-integration-test)
* [License](#license)

</details>

## Overview

The IBM Cloud MySDK Java SDK allows developers to programmatically interact with the
MySDK IBM Cloud services.

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration?target=%2Fdeveloper%2Fwatson&

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
* An installation of Java SE 7 or newer on your local machine.

## Installation

#### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>mysdk</artifactId>
    <version>0.0.1</version>
</dependency>
```

#### Gradle

```gradle
'com.ibm.cloud:mysdk:0.0.1'
```

## Using the SDK
This section provides general information on how to use the services contained in this SDK.

### Constructing service clients
Each service is implemented in its own package (e.g. `com.ibm.cloud.mysdk.my_service`).
The package will contain a class that defines the "service client" (a client-side representation of the service),
as well as various other classes that represent models used by the service.  
Here's an example of how to construct an instance of "My Service":
```java

import com.ibm.cloud.mysdk.my_service.v1.MyService;

// Create an authenticator.
authenticator = /* create an authenticator - see examples below */

// Create an instance of the "MyService" service client.
service = new MyService(authenticator);

// Service operations can now be called using the "service" variable.

```

### Authentication
MySDK services use token-based Identity and Access Management (IAM) authentication [IAM](#iam).

IAM authentication uses an API key to obtain an access token, which is then used to authenticate
each API request.  Access tokens are valid for a limited amount of time and must be regenerated.

To provide credentials to the SDK, you supply either an IAM service **API key** or an **access token**:

- Specify the IAM API key to have the SDK manage the lifecycle of the access token.
The SDK requests an access token, ensures that the access token is valid, and refreshes it when
necessary.
- Specify the access token if you want to manage the lifecycle yourself.
For details, see [Authenticating with IAM tokens](https://cloud.ibm.com/docs/services/watson/getting-started-iam.html).

#### Examples:
* Supplying the IAM API key and letting the SDK manage the access token for you:

```java
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.mysdk.my_service.v1.MyService;
...
// Create the IAM authenticator.
IamAuthenticator authenticator = new IamAuthenticator("myapikey");

// Construct the service instance.
service = new MyService(authenticator);
```

* Supplying the access token (a bearer token) and managing it yourself:

```java
import com.ibm.cloud.sdk.core.security.BearerTokenAuthenticator;
import com.ibm.cloud.mysdk.my_service.v1.MyService;
...
// Create the Bearer Token authenticator.
BearerTokenAuthenticator authenticator = new BearerTokenAuthenticator("initial access token");

// Construct the service instance.
service = new MyService(authenticator);
...
// Later when the access token expires, the application must refresh the access token,
// then set the new access token on the authenticator.
// Subsequent request invocations will include the new access token.
authenticator.setBearerToken("new access token");
```
For more information on authentication, including the full set of authentication schemes supported by
the underlying Java SDK Core library, see
[this page](https://github.com/IBM/java-sdk-core/blob/master/Authentication.md)

### Passing operation parameters via an options model
For each operation belonging to a service, an "options" model (class) is defined as a container for
the parameters associated with the operation.
The name of the class will be `<operation-name>Options` and it will contain a field for each
operation parameter.  

Suppose we have an operation named `GetResource` that has two parameters - `resourceId` and `resourceType`.
When invoking this operation, the application first creates an instance of the `GetResourceOptions`
model class and then sets the parameter values within it.  Along with the "options" class,
a nested Builder class is also provided.  

Here's an example:
```java
GetResourceOptions options = new GetResourceOptions.Builder()
    .resourceId("resource-id-1")
    .resourceType("resource-type-1)
    .build();
```
Then the operation can be called like this:
```java
ServiceCall<Resource> call = service.getResource(options);
```
The use of the "options" model pattern (instead of listing each operation parameter within the
argument list of the service method) allows for future expansion of the API (within certain
guidelines) without impacting applications.

### Receiving operation responses

Each service method (operation) will return an instance of `ServiceCall<T>` where `T` is the response
type of the operation.  The `ServiceCall<T>` instance represents an API call that can be executed by calling
the `execute()` method.  The `execute()` method returns an instance of `Response<T>` from which the operation
result can be retrieved.

Here is an example of a call to a service's "getResource" operation:
```java
...
// Construct the options model needed to invoke the getResource() operation.
GetResourceOptions options = new GetResourceOptions.Builder()
    .resourceId("resource-id-1")
    .resourceType("resource-type-1)
    .build();

// Retrieve a "resource" by calling the "getResource" operation.
Response<Resource> response = service.getResource(options).execute();

// Extract the result from the Response object.
Resource resourceObj = response.getResult();
System.out.println("My resource: " + resource);

// Display the status code and response headers from the Response object.
System.out.println("Response statusCode: " + response.getStatusCode() + ", response header names: "
    + response.getHeaders().names());
...
```

### Error Handling

The IBM Cloud MySDK Java SDK generates an exception for an unsuccessful service method (operation) invocation.
If the service method receives an error response from the service, it will generate an
exception from the `com.ibm.cloud.sdk.core.service.exception` package.  

All service exceptions contain the following fields:

| FIELD | DESCRIPTION |
| ----- | ----------- |
| statusCode | The HTTP response code that is returned. |
| message	| A message that describes the error. |
| headers | The HTTP headers that were returned in the response. |
| debuggingInfo | a Map<String, Object> containing the deserialized response body, if available |

A method may also generate an `IllegalArgumentException` if it detects missing or invalid input arguments.

Here's an example of how to catch and process specific exceptions that may be returned from an SDK method:

```java
try {
  // Invoke an SDK method
} catch (NotFoundException e) {
  // Handle Not Found (404) exception
} catch (RequestTooLargeException e) {
  // Handle Request Too Large (413) exception
} catch (ServiceResponseException e) {
  // Base class for all exceptions caused by error responses from the service
  System.out.println("Service returned status code "
    + e.getStatusCode() + ": " + e.getMessage());
  System.out.println("Error details: " + e.getDebuggingInfo())
}
```

### Default headers
Default HTTP headers can be specified by using the `setDefaultHeaders()`
method of the service client instance.
Once set on the service client, default headers are sent with
every outbound request.  

Here is an example:
```java
...
// Create service client instance.
service = new MyService(new NoAuthAuthenticator());

// Set default header.
Map<String, Object> customHeaders = new HashMap<>();
customHeaders.put("Custom-Header", "custom_value");
service.setDefaultHeaders(customHeaders);

// "Custom-Header" will now be included with all subsequent requests invoked from "service".
```

### Sending request headers
Custom HTTP headers can also be passed with any individual request.
To do so, add the header to the `ServiceCall<T>` instance returned by the service method
before invoking the `execute()` method on it.  

Here is an example:
```java
Response<Resource> response = service.getResource(options)
  .addHeader("Custom-Header", "custom_value")
  .execute();
```

### Synchronous and asynchronous requests

The IBM Cloud MySDK Java SDK supports both synchronous (blocking) and asynchronous
(non-blocking) execution of service methods.
All service methods return an instance of the [`ServiceCall<T>`][service-call] interface.

[service-call]: https://ibm.github.io/java-sdk-core/docs/3.0.2/com/ibm/cloud/sdk/core/http/ServiceCall.html

##### Synchronous
To call a method synchronously, use the `execute()` method of the `ServiceCall<T>`
interface.
You can call the `execute()` method directly from an instance of the service.

```java
// make API call and receive response object.
Response<Resource> response = service.getResource(options).execute();
Resource result = response.getResult();

// continue execution
```
##### Asynchronous
To call a method asynchronously, use the `enqueue()` method of the returned
`ServiceCall<T>` instance to receive a callback when the response arrives.
The `ServiceCallback<T>` interface of the `enqueue()` method's argument
provides `onResponse` and `onFailure` methods that you override to handle the callback.

Here is an example:
```java
// make API call in the background.
service.getResource(options).enqueue(new ServiceCallback<ListResourcesResponse>() {
  @Override
  public void onResponse(Response<Resource> response) {
    System.out.println("We did it! " + response);
  }

  @Override
  public void onFailure(Exception e) {
    System.out.println("Whoops...");
  }
});

// continue working in the meantime!
```

## Example Service Integration Test

To set up and run integration test, clone and follow instruction from [Example Service](https://github.ibm.com/CloudEngineering/example-service) repo.

Integration test code can be found [here](modules/example-service/src/test/java/com/ibm/cloud/mysdk/test/ExampleServiceTest.java)

## License

The IBM Cloud MySDK Java SDK is released under the Apache 2.0 license. The license's full text can be found in [LICENSE](LICENSE).
