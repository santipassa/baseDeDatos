delimiter $$
CREATE TRIGGER trigger_control_solapamiento
BEFORE INSERT ON Partida
FOR EACH ROW
BEGIN
	DECLARE fechaHoraFin datetime; -- fecha de finalizacion de la partida 
	
	SELECT fecha_hora_fin INTO fechaHoraFin FROM Partida WHERE 
	(((dni_jugador_1 = NEW.dni_jugador_1) OR
	 (dni_jugador_2 = NEW.dni_jugador_1) OR 
	 (dni_jugador_1 = NEW.dni_jugador_2) OR 
	 (dni_jugador_2 = NEW.dni_jugador_2)) AND  (fecha_hora_fin='0000-00-00 00:00:00')
	);
    	
	IF ( fechaHoraFin='0000-00-00 00:00:00') THEN
    		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'NO SE PUEDE INSERTAR POR QUE ALGUN JUGADOR TIENE UNA PARTIDA SIN TERMINAR';
      	END IF;
END;
$$ delimiter ;
