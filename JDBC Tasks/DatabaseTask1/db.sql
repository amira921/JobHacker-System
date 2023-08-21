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
