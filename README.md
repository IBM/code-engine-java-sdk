ExampleService# MySDK Java SDK

Java client library to use the MySDK Services.

<details>
<summary>Table of Contents</summary>

* [Overview](#overview)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Authentication](#authentication)
* [Sample Code](#sample-code)
* [License](#license)

</details>

## Overview

The IBM Cloud MySDK Java SDK allows developers to programmatically interact with the
MySDK IBM Cloud services.

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration?target=%2Fdeveloper%2Fwatson&

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
* An installation of Java on your local machine.

## Installation

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

## Authentication

MySDK services use token-based Identity and Access Management (IAM) authentication[IAM](#iam).

IAM authentication uses a service API key to get an access token that is passed with the call.
Access tokens are valid for a limited amount of time and must be regenerated.

To provide credentials to the SDK, you supply either an IAM service **API key** or an **access token**:

- Use the API key to have the SDK manage the lifecycle of the access token. The SDK requests an access token, ensures that the access token is valid, and refreshes it if necessary.
- Use the access token if you want to manage the lifecycle yourself. For details, see [Authenticating with IAM tokens](https://cloud.ibm.com/docs/services/watson/getting-started-iam.html).


Supplying the IAM API key:

```java
// letting the SDK manage the IAM token
Authenticator authenticator = new IamAuthenticator("<iam_api_key>");
ExampleService service = new ExampleService(authenticator);
```

Supplying the access token:

```java
// assuming control of managing IAM token
Authenticator authenticator = new BearerTokenAuthenticator("<access_token>");
ExampleService service = new ExampleService(authenticator);
```

## Using the SDK

### Parsing responses

All methods of the that perform a MySDK API call will return an object of form `Response<T>`,
where `T` is the model representing the specific response model.

Here's an example of how to access that response and get additional information beyond the response model:

```java
// listing resources of the MySDK Example Service
Response<Resources> response = service.listResources().execute();

// pulling out the specific API method response, which we can manipulate as usual
Resources resources = response.getResult();
System.out.println("My resources: " + resources.getResources());

// grabbing headers that came back with our API response
Headers responseHeaders = response.getHeaders();
System.out.println("Response header names: " + responseHeaders.names());
```

### Error Handling

The IBM Cloud MySDK Java SDK generates an exception for any unsuccessful method invocation.
If the method receives an error response from an API call to the service, it will generate an
exception from the com.ibm.cloud.service.exception package. All service exceptions contain the following fields.

| FIELD | DESCRIPTION |
| ----- | ----------- |
| statusCode | The HTTP response code that is returned. |
| message	| A message that describes the error. |

A method may also generate an `IllegalArgumentException` if it detects missing or invalid input arguments.

Here's an example of how to catch and process specific exceptions that may be returned from an SDK method:

```
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
}
```

### Synchronous and asynchronous requests

The IBM Cloud MySDK Java SDK supports both synchronous (blocking) and asynchronous (non-blocking) execution
of service methods. All service methods implement the [`ServiceCall`][service-call] interface.

[service-call]: https://ibm.github.io/java-sdk-core/docs/3.0.2/com/ibm/cloud/sdk/core/http/ServiceCall.html

To call a method synchronously, use the `execute` method of the `ServiceCall` interface.
You can call the execute method directly from an instance of the service.

```java
// make API call
Response<Resources> response = service.listResources().execute();

// continue execution
```

To call a method asynchronously, use the `enqueue` method of the `ServiceCall` interface to receive a callback when the response arrives.
The `ServiceCallback` interface of the method's argument provides `onResponse` and `onFailure` methods that you override to handle the callback.

```java
// make API call in the background
service.listResources().enqueue(new ServiceCallback<ListResourcesResponse>() {
  @Override
  public void onResponse(Response<ListResourcesResponse> response) {
    System.out.println("We did it! " + response);
  }

  @Override
  public void onFailure(Exception e) {
    System.out.println("Whoops...");
  }
});

// continue working in the meantime!
```

### Default headers

Default headers can be specified at any time by using the `setDefaultHeaders(Map<String, String> headers)` method of the client instance.

The example below sets the header `Custom-Header` with the value "custom_value" as the default header,
which is then sent in every subsequent request to the service.

```java
ExampleService service = new ExampleService();

Map<String, String> headers = new HashMap<String, String>();
headers.put("Custom-Header", "custom_value");

service.setDefaultHeaders(headers);

// All the api calls from now on will send the default headers
```

### Sending request headers

Custom headers can be passed with any request. To do so, add the header to the `ServiceCall` object before executing the request. For example, this is what it looks like to send the header `Custom-Header` along with a call to the Watson Assistant service:

```java
Response<Resources> resources = service.listResources()
  .addHeader("Custom-Header", "custom_value")
  .execute();
```

## Sample Code

See [Samples](Samples).

## License

The IBM Cloud MySDK Java SDK is released under the Apache 2.0 license. The license's full text can be found in [LICENSE](LICENSE).
