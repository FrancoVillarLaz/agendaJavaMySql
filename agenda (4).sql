-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-06-2024 a las 20:42:59
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `agenda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contactos`
--

CREATE TABLE `contactos` (
  `id` int(11) NOT NULL,
  `DNI` varchar(10) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `apellido` varchar(40) NOT NULL,
  `correo` varchar(40) NOT NULL,
  `direccion` varchar(40) DEFAULT NULL,
  `localidad` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contactos`
--

INSERT INTO `contactos` (`id`, `DNI`, `nombre`, `apellido`, `correo`, `direccion`, `localidad`) VALUES
(1, '44.236.871', 'Franco', 'Villar', 'franco@gmail.com', 'formosa 251', 'mendoza'),
(2, '44141414', '{{{', 'lll', 'lllll@asdsa.com', 'dsad', 'asdsa'),
(3, 'asd', 'asd', 'asda', 'asd', 'asd', 'asd'),
(4, '44236888', 'asdas', 'asdasd', 'asdsa', 'asdad', 'sadasd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuariocontacto`
--

CREATE TABLE `usuariocontacto` (
  `idUsuario` int(11) NOT NULL,
  `idContacto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuariocontacto`
--

INSERT INTO `usuariocontacto` (`idUsuario`, `idContacto`) VALUES
(3, 3),
(4, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  `correo` varchar(40) NOT NULL,
  `contraseña` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `correo`, `contraseña`) VALUES
(1, 'admin', 'admin@gmail.com', '$2a$10$XIm6gzoZJm8Yrh6kvMHbN.1/LM27r8Z85A3iMltU64FXSJvZlcQOu'),
(2, 'pana', 'asdas@gmail.com', '$2a$10$QXUHaWpAfPhmbIT0VLqjRO.1Q1cK9dOs465B5wWS4dnqEOmq9TrYG'),
(3, 'cumpa', 'prueba@gmail.com', '$2a$10$y.cFMdU7KYFWBrXoMWv.6ui.hamPoamE0w2cJ6dVGrjn5Kb2rTEv6'),
(4, 'prueba2', 'prueba2@gmail.com', '$2a$10$LSxpStKkPn7RemxuNDyQaeIuItvPDszzxkiP9BMPABcSubKypUIOe'),
(5, 'prueba5', 'prueba50@gmail.com', '$2a$10$aEOaXceFoNV2icTki.Wp8u9KvGK0polOCVOnt0iSDNMpj6sunXESq');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contactos`
--
ALTER TABLE `contactos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuariocontacto`
--
ALTER TABLE `usuariocontacto`
  ADD PRIMARY KEY (`idUsuario`,`idContacto`),
  ADD KEY `usuariocontacto_ibfk_2` (`idContacto`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contactos`
--
ALTER TABLE `contactos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuariocontacto`
--
ALTER TABLE `usuariocontacto`
  ADD CONSTRAINT `usuariocontacto_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuariocontacto_ibfk_2` FOREIGN KEY (`idContacto`) REFERENCES `contactos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
