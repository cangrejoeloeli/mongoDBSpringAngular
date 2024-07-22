CREATE TABLE [dbo].[posiciones_fibra1] (
    [POSICIONES_ID]       INT          NOT NULL,
    [POSICION]            INT          NULL,
    [PUERTO_ID]           INT          NULL,
    [NUM_PUERTO]          INT          NULL,
    [PLACA_ID]            INT          NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [OCUPADO]             TINYINT      NULL,
    [FALLA]               TINYINT      NULL,
    [RESERVADO]           TINYINT      NULL,
    [CALLE]               VARCHAR (19) NULL,
    [NUMERO_CALLE]        INT          NULL,
    [RELACIONADO]         TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([POSICIONES_ID] ASC)
);


GO

