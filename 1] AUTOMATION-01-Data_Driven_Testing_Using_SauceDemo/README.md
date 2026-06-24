Data_Driven_Testing_Using_SauceDemo

## Project Overview

This project demonstrates Data-Driven Testing using Selenium WebDriver and TestNG. Test data is maintained in external CSV files, allowing the same test script to execute multiple test scenarios with different input combinations.

---

## Project Objective

* Implement Data-Driven Testing using Selenium
* Read test data from CSV files
* Execute tests with multiple input datasets
* Validate application behavior for different test conditions
* Generate execution reports and logs

---

## Application Under Test

**Application:** SauceDemo

**Testing Type:** Functional Automation Testing

**Framework:** Selenium WebDriver with TestNG

---

## Tools and Technologies

* Java
* Selenium WebDriver
* TestNG
* Maven
* CSV File Handling
* Extent Reports
* GitHub

---

## Framework Features

* Data-Driven Testing
* Page Object Model (POM)
* Reusable Utility Classes
* External Test Data Management
* TestNG Reporting
* Extent Reporting
* Automated Execution

---

## Test Data Source

Test data is stored in CSV files and includes:

* Valid Login Credentials
* Invalid Login Credentials
* Boundary Test Data
* Negative Test Data

---

## Test Scenarios Covered

1.Positive Test Scenarios(Login Module)
2.Negative Test Scenarios(Login Module)
3.User interface (UI) Test Scenarios
4.Functional Test Scenarios
5.Functional Test Scenarios
6.Data Driven Testing Scenarios


---

## Execution Process

1. Read test data from CSV file
2. Launch browser
3. Navigate to SauceDemo application
4. Execute login functionality
5. Validate expected results
6. Capture execution status
7. Generate reports

---

## Reports Generated

### TestNG Reports

* index.html
* emailable-report.html

### Extent Reports

* Detailed execution report
* Pass/Fail status
* Screenshots for failures

---

## Deliverables

* Selenium Automation Framework
* CSV Test Data Files
* Test Cases
* RTM
* Execution Logs
* Screenshots
* TestNG Reports
* Extent Reports
* Test Closure Report

---
## Project Structure

```text
AUTOMATION-01-Data_Driven_Testing_Using_SauceDemo
│
├── 01_Project_Introduction
│
├── 02_Review_&_Analyze_Requirements
│
├── 03_Prepare_Test_Plan
│
├── 04_Create_Test_Scenarios
│
├── 05_Create_Test_Cases
│
├── 06_RTM
│
├── 07_Test_Environment_Setup
│
├── 08_Test_Data
│
├── 09_TestCase_Execution
│
├── 10_Bug_Reporting_&_Tracking
│
├── 11_Screenshots
│
├── 12_Logs
│
├── 13_Build_Deployment
│
├── 14_Test_Closure_Phase
│
├── 15_Automation_Framework_Structure
│   │
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   ├── pages
│   │   │   │   │   └── LoginPage.java
│   │   │   │   │
│   │   │   │   └── utilities
│   │   │   │       ├── ConfigReader.java
│   │   │   │       ├── CSVReaderUtil.java
│   │   │   │       ├── ExtentManager.java
│   │   │   │       └── ScreenshotUtil.java
│   │   │   │
│   │   │   └── resources
│   │   │       └── chromedriver.exe
│   │   │
│   │   └── test
│   │       ├── java
│   │       │   ├── base
│   │       │   │   └── BaseClass.java
│   │       │   │
│   │       │   ├── tests
│   │       │   │   └── LoginTest.java
│   │       │   │
│   │       │   └── utilities
│   │       │       └── ExtentTestListener.java
│   │       │
│   │       └── resources
│   │           ├── config.properties
│   │           └── LoginData.csv
│
├── 16_Run_Report
│
├── pom.xml
└── testng.xml
```
---

## Conclusion

The Data-Driven Testing Using SauceDemo project was successfully completed by implementing a robust Selenium automation framework using Java, TestNG, Maven, and the Page Object Model (POM) design pattern. The project focused on validating the login functionality of the SauceDemo application using multiple test data sets stored in external CSV files.

A structured testing process was followed, including requirement analysis, test planning, test case design, test data preparation, execution, defect tracking, and reporting. Data-driven testing techniques enabled the execution of the same test scenario with multiple input combinations, improving test coverage and reducing manual effort.

The automation framework was designed with reusable components such as page classes, utility classes, configuration management, screenshot capture, reporting utilities, and test listeners. External test data was managed through CSV files, making the framework scalable, maintainable, and easy to update.

Comprehensive execution reports, logs, and screenshots were generated to provide clear visibility into test results and application behavior. The framework successfully validated application functionality while demonstrating best practices in automation testing, framework design, and test data management.

Overall, this project provided practical experience in Selenium WebDriver, TestNG, Maven, Data-Driven Testing, Page Object Model implementation, reporting, and automation framework development. It highlights the importance of automation in improving testing efficiency, accuracy, maintainability, and software quality.
