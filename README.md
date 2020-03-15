[![Build Status](https://travis.ibm.com/ibmcloud/platform-services-java-sdk.svg?token=eW5FVD71iyte6tTby8gr&branch=master)](https://travis.ibm.com/ibmcloud/platform-services-java-sdk)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

# IBM Cloud MySDK Java SDK Version 0.0.1
Java client library to interact with various [MySDK Service APIs](https://cloud.ibm.com/apidocs?category=platform_services).

<!--
  The TOC below is generated using the `markdown-toc` node package.

      https://github.com/jonschlinkert/markdown-toc

  You should regenerate the TOC after making changes to this file.

      npx markdown-toc -i README.md
  -->

<!-- toc -->

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
    + [All the services](#all-the-services)
    + [A single service](#a-single-service)
- [Using the SDK](#using-the-sdk)
  * [Constructing service clients](#constructing-service-clients)
    + [Setting service client options programmatically](#setting-service-client-options-programmatically)
    + [Constructing a service client using external configuration](#constructing-a-service-client-using-external-configuration)
  * [Authentication](#authentication)
    + [Example: construct IamAuthenticator with an IAM api key](#example-construct-iamauthenticator-with-an-iam-api-key)
    + [Example: construct BearerTokenAuthenticator with an access token](#example-construct-bearertokenauthenticator-with-an-access-token)
  * [Passing operation parameters via an "options" class](#passing-operation-parameters-via-an-options-class)
  * [Receiving operation responses](#receiving-operation-responses)
  * [Error Handling](#error-handling)
  * [Synchronous and asynchronous requests](#synchronous-and-asynchronous-requests)
  * [Sending HTTP headers](#sending-http-headers)
    + [Sending HTTP headers with all requests](#sending-http-headers-with-all-requests)
    + [Sending request HTTP headers](#sending-request-http-headers)
- [Questions](#questions)
- [Open source @ IBM](#open-source--ibm)
- [Contributing](#contributing)
- [License](#license)

<!-- tocstop -->

## Overview

The IBM Cloud MySDK Java SDK allows developers to programmatically interact with the following IBM Cloud services:

Service Name | Artifact Id 
--- | --- 
[Example Service](https://cloud.ibm.com/apidocs/example-service) | example-service

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration?target=%2Fdeveloper%2Fwatson&

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
* Java 8 or above.

## Installation
The current version of this SDK is: 0.0.1

#### All the services
To define a dependency on the entire set of services contained in the project, use a dependency like these:

##### Maven

```xml
<dependency>
	<groupId>com.ibm.cloud</groupId>
	<artifactId>mysdk</artifactId>
	<version>0.0.1</version>
</dependency>
```

##### Gradle

```gradle
'com.ibm.cloud:mysdk:0.0.1'
```

#### A single service
To define a dependency on a single service, use a dependency that contains the artifact id for the service, like this:

##### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>example-service</artifactId>
    <version>0.0.1</version>
</dependency>
```

##### Gradle
```gradle
'com.ibm.cloud:example-service:0.0.1'
```
Each service's artifact id is listed in the table above.

## Using the SDK
This section provides general information on how to use the services contained in this SDK.

### Constructing service clients
Each service is implemented in its own package within its module (artifact)
(e.g. package `com.ibm.cloud.platform_services.resource_controller.v2` within the `resource-controller` module).
The service's package will contain a "service client" class (a client-side representation of the service),
along with classes that represent the various models associated with the service API.

#### Setting service client options programmatically
Here's an example of how to construct an instance of a service (ResourceController) while specifying
service client options (authenticator, service endpoint URL, etc.) programmatically:

```java
import com.ibm.cloud.mysdk.example_service.v1.ExampleService;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;

// Create an authenticator.
Authenticator authenticator = new IamAuthenticator("<iam-api-key>");

// Set our custom endpoint base URL.
String myCustomServiceUrl = "https://myservice.cloud.ibm.com/v1"

// Create an instance of the "ExampleService" service client.
ExampleService myservice = new ExampleService(ExampleService.DEFAULT_SERVICE_NAME, authenticator);
myservice.setServiceUrl(myCustomServiceUrl);

// Service operations can now be called using the "myservice" variable.

```

#### Constructing a service client using external configuration
For a typical application deployed to the IBM Cloud, it might be convenient to avoid hard-coding
certain service client options (IAM API Key, service endpoint URL, etc.).
Instead, the SDK allows you to store these values in configuration properties external to your
application.

##### Define configuration properties
First, define the configuration properties to be used by your application.  These properties
can be implemented as either (1) exported environment variables or (2) stored in a *credentials* file.
In the examples that follow, we'll use environment variables to implement our configuration properties.
Each property name is of the form: `<serviceName>_<propertyKey>`.
Here is an example of some configuration properties for the "Example Service" service:

```
export EXAMPLE_SERVICE_URL=https://myservice.cloud.ibm.com/v1
export EXAMPLE_SERVICE_AUTH_TYPE=iam
export EXAMPLE_SERVICE_APIKEY=my-iam-apikey
```

The service name "example_service" is the default service name for the "Example Service" service,
so the SDK will (by default) look for properties that start with this prefix folded to upper case.

##### Construct service client
After you have defined the configuration properties for your application, you can
construct an instance of the service client like this:

```java
import com.ibm.cloud.mysdk.example_service.v1.ExampleService;

ExampleService myservice = ExampleService.newInstance();
```

The `ExampleService.newInstance()` method will:
1. construct an authenticator using the environment variables above (an IAM authenticator using "my-iam-apikey" as the api key).
2. initialize the service client to use a base endpoint URL of "https://myservice.cloud.ibm.com/v1" rather than the default URL.

##### Storing configuration properties in a file
Instead of exporting your configuration properties as environment variables, you can store the properties
in a *credentials* file.   Here is an example of a credentials file that contains the properties from the example above:

```
# Contents of "example-service.env"
EXAMPLE_SERVICE_URL=https://myservice.cloud.ibm.com/v1
EXAMPLE_SERVICE_AUTH_TYPE=iam
EXAMPLE_SERVICE_APIKEY=my-iam-apikey

```

You would then provide the name of the credentials file via the `IBM_CREDENTIALS_FILE` environment variable:

```
export IBM_CREDENTIALS_FILE=/myfolder/example-service.env
```

When the SDK needs to look for configuration properties, it will detect the `IBM_CREDENTIALS_FILE` environment
variable, then load the properties from the specified file.

##### Complete configuration-loading process
The above examples provide a glimpse of two specific ways to provide external configuration to the SDK
(environment variables and credentials file specified via the `IBM_CREDENTIALS_FILE` environment variable).

The complete configuration-loading process supported by the SDK is as follows:
1. Look for a credentials file whose name is specified by the `IBM_CREDENTIALS_FILE` environment variable
2. Look for a credentials file at `<current-working-director>/ibm-credentials.env`
3. Look for a credentials file at `<user-home-directory>/ibm-credentials.env`
4. Look for environment variables whose names start with `<upper-case-service-name>_` (e.g. `RESOURCE_CONTROLLER_`)

At each of the above steps, if one or more configuration properties are found for the specified service,
those properties are then returned to the SDK and any subsequent steps are bypassed.


### Authentication
IBM Cloud Platform Services use token-based Identity and Access Management (IAM) authentication.

IAM authentication uses an API key to obtain an access token, which is then used to authenticate
each API request.  Access tokens are valid for a limited amount of time and must be refreshed or reacquired.

To provide credentials to the SDK, you can do one of the following:
1. Construct or configure an `IamAuthenticator` instance with your IAM api key - in this case,
the SDK's IamAuthenticator implementation will use your API key to obtain an access token, ensure that it is valid,
and will then include the access token in each outgoing request, refreshing it as needed.

2. Construct or configure a `BearerTokenAuthenticator` instance using an access token that you obtain yourself -
in this case, you are responsible for obtaining the access token and refreshing it as needed.

For more details about authentication, including the full set of authentication schemes supported by
the underlying Java Core library, see
[Authentication](https://github.com/IBM/java-sdk-core/blob/master/Authentication.md)

#### Example: construct IamAuthenticator with an IAM api key

```java
import com.ibm.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.mysdk.example_service.v1.ExampleService;

// letting the SDK manage the IAM token
Authenticator authenticator = new IamAuthenticator("<iam_api_key>");
ExampleService service = ExampleService.newInstance(ExampleService.DEFAULT_SERVICE_URL, authenticator);
```


#### Example: construct BearerTokenAuthenticator with an access token

```java
import com.ibm.sdk.core.security.BearerTokenAuthenticator;
import com.ibm.cloud.mysdk.example_service.v1.ExampleService;

// Manage the IAM access token within the application
Authenticator authenticator = new BearerTokenAuthenticator("<access_token>");
ExampleService service = ExampleService.newInstance(ExampleService.DEFAULT_SERVICE_URL, authenticator);

...

// Later when the access token expires, the application must refresh the access token,
// then set the new access token on the authenticator.
// Subsequent request invocations will include the new access token.
authenticator.setBearerToken("<new-access-token>")
```

### Passing operation parameters via an "options" class
For each operation belonging to a service, an "options" class is defined as a container for
the parameters associated with the operation.
The name of the class will be `<operation-name>Options` and it will contain a field for each
operation parameter.  
Here's an example of an options class for the `GetResource` operation:

```java
/**
 * The getResource options.
 */
public class GetResourceOptions extends GenericModel {

  protected String resourceId;

  ...

}
```

In this example, the `GetResource` operation has one parameter - `resourceId`.
When invoking this operation, the application first creates an instance of the `GetResourceOptions`
class and then sets the parameter value within it.  Along with the "options" class, a nested "Builder" class
is also provided as a convenient way to construct instances of the class using the Java "builder" pattern.

Here's an example:

```java
import com.ibm.sdk.cloud.sdk.core.http.Response;
import com.ibm.cloud.mysdk.example_service.v1.ExampleService;
import com.ibm.cloud.mysdk.example_service.v1.model.GetResourceOptions;
import com.ibm.cloud.mysdk.example_service.v1.model.Resource;

...

ExampleService myservice = /* construct instance of service */

GetResourceOptions options = new GetResourceOptions.Builder()
    .resourceId("resource-id-1")
    .build();

Response<Resource> response = myservice.getResource(options).execute();
Resource result = response.getResult();

```

The use of the "options" class pattern (instead of listing each operation parameter within the
argument list of the service methods) allows for future expansion of the API (within certain
guidelines) without impacting applications.


### Receiving operation responses

Each operation will return an instance of `com.ibm.sdk.cloud.sdk.core.http.Response<T>` where `T` is the class representing the specific
response model associated with the operation (operations that return no response object
will return an instance of `com.ibm.sdk.cloud.sdk.core.http.Response<Void>` instead).

Here's an example of how to access that response and get additional information beyond the response object:

```java
// Invoke the operation.
GetResourceOptions options = /* construct options model */
Response<Resource> response = myservice.getResource(options).execute();

// Extract the operation's response model instance (result).
Resource resource  = response.getResult();

// Retrieve response headers.
Headers responseHeaders = response.getHeaders();
System.out.println("Response header names: " + responseHeaders.names());
```

### Error Handling

The IBM Cloud MySDK Java SDK will throw an exception for any unsuccessful method invocation.
If the service method (operation) receives an error response from a request invocation, it will throw an
exception from the `com.ibm.cloud.sdk.core.service.exception` package. All service exceptions contain the following fields.

| FIELD | DESCRIPTION |
| ----- | ----------- |
| statusCode | The HTTP response code that is returned. |
| message	| A message that describes the error. |

An operation may also throw an `IllegalArgumentException` if it detects missing or invalid input arguments.

Here's an example of how to catch and process specific exceptions that may be returned from an SDK method:

```
import com.ibm.cloud.sdk.core.service.exception.BadRequestException;
import com.ibm.cloud.sdk.core.service.exception.NotFoundException;
import com.ibm.cloud.sdk.core.service.exception.RequestTooLargeException;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.exception.UnauthorizedException;

...

try {
  // Invoke an operation
} catch (BadRequestException e) {
  // Handle Bad Request (400) exception
} catch (UnauthorizedException e) {
  // Handle Unauthorized (401) exception
} catch (NotFoundException e) {
  // Handle Not Found (404) exception
} catch (RequestTooLargeException e) {
  // Handle Request Too Large (413) exception
} catch (ServiceResponseException e) {
  // Base class for all exceptions caused by error responses from the service
  System.out.println("Service returned status code "
    + e.getStatusCode() + ": " + e.getMessage());
}
```

### Synchronous and asynchronous requests

The IBM Cloud MySDK Java SDK supports both synchronous (blocking) and asynchronous (non-blocking) execution
of service methods. All service methods implement the [`ServiceCall`][service-call] interface.

[service-call]: https://ibm.github.io/java-sdk-core/docs/8.1.3/com/ibm/cloud/sdk/core/http/ServiceCall.html

To call a method synchronously, use the `execute()` method of the `ServiceCall<T>` interface, like this:

```java
// Invoke the operation.
GetResourceOptions options = /* construct options model */
Response<Resource> response = myservice.getResource(options).execute();

// Continue execution...
```

To call a method asynchronously, use the `enqueue()` method of the `ServiceCall<T>` interface to receive a callback when the response arrives.
The `ServiceCallback<T>` interface provides `onResponse` and `onFailure` methods that you override to handle the callback,
like this:

```java
// Invoke the operation in the background
GetResourceOptions options = /* construct options model */
myservice.getResource(options).enqueue(new ServiceCallback<ResourceInstance>() {
  @Override
  public void onResponse(Response<Resource> response) {
    System.out.println("We did it! " + response);
  }

  @Override
  public void onFailure(Exception e) {
    System.out.println("Whoops...");
  }
});

// Continue execution in the meantime!
```

### Sending HTTP headers

#### Sending HTTP headers with all requests

A set of default HTTP headers can be included with all requests by using the `setDefaultHeaders(Map<String, String> headers)`
method of the service client.

Here's an example that includes `Custom-Header` with each request invocation:

```java
Map<String, String> headers = new HashMap<String, String>();
headers.put("Customer-Header", "custom_value");

myservice.setDefaultHeaders(headers);

// "Custom-Header" will now be included with all subsequent requests invoked from "myservice".
```

#### Sending request HTTP headers
Custom HTTP headers can also be passed with any individual request.
Just add the custom headers to the `ServiceCall` object before calling the `execute()` method.
Here's an example that includes `Custom-Header` along with the `getResource` operation invocation:

```java
Response<Resource> response = myservice.getResource(options)
  .addHeader("Custom-Header", "custom_value")
  .execute();
```

## Questions

If you are having difficulties using this SDK or have a question about the IBM Cloud services,
please ask a question at [dW Answers](https://developer.ibm.com/answers/questions/ask/?topics=ibm-cloud) or
[Stack Overflow](http://stackoverflow.com/questions/ask?tags=ibm-cloud).

## Open source @ IBM
Find more open source projects on the [IBM Github Page](http://ibm.github.io/)

## Contributing
See [CONTRIBUTING](https://github.ibm.com/CloudEngineering/java-sdk-template/blob/master/CONTRIBUTING.md).

## License

The IBM Cloud MySDK Java SDK is released under the Apache 2.0 license.
The license's full text can be found in [LICENSE](https://github.ibm.com/ibmcloud/platform-services-java-sdk/blob/master/LICENSE).
