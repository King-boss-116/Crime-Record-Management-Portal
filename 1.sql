-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.40-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.1.0.6116
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for dbms_review
DROP DATABASE IF EXISTS `dbms_review`;
CREATE DATABASE IF NOT EXISTS `dbms_review` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dbms_review`;

-- Dumping structure for table dbms_review.criminals
DROP TABLE IF EXISTS `criminals`;
CREATE TABLE IF NOT EXISTS `criminals` (
  `ID` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `State` varchar(50) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Gender` char(50) DEFAULT NULL,
  `Crime` varchar(50) DEFAULT NULL,
  `Report_Date` date DEFAULT NULL,
  `Background` varchar(50) DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table dbms_review.criminals: ~85 rows (approximately)
DELETE FROM `criminals`;
/*!40000 ALTER TABLE `criminals` DISABLE KEYS */;
INSERT INTO `criminals` (`ID`, `Name`, `State`, `Age`, `Gender`, `Crime`, `Report_Date`, `Background`, `Status`) VALUES
	(1, 'Mohan Kumar', 'Uttar Pradesh', 57, 'M', 'Murder of 20 women using cyanide pills', '2009-08-21', 'Rape, Robbing,Women trafficking', 'Sentenced to death in 2013'),
	(2, 'Mohinder Singh Pandir', 'Bihar', 39, 'M', '16 murder cases of household maids', '2006-12-31', 'Kidnapping, Rape, Necrophilia', 'Sentenced to death in 2017'),
	(3, 'Anjali Makan', 'Himachal Pradesh', 49, 'F', 'Fraud of 1.5 crore', '2011-03-26', 'Forgery,Counterfieting', 'Still missing'),
	(4, 'Ajmal Kasab', 'Pakistan', 21, 'M', 'Involved in Mumbai attacks 26/11', '2008-11-27', 'Murder, Conspiracy', 'Sentenced to death in 2012'),
	(5, 'KD Kempamma', 'Bihar', 44, 'F', 'Cyanide Poisoning', '2007-02-18', 'Women trafficking', 'Lifetime imprisonment'),
	(6, 'Vikas Dubey', 'Uttar Pradesh', 54, 'M', 'Murder of 16 policemen', '2020-06-09', 'Murder, Robbery, Kidnapping', 'Death in encounter in 2020'),
	(7, 'Devender Sharma', 'Delhi', 62, 'M', 'Involved in 50 murder cases', '2018-06-29', 'Murder, Organ trafficking', 'Still investigating'),
	(8, 'Jitender Gogi', 'Delhi', 36, 'M', 'Murder and extortion cases', '2013-05-12', 'Extortion, Kidnapping', 'Fled from police in 2015'),
	(9, 'Neeraj Bawana', 'Uttar Pradesh,', 27, 'M', 'Bookies cases of 25 crore', '2017-11-06', 'Fraud, local gangster', 'Arrested in 2018'),
	(10, 'Nambhala Keshava Rao', 'Andhra Pradesh', 42, 'M', 'Terrorist activities of Communist Party(Moist)', '2018-11-18', 'Far left politician', 'Listed in the Red list in NIA'),
	(11, 'Ravi Shankar', 'Madhya Pradesh', 36, 'M', 'Practicing corruptive activities', '2016-04-22', 'Anti nationalist', 'Far fled listed'),
	(12, 'Anupa Ghosh', 'Sikkim', 42, 'F', 'Conspiracy of Rape charges', '2017-04-13', 'Rape', 'Lifetime imprisonment'),
	(13, 'Rajeev Bhatia', 'Amritsar', 51, 'M', 'Murder of new born girl', '2020-02-11', 'Rape ,Murder', '3 years of prison'),
	(14, 'Sanjeev Kumar', 'Uttar Pradesh', 21, 'M', 'Seizing property after killing parents', '2018-11-04', 'Murder, Property Conspiracy', 'To be hanged till death'),
	(15, 'Archana Rawat', 'Bhopal', 46, 'F', 'Murder of daughter', '2019-07-14', 'Murder', 'Death Sentenced ceased'),
	(16, 'Rajendra Gopal', 'Bihar', 32, 'M', 'Terroristic activities since 2006', '2019-12-12', 'Anti nationalist', 'Still missing'),
	(17, 'Wangru Mangla', 'Manipur', 52, 'M', 'Supplying drugs through border', '2018-02-12', 'Heath related issues', 'Death sentence in 2018'),
	(18, 'Fardeen Khan', 'Lahore', 55, 'M', 'Crossed POK without permit', '2018-11-01', 'Spying over national territory', 'Still investigating'),
	(19, 'Sangetha Dutt', 'Uttar Pradesh', 32, 'F', 'Drug abuse among children', '2017-02-25', 'Anti narcotic activities', 'Lifetime imprisonment'),
	(20, 'Abdullah Rahman', 'Lahore', 52, 'M', 'Murder of 12 children', '2019-12-22', 'Murder, drug issues', 'Death sentence in 2020'),
	(21, 'Ranjana Mahendra', 'Dehradun', 31, 'F', 'Involved in serial killings', '2018-02-11', 'Rape, Murder, Kidnapping', 'Still investigating'),
	(22, 'Arman Malik', 'Bihar', 42, 'M', 'Involved in data leakage to China', '2019-12-05', 'IT sector rule violation', 'Imprisonment for 2 years'),
	(23, 'Quhut Khan', 'Madhya Pradesh', 51, 'M', 'Marked money conspiracy', '2009-09-11', 'Voilation of spoof sector', 'Far fled'),
	(24, 'Aman Ganesh', 'Maharashtra', 46, 'M', 'Murder of wife to pieces', '2014-04-12', 'Murder, Anti human activity', 'Death sentence in 2016'),
	(26, 'Hansal Kumar', 'Uttar Pradesh', 57, 'M', 'Murder of 20 women using cyanide pills', '2009-08-21', 'Rape, Robbing,Women trafficking', 'Life imprisonment'),
	(27, 'Mohit Singh', 'Bihar', 39, 'M', '16 murder cases of household maids', '2006-12-31', 'Kidnapping, Rape, Necrophilia', 'Sentenced to death in 2011'),
	(28, 'Anjan Makan', 'Himachal Pradesh', 49, 'F', 'Fraud of 1.5 crore', '2011-03-26', 'Forgery,Counterfieting', 'Still missing in the Red reports'),
	(29, 'Nisant Gosav', 'Pakistan', 21, 'M', 'Involved in Mumbai attacks 26/11', '2008-11-27', 'Murder, Conspiracy', 'Sentenced to death in 2008'),
	(30, 'KD Sharma', 'Bihar', 44, 'F', 'Cyanide Poisoning', '2007-02-18', 'Women trafficking', 'Missing in Reports'),
	(31, 'Vikas Rawat', 'Uttar Pradesh', 54, 'M', 'Murder of 16 policemen', '2020-06-09', 'Murder, Robbery, Kidnapping', 'Death in encounter in 2015'),
	(32, 'Dev Anand', 'Delhi', 62, 'M', 'Involved in 50 murder cases', '2018-06-29', 'Murder, Organ trafficking', 'Still investigating in reports'),
	(33, 'Harmtender Gogia', 'Delhi', 36, 'M', 'Murder and extortion cases', '2013-05-12', 'Extortion, Kidnapping', 'Fled from police in 2015'),
	(34, 'Naveen Bansal', 'Uttar Pradesh,', 27, 'M', 'Bookies cases of 25 crore', '2017-11-06', 'Fraud, local gangster', 'Arrested in 2018'),
	(35, 'Namsal Rao', 'Andhra Pradesh', 42, 'M', 'Terrorist activities of Communist Party(Moist)', '2018-11-18', 'Far left politician', 'Listed in the Foreign Cervet list'),
	(36, 'Teavi Shankar', 'Madhya Pradesh', 36, 'M', 'Practicing corruptive activities', '2016-04-22', 'Anti nationalist', 'Far fled listed'),
	(37, 'Rayupa Goyal', 'Sikkim', 42, 'F', 'Conspiracy of Rape charges', '2017-04-13', 'Rape', 'Lifetime imprisonment'),
	(39, 'Sohan Kumar', 'Uttar Pradesh', 21, 'M', 'Seizing property after killing parents', '2018-11-04', 'Murder, Property Conspiracy', 'To be hanged'),
	(40, 'Archana Singh', 'Bhopal', 46, 'F', 'Murder of daughter', '2019-07-14', 'Murder', 'Death Sentenced ceased'),
	(41, 'Govendra Gopal', 'Bihar', 32, 'M', 'Terroristic activities since 2006', '2019-12-12', 'Anti nationalist', 'Still missing in the latest reports'),
	(42, 'Mandeep Roy', 'Manipur', 52, 'M', 'Supplying drugs through border', '2018-02-12', 'Heath related issues', 'Death sentence in 2017'),
	(43, 'Farhan Akhtar', 'Lahore', 55, 'M', 'Crossed POK without permit', '2018-11-01', 'Spying over national territory', 'Still investigating'),
	(44, 'Sanjeev Kap', 'Uttar Pradesh', 32, 'F', 'Drug abuse among children', '2017-02-25', 'Anti narcotic activities', 'Lifetime imprisonment'),
	(45, 'Abdul Raheem', 'Lahore', 52, 'M', 'Murder of 12 children', '2019-12-22', 'Murder, drug issues', 'Death sentence in 2020'),
	(46, 'Ranjan Deep Singh', 'Dehradun', 31, 'F', 'Involved in serial killings', '2018-02-11', 'Rape, Murder, Kidnapping', 'Still investigating'),
	(47, 'Aman Bansal', 'Bihar', 42, 'M', 'Involved in data leakage to China', '2019-12-05', 'IT sector rule violation', 'Imprisonment for 7 years'),
	(48, 'Quran Sheikh', 'Madhya Pradesh', 51, 'M', 'Marked money conspiracy', '2019-03-18', 'Voilation of spoof sector', 'Far fled from India'),
	(50, 'Narayana Subhramanyam', 'Tamil Nadu', 27, 'M', 'Murder of 2 men', '2019-11-02', 'Murder, Violation of police power', 'Death sentence in 2019'),
	(51, 'Abdul Khan', 'Lahore', 52, 'M', 'Murder of 12 children', '2019-12-22', 'Murder, drug issues', 'Lifetime imprisonment'),
	(52, 'Qurut Ahmed', 'Dehradun', 31, 'F', 'Involved in serial killings', '2018-02-11', 'Rape, Murder, Kidnapping', 'Still investigating in reports'),
	(53, 'Rohan sheikh', 'Bihar', 42, 'M', 'Involved in data leakage to China', '2019-12-05', 'IT sector rule violation', 'Imprisonment for 5 years'),
	(54, 'Avneet Bhatia', 'Madhya Pradesh', 51, 'M', 'Marked money conspiracy', '2019-03-18', 'Voilation of spoof sector', 'Far fled from states'),
	(56, 'Naman Jain', 'Tamil Nadu', 27, 'M', 'Murder of 2 men', '2019-11-02', 'Murder, Violation of police power', 'Still investigating in reports'),
	(57, 'Vedant Goel', 'Uttar Pradesh', 57, 'M', 'Murder of 20 women using cyanide pills', '2009-08-21', 'Rape, Robbing,Women trafficking', 'Life imprisonment'),
	(58, 'Prakhar Kapoor', 'Bihar', 39, 'M', '16 murder cases of household maids', '2006-12-31', 'Kidnapping, Rape, Necrophilia', 'Encouter reported'),
	(59, 'Sanidhya Joshi', 'Himachal Pradesh', 49, 'F', 'Fraud of 1.5 crore', '2011-03-26', 'Forgery,Counterfieting', 'Still missing in the Indian reports'),
	(60, 'Nishant Mehta', 'Pakistan', 21, 'M', 'Involved in Mumbai attacks 26/11', '2008-11-27', 'Murder, Conspiracy', 'Sentenced to death in 2011'),
	(61, 'Vinod Lalit', 'Bihar', 44, 'F', 'Cyanide Poisoning', '2007-02-18', 'Women trafficking', 'Not known'),
	(62, 'Vikas Sharma', 'Uttar Pradesh', 54, 'M', 'Murder of 16 policemen', '2020-06-09', 'Murder, Robbery, Kidnapping', 'Far fled '),
	(63, 'Ahmad hamad', 'Delhi', 62, 'M', 'Involved in 50 murder cases', '2018-06-29', 'Murder, Organ trafficking', 'Investigating in reports'),
	(64, 'Aman bhatia', 'Delhi', 36, 'M', 'Murder and extortion cases', '2013-05-12', 'Extortion, Kidnapping', 'Fled from police in 2015'),
	(65, 'Ranbir Yadav', 'Uttar Pradesh,', 27, 'M', 'Bookies cases of 25 crore', '2017-11-06', 'Fraud, local gangster', 'Arrested in 2018, imprisoned'),
	(66, 'Namsal Rawat', 'Andhra Pradesh', 42, 'M', 'Terrorist activities of Communist Party(Moist)', '2018-11-18', 'Far left politician', 'Need to be reported'),
	(67, 'Teri Hansal', 'Madhya Pradesh', 36, 'M', 'Practicing corruptive activities', '2016-04-22', 'Anti nationalist', 'Far fled listed in reports'),
	(68, 'Meena Joshi', 'Sikkim', 42, 'F', 'Conspiracy of Rape charges', '2017-04-13', 'Rape', 'Lifetime imprisonment'),
	(69, 'Harvant Umeed', 'Amritsar', 51, 'M', 'Murder of new born girl', '2020-02-11', 'Rape, Murder', '7 years of prison'),
	(70, 'Pankaj Udas', 'Uttar Pradesh', 21, 'M', 'Seizing property after killing parents', '2018-11-04', 'Murder, Property Conspiracy', 'To be hanged till death'),
	(71, 'Archi Riya', 'Bhopal', 46, 'F', 'Murder of daughter', '2019-07-14', 'Murder', 'Death Sentenced ceased'),
	(72, 'Shruvender Kumar', 'Bihar', 32, 'M', 'Terroristic activities since 2006', '2019-12-12', 'Anti nationalist', 'Still missing'),
	(73, 'Engiw Ridhi', 'Manipur', 52, 'M', 'Supplying drugs through border', '2018-02-12', 'Heath related issues', 'Death sentence in 2017'),
	(74, 'Upesh Joshi', 'Lahore', 55, 'M', 'Crossed POK without permit', '2018-11-01', 'Spying over national territory', 'Lifetime imprisonement'),
	(75, 'Ram Kapoor', 'Uttar Pradesh', 32, 'F', 'Drug abuse among children', '2017-02-25', 'Anti narcotic activities', 'Not reported yet'),
	(76, 'Mani Paswal', 'Lahore', 52, 'M', 'Murder of 12 children', '2019-12-22', 'Murder, drug issues', 'Lifetime imprisonment'),
	(77, 'Essan Manglik', 'Madhya Pradesh', 36, 'M', 'Practicing corruptive activities', '2016-04-22', 'Anti nationalist', 'Far fled'),
	(78, 'Aditya Goyal', 'Sikkim', 42, 'F', 'Conspiracy of Rape charges', '2017-04-13', 'Rape', 'Lifetime imprisonment'),
	(79, 'Agrima Jain', 'Amritsar', 51, 'M', 'Murder of new born girl', '2020-02-11', 'Rape, Murder', '10 years of prison'),
	(80, 'Khusboo Singh', 'Uttar Pradesh', 21, 'M', 'Seizing property after killing parents', '2018-11-04', 'Murder, Property Conspiracy', 'To be hanged yet informed'),
	(81, 'Uish jeyesh', 'Bhopal', 46, 'F', 'Murder of daughter', '2019-07-14', 'Murder', 'Death Sentenced ceased'),
	(82, 'Ravinder Jadeja', 'Bihar', 32, 'M', 'Terroristic activities since 2006', '2019-12-12', 'Anti nationalist', 'Still missing in reports'),
	(83, 'Ravllen Shah', 'Manipur', 52, 'M', 'Supplying drugs through border', '2018-02-12', 'Heath related issues', 'Death sentence in 2018'),
	(84, 'Damanpreet Joshi', 'Lahore', 55, 'M', 'Crossed POK without permit', '2018-11-01', 'Spying over national territory', 'Still investigating in reports'),
	(85, 'Gurlren Kaur', 'Uttar Pradesh', 32, 'F', 'Drug abuse among children', '2017-02-25', 'Anti narcotic activities', 'Lifetime imprisonment'),
	(86, 'Surleen uresh', 'Lahore', 52, 'M', 'Murder of 12 children', '2019-12-22', 'Murder, drug issues', 'Death sentence in 2020'),
	(87, 'Ropaan Kapoor', 'Dehradun', 31, 'F', 'Involved in serial killings', '2018-02-11', 'Rape, Murder, Kidnapping', 'Still investigating'),
	(88, 'Ruchika Dhawan', 'Bihar', 42, 'M', 'Involved in data leakage to China', '2019-12-05', 'IT sector rule violation', 'Imprisonment for 2 years'),
	(89, 'Himanshu Sehgal', 'Madhya Pradesh', 51, 'M', 'Marked money conspiracy', '2019-03-18', 'Voilation of spoof sector', 'Far fled'),
	(91, 'Meru Parman', 'Tamil Nadu', 27, 'M', 'Murder of 2 men', '2019-11-02', 'Murder, Violation of police power', 'Still investigating'),
	(92, 'Harman Kohli', 'Uttar Pradesh', 57, 'M', 'Murder of 20 women using cyanide pills', '2009-08-21', 'Rape, Robbing,Women trafficking', 'Life imprisonment'),
	(93, 'Sadik Bansal', 'Bihar', 39, 'M', '16 murder cases of household maids', '2006-12-31', 'Kidnapping, Rape, Necrophilia', 'Sentenced to death in 2011'),
	(94, 'Rukhsana Rawat', 'Himachal Pradesh', 49, 'F', 'Fraud of 1.5 crore', '2011-03-26', 'Forgery,Counterfieting', 'Still missing in the Red reports'),
	(95, 'Murad Khan', 'Pakistan', 21, 'M', 'Involved in Mumbai attacks 26/11', '2008-11-27', 'Murder, Conspiracy', 'Sentenced to death in 2008'),
	(96, 'RD Sharma', 'Bihar', 44, 'F', 'Cyanide Poisoning', '2007-02-18', 'Women trafficking', 'Missing in Reports from Red List'),
	(97, 'Ismail Khan', 'Uttar Pradesh', 54, 'M', 'Murder of 16 policemen', '2020-06-09', 'Murder, Robbery, Kidnapping', 'Death in encounter in 2015'),
	(98, 'Mehek Daven', 'Delhi', 62, 'M', 'Involved in 50 murder cases', '2018-06-29', 'Murder, Organ trafficking', 'Lifetime Imprisonment'),
	(99, 'Harman Umeed', 'Delhi', 36, 'M', 'Murder and extortion cases', '2013-05-12', 'Extortion, Kidnapping', 'Encounter in 2015'),
	(100, 'Rishi Goswami', 'Uttar Pradesh,', 27, 'M', 'Bookies cases of 25 crore', '2017-11-06', 'Fraud, local gangster', 'Life imprisonment');
