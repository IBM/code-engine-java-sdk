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

### Get a Delegated Refresh Token from IAM using an HTTP client
This example uses Java's `HttpURLConnection`, but you may use the HTTP client of your choice.
```java
URL iamUrl = new URL("https://iam.cloud.ibm.com/identity/token?"
  + "grant_type=urn:ibm:params:oauth:grant-type:apikey&"
  + "response_type=delegated_refresh_token&"
  + "receiver_client_ids=ce&"
  + "delegated_refresh_token_expiry=3600&"
  + "apikey="
  + System.getenv("CE_API_KEY"));
HttpURLConnection iamConnection = (HttpURLConnection) iamUrl.openConnection();
iamConnection.setRequestMethod("POST");
iamConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
BufferedReader iamInput = new BufferedReader(new InputStreamReader(iamConnection.getInputStream()));
String iamResponse = "";
String iamInputLine = "";
while ((iamInputLine = iamInput.readLine()) != null) {
  iamResponse = iamResponse + iamInputLine;
}
iamInput.close();
JSONObject iamJson = new JSONObject(iamResponse);
String delegatedRefreshToken = iamJson.getString("delegated_refresh_token");
```

### Use the Code Engine client to get a Kubernetes config
```java
GetKubeconfigOptions options = new GetKubeconfigOptions.Builder()
  .id(System.getenv("CE_PROJECT_ID"))
  .xDelegatedRefreshToken(delegatedRefreshToken)
  .build();
Response<String> kubeConfigResponse = ceClient.getKubeconfig(options).execute();
```

## Deprecated endpoint
The `/namespaces/{id}/config` endpoint function, `listKubeconfig()`, is deprecated, and will be removed before Code Engine is out of Beta. Please use the `getKubeconfig()` function, demonstrated in the example above.