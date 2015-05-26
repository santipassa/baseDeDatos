delimiter $$
CREATE TRIGGER trigger_control_xy
BEFORE INSERT ON Tiene
FOR EACH ROW
BEGIN
	DECLARE filas integer; -- Cantidad de filas max que tiene la partida
	DECLARE columnas integer; -- Cantidad de columnas max que tiena la partida
    SELECT maxFilas INTO filas FROM Partida WHERE codigo_partida = NEW.codigo_partida;
    SELECT maxColumnas INTO columnas FROM Partida WHERE codigo_partida = NEW.codigo_partida;
	IF ( NEW.fila>0) AND ( NEW.fila<=filas) AND (NEW.columna>0) AND (NEW.columna<=columnas) THEN
    	INSERT INTO Tiene (codigo_partida,orden,fila,columna) VALUES (NEW.codigo_partida,NEW.orden,NEW.fila,NEW.columna);
    END IF;
END;
$$ delimiter ;

