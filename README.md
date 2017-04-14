# survey-options

[![Build Status](https://travis-ci.org/com.jessitron/survey-options.svg?branch=master)](https://travis-ci.org/com.jessitron/survey-options)
[![Slack Status](https://join.atomist.com/badge.svg)](https://join.atomist.com)

This project is a generator for a [Spring Boot][boot] [REST][rest] service as standard in the Satellite-of-love organization.

## Use

You can run this generator to get the code for a standard REST service, either from the Rug command line or from our organization's Slack team.

## Development

This project is driven using [Maven][mvn].  You will need to install
Maven locally to build, run, and test this project.

[mvn]: https://maven.apache.org/

### Run locally

You can run the service locally using the following from the command:

```
$ mvn spring-boot:run
```

### Run tests

This service comes with some rudimentary tests as a good starting
point for writing your own.  Use the following command to execute the
tests using Maven:

```
$ mvn test
```

---
Created by [Atomist][atomist].
Need Help?  [Join our Slack team][slack].

[atomist]: https://www.atomist.com/
[slack]: https://join.atomist.com/
 
