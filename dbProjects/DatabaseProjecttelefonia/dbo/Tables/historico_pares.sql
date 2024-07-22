CREATE TABLE [dbo].[historico_pares] (
    [ID]                  INT          NOT NULL,
    [PAR_ID]              INT          NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [MOTIVO]              VARCHAR (59) NULL,
    [FECHA]               DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [HIS4_X_PAR_ID]
    ON [dbo].[historico_pares]([PAR_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HIS4_X_CLIENTE_ID]
    ON [dbo].[historico_pares]([CLIENTE_ID] ASC);


GO

