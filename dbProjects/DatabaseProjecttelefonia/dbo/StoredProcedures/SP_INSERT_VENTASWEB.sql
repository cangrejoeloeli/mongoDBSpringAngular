
-- SP Insert de CLIENTES a VENTAS WEB 66.97.43.108
-- Fecha: 11-06-2021
-- Autor: Juan Pablo Beloso

CREATE PROCEDURE [dbo].[SP_INSERT_VENTASWEB]
AS
BEGIN
SET NOCOUNT ON

-- Truncate TABLE Clientes VENTASWEB MYSQL

DECLARE @MyTable VARCHAR(100)
DECLARE @SQL NVARCHAR(MAX)
SET @MyTable = 'clientes'
SET @SQL = ('TRUNCATE TABLE ' + @MyTable + ';')

EXECUTE (@SQL) AT VENTASWEB_PRODUCCION

-- Table temporal para obtener datos de Clientes_servicios

IF OBJECT_ID(N'telefonia..#clientes_temporal') IS NOT NULL
BEGIN
	DROP TABLE #clientes_temporal
END

CREATE TABLE #clientes_temporal(
	[CLIENTE_ID] [int],
	[CLIENTE_SERVICIO_ID] [int],
	[PLAN_COMERCIAL_ID] [int],
	[CIS] [varchar](15), 
	[servicio_tipo] [varchar](15), 
	[nombre] [varchar](50),
	[tipo_documento] [varchar](15),
	[DOCUMENTO] [varchar](20),
	[calle_postal] [varchar](40),
	[NUMERO_P] [int],
	[PISO_P] [varchar](3),
	[DTO_P] [varchar](3),
	[calle] [varchar](40),
	[NUMERO] [int],
	[PISO] [varchar](3),
	[DTO] [varchar](3),
	[te_contacto] [nvarchar](30),
	[email] [varchar](61),
	[condicion_impositiva] [varchar](40),
	[estado_servicio] [varchar](20))

-- Table temporal para obtener datos de Facturas_s por CLIENTE_SERVICIO_ID

IF OBJECT_ID(N'telefonia..#deudas') IS NOT NULL
BEGIN
	DROP TABLE #deudas
END
CREATE TABLE #deudas (
	[CLIENTE_SERVICIO_ID] [int],
	[cant_facturas] [int],
	[deuda] [decimal](15,2)
)

INSERT INTO #clientes_temporal 
SELECT 
			   CLIENTE_ID,
			   CLIENTE_SERVICIO_ID,
			   PLAN_COMERCIAL,	
			   CIS,
			   CASE
					WHEN SERVICIO LIKE 'Telefonia' AND (SIP = 0 OR SIP is NULL)  THEN 'TELEFONÍA'
					WHEN SERVICIO LIKE 'Telefonia' AND SIP = 1 THEN 'TELEFONÍA SIP'
					WHEN SERVICIO LIKE 'Internet' AND (wifi = 0 OR wifi is NULL) AND (FTTH = 0 OR FTTH is NULL)  THEN 'ADSL'
					WHEN SERVICIO LIKE 'Internet' AND wifi = 1 AND (FTTH = 0 OR FTTH is NULL)   THEN 'WIFI'
					WHEN SERVICIO LIKE 'Internet' AND (wifi = 0 OR wifi is NULL) AND FTTH = 1  THEN 'FTTH'
					ELSE ' '
					END as servicio_tipo,
			   Nombre_cliente,
			   CASE
					WHEN CHARINDEX('-',DOCUMENTO) > 0  THEN 'CUIT/CUIL'
					ELSE 'DNI'
					END as tipo_documento,
			   DOCUMENTO, 
			   CAST(calle_postal as varchar(80)),
			   NUMERO_P,
			   CAST(PISO_P as varchar(3)),
			   DTO_P,
			   nombre_calle,
			   NUMERO,
			   CAST(PISO as varchar(3)),
			   DTO,
			   CASE
			   WHEN te_contacto is null THEN ' '
			   ELSE te_contacto
			   END as telefono,
			   CASE
			   WHEN email is null THEN ' '
			   ELSE email
			   END as mail,
			   CASE
					WHEN CLASIFICACION_IVA_ID = 1 THEN 'Consumidor final'
					WHEN CLASIFICACION_IVA_ID = 2 THEN 'Responsable inscripto'
					WHEN CLASIFICACION_IVA_ID = 4 THEN 'Exento'
					WHEN CLASIFICACION_IVA_ID = 5 THEN 'Monotributista'
					WHEN CLASIFICACION_IVA_ID = 6 THEN 'Responsable no categorizado'
					WHEN CLASIFICACION_IVA_ID = 7 THEN 'RNI'
					ELSE ' '
					END as condicion_impositiva,
			   CASE 
					WHEN ESTADO = 3 THEN 'Habilitado'
					WHEN ESTADO = 4 THEN 'Baja'
					WHEN ESTADO = 5 THEN 'Suspendido'
					WHEN ESTADO = 6 THEN 'Cortado'
					END as estado_servicio

