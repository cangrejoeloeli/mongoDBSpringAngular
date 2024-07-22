
-- SP UPDATE de Telefonía a VERIFICA MySql
-- Fecha: 23-12-2020
-- Autor: Juan Pablo Beloso

-- Para llamarlo: EXEC SP_VER_UPDATE_MailTables @hash= 'hash', @mailNuevo ='mail', @secundario = 0;
CREATE PROCEDURE [dbo].[SP_VER_UPDATE_MailTables]
    @hash varchar(191),
    @mailNuevo varchar(191),
    @secundario BIT
AS
BEGIN
			
	DECLARE @LinkedServer varchar(30)
	SET @LinkedServer = 'VERIFICA_PRODUCCION'
	DECLARE @SQL varchar(8000)
	
	IF @secundario = 0
		BEGIN
			Set  @SQL = 'UPDATE OPENQUERY(' + quotename(@LinkedServer) + ',' + '''' +
						'SELECT mail FROM mail_tables WHERE hash LIKE hashParametro)'+
						' SET mail = mailParametro'
				
			SET @SQL=REPLACE(@SQL,'hashParametro','"'+ @hash + '"'+'''')
			SET @SQL=REPLACE(@SQL,'mailParametro',''''+ @mailNuevo + '''')
			PRINT(@SQL)
			EXEC(@SQL)
		END
		
	-- Si llega un 1 como parámetro significa que se le está agregando un mail secundario
	-- al cliente, entonces debo hacer un INSERT en mail_tables
	ELSE
		BEGIN TRY
		INSERT INTO OPENQUERY(VERIFICA_PRODUCCION,
			'SELECT mail, 
					hash, 
					estado, 
					created_at, 
					updated_at, 
					secundario 
			FROM mail_tables')

		SELECT @mailNuevo,
			   @hash, 
			   0, 
			   GETDATE(), 
			   GETDATE(), 
			   1; 
		END TRY
		BEGIN CATCH
			Set  @SQL = 'UPDATE OPENQUERY(' + quotename(@LinkedServer) + ',' + '''' +
						'SELECT mail FROM mail_tables WHERE hash LIKE hashParametro)'+
						' SET mail = mailParametro'
				
			SET @SQL=REPLACE(@SQL,'hashParametro','"'+ @hash + '"'+'''')
			SET @SQL=REPLACE(@SQL,'mailParametro',''''+ @mailNuevo + '''')
			PRINT(@SQL)
			EXEC(@SQL)
		END CATCH

END

GO

