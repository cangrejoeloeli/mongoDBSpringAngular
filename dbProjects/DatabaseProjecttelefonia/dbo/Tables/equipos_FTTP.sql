CREATE TABLE [dbo].[equipos_FTTP] (
    [EQUIPO_ID]        INT          NOT NULL,
    [POSICION_RACK_ID] INT          NULL,
    [DESCRIPCION]      VARCHAR (59) NULL,
    [MARCA]            VARCHAR (59) NULL,
    [MODELO]           VARCHAR (59) NULL,
    [POSICIONES]       INT          NULL,
    PRIMARY KEY CLUSTERED ([EQUIPO_ID] ASC)
);


GO

