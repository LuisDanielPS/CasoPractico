CREATE DATABASE Cinelitas;
use Cinelitas; 

CREATE TABLE `salas` ( 
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sala` varchar(100) NOT NULL, 
  PRIMARY KEY (`id`) 
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `salas` VALUES (1,'Sala 1'),(2,'Sala 2'),(3,'Sala 3'),(4,'Sala 4'),(5,'Sala 5');

CREATE TABLE `peliculas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `salas_id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `costo` varchar(45) NOT NULL,
  `capacidad` varchar(45) NOT NULL,
  `fecha` varchar(100) NOT NULL,
  
  PRIMARY KEY (`id`,`salas_id`),
  KEY `fk_peliculas_salas_idx` (`salas_id`),
  CONSTRAINT `fk_peliculas_salas` FOREIGN KEY (`salas_id`) REFERENCES `salas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
  ) ;

INSERT INTO `peliculas` VALUES (1,1,'Black Panther','3500','100 Personas','9 de Marzo');
INSERT INTO `peliculas` VALUES (2,2,'Tesla','2000','50 Personas','9 de Marzo');
INSERT INTO `peliculas` VALUES (3,3,'Seven','3000','30 Personas','10 de Marzo');
INSERT INTO `peliculas` VALUES (4,4,'Joker','4500','70 Personas','10 de Marzo');
INSERT INTO `peliculas` VALUES (5,5,'Dora','1500','30 Personas','11 de Marzo');