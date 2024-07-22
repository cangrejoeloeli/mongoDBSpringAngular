CREATE TABLE [dbo].[modems] (
    [MODEM_ID]            INT           NOT NULL,
    [MARCA_ID]            INT           NULL,
    [MODELO_ID]           INT           NULL,
    [SERIE]               VARCHAR (50)  NULL,
    [UTILIZADO]           TINYINT       NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [USUARIO]             VARCHAR (30)  NULL,
    [PASSWORD]            VARCHAR (30)  NULL,
    [BAJA]                TINYINT       NULL,
    [stock_id]            INT           NULL,
    [id_proveedor]        INT           NULL,
    [motivo_baja]         VARCHAR (100) NULL,
    [estado_modem_id]     INT           NULL,
    [fecha_compra]        DATETIME      NULL,
    [comentario]          VARCHAR (250) NULL,
    [marca]               VARCHAR (50)  NULL,
    [modelo]              VARCHAR (50)  NULL,
    [otro]                INT           NULL,
    [tipo]                INT           NULL,
    [cis]                 VARCHAR (15)  NULL,
    CONSTRAINT [PK__modems__22951AFD] PRIMARY KEY CLUSTERED ([MODEM_ID] ASC),
    CONSTRAINT [UQ__modems__23893F36] UNIQUE NONCLUSTERED ([SERIE] ASC, [MODEM_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [MOD_MODEM_X_MARCA_ID]
    ON [dbo].[modems]([MARCA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [MOD_MODEM_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[modems]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [MOD_MODEM_X_MODELO_ID]
    ON [dbo].[modems]([MODELO_ID] ASC);


GO

