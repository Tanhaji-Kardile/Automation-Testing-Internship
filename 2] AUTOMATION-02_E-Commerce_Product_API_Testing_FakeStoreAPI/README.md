E-Commerce Product API Testing Using FakeStoreAPI

## Project Overview

This project focuses on API testing of the FakeStoreAPI using Postman and Newman. The objective is to validate API functionality, request-response behavior, product data retrieval, user operations, and response validation through automated API test execution.

---

## Project Objective

* Validate REST API endpoints
* Verify product-related operations
* Perform request and response validation
* Verify HTTP status codes
* Execute API tests using Postman Collection Runner
* Execute automated API tests using Newman CLI
* Generate execution reports

---

## Tools and Technologies

* Postman
* Newman
* FakeStoreAPI
* REST API
* JSON
* GitHub

---

## Scope of Testing

* Product Retrieval APIs
* Single Product Validation
* Product Category APIs
* User APIs
* Cart APIs
* Status Code Validation
* Response Body Validation
* Negative Test Scenarios

---
Api Endpoint  Covered:

## 1. Authentication

### POST - Login User

* Authenticate user with valid credentials
* Validate authentication response
* Verify token generation
* Verify response status code

---

## 2. Products

### GET - Get All Products

* Retrieve all available products
* Validate response data
* Verify response status code

### GET - Get Single Product

* Retrieve product details by ID
* Validate product information
* Verify response status code

### POST - Add New Product

* Create a new product
* Validate request payload
* Verify product creation response

### PUT - Update Product

* Update complete product information
* Validate updated response
* Verify response status code

### PATCH - Update Product

* Update partial product information
* Validate updated response
* Verify response status code

### DELETE - Delete Product

* Delete product by ID
* Validate successful deletion
* Verify response status code

---

## 3. Categories

### GET - Get All Categories

* Retrieve all product categories
* Validate category list
* Verify response status code

### GET - Get Products in Category

* Retrieve products for a specific category
* Validate category-wise product data
* Verify response status code

---

## 4. Cart

### GET - Get All Carts

* Retrieve all shopping carts
* Validate cart information
* Verify response status code

### GET - Get Single Cart

* Retrieve cart details by ID
* Validate cart data
* Verify response status code

### POST - Add to Cart

* Add products to cart
* Validate request payload
* Verify cart creation response

### PUT - Update Cart

* Update complete cart information
* Validate updated response
* Verify response status code

### PATCH - Update Cart

* Update partial cart information
* Validate updated response
* Verify response status code

### DELETE - Delete Cart

* Delete cart by ID
* Validate successful deletion
* Verify response status code

---

## 5. Users

### GET - Get All Users

* Retrieve all users
* Validate user information
* Verify response status code

### GET - Get Single User

* Retrieve user details by ID
* Validate user information
* Verify response status code

---

## Validation Performed

* Status Code Validation
* Response Body Validation
* Response Time Validation
* JSON Structure Validation
* Data Integrity Verification
* Negative Scenario Validation

---

## Collection Execution

### Postman Collection Runner

* Executed complete API collection
* Verified request execution status
* Validated API responses

### Newman Command Line Execution

Example:

```bash id="yq7p4f"
newman run E-Commerce_Product_API_Testing.postman_collection.json -e FakeStore_Environment.postman_environment.json
```

---

## Reports Generated

* Collection Runner Report
* Newman Execution Report
* Newman HTML Report
* Validation Results
* Execution Screenshots

---

## Deliverables

* Postman Collection
* Environment File
* Newman Report
* Newman HTML Report
* API Test Cases
* Test Results
* Screenshots
* Test Closure Report

---

## Project Structure
```text
AUTOMATION-02_E-Commerce_Product_API_Testing_FakeStoreAPI
│
├── 01_Project_Introduction
│   
│
├── 02_Project_Objective
│   
│
├── 03_Scope_of_Testing
│  
│
├── 04_Tools_and_Technologies_Used
│   
├── 05_Test_Environment_Setup
│   
│
├── 06_API_Endpoints_Tested
│   
│
├── 07_Test_Scenarios_and_Test_Cases
│  
│
├── 08_Postman_Collection_Structure
│   
├── 09_Request_and_Response_Validation
│   
│
├── 10_Collection_Runner_Execution
│  
│
├── 11_Newman_Command_Line_Execution
│   
│  
├── 12_Newman_HTML_Report_Generation
│   
│
├── 13_Test_Results_and_Observations
│   
│
├── 14_Screenshots
│   
├── 15_Challenges_Faced_and_Resolution
│   
│
├── 16_Conclusion
│   
│
├── 17_Deliverables
│  
├── 18_Test_Closure_Report
│   
│
├── 19_API_Testing_Framework_Structure
│  
│
├── 20_Run_Report
│   
├── E-Commerce_Product_API_Testing.postman_collection.json
├── FakeStore_Environment.postman_environment.json
│
├── .gitignore
│
└── README.md
```

---

## Conclusion

The E-Commerce Product API Testing project using FakeStoreAPI was successfully completed by designing and executing automated API test scenarios for Authentication, Products, Categories, Cart, and Users modules. The project focused on validating REST API functionality, request-response handling, data integrity, and endpoint behavior using industry-standard API testing practices.

A comprehensive testing approach was followed, including requirement analysis, test planning, test case design, test execution, defect tracking, and reporting. Multiple HTTP methods such as GET, POST, PUT, PATCH, and DELETE were tested to verify CRUD operations and ensure the reliability of API endpoints.

The automation framework was developed using Java, Rest Assured, TestNG, and Maven, enabling efficient execution of API test cases and automated validation of response status codes, headers, payloads, and response times. Reusable utility components, reporting mechanisms, and configuration management improved framework maintainability and scalability.

A total of 17 API endpoints across various modules were tested to ensure proper functionality, data accuracy, and expected behavior under different test conditions. Detailed execution reports, logs, and test evidence were generated to provide complete visibility into the testing process.

Overall, this project provided practical experience in API automation testing, RESTful web services validation, framework development, test reporting, and quality assurance best practices. It demonstrates the ability to design and execute end-to-end API testing solutions while ensuring application reliability, maintainability, and software quality.
