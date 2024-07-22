CREATE TABLE [dbo].[cpe] (
    [CPE_ID]              INT          NOT NULL,
    [MARCA]               VARCHAR (49) NULL,
    [MODELO]              VARCHAR (49) NULL,
    [SERIE]               VARCHAR (49) NULL,
    [UTILIZADO]           TINYINT      NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [IP]                  VARCHAR (19) NULL,
    [USUARIO]             VARCHAR (30) NULL,
    [PASSWORD]            VARCHAR (30) NULL,
    [BAJA]                TINYINT      NULL,
    [HOSTNAME]            VARCHAR (49) NULL,
    [stock_id]            INT          NULL,
    [estado_modem_id]     INT          NULL,
    [fecha_compra]        DATETIME     NULL,
    [proveedor_id]        INT          NULL,
    [otro]                INT          NULL,
    [tipo]                INT          NULL,
    [comentario]          VARCHAR (90) NULL,
    [cis]                 VARCHAR (15) NULL,
    PRIMARY KEY CLUSTERED ([CPE_ID] ASC),
    UNIQUE NONCLUSTERED ([SERIE] ASC, [CPE_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [MOD1_CPE_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpe]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [UQ__cpe__B55A243871C7C670]
    ON [dbo].[cpe]([SERIE] ASC);


GO

