# HBV202G Final Project
A project from HBV201G, reconfigured for the purposes of streamlining, readability of code as well as testing of methods. 
The project provides the user with a calculator, which they can use to make simple arithmetic calculations.
The tests use JUnit4 and the project incorporates the observer patterns by using handlers in the controller class to observe
user input.

This project is a Maven project, i.e. it uses the standard Maven project structure. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java packages vidmot.hi and vinnsla.hi, but in the usual separate Maven src directories:
- `src/main/java`:
  - `vidmot.hi`: Here we have the implementation of the user interface, this includes an Application class as well as a Controller class.
  - `vinnsla.hi`: Here we have the business classes which handle the calculations that need to be used in the Controller class.
- `src/test/java`: (The package contains an `Alltests` class that collects all the test cases for the package in one test suite)
  - `vinnsla.hi`: Test cases testing the methods of the Calculator class.

Maven:
- `mvn clean` cleans all implementation classes.
- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, `Tests`, or `TestCase`).
- `mvn assembly:single` creates a fat jar file containing the compiled classes.
- `mvn exec:java` runs CalculatorApplication

[UML Class Diagram](src/site/markdown/documentation.md)

[License](LICENSE.md)