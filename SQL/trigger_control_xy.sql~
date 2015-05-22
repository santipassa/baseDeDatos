delimiter $$
CREATE TRIGGER trigger_control_xy
BEFORE INSERT ON Celda
FOR EACH ROW
BEGIN
	CREATE VIEW join_Celda_Tiene AS SELECT Tiene.id_celda,fila,columna,codigo_partida,orden FROM Celda,Tiene where NEW.id_celda=Tiene.id_celda;
	CREATE VIEW join_partida AS SELECT * FROM Partida NATURAL JOIN join_Celda_Tiene;
	IF NEW.fila>=0 and NEW.fila<=join_partida.dimension_y_tablero AND 
		NEW.columna>=0 and NEW.columna<=join_partida.dimension_x_tablero THEN
		INSERT INTO Celda values(new.id_celda,new.fila,new.columna);
END;
$$ delimiter ;
