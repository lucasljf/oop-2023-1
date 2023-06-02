-- Adminer 4.8.1 MySQL 5.5.5-10.5.19-MariaDB-1:10.5.19+maria~ubu2004 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP DATABASE IF EXISTS `base_cliente`;
CREATE DATABASE `base_cliente` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `base_cliente`;

DROP TABLE IF EXISTS `tb_cidade`;
CREATE TABLE `tb_cidade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `estado` varchar(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `tb_cidade` (`id`, `nome`, `estado`) VALUES
(1,	'Teste1',	'SP'),
(2,	'Teste2',	'TO'),
(3,	'Teste3',	'GO'),
(4,	'Teste4',	'MG'),
(5,	'Teste5',	'SP');

DROP TABLE IF EXISTS `tb_cliente`;
CREATE TABLE `tb_cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `idade` int(11) NOT NULL,
  `id_cidade` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cidade` (`id_cidade`),
  CONSTRAINT `tb_cliente_ibfk_1` FOREIGN KEY (`id_cidade`) REFERENCES `tb_cidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `tb_cliente` (`id`, `nome`, `idade`, `id_cidade`) VALUES
(1,	'Fulano',	20,	3);

-- 2023-06-02 19:48:52

