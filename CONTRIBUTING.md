# Questions

If you are having problems using this SDK or have a question about IBM Cloud services,
please ask a question on [Stack Overflow](http://stackoverflow.com/questions/ask) or
[dW Answers](https://developer.ibm.com/answers/questions/ask).

# Issues

If you encounter an issue with the project, you are welcome to submit a [bug report](<github-repo-url>/issues).
Before that, please search for similar issues. It's possible that someone has already reported the problem.

# Pull Requests

If you want to contribute to the repository, here's a quick guide:
  1. Fork the repository.
  2. Develop and test your code changes:
      * Follow the coding style as documented above
      * To build/test: `mvn test`
      * Please add one or more tests to validate your changes.
  3. Make sure everything builds/tests cleanly.
      * The build will run the code style checker and flag any issues.
  4. Commit your changes  
  5. Push to your fork and submit a pull request to the **master** branch.
  6. Be sure to sign the CLA.

# Coding Style

This SDK follows a coding style based on the [Google Java coding style][GoogleJavaStyleGuidelines],
with the following modifications:
- Max line length is 120 chars
- Only basic JavadocStyle is enforced
- Import ordering in not enforced
- VariableDeclarationUsageDistance is not enforced
- OverloadMethodsDeclarationOrder is not enforced

[GoogleJavaStyleGuidelines]: https://google.github.io/styleguide/javaguide.html

# Running the Tests

Out of the box, `mvn test` runs unit tests and integration tests (which require credentials).
To run only the unit tests (sufficient for most cases), use `mvn -Dtest=unit/* test`.

To run the integration tests, you need to provide credentials to the integration test framework.
The integration test framework will skip integration tests for any service that does not have credentials,

To provide credentials for the integration tests, copy `test/resources/.config.properties` to `test/resources/auth.js`
and fill in credentials for the service(s) you wish to test.

To run the tests in a specific test class, use the `-Dtest` flag when invoking `mvn test`, e.g.:

```
mvn -Dtest=SdkCommonTest test
```

You can run a specific test by adding the name of the test method, e.g.:

```
mvn -Dtest=SdkCommonTest#testGetSdkHeaders test
```

# Code Coverage

This repo uses [Jacoco][jacoco] to measure code coverage. To obtain a code coverage report, run `mvn clean verify`
from the root of the project, and then view the coverage report in the `modules/coverage-report/target` directory:
```
open modules/coverage-reports/target/site/jacoco-aggregate/index.html
```

[jacoco]: https://www.eclemma.org/jacoco/

# Generating Javadocs

To generate the Javadocs for the project, run `mvn site` and then view the docs in the `target/site/apidocs` directory:
```
open target/site/apidocs/index.html
```

# Additional Resources

+ [Maven Getting Started](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
+ [General GitHub documentation](https://help.github.com/)
+ [GitHub pull request documentation](https://help.github.com/send-pull-requests/)


# Developer's Certificate of Origin 1.1

By making a contribution to this project, I certify that:

(a) The contribution was created in whole or in part by me and I
   have the right to submit it under the open source license
   indicated in the file; or

(b) The contribution is based upon previous work that, to the best
   of my knowledge, is covered under an appropriate open source
   license and I have the right under that license to submit that
   work with modifications, whether created in whole or in part
   by me, under the same open source license (unless I am
   permitted to submit under a different license), as indicated
   in the file; or

(c) The contribution was provided directly to me by some other
   person who certified (a), (b) or (c) and I have not modified
   it.

(d) I understand and agree that this project and the contribution
   are public and that a record of the contribution (including all
   personal information I submit with it, including my sign-off) is
   maintained indefinitely and may be redistributed consistent with
   this project or the open source license(s) involved.
