-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2017 at 03:54 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sin_praktikum`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_asisten`
--

CREATE TABLE `tbl_asisten` (
  `kode_asisten` varchar(6) NOT NULL,
  `nim` varchar(9) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` text,
  `email` varchar(30) DEFAULT NULL,
  `telp` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_asisten`
--

INSERT INTO `tbl_asisten` (`kode_asisten`, `nim`, `nama`, `alamat`, `email`, `telp`) VALUES
('AD2911', '135410106', 'Gusti Putu Agung Satria Pradnya Wibawa', 'Jl. Janti, Gang Nakula No. 31 RT002 RW19, Karangjambe, Banguntapan, Bantul,Yogyakarta', 'satria.pw@gmail.com', '081280436863'),
('AD2912', '135410183', 'Irhadi', 'Jl.Glagahsari D.I.Yogyakarta', 'irhadiiiii@gmail.com', '09482342235');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_dosen`
--

CREATE TABLE `tbl_dosen` (
  `nidn` varchar(8) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` text,
  `telp` varchar(12) DEFAULT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_dosen`
--

INSERT INTO `tbl_dosen` (`nidn`, `nama`, `alamat`, `telp`, `email`) VALUES
('27984743', 'Prastyanto Satria Pradana', 'Jl. Raya Mandala, Merauke ', '082243800678', 'pradanastr@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kelas`
--

CREATE TABLE `tbl_kelas` (
  `kode_kelas` varchar(7) NOT NULL,
  `kode_makul` varchar(7) NOT NULL,
  `ruangan` varchar(20) DEFAULT NULL,
  `hari` varchar(10) DEFAULT NULL,
  `pukul` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_kelas`
--

INSERT INTO `tbl_kelas` (`kode_kelas`, `kode_makul`, `ruangan`, `hari`, `pukul`) VALUES
('AKT1315', 'TI157PA', 'Lab Aplikasi', 'Jumat', '18:30-20:00');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_mahasiswa`
--

CREATE TABLE `tbl_mahasiswa` (
  `nim` varchar(9) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `angkatan` varchar(5) DEFAULT NULL,
  `alamat` text,
  `telp` varchar(12) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_mahasiswa`
--

INSERT INTO `tbl_mahasiswa` (`nim`, `nama`, `angkatan`, `alamat`, `telp`, `email`) VALUES
('105410107', 'Riko Siska		', '2010', 'Papua', '085276354836', 'siska01@gmail.com'),
('105410307', 'Renhart Harianja', '2011', 'Papua Barat', '0822437575', 'Renhart@gmail.com'),
('115410223', 'Marito Ramos Da Purificacao', '2011', 'Palembang', '081344763543', 'Marito@gmail.com'),
('125410221', 'Rian Bagus Amordin		', '2012', 'Surabaya', '085793543232', 'rian@gmail.com'),
('125410298', 'Mochammad Annas Umarullah', '2012', 'Malang', '0823576584', 'annas@gmail.com'),
('135410000', 'oka', '2013', 'badung', '081456452', 'oka@gmail.com'),
('135410096', 'nomo', '1023', 'badung', '08810000', 'made@mail.com'),
('135410100', 'Karisma Senolinggi', '2013', 'Maluku', '085344237474', 'karisma@gmail.com'),
('135410144', 'Anas Mulia		', '2013', 'Banyuwangi', '085376834953', 'mulia@gmail.com'),
('145410002', 'Pandu Firman C', '2014', 'Semarang', '082243756976', 'pandu@gmail.com'),
('145410003', 'Bima Prabusatya		', '2014', 'Kalimantan Timur', '081374364645', 'bima@gmail.com'),
('145410010', 'Bayu Dwi Saputra', '2014', 'Jakarta', '085738223884', 'bayu@gmail.com'),
('145410011', 'Usman Al Hafiz', '2014', 'Makassar', '081344543844', 'usman@gmail.com'),
('145410013', 'Al Amin Ali Imron	', '2014', 'Sulawesi', '082345632322', 'amin@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_matakuliah`
--

CREATE TABLE `tbl_matakuliah` (
  `kode_makul` varchar(7) NOT NULL,
  `nama_makul` varchar(30) DEFAULT NULL,
  `jml_sks` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_matakuliah`
--

INSERT INTO `tbl_matakuliah` (`kode_makul`, `nama_makul`, `jml_sks`) VALUES
('TI157PA', 'JARINGAN  KOMPUTER', 1),
('TI326PQ', 'Praktikum Kecerdasan Buatan', 5);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_nilai`
--

CREATE TABLE `tbl_nilai` (
  `id_nilai` int(10) NOT NULL,
  `nim` varchar(9) NOT NULL,
  `kode_kelas` varchar(7) NOT NULL,
  `kode_asisten` varchar(6) NOT NULL,
  `nidn` varchar(8) NOT NULL,
  `nilai_laporan1` int(3) DEFAULT NULL,
  `nilai_laporan2` int(3) DEFAULT NULL,
  `nilai_laporan3` int(3) DEFAULT NULL,
  `nilai_laporan4` int(3) DEFAULT NULL,
  `nilai_laporan5` int(3) DEFAULT NULL,
  `nilai_laporan6` int(3) DEFAULT NULL,
  `nilai_laporan7` int(3) DEFAULT NULL,
  `nilai_laporan8` int(3) DEFAULT NULL,
  `nilai_laporan9` int(3) DEFAULT NULL,
  `nilai_laporan10` int(3) DEFAULT NULL,
  `nilai_laporan11` int(3) DEFAULT NULL,
  `nilai_laporan12` int(3) DEFAULT NULL,
  `nilai_laporan13` int(3) DEFAULT NULL,
  `nilai_laporan14` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_nilai`
--

INSERT INTO `tbl_nilai` (`id_nilai`, `nim`, `kode_kelas`, `kode_asisten`, `nidn`, `nilai_laporan1`, `nilai_laporan2`, `nilai_laporan3`, `nilai_laporan4`, `nilai_laporan5`, `nilai_laporan6`, `nilai_laporan7`, `nilai_laporan8`, `nilai_laporan9`, `nilai_laporan10`, `nilai_laporan11`, `nilai_laporan12`, `nilai_laporan13`, `nilai_laporan14`) VALUES
(1234567890, '105410107', 'AKT1315', 'AD2911', '27984743', 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90),
(1234567891, '105410107', 'AKT1315', 'AD2911', '27984743', 100, 90, 90, 90, 90, 70, 70, 70, 70, 70, 80, 80, 80, 80);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`username`, `password`) VALUES
('admin01', 'admin01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_asisten`
--
ALTER TABLE `tbl_asisten`
  ADD PRIMARY KEY (`kode_asisten`);

--
-- Indexes for table `tbl_dosen`
--
ALTER TABLE `tbl_dosen`
  ADD PRIMARY KEY (`nidn`);

--
-- Indexes for table `tbl_kelas`
--
ALTER TABLE `tbl_kelas`
  ADD PRIMARY KEY (`kode_kelas`),
  ADD KEY `kode_makul` (`kode_makul`);

--
-- Indexes for table `tbl_mahasiswa`
--
ALTER TABLE `tbl_mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tbl_matakuliah`
--
ALTER TABLE `tbl_matakuliah`
  ADD PRIMARY KEY (`kode_makul`);

--
-- Indexes for table `tbl_nilai`
--
ALTER TABLE `tbl_nilai`
  ADD PRIMARY KEY (`id_nilai`),
  ADD KEY `tbl_nilai_ibfk_1` (`nidn`),
  ADD KEY `kode_asisten` (`kode_asisten`),
  ADD KEY `kode_kelas` (`kode_kelas`),
  ADD KEY `nim` (`nim`),
  ADD KEY `kode_asisten_2` (`kode_asisten`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_kelas`
--
ALTER TABLE `tbl_kelas`
  ADD CONSTRAINT `tbl_kelas_ibfk_1` FOREIGN KEY (`kode_makul`) REFERENCES `tbl_matakuliah` (`kode_makul`);

--
-- Constraints for table `tbl_nilai`
--
ALTER TABLE `tbl_nilai`
  ADD CONSTRAINT `tbl_nilai_ibfk_1` FOREIGN KEY (`nidn`) REFERENCES `tbl_dosen` (`nidn`),
  ADD CONSTRAINT `tbl_nilai_ibfk_2` FOREIGN KEY (`nim`) REFERENCES `tbl_mahasiswa` (`nim`),
  ADD CONSTRAINT `tbl_nilai_ibfk_3` FOREIGN KEY (`kode_kelas`) REFERENCES `tbl_kelas` (`kode_kelas`),
  ADD CONSTRAINT `tbl_nilai_ibfk_4` FOREIGN KEY (`kode_asisten`) REFERENCES `tbl_asisten` (`kode_asisten`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
