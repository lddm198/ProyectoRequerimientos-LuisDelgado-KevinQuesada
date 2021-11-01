CREATE PROCEDURE RegistrarAdministrador

--Parametros de entrada

@inUsuario VARCHAR(64),
@inContrasena VARCHAR(64)

AS

BEGIN
SET NOCOUNT ON

		--Realiza el insert del administrador
		INSERT INTO dbo.Usuario(IdTipoUsuario, Usuario, Contra)

		VALUES(1, @inUsuario, ENCRYPTBYPASSPHRASE('Contrasena', @inContrasena));

SET NOCOUNT OFF
END

--EXEC RegistrarAdministrador 'ldelgado', 'Delgado123'

--SELECT * FROM Usuario