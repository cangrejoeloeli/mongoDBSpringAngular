CREATE TABLE [dbo].[Clientes_servicios_modificaciones] (
    [MODIFICACIONES_ID]             INT           NOT NULL,
    [TIPO_DE_MODIFICACION]          TINYINT       NULL,
    [CLIENTE_ID]                    INT           NULL,
    [CLIENTE_SERVICIO_ID]           INT           NULL,
    [CODIGO_CALLE]                  INT           NULL,
    [NUMERO]                        INT           NULL,
    [SECTOR]                        VARCHAR (2)   NULL,
    [BLOCK]                         VARCHAR (2)   NULL,
    [TORRE]                         VARCHAR (3)   NULL,
    [PISO]                          TINYINT       NULL,
    [DTO]                           VARCHAR (3)   NULL,
    [CASA]                          INT           NULL,
    [BARRIO]                        VARCHAR (15)  NULL,
    [LOCALIDAD_ID]                  INT           NULL,
    [CODIGO_POSTAL]                 VARCHAR (10)  NULL,
    [ENTRE_CODIGO_CALLE_1]          INT           NULL,
    [ENTRE_CODIGO_CALLE_2]          INT           NULL,
    [SERVICIO]                      VARCHAR (10)  NULL,
    [NUMERO_TELEFONO]               INT           NULL,
    [FECHA_SOLICITUD_CAMBIO]        DATETIME      NULL,
    [FECHA_INGRESO_AL_SISTEMA]      DATETIME      NULL,
    [PLAN_COMERCIAL]                INT           NULL,
    [ESTADO]                        TINYINT       NULL,
    [NUMERO_SOLICITUD]              INT           NULL,
    [OBSERVACIONES]                 VARCHAR (300) NULL,
    [TIPO_CONEXION]                 VARCHAR (20)  NULL,
    [F_E_I]                         INT           NULL,
    [PAR_ID]                        INT           NULL,
    [PUERTOS_ID]                    INT           NULL,
    [CANTIDAD_DE_BOCAS]             INT           NULL,
    [FIGURACION_EN_GUIA]            VARCHAR (3)   NULL,
    [MODEM_ID]                      INT           NULL,
    [TELEFONO_ID]                   INT           NULL,
    [CLASIFICACION_DE_SERVICIO]     INT           NULL,
    [factura]                       TINYINT       NULL,
    [cantidad_de_bocas_adicionales] TINYINT       NULL,
    [cantidad_de_bocas_existentes]  TINYINT       NULL,
    [num_factura]                   VARCHAR (50)  NULL,
    [tipo]                          VARCHAR (50)  NULL,
    [susp_masiva]                   INT           NULL,
    [usuario_id]                    TINYINT       NULL,
    [fecha_mod]                     DATETIME      NULL,
    [devuelve_m]                    INT           NULL,
    [devuelve_c]                    INT           NULL,
    [devuelve_t]                    INT           NULL,
    [comentarios]                   VARCHAR (200) NULL,
    [cpe_id]                        INT           NULL,
    [marca]                         INT           NULL,
    [modem_o_id]                    INT           NULL,
    [cpe_o_id]                      INT           NULL,
    [ata_o_id]                      INT           NULL,
    [cumplido]                      TINYINT       NULL,
    [cumplido_1]                    INT           NULL,
    [impreso]                       INT           NULL,
    [tecnica]                       INT           NULL,
    [marca_item]                    TINYINT       NULL,
    [marca_cambio_titularidad]      TINYINT       NULL,
    [fecha_cambio_estado]           DATETIME      NULL,
    [hora_cambio_estado]            INT           NULL,
    [habilitado_con_deuda]          TINYINT       NULL,
    [cliente_anterior]              VARCHAR (90)  NULL,
    [cliente_nuevo]                 VARCHAR (90)  NULL,
    [cis]                           VARCHAR (15)  NULL,
    [generacion_listado_cortes]     INT           NULL,
    PRIMARY KEY CLUSTERED ([MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([ESTADO] ASC, [CLIENTE_SERVICIO_ID] ASC, [MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([FECHA_SOLICITUD_CAMBIO] ASC, [CLIENTE_SERVICIO_ID] ASC, [MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_CALLE] ASC, [NUMERO] ASC, [PISO] ASC, [SECTOR] ASC, [TORRE] ASC, [CASA] ASC, [BARRIO] ASC, [BLOCK] ASC, [DTO] ASC, [CLIENTE_SERVICIO_ID] ASC, [MODIFICACIONES_ID] ASC),
    CONSTRAINT [UQ__Clientes_servici__086B34A6] UNIQUE NONCLUSTERED ([CLIENTE_ID] ASC, [CLIENTE_SERVICIO_ID] ASC, [TIPO_DE_MODIFICACION] ASC, [MODIFICACIONES_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CLI12_CLIENTES_SERVICIOS_X_CALLE_DOMICILIO]
    ON [dbo].[Clientes_servicios_modificaciones]([CODIGO_CALLE] ASC);


GO

CREATE NONCLUSTERED INDEX [x_tipo_de_modificacion_y_estado]
    ON [dbo].[Clientes_servicios_modificaciones]([TIPO_DE_MODIFICACION] ASC, [ESTADO] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI12_CLIENTES_SERVICIOS_X_PLAN_COMERCIAL_ID]
    ON [dbo].[Clientes_servicios_modificaciones]([PLAN_COMERCIAL] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio]
    ON [dbo].[Clientes_servicios_modificaciones]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI12_CLIENTES_SERVICIOS_X_LOCALIDAD_ID]
    ON [dbo].[Clientes_servicios_modificaciones]([LOCALIDAD_ID] ASC);


GO

