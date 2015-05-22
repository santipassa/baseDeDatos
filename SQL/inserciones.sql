
-- Insercion en la base de datos usuario
INSERT INTO Usuario(dni,nombre,apellido)
VALUES
("20200789","Jose","Ortiz"),
("20340398","Martin","Ocampo"),
("28374099","Laura","Bustos"),
("30765111","Francisco","Martinez"),
("33456789","Juan","Perez"),
("36300981","Josefina","Campero"),
("36453356","Agustin","Martinez"),
("36453763","Santiago","Passalacqua"),
("37255998","Virginia","Lopez"),
("38339428","Camila","Calcagno"),
("40988772","Mateo","Calcagno");

INSERT INTO `BaseDeDatos`.`Partida`(`codigo_partida`,`dimension_x_tablero`,`dimension_y_tablero`,`fecha_hora_inicio`,`fecha_hora_fin`,`dni_jugador_1`,`dni_jugador_2`,`ganador`)
VALUES
(009,6,7,"2010-10-10 10:00:00","2010-10-10 10:15:00","20200789","20340398","20200789"),
(007,6,7,"2012-06-05 11:00:00","2012-06-05 11:10:00","28374099","38339428","38339428"),
(008,6,7,"2014-06-17 23:00:00","2014-06-17 23:05:00","30765111","33456789","30765111"),
(011,4,5,"2015-11-16 15:30:00","2015-11-16 15:35:00","36300981","36453356","36453356"),
(016,6,7,"2015-02-01 16:00:00","2015-02-01 16:06:00","36453763","37255998","37255998"),
(078,6,7,"2014-08-03 17:00:00","2014-08-03 17:07:00","40988772","38339428","40988772");

INSERT INTO `BaseDeDatos`.`Celda`(`fila`,`columna`)
VALUES
(1,1),
(1,2),
(3,3),
(4,5),
(6,7),
(1,7);

INSERT INTO `BaseDeDatos`.`Tiene`(`codigo_partida`,`orden`,`fila`,`columna`)
VALUES
(7,1,1,1),
(8,2,1,2),
(9,3,1,7),
(11,4,3,3), 
(16,5,4,5);


