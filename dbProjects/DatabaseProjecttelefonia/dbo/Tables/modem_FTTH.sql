CREATE TABLE [dbo].[modem_FTTH] (
    [MODEM_ID]          INT          NOT NULL,
    [PUERTOS_LAN]       INT          NULL,
    [MARCA]             VARCHAR (59) NULL,
    [MODELO]            VARCHAR (89) NULL,
    [N_SERIE]           VARCHAR (49) NULL,
    [SERVICIO_INTERNET] INT          NULL,
    [SERVICIO_SIP_1]    INT          NULL,
    [UTILIZADO]         TINYINT      NULL,
    [SERVICIO_SIP_2]    INT          NULL,
    [INTERNET]          TINYINT      NULL,
    [PROVEEDOR_ID]      INT          NULL,
    [SIP]               TINYINT      NULL,
    [SIP_2]             TINYINT      NULL,
    [USUSARIO]          VARCHAR (50) NULL,
    [PASSWORD]          VARCHAR (30) NULL,
    [ESTADO]            TINYINT      NULL,
    [COMENTARIO]        VARCHAR (44) NULL,
    [STOCK_ID]          INT          NULL,
    [FECHA_COMPRA]      DATETIME     NULL,
    [cis]               VARCHAR (15) NULL,
    PRIMARY KEY CLUSTERED ([MODEM_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [MOD3_X_N_SERIE_Y_ID]
    ON [dbo].[modem_FTTH]([N_SERIE] ASC, [MODEM_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [MOD3_X_N_SERIE]
    ON [dbo].[modem_FTTH]([N_SERIE] ASC);


GO

