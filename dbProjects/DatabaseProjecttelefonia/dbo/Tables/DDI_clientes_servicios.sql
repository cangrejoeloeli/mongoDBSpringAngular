CREATE TABLE [dbo].[DDI_clientes_servicios] (
    [ID]                             INT            NOT NULL,
    [CLIENTE_SERVICIO_ID]            INT            NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [fecha_vigencia_desde]           DATETIME       NULL,
    [fecha_vigencia_hasta]           DATETIME       NULL,
    [fecha_baja]                     DATETIME       NULL,
    [baja]                           TINYINT        NULL,
    [ddi_id]                         INT            NULL,
    [promocion]                      TINYINT        NULL,
    CONSTRAINT [PK__DDI_clientes_ser__25918339] PRIMARY KEY CLUSTERED ([ID] ASC),
    CONSTRAINT [UQ__DDI_clientes_ser__2685A772] UNIQUE NONCLUSTERED ([PAIS] ASC, [ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [DDI1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[DDI_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [UQ__DDI_clientes_ser__2779CBAB]
    ON [dbo].[DDI_clientes_servicios]([CODIGO] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_codigo_y_baja]
    ON [dbo].[DDI_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [CODIGO] ASC, [baja] ASC);


GO

CREATE NONCLUSTERED INDEX [DDI_x_cliente_servicio_id_y_codigo]
    ON [dbo].[DDI_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [CODIGO] ASC);


GO

