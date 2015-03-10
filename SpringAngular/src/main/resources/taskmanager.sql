-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.16 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for taskmanager
CREATE DATABASE IF NOT EXISTS `taskmanager` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `taskmanager`;


-- Dumping structure for table taskmanager.task_list
CREATE TABLE IF NOT EXISTS `task_list` (
  `task_id` int(11) NOT NULL AUTO_INCREMENT,
  `task_name` varchar(100) NOT NULL,
  `task_description` text,
  `task_priority` varchar(20) DEFAULT NULL,
  `task_status` varchar(20) DEFAULT NULL,
  `task_start_time` datetime DEFAULT NULL,
  `task_end_time` datetime DEFAULT NULL,
  `task_archived` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Dumping data for table taskmanager.task_list: ~6 rows (approximately)
DELETE FROM `task_list`;
/*!40000 ALTER TABLE `task_list` DISABLE KEYS */;
INSERT INTO `task_list` (`task_id`, `task_name`, `task_description`, `task_priority`, `task_status`, `task_start_time`, `task_end_time`, `task_archived`) VALUES
	(1, 'Gathering Requirement', 'Requirement Gathering', 'MEDIUM', 'COMPLETED', '2015-03-06 10:32:37', '2015-03-06 13:32:37', 0),
	(2, 'Application Designing', 'Application Designing', 'MEDIUM', 'COMPLETED', '2015-03-06 10:32:37', '2015-03-06 12:32:37', 1),
	(3, 'Implementation', 'Implementation', 'MEDIUM', 'COMPLETED', '2015-03-06 10:32:37', '2015-03-06 13:32:37', 1),
	(4, 'Unit Testing', 'Unit Testing', 'LOW', 'COMPLETED', '2015-03-06 10:32:38', '2015-03-06 14:32:38', 0),
	(5, 'Maintanence', 'Maintanence', 'LOW', 'ACTIVE', '2015-03-06 10:32:38', '2015-03-06 15:32:38', 0),
	(6, 'Test 2', 'Test', 'HIGH', 'COMPLETED', NULL, NULL, 0);
/*!40000 ALTER TABLE `task_list` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
