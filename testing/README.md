# Testing utils

Common python code used for integration testing of services in this repository. By convention the libraries in this directory tend to start with `sdk_`, making them a little easier to identify in individual tests.

Each service has its own tests which use these common utilities. For example, see the [hello-world service tests](https://github.com/mesosphere/dcos-commons/tree/master/frameworks/helloworld/tests).
