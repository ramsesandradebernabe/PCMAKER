-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-11-2016 a las 04:05:30
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `project`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cabinet`
--

CREATE TABLE `cabinet` (
  `id_cabinet` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `formato` varchar(20) NOT NULL,
  `fans` varchar(15) NOT NULL,
  `tamano` varchar(30) NOT NULL,
  `optica` varchar(10) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cabinet`
--

INSERT INTO `cabinet` (`id_cabinet`, `marca`, `modelo`, `tipo`, `formato`, `fans`, `tamano`, `optica`, `precio`) VALUES
('CA00NULO', '0', '0', '0', '0', '0', '0', '0', 0),
('CA01EROBOTX', 'EAGLE WARRIOR', 'Robot X', 'Gamer', 'Full Tower', '5', 'E-ATX', 'SI', 850),
('CA02EROBOTZ', 'EAGLE WARRIOR', 'Robot Z', 'Gamer', 'Full Tower', '5', 'E-ATX', 'SI', 1330),
('CA03AGTBLACK', 'AeroCool', 'GT Black', 'Gamer', 'Mid Tower', '3', 'ATX', 'SI', 530),
('CA04AV2X', 'AeroCool', 'V2X', 'Casual', 'Mid Tower', '2', 'ATX', 'SI', 530),
('CA05ABLATHWK', 'AeroCool', 'BlattleHawk', 'Gamer', 'Full Tower', '4', 'E-ATX', 'SI', 830),
('CA06AXPEDX1', 'AeroCool', 'Xpedator X1', 'Gamer', 'Full Tower', '5', 'E-ATX', 'SI', 930),
('CA07ADSONE', 'AeroCool', 'DS One', 'Gamer', 'Full Tower', '6', 'E-ATX', 'SI', 1550),
('CA08CSPEC03', 'Corsair', 'Spec 03', 'Gamer', 'Mid Tower', '5', 'ATX', 'SI', 1070),
('CA09CSPEC02', 'Corsair', 'Spec 02', 'Gamer', 'Mid Tower', '5', 'ATX', 'SI', 1040),
('CA10C600C', 'Corsair', '600C', 'Casual', 'Mid Tower', '4', 'ATX', 'SI', 2400),
('CA11CSPECALP', 'Corsair', 'Spec Alpha', 'Gamer', 'Mid Tower', '5', 'ATX', 'NO', 1400),
('CA12NPHAN240', 'NZXT', 'Phantom 240', 'Gamer', 'Full Tower', '5', 'E-ATX', 'SI', 1400),
('CA13NS340CA', 'NZXT', 'S340', 'Casual', 'Mid Tower', '5', 'ATX', 'NO', 1230),
('CA14NMANTA', 'NZXT', 'Manta', 'Gamer', 'Mini Tower', '5', 'Mini ITX', 'NO', 2190),
('CA15NPHAN410', 'NZXT', 'Phantom 410', 'Gamer', 'Full Tower', '4', 'E-ATX', 'SI', 1630),
('CA16NH440', 'NZXT', 'H440', 'Casual', 'Mid Tower', '5', 'ATX', 'NO', 2250);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `id_ensamble` varchar(20) NOT NULL,
  `costo` double NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `correo_user` varchar(30) NOT NULL,
  `id_empleado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`id_ensamble`, `costo`, `fecha`, `correo_user`, `id_empleado`) VALUES
('ST03271120162127360', 50010, '27-11-2016', 'max78@gmail.com', 'TPC007210997'),
('ST03271120162127541', 34350, '27-11-2016', 'max78@gmail.com', 'TPC007210997'),
('ST03271120162128162', 30350, '27-11-2016', 'max78@gmail.com', 'TPC007210997'),
('ST03271120162130343', 29510, '27-11-2016', 'donald86@outlook.com', 'TPC007210997'),
('ST03271120162130484', 11920, '27-11-2016', 'donald86@outlook.com', 'TPC007210997'),
('ST03271120162130585', 13550, '27-11-2016', 'donald86@outlook.com', 'TPC007210997'),
('ST03271120162134426', 9890, '27-11-2016', 'Trevor13@outlook.com', 'TPC007210997'),
('ST03271120162134547', 13550, '27-11-2016', 'Trevor13@outlook.com', 'TPC007210997'),
('ST03271120162135159', 7650, '27-11-2016', 'Trevor13@outlook.com', 'TPC007210997'),
('ST0327112016213568', 9890, '27-11-2016', 'Trevor13@outlook.com', 'TPC007210997'),
('ST032711201621372810', 6560, '27-11-2016', 'Manuel@hotmail.com', 'TPC008061189'),
('ST032711201621373811', 10760, '27-11-2016', 'Manuel@hotmail.com', 'TPC008061189'),
('ST032711201621374912', 13550, '27-11-2016', 'Manuel@hotmail.com', 'TPC008061189'),
('ST03271120162138413', 29510, '27-11-2016', 'Manuel@hotmail.com', 'TPC008061189'),
('ST032711201621402414', 13550, '27-11-2016', 'Ale478@gmail.com', 'TPC008061189'),
('ST032711201621404315', 29510, '27-11-2016', 'Ale478@gmail.com', 'TPC008061189'),
('ST032711201621405416', 50010, '27-11-2016', 'Ale478@gmail.com', 'TPC008061189'),
('ST032711201621432917', 29510, '27-11-2016', 'Armand77@gmail.com', 'TPC008061189'),
('ST032711201621434018', 30350, '27-11-2016', 'Armand77@gmail.com', 'TPC008061189'),
('ST032711201621434819', 6560, '27-11-2016', 'Armand77@gmail.com', 'TPC008061189'),
('ST032711201621543620', 10760, '27-11-2016', 'norma34@outlook.com', 'TPC009241292'),
('ST032711201621544621', 13550, '27-11-2016', 'norma34@outlook.com', 'TPC009241292'),
('ST032711201621545722', 30350, '27-11-2016', 'norma34@outlook.com', 'TPC009241292'),
('ST032711201621564523', 50010, '27-11-2016', 'jcdd@msn.com', 'TPC009241292'),
('ST032711201621571025', 9890, '27-11-2016', 'jcdd@msn.com', 'TPC009241292'),
('ST03271120162157124', 34350, '27-11-2016', 'jcdd@msn.com', 'TPC009241292'),
('ST032711201621584026', 9890, '27-11-2016', 'Peytem@gmail.com', 'TPC009241292'),
('ST032711201621584927', 13550, '27-11-2016', 'Peytem@gmail.com', 'TPC009241292'),
('ST032711201621585828', 6560, '27-11-2016', 'Peytem@gmail.com', 'TPC009241292');

--
-- Disparadores `compras`
--
DELIMITER $$
CREATE TRIGGER `borrar_compras` BEFORE DELETE ON `compras` FOR EACH ROW delete from ensambles where id_ensamble=old.id_ensamble
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cpu`
--