/*!40000 ALTER TABLE `criminals` ENABLE KEYS */;

-- Dumping structure for table dbms_review.employee
DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `E_Id` int(11) NOT NULL,
  `E_Name` varchar(50) NOT NULL,
  `E_State` varchar(50) DEFAULT NULL,
  `E_Age` int(11) DEFAULT NULL,
  `E_Crime_Record` varchar(50) DEFAULT NULL,
  `E_Current_Status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`E_Id`,`E_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table dbms_review.employee: ~50 rows (approximately)
DELETE FROM `employee`;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`E_Id`, `E_Name`, `E_State`, `E_Age`, `E_Crime_Record`, `E_Current_Status`) VALUES
	(2, 'Vijay Khuranna', 'Madhya Pradesh', 36, 'Murder and rape of 3 women in 2008', 'Imprisonment for 14 years'),
	(3, 'Satish Kumar', 'Uttarakhand', 42, 'Money and Drug violence', 'Still investigating'),
	(4, 'Ronney Kapoor', 'Delhi', 32, 'Murder of 2 men', 'Report violence missing'),
	(5, 'Tareen Basin', 'Uttar Pradesh', 52, 'Terrorist activities in 2006', 'Life Imprisonment'),
	(6, 'Vikas Dubey', 'Uttar Pradesh', 54, 'Murder of 16 policemen', 'Death sentence in 2020'),
	(7, 'Imran Qureshi', 'Vijaynagar', 31, 'Child with substance abuse', 'Case not filed yet'),
	(8, 'Arif Jain', 'Jampur', 27, 'Drink and drive', 'Fine of 2000 charged'),
	(9, 'Neeraj Bawana', 'Uttar Pradesh', 27, 'Bookies cases of 25 crore', 'Arrested in 2018'),
	(10, 'Anupa Ghosh', 'Sikkim', 42, 'Conspiracy of Rape charges', 'Lifetime imprisonment'),
	(11, 'Rahul David', 'Mumbai', 22, 'Paper Leakage in college', 'Fine of 10,000 charged'),
	(12, 'Faroon Mangreker', 'Pune', 28, 'Gas Leakage in Milestone factory', 'Imprisonment for 12 years'),
	(13, 'Ranjan Tripathi', 'Mirzapur', 41, 'Baruit pursuit since 2002', 'Death sentence in 2012'),
	(14, 'Sanjeev Kumar', 'Uttar Pradesh', 21, 'Seizing property after killing parents', 'To be hanged till death'),
	(15, 'Varun Singhal', 'Delhi', 34, 'Drug abuse and violence', 'Still investigating'),
	(16, 'Javed Ali', 'Ladakh', 50, 'Loss of company shares in marketing', 'Information missing'),
	(17, 'Wangru Mangla', 'Manipur', 52, 'Supplying Drugs through border', 'Death sentence in 2018'),
	(18, 'Rajeev Masan', 'Mumbai', 37, 'Murder of own children', 'Lifetime Imprisonment'),
	(19, 'Sangeetha Dutt', 'Uttar Pradesh', 32, 'Drug abuse among children', 'Lifetime Imprisonment'),
	(20, 'Abdullah Rahman', 'Uttar Pradesh', 32, 'Drug abuse among children', 'Lifetime Imprisonment'),
	(21, 'Ranjana Mahendru', 'Dehradun', 31, 'Involved in serial killings', 'Still investigating'),
	(22, 'Amil Goswair', 'Bihar', 42, 'ISIS agent conspiracy', 'Data inappropriate'),
	(23, 'Madhav Mishra', 'Kerela', 51, 'Violation of child-reserve rights', 'Imprisonment for 7 years'),
	(24, 'Aman Ganesh', 'Maharashtra', 46, 'Murder of wife into pieces', 'Death sentence in 2016'),
	(25, 'Parul Singhal', 'Rajasthan', 56, 'Violation of Child marriage act', 'Imprisonment for 14 years'),
	(26, 'Harshitaaaa', 'UP', 49, 'Rape', 'Lifetime Inprisonment'),
	(27, 'Bijar Kapoor', 'Madhya Pradesh', 36, 'Murder and rape of 3 women in 2008', 'Death sentence in 2010'),
	(28, 'Ratisk Kaushal', 'Uttarakhand', 42, 'Money and Drug violence', 'Still investigating in reports'),
	(29, 'Rohit Kapoor', 'Delhi', 32, 'Murder of 2 men', 'Report violence missing'),
	(30, 'Wangru Basin', 'Uttar Pradesh', 52, 'Terrorist activities in 2006', 'Death in encounter'),
	(31, 'Vijaydeep', 'Uttar Pradesh', 54, 'Murder of 16 policemen', 'Death sentence in 2020'),
	(32, 'Rukh Khan', 'Vijaynagar', 31, 'Child with substance abuse', 'Case not filed in reports'),
	(33, 'Raogify Jain', 'Jampur', 27, 'Drink and drive', 'Fine of 2000 charged'),
	(34, 'MAndeep Rawana', 'Uttar Pradesh', 27, 'Bookies cases of 25 crore', 'Lifetime imprisonment'),
	(35, 'Anupa Ghosh', 'Sikkim', 42, 'Conspiracy of Rape charges', 'Information missing'),
	(36, 'Vijendra jadav', 'Mumbai', 22, 'Paper Leakage in college', 'Fine of 30,000 charged'),
	(37, 'Ranoony Mangesh', 'Pune', 28, 'Gas Leakage in Milestone factory', 'Imprisonment for 12 years'),
	(38, 'Yash Hansal', 'Mirzapur', 41, 'Baruit pursuit since 2002', 'Death sentence in 2016'),
	(39, 'Harshad Mehra', 'Uttar Pradesh', 21, 'Seizing property after killing parents', 'Not dealt yet'),
	(40, 'Amar jadav', 'Delhi', 34, 'Drug abuse and violence', 'Still investigating in reports'),
	(41, 'Amit Bhadana', 'Ladakh', 50, 'Loss of company shares in marketing', 'Lifetime imprisonment'),
	(42, 'Ashish Oberoi', 'Manipur', 52, 'Supplying Drugs through border', 'Death sentence filed'),
	(43, 'Rajeev Bansal', 'Mumbai', 37, 'Murder of own children', 'Encounter registered'),
	(44, 'Sanjeev Lalait', 'Uttar Pradesh', 32, 'Drug abuse among children', 'Lifetime Imprisonment'),
	(45, 'Merty Insir', 'Uttar Pradesh', 32, 'Drug abuse among children', 'Data insufficient for action'),
	(46, 'Ranjan Joshi', 'Dehradun', 31, 'Involved in serial killings', 'Case filed'),
	(47, 'Rishank Mehrotra', 'Bihar', 42, 'ISIS agent conspiracy', 'Data inappropriate for action'),
	(48, 'Siddhant Malla', 'Kerela', 51, 'Violation of child-reserve rights', 'Lifetime imprisonment'),
	(49, 'Anshuman ravi', 'Maharashtra', 46, 'Murder of wife into pieces', 'Death sentence in 2019'),
	(50, 'Abhishekh Rajput', 'Rajasthan', 56, 'Violation of Child marriage act', 'Sentenced to jail');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

