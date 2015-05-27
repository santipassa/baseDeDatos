-- MOTOR DE BASE DE DATOS UTILIZADO: MySQL


DROP SCHEMA IF EXISTS connect4BD;
CREATE SCHEMA connect4BD;
USE connect4BD;
--
-- TABLA DE USUARIOS
--
CREATE TABLE Usuario
 (dni varchar(8) primary key, 
nombre varchar(30) not null,
 apellido varchar(30) not null);


CREATE TABLE Partida
(codigo_partida integer not null primary key auto_increment, 
maxFilas integer not null, 
maxColumnas integer not null,
fecha_hora_inicio datetime not null, 
fecha_hora_fin datetime not null,
dni_jugador_1 varchar(8) not null, 
dni_jugador_2 varchar(8) not null, 
ganador varchar(8),
constraint fk_jugador_1 foreign key (dni_jugador_1) references Usuario(dni) on delete cascade on update cascade, 
constraint fk_jugador_2 foreign key (dni_jugador_2) references Usuario(dni) on delete cascade on update cascade);

-- TABLA DE CELDAS
CREATE TABLE Celda 
(fila integer not null,
columna integer not null,
constraint pri primary key(fila,columna));

-- TABLA DE RELACION TIENE
CREATE TABLE Tiene 
(codigo_partida integer not null, 
orden integer not null, 
fila integer not null,
columna integer not null,
constraint kprimary primary key (codigo_partida,fila,columna),
constraint fk_par foreign key (codigo_partida) references Partida(codigo_partida) on delete cascade on update cascade,
constraint fk_fil foreign key (fila,columna) references Celda(fila,columna) on delete cascade on update cascade);

-- TABLA DE AUDITORIA DE LA BASE DE DATOS
CREATE TABLE baja_usuarios
(id integer not null primary key auto_increment,
	 dni varchar(8),
	 nombre varchar(30) not null,
	 apellido varchar(30) not null,
	 user_db varchar(30) not null,
	 fecha date not null
	 );


