--Se añaden los 3 tipos de ususario

EXEC InsertarTiposUsuario 'Administrador'

GO

EXEC InsertarTiposUsuario 'Maestro'

GO

EXEC InsertarTiposUsuario 'Aprendiz'

GO

SELECT * FROM TipoUsuario