-- Dumping structure for table dbms_review.police
DROP TABLE IF EXISTS `police`;
CREATE TABLE IF NOT EXISTS `police` (
  `P_Id` int(11) NOT NULL,
  `P_Name` varchar(50) DEFAULT NULL,
  `P_Age` int(11) DEFAULT NULL,
  `P_Gender` char(50) DEFAULT NULL,
  `Report_Date` date DEFAULT NULL,
  `Case_Involoved_Id` int(11) NOT NULL,
  `Contribution_Provided` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`P_Id`,`Case_Involoved_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table dbms_review.police: ~32 rows (approximately)
DELETE FROM `police`;
/*!40000 ALTER TABLE `police` DISABLE KEYS */;
INSERT INTO `police` (`P_Id`, `P_Name`, `P_Age`, `P_Gender`, `Report_Date`, `Case_Involoved_Id`, `Contribution_Provided`) VALUES
	(6521976, 'Raja Khuswant Roy', 52, 'M', '2013-05-12', 8, 'Assault against attack by weapon seizing of the individual after sustaining multiple injuries'),
	(6521977, 'Vinod Chaubey', 41, 'M', '2019-07-14', 15, 'Saving the life of the daughter by being at the site itself and recovered the casualty there'),
	(6521978, 'HT Sangliana', 38, 'F', '2018-06-29', 7, 'Life saviour of the citizen\'s parents but was not able to recover from his wounds, hence martyred'),
	(6521979, 'Vijay Kumar', 47, 'M', '2019-12-12', 16, 'Murder weapon still missing, but the courage shown by police deserved Gold Medal from the President'),
	(6521980, 'Rakesh Maria', 41, 'M', '2006-12-31', 2, 'Kidnapping lead to the case being deep thread, present at site, eye witness detected individual'),
	(6521981, 'Ranjit Shekhar Mooshahary', 37, 'M', '2014-04-12', 24, 'Lead the danger by himself being a part of the victim\'s plan, was safely rescued'),
	(6521982, 'Sangram Singh', 29, 'M', '2018-02-12', 17, 'Border activist, caught the individual red handed with drugs being supplied, border  ceased'),
	(6521983, 'Sanjeev Tripathi', 44, 'M', '2019-12-21', 20, 'Kidnapping led to the police deep in the matter, investigation blocked for threat reasons'),
	(6521984, 'Shankar Bidari Hemmkanth', 48, 'M', '2017-04-13', 12, 'Lead the case by cross examining the victim and brought the casualties to rescue'),
	(6521985, 'Vijay Salaskar', 53, 'M', '2008-11-27', 4, 'Lead down his life by fighting against the terrorists involved in Mumbai Attacks, Martyred life'),
	(6521986, 'Chandrappa Veerapan', 36, 'M', '2019-11-02', 25, 'Father-son due was saved after the individuals violated the law by the Police Federation'),
	(6521987, 'ML Kumawat', 49, 'M', '2016-04-22', 11, 'Leading against anti national activities which lead the mob to lead the Govn sector, saved on site'),
	(6521988, 'Ashish Nehra', 52, 'M', '2013-05-12', 64, 'Lead the case by cross examining the victim and brought the casualties to rescue'),
	(6521989, 'Hansal Sharma', 41, 'M', '2019-07-14', 38, 'Saving the life of the daughter by being at the site itself and recovered the casualty there'),
	(6521990, 'Humesh Yadav', 38, 'F', '2018-06-29', 76, 'Prevented the citizen\'s parents but was not able to recover from his wounds, hence martyred'),
	(6521991, 'Vijendra Kuma', 47, 'M', '2019-12-12', 46, 'Murder weapon still missing, but the courage shown by police deserved Gold Medal from the President'),
	(6521992, 'Ranjeet Kapoor', 41, 'M', '2006-12-31', 80, 'Leading against anti national activities which lead the mob to lead the Govn sector, saved on site'),
	(6521993, 'Ranjan Prabhakar', 37, 'M', '2014-04-12', 71, 'Lead the danger by himself being a part of the victim\'s plan, was safely rescued'),
	(6521994, 'Sangram Seth', 29, 'M', '2018-02-12', 69, 'Mother due was saved after the individuals violated the law by the Police Federation'),
	(6521995, 'Sandeep Unik', 44, 'M', '2019-12-21', 51, 'Kidnapping led to the police deep in the matter, investigation blocked for threat reasons'),
	(6521996, 'Shani Bindu ', 48, 'M', '2017-04-13', 97, 'Saved the life of 5 children on sight'),
	(6521997, 'Mandeep Salaskar', 53, 'M', '2008-11-12', 42, 'Lead down his life by fighting against the terrorists involved in Mumbai Attacks, Martyred life'),
	(6521998, 'Chandan Kohli', 36, 'M', '2019-11-02', 68, 'Awarded with rewards from the Chief minister'),
	(6521999, 'Mahesh Bhuran', 49, 'M', '2016-04-22', 70, 'Caught with providing self defence techniques, rescued'),
	(6522000, 'Rohan Singh Pratap', 37, 'M', '2014-04-12', 88, 'Lead down his life after surrendering the enemy'),
	(6522001, 'javed Mangchandani', 29, 'M', '2018-02-12', 22, 'Caught the individual red handed with drugs being supplied'),
	(6522002, 'Sanjan Yadav', 44, 'M', '2019-12-21', 100, 'Kidnapping led to the police deep in the matter, investigation blocked for threat reasons'),
	(6522003, 'Shamsher Singh', 48, 'M', '2017-04-13', 75, 'Lead the case by cross examining the victim and brought the casualties to rescue'),
	(6522004, 'Manglesh Chauhan', 53, 'M', '2008-11-27', 29, 'Martyred life, included in the 26/11 attacks'),
	(6522005, 'Prakhar Sharma', 36, 'M', '2019-11-02', 54, 'Rescued due was saved after the individuals violated the law by the Police Federation'),
	(6522006, 'Diwakar Shury', 49, 'M', '2016-04-22', 49, 'Anti national activities which lead the mob to lead the Govn sector'),
	(6522007, 'Indu Kumar', 52, 'F', '2013-05-12', 83, 'Lead the case by cross examining the victim and dealt with zero casualties');
/*!40000 ALTER TABLE `police` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
