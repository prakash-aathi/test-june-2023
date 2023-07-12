# test-june-2023
The intern Assignment :

This repository contains my Spring Boot project, which demonstrates the usage of test cases with TestContainers and Spring Boot startup with GraalVM.

## Test Cases with TestContainers

The project utilizes TestContainers to run integration tests with Docker containers. TestContainers provides a convenient way to spin up and manage containers for testing purposes. In this project, we have included a sample test case that demonstrates how to use TestContainers with Spring Boot.

To run the test cases, follow these steps:

1. Clone the repository: `git clone https://github.com/prakash-aathi/test-june-2023.git`
2. Navigate to the project directory: `cd test`
3. Build the project: `mvn clean install`
4. Run the test cases: `mvn test`

Make sure you have Docker installed and running on your machine before executing the test cases.

## Spring Boot Startup with GraalVM

In addition to the test cases, this project also showcases Spring Boot startup with GraalVM. GraalVM is a high-performance runtime that provides ahead-of-time compilation for Java applications, resulting in faster startup times and lower memory footprint.

To build and run the project with GraalVM, follow these steps:

1. Clone the repository: `git clone https://github.com/prakash-aathi/test-june-2023.git`
2. Navigate to the project directory: `cd grallvm-final`
3. Build the project: `mvn -Pnative spring-boot:build-image`
4. Run the executable image `docker run --rm -p 8080:8080 grallvm-final:0.0.1-SNAPSHOT`



