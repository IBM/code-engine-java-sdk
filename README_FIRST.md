# IBM Cloud Java SDK Template
This repository serves as a template for Java SDKs that are produced with the
[IBM OpenAPI SDK Generator](https://github.ibm.com/CloudEngineering/openapi-sdkgen).

You can use the contents of this repository to create your own Java SDKs.

## How to use this repository

### 1. Copy or clone the repository
Copy the files contained in this repository as a starting point when building your own Java SDK
for one or more IBM Cloud services.

You can copy the repository using one of the following methods:
1. Download the zip file from the git repository main page
(click on the `Clone or download` button, then click on `Download ZIP`).
After downloading the zip file, unzip it into a suitable location where you want the project to exist.
The unzip command will create the `java-sdk-template-master` directory, which you might want to rename
to something that reflects the Java SDK project that you're trying to build.
2. Clone this git repository using a command like this:
`git clone git@github.ibm.com:CloudEngineering/java-sdk-template.git my-sdk`, where `my-sdk`
is the name of the directory to clone the repository into.  If you omit that option,
git will clone the repo into the `java-sdk-template` directory.
In that case, you might want to rename the directory to something that reflects the
Java SDK project that you're trying to build.

Note: If you use the `git clone` method of copying the repository, be sure to change the URL
associated with the `origin` remote, like this:
```bash
git remote set-url origin <your project's git URL>
```
If you don't do this, you might inadvertently try to push your changes back to the `java-sdk-template` repository.

### 2. Sanity-check your copy of the `java-sdk-template` repository
After copying or cloning this repository, you can do a quick sanity check by running this command in
the project root directory:
```
mvn package
```
You should see output like this:
```
$ mvn package
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO]
[INFO] Example Java SDK Project
[INFO] MySDK Common Library
[INFO] Example Service
[INFO] Coverage Reports
.
.    ...maven output...
.
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] Example Java SDK Project ........................... SUCCESS [  1.065 s]
[INFO] MySDK Common Library ............................... SUCCESS [  2.128 s]
[INFO] Example Service .................................... SUCCESS [  0.895 s]
[INFO] Coverage Reports ................................... SUCCESS [  0.073 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 4.239 s
[INFO] Finished at: 2019-10-14T10:32:27-05:00
[INFO] Final Memory: 34M/573M
[INFO] ------------------------------------------------------------------------
```

### 3. Modify your copy of the repository to reflect your SDK project
Once you have verified that your copy of this template repository builds and tests cleanly, it's time to
transform it into your new Java SDK project.
Make sure you have done the following:
1. Rename the root directory to reflect your Java SDK project (e.g. `mv java-sdk-template my-java-sdk`)
2. If you previously cloned the `java-sdk-template` git repository, be sure to change the url associated
with the remote named `origin`, like this: `git remote set-url origin <your project's git URL>`

Next, make modifications to various files and directories as instructed below:

* The Java SDK template repository uses the name `MySDK` as a placeholder for the name of the
SDK project in various files.
References to `MySDK` should be replaced with the name of your Java SDK project.
* Also, the base package name `com.ibm.cloud.mysdk` is used within various modules in the project.
Determine the base package name that you will use for your Java SDK project and then modify the directory paths underneath `src/main/java` and `src/test/java` within each module directory as needed.
It is recommended that your base package name start with the `com.ibm.cloud` prefix (e.g. `com.ibm.cloud.xyz_sdk`).  After modifying the directory paths to reflect your base package name, you will also
need to change the `package` statements within Java source files as well.

* __README.md__ - This file is intended to be customized to form the `README.md` file for your new
Java SDK project, so modify it as needed to reflect your project.  

* __pom.xml__ - this is the top-level maven build script that requires several customizations:

  - Update the project details such as project name, description, artifact-id, and url.

  - __[Very important]__ Set the version of the Java `sdk-core` package to be used with your
  SDK project.  This is defined in the line that looks like this:
    ```
        <sdk-core-version>7.0.0</sdk-core-version>
    ```

    You must use a version of the Java SDK Core that is compatible with the version of the SDK generator
    used to generate your SDK code.   See [this link](https://github.ibm.com/CloudEngineering/openapi-sdkgen/wiki/Compatibility-Chart) for details.

  Comments inside the pom.xml file will guide you when customizing this for your Java SDK project.

* __modules/common/pom.xml__ - follow the instructions in the comments within this file.

* __modules/common/src/main/java/com/ibm/cloud/mysdk/common/SdkCommon.java__ -  
  Java SDKs built with the IBM OpenAPI SDK Generator need to implement a class called `SdkCommon` that contains
  a function named `getSdkHeaders()`.  The `SdkCommon.getSdkHeaders()` function is invoked by the generated service
  methods and should be modified to suit the needs of your particular SDK.
  The default implementation of `getSdkHeaders()` will return a map containing the "User-Agent" header with a value like this:
  ```
  MySDK/0.0.1; ibm-java-sdk-core-7.0.0 (os.arch=x86_64; os.name=Linux; os.version=7.7; java.version=1.8.1)
  ```
  You can modify this function to customize the value of the `User-Agent` header or add additional  headers to the map
  that is returned.  The headers returned in the map will be added to each outgoing request invoked by applications
  using your SDK.

  At a minimum, the following changes need to be made to the `SdkCommon` class:
  1. Rename the "mysdk" in this file's path to be consistent with your SDK's base package name (if not done
    previously).  Make the same change in the corresponding `src/test/java/com/ibm/cloud/mysdk` path as well.
  2. Update the `package` statement to reflect your Java SDK's base package name (if not done previously).
  3. Update the `getSdkHeaders()` method so that it returns the desired set of SDK-specific HTTP headers
     to be included in outgoing REST API requests.
  4. After modifying the `SdkCommon` class, be sure to also update the accompanying testcase
  (`SdkCommonTest`) to properly test the new version of `SdkCommon`.

### 4. Generate the Java code with the IBM OpenAPI SDK Generator
This is the step that you've been waiting for!

In this step, you'll invoke the IBM OpenAPI SDK Generator to process your API definition(s).

#### Generator setup
1. Install an official release of the OpenAPI SDK Generator.
Details are [here](https://github.ibm.com/CloudEngineering/openapi-sdkgen/blob/master/README.md#using-a-pre-built-installer).
You might want to also add the installation directory to your shell PATH environment variable.

2. Modify your API definition(s) to include the base package name that you defined above. Details on the `apiPackage` configuration property can be found [here](https://github.ibm.com/CloudEngineering/openapi-sdkgen/wiki/Config-Options).  
Here's an example of an API definition that has this property defined:
```
openapi: "3.0.0"
info:
  version: 1.0.0
  title: Example service
  x-alternate-name: ExampleService
  license:
    name: MIT
  x-codegen-config:
    java:
      apiPackage: 'com.ibm.cloud.xyz_sdk'
```
#### Generating the code for your service(s)
For each service that you want to include in your Java SDK project, process the
service's API definition with the SDK Generator, like this:
```
openapi-sdkgen.sh generate -i <API-definition-filename> -g watson-java -o <output-directory>
```
For the output directory, you can specify the "modules" directory of your Java SDK project, and the generator
will create a directory underneath that to represent the module associated with the generated service,
then it will write the generated source files to that directory.  

For example, this command:
```
openapi-sdkgen.sh generate -i cloud-service.yaml -g watson-java -o /work/projects/xyz_sdk/modules
```
would write the generated source files to `/work/projects/xyz_sdk/modules/cloud-service`.

__Note:__ the name of the module directory comes from the `title` and/or `x-alternate-name` properties within
the API definition, not the name of the API definition file.

After you generate each service, copy the __modules/example-service/pom.xml__ file into your new module
directory (the new directory created by the SDK generator), and then modify it as needed to reflect your new
service, using the comments within the file as a guide.  Also, be sure to add your new module to the list
of modules within the root __poml.xml__ file.

For more information on using the SDK Generator to generate a Java SDK, see [this page](https://github.ibm.com/CloudEngineering/openapi-sdkgen/wiki/Generating-a-Java-SDK).

### 5. Remove `example-service` module
The `java-sdk-template` repository includes an example service in the `modules/example-service` directory.  
This is an example of a service that was generated with the IBM OpenAPI SDK Generator.  

Once you have generated the Java code for your own service(s) and added those modules to your Java SDK
project, you'll want to remove the `example-service` module so that it is not included in your SDK.

To remove the module, simply remove the `module/example-service` directory and the files contained within it,
then modify the root __pom.xml__ to remove `example-service` from the list of modules.

### 6. Develop tests for your generated service(s)
After adding your generated service(s) to your Java SDK project, unit and integration tests should be developed
which exercise the various methods (operations) belonging to your service(s).  We recommend that you use the
[`TestNG`](https://testng.org/doc/) framework for testcases.

Unit tests typically use a mock
service endpoint along with mock request and response data to quickly test that the generated SDK code is working
properly for your services.

Integration tests are typically tests that use an actual running instance of the services.


### 7. Build and test the project
If you made it this far, congratulate yourself!

After generating the code for your services and developing unit and integration tests, it's time to build
and test your project.   To do that, run this command in the project root directory:
```
mvn package
```

After the various tests within your project are run, you can examine the following for test and coverage results:
1. `modules/<module-name>/target/surefire-reports/index.html` - contains the unit test results for a particular module.
2. `modules/coverage-reports/target/site/jacoco-aggregate/index.html` - contains an aggregate test coverage report
for the project.

### 8. Continuous Integration
This repository is set up to use [Travis](https://travis-ci.org/) for continuous integration.

Before setting up Travis CI and set up integration test, create a file named `ibm-credentials.env` at the root of the java-sdk-template project directory. For more information on the format of the `ibm-credentials.env` file, see (example credentials file here)[https://github.com/IBM/java-sdk-core/blob/master/src/test/resources/my-credentials.env].

Then, in order to pass credentials to Travis and run integration tests:

1. Enable Travis-CI for your repository in Travis.
2. Make sure Ruby and Ruby Gem are installed and up to date on your local machine. You can [install Ruby here](https://www.ruby-lang.org/en/documentation/installation/)
3. Install Travis CLI (`gem install travis`). To verify installation, type `travis -v`
4. Log into Travis through CLI. Depending on whether you're trying to connect to Travis Enterprise, or Public Travis, the commands will be different.

Here's the command for logging into Travis Enterprise:
```sh
travis login -X --github-token <your-github-enterprise-token> --api-endpoint https://travis.ibm.com/api
```

Here's the command for logging into Public Travis
```sh
travis login --github-token <your-public-github-token> --com
```

5. From the root of the project, run the command `travis encrypt-file ibm-credentials.env`
6. The command will generate a file called `ibm-credentials.env.enc` in the project folder root directory. Commit the file to your repository
7. Terminal should print out a command to add to your build script. In that command is a string with the format similar to `encrypted_12345_key`. Copy that string
8. Open `.travis.yml` from the project root directory. Replace the string `encrypted_12345_key` with the name of your generated environment variable from the last step
9. Also replace the string `encrypted_12345_iv` with the name of your generated environment variable, but modify the string from `_key` to `_iv`
10. Commit the changes you made to the `.travis.yml` file and push to Github. Travis-CI pipeline should automatically start running

The config file `.travis.yml` contains all the instructions necessary to run the recommended build. Each step is described below.

The `before_install` step runs the instructions to decrypt the `ibm-credentials.env.enc` file. It only does for *pushes* to a branch. This is done so that integration tests only run on *push* builds and not on *pull request* builds.

The `script` section runs the command to build and run test.

The `deploy` section is the last step of the build and triggers the automated release management. Builds will be published to the release section of the Github project.
