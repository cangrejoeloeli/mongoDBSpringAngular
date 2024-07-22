
-- SP SELECT de consulta a SQL DATOS CLIENTES
-- Fecha: 15-03-2021
-- Autor: Juan Pablo Beloso

CREATE PROCEDURE [dbo].[SP_DATOS_CLIENTES]
	@user VARCHAR(90)
AS
BEGIN
SET NOCOUNT ON


	BEGIN TRY  
		SELECT * FROM clientes_servicios WHERE
		USER_NAME LIKE @user
	END TRY  
	BEGIN CATCH  
		PRINT 'No se encuentra el usuario con el parámetro enviado'
	END CATCH
	

 
END

GO