FROM Clientes_servicios
WHERE ESTADO IN (3,4,5,6)

-- Insertar facturas con deuda

INSERT INTO #deudas
SELECT  fa.CLIENTE_SERVICIO_ID,
		COUNT(c.CLIENTE_SERVICIO_ID)as cant, 
		CONVERT(DECIMAL(15,2),SUM(fa.saldo)) as deuda
		--SUM(fa.saldo) as deuda
		
FROM #clientes_temporal c
INNER JOIN Facturas_s fa ON c.CLIENTE_SERVICIO_ID = fa.CLIENTE_SERVICIO_ID
WHERE fa.QUE_ES = 'Factura' AND SALDO > 0 AND FECHA_VENCIMIENTO < GETDATE()
GROUP BY fa.CLIENTE_SERVICIO_ID


BEGIN TRY
	INSERT INTO OPENQUERY(VENTASWEB_PRODUCCION,
				'SELECT 
						cliente_id,
						cliente_servicio_id,
						cis, 
						servicio,
						nombre_completo,
						tipo_documento,
						documento, 
						calle_postal, 
						numero_postal, 
						piso_postal,
						dto_postal,
						calle,
						numero,
						piso,
						dto,
						telefono,
						email,
						condicion_impositiva,
						cant_facturas_deudas,
						saldo,
						estado_servicio,
						plan_actual
						
								FROM clientes')

	SELECT c.CLIENTE_ID,
		   c.CLIENTE_SERVICIO_ID,
		   c.CIS,
		   c.servicio_tipo,
		   c.nombre,
		   c.tipo_documento,
		   c.DOCUMENTO,
		   c.calle_postal,
		   c.NUMERO_P,
		   c.PISO_P,
		   c.DTO_P,
		   c.calle,
		   c.NUMERO,
		   c.PISO,
		   c.DTO,
		   c.te_contacto,
		   c.email,
		   c.condicion_impositiva,
		   CASE
				WHEN  d.cant_facturas > 0 THEN  d.cant_facturas
				ELSE 0
		   END AS cant_facturas,
		   CASE
				WHEN  d.deuda > 0 THEN  d.deuda
				ELSE 0
		   END AS deuda,
		   c.estado_servicio,
		   p.DESCRIPCION 
		   as plan_actual
	 
	 FROM #clientes_temporal c
	 LEFT JOIN #deudas d ON c.CLIENTE_SERVICIO_ID = d.CLIENTE_SERVICIO_ID
	 INNER JOIN plan_comercial p ON c.PLAN_COMERCIAL_ID = p.PLAN_COMERCIAL_ID;
	 
END TRY
BEGIN CATCH  
		PRINT 'Inserción no realizada'
END CATCH
	

 
END

GO

