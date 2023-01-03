# Framework of automated tests with JUnit, Java, and Maven

[![Build](https://github.com/rafaabc/junit/actions/workflows/sonar.yml/badge.svg)](https://github.com/rafaabc/junit/actions/workflows/sonar.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=rafaabc_junit&metric=alert_status)](https://sonarcloud.io/dashboard?id=rafaabc_junit)

<p align="justify"> Framework to test in the unit layer.</p>

<p align="justify"> To practice this I built a class to calculate the Body Mass Index (BMI) and a test
class to test the methods of retrieving a result based on a size and a weight of a
person.</p>

<p align="justify"> I used a data-driven approach to run the test class using a csv file
with different data and also a structure of Suites so I can run tests in an
optimized way. There are 3 Suites of tests basically. One with Positive scenarios
and another with Smoke tests with the most important ones. A third Suite runs all test classes as long as
I parameterize them. It is also possible to run the tests with CLI and the results we can
view with Allure Report.</p>

# Pre-conditions

Tools:
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
- [Java SE Development Kit 8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [Allure](http://allure.qatools.ru/)

Dependências:
- [JUnit](https://mvnrepository.com/artifact/junit/junit)

# Project Structure

```
./projet
├─ src/
    ├─ main
       └─ java/
          └─ bmi/
             └─ BMI
          └─ categories/
             ├─ Positives
             ├─ Smoke   
    └─ test/
       └─ java/
          └─ bmi/
             ├─ CalculateBMI_CSVTest
             ├─ CategorizedTestsTest
             ├─ Suite_AllTestsTest
             ├─ Suite_PositiveCatergoriesTest             
             └─ Suite_SmokeCatergoriesTest                
       └─ resources/
          └─ data.csv
```


- src: main dir
- main: dir with the base code
- java: default dir when the project is created
- bmi: package with base code classes
- BMI: class with the Body Mass Index logic
- categories: package with interfaces to support the Suite approach
- test: package with test classes
- java: default dir when the project is created
- bmi: package with test classes
- CalculateBMI_CSVTest: test class with the data-driven approach that consumes the csv file
- CategorizedTestsTest: test class with categorized methods that will support Suite classes based on categories
- Suite_AllTestsTest: test class to parameterize all classes you want to run easily with one click
- Suite_PositiveCatergoriesTest: test class to parameterize all methods categorized as Positives
- Suite_SmokeCatergoriesTest: test class to parameterize all methods categorized as Smoke
- resources: dir with csv file

# CLI
<p align="justify"> Run all test classes through command line: </p>

` mvn surfire:test`

<p align="justify"> As soon as the tests are executed, a folder will be created inside the "target" directory, called "surefire-reports". </p>

# Report
<p align="justify"> Open the Allure test report via command line: </p>

`allure serve /PATH`*

<p align="justify"> *The path must be changed to the path of the "surefire-reports" folder created in the previous step. </p>
