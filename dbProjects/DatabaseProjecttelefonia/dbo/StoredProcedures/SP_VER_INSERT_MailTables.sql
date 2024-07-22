
-- SP Insert de Telefonía a VERIFICA MySql
-- Fecha: 23-12-2020
-- Autor: Juan Pablo Beloso

CREATE PROCEDURE [dbo].[SP_VER_INSERT_MailTables]
AS
BEGIN
SET NOCOUNT ON

	DECLARE @id INT
	DECLARE @mail VARCHAR(90)
	DECLARE @hash VARCHAR(900)
	DECLARE @secundario BIT
	DECLARE @validado BIT
	DECLARE @creada TIMESTAMP
	DECLARE @modificada TIMESTAMP

	SET @id = (SELECT MAIL_ID FROM mails_clientes
	WHERE MAIL_ID = ( SELECT MAX(MAIL_ID) FROM mails_clientes ))

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

