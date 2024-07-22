CREATE TABLE [dbo].[historico_puertos] (
    [ID]                  INT          NOT NULL,
    [PUERTO_ID]           INT          NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [MOTIVO]              VARCHAR (59) NULL,
    [FECHA]               DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [HIS5_X_PUERTO_ID]
    ON [dbo].[historico_puertos]([PUERTO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HIS5_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[historico_puertos]([CLIENTE_SERVICIO_ID] ASC);


GO

