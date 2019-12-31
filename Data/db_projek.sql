-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2019 at 08:04 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_projek`
--

-- --------------------------------------------------------

--
-- Table structure for table `identitas_toko`
--

CREATE TABLE `identitas_toko` (
  `toko_nama` varchar(150) NOT NULL,
  `toko_deskripsi` text NOT NULL,
  `toko_alamat` text NOT NULL,
  `toko_logo` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_admin`
--

CREATE TABLE `tb_admin` (
  `admin_noidentitas` varchar(20) NOT NULL,
  `admin_namadepan` varchar(100) NOT NULL,
  `admin_namabelakang` varchar(100) NOT NULL,
  `admin_username` varchar(50) NOT NULL,
  `admin_password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_admin`
--

INSERT INTO `tb_admin` (`admin_noidentitas`, `admin_namadepan`, `admin_namabelakang`, `admin_username`, `admin_password`) VALUES
('ADM001', 'Alexander', 'Bale', 'admin123', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `barang_id` varchar(20) NOT NULL,
  `barang_nama` varchar(200) NOT NULL,
  `barang_harga` int(11) NOT NULL,
  `barang_satuan` varchar(20) NOT NULL,
  `barang_deskripsi` text,
  `barang_foto` varchar(150) NOT NULL DEFAULT 'non-image.png',
  `barang_kondisi` varchar(20) NOT NULL,
  `barang_maintenance` date NOT NULL,
  `kategori_id` varchar(20) NOT NULL,
  `barang_status` enum('true','false','True','False') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`barang_id`, `barang_nama`, `barang_harga`, `barang_satuan`, `barang_deskripsi`, `barang_foto`, `barang_kondisi`, `barang_maintenance`, `kategori_id`, `barang_status`) VALUES
('BRG001', 'Tenda', 45000, 'Hari', NULL, 'non-image.png', 'Baik', '2019-12-30', 'KTG001', 'true'),
('BRG002', 'Panci', 5000, 'Hari', NULL, 'non-image.png', 'Baik', '2019-12-30', 'KTG002', 'true');

-- --------------------------------------------------------

--
-- Table structure for table `tb_kategori`
--

CREATE TABLE `tb_kategori` (
  `kategori_id` varchar(20) NOT NULL,
  `kategori_nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_kategori`
--

INSERT INTO `tb_kategori` (`kategori_id`, `kategori_nama`) VALUES
('KTG001', 'Tenda'),
('KTG002', 'Alat Masak');

-- --------------------------------------------------------

--
-- Table structure for table `tb_penyewa`
--

CREATE TABLE `tb_penyewa` (
  `penyewa_noidentitas` varchar(20) NOT NULL,
  `penyewa_namadepan` varchar(100) NOT NULL,
  `penyewa_namabelakang` varchar(100) NOT NULL,
  `penyewa_tgllahir` date NOT NULL,
  `penyewa_alamat` text NOT NULL,
  `penyewa_jk` enum('Laki-laki','Perempuan') NOT NULL,
  `penyewa_notelp` varchar(15) NOT NULL,
  `penyewa_email` varchar(100) NOT NULL,
  `penyewa_username` varchar(100) NOT NULL,
  `penyewa_password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `transaksi_id` varchar(20) NOT NULL,
  `barang_id` varchar(20) NOT NULL,
  `penyewa_noidentitas` varchar(20) NOT NULL,
  `transaksi_tgltransaksi` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `transaksi_tglsewa` date NOT NULL,
  `transaksi_tglkembali` date NOT NULL,
  `transaksi_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`admin_noidentitas`);

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`barang_id`);

--
-- Indexes for table `tb_kategori`
--
ALTER TABLE `tb_kategori`
  ADD PRIMARY KEY (`kategori_id`);

--
-- Indexes for table `tb_penyewa`
--
ALTER TABLE `tb_penyewa`
  ADD PRIMARY KEY (`penyewa_noidentitas`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`transaksi_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
