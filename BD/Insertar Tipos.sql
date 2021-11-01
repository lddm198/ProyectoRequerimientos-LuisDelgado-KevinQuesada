CREATE PROCEDURE InsertarTiposUsuario

--Parametro de entrada

@inTipo VARCHAR(64)

AS

BEGIN
SET NOCOUNT ON

		INSERT INTO dbo.TipoUsuario(Tipo)
		VALUES(@inTipo)

SET NOCOUNT OFF
END