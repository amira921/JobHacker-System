# JDBC Tasks

## Task 2

Java application for Creating a table with name "Employee", with fields: Id, F_Name, L_Name, Sex, Age, Address, Phone Number, Vaction_Balance "30 days for each employees", insert 5 rows - at least- with different data using PreparedStatement object, using Batching to do the following related to the above database:
1. Modify the Vacation_Balance of employees over 45 years to be increased to 45 days rather than 30.
2. For those employees, title the F_Name with Mr/Mrs.

<center> <img src="Java app screenshot.PNG" width=700 length=300> </center>
<center> <img src="MYSQL screenshot.PNG" width=700 length=300> </center>


## Project Description

### Database Setup
1. Install Xampp.
2. Start Apache and MYSQL modules.
3. Open phpMyAdmin.
4. Create a new database
4. Install [MYSQL driver](https://static.javatpoint.com/src/jdbc/mysql-connector.jar).
6. Add driver in project dependencies.


## Java Application
Singleton pattern used for database class.
Singleton class is created for the database that has only one instance and provides a global point of access to it, it Saves memory because the object is not created at each request, only a single instance is reused again and again.

**UML diagram**
<center><img src="UML Diagram.PNG" width=300 higth=300></center>
