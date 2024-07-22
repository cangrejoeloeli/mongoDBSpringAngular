CREATE TABLE [dbo].[Devoluciones_varias] (
    [ID]               INT             NOT NULL,
    [CLIENTE_ID]       INT             NULL,
    [IMPORTE]          DECIMAL (11, 2) NULL,
    [FACTURA]          VARCHAR (14)    NULL,
    [USUARIO]          VARCHAR (49)    NULL,
    [SALDO]            DECIMAL (11, 2) NULL,
    [FACTURA_ORIGEN]   VARCHAR (19)    NULL,
    [OPERADOR_ID]      INT             NULL,
    [OPERADOR]         VARCHAR (39)    NULL,
    [FECHA_GENERACION] INT             NULL,
    [FECHA_APROBACION] INT             NULL,
    [APROBADA]         TINYINT         NULL,
    [NRO_CAJA]         INT             NULL,
    [NRO_EXPEDIENTE]   VARCHAR (19)    NULL,
    [SERVICIO]         VARCHAR (12)    NULL,
    [Items_id]         INT             NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [DEV231_POR_FECHA_APROBACION]
    ON [dbo].[Devoluciones_varias]([FECHA_APROBACION] ASC);


GO

CREATE NONCLUSTERED INDEX [DEV231_POR_FECHA_DE_CARGA]
    ON [dbo].[Devoluciones_varias]([FECHA_GENERACION] ASC);


GO

CREATE NONCLUSTERED INDEX [DEV231_POR_CLIENTE_ID]
    ON [dbo].[Devoluciones_varias]([CLIENTE_ID] ASC);


GO

