-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2020 at 06:55 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `interview_quiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `company_student`
--

CREATE TABLE `company_student` (
  `id` int(11) NOT NULL,
  `student_id` varchar(30) DEFAULT NULL,
  `company_id` int(10) DEFAULT NULL,
  `technical_marks` varchar(30) DEFAULT NULL,
  `logical_marks` varchar(30) DEFAULT NULL,
  `engProf_marks` varchar(30) DEFAULT NULL,
  `situation_marks` varchar(30) DEFAULT NULL,
  `total` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `company_student`
--

INSERT INTO `company_student` (`id`, `student_id`, `company_id`, `technical_marks`, `logical_marks`, `engProf_marks`, `situation_marks`, `total`) VALUES
(1, '19101A0090', 1, '10', '10', '9', '10', '38'),
(2, '19101A0091', 1, '10', '9', '8', '10', '37'),
(3, '19101A0093', 1, '10', '10', '10', '9', '39'),
(4, '19101A0094', 1, '10', '10', '10', '10', '40'),
(5, '19101A0074', 1, '9', '8', '10', '8', '35');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `company_student`
--
ALTER TABLE `company_student`
  ADD PRIMARY KEY (`id`),
  ADD KEY `company_id_ibfk_1` (`company_id`),
  ADD KEY `student_id_ibfk_2` (`student_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `company_student`
--
ALTER TABLE `company_student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `company_student`
--
ALTER TABLE `company_student`
  ADD CONSTRAINT `company_id_ibfk_1` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`),
  ADD CONSTRAINT `student_id_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `student` (`rollNo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
