

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
* @author Sol Serna
* @authorJessica Serna

 * Created: 8/11/2022
 */


DROP DATEBASE RecursosIUD;
CREATE DATABASE IF NOT EXISTS RecursosIUD;-- CREA LA BD

USE recursosIUD; -- SELECCIONA BD


/**CREACION TABLAS
**/

CREATE TABLE tipos_identificacion (
 id INT NOT NULL AUTO_INCREMENT,
nombre_identificacion VARCHAR(45)NOT NULL,
descripcion VARCHAR(45) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE estado_civil (
 id INT NOT NULL AUTO_INCREMENT,
nombre_estado_civil VARCHAR(45) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE funcionarios (
 id INT NOT NULL AUTO_INCREMENT,
nombres VARCHAR(45) NOT NULL,
apellidos VARCHAR(45) NOT NULL,
numero_identificacion VARCHAR(45 )NOT NULL,
sexo VARCHAR(45) NOT NULL,
direccion VARCHAR(45) NOT NULL,
telefono VARCHAR(45) NOT NULL,
fecha_nacimiento DATE 
tipos_identificacion_id INT NOT NULL,
estado_civil_id INT NOT NULL,
PRIMARY KEY (id),
UNIQUE(numero_identificacion),
FOREIGN KEY (tipos_identificacion_id) REFERENCES tipos_identificacion (id),
FOREIGN KEY (estado_civil_id) REFERENCES estado_civil (id)
);

CREATE TABLE parentesco (
 id INT NOT NULL AUTO_INCREMENT,
nombre_parentesco VARCHAR(45) NOT NULL,
PRIMARY KEY (id)
);


CREATE TABLE grupo_familiar (
 id INT NOT NULL AUTO_INCREMENT,
nombre_familiar VARCHAR(45) NOT NULL,
telefono VARCHAR(45) NOT NULL,
direccion VARCHAR(45) NOT NULL,
funcionarios_id INT NOT NULL,
parentesco_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (funcionarios_id) REFERENCES funcionarios (id),
FOREIGN KEY (parentesco_id) REFERENCES parentesco (id)
);

CREATE TABLE niveles_estudio (
 id INT NOT NULL AUTO_INCREMENT,
nombre_nivel_estudio VARCHAR(45) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE universidades (
 id INT NOT NULL AUTO_INCREMENT,
nombre_universidad VARCHAR(45)NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE titulos_ academicos (
 id INT NOT NULL AUTO_INCREMENT,
nombre_titulo1 VARCHAR(45) NOT NULL,
nombre_titulo2 VARCHAR(45) NULL,
PRIMARY KEY (id)
);

CREATE TABLE formacion_academica (
 id INT NOT NULL AUTO_INCREMENT,
fecha_inicio DATE NOT NULL,
fecha_final DATE NOT NULL,
titulos_academicos_id INT NOT NULL,
niveles_estudio_id INT NOT NULL,
universidades_id INT NOT NULL,
funcionarios_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (titulos_academicos_id) REFERENCES titulos_academicos (id),
FOREIGN KEY (niveles_estudio_id) REFERENCES niveles_estudio (id)
FOREIGN KEY (universidades_id) REFERENCES universidades (id),
FOREIGN KEY (funcionarios_id) REFERENCES funcionarios (id)
);

--POPULATION


INSERT INTO tipos_identificacion (nombre_identificacion,descripcion)
VALUES ('CC', 'cedula ciudadania');
INSERT INTO tipos_identificacion (nombre_identificacion,descripcion)
VALUES ('TI', 'tarjeta identidad');
INSERT INTO tipos_identificacion (nombre_identificacion,descripcion)
VALUES ('CE', 'cedula extranjeria');
INSERT INTO tipos_identificacion (nombre_identificacion,descripcion)
VALUES ('PS', 'pasaporte');
INSERT INTO tipos_identificacion (nombre_identificacion,descripcion)
VALUES ('RC', 'registro civil');


INSERT INTO estado_civil (nombre_estado_civil)
VALUES ('casado');
INSERT INTO estado_civil (nombre_estado_civil)
VALUES ('soltero');
INSERT INTO estado_civil (nombre_estado_civil)
VALUES ('union libre');
INSERT INTO estado_civil (nombre_estado_civil)
VALUES ('vuido');
INSERT INTO estado_civil (nombre_estado_civil)
VALUES ('divorciado');


--HACER POPULATION 

INSERT INTO estado_civil (
    nombre_estado_civil)
VALUES ('union libre');


INSERT INTO funcionarios (
nombres,
apellidos,
numero_identificacion,
sexo,
direccion,
telefono,
fecha_nacimiento 
tipos_identificacion_id,
estado_civil_id I,
VALUES ('Sol','Serna','112856789','femenino','cra 48b # 98-98','4569878','1992-09-09',1,2);



