CREATE TABLE [dbo].[puertos_fibra1] (
    [PUERTO_ID]            INT          NOT NULL,
    [PLACA_ID]             INT          NULL,
    [NUMERO_DE_PUERTO]     INT          NULL,
    [IP_FIJA]              TINYINT      NULL,
    [OCUPADO]              TINYINT      NULL,
    [EQUIPOS_DE_ACCESO_ID] INT          NULL,
    [POSICIONES]           INT          NULL,
    [FALLA]                VARCHAR (19) NULL,
    [CALLE_NUMERO]         VARCHAR (19) NULL,
    [OBSERVACIONES]        VARCHAR (19) NULL,
    [FECHA_VENCIMIENTO]    DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([PUERTO_ID] ASC)
);


GO

