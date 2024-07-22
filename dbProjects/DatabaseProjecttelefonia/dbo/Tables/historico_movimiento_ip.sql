CREATE TABLE [dbo].[historico_movimiento_ip] (
    [ID_HISTORICO]        INT          NOT NULL,
    [ID_CLIENTE_SERVICIO] INT          NULL,
    [IP]                  VARCHAR (49) NULL,
    [MOTIVO]              VARCHAR (89) NULL,
    [FECHA_MODIIC]        DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);


GO

