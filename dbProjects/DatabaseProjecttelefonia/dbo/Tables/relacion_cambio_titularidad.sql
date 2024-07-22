CREATE TABLE [dbo].[relacion_cambio_titularidad] (
    [ID_TABLA]                 INT          NOT NULL,
    [SERVICIO_ID_ANTERIOR]     INT          NULL,
    [SERVICIO_ID_NUEVO]        INT          NULL,
    [RELACIONADO]              TINYINT      NULL,
    [NOMBRE_SERVICIO_ANTERIOR] VARCHAR (59) NULL,
    [NOMBRE_NUEVO]             VARCHAR (89) NULL,
    [FECHA]                    DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID_TABLA] ASC)
);


GO