CREATE TABLE `cpu` (
  `id_cpu` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `socket` varchar(20) NOT NULL,
  `generacion` varchar(20) NOT NULL,
  `familia` varchar(30) NOT NULL,
  `nucleos` varchar(10) NOT NULL,
  `subprocesos` varchar(10) NOT NULL,
  `frecuencia` varchar(15) NOT NULL,
  `cache` varchar(15) NOT NULL,
  `tdp` int(11) NOT NULL,
  `litografia` varchar(15) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cpu`
--

INSERT INTO `cpu` (`id_cpu`, `marca`, `modelo`, `socket`, `generacion`, `familia`, `nucleos`, `subprocesos`, `frecuencia`, `cache`, `tdp`, `litografia`, `precio`) VALUES
('PR00NULO', '0', '0', '0', '0', '0', '0', '0', '0', '0', 0, '0', 0),
('PR01I3250', 'Intel', 'G3250', 'LGA 1150', '4ta', 'Haswell', '2', '2', '3.2 GHz', '3 MB', 53, '22 nm', 1000),
('PR02I4160', 'Intel', 'Core i3 4160', 'LGA 1150', '4ta', 'Haswell', '2', '4', '3.6 GHz', '3 MB', 54, '22 nm', 2050),
('PR03I4460', 'Intel', 'Core i5 4460', 'LGA 1150', '4ta', 'Haswell', '4', '4', '3.4 GHz', '6 MB', 84, '22 nm', 3120),
('PR04I4790', 'Intel', 'Core i7 4790', 'LGA 1150', '4ta', 'Haswell', '4', '8', '4.0 GHz', '8 MB', 84, '22 nm', 5450),
('PR05I4790K', 'Intel', 'Core i7 4790K', 'LGA 1150', '4ta', 'Haswell', '4', '8', '4.4 GHz', '8 MB', 88, '22 nm', 6430),
('PR06I4400', 'Intel', 'G4400', 'LGA 1151', '6ta', 'Skylake', '2', '2', '3.3 GHz', '3 MB', 54, '14 nm', 1090),
('PR07I4500', 'Intel', 'G4500', 'LGA 1151', '6ta', 'Skylake', '2', '2', '3.5 GHz', '3 MB', 51, '14 nm', 1570),
('PR08I6100', 'Intel', 'Core i3 6100', 'LGA 1151', '6ta', 'Skylake', '2', '4', '3.7 GHz', '3 MB', 51, '14 nm', 2250),
('PR09I6400', 'Intel', 'Core i5 6400', 'LGA 1151', '6ta', 'Skylake', '4', '4', '3.3 GHz', '6 MB', 65, '14 nm', 3400),
('PR10I6500', 'Intel', 'Core i5 6500', 'LGA 1151', '6ta', 'Skylake', '4', '4', '3.6 GHz', '6 MB', 65, '14 nm', 3850),
('PR11I6600', 'Intel', 'Core i5 6600K', 'LGA 1151', '6ta', 'Skylake', '4', '4', '3.9 GHz', '6 MB', 91, '14 nm', 4800),
('PR12I6700', 'Intel', 'Core i7 6700', 'LGA 1151', '6ta', 'Skylake', '4', '8', '4.0 GHz', '8 MB', 65, '14 nm', 6000),
('PR13I6700K', 'Intel', 'Core i7 6700K', 'LGA 1151', '6ta', 'Skylake', '4', '8', '4.2 GHz', '8 MB', 91, '14 nm', 6550),
('PR14A44000', 'AMD', 'A4 4000', 'FM2+', '3ra', 'Richland', '2', '2', '3.0 GHz', '1 MB', 64, '32 nm', 470),
('PR15A46300', 'AMD', 'A4 6300', 'FM2+', '3ra', 'Richland', '2', '2', '3.7 GHz', '1 MB', 65, '32 nm', 640),
('PR16A66400', 'AMD', 'A6 6400K', 'FM2+', '3ra', 'Richland', '4', '2', '3.6 GHz', '1 MB', 65, '32 nm', 740),
('PR17A87650K', 'AMD', 'A8 7650K', 'FM2+', '4ta', 'Kavery', '4', '4', '3.5 GHz', '4 MB', 95, '28 nm', 1630),
('PR18A107700K', 'AMD', 'A10 7700K', 'FM2+', '4ta', 'Kavery', '4', '4', '3.4 GHz', '4 MB', 95, '28 nm', 1920),
('PR19A107850K', 'AMD', 'A10 7850K', 'FM2+', '4ta', 'Kavery', '4', '4', '3.7 GHz', '4 MB', 65, '28 nm', 2100),
('PR20A107870K', 'AMD', 'A10 7870K', 'FM2+', '4ta', 'Kavery', '4', '4', '3.9 GHz', '4 MB', 65, '28 nm', 2450),
('PR21A107890K', 'AMD', 'A10 7890K', 'FM2+', '4ta', 'Kavery', '4', '4', '4.2 GHz', '6 MB', 91, '28 nm', 2850),
('PR22AFX6300', 'AMD', 'FX X6 6300', 'AM3+', '5ta', 'Vishera', '6', '6', '3.5 GHz', '4 MB', 95, '32 nm', 1800),
('PR23AFX8320', 'AMD', 'FX X8 8320', 'AM3+', '5ta', 'Vishera', '8', '8', '4.0 GHz', '8 MB', 125, '32 nm', 2350),
('PR24AFX8350', 'AMD', 'FX X8 8350', 'AM3+', '5ta', 'Vishera', '8', '8', '4.2 GHz', '8 MB', 125, '32 nm', 3050);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `device`
--

CREATE TABLE `device` (
  `id_device` varchar(20) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `sector` varchar(20) NOT NULL,
  `iluminacion` varchar(10) NOT NULL,
  `funcionamiento` varchar(20) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `device`
--

INSERT INTO `device` (`id_device`, `tipo`, `marca`, `modelo`, `sector`, `iluminacion`, `funcionamiento`, `precio`) VALUES
('DE00NULO', '0', '0', '0', '0', '0', '0', 0),
('DE01MLM90', 'Mouse', 'Logitech', 'M90', 'Oficina', 'NO', 'Normal', 90),
('DE02MLM105', 'Mouse', 'Logitech', 'M105', 'Oficina', 'NO', 'Normal', 160),
('DE03MLM187', 'Mouse', 'Logitech', 'M187', 'Oficina', 'NO', 'Normal', 270),
('DE04MEG13', 'Mouse', 'EAGLE WARRIOR', 'G13', 'Gamer', 'SI', 'Normal', 150),
('DE05MEG14', 'Mouse', 'EAGLE WARRIOR', 'G14', 'Gamer', 'SI', 'Normal', 130),
('DE06MEG15', 'Mouse', 'EAGLE WARRIOR', 'G15', 'Gamer', 'SI', 'Normal', 150),
('DE07MEG16', 'Mouse', 'EAGLE WARRIOR', 'G16', 'Gamer', 'SI', 'Normal', 130),
('DE08MLG300S', 'Mouse', 'Logitech', 'G300S', 'Gamer', 'SI', 'Programable', 320),
('DE09MLG302', 'Mouse', 'Logitech', 'G302', 'Gamer', 'SI', 'Programable', 420),
('DE10MLG402', 'Mouse', 'Logitech', 'G402', 'Gamer', 'SI', 'Programable', 490),
('DE11MLG502', 'Mouse', 'Logitech', 'G502 Proteus', 'Gamer', 'SI', 'Programable', 710),
('DE12MLG600', 'Mouse', 'Logitech', 'G600', 'Gamer', 'SI', 'Programable', 600),
('DE13MCKATAR', 'Mouse', 'Corsair', 'Katar', 'Gamer', 'SI', 'Normal', 550),
('DE14MCM65PRGB', 'Mouse', 'Corsair', 'M65 PRO RGB', 'Gamer', 'SI', 'Programable', 990),
('DE15MCSABRE', 'Mouse', 'Corsair', 'Sabre', 'Gamer', 'SI', 'Programable', 1180),
('DE16MCMITAR', 'Mouse', 'Corsair', 'SCIMITAR', 'Gamer', 'SI', 'Programable', 1380),
('DE17MRABYSUS', 'Mouse', 'Razer', 'Abyssus', 'Gamer', 'SI', 'Normal', 700),
('DE18MRMAMBAC', 'Mouse', 'Razer', 'Mamaba Chroma', 'Gamer', 'SI', 'Programable', 1700),
('DE19MRDIAMON', 'Mouse', 'Razer', 'Diamon Back', 'Gamer', 'SI', 'Programable', 1600),
('DE20TLK120', 'Teclado', 'Logitech', 'K120', 'Oficina', 'NO', 'Normal', 170),
('DE21TLG105', 'Teclado', 'Logitech', 'G105', 'Gamer', 'SI', 'Programable', 560),
('DE22TCK30', 'Teclado', 'Corsair', 'K30', 'Gamer', 'SI', 'Programable', 700),
('DE23TCK70CH', 'Teclado', 'Corsair', 'K70 Cherry MX', 'Gamer', 'SI', 'Mecanico', 2090),
('DE24TCK65RA', 'Teclado', 'Corsair', 'K65 Rapidfire', 'Gamer', 'SI', 'Mecanico', 2060),
('DE25TCSTRAFE', 'Teclado', 'Corsair', 'Strafe Cherry MX', 'Gamer', 'SI', 'Mecanico', 2050),
('DE26TRTARTAR', 'Teclado', 'Razer', 'Tartarus Chroma', 'Gamer', 'SI', 'Programable', 1750),
('DE27TRDEATHS', 'Teclado', 'Razer', 'Deathstalker Expert Chroma', 'Gamer', 'SI', 'Programable', 1450),
('DE28TRBWIDOW', 'Teclado', 'Razer', 'BlackWidow', 'Gamer', 'SI', 'Mecanico', 3500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `display`
--

CREATE TABLE `display` (
  `id_display` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `diagonal` varchar(10) NOT NULL,
  `resolucion` varchar(20) NOT NULL,
  `velocidad` varchar(15) NOT NULL,
  `panel` varchar(15) NOT NULL,
  `conexion` varchar(20) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `display`
--

INSERT INTO `display` (`id_display`, `marca`, `modelo`, `diagonal`, `resolucion`, `velocidad`, `panel`, `conexion`, `precio`) VALUES
('DI00NULO', '0', '0', '0', '0', '0', '0', '0', 0),
('DI01SS19E310H', 'Samsung', 'S19E310H', '19"', '1080x720', '5 ms', 'LED', 'HDMI', 1450),
('DI02L22M37AB', 'LG', '22M37A-B', '22"', '1920x1080', '5 ms', 'LED', 'VGA', 1840),
('DI03L24M37HB', 'LG', '24M37H-B', '24"', '1920x1080', '5 ms', 'LED', 'VGA', 2230),
('DI04L27MP37HQB', 'LG', '27MP37HQ-B', '27"', '1920x1080', '4 ms', 'LED IPS', 'VGA/HDMI', 3650),
('DI05SS24E500C', 'Samsung', 'S24E500C', '24"', '1920x1080', '4 ms', 'LED IPS', 'VGA/HDMI', 3100),
('DI06ELF24S', 'EAGLE WARRIOR', 'LF24S', '24"', '1920x1080', '8 ms', 'LED IPS', 'VGA/HDMI', 2630),
('DI07ELK27S', 'EAGLE WARRIOR', 'LK27S', '27"', '1920x1080', '8 ms', 'LED IPS', 'VGA/HDMI', 3320),
('DI08AVX229', 'ASUS', 'VX229', '22"', '1920x1080', '5 ms', 'LED', 'VGA/HDMI', 2650),
('DI09AMX239H', 'ASUS', 'MX239H', '23"', '1920x1080', '5 ms', 'LED', 'VGA/HDMI', 3800),
('DI10AVX279Q', 'ASUS', 'VX279Q', '27"', '1920x1080', '5 ms', 'LED', 'VGA/HDMI/DPORT', 4450),
('DI11AMX279H', 'ASUS', 'MX279H', '27"', '1920x1080', '5 ms', 'LED', 'VGA/HDMI/DPORT', 5450),
('DI12APB278Q', 'ASUS', 'PB278Q', '27"', '2560x1440', '4 ms', 'LED IPS', 'VGA/HDMI/DPORT', 8500),
('DI13APB287Q', 'ASUS', 'PB287Q', '28"', '2560x1440', '4 ms', 'LED IPS', 'VGA/HDMI/DPORT', 11200),
('DI14APG578Q', 'ASUS', 'PG578Q', '27"', '2560x1440', '1 ms', 'LED IPS', 'VGA/HDMI/DPORT', 13900);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id_empleado` varchar(20) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `sexo` varchar(5) NOT NULL,
  `sucursal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id_empleado`, `apellidos`, `nombre`, `sexo`, `sucursal`) VALUES
