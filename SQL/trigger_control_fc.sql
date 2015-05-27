delimiter $$
CREATE TRIGGER trigger_control_fc
BEFORE INSERT ON Tiene
FOR EACH ROW
BEGIN
	DECLARE filas integer; -- Cantidad de filas max que tiene la partida
	DECLARE columnas integer; -- Cantidad de columnas max que tiena la partida
	SELECT maxFilas INTO filas FROM Partida WHERE codigo_partida = NEW.codigo_partida;
    	SELECT maxColumnas INTO columnas FROM Partida WHERE codigo_partida = NEW.codigo_partida;
	IF ( NEW.fila<=0) OR ( NEW.fila>filas) OR (NEW.columna<=0) OR (NEW.columna>columnas) THEN
    		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'DATOS DE FILAS Y/O COLUMNAS INCORRECTOS';
      	END IF;
END;
$$ delimiter ;

