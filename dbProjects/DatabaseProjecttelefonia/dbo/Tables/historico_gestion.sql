CREATE TABLE [dbo].[historico_gestion] (
    [ID_HISTORICO]        INT          NOT NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [SERVICIO]            VARCHAR (19) NULL,
    [NUMERO_FACTURA]      VARCHAR (19) NULL,
    [PERIODO]             VARCHAR (29) NULL,
    [OPERADOR]            VARCHAR (49) NULL,
    [FECHA]               DATETIME     NULL,
    [COMENTARIO]          VARCHAR (89) NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);


GO

