# Mutation testing demo

Here is some amazing code with 100% unit test coverage.
Surely it must be perfect, right?

The code and unit tests are written in Kotlin, with gradle as the build tool.
The following command will run the unit tests and generate a coverage report in HTML: 

    ./gradlew build

The coverage report can be found at `build/reports/jacoco/test/html/pit.demo/index.html`

## Mutation testing with PIT
PIT (http://pitest.org/) is a mutation testing tool for the JVM.

>Mutation testing is conceptually quite simple.
>
>Faults (or mutations) are automatically seeded into your code, then your tests are run. If your tests fail then the mutation is killed, if your tests pass then the mutation lived.
>
>The quality of your tests can be gauged from the percentage of mutations killed.

You can run PIT using the following command:

    ./gradlew pitest

This will output an HTML report to `build/reports/pitest/pit.demo/index.html`

Now fix the tests to kill the mutants, and fix the implementation to pass any failing tests.
