CREATE TABLE [dbo].[historico_mov_posiciones] (
    [ID_HISTORICO]     INT          NOT NULL,
    [CLIENTE_SERVICIO] INT          NULL,
    [CLIENTE_ID]       INT          NULL,
    [MOTIVO]           VARCHAR (64) NULL,
    [POS_ID]           INT          NULL,
    [FECHA]            DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);


GO

