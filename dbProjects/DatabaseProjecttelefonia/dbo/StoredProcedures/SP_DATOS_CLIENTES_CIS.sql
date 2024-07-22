
-- SP SELECT de consulta a SQL DATOS CLIENTES
-- Fecha: 21-04-2021
-- Autor: Juan Pablo Beloso

CREATE PROCEDURE [dbo].[SP_DATOS_CLIENTES_CIS]
	@cis VARCHAR(15)
AS
BEGIN
SET NOCOUNT ON

	BEGIN TRY  
		SELECT * FROM clientes_servicios WHERE
		CIS LIKE @cis
	END TRY  
	BEGIN CATCH  
		PRINT 'No se encuentra el usuario con el parámetro enviado'
	END CATCH
	

 
END

GO

