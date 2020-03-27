# IBM Cloud Java SDK Template Usage Instructions

This repository serves as a template for Java SDKs that are produced with the
[IBM OpenAPI SDK Generator](https://github.ibm.com/CloudEngineering/openapi-sdkgen).

You can use the contents of this repository to create your own Java SDKs.

## How to use this repository

### 1. Create your new github repository from this template
This SDK template repository is implemented as a
[github template](https://help.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-from-a-template),
which makes it easy to create new projects from it.

To create a new SDK repository from this template, follow these instructions:  
1. In your browser, open the link for this
[template repository](https://github.ibm.com/CloudEngineering/java-sdk-template).

2. Click on the `Use this template` button that appears next to the `Clone or download` button.

3. In the next window:  
- Select the `Owner`. This is the github id or organization where the new repository should be created
- Enter the respository name (e.g. `platform-services-java-sdk`):  
  - Recommendation: use a name of the form `<service-category>-<language>-sdk`, where:  
    - `<service-category>` refers to the IBM Cloud service category associated with the services that
	  will be included in the project (e.g. `platform-services`)
    - `<language>` is the language associated with the SDK project (e.g. `java`)
	
4. Click the `Create repository from template` button to create the new repository  

If your goal is to create the new SDK repository on the `Github Enterprise` server (github.ibm.com),
then you are finished creating the new repository and you can proceed to section 2.

On the other hand, if your goal is to create the new SDK repository on the `Public Github` server (github.com),
then perform these additional steps:

5. Create a new **EMPTY** repository on the Public Github server:  
- Select "No template" for the "Repository template" option
- Select the `Owner` (your personal id or an organization)
- Enter the same respository name that you used when creating the new repository above (e.g. my-java-sdk)
- Do NOT select the `Initialize this repository with a README` option
- Select `None` for the `Add .gitignore` and `Add a license` options
- Click the `Create repository` button.
- After the new empty repository has been created, you will be at the main page
of your new repository, which will include this text:
```
...or push an existing repository from the command line

git remote add origin git@github.com:padamstx/my-java-sdk.git
git push -u origin master
```
- Take note of the two git commands listed above for your new repository, as we'll execute these later

6. Clone your new `Github Enterprise` repository (created in steps 1-3 above)
to your local development environment:  

```sh
[/work/demos]
$ git clone git@github.ibm.com:phil-adams/my-java-sdk.git
Cloning into 'my-java-sdk'...
remote: Enumerating objects: 36, done.
remote: Counting objects: 100% (36/36), done.
remote: Compressing objects: 100% (32/32), done.
remote: Total 36 (delta 1), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (36/36), 28.74 KiB | 577.00 KiB/s, done.
Resolving deltas: 100% (1/1), done.
```

7. "cd" into your project's root directory:

```sh
[/work/demos]
$ cd my-java-sdk
[/work/demos/my-java-sdk]
$ 
```

8. Remove the existing remote:  
```sh
[/work/demos/my-java-sdk]
$ git remote remove origin
```

9. Add a new remote which reflects your new `Public Github` repository:

```sh
[/work/demos/my-java-sdk]
$ git remote add origin git@github.com:padamstx/my-java-sdk.git
```

10. Push your local repository to the new remote (Public Github):  

```sh
[/work/demos/my-java-sdk]
$ git push -u origin master
Enumerating objects: 36, done.
Counting objects: 100% (36/36), done.
Delta compression using up to 12 threads
Compressing objects: 100% (31/31), done.
Writing objects: 100% (36/36), 28.74 KiB | 28.74 MiB/s, done.
Total 36 (delta 1), reused 36 (delta 1)
remote: Resolving deltas: 100% (1/1), done.
To github.com:padamstx/my-java-sdk.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
```

You have now created your new SDK repository on the `Public Github` server.

You may want to now delete the new SDK repository that you created on the `Github Enterprise`
server since it will no longer be used now that you have created your repository on `Public Github`.


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
.
.    ...maven output...
.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 7.416 s
[INFO] Finished at: 2020-03-27T17:53:36-05:00
[INFO] Final Memory: 40M/716M
[INFO] ------------------------------------------------------------------------
```

### 3. Modify selected files

- In this section, you'll modify various files within your new SDK repository to reflect
the proper names and settings for your specific project.

- The template repository comes with an example service included, but this should be removed
from your project:
  - Remove the `modules/example-service` directory and its contents
  - Comment out the "example-service" module entry from the list of modules in the parent pom.xml file
    (look for ">>> List each service's module here")

- Next, decide on the appropriate java main package name for your project.
  This should use the pattern `com.ibm.cloud.<service_category>` (e.g. com.ibm.cloud.platform_services).
  This value should also be used as the `apiPackage` option when generating SDK code. More on this later.

- Next, here is a list of the various files within the project with comments
that will guide you in the required modifications:

  - `pom.xml`: this is the top-level maven build script (parent pom):
    - follow the instructions within this file (look for each ">>>")

  - `modules/common/pom.xml`:  
    - follow the instructions within this file (look for each ">>>")

  - `modules/common/src/main/java/com/ibm/cloud/my_services/common/SdkCommon.java`:
    - Rename the "my_services" part of the pathname to be the last part of the project's main package name
      (e.g. `platform_services`).
    - follow the instructions within this file (look for each ">>>")

  - `modules/common/src/test/java/com/ibm/cloud/my_services/common/test/SdkCommonTest.java`:
    - Rename the "my_services" part of the pathname to be the last part of the project's main package name
      (e.g. `platform_services`).
    - follow the instructions within this file (look for each ">>>")

  - `modules/common/src/main/resources/my-services.properties`
    - Rename this file so that the base name of the file reflects the parent project's artifactId
      (e.g. platform-services.properties)

  - `modules/coverage-reports/pom.xml`:
    - follow the instructions within this file (look for each ">>>")

  - `README.md`:
    - Change the title to reflect your project; leave the version in the title as `0.0.1`
    - Change `[IBM Cloud My Services]` to reflect your project
      (e.g. `[IBM Cloud Platform Services]`)
    - Change the `cloud.ibm.com/apidocs` link to reflect the correct service category
      (e.g. `platform-services`)
    - In the Overview section, modify `IBM Cloud My Services Java SDK` to reflect your project
      (e.g. `IBM Cloud Platform Services Java SDK`)
    - In the table of services, remove the entry for the example service; later you'll list each
      service contained in your SDK project in this table, along with a link to the online reference docs
      and the name of the generated service artifact.
    - In the Installation section:
      - Update the dependency examples within the "All the services" section
        to reflect your parent project's artifact id (e.g. change "my-services" to "platform-services")
      - Update the dependency examples within the "A single service" section
        to reflect the artifactId of ONE OF your services (e.g. change "example-service" to
        "resource-controller")
    - In the "Issues" section, modify `<github-repo-url>` to reflect the Github URL for your project.
    - Note that the README.md file contains a link to a common README document where general
      SDK usage information can be found.
    - When finished, read through the document and make any other changes that might be necessary.

  - `CONTRIBUTING.md`:
    - In the "Issues" section, modify `<github-repo-url>` to reflect the Github URL for your project.

At this point, it's probably a good idea to commit the changes that you have made so far.
Be sure to use proper commit messages when committing changes (follow the link in `CONTRIBUTING.md`
to the common CONTRIBUTING document).  
Example:
```sh
cd <project-root>
git add .
git commit -m "chore: initial SDK project setup"
```



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

## Setting the ``User-Agent`` Header In Preparation for SDK Metrics Gathering

If you plan to gather metrics for your SDK, the `User-Agent` header value must be
a string similar to the following:
   `my-java-sdk/0.0.1 (lang=java; java.vendor=AdoptOpenJDK; java.version=1.8.0_232; os.arch=x86_64; os.name=Linux; os.version=5.1)`

The key parts are the sdk name (`my-java-sdk`), version (`0.0.1`) and the
language name (`lang=java`).
This is required because the analytics data collector uses the User-Agent header included
with each request to gather usage data for IBM Cloud services.

The default implementation of the `SdkCommon.getSdkHeaders()` method provided in this SDK template
repository will need to be modified slightly for your SDK.
Replace the `my-java-sdk/0.0.1` part with the name and version of your
Java SDK. The rest of the system information should remain as-is.

For example, suppose your Java SDK project is called `platform-services-java-sdk` and its
version is `2.3.1`.
The `User-Agent` header value should be:
   `platform-services-java-sdk/2.3.1 (lang=java; java.vendor=AdoptOpenJDK; java.version=1.8.0_232; os.arch=x86_64; os.name=Linux; os.version=5.1)`

__Note__: It is very important that the sdk name ends with the string `-sdk`,
as the analytics data collector uses this to gather usage data.

More information about the analytics tool, and other steps you should take to start gathering
metrics for your SDK can be found [here](https://github.ibm.com/CloudEngineering/sdk-analytics).
