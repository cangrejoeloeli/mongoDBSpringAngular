CREATE TABLE [dbo].[DDN_clientes_servicios] (
    [ID]                             INT            NOT NULL,
    [CLIENTE_SERVICIO_ID]            INT            NULL,
    [CODIGO]                         VARCHAR (6)    NULL,
    [LOCALIDAD]                      VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [fecha_vigencia_desde]           DATETIME       NULL,
    [fecha_vigencia_hasta]           DATETIME       NULL,
    [fecha_baja]                     DATETIME       NULL,
    [baja]                           TINYINT        NULL,
    [ddn_id]                         INT            NULL,
    [promocion]                      TINYINT        NULL,
    CONSTRAINT [PK__DDN_clientes_ser__2962141D] PRIMARY KEY CLUSTERED ([ID] ASC),
    CONSTRAINT [UQ__DDN_clientes_ser__2A563856] UNIQUE NONCLUSTERED ([LOCALIDAD] ASC, [ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [UQ__DDN_clientes_ser__2B4A5C8F]
    ON [dbo].[DDN_clientes_servicios]([CODIGO] ASC);


GO

CREATE NONCLUSTERED INDEX [DDN1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[DDN_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_codigo_y_baja]
    ON [dbo].[DDN_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [CODIGO] ASC, [baja] ASC);


GO

CREATE NONCLUSTERED INDEX [DDN_x_cliente_servicio_id_y_codigo]
    ON [dbo].[DDN_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [CODIGO] ASC);


GO

