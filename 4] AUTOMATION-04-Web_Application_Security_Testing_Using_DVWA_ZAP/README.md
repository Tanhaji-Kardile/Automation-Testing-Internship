Web-Application-Security-Testing-DVWA-ZAP

## Project Overview

This project demonstrates automated web application security testing using Selenium WebDriver, TestNG, OWASP ZAP, Maven, and Java 21.

The project is developed against DVWA (Damn Vulnerable Web Application), a deliberately vulnerable application designed for learning and testing security vulnerabilities.

The framework automates:

* Login Validation
* SQL Injection Testing
* Cross Site Scripting (XSS) Testing
* OWASP ZAP Spider Scan
* OWASP ZAP Active Scan
* Security Vulnerability Reporting

---

## Project Objective

The primary objective of this project is to automate security testing activities and identify common web application vulnerabilities using industry-standard tools.

The project validates:

* Authentication functionality
* SQL Injection vulnerabilities
* Cross Site Scripting vulnerabilities
* Security weaknesses identified by OWASP ZAP
* Automated vulnerability scanning and reporting

---

## Technologies Used

| Technology         | Version |
| ------------------ | ------- |
| Java               | 21      |
| Selenium WebDriver | Latest  |
| TestNG             | 7.x     |
| Maven              | Latest  |
| OWASP ZAP          | Latest  |
| Chrome Browser     | Latest  |
| XAMPP              | Latest  |
| MySQL              | Latest  |
| DVWA               | Latest  |

---

## Security Vulnerabilities Covered

### SQL Injection

Automated execution of multiple SQL Injection payloads against DVWA SQL Injection module.

Sample Payloads:

* 1
* 1' OR '1'='1
* 1' OR 1=1#
* ' OR 'a'='a
* UNION SELECT attacks

---

### Cross Site Scripting (XSS)

Automated execution of XSS payloads against DVWA Reflected XSS module.

Sample Payloads:

* alert('XSS')
* SVG Injection
* Body OnLoad Injection
* Image OnError Injection

---

### OWASP ZAP Security Scanning

The framework integrates OWASP ZAP API for:

* Spider Scan
* Active Scan
* Vulnerability Detection
* Security Assessment

---

## Framework Design Pattern

This framework follows:

* Page Object Model (POM)
* Maven Project Structure
* TestNG Framework
* Utility Driven Architecture

---
## Test scenarios  Covered:

1.Login Module
2.SQL Injection Module
3.XSS Module
4.OWASP ZAP Module
5.Reporting Module
---

## Project Structure

```text
AUTOMATION-04-Web_Application_Security_Testing_Using_DVWA_ZAP
│
├── 01_Project_Introduction
│
├── 02_Review_&_Analyze_Requirement
│
├── 03_Prepare_Test_Plan
│
├── 04_Create_Test_Scenarios
│
├── 05_Create_Test_Cases
│
├── 06_RTM
│
├── 07_Test_Cases_Execution
│
├── 08_Bug_Report
│
├── 09_Test_Environment_Setup
│
├── 10_Test_Execution
│
├── 11_Screenshots
│
├── 12_Build_Deployment
│
├── 13_Test_Closure_Phase
│
├── 14_Security_Report
│
├── 15_Mitigation_Strategies
│
├── 16_Automation_Framework
│   │
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   ├── base
│   │   │   │   │   └── BaseTest.java
│   │   │   │   │
│   │   │   │   ├── pages
│   │   │   │   │   ├── LoginPage.java
│   │   │   │   │   ├── SQLInjectionPage.java
│   │   │   │   │   └── XSSPage.java
│   │   │   │   │
│   │   │   │   ├── testdata
│   │   │   │   │   └── TestData.java
│   │   │   │   │
│   │   │   │   └── utilities
│   │   │   │       ├── ConfigReader.java
│   │   │   │       ├── DriverFactory.java
│   │   │   │       ├── ExtentListener.java
│   │   │   │       ├── ExtentManager.java
│   │   │   │       ├── ScreenshotUtil.java
│   │   │   │       └── ZAPUtility.java
│   │   │   │
│   │   │   └── resources
│   │   │       └── chromedriver.exe
│   │   │
│   │   └── test
│   │       ├── java
│   │       │   └── tests
│   │       │       ├── LoginTest.java
│   │       │       ├── SecurityScanTest.java
│   │       │       ├── SQLInjectionTest.java
│   │       │       └── XSSTest.java
│   │       │
│   │       └── resources
│   │           └── config.properties
│
├── 17_Run_Report
│
├── pom.xml
└── testng.xml
```

---

## Prerequisites

Before executing the project, ensure the following are installed:

1. Java 21
2. Eclipse IDE
3. Maven
4. Chrome Browser
5. XAMPP
6. DVWA
7. OWASP ZAP

---

## Environment Setup

### Start XAMPP

Start:

* Apache
* MySQL

### Launch DVWA

Open:

http://localhost/DVWA

Login Credentials:

Username: admin

Password: password

### Set Security Level

Navigate to:

DVWA Security

Select:

Low

Click:

Submit

---

## Execute Test Suite

Run all tests using:

testng.xml

Or execute:

mvn clean test

---

## Reports Generated

### TestNG Report

Generated under:

test-output/index.html

---

### Extent Report

Generated under:

Reports/ExtentReport.html

---

### ZAP Security Report

Generated under:

Reports/ZAPReport.html

---

## Expected Deliverables

* Automated Login Testing
* Automated SQL Injection Testing
* Automated XSS Testing
* Automated OWASP ZAP Security Scanning
* TestNG Reports
* Extent Reports
* ZAP Reports
* Vulnerability Assessment Report

---

## Security Findings

The project identifies:

* SQL Injection Vulnerabilities
* Cross Site Scripting Vulnerabilities
* Missing Security Headers
* Information Disclosure Issues
* Additional OWASP ZAP Findings

---

# Conclusion

The Web Application Security Testing Using DVWA and OWASP ZAP project was successfully completed by implementing an automated security testing framework to identify, analyze, and report web application vulnerabilities. The project focused on validating application security through Authentication Testing, SQL Injection Testing, Cross-Site Scripting (XSS) Testing, and automated vulnerability scanning using OWASP ZAP.

A structured security testing process was followed, including requirement analysis, test planning, test case design, execution, defect reporting, security assessment, and mitigation documentation. The project combined Selenium WebDriver, Java, TestNG, Maven, and OWASP ZAP to automate security validation and vulnerability detection activities.

The automation framework was designed using reusable components such as Base Classes, Page Objects, Utility Classes, Configuration Management, Reporting Utilities, and OWASP ZAP integration. Automated security scans were executed to identify potential weaknesses and validate application security controls. Detailed execution reports, screenshots, security findings, and vulnerability reports were generated to support analysis and decision-making.

Security testing results highlighted common web application vulnerabilities and demonstrated the effectiveness of automated security testing in detecting security risks early in the software development lifecycle. Appropriate mitigation strategies and remediation recommendations were documented to improve the overall security posture of the application.

Overall, this project provided practical experience in Security Testing Automation, Selenium WebDriver, OWASP ZAP Integration, Vulnerability Assessment, Secure Testing Practices, and Automated Security Reporting. It demonstrates the ability to design and implement scalable security testing frameworks that help improve application security, reliability, and compliance with OWASP security standards.

