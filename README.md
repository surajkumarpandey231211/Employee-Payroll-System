# Employee Payroll System

## Overview

Employee Payroll System is a Java-based console application developed using JDBC and MySQL. The project helps manage employee records and payroll information efficiently. It allows users to add, view, delete, and calculate employee salaries through a menu-driven interface.

## Features

* Add Employee Details
* View Employee Records
* Delete Employee Records
* Calculate Net Salary
* MySQL Database Integration
* JDBC Connectivity
* Menu-Driven Console Interface

## Technologies Used

* Java
* JDBC
* MySQL
* VS Code
* MySQL Connector/J

## Project Structure

EmployeePayrollSystem

├── lib

│ └── mysql-connector-j-9.7.0.jar

├── src

│ ├── dao

│ │ └── EmployeeDAO.java

│ ├── model

│ │ └── Employee.java

│ ├── util

│ │ └── DBConnection.java

│ └── main

│ └── EmployeePayrollSystem.java

└── employee_db.sql

## Database Setup

Create a database:

```sql
CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE employees(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    basic_salary DOUBLE
);
```

## How to Run

### Compile

```bash
javac -cp "lib/mysql-connector-j-9.7.0.jar" -d bin src\model\*.java src\util\*.java src\dao\*.java src\main\*.java
```

### Run

```bash
java -cp "bin;lib/mysql-connector-j-9.7.0.jar" main.EmployeePayrollSystem
```

## Sample Operations

1. Add Employee
2. View Employees
3. Delete Employee
4. Calculate Salary
5. Exit

## Learning Outcomes

Through this project, I learned:

* Core Java Programming
* Object-Oriented Programming (OOP)
* JDBC Connectivity
* MySQL Database Operations
* CRUD Operations
* Exception Handling
* Project Structure and Package Management
* Debugging and Troubleshooting JDBC Issues

  ===== EMPLOYEE PAYROLL SYSTEM =====

1. Add Employee
2. View Employees
3. Delete Employee
4. Calculate Salary
5. Exit

Enter Choice : 2

101 Suraj Pandey IT 50000.0
102 Rahul Kumar HR 40000.0
103 Amit Singh Finance 55000.0

## Future Enhancements

* Update Employee Details
* Search Employee by ID
* Generate Salary Reports
* GUI using Java Swing or JavaFX
* Export Data to Excel/PDF

Aspiring Java Backend Developer | JDBC | MySQL | Git | GitHub
