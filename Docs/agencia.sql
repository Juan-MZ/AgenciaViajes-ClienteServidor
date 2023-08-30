-- phpMyAdmin SQL Dump
-- version 4.6.6deb4
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 17-05-2020 a las 17:09:00
-- Versión del servidor: 10.1.44-MariaDB-0+deb9u1
-- Versión de PHP: 7.0.33-0+deb9u7

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
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cedula` varchar(15) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `movil` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `fecha_nac` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cedula`, `nombres`, `apellidos`, `direccion`, `movil`, `email`, `sexo`, `fecha_nac`) VALUES
('98000001', 'Wilson Libardo', 'Pantoja Yepez', 'Santa Barbara Popayan', '3125487825', 'wpantoja@gmail.com', 'M', '1978-05-06'),
('98000002', 'Maria Alexandra', 'Santos Cardenas', 'Calle 12 no. 12 - 12 Popayan', '3234545', 'marita@gmail.com', 'F', '2000-05-18');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cedula`),
  ADD UNIQUE KEY `email_idx` (`email`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
