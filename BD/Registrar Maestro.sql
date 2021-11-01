CREATE PROCEDURE RegistrarMaestro

--Parametros de entrada

@inUsuario VARCHAR(64),
@inContrasena VARCHAR(64),
@inCodigo INT

AS

BEGIN
SET NOCOUNT ON

		--Realiza el insert del maestro
		INSERT INTO dbo.Usuario(IdTipoUsuario, Usuario, Contra, Codigo)

		VALUES(2, @inUsuario, ENCRYPTBYPASSPHRASE('Contrasena', @inContrasena), @inCodigo);

SET NOCOUNT OFF
END

--EXEC RegistrarMaestro 'kquesada', 'Quesada456', 20209874

--SELECT * FROM Usuario