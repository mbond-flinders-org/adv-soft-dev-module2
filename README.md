# Intro to Unit Testing - Module 2 activity

A tiny Maven project with JUnit already set up. You don't need to install anything extra - IntelliJ downloads JUnit for you the first time you open the project.

## What's in here

```
src/main/java/module2/    <- the code being tested
    Calculator.java          (from the lecture - no bugs)
    GradeCalculator.java     (has TWO bugs)
src/test/java/module2/    <- the tests
    CalculatorTest.java
    GradeCalculatorTest.java
```

Each test class sits in the same package as the class it tests, but under `src/test` instead of `src/main`.

## Activity

1. **Clone** this repository and open the folder in IntelliJ (File > Open, pick the folder with `pom.xml`). If IntelliJ asks, choose *Trust Project* and let it load Maven.
2. **Run the Calculator tests.** Open `CalculatorTest.java` and click the green arrow next to `class CalculatorTest`. All 3 should pass (green).
3. **Run all the tests.** Right-click the `src/test/java` folder and choose *Run 'All Tests'*. Two tests in `GradeCalculatorTest` will fail (red).
4. **Read each failure.** Click a failed test in the Run window and look for:
   - the **expected** and **actual** values
   - the line number in the stack trace that points to the failing assertion
5. **Fix `GradeCalculator.java`.** Don't touch the test file - the tests describe the correct behaviour. Re-run the failed tests until everything is green.
6. **Commit and push** your fix with a meaningful commit message, e.g. `Fix HD boundary and reject marks over 100`.

## Stretch

Add one test of your own to `GradeCalculatorTest` (for example, check that 100 is an HD, or that 64 is a P). Run it, then commit it.