('TPC007210997', 'Andrade Bernabe', 'Ramses', 'M', 3),
('TPC008061189', 'Macias Guzman', 'Ulises', 'M', 3),
('TPC009241292', 'Becerra Vazquez', 'Trinidad', 'F', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ensambles`
--

CREATE TABLE `ensambles` (
  `id_ensamble` varchar(20) NOT NULL,
  `cpu` varchar(20) NOT NULL,
  `mother` varchar(20) NOT NULL,
  `ram` varchar(20) NOT NULL,
  `gpu` varchar(20) NOT NULL,
  `storage` varchar(20) NOT NULL,
  `power` varchar(20) NOT NULL,
  `cabinet` varchar(20) NOT NULL,
  `display` varchar(20) NOT NULL,
  `mouse` varchar(20) NOT NULL,
  `keyboard` varchar(20) NOT NULL,
  `multimedia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ensambles`
--

INSERT INTO `ensambles` (`id_ensamble`, `cpu`, `mother`, `ram`, `gpu`, `storage`, `power`, `cabinet`, `display`, `mouse`, `keyboard`, `multimedia`) VALUES
('ST03271120162127360', 'PR13I6700K', 'MO25AMAXHER', 'RA26G4TRZ2X43200', 'GP14ASTRIX1080', 'ST20K3SAV480GB', 'PO15CCX600MBR', 'CA02EROBOTZ', 'DI12APB278Q', 'DE19MRDIAMON', 'DE25TCSTRAFE', 'MU22BLZ906'),
('ST03271120162127541', 'PR12I6700', 'MO21AZ170PG', 'RA15K4SAV82666', 'GP13ASTRIX1070', 'ST17S3E85240GB', 'PO05E80PL500BA', 'CA16NH440', 'DI10AVX279Q', 'DE09MLG302', 'DE25TCSTRAFE', 'MU23BLZ623'),
('ST03271120162128162', 'PR24AFX8350', 'MO37G990FXGAM', 'RA03K3HF81866', 'GP12GGTX980Ti', 'ST02S2BA2TB35', 'PO07E80PL600BA', 'CA07ADSONE', 'DI05SS24E500C', 'DE08MLG300S', 'DE22TCK30', 'MU05DKHYCL2'),
('ST03271120162130343', 'PR11I6600', 'MO10GZ170XG3', 'RA14K4SAV82400', 'GP13ASTRIX1070', 'ST09W3BL2TB35', 'PO14CCX500MBR', 'CA08CSPEC03', 'DI05SS24E500C', 'DE08MLG300S', 'DE25TCSTRAFE', 'MU06DKHYCLDR'),
('ST03271120162130484', 'PR18A107700K', 'MO30GG1SA88X', 'RA04K3SAV82133', 'GP00NULO', 'ST13K3UV3120GB', 'PO03E80PL400BA', 'CA12NPHAN240', 'DI08AVX229', 'DE06MEG15', 'DE22TCK30', 'MU26BLZ313'),
('ST03271120162130585', 'PR09I6400', 'MO08GH170G3', 'RA13K4SAV82133', 'GP00NULO', 'ST13K3UV3120GB', 'PO03E80PL400BA', 'CA12NPHAN240', 'DI08AVX229', 'DE04MEG13', 'DE22TCK30', 'MU26BLZ313'),
('ST03271120162134426', 'PR17A87650K', 'MO29GF2A88XMD3HP', 'RA03K3HF81866', 'GP00NULO', 'ST08W3BL1TB35', 'PO03E80PL400BA', 'CA13NS340CA', 'DI02L22M37AB', 'DE03MLM187', 'DE21TLG105', 'MU27BLZ213'),
('ST03271120162134547', 'PR09I6400', 'MO08GH170G3', 'RA13K4SAV82133', 'GP00NULO', 'ST13K3UV3120GB', 'PO03E80PL400BA', 'CA12NPHAN240', 'DI08AVX229', 'DE04MEG13', 'DE22TCK30', 'MU26BLZ313'),
('ST03271120162135159', 'PR06I4400', 'MO18A150MA', 'RA09K4HF82133', 'GP00NULO', 'ST01S2BA1TB35', 'PO03E80PL400BA', 'CA03AGTBLACK', 'DI01SS19E310H', 'DE01MLM90', 'DE20TLK120', 'MU20BLZ150'),
('ST0327112016213568', 'PR17A87650K', 'MO29GF2A88XMD3HP', 'RA03K3HF81866', 'GP00NULO', 'ST08W3BL1TB35', 'PO03E80PL400BA', 'CA13NS340CA', 'DI02L22M37AB', 'DE03MLM187', 'DE21TLG105', 'MU27BLZ213'),
('ST032711201621372810', 'PR16A66400', 'MO27GF2A68HMH', 'RA02K3HF41866', 'GP00NULO', 'ST08W3BL1TB35', 'PO03E80PL400BA', 'CA04AV2X', 'DI01SS19E310H', 'DE01MLM90', 'DE20TLK120', 'MU20BLZ150'),
('ST032711201621373811', 'PR08I6100', 'MO05G150DS3H', 'RA09K4HF82133', 'GP00NULO', 'ST01S2BA1TB35', 'PO03E80PL400BA', 'CA11CSPECALP', 'DI02L22M37AB', 'DE03MLM187', 'DE21TLG105', 'MU27BLZ213'),
('ST032711201621374912', 'PR09I6400', 'MO08GH170G3', 'RA13K4SAV82133', 'GP00NULO', 'ST13K3UV3120GB', 'PO03E80PL400BA', 'CA12NPHAN240', 'DI08AVX229', 'DE04MEG13', 'DE22TCK30', 'MU26BLZ313'),
('ST03271120162138413', 'PR11I6600', 'MO10GZ170XG3', 'RA14K4SAV82400', 'GP13ASTRIX1070', 'ST09W3BL2TB35', 'PO14CCX500MBR', 'CA08CSPEC03', 'DI05SS24E500C', 'DE08MLG300S', 'DE25TCSTRAFE', 'MU06DKHYCLDR'),
('ST032711201621402414', 'PR09I6400', 'MO08GH170G3', 'RA13K4SAV82133', 'GP00NULO', 'ST13K3UV3120GB', 'PO03E80PL400BA', 'CA12NPHAN240', 'DI08AVX229', 'DE04MEG13', 'DE22TCK30', 'MU26BLZ313'),
('ST032711201621404315', 'PR11I6600', 'MO10GZ170XG3', 'RA14K4SAV82400', 'GP13ASTRIX1070', 'ST09W3BL2TB35', 'PO14CCX500MBR', 'CA08CSPEC03', 'DI05SS24E500C', 'DE08MLG300S', 'DE25TCSTRAFE', 'MU06DKHYCLDR'),
('ST032711201621405416', 'PR13I6700K', 'MO25AMAXHER', 'RA26G4TRZ2X43200', 'GP14ASTRIX1080', 'ST20K3SAV480GB', 'PO15CCX600MBR', 'CA02EROBOTZ', 'DI12APB278Q', 'DE19MRDIAMON', 'DE25TCSTRAFE', 'MU22BLZ906'),
('ST032711201621432917', 'PR11I6600', 'MO10GZ170XG3', 'RA14K4SAV82400', 'GP13ASTRIX1070', 'ST09W3BL2TB35', 'PO14CCX500MBR', 'CA08CSPEC03', 'DI05SS24E500C', 'DE08MLG300S', 'DE25TCSTRAFE', 'MU06DKHYCLDR'),
('ST032711201621434018', 'PR24AFX8350', 'MO37G990FXGAM', 'RA03K3HF81866', 'GP12GGTX980Ti', 'ST02S2BA2TB35', 'PO07E80PL600BA', 'CA07ADSONE', 'DI05SS24E500C', 'DE08MLG300S', 'DE22TCK30', 'MU05DKHYCL2'),
('ST032711201621434819', 'PR16A66400', 'MO27GF2A68HMH', 'RA02K3HF41866', 'GP00NULO', 'ST08W3BL1TB35', 'PO03E80PL400BA', 'CA04AV2X', 'DI01SS19E310H', 'DE01MLM90', 'DE20TLK120', 'MU20BLZ150'),
('ST032711201621543620', 'PR08I6100', 'MO05G150DS3H', 'RA09K4HF82133', 'GP00NULO', 'ST01S2BA1TB35', 'PO03E80PL400BA', 'CA11CSPECALP', 'DI02L22M37AB', 'DE03MLM187', 'DE21TLG105', 'MU27BLZ213'),
('ST032711201621544621', 'PR09I6400', 'MO08GH170G3', 'RA13K4SAV82133', 'GP00NULO', 'ST13K3UV3120GB', 'PO03E80PL400BA', 'CA12NPHAN240', 'DI08AVX229', 'DE04MEG13', 'DE22TCK30', 'MU26BLZ313'),
('ST032711201621545722', 'PR24AFX8350', 'MO37G990FXGAM', 'RA03K3HF81866', 'GP12GGTX980Ti', 'ST02S2BA2TB35', 'PO07E80PL600BA', 'CA07ADSONE', 'DI05SS24E500C', 'DE08MLG300S', 'DE22TCK30', 'MU05DKHYCL2'),
('ST032711201621564523', 'PR13I6700K', 'MO25AMAXHER', 'RA26G4TRZ2X43200', 'GP14ASTRIX1080', 'ST20K3SAV480GB', 'PO15CCX600MBR', 'CA02EROBOTZ', 'DI12APB278Q', 'DE19MRDIAMON', 'DE25TCSTRAFE', 'MU22BLZ906'),
('ST032711201621571025', 'PR17A87650K', 'MO29GF2A88XMD3HP', 'RA03K3HF81866', 'GP00NULO', 'ST08W3BL1TB35', 'PO03E80PL400BA', 'CA13NS340CA', 'DI02L22M37AB', 'DE03MLM187', 'DE21TLG105', 'MU27BLZ213'),
('ST03271120162157124', 'PR12I6700', 'MO21AZ170PG', 'RA15K4SAV82666', 'GP13ASTRIX1070', 'ST17S3E85240GB', 'PO05E80PL500BA', 'CA16NH440', 'DI10AVX279Q', 'DE09MLG302', 'DE25TCSTRAFE', 'MU23BLZ623'),
('ST032711201621584026', 'PR17A87650K', 'MO29GF2A88XMD3HP', 'RA03K3HF81866', 'GP00NULO', 'ST08W3BL1TB35', 'PO03E80PL400BA', 'CA13NS340CA', 'DI02L22M37AB', 'DE03MLM187', 'DE21TLG105', 'MU27BLZ213'),
('ST032711201621584927', 'PR09I6400', 'MO08GH170G3', 'RA13K4SAV82133', 'GP00NULO', 'ST13K3UV3120GB', 'PO03E80PL400BA', 'CA12NPHAN240', 'DI08AVX229', 'DE04MEG13', 'DE22TCK30', 'MU26BLZ313'),
('ST032711201621585828', 'PR16A66400', 'MO27GF2A68HMH', 'RA02K3HF41866', 'GP00NULO', 'ST08W3BL1TB35', 'PO03E80PL400BA', 'CA04AV2X', 'DI01SS19E310H', 'DE01MLM90', 'DE20TLK120', 'MU20BLZ150');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `id_equipo` varchar(20) NOT NULL,
  `cpu` varchar(20) NOT NULL,
  `mother` varchar(20) NOT NULL,
  `ram` varchar(20) NOT NULL,
  `gpu` varchar(20) NOT NULL,
  `storage` varchar(20) NOT NULL,
  `power` varchar(20) NOT NULL,
  `cabinet` varchar(20) NOT NULL,
  `display` varchar(20) NOT NULL,
  `mouse` varchar(20) NOT NULL,
  `keyboard` varchar(20) NOT NULL,
  `multimedia` varchar(20) NOT NULL,
  `costo` double NOT NULL,
  `recomendado` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`id_equipo`, `cpu`, `mother`, `ram`, `gpu`, `storage`, `power`, `cabinet`, `display`, `mouse`, `keyboard`, `multimedia`, `costo`, `recomendado`) VALUES
('EQU01BASIC', 'PR06I4400', 'MO18A150MA', 'RA09K4HF82133', 'GP00NULO', 'ST01S2BA1TB35', 'PO03E80PL400BA', 'CA03AGTBLACK', 'DI01SS19E310H', 'DE01MLM90', 'DE20TLK120', 'MU20BLZ150', 7650, 'USO BASICO - INTEL'),
('EQU02BASIC', 'PR16A66400', 'MO27GF2A68HMH', 'RA02K3HF41866', 'GP00NULO', 'ST08W3BL1TB35', 'PO03E80PL400BA', 'CA04AV2X', 'DI01SS19E310H', 'DE01MLM90', 'DE20TLK120', 'MU20BLZ150', 6560, 'USO BASICO - AMD'),
('EQU03OFFICE', 'PR08I6100', 'MO05G150DS3H', 'RA09K4HF82133', 'GP00NULO', 'ST01S2BA1TB35', 'PO03E80PL400BA', 'CA11CSPECALP', 'DI02L22M37AB', 'DE03MLM187', 'DE21TLG105', 'MU27BLZ213', 10760, 'OFICINA - INTEL'),
('EQU04OFFICE', 'PR17A87650K', 'MO29GF2A88XMD3HP', 'RA03K3HF81866', 'GP00NULO', 'ST08W3BL1TB35', 'PO03E80PL400BA', 'CA13NS340CA', 'DI02L22M37AB', 'DE03MLM187', 'DE21TLG105', 'MU27BLZ213', 9890, 'OFICINA - AMD'),
('EQU05WORK', 'PR09I6400', 'MO08GH170G3', 'RA13K4SAV82133', 'GP00NULO', 'ST13K3UV3120GB', 'PO03E80PL400BA', 'CA12NPHAN240', 'DI08AVX229', 'DE04MEG13', 'DE22TCK30', 'MU26BLZ313', 13550, 'TRABAJO - INTEL'),
('EQU06WORK', 'PR18A107700K', 'MO30GG1SA88X', 'RA04K3SAV82133', 'GP00NULO', 'ST13K3UV3120GB', 'PO03E80PL400BA', 'CA12NPHAN240', 'DI08AVX229', 'DE06MEG15', 'DE22TCK30', 'MU26BLZ313', 11920, 'TRABAJO -AMD'),
('EQU07GAMER', 'PR11I6600', 'MO10GZ170XG3', 'RA14K4SAV82400', 'GP13ASTRIX1070', 'ST09W3BL2TB35', 'PO14CCX500MBR', 'CA08CSPEC03', 'DI05SS24E500C', 'DE08MLG300S', 'DE25TCSTRAFE', 'MU06DKHYCLDR', 29510, 'JUGAR - INTEL'),
('EQU08GAMER', 'PR24AFX8350', 'MO37G990FXGAM', 'RA03K3HF81866', 'GP12GGTX980Ti', 'ST02S2BA2TB35', 'PO07E80PL600BA', 'CA07ADSONE', 'DI05SS24E500C', 'DE08MLG300S', 'DE22TCK30', 'MU05DKHYCL2', 30350, 'JUGAR - AMD'),
('EQU09DISEÑO', 'PR12I6700', 'MO21AZ170PG', 'RA15K4SAV82666', 'GP13ASTRIX1070', 'ST17S3E85240GB', 'PO05E80PL500BA', 'CA16NH440', 'DI10AVX279Q', 'DE09MLG302', 'DE25TCSTRAFE', 'MU23BLZ623', 34350, 'DISEÑO GRAFICO'),
('EQU10EXTREMO', 'PR13I6700K', 'MO25AMAXHER', 'RA26G4TRZ2X43200', 'GP14ASTRIX1080', 'ST20K3SAV480GB', 'PO15CCX600MBR', 'CA02EROBOTZ', 'DI12APB278Q', 'DE19MRDIAMON', 'DE25TCSTRAFE', 'MU22BLZ906', 50010, 'RENDIMIENTO EXTREMO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gpu`
--

CREATE TABLE `gpu` (
  `id_gpu` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `memoria` varchar(20) NOT NULL,
  `frecuencia` varchar(20) NOT NULL,
  `tdp` int(11) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `gpu`
--

INSERT INTO `gpu` (`id_gpu`, `marca`, `modelo`, `memoria`, `frecuencia`, `tdp`, `precio`) VALUES
('GP00NULO', '0', '0', '0', '0', 0, 0),
('GP01EGT710', 'EVGA', 'GT 710', '2 GB', '1800 MHz', 90, 770),
('GP02GGT730', 'GIGABYTE', 'GT 730', '2 GB', '1600 MHz', 90, 1150),
('GP03GGT740', 'GIGABYTE', 'GT 740', '2 GB', '5000 MHz', 90, 1800),
('GP04GGTX750Ti', 'GIGABYTE', 'GTX 750 Ti', '4 GB', '5400 MHz', 120, 2950),
('GP05GGTX950XT', 'GIGABYTE', 'GTX 950 XTREME', '2 GB', '7000 MHz', 120, 3200),
('GP06PGTX950XL', 'PNY', 'GTX 950 XLR8 OC', '4 GB', '7200 MHz', 120, 4300),
('GP07GGTX960XT', 'GIGABYTE', 'GTX 960 XTREME', '4 GB', '7010 MHz', 150, 5050),
('GP08ASTRIX960', 'ASUS', 'STRIX 960', '4 GB', '7010 MHz', 150, 4750),
('GP09GGTX970G1', 'GIGABYTE', 'GTX 970 G1', '4 GB', '7000 MHz', 200, 6500),
('GP10ASTRIX970', 'ASUS', 'GTX 970 STRIX', '4 GB', '7000 MHz', 200, 6500),
('GP11EGTX970SC', 'EVGA', 'GTX 970 SC', '4 GB', '7000 MHz', 200, 6500),
('GP12GGTX980Ti', 'GIGABYTE', 'GTX 980 Ti', '6 GB', '7200 MHz', 250, 13500),
('GP13ASTRIX1070', 'ASUS', 'GTX 1070 STRIX', '8 GB', '8008 MHz', 180, 10200),
('GP14ASTRIX1080', 'ASUS', 'GTX 1080 STRIX', '8 GB', '10000 MHz', 200, 15300);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensajes`
--

CREATE TABLE `mensajes` (
  `id_mensaje` int(11) NOT NULL,
  `correo_user` varchar(30) NOT NULL,
  `mensaje` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mother`
--

CREATE TABLE `mother` (
  `id_mother` varchar(20) NOT NULL,
  `socket` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `chipset` varchar(20) NOT NULL,
  `memoria` varchar(15) NOT NULL,
  `frecuencia` int(11) NOT NULL,
  `maximo` varchar(20) NOT NULL,
  `formato` varchar(20) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `mother`
--

INSERT INTO `mother` (`id_mother`, `socket`, `marca`, `modelo`, `chipset`, `memoria`, `frecuencia`, `maximo`, `formato`, `precio`) VALUES
('MO00NULO', '0', '0', '0', '0', '0', 0, '0', '0', 0),
('MO01G81MDS2', 'LGA 1150', 'GIGABYTE', 'H81M-DS2', 'Intel H81', 'DDR3', 1600, '16 GB', 'Micro ATX', 950),
('MO02G81MH', 'LGA 1150', 'GIGABYTE', 'H81M-H', 'Intel H81', 'DDR3', 1600, '16 GB', 'Micro ATX', 900),
('MO03G85MH', 'LGA 1150', 'GIGABYTE', 'B85M-H', 'Intel B85', 'DDR3', 1600, '32 GB', 'Micro ATX', 1250),
('MO04G87HG3', 'LGA 1150', 'GIGABYTE', 'H97 GAMING 3', 'Intel H97', 'DDR3', 1600, '32 GB', 'ATX', 1920),
('MO05G150DS3H', 'LGA 1151', 'GIGABYTE', 'B150-DS3H', 'Intel B150', 'DDR4', 2133, '64 GB', 'Micro ATX', 1400),
('MO06GG1B7', 'LGA 1151', 'GIGABYTE', 'G1 Sniper B7', 'Intel B150', 'DDR4', 2133, '64 GB', 'ATX', 1970),
('MO07GH170DH3', 'LGA 1151', 'GIGABYTE', 'H170-DH3', 'Intel H170', 'DDR4', 2133, '64 GB', 'Micro ATX', 1730),
('MO08GH170G3', 'LGA 1151', 'GIGABYTE', 'H170 GAMING 3', 'Intel H170', 'DDR4', 2133, '64 GB', 'ATX', 2000),
('MO09GZ170XPSLI', 'LGA 1151', 'GIGABYTE', 'Z170-XP-SLI', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 2390),
('MO10GZ170XG3', 'LGA 1151', 'GIGABYTE', 'Z170X GAMING 3', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 2850),
('MO11GZ170XUD3', 'LGA 1151', 'GIGABYTE', 'Z170X-UD3', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 2650),
('MO12GZ170XG5', 'LGA 1151', 'GIGABYTE', 'Z170X GAMING 5', 'Intel Z170', 'DDR4', 3400, '64 GB', 'Micro ATX', 2850),
('MO13GZ170XG6', 'LGA 1151', 'GIGABYTE', 'Z170X GAMING 6', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 3350),
('MO14GZ170XUD5', 'LGA 1151', 'GIGABYTE', 'Z170X-UD5', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 3490),
('MO15GZ170XG7', 'LGA 1151', 'GIGABYTE', 'Z170X GAMING 7', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 4300),
('MO16GZ170XGGT', 'LGA 1151', 'GIGABYTE', 'Z170X GAMING GT', 'Intel Z170', 'DDR4', 3866, '64 GB', 'ATX', 5200),
('MO17GZ170XG1', 'LGA 1151', 'GIGABYTE', 'Z170X GAMING G1', 'Intel Z170', 'DDR4', 3866, '64 GB', 'E-ATX', 8900),
('MO18A150MA', 'LGA 1151', 'ASUS', 'B150M-A', 'Intel B150', 'DDR4', 2133, '32 GB', 'Micro ATX', 1420),
('MO19A150PAU', 'LGA 1151', 'ASUS', 'B150 PRO GAMING AURA', 'Intel B150', 'DDR4', 2133, '64 GB', 'ATX', 2300),
('MO20A150PAUi', 'LGA 1151', 'ASUS', 'B150i PRO GAMING AURA', 'Intel B150', 'DDR4', 2133, '64 GB', 'Mini ITX', 2300),
('MO21AZ170PG', 'LGA 1151', 'ASUS', 'Z170 PRO GAMING', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 3150),
('MO22AZ170PGi', 'LGA 1151', 'ASUS', 'Z170i PRO GAMING', 'Intel Z170', 'DDR4', 3400, '64 GB', 'Mini ITX', 3280),
('MO23AZ170SAMA1', 'LGA 1151', 'ASUS', 'SABERTOOTH MARK 1', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 4780),
('MO24AMAXRAN', 'LGA 1151', 'ASUS', 'MAXIMUS VII RANGER', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 4150),
('MO25AMAXHER', 'LGA 1151', 'ASUS', 'MAXIMUS VII HERO', 'Intel Z170', 'DDR4', 3400, '64 GB', 'ATX', 4300),
('MO26AMAXEXT', 'LGA 1151', 'ASUS', 'MAXIMUS VII EXTREME', 'Intel Z170', 'DDR4', 3400, '64 GB', 'E-ATX', 4150),
('MO27GF2A68HMH', 'FM2+', 'GIGABYTE', 'F2A68HM-H', 'AMD A68H', 'DDR3', 2400, '64 GB', 'Micro ATX', 900),
('MO28GF2A68HMDS2H', 'FM2+', 'GIGABYTE', 'F2A68HM-DS2H', 'AMD A68H', 'DDR3', 2400, '64 GB', 'Micro ATX', 920),
('MO29GF2A88XMD3HP', 'FM2+', 'GIGABYTE', 'F2A88XM-D3HP', 'AMD A88X', 'DDR3', 2400, '64 GB', 'Micro ATX', 1300),
('MO30GG1SA88X', 'FM2+', 'GIGABYTE', 'G1 Sniper A88X', 'AMD A88X', 'DDR3', 2400, '64 GB', 'ATX', 1790),
('MO31G48LMTS2PT', 'AM3+', 'GIGABYTE', '78LMT-S2PT', 'AMD 760G', 'DDR3', 1333, '16 GB', 'Micro ATX', 950),
('MO32G970ADS3P', 'AM3+', 'GIGABYTE', '970A-DS3P', 'AMD 970', 'DDR3', 2000, '32 GB', 'ATX', 1480),
('MO33G970G3', 'AM3+', 'GIGABYTE', '970 GAMING 3', 'AMD 970', 'DDR3', 2000, '32 GB', 'ATX', 1860),
('MO34G970GSLI', 'AM3+', 'GIGABYTE', '970 GAMING SLI', 'AMD 970', 'DDR3', 2000, '64 GB', 'ATX', 2050),
('MO35G990FXAUD3', 'AM3+', 'GIGABYTE', '990FXA-UD3 R5', 'AMD 990FX', 'DDR3', 2000, '32 GB', 'ATX', 2650),
('MO36G990FXAUD5', 'AM3+', 'GIGABYTE', '990FXA-UD5 R5', 'AMD 990FX', 'DDR3', 2000, '32 GB', 'ATX', 2880),
('MO37G990FXGAM', 'AM3+', 'GIGABYTE', '990FX GAMING', 'AMD 990FX', 'DDR3', 2000, '32 GB', 'ATX', 3300),
('MO38ASABERR2', 'AM3+', 'ASUS', 'SABERTOOTH R2', 'AMD 990FX', 'DDR3', 1866, '32 GB', 'ATX', 3500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multimedia`
--

CREATE TABLE `multimedia` (
  `id_multimedia` varchar(20) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `caracteristica` varchar(30) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `multimedia`
--

INSERT INTO `multimedia` (`id_multimedia`, `tipo`, `marca`, `modelo`, `caracteristica`, `precio`) VALUES
('MU00NULO', '0', '0', '0', '0', 0),
('MU01OPBDG', 'Optica', 'Pioneer', 'BDG', 'Grabador BlueRay', 1170),
('MU02OLOEM', 'Optica', 'LG', 'OEM', 'Grabador DVD SATA', 270),
('MU03OLiOEM', 'Optica', 'Liteon', 'SATA OEM', 'Grabador DVD SATA', 270),
('MU04OSOEM', 'Optica', 'Samsung', 'OEM', 'Grabador DVD SATA', 270),
('MU05DKHYCL2', 'Diadema', 'Kingston', 'Hyperx Cloud II', 'Virtual 7.1', 1390),
('MU06DKHYCLDR', 'Diadema', 'Kingston', 'Hyperx Cloud Drone', 'Stereo 2.0', 1390),
('MU07DCH1500', 'Diadema', 'Corsair', 'H1500', 'Dolby 7.1', 1150),
('MU08DCVOIDS', 'Diadema', 'Corsair', 'Void', 'Stereo 2.0', 1200),
('MU09DCVOIDV71', 'Diadema', 'Corsair', 'Void', 'Virtual 7.1', 1480),
('MU10DCVOIDSOR', 'Diadema', 'Corsair', 'Void', 'Sorround', 1480),
('MU11DCVOIDBY71', 'Diadema', 'Corsair', 'Void', 'Dolby 7.1 Wireless', 1990),
('MU12DCRAPTOR30', 'Diadema', 'Corsair', 'Raptor HS30', 'Stereo 2.0', 600),
('MU13DLH111', 'Diadema', 'Logitech', 'H111', 'Stereo 2.0', 130),
('MU14DRKRAKEN', 'Diadema', 'Razer', 'Kraken', 'Virtual 7.1', 1250),
('MU15DRKRAKENP', 'Diadema', 'Razer', 'Kraken Pro', 'Virtual 7.1', 1750),
('MU16DRTIAMAT2', 'Diadema', 'Razer', 'Tiamat', 'Virtual 2.2', 1900),
('MU17DRTIAMAT7', 'Diadema', 'Razer', 'Tiamat', 'Virtual 7.1', 3850),
('MU18DRKRAKENC', 'Diadema', 'Razer', 'Kraken Chroma', 'Virtual 7.1', 1830),
('MU19BLZ50', 'Bocinas', 'Logitech', 'Z50', 'Bluetooth Speaker', 200),
('MU20BLZ150', 'Bocinas', 'Logitech', 'Z150', 'Stereo 2.0', 240),
('MU21BLX300', 'Bocinas', 'Logitech', 'X300', 'Bluetooth Speaker', 240),
('MU22BLZ906', 'Bocinas', 'Logitech', 'Z906', 'THX 5.1', 3900),
('MU23BLZ623', 'Bocinas', 'Logitech', 'Z623', 'THX 2.1', 1720),
('MU24BLZ506', 'Bocinas', 'Logitech', 'Z506', 'Sonido 2.1', 1100),
('MU25BLZ323', 'Bocinas', 'Logitech', 'Z323', 'Sonido 2.1', 650),
('MU26BLZ313', 'Bocinas', 'Logitech', 'Z313', 'Sonido 2.1', 580),
('MU27BLZ213', 'Bocinas', 'Logitech', 'Z213', 'Sonido 2.1', 380);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `power`
--

CREATE TABLE `power` (
  `id_power` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `certificacion` varchar(20) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `formato` varchar(20) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `power`
--

INSERT INTO `power` (`id_power`, `marca`, `modelo`, `capacidad`, `certificacion`, `tipo`, `formato`, `precio`) VALUES
('PO00NULO', '0', '0', 0, '0', '0', '0', 0),
('PO01AKCAS600BR', 'AeroCool', 'KCAS', 600, 'Bronze', 'Normal', 'ATX', 970),
('PO02AKCAS700BR', 'AeroCool', 'KCAS', 700, 'Bronze', 'Normal', 'ATX', 1130),
('PO03E80PL400BA', 'EVGA', '400 80 plus', 400, 'Basica', 'Normal', 'ATX', 610),
('PO04E80PL430BA', 'EVGA', '430 80 plus', 430, 'Basica', 'Normal', 'ATX', 780),
('PO05E80PL500BA', 'EVGA', '500 80 plus', 500, 'Basica', 'Normal', 'ATX', 860),
('PO06EB1PL500BR', 'EVGA', '500 B1 plus', 500, 'Bronze', 'Normal', 'ATX', 970),
('PO07E80PL600BA', 'EVGA', '600 80 plus', 600, 'Basica', 'Normal', 'ATX', 1120),
('PO08EB1PL600BR', 'EVGA', '600 B1 plus', 600, 'Bronze', 'Normal', 'ATX', 1250),
('PO09ESNB1750BR', 'EVGA', 'Supernova B1750', 750, 'Bronze', 'Modular', 'ATX', 1600),
('PO10ESNNX750GO', 'EVGA', 'Supernova NEX750', 750, 'Gold', 'Modular', 'ATX', 2100),
('PO11ESNB2850BR', 'EVGA', 'Supernova B2850', 850, 'Bronze', 'Modular', 'ATX', 1950),
('PO12ESNSL850GO', 'EVGA', 'Supernova Silent 850', 850, 'Gold', 'Modular', 'ATX', 2800),
('PO13ESNG11000GO', 'EVGA', 'Supernova G11000', 1000, 'Gold', 'Modular', 'ATX', 2950),
('PO14CCX500MBR', 'Corsair', 'CX500M', 500, 'Bronze', 'Modular', 'ATX', 1180),
('PO15CCX600MBR', 'Corsair', 'CX600M', 600, 'Bronze', 'Modular', 'ATX', 1420),
('PO16CCX750MBR', 'Corsair', 'CX750M', 750, 'Bronze', 'Modular', 'ATX', 1570),
('PO17CCX850MBR', 'Corsair', 'CX850M', 850, 'Bronze', 'Modular', 'ATX', 2050),
('PO18CCS750MGO', 'Corsair', 'CS750M', 750, 'Gold', 'Modular', 'ATX', 2060),
('PO19CRM650GO', 'Corsair', 'RM650', 650, 'Gold', 'Modular', 'ATX', 2150),
('PO20CRM750GO', 'Corsair', 'RM750', 750, 'Gold', 'Modular', 'ATX', 2350),
('PO21CRM850GO', 'Corsair', 'RM850', 850, 'Gold', 'Modular', 'ATX', 2690),
('PO22CRM1000GO', 'Corsair', 'RM1000', 1000, 'Gold', 'Modular', 'ATX', 3330);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ram`
--

CREATE TABLE `ram` (
  `id_ram` varchar(20) NOT NULL,
  `tipo` varchar(15) NOT NULL,
  `capacidad` varchar(15) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `frecuencia` int(11) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ram`
--

INSERT INTO `ram` (`id_ram`, `tipo`, `capacidad`, `marca`, `modelo`, `frecuencia`, `precio`) VALUES
('RA00NULO', '0', '0', '0', '0', 0, 0),
('RA01K3HF41600', 'DDR3', '4 GB', 'Kingston', 'Hyperx Fury', 1600, 360),
('RA02K3HF41866', 'DDR3', '4 GB', 'Kingston', 'Hyperx Fury', 1866, 380),
('RA03K3HF81866', 'DDR3', '8 GB', 'Kingston', 'Hyperx Fury', 1866, 620),
('RA04K3SAV82133', 'DDR3', '8 GB', 'Kingston', 'Hyperx Savage', 2133, 960),
('RA05K3SAV82400', 'DDR3', '8 GB', 'Kingston', 'Hyperx Savage', 2400, 990),
('RA06K3BEA162400', 'DDR3', '16 GB', 'Kingston', 'Hyperx Beast', 2400, 2200),
('RA07G3TRI162666', 'DDR3', '16 GB', 'Gskill', 'Trident', 2666, 3000),
('RA08C4VE82400', 'DDR4', '8 GB', 'Corsair', 'Vengance', 2400, 650),
('RA09K4HF82133', 'DDR4', '8 GB', 'Kingston', 'Hyperx Fury', 2133, 650),
('RA10K4HF82400', 'DDR4', '8 GB', 'Kingston', 'Hyperx Fury', 2400, 690),
('RA11K4HF82666', 'DDR4', '8 GB', 'Kingston', 'Hyperx Fury', 2666, 720),
('RA12K4HF82800', 'DDR4', '8 GB', 'Kingston', 'Hyperx Fury', 2800, 1050),
('RA13K4SAV82133', 'DDR4', '8 GB', 'Kingston', 'Hyperx Savage', 2133, 900),
('RA14K4SAV82400', 'DDR4', '8 GB', 'Kingston', 'Hyperx Savage', 2400, 950),
('RA15K4SAV82666', 'DDR4', '8 GB', 'Kingston', 'Hyperx Savage', 2666, 850),
('RA16K4SAV82800', 'DDR4', '8 GB', 'Kingston', 'Hyperx Savage', 2800, 1320),
('RA17K4SAV83000', 'DDR4', '8 GB', 'Kingston', 'Hyperx Savage', 3000, 1180),
('RA18K4SAV2X82800', 'DDR4', '2x8 GB', 'Kingston', 'Hyperx Savage', 2800, 2750),
('RA19K4SAV2X83000', 'DDR4', '2x8 GB', 'Kingston', 'Hyperx Savage', 3000, 3100),
('RA20G4RJA2X82133', 'DDR4', '2x8 GB', 'Gskill', 'Rip Jaws', 2133, 2600),
('RA21G4RJA2X82400', 'DDR4', '2x8 GB', 'Gskill', 'Rip Jaws', 2400, 2750),
('RA22G4RJA2X82666', 'DDR4', '2x8 GB', 'Gskill', 'Rip Jaws', 2666, 2890),
('RA23G4RJA2X82800', 'DDR4', '2x8 GB', 'Gskill', 'Rip Jaws', 2800, 2950),
('RA24G4RJA2X83000', 'DDR4', '2x8 GB', 'Gskill', 'Rip Jaws', 3000, 3340),
('RA25G4RJA2X42666', 'DDR4', '2x4 GB', 'Gskill', 'Rip Jaws', 2666, 1450),
('RA26G4TRZ2X43200', 'DDR4', '2x4 GB', 'Gskill', 'Trident Z', 3200, 1900);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `storage`
--

CREATE TABLE `storage` (
  `id_storage` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `formato` varchar(10) NOT NULL,
  `interface` varchar(20) NOT NULL,
  `capacidad` varchar(15) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `storage`
--

INSERT INTO `storage` (`id_storage`, `marca`, `modelo`, `tipo`, `formato`, `interface`, `capacidad`, `precio`) VALUES
('ST00NULO', '0', '0', '0', '0', '0', '0', 0),
('ST01S2BA1TB35', 'Seagate', 'Barracuda', 'HDD', '3.5', 'SATA II', '1 TB', 900),
('ST02S2BA2TB35', 'Seagate', 'Barracuda', 'HDD', '3.5', 'SATA II', '2 TB', 1200),
('ST03S2BA3TB35', 'Seagate', 'Barracuda', 'HDD', '3.5', 'SATA II', '3 TB', 1550),
('ST04S2BA4TB35', 'Seagate', 'Barracuda', 'HDD', '3.5', 'SATA II', '4 TB', 2200),
('ST05S3BA1TB35', 'Seagate', 'Barracuda', 'HDD', '3.5', 'SATA III', '1 TB', 1000),
('ST06S3BA2TB35', 'Seagate', 'Barracuda', 'HDD', '3.5', 'SATA III', '2 TB', 1500),
('ST07S3BA4TB35', 'Seagate', 'Barracuda', 'HDD', '3.5', 'SATA III', '4 TB', 3000),
('ST08W3BL1TB35', 'Western Digital', 'Blue', 'HDD', '3.5', 'SATA III', '1 TB', 950),
('ST09W3BL2TB35', 'Western Digital', 'Blue', 'HDD', '3.5', 'SATA III', '2 TB', 1100),
('ST10W3BL3TB35', 'Western Digital', 'Blue', 'HDD', '3.5', 'SATA III', '3 TB', 1500),
('ST11W3BL4TB35', 'Western Digital', 'Blue', 'HDD', '3.5', 'SATA III', '4 TB', 2500),
('ST12W3BK4TB35', 'Western Digital', 'Black', 'HDD', '3.5', 'SATA III', '4 TB', 3200),
('ST13K3UV3120GB', 'Kingston', 'UV300', 'SSD', '2.5', 'SATA III', '120 GB', 660),
('ST14K3UV4240GB', 'Kingston', 'UV400', 'SSD', '2.5', 'SATA III', '240 GB', 1120),
('ST15K3HFU120GB', 'Kingston', 'Hyperx Fury', 'SSD', '2.5', 'SATA III', '120 GB', 900),
('ST16K3HFU240GB', 'Kingston', 'Hyperx Fury', 'SSD', '2.5', 'SATA III', '240 GB', 1550),
('ST17S3E85240GB', 'Samsung', 'EVO 850', 'SSD', '2.5', 'SATA III', '240 GB', 1900),
('ST18S3E85480GB', 'Samsung', 'EVO 850', 'SSD', '2.5', 'SATA III', '480 GB', 3300),
('ST19K3SAV240GB', 'Kingston', 'Hyperx Savage', 'SSD', '2.5', 'SATA III', '240 GB', 1850),
('ST20K3SAV480GB', 'Kingston', 'Hyperx Savage', 'SSD', '2.5', 'SATA III', '480 GB', 2660),
('ST21K3PRE240GB', 'Kingston', 'Hyperx Predator', 'SSD', '2.5', 'SATA III', '240 GB', 3540),
('ST22K3PRE480GB', 'Kingston', 'Hyperx Predator', 'SSD', '2.5', 'SATA III', '480 GB', 6650);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursal`
--

CREATE TABLE `sucursal` (
  `id_sucursal` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `direccion` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `sucursal`
--

INSERT INTO `sucursal` (`id_sucursal`, `nombre`, `direccion`) VALUES
(1, 'TU MEJOR OPCION', 'Av. Siempreviva #742'),
(2, 'RINCON TECNOLOGICO', 'Av. Spooner #103'),
(3, 'TOPE DE GAMA', 'Av. Privet Drive #4');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `correo` varchar(30) NOT NULL,
  `nickname` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `id_sucursal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`correo`, `nickname`, `apellidos`, `nombre`, `password`, `id_sucursal`) VALUES
('Ale478@gmail.com', 'Alexis', 'Gutierrez Flores', 'Alexis', 'alexis', 3),
('Armand77@gmail.com', 'Armando', 'García Guzmán', 'Armando', 'Armando', 3),
('donald86@outlook.com', 'doni', 'stephenson ware', 'Donald', 'doni89', 3),
('jcdd@msn.com', 'Carlos', 'López Gutierrez', 'Juan', 'jcdd', 3),
('Manuel@hotmail.com', 'Manolo', 'Ceron Macias', 'Manuel', 'manuel', 3),
('max78@gmail.com', 'Max', 'García suarez', 'Maximiliano', 'max', 3),
('norma34@outlook.com', 'norma', 'García Robles', 'Norma', 'norma', 3),
('Peytem@gmail.com', 'Peyton', 'Elway marshal', 'Peyton', 'peyton', 3),
('Trevor13@outlook.com', 'T13vor', 'Sieman Manning', 'Trevor', 'Trevor13', 3);

--
-- Disparadores `usuarios`
--
DELIMITER $$
CREATE TRIGGER `borrar_mensajes` BEFORE DELETE ON `usuarios` FOR EACH ROW delete from mensajes where correo_user=old.correo
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `borrar_usuario` BEFORE DELETE ON `usuarios` FOR EACH ROW delete from compras where correo_user=old.correo
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cabinet`
--
ALTER TABLE `cabinet`
  ADD PRIMARY KEY (`id_cabinet`);

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`id_ensamble`),
  ADD KEY `fkcorreo_user_idx` (`correo_user`),
  ADD KEY `id_empd_idx` (`id_empleado`);

--
-- Indices de la tabla `cpu`
--
ALTER TABLE `cpu`
  ADD PRIMARY KEY (`id_cpu`);

--
-- Indices de la tabla `device`
--
ALTER TABLE `device`
  ADD PRIMARY KEY (`id_device`);

--
-- Indices de la tabla `display`
--
ALTER TABLE `display`
  ADD PRIMARY KEY (`id_display`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id_empleado`),
  ADD KEY `jefe_idx` (`sucursal`);

--
-- Indices de la tabla `ensambles`
--
ALTER TABLE `ensambles`
  ADD PRIMARY KEY (`id_ensamble`),
  ADD KEY `cpu_idx` (`cpu`),
  ADD KEY `id_mother_idx` (`mother`),
  ADD KEY `id_ram_idx` (`ram`),
  ADD KEY `id_gpu_idx` (`gpu`),
  ADD KEY `id_storage_idx` (`storage`),
  ADD KEY `id_power_idx` (`power`),
  ADD KEY `id_case_idx` (`cabinet`),
  ADD KEY `id_display_idx` (`display`),
  ADD KEY `id_device_idx` (`mouse`),
  ADD KEY `id_multimedia_idx` (`multimedia`),
  ADD KEY `fkid_keyboard_idx` (`keyboard`);

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`id_equipo`),
  ADD KEY `id_cpu_idx` (`cpu`),
  ADD KEY `id_mother_idx` (`mother`),
  ADD KEY `id_ram_idx` (`ram`),
  ADD KEY `id_gpu_idx` (`gpu`),
  ADD KEY `id_storage_idx` (`storage`),
  ADD KEY `id_power_idx` (`power`),
  ADD KEY `id_case_idx` (`cabinet`),
  ADD KEY `id_display_idx` (`display`),
  ADD KEY `id_device_idx` (`mouse`),
  ADD KEY `id_multimedia_idx` (`multimedia`),
  ADD KEY `id_keyboard_idx` (`keyboard`);

--
-- Indices de la tabla `gpu`
--
ALTER TABLE `gpu`
  ADD PRIMARY KEY (`id_gpu`);

--
-- Indices de la tabla `mensajes`
--
ALTER TABLE `mensajes`
  ADD PRIMARY KEY (`id_mensaje`),
  ADD KEY `correo_user_idx` (`correo_user`);

--
-- Indices de la tabla `mother`
--
ALTER TABLE `mother`
  ADD PRIMARY KEY (`id_mother`);

--
-- Indices de la tabla `multimedia`
--
ALTER TABLE `multimedia`
  ADD PRIMARY KEY (`id_multimedia`);

--
-- Indices de la tabla `power`
--
ALTER TABLE `power`
  ADD PRIMARY KEY (`id_power`);

--
-- Indices de la tabla `ram`
--
ALTER TABLE `ram`
  ADD PRIMARY KEY (`id_ram`);

--
-- Indices de la tabla `storage`
--
ALTER TABLE `storage`
  ADD PRIMARY KEY (`id_storage`);

--
-- Indices de la tabla `sucursal`
--
ALTER TABLE `sucursal`
  ADD PRIMARY KEY (`id_sucursal`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`correo`),
  ADD KEY `id_suc_idx` (`id_sucursal`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mensajes`
--
ALTER TABLE `mensajes`
  MODIFY `id_mensaje` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `fkcorreo_user` FOREIGN KEY (`correo_user`) REFERENCES `usuarios` (`correo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_ensamble` FOREIGN KEY (`id_ensamble`) REFERENCES `ensambles` (`id_ensamble`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_empd` FOREIGN KEY (`id_empleado`) REFERENCES `empleados` (`id_empleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `suc` FOREIGN KEY (`sucursal`) REFERENCES `sucursal` (`id_sucursal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ensambles`
--
ALTER TABLE `ensambles`
  ADD CONSTRAINT `fkid_cabinet` FOREIGN KEY (`cabinet`) REFERENCES `cabinet` (`id_cabinet`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_cpu` FOREIGN KEY (`cpu`) REFERENCES `cpu` (`id_cpu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_device` FOREIGN KEY (`mouse`) REFERENCES `device` (`id_device`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_display` FOREIGN KEY (`display`) REFERENCES `display` (`id_display`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_gpu` FOREIGN KEY (`gpu`) REFERENCES `gpu` (`id_gpu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_keyboard` FOREIGN KEY (`keyboard`) REFERENCES `device` (`id_device`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_mother` FOREIGN KEY (`mother`) REFERENCES `mother` (`id_mother`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_multimedia` FOREIGN KEY (`multimedia`) REFERENCES `multimedia` (`id_multimedia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_power` FOREIGN KEY (`power`) REFERENCES `power` (`id_power`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_ram` FOREIGN KEY (`ram`) REFERENCES `ram` (`id_ram`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkid_storage` FOREIGN KEY (`storage`) REFERENCES `storage` (`id_storage`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD CONSTRAINT `id_cabinet` FOREIGN KEY (`cabinet`) REFERENCES `cabinet` (`id_cabinet`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_cpu` FOREIGN KEY (`cpu`) REFERENCES `cpu` (`id_cpu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_device` FOREIGN KEY (`mouse`) REFERENCES `device` (`id_device`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_display` FOREIGN KEY (`display`) REFERENCES `display` (`id_display`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_gpu` FOREIGN KEY (`gpu`) REFERENCES `gpu` (`id_gpu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_keyboard` FOREIGN KEY (`keyboard`) REFERENCES `device` (`id_device`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_mother` FOREIGN KEY (`mother`) REFERENCES `mother` (`id_mother`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_multimedia` FOREIGN KEY (`multimedia`) REFERENCES `multimedia` (`id_multimedia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_power` FOREIGN KEY (`power`) REFERENCES `power` (`id_power`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_ram` FOREIGN KEY (`ram`) REFERENCES `ram` (`id_ram`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_storage` FOREIGN KEY (`storage`) REFERENCES `storage` (`id_storage`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `mensajes`
--
ALTER TABLE `mensajes`
  ADD CONSTRAINT `correo_user` FOREIGN KEY (`correo_user`) REFERENCES `usuarios` (`correo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `id_suc` FOREIGN KEY (`id_sucursal`) REFERENCES `sucursal` (`id_sucursal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
