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

- The Java SDK template uses the name "MySDK" as a placeholder for the name of the SDK, so start
  by replacing all the occurrences of this name with the name of your SDK, both within the files
  and in directory names such as `modules/common/src/main/java/com/ibm/cloud/mysdk`.

- pom.xml - this is the top-level build script that requires several customizations

  - update the project details such as project name, description, and artifact-id, and url.

  - **very important** set the version of the java-sdk-core package to be use with the SDK.
    This is defined in the line that looks like this:
    ```
        <sdk-core-version>7.0.0-rc6</sdk-core-version>
    ```

    You must use a core SDK version that is compatible with the version of the SDK generator
    used to generate your SDK code. See this link for details:

    https://github.ibm.com/CloudEngineering/openapi-sdkgen/wiki/Compatibility-Chart

  Comments inside the pom.xml file will guide you when customizing this for your SDK project.

- modules/common/pom.xml - follow the instructions in the comments within this file.

- modules/common/src/main/java/com/ibm/cloud/mysdk/common/SdkCommon.java

  Java SDKs built with the IBM OpenAPI SDK Generator use a class called `SdkCommon` to contain common
  methods uses by all the generated services.

  - Rename the "mysdk" in this file's path to be consistent with your SDK's base package name (if not done
    previously)

  - Update the `package` statement to to reflect your SDK's base package name (if not done previously)

  - Update the `getSdkHeaders()` method so that it returns the desired set of SDK-specific HTTP headers
    to be included in outgoing REST API requests.

    The example class returns the `User-Agent` HTTP header, but you can modify this to return any set of
    HTTP headers that meet your SDK requirements, including none.

- create the appropriate directories under "modules" (one per generated service), and
  copy modules/example-service/pom.xml to each module directory, then update per the
  instructions contained in the file.

### 3. Generate the Java code with the IBM OpenAPI SDK Generator
This is the step that you've been waiting for!

In this step, you'll invoke the IBM OpenAPI SDK Generator to process your API definition.

This will generate a collection of Java classes which will be included in your SDK project.
You'll find instructions on how to do this [here](https://github.ibm.com/CloudEngineering/openapi-sdkgen/wiki/Generating-a-Java-SDK).

The generated code for each service should be copied/moved to the modules/<service-name> directory.
For example, if your service is called "my-cloud-service", then you should create a directory in your
SDK project named "modules/my-cloud-service" and copy modules/example-service/pom.xml into that directory,
then modify it according to the instructions contained within the file.

**Pro tip:** When you use the OpenAPI SDK Generator to generate the client SDK code for your service,
you can use the `-o` command-line option to specify `<your-sdk-project>/modules` directory as the output
directory.   This will cause the generator to save the generated code directly into
your SDK project's `modules/<service-name>` directory.
