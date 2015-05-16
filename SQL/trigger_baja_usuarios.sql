delimiter $$
CREATE TRIGGER trigger_baja_usuarios
AFTER DELETE ON Usuario
FOR EACH ROW
BEGIN
	INSERT INTO baja_usuarios (dni,nombre,apellido,user_db,fecha) VALUES (OLD.dni,
									OLD.nombre,OLD.apellido, CURRENT_USER(), CURRENT_DATE() );
END;
$$ delimiter ;