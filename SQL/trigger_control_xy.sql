delimiter $$
CREATE TRIGGER trigger_control_xy
BEFORE INSERT ON Celda
FOR EACH ROW
BEGIN
	CREATE VIEW join_Partida_Tiene AS SELECT Partida.codigo_partida,fila,columna,orden FROM Partida,Tiene where NEW.fila=Tiene.fila and NEW.columna=Tiene.columna;
	CREATE VIEW join_celda AS SELECT * FROM Celda NATURAL JOIN join_Partida_Tiene;
	IF (NEW.fila>=0) and (NEW.fila<=join_Partida_Tiene.dimension_y_tablero) AND 
		(NEW.columna>=0) and (NEW.columna<=join_Partida_Tiene.dimension_x_tablero) THEN
		INSERT INTO Celda values (new.fila,new.columna);
END;
$$ delimiter ;
