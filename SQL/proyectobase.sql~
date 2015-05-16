CREATE TABLE Usuario
 (dni varchar(8) primary key, 
nombre varchar(30) not null,
 apellido varchar(30) not null);
CREATE TABLE Partida
(codigo_partida integer not null primary key, 
dimension_x_tablero integer not null, 
dimension_y_tablero integer not null,
fecha_hora_inicio datetime not null, 
fecha_hora_fin datetime not null,
dni_jugador_1 varchar(8) not null, 
dni_jugador_2 varchar(8) not null, 
dni_ganador varchar(8) not null,
constraint fk1 foreign key (dni_jugador_1) references Usuario(dni) on delete cascade, 
constraint fk2 foreign key (dni_jugador_2) references Usuario(dni) on delete cascade,
constraint fk3 foreign key (dni_ganador) references Usuario(dni) on delete cascade);
CREATE TABLE Celda 
(id_celda integer not null primary key auto_increment,
fila integer not null,
columna integer not null);