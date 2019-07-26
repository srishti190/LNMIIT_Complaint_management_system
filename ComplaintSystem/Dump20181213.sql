-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: complaint_system
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin` (
  `Admin_id` int(11) NOT NULL,
  `Department_id` int(11) DEFAULT NULL,
  `Username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `Contact_no` varchar(45) DEFAULT NULL,
  `Admin_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (100002,1004,'registerar@lnmiit.ac.in','hoo234','9804564321','Registerar'),(100003,1007,'maintainenance@lnmiit.ac.in','8765','9876543256','Project and Maintenance manager'),(100004,1006,'finance@lnmiit.ac.in','4567','9876543234','FinanceOffice'),(100005,1002,'rpgorthi@lnmiit.ac.in','har5678','9441236780','Ravi Gorthi'),(100006,1003,'gdsharma@lnmiit.ac.in','3456','9784234266','GD Sharma'),(100009,1005,'chiefwarden@lnmiit.ac.in','3456','9876543290','ChiefWarden');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `applicant`
--

DROP TABLE IF EXISTS `applicant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `applicant` (
  `Name` varchar(45) DEFAULT NULL,
  `Registeration_id` varchar(45) DEFAULT NULL,
  `User_id` int(11) NOT NULL,
  `Username` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `Phone_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`User_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `applicant`
--

LOCK TABLES `applicant` WRITE;
/*!40000 ALTER TABLE `applicant` DISABLE KEYS */;
INSERT INTO `applicant` VALUES ('Amit','16ucs034',200,'16ucs034@lnmiit.ac.in','amit1234','9876598654'),('Aneesh','16ucs036',201,'16ucs036@lnmiit.ac.in','aneesh1234','7597595884'),('Gaurang','16ucs066',202,'16ucs066@lnmiit.ac.in','gaurang1234','9458745621'),('Harshil','16ucs074',203,'16ucs074@lnmiit.ac.in','harshil1234','7897854612'),('Mehul','16ucs080',204,'16ucs080@lnmiit.ac.in','mehul1234','784895624'),('Sunil','16ucs200',205,'16ucs200@lnmiit.ac.in','sunil1234','9451264587'),('Rahul','16ucs180',206,'16ucs180@lnmiit.ac.in','rahul1234','9458789452');
/*!40000 ALTER TABLE `applicant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complaint`
--

DROP TABLE IF EXISTS `complaint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `complaint` (
  `Complaint_id` int(11) NOT NULL,
  `User_id` int(11) DEFAULT NULL,
  `Department_id` int(11) DEFAULT NULL,
  `Complaint_type` varchar(45) DEFAULT NULL,
  `Complaint_details` varchar(500) DEFAULT NULL,
  `Complaint_date` date DEFAULT NULL,
  `Location` varchar(100) DEFAULT NULL,
  `Location_site` varchar(45) DEFAULT NULL,
  `Complaint_status` varchar(45) DEFAULT NULL,
  `Preferred_datetime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`Complaint_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaint`
--

LOCK TABLES `complaint` WRITE;
/*!40000 ALTER TABLE `complaint` DISABLE KEYS */;
INSERT INTO `complaint` VALUES (2000,200,1007,'Store Related','Store room not have lights ans chairs','2018-12-14','bh2','store room','Not resolved','2018-12-15 02:30:00'),(2001,200,1007,'Water Related','Water Supply is irregular','2018-12-17','bh2','b26','Not resolved','2018-12-20 02:30:00'),(2002,200,1006,'Scolarship Related','Details of Document required for proof','2018-12-08','bh2','b26','Not resolved','2018-12-12 02:30:00'),(2003,200,1006,'Fee Receipt or Submission','Fee recipt of 3 sem not in mis','2018-12-05','bh2','b26','Not resolved','2018-12-12 04:30:00'),(2004,202,1007,'Plumbing related','Taps not working in washrooms','2018-12-02','bh3','T-001','Not resolved','2018-12-12 04:30:00'),(2005,202,1007,'Electricity Related','Fan not working in my room','2018-12-06','bh3','S-28','Not resolved','2018-12-12 04:30:00'),(2006,202,1006,'General Payment Related','Can we use cash mode of payment','2018-12-07','bh3','S-28','Not resolved','2018-12-12 04:30:00'),(2007,202,1006,'Scolarship Related','When I will get jee advance scolarships','2018-12-08','bh3','S-28','Not resolved','2018-12-12 04:30:00'),(2008,203,1004,'Examination Related','I have a family funtion in between mid term .','2018-11-04','bh1','d-004','Not resolved','2018-12-13 04:30:00'),(2009,203,1002,'Academic Related','Last sem grade sheet not recieved','2018-11-05','bh1','d-004','Resolved','2018-12-14 04:30:00'),(2010,203,1006,'Scolarship Related','Is there any intern based scolarships','2018-11-06','bh1','d-004','Not resolved','2018-12-15 04:30:00'),(2011,203,1007,'Electricity Related','Tube light not working','2018-11-07','bh1','d-004','Not resolved','2018-12-16 04:30:00'),(2012,204,1007,'Air Ducts Related Complaints','Air ducts not running on time','2018-11-09','bh2','b-001','Not resolved','2018-12-16 04:30:00'),(2013,204,1006,'Fee Recipt or Submission','Fee Recipt not issued of this sem','2018-11-12','bh2','b-001','Not resolved','2018-12-12 04:30:00'),(2014,204,1004,'Examination Related','Yoga exam on same day of M3','2018-11-09','bh2','b-001','Not resolved','2018-12-20 02:30:00'),(2015,204,1002,'Academic Related','Labs are not running properly','2018-11-19','bh2','b-001','Resolved','2018-12-12 04:30:00'),(2016,204,1006,'Scolarship Related','Does I grade have effect on cgpa based scolarships','2018-11-12','bh2','bh2','Not resolved','2018-12-14 04:30:00');
/*!40000 ALTER TABLE `complaint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `department` (
  `Department_id` int(11) DEFAULT NULL,
  `Department_name` varchar(45) DEFAULT NULL,
  `Department_head` varchar(45) DEFAULT NULL,
  `Complaint_type` varchar(45) DEFAULT NULL,
  `Admin_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1002,'Dean of Academic Affair','RP Gorthi','UG Scholarship related',100005),(1002,'Dean of Academic Affair','RP Gorthi','PG Scholarship related',100005),(1002,'Dean of Academic Affair','RP Gorthi','Academic related',100005),(1003,'Dean of Research and Consultancy','GD Sharma','PhD Scholarship Related',100006),(1004,'Registrar','Registrar','Complaint Subject',100009),(1004,'Registrar','Registrar','General Administration Related',100009),(1004,'Registrar','Registrar','Establishment Related',100009),(1004,'Registrar','Registrar','Examination Related',100009),(1004,'Registrar','Registrar','Other Issues',100009),(1005,'Chief Warden','Chief Warden','Hostel Related',100008),(1005,'Chief Warden','Chief Warden','Mess Related',100008),(1005,'Chief Warden','Chief Warden','Shopping Complex Related',100008),(1005,'Chief Warden','Chief Warden','Disciplinary Related',100008),(1006,'Finance','Finance Office','Scholarship Related',100004),(1006,'Finance','Finance Office','Fee Recipt or Submission',100004),(1006,'Finance','Finance Office','General Payment Related',100004),(1006,'Finance','Finance Office','Salary and Increment Related',100004),(1006,'Finance','Finance Office','Reimbursement Related',100004),(1007,'Maintenance','Maintenance and Maintenance Manager','Air Conditioner Repair',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Air Ducts Related Repair',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Civil and Infrastructure Related',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Electricity Related',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Furniture Related',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Plumbing Related',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','RO Water Purifier repair',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Store Related',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Water Related',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Common Complaints',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Others',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','store',100003),(1007,'Maintenance','Maintenance and Maintenance Manager','Water Cooler Maintenance',100003);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registers`
--

DROP TABLE IF EXISTS `registers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `registers` (
  `User_id` int(11) DEFAULT NULL,
  `Complaint_id` int(11) NOT NULL,
  `Complaint_details` varchar(500) DEFAULT NULL,
  `Location` varchar(100) DEFAULT NULL,
  `Preferred_datetime` datetime DEFAULT NULL,
  `Location_site` varchar(45) DEFAULT NULL,
  `Phone_no` varchar(45) DEFAULT NULL,
  `Department_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`Complaint_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registers`
--

LOCK TABLES `registers` WRITE;
/*!40000 ALTER TABLE `registers` DISABLE KEYS */;
INSERT INTO `registers` VALUES (200,2000,'Store room not have lights ans chairs','bh2','2018-12-15 08:00:00','store room','9876598654',1007),(200,2001,'Water Supply is irregular','bh2','2018-12-20 08:00:00','b26','9876598654',1007),(200,2002,'Details of Document required for proof','bh2','2018-12-12 08:00:00','b26','9876598654',1006),(200,2003,'Fee recipt of 3 sem not in mis','bh2','2018-12-12 10:00:00','b26','9876598654',1006),(202,2004,'Taps not working in washrooms','bh3','2018-12-12 10:00:00','T-001','9458745621',1007),(202,2005,'Fan not working in my room','bh3','2018-12-12 10:00:00','S-28','9458745621',1007),(202,2006,'Can we use cash mode of payment','bh3','2018-12-12 10:00:00','S-28','9458745621',1006),(202,2007,'When I will get jee advance scolarships','bh3','2018-12-12 10:00:00','S-28','9458745621',1006),(203,2008,'I have a family funtion in between mid term .','bh1','2018-12-13 10:00:00','d-004','7897854612',1004),(203,2009,'Last sem grade sheet not recieved','bh1','2018-12-14 10:00:00','d-004','7897854612',1002),(203,2010,'Is there any intern based scolarships','bh1','2018-12-15 10:00:00','d-004','7897854612',1006),(203,2011,'Tube light not working','bh1','2018-12-16 10:00:00','d-004','7897854612',1007),(204,2012,'Air ducts not running on time','bh2','2018-12-16 10:00:00','b-001','784895624',1007),(204,2013,'Fee Recipt not issued of this sem','bh2','2018-12-12 10:00:00','b-001','784895624',1006),(204,2014,'Yoga exam on same day of M3','bh2','2018-12-20 08:00:00','b-001','784895624',1004),(204,2015,'Labs are not running properly','bh2','2018-12-12 10:00:00','b-001','784895624',1002),(204,2016,'Does I grade have effect on cgpa based scolarships','bh2','2018-12-14 10:00:00','bh2','784895624',1006);
/*!40000 ALTER TABLE `registers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-13  3:15:05
