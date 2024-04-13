# JSONPlaceholder Test Automation

This project contains automated test cases for the JSONPlaceholder API, which is a fake online REST API for testing and prototyping.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them:

- Java Development Kit (JDK)
- Maven
- Any IDE that supports Java (e.g., IntelliJ IDEA, Eclipse)

### Setup

A step by step series of examples that tell you how to get a development environment running:

1. Open the project in your IDE.
2. Install the dependencies by running `mvn install`.

## Running the tests

Explain how to run the automated tests for this system:

- To run all the tests, use the command `mvn clean test`.
- To run individual tests, use your IDE's test runner and select the desired test case.

## Test Cases

- `testGettingAllPosts`: Verifies that all posts can be retrieved from the `/posts` endpoint and that the response status code is 200.
- `testAddingNewPost`: Validates that a new post can be added using the `/posts` endpoint and that the response status code is 201.

## Built With

- RestAssured - Java DSL for easy testing of REST services
- TestNG - Testing framework

## Authors

- Islam Hassan

