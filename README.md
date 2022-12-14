# TPA Stream Java Library

[![Maven Central](https://img.shields.io/nexus/r/io.github.fern-api/tpastream?server=https%3A%2F%2Fs01.oss.sonatype.org)](https://s01.oss.sonatype.org/content/repositories/releases/io/github/fern-api/tpastream/)

## Documentation

API documentation is available at <https://developers.tpastream.com/en/latest/index.html>.

## Installation

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "io.github.fern-api:tpastream:0.0.16"
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.github.fern-api</groupId>
  <artifactId>tpastream</artifactId>
  <version>0.0.16</version>
</dependency>
```

## Usage

```java
BasicAuth auth = BasicAuth.of(username, password);

TpaStreamApiClient tpastreamApiClient = 
        new TpaStreamApiClient("https://app.tpastream.com/api/", auth);

try {
    Claim claim = tpastreamApiClient.claims().getClaim(GetClaim.Request.builder()
        .claimMedicalId(01234)
        .build());
    System.out.println("Successfully fetched claim with id" + claim.getId());
} catch (GetClaimException e) {
    System.out.println("Encountered error while fetching claim" + e.getMessage());
}
```

## Sample app

Check out the [sample app](sample-app/src/main/java/sample/App.java) which consumes this SDK!

## Beta status

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning the package version to a specific version in your build.gradle file. This way, you can install the same version each time without breaking changes unless you are intentionally looking for the latest version.

## Questions or feedback?

Feel free to [leave an issue](https://github.com/fern-tpastream/tpastream-java) on this repo.
