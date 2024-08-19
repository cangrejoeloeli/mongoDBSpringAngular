-- LISTADO DE CLIENTES PARA PADRON
SELECT [TIPO_DOC], [CLAVE], [NUMERO_DOC], [DIGITO_VERIFICADOR], [DOCUMENTO], [CLIENTE_ID], [nombre_calle], [NUMERO], LC.LOCALIDAD, CL.[CODIGO_POSTAL], [FISICA_JURIDICA], [APELLIDO_NOMBRES_RAZON_SOCIAL]
FROM [telefonia].[dbo].[clientes] AS CL
    LEFT JOIN localidades AS LC
    ON LC.LOCALIDAD_ID=CL.LOCALIDAD_ID
ORDER BY NUMERO_DOC ASC

-- LISTADO DE SERVICIOS PARA PADRON
SELECT [CLIENTE_ID], [CLIENTE_SERVICIO_ID], [CIS], [NUMERADOR_HIJOS], [CODIGO_CALLE], [NUMERO], [SERVICIO], [TIPO_DOC], [CLAVE], [NUMERO_DOC], [DIGITO_VERIFICADOR], [DOCUMENTO], [partida], [Nombre_cliente], [nombre_titular], [nombre_fantasia]
FROM [telefonia].[dbo].[Clientes_servicios] AS CS

-- CLIENTES SIN SERVICIOS
SELECT
    C.CLIENTE_ID, C.TIPO_DOC, C.DOCUMENTO,
    S.CLIENTE_ID, S.CLIENTE_SERVICIO_ID, S.TIPO_DOC, S.DOCUMENTO
FROM clientes AS C
    LEFT JOIN Clientes_servicios AS S
    ON C.CLIENTE_ID = S.CLIENTE_ID
WHERE S.TIPO_DOC IS NULL

-- SERVICIOS SIN CLIENTE
SELECT
    C.CLIENTE_ID, C.TIPO_DOC, C.DOCUMENTO,
    S.CLIENTE_ID, S.CLIENTE_SERVICIO_ID, S.TIPO_DOC, S.DOCUMENTO
FROM clientes AS C
    RIGHT JOIN Clientes_servicios AS S
    ON C.CLIENTE_ID = S.CLIENTE_ID
WHERE C.TIPO_DOC IS NULL

-- SERVICIOS CON DOC TIPO DOC != CLIENTES
SELECT TOP 3
    C.CLIENTE_ID, C.TIPO_DOC, C.DOCUMENTO,
    S.CLIENTE_ID, S.CLIENTE_SERVICIO_ID, S.TIPO_DOC, S.DOCUMENTO
FROM clientes AS C
    INNER JOIN Clientes_servicios AS S
    ON C.CLIENTE_ID = S.CLIENTE_ID
WHERE C.TIPO_DOC <> S.TIPO_DOC

-- SERVICIOS CON TIPO DOC DISTINTO A CLIENTE
SELECT COUNT(*) AS TIPO_DISTINTO
FROM clientes AS C
    INNER JOIN Clientes_servicios AS S
    ON C.CLIENTE_ID = S.CLIENTE_ID
WHERE C.TIPO_DOC <> S.TIPO_DOC

-- SERVICIOS CON TIPO DOC DISTINTO A CLIENTE
SELECT COUNT(*) AS DOC_DISTINTO
FROM clientes AS C
    INNER JOIN Clientes_servicios AS S
    ON C.CLIENTE_ID = S.CLIENTE_ID
WHERE C.DOCUMENTO <> S.DOCUMENTO

-- SERVICIOS CON TIPO O DOC DISTINTO A CLIENTE
SELECT COUNT(*) AS DOCoTIPO_DISTINTOS
FROM clientes AS C
    INNER JOIN Clientes_servicios AS S
    ON C.CLIENTE_ID = S.CLIENTE_ID
WHERE C.DOCUMENTO <> S.DOCUMENTO
    OR C.TIPO_DOC <> S.TIPO_DOC

-- SERVICIOS CON TIPO Y DOC DISTINTO A CLIENTE
SELECT COUNT(*) AS DOCYTIPO_DISTINTOS
FROM clientes AS C
    INNER JOIN Clientes_servicios AS S
    ON C.CLIENTE_ID = S.CLIENTE_ID
WHERE C.DOCUMENTO <> S.DOCUMENTO
    AND C.TIPO_DOC <> S.TIPO_DOC

-- TOTAL CLIENTES
SELECT COUNT(*) AS NRO_CLIENTES
FROM clientes

-- TOTAL SERVICIOS
SELECT COUNT(*) AS NRO_SERVICIOS
FROM Clientes_servicios

-- CANTIDAD DE SERVICIOS POR ESTADO
SELECT Clientes_servicios.ESTADO , COUNT(*) as CANTIDAD
FROM Clientes_servicios
GROUP BY ESTADO

-- CANTIDAD DE SERVICIOS POR TIPO_DOC
SELECT Clientes_servicios.TIPO_DOC , COUNT(*) as CANTIDAD
FROM Clientes_servicios
GROUP BY TIPO_DOC

