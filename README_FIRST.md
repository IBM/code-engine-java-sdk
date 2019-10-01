# IBM Cloud Java SDK Template
This repository serves as a template for Java SDKs that are produced with the 
[IBM OpenAPI SDK Generator](https://github.ibm.com/CloudEngineering/openapi-sdkgen).

You can use the contents of this repository to create your own Java SDKs.

## How to use this repository

### 1. Copy the repository
Copy the files contained in this repository as a starting point when building your own Java SDK
for one or more IBM Cloud services.

### 2. Modify the copied files to reflect your SDK project
The following files will need to be modified after copying them from this template repository:
- pom.xml - comments inside the file will guide you when customizing this for your SDK project.

- modules/common/pom.xml - follow the instructions in the comments within this file.

- create the appropriate directories under "modules" (one per generated service), and
  copy modules/exampl-service/pom.xml to each module directory, then update per the 
  instructions contained in the file.

- modules/common/src/main/java/com/ibm/cloud/mysdk/common/SdkCommon.java - Java SDKs built with the IBM OpenAPI SDK Generator 
need to provide a class called `SdkCommon` that is invoked by the generated service methods.
The class provided in this template repository has a package name of `com.ibm.cloud.mysdk.common`. This package
will need to be adjusted to reflect your own SDK's base package name.  For example, if you configure your 
API definition to specify a Java base package name of `com.ibm.mygroup.mysdk`, you'll need to rename the directories
underneath `src/main/java` and modify the SdkCommon class itself to reflect that package name.
Inside this class, you'll find a method called `getSdkHeaders()`.  This method should be modified so that it returns
the desired set of SDK-specific HTTP headers to be included in outgoing REST API requests.  The example class returns the
`User-Agent` HTTP header, but you can modify this to return any set of HTTP headers that meet your SDK requirements,
including none.

### 3. Generate the Java code with the IBM OpenAPI SDK Generator
This is the step that you've been waiting for!

In this step, you'll invoke the IBM OpenAPI SDK Generator to process your API definition.

This will generate a collection of Java classes which will be included in your SDK project.
You'll find instructions on how to do this [here](https://github.ibm.com/CloudEngineering/openapi-sdkgen/wiki).

The generated code for each service should be copied/moved to the modules/<service-name> directory.
For example, if your service is called "my-cloud-service", then you should create a directory in your 
SDK project named "modules/my-cloud-service" and copy modules/example-service/pom.xml into that directory,
then modify it according to the instructions contained within the file.

**Pro tip:** When you use the OpenAPI SDK Generator to generate the client SDK code for your service,
you can use the `-o` command-line option to specify `<your-sdk-project>/modules` directory as the output
directory.   This will cause the generator to save the generated code directly into
your SDK project's `modules/<service-name>` directory.
