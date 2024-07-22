
-- SP Insert de Telefonía a VERIFICA MySql
-- Fecha: 23-12-2020
-- Autor: Juan Pablo Beloso
--UPDATES--
-- * 15/04/2021 - Recibe por parámetros id en vez de buscar MAX(id) en la tabla mails_clientes
--				- Se modificó la funcionalidad para permitir insertar sólo mails secundarios

-- La funcionalidad completa comprende:

-- * Insertar sólo un mail primario
-- * Insertar sólo un mail secundario
-- * Insertar un mail primario y un secundario



CREATE PROCEDURE [dbo].[SP_VER_INSERT_MailTables2]
	@id BIGINT,
	@solo_secundario BIT = 0  --Si está en 0 guarda el mail comun. Si está en 1 guarda solo el secundario.
AS
BEGIN
SET NOCOUNT ON


	DECLARE @mail VARCHAR(90)
	DECLARE @hash VARCHAR(900)
	DECLARE @secundario BIT
	DECLARE @validado BIT
	DECLARE @creada TIMESTAMP
	DECLARE @modificada TIMESTAMP

	SET @secundario = (SELECT SECUNDARIO FROM mails_clientes WHERE MAIL_ID = @id)

	SET @mail = (SELECT EMAIL FROM mails_clientes WHERE MAIL_ID = @id)
	SET @hash = (SELECT HASH FROM mails_clientes WHERE MAIL_ID = @id)

	IF @secundario = 1 
		BEGIN
			DECLARE @mailSecundario VARCHAR(90)
			DECLARE @hashSecundario VARCHAR(900)
			SET @mailSecundario = (SELECT MAIL_SECUNDARIO FROM mails_clientes WHERE MAIL_ID = @id)
			SET @hashSecundario = (SELECT HASH_SECUNDARIO FROM mails_clientes WHERE MAIL_ID = @id)	
		END

	BEGIN TRY  
	
	IF @solo_secundario = 0
			BEGIN
				INSERT INTO OPENQUERY(VERIFICA_PRODUCCION,
				'SELECT mail, 
						hash, 
						estado, 
						created_at, 
						updated_at, 
						secundario 
				FROM mail_tables')

				SELECT @mail, 
					   @hash,
						0, 
						GETDATE(), 
						GETDATE(), 
						0; 
			END	
	
		
	IF @secundario = 1 
		BEGIN
			INSERT INTO OPENQUERY(VERIFICA_PRODUCCION,
			'SELECT mail, 
					hash, 
					estado, 
					created_at, 
					updated_at, 
					secundario 
			FROM mail_tables')

	SELECT @mailSecundario, 
		   @hashSecundario,
			0, 
			GETDATE(), 
			GETDATE(), 
			1; 	
		END
	END TRY  
	BEGIN CATCH  
		PRINT 'Inserción no realizada por duplicado de HASH'
	END CATCH
	

 
END

GO