-- CANTIDAD POR ESTADO Y SERVICIO
SELECT SERVICIO, ESTADO, COUNT(SERVICIO) AS CANTIDAD
FROM Clientes_servicios
GROUP BY SERVICIO, ESTADO
ORDER BY SERVICIO, ESTADO

-- NOMBRE DISTINTOS EN SERVICIO
SELECT
    CL.APELLIDO_NOMBRES_RAZON_SOCIAL AS C_NOMBRE,
    SR.CLIENTE_SERVICIO_ID AS SERVICIO_ID,
    SR.CIS AS CIS,
    SR.Nombre_cliente AS S_CLIENTE,
    SR.nombre_titular AS S_TITULAR,
    sr.nombre_fantasia AS S_FANTASIA,
    CL.TIPO_DOC AS C_TIPO,
    CL.DOCUMENTO AS C_DOC,
    SR.TIPO_DOC AS S_TIPO,
    SR.DOCUMENTO AS S_DOC
FROM DBO.Clientes_servicios AS SR
    INNER JOIN clientes AS CL
    ON SR.CLIENTE_ID = CL.CLIENTE_ID
WHERE 
SR.Nombre_cliente NOT LIKE SR.nombre_titular

-- Servicios a Facturar
-- SERVICIO= 'Internet' 'Telefonia' 'Varios'
DECLARE @HABILITADO AS INTEGER = 3
DECLARE @SUSPENDIDO AS INTEGER = 5

DECLARE @HAB_HASTA AS DATE = '20240809'

DECLARE @SUS_DESDE AS DATE = '20240801'
DECLARE @SUS_HASTA AS DATE = '20240101'

DECLARE @INCLUSION_DESDE AS DATE = '20240101'
DECLARE @INCLUSION_HASTA AS DATE = '20241231'

DECLARE @SERVICIO AS VARCHAR(25)  = 'Internet'

SELECT --TOP 100 
    COUNT (CLIENTE_SERVICIO_ID)
FROM Clientes_servicios
WHERE 
(Fecha_Habilitacion <= @HAB_HASTA AND servicio = @SERVICIO)
    AND
    (
    ESTADO = @HABILITADO
    OR (ESTADO = @HABILITADO AND fecha_suspencion < @SUS_HASTA)
    OR (ESTADO = @SUSPENDIDO AND fecha_suspencion >= @SUS_DESDE)
)
    AND (fecha_proxima_inclusion >= @INCLUSION_DESDE AND fecha_proxima_inclusion <= @INCLUSION_HASTA)
    OR (plan_de_pago = 1 AND servicio = @SERVICIO)
    OR (cuota_dvr = 1 AND servicio = @SERVICIO)

--Verificación de valores distintos en cliente servicio - con subconsulta
SELECT
    Concatenado,
    SinGuiones,
    CASE 
        WHEN Concatenado = SinGuiones THEN 'Igual'
        ELSE 'Diferente'
    END AS Comparacion,
    CLAVE, NUMERO_DOC, DIGITO_VERIFICADOR, DOCUMENTO
FROM (
    SELECT
        CONCAT(CLAVE, NUMERO_DOC, DIGITO_VERIFICADOR) AS Concatenado,
        REPLACE(DOCUMENTO, '-', '') AS SinGuiones,
        CLAVE, NUMERO_DOC, DIGITO_VERIFICADOR, DOCUMENTO
    FROM
        Clientes_servicios
    WHERE TIPO_DOC like 'cuit'
) AS Subconsulta
WHERE 
    Concatenado <> SinGuiones;

--Verificación de valores distintos en cliente servicio - sin subconsulta
SELECT
    CONCAT(CLAVE, NUMERO_DOC, DIGITO_VERIFICADOR) AS Concatenado,
    REPLACE(DOCUMENTO, '-', '') AS SinGuiones,
    CASE 
        WHEN CONCAT(CLAVE, NUMERO_DOC, DIGITO_VERIFICADOR) = REPLACE(DOCUMENTO, '-', '') THEN 'Igual'
        ELSE 'Diferente'
    END AS Comparacion
FROM
    Clientes_servicios;

--SERVICIOS SON DISTINTO NOMBRE DE CLIENTE Y TITULAR
SELECT DISTINCT CLIENTE_SERVICIO_ID, cis, Nombre_cliente, nombre_titular
FROM Clientes_servicios
WHERE REPLACE(UPPER(TRIM(Nombre_cliente)),' ','') 
NOT LIKE REPLACE(UPPER(TRIM(nombre_titular)),' ','')

--SERVICIOS DE GAS
SELECT TOP(1000)
    Numero_pedido, CUENTA, Calle_inmueble, Numero_inmueble, Apellido_titular, Tipo_Doc_titular, num_doc_titular, Calle_titular, Numero_casa_titular, Locatario, Tipo_Doc_locatario, num_doc_locatario, Provincia_postal, codigo_postal_localidad, Localidad_postal, calle_postal, Numero_postal, tipo_suministro, Categoria, CUIT, calle_medidor, numero_casa_medidor, Usuario, codigo_calle, estado, TIPO_CLIENTE, partida, factura_electronica, aviso_electronico, email, Tipo_Doc_Usuario, num_doc_usuario, CUIL, titular_locatario, email_secundario, CIS
FROM Servigas.dbo.clientes
