CREATE TABLE [dbo].[placa_fibra] (
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

CREATE NONCLUSTERED INDEX [PLA5_X_EQUIPO_ID]
    ON [dbo].[placa_fibra]([POSICIONES_EQUIPO_ID] ASC);


GO

