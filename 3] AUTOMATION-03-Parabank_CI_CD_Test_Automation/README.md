# Parabank_CI_CD_Test_Automation

## 📌 Project Overview

This project demonstrates the implementation of an Automation Testing Framework for the Parabank Banking Application using Selenium WebDriver, Java, TestNG, Maven, and GitHub Actions.

The framework automates key banking functionalities and executes test cases automatically through a CI/CD pipeline.

---

## 🛠️ Technologies Used

* Java 21
* Selenium WebDriver
* TestNG
* Maven
* Apache POI
* Git & GitHub
* GitHub Actions

---

## 🌐 Application Under Test

Parabank Demo Application

URL: https://parabank.parasoft.com/parabank/index.htm

---

## 📂 Automated Modules

* Login Module
* Account Overview Module
* Transfer Funds Module
* Bill Pay Module

---

## 🚀 CI/CD Integration

GitHub Actions is configured to:

* Build the project automatically
* Execute Selenium TestNG test cases
* Generate execution reports
* Upload test artifacts

Workflow File:

.github/workflows/selenium-ci.yml

---

## ▶️ Run Project

Execute the following command:

mvn clean test

---

Test scenarios  Covered:

1.Login Module
2.Account Overview Module
3.Transfer Funds Module
4.Bill Pay Module
5.Registration Module
6. Open New Account Module
7.Find Transactions Module
8.Request Loan Module
9.Update Contact Information

---


## Project Structure

```text
AUTOMATION-03-Parabank_CI_CD_Test_Automation
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
├── 08_CI_CD_Pipeline
│
├── 09_Test_Case_Execution
│
├── 10_Test_Execution
│
├── 11_Bug_Report
│
├── 12_Screenshots
│
├── 13_Build_Deployment
│
├── 14_Test_Closure_Report
│
├── 15_Automation_Framework_Structure
│   │
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   ├── base
│   │   │   │   │   ├── BaseTest.java
│   │   │   │   │   └── DriverFactory.java
│   │   │   │   │
│   │   │   │   ├── listeners
│   │   │   │   │   └── TestListener.java
│   │   │   │   │
│   │   │   │   └── utils
│   │   │   │       ├── ConfigReader.java
│   │   │   │       ├── ExcelReader.java
│   │   │   │       ├── ExtentManager.java
│   │   │   │       └── ScreenshotUtil.java
│   │   │   │
│   │   │   └── resources
│   │   │       └── chromedriver.exe
│   │   │
│   │   └── test
│   │       ├── java
│   │       │   ├── pages
│   │       │   │   ├── AccountPage.java
│   │       │   │   ├── BillPage.java
│   │       │   │   ├── HomePage.java
│   │       │   │   ├── LoginPage.java
│   │       │   │   └── TransferPage.java
│   │       │   │
│   │       │   ├── testdata
│   │       │   │   └── TestData.java
│   │       │   │
│   │       │   └── tests
│   │       │       ├── AccountTest.java
│   │       │       ├── BillPayTest.java
│   │       │       ├── LoginTest.java
│   │       │       └── TransferFundsTest.java
│   │       │
│   │       └── resources
│   │           ├── BillPayData.xlsx
│   │           ├── config.properties
│   │           ├── LoginData.xlsx
│   │           └── TransferFundsData.xlsx
│
├── 16_Run_Report
│
├── pom.xml
└── testng.xml
```



## 📊 Reports

Generated Reports:

* test-output/index.html
* test-output/emailable-report.html
* testng-results.xml

---

## ✅ Project Status

CI/CD Pipeline Successfully Implemented using GitHub Actions.

---
# Conclusion

The Parabank CI/CD Test Automation project was successfully completed by designing and implementing a robust automation framework integrated with a Continuous Integration and Continuous Deployment (CI/CD) pipeline. The project focused on automating critical banking functionalities such as Login, Account Management, Bill Payment, and Fund Transfer using Selenium WebDriver, Java, TestNG, Maven, and the Page Object Model (POM) design pattern.

A structured testing methodology was followed, including requirement analysis, test planning, test case design, execution, defect tracking, reporting, and CI/CD pipeline implementation. Data-driven testing techniques were utilized through Excel-based test data management, enabling efficient execution of multiple test scenarios and improving test coverage.

The automation framework was built using reusable components such as Base Classes, Page Objects, Utility Classes, Test Listeners, Configuration Management, and Reporting Utilities. Comprehensive execution reports, screenshots, logs, and test evidence were generated to provide complete visibility into test execution results.

The CI/CD pipeline automated the build, test execution, and reporting process, ensuring faster feedback, improved software quality, and reduced manual intervention. Integration with Jenkins enabled scheduled and continuous test execution, supporting rapid delivery and early defect detection.

Overall, this project provided practical experience in Selenium Automation Testing, Data-Driven Testing, Page Object Model implementation, Jenkins CI/CD integration, TestNG reporting, and framework development. It demonstrates the ability to build scalable test automation solutions that improve testing efficiency, maintainability, reliability, and software quality throughout the software development lifecycle.
