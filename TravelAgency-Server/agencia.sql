-- phpMyAdmin SQL Dump
-- version 4.6.6deb4+deb9u1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 14-09-2020 a las 11:47:26
-- Versión del servidor: 10.1.45-MariaDB-0+deb9u1
-- Versión de PHP: 7.0.33-0+deb9u9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `agencia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `customers`
--

CREATE TABLE `customers` (
  `id` varchar(15) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `customers`
--

INSERT INTO `customers` (`id`, `first_name`, `last_name`, `address`, `mobile`, `email`, `gender`) VALUES
('98000001', 'Wilson Libardo', 'Pantoja Yepez', 'Santa Barbara Popayan', '3125487825', 'wpantoja@gmail.com', 'M'),
('98000002', 'Maria Alexandra', 'Santos Cardenas', 'Calle 12 no. 12 - 12 Popayan', '3234545', 'marita@gmail.com', 'F'),
('98000003', 'Ivan', 'Duque', 'Bogota', '32323232', 'duque@unicauca.edu.co', 'M');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
