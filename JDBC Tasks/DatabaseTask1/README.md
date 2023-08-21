# JDBC Tasks

## Task 1

 Java application for connecting to a database on MySQL Server and executing a query which selects numbers of fields from a table and prints it with any specific format, by using load a specific driver and getting the connection using DriverManager class.

<center> <img src="screenshot.PNG"> </center>

## Project Description

### Database Setup
1. Install Xampp.
2. Start Apache and MYSQL modules.
3. Open phpMyAdmin.
4. Create a new database
5. Import [db file](https://github.com/amira921/JobHacker-System/blob/JDBCTasks/JDBC%20Tasks/DatabaseTask1/db.sql).
<center>

#### SQL Code in db file
```
CREATE TABLE `classroom` (
  `Id` int(50) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `GPA` double NOT NULL,
  `Gender` enum('F','M') NOT NULL,
  PRIMARY KEY(`Id`)
);

--
-- Dumping data for table `classroom`
--

INSERT INTO `classroom` (`Id`, `Name`, `GPA`, `Gender`) VALUES
(NULL, 'Amira Taha Ahmed', 4.00, 'F'),
(NULL, 'Ahmed Taha Ahmed', 3.03, 'M'),
(NULL, 'Mai Ali Mohammed', 3.99, 'F'),
(NULL, 'Nour Mohammed Ali', 2.78, 'M');

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetStudents` ()  BEGIN
   SELECT * from `classroom`;
END$$

DELIMITER ;
```
</center>

6. Install [MYSQL driver](https://static.javatpoint.com/src/jdbc/mysql-connector.jar).
7. Add driver in project dependencies.


## Java Application
Singleton pattern used for database class.
Singleton class is created for the database that has only one instance and provides a global point of access to it, it Saves memory because the object is not created at each request, only a single instance is reused again and again.

**UML diagram**
<center><img src="class diagram.PNG" width=300 higth=300></center>



