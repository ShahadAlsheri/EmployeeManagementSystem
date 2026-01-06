# CPCS203_Programming2_EmployeeManagementSystem
# Employee Management System (CPCS203 - Programming 2)

## Project Overview
This is a simple Employee Management System implemented in Java.  
It manages employees of different types (Manager, Developer, Designer), handles leave requests, calculates bonuses, and maintains employee records.

## Features
- Add or remove employees (Manager, Developer, Designer)
- Approve leave requests and mark employees as working
- Print all employees with their bonuses
- Maintain leave records for employees
- Calculate bonuses based on employee type:
  - Manager: 15% of salary
  - Developer: 12% of salary
  - Designer: 10% of salary

## Files
- `EmployeeManagementSystem.java` – Main system managing employees and leave records  
- `Employee.java` – Abstract class for employees  
- `Manager.java`, `Developer.java`, `Designer.java` – Subclasses implementing employee types  
- `Leave.java` – Represents a leave record for an employee  
- `Approver.java` – Interface for approving leaves  
- `Test_Main.java` – Main program to run the system using `input.txt` and produce `output.txt`  

## Topics Covered
- Object-Oriented Programming (OOP)
- Abstract classes and Interfaces
- Inheritance and Polymorphism
- File I/O (`Scanner`, `PrintWriter`)
- Arrays and ArrayLists
- Control structures (`if`, `switch`, `for`, `while`)
- Date and Time handling (`LocalDate`)
- No external libraries are required.  
- This is an academic project for CPCS203.
