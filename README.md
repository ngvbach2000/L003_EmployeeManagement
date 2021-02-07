# Employee Management
Lab 3: Employee Management
(Java Desktop)

## Program Specifications:
In this assignment, you are required to build employee management application, in the form of a desktop
application. The program has basic functions: login, add-delete-edit employee information. You are required
to use the basic components to design interfaces, use the tabbed pane to organize employee management on
the one screen. Array List is used to store information
Program organization must clearly separate functions according to MVC model.

## Features:
1. Create Employee
 - When a user fills all information and click Create, the application starts accepting all the details
of the new Emp and stores it into an ArrayList.
 - IsDelete field’s value has default as FALSE and not displayed at Create Emp frame.
 - The program checks the validity of data, if data is not valid then display an error message,
otherwise system will insert new employee into the database.
 - The employee table must be refreshed after new data has been successfully inserted

2. Show all Employees 
 - The screen is divided into 2 parts: Main information and Detail information.
 - Main part: this part lists all available Emp with their information (empID, fullname, phone,
email) in the system.
 - Detail part: When you click a row on the table, system call findByEmpID method (50 LOC), if the
application finds a match EmpID. The details of the respective employee are displayed following
information as EmpID(disabled), fullname, phone, email, address, DOB.
 - 04 buttons Get All Emp, Create Emp, Update and Remove button are put in Detail part.
 
3. Edit Employee
  - The user clicks on the Employee that he/she wants to modify on the Employee table.
  - The details of the respective employee are displayed.
  - The user changes the information of the Employee (not allow modify the EmpID). Then user
clicks the Update button.
  - The program checks the validity of data, if data is not valid then display an error message,
otherwise system will update Employee information.
  - The employee information’s table must be refreshed after new data had been successfully
updated.
  
4. Remove Employee
 - The user clicks on the supplier he wants to modify on the supplier table.
 - The details of the respective supplier are displayed.
 - The user changes the information of the supplier (not allow modify the supCode). Then user clicks the Save button.
 - The program checks the validity of data, if data is not valid then display an error message, otherwise system updates supplier information.
 - The supplier table must be refreshed after new data has been successfully updated.
 
5. Delete Supplier
 - The user clicks on the employee that he wants to delete on the employee information’s table.
Then users click the Remove button.
 - The program must display a message to confirm the deletion. If the user confirms, system will
delete the selected Employee.
 - The Employee table must be refreshed after data had been successfully deleted.

*. Verify constraint of following data type fields
 - empID: max length is 10, not contains special characters (@, #, $) 
 - fullname: max length is 30
 - address: max length is 300
 - DateOfBirth: in format MM/DD/YYYY
 - Phone number: max length is 15, contain numeric characters only (0 – 9)
 - Email: max length is 30, contain only one “@” character, do not contain special characters (!, #,
$)

## Connect me via 
1. [Facebook](https://fb.me/ngvbach2000)
2. [Email](mailto:ngvbach2000@gmail.com)

#### © 2020 by @ngvbach2000:cow:
