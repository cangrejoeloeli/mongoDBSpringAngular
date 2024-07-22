CREATE TABLE [dbo].[Historico_cambio_posiciones] (
    [ID]                  INT          NOT NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [OPERADOR]            VARCHAR (49) NULL,
    [DESCRIPCION]         VARCHAR (89) NULL,
    [FECHA]               DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

