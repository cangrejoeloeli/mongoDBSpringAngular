
CREATE PROCEDURE [dbo].[VER_ValidacionLocal]
AS
BEGIN
SET NOCOUNT ON

CREATE TABLE #temp1(id bigint,
				   cis varchar(190),
				   mail varchar(190),
				   hash varchar(190),
				   estado tinyint,
				   created_at datetime,
				   updated_at datetime,
				   secundario bit,
				   )
				   
CREATE TABLE #temp2(id bigint,
				   cis varchar(190),
				   mail varchar(190),
				   hash varchar(190),
				   estado tinyint,
				   created_at datetime,
				   updated_at datetime,
				   secundario bit,
				   )
				   
TRUNCATE TABLE #temp1
TRUNCATE TABLE #temp2

-- Inserto mails validados PRIMARIOS
INSERT INTO #temp1
SELECT * FROM OPENQUERY(VERIFICA_PRODUCCION,
'SELECT * FROM mail_tables 
 WHERE estado = 1 AND secundario = 0 AND cis LIKE ""');

-- Inserto los mails validados SECUNDARIOS				   
INSERT INTO #temp2
SELECT * FROM OPENQUERY(VERIFICA_PRODUCCION,
'SELECT * FROM mail_tables 
 WHERE estado = 1 AND secundario = 1');
 

-- Hago un update de los mails verificados primarios en SQL

UPDATE mails_clientes
SET 
VALIDADO=1,
fecha_validacion_web = GETDATE()
FROM mails_clientes cli
INNER JOIN
#temp1 temp1
ON cli.HASH = temp1.hash
WHERE cli.VALIDADO= 0 

-- Hago un update de los mails verificados secundarios en SQL

UPDATE mails_clientes
SET 
VALIDACION_SEC=1,
fecha_v_web_sec = GETDATE()
FROM mails_clientes cli
INNER JOIN
#temp2 temp2
ON cli.HASH_SECUNDARIO = temp2.hash
WHERE cli.VALIDACION_SEC = 0 


DROP TABLE #temp1
DROP TABLE #temp2

END

GO

