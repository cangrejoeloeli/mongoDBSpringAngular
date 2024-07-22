
CREATE PROCEDURE [dbo].[SP_VER_INSERT_CisMailTables]

AS
BEGIN

-- Selecciono todos los registros que estén en MySql pero que no estén en SQL Server

INSERT INTO dbo.mails_con_cis(ID_TABLA,
						  CIS,
						  EMAIL,
						  TELEFONO,
						  VALIDADO,
						  GAS,
						  FECHA) 

SELECT *
FROM OPENQUERY(VERIFICA_PRODUCCION,
			'SELECT 
			 id,
		     cis,
		     mail,
		     telefono,
		     estado,
		     CASE
               WHEN SUBSTRING(cis, 2, 2) like "01" 
                     THEN 1
                  ELSE 0 END AS gas, 
            NULL AS fecha
			FROM mail_table_cis')
WHERE cis IN (
SELECT cis
FROM OPENQUERY(VERIFICA_PRODUCCION,
			'SELECT *
			 FROM mail_table_cis')
EXCEPT

SELECT cis FROM dbo.mails_con_cis
)

                                                                                                                                                
END

GO

