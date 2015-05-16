--MOTOR DE BASE DE DATOS UTILIZADO: MySQL


DROP SCHEMA IF EXISTS connect4BD;
CREATE SCHEMA connect4BD;
USE connect4BD;
--
--TABLA DE USUARIOS
--
CREATE TABLE Usuario
 (dni varchar(8) primary key, 
nombre varchar(30) not null,
 apellido varchar(30) not null);


CREATE TABLE Partida
(codigo_partida integer not null primary key auto_increment, 
dimension_x_tablero integer not null, 
dimension_y_tablero integer not null,
fecha_hora_inicio datetime not null, 
fecha_hora_fin datetime not null,
dni_jugador_1 varchar(8) not null, 
dni_jugador_2 varchar(8) not null, 
dni_ganador varchar(8) ,
constraint fk_jugador_1 foreign key (dni_jugador_1) references Usuario(dni) on delete cascade on update cascade, 
constraint fk_jugador_2 foreign key (dni_jugador_2) references Usuario(dni) on delete cascade on update cascade,
constraint fk_jugador_ganador foreign key (dni_ganador) references Usuario(dni) on delete cascade on update cascade) ;

--TABLA DE CELDAS
CREATE TABLE Celda 
(id_celda integer not null primary key auto_increment,
fila integer not null,
columna integer not null);
<<<<<<< HEAD
=======

--TABLA DE RELACION TIENE
CREATE TABLE Tiene 
(codigo_partida integer not null, 
id_celda integer not null, 
orden integer not null, 
constraint pk primary key (codigo_partida,id_celda),
constraint fk_partida foreign key (codigo_partida) references Partida(codigo_partida) on delete cascade on update cascade,
constraint fk_celda foreign key (id_celda) references Celda(id_celda) on delete cascade on update cascade );

--TABLA DE AUDITORIA DE LA BASE DE DATOS
CREATE TABLE baja_usuarios
(id integer not null primary key auto_increment,
	 dni varchar(8),
	 nombre varchar(30) not null,
	 apellido varchar(30) not null,
	 user_db varchar(30) not null,
	 fecha date not null
	 );


