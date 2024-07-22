CREATE TABLE [dbo].[ordenes_de_servicio_varias] (
    [ORDEN_ID]                        INT             NOT NULL,
    [FINANCIERA]                      TINYINT         NULL,
    [PREJUDICIAL]                     TINYINT         NULL,
    [NOMBRE_FANTASIA]                 VARCHAR (55)    NULL,
    [CLIENTE_ID]                      INT             NULL,
    [CLIENTE_SERVICIO_ID]             INT             NULL,
    [NUMERADOR_HIJOS]                 INT             NULL,
    [CLASIFICACION_DE_CLIENTES_ID]    INT             NULL,
    [CODIGO_CALLE]                    INT             NULL,
    [NUMERO]                          INT             NULL,
    [SECTOR]                          VARCHAR (2)     NULL,
    [BLOCK]                           VARCHAR (2)     NULL,
    [TORRE]                           VARCHAR (3)     NULL,
    [PISO]                            TINYINT         NULL,
    [DTO]                             VARCHAR (3)     NULL,
    [CASA]                            INT             NULL,
    [BARRIO]                          VARCHAR (15)    NULL,
    [LOCALIDAD_ID]                    INT             NULL,
    [CODIGO_POSTAL]                   VARCHAR (10)    NULL,
    [ENTRE_CODIGO_CALLE_1]            INT             NULL,
    [ENTRE_CODIGO_CALLE_2]            INT             NULL,
    [SERVICIO]                        VARCHAR (19)    NULL,
    [NUMERO_TELEFONO]                 INT             NULL,
    [PARTIDA]                         INT             NULL,
    [METROS_CUADRADOS_VIVIENDA]       DECIMAL (7, 2)  NULL,
    [TIPO_DOC]                        VARCHAR (4)     NULL,
    [CLAVE]                           TINYINT         NULL,
    [NUMERO_DOC]                      VARCHAR (19)    NULL,
    [DIGITO_VERIFICADOR]              TINYINT         NULL,
    [DOCUMENTO]                       VARCHAR (20)    NULL,
    [CLASIFICACION_IVA_ID]            INT             NULL,
    [PIB]                             VARCHAR (2)     NULL,
    [PERCEPCION_ID]                   TINYINT         NULL,
    [IVA_MONTO_ACUMULADO_FACTURACION] DECIMAL (13, 2) NULL,
    [FECHA_PROXIMA_INCLUSION]         DATETIME        NULL,
    [FECHA_INSTALACION]               DATETIME        NULL,
    [FECHA_SOLICITUD]                 DATETIME        NULL,
    [FECHA_HABILITACION]              DATETIME        NULL,
    [FECHA_BAJA]                      DATETIME        NULL,
    [FECHA_INGRESO_AL_SISTEMA]        DATETIME        NULL,
    [FECHA_INTIMACION]                DATETIME        NULL,
    [FECHA_TELECOBRANZA]              DATETIME        NULL,
    [FECHA_SUSPENCION]                DATETIME        NULL,
    [FECHA_CAMBIO_NUMERO]             DATETIME        NULL,
    [PLAN_COMERCIAL]                  INT             NULL,
    [ESTADO]                          TINYINT         NULL,
    [NUMERO_SOLICITUD]                INT             NULL,
    [VENDEDOR]                        INT             NULL,
    [CUADRILLA]                       VARCHAR (20)    NULL,
    [OBSERVACIONES]                   VARCHAR (300)   NULL,
    [SOLUCION]                        VARCHAR (300)   NULL,
    [APELLIDO_Y_NOMBRE]               VARCHAR (49)    NULL,
    [CALLE]                           VARCHAR (99)    NULL,
    PRIMARY KEY CLUSTERED ([ORDEN_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CLI17_X_SERVICIO]
    ON [dbo].[ordenes_de_servicio_varias]([SERVICIO] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI17_CLIENTES_SERVICIOS_X_LOCALIDAD_ID]
    ON [dbo].[ordenes_de_servicio_varias]([LOCALIDAD_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI17_CLIENTES_SERVICIOS_X_CALLE_DOMICILIO]
    ON [dbo].[ordenes_de_servicio_varias]([CODIGO_CALLE] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI17_CLIENTES_X_ID]
    ON [dbo].[ordenes_de_servicio_varias]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI17_CLIENTES_SERVICIO_X_ID]
    ON [dbo].[ordenes_de_servicio_varias]([CLIENTE_SERVICIO_ID] ASC);


GO

