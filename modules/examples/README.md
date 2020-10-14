# Code Engine Java SDK Example

## Running the example

To run the example, create a Code Engine project from the Console or Code Engine CLI. Next, from the root directory, set the following environment variables, build the project, and execute the `IbmCloudCodeEngineExamples` class:
1. `export CE_API_KEY=<Your IBM Cloud API key>`
2. `export CE_PROJECT_ID=<Your Code Engine project ID>`
3. `export CE_PROJECT_REGION=<The region (e.g. 'us-south') of your Code Engine project>`
4. `mvn package`
5. `java -jar ./modules/examples/target/code-engine-examples-1.0.0-SNAPSHOT.jar`

## How-to

### Set up an authenticator
```java
IamAuthenticator authenticator = new IamAuthenticator(ceApiKey);
authenticator.setClientIdAndSecret("bx", "bx");
```

### Set up a Code Engine client
```java
IbmCloudCodeEngine ceClient = new IbmCloudCodeEngine("Code Engine Client", authenticator);
ceClient.setServiceUrl("https://api." + System.getenv("CE_PROJECT_REGION") + ".codeengine.cloud.ibm.com/api/v1");
```

### Use the Code Engine client to get a Kubernetes config
```java
ListKubeconfigOptions options = new ListKubeconfigOptions.Builder()
  .id(ceProjectID)
  .refreshToken(authenticator.requestToken().getRefreshToken())
  .build();
Response<String> kubeConfigResponse = ceClient.listKubeconfig(options).execute();
```