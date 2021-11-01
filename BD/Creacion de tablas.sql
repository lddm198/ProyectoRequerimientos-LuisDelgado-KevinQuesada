--Se crean las tablas necesarias para la base

CREATE TABLE Usuario (
Id INT PRIMARY KEY IDENTITY,
IdTipoUsuario INT NOT NULL,
Usuario VARCHAR(64) NOT NULL,
Contra VARBINARY(255) NOT NULL,		--ENCRYPTBYPASSPHRASE('password', @inPass) (para encriptar la contraseña)
Codigo INT,							--Codigo de la federacion
)

GO

CREATE TABLE TipoUsuario (
Id INT PRIMARY KEY IDENTITY,
Tipo INT NOT NULL
)

GO

CREATE TABLE Publicacion(
Id INT PRIMARY KEY IDENTITY,
IdProf INT NOT NULL,
Texto VARCHAR(MAX) NOT NULL
)

GO

CREATE TABLE Comentario(
Id INT PRIMARY KEY IDENTITY,
IdPublicacion INT NOT NULL,
IdUsuario INT NOT NULL,
Texto VARCHAR(64) NOT NULL
)

GO

CREATE TABLE PublicacionGuardada(
Id INT PRIMARY KEY IDENTITY,
IdPublicacion INT NOT NULL,
IdUsuario INT NOT NULL
)

GO
