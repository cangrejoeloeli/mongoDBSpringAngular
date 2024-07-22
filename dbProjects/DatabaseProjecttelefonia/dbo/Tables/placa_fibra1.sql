CREATE TABLE [dbo].[placa_fibra1] (
    [PLACA_ID]             INT          NOT NULL,
    [POSICIONES_EQUIPO_ID] INT          NULL,
    [DESCRIPCION]          VARCHAR (89) NULL,
    [NUMERO_DE_PLACA]      CHAR (20)    NULL,
    [NUMERO_DE_POSICION]   INT          NULL,
    [CANTIDAD_DE_PUERTOS]  INT          NULL,
    [DATOS]                TINYINT      NULL,
    [VOZ]                  TINYINT      NULL,
    [VIDEO]                TINYINT      NULL,
    [HABILITADO]           TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([PLACA_ID] ASC)
);


GO

