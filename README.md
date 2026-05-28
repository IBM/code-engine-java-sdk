[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

# IBM Cloud Code Engine Java SDK Version 6.0.2

Java client library to interact with the [Code Engine API](https://cloud.ibm.com/apidocs/codeengine).

## Table of Contents

<!--
  The TOC below is generated using the `markdown-toc` node package.

      https://github.com/jonschlinkert/markdown-toc

  You should regenerate the TOC after making changes to this file.

      npx markdown-toc --maxdepth 4 -i README.md
  -->

<!-- toc -->

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
  * [Maven](#maven)
  * [Gradle](#gradle)
- [Using the SDK](#using-the-sdk)
- [Breaking Changes (April 2026)](#breaking-changes-april-2026)
- [Breaking Changes (March 2026)](#breaking-changes-march-2026)
- [Questions](#questions)
- [Issues](#issues)
- [Open source @ IBM](#open-source--ibm)
- [Contributing](#contributing)
- [License](#license)

<!-- tocstop -->

## Overview

The IBM Cloud Code Engine Java SDK allows developers to programmatically interact with the following IBM Cloud services:

Service Name | Artifact Coordinates
--- | ---
[Code Engine](https://cloud.ibm.com/apidocs/codeengine/codeengine-v2.0.0) | com.ibm.cloud.code-engine:6.0.2

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

- An [IBM Cloud][ibm-cloud-onboarding] account.
- An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
- Java 8 or above.

## Installation

The current version of this SDK is: 6.0.2

Each service's artifact coordinates are listed in the table above.

The project artifacts are published on the public [Maven Central](https://repo1.maven.org/maven2/)
artifact repository.  This is the default public repository used by maven when searching for dependencies.
To use this repository within a gradle build, please see
[this link](https://docs.gradle.org/current/userguide/declaring_repositories.html).

To use a particular service, define a dependency that contains the
artifact coordinates (group id, artifact id and version) for the service.
Here are examples for maven and gradle:

### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>code-engine</artifactId>
    <version>6.0.2</version>
</dependency>
```

### Gradle

```gradle
compile 'com.ibm.cloud:code-engine:6.0.2'
```

## Using the SDK

Examples and a demo are available in the [module examples](/modules/examples) folder.

For general SDK usage information, please see [this link](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md)

## Breaking Changes (April 2026)

As part of the introduction of `persistent_data_stores` as a Volume Mount type for **apps** and **jobs**, the optional `name` property of entries in `run_volume_mounts` is no longer supported.

If you used the optional `name` property, remove it from the prototype of the **app** or **job**.

## Breaking Changes (March 2026)

- **Method renames (pluralization) in `CodeEngine` service**
    Update list calls and their option types:

    ```java
    // before
    ServiceCall<AllowedOutboundDestinationList> call = codeEngine.listAllowedOutboundDestination(new ListAllowedOutboundDestinationOptions.Builder(projectId).build());

    // after
    ServiceCall<AllowedOutboundDestinationList> call = codeEngine.listAllowedOutboundDestinations(new ListAllowedOutboundDestinationsOptions.Builder(projectId).build());
    ```

    ```java
    // before
    ServiceCall<PersistentDataStoreList> call = codeEngine.listPersistentDataStore(new ListPersistentDataStoreOptions.Builder(projectId).build());

    // after
    ServiceCall<PersistentDataStoreList> call = codeEngine.listPersistentDataStores(new ListPersistentDataStoresOptions.Builder(projectId).build());
    ```

- **Options classes renamed**
    Replace imports and usage:

    ```java
    // before
    import com.ibm.cloud.code_engine.code_engine.v2.model.ListAllowedOutboundDestinationOptions;
    ListAllowedOutboundDestinationOptions opts =
        new ListAllowedOutboundDestinationOptions.Builder(projectId)
            .limit(100)
            .start("token")
            .build();

    // after
    import com.ibm.cloud.code_engine.code_engine.v2.model.ListAllowedOutboundDestinationsOptions;
    ListAllowedOutboundDestinationsOptions opts =
        new ListAllowedOutboundDestinationsOptions.Builder(projectId)
            .limit(100)
            .start("token")
            .build();
    ```

    ```java
    // before
    import com.ibm.cloud.code_engine.code_engine.v2.model.ListPersistentDataStoreOptions;
    ListPersistentDataStoreOptions opts =
        new ListPersistentDataStoreOptions.Builder(projectId)
            .limit(100)
            .start("token")
            .build();

    // after
    import com.ibm.cloud.code_engine.code_engine.v2.model.ListPersistentDataStoresOptions;
    ListPersistentDataStoresOptions opts =
        new ListPersistentDataStoresOptions.Builder(projectId)
            .limit(100)
            .start("token")
            .build();
    ```

- **Pager classes renamed**
    Switch to the new pager types and constructors:

    ```java
    // before
    import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationPager;
    AllowedOutboundDestinationPager pager = new AllowedOutboundDestinationPager(codeEngine, oldOpts);

    // after
    import com.ibm.cloud.code_engine.code_engine.v2.model.AllowedOutboundDestinationsPager;
    AllowedOutboundDestinationsPager pager = new AllowedOutboundDestinationsPager(codeEngine, newOpts);
    ```

    ```java
    // before
    import com.ibm.cloud.code_engine.code_engine.v2.model.PersistentDataStorePager;
    PersistentDataStorePager pager = new PersistentDataStorePager(codeEngine, oldOpts);

    // after
    import com.ibm.cloud.code_engine.code_engine.v2.model.PersistentDataStoresPager;
    PersistentDataStoresPager pager = new PersistentDataStoresPager(codeEngine, newOpts);
    ```

- **Builder parameter order changed for CIDR prototype**
    `AllowedOutboundDestinationPrototypeCidrBlockDataPrototype.Builder` required-args constructor signature changed:

    ```java
    // before: Builder(String type, String cidrBlock, String name)
    var proto = new AllowedOutboundDestinationPrototypeCidrBlockDataPrototype.Builder(
        "cidr_block", "10.0.0.0/24", "allow-egress"
    ).build();

    // after: Builder(String type, String name, String cidrBlock)
    var proto = new AllowedOutboundDestinationPrototypeCidrBlockDataPrototype.Builder(
        "cidr_block", "allow-egress", "10.0.0.0/24"
    ).build();
    ```

    > Also note: `name` is now treated as required at the base prototype level and is explicitly present on the CIDR builder.

- **Patch model changes (remove `type`, new patch for Private Path)**
    Do **not** set `type` in patch payloads; the field and its builder setter were removed from CIDR patch:

    ```java
    // CIDR patch
    var patch = new AllowedOutboundDestinationPatchCidrBlockDataPatch.Builder()
        .cidrBlock("10.0.1.0/24")
        .build();
    ```

    New patch class for Private Path properties:

    ```java
    var ppPatch = new AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch.Builder()
        .isolationPolicy(AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch.IsolationPolicy.DEDICATED)
        .build();
    ```

- **New prototype to create Private Path destinations**
    Use the new prototype when creating an allowed outbound destination that connects to a VPC Private Path service:

    ```java
    var ppProto =
        new AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.Builder(
            AllowedOutboundDestinationPrototype.Type.PRIVATE_PATH_SERVICE_GATEWAY,
            "pps-to-service-x",
            "<private-path-service-gateway-crn>"
        )
        .isolationPolicy(AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.IsolationPolicy.SHARED)
        .build();
    ```

    > Ensure your code handles both types: `"cidr_block"` and `"private_path_service_gateway"`.

- **Model/enums additions affecting branching/validation**
    If your client code switches on type/status/isolation policy strings, update cases to include the new values:

    ```java
    // AllowedOutboundDestination.Type
    CIDR_BLOCK
    PRIVATE_PATH_SERVICE_GATEWAY

    // AllowedOutboundDestination.Status
    READY
    FAILED
    DEPLOYING

    // AllowedOutboundDestination.IsolationPolicy
    SHARED
    DEDICATED
    ```

    New fields were added to `AllowedOutboundDestination`:

  - `name`
  - `status`
  - `statusDetails` (with types `AllowedOutboundStatusDetails`, `AllowedOutboundStatusDetailsPrivatePathServiceGatewayStatusDetails`)
  - `privatePathServiceGatewayCrn`
  - `isolationPolicy`

    And new helper models:

  - `EndpointGatewayDetails`
  - `PrivatePathServiceGatewayDetails`

- **Examples updated (if you copy/paste from `CodeEngineExamples`)**
  - Method usage and region tags renamed:
    - `listAllowedOutboundDestination` → `listAllowedOutboundDestinations` (and `begin/end` tags)
    - `listPersistentDataStore` → `listPersistentDataStores` (and `begin/end` tags)
  - Pager classes updated to plural forms.
  - CIDR prototype builder now sets `.name(..)` before `.cidrBlock(..)` and matches the new constructor order.

> **Action checklist:**
>
> - [ ] Rename service methods: `listAllowedOutboundDestinations`, `listPersistentDataStores`.
> - [ ] Replace options classes and imports with pluralized names.
> - [ ] Replace pager classes with pluralized versions and update example region tags if referenced.
> - [ ] Adjust CIDR prototype builder constructor order to `(type, name, cidrBlock)`.
> - [ ] Remove any `type` usage from patch builders; use CIDR or Private Path patch models as appropriate.
> - [ ] Use the new Private Path prototype for creating Private Path destinations; add handling for new enums (`PRIVATE_PATH_SERVICE_GATEWAY`, status, isolation policy).

## Questions

If you are having difficulties using this SDK or have a question about the IBM Cloud services,
please ask a question at
[Stack Overflow](http://stackoverflow.com/questions/ask?tags=ibm-cloud).

## Issues

If you encounter an issue with the project, you are welcome to submit a
[bug report](https://github.com/IBM/code-engine-java-sdk/issues).
Before that, please search for similar issues. It's possible that someone has already reported the problem.

## Open source @ IBM

Find more open source projects on the [IBM Github Page](http://ibm.github.io/)

## Contributing

See [CONTRIBUTING](CONTRIBUTING.md).

## License

The IBM Cloud Code Engine Java SDK is released under the Apache 2.0 license.
The license's full text can be found in [LICENSE](LICENSE).
