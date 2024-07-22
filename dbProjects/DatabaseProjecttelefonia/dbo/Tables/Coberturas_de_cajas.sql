CREATE TABLE [dbo].[Coberturas_de_cajas] (
    [COBERTURAS_DE_CAJAS_ID] INT         NOT NULL,
    [CAJAS_ID]               INT         NULL,
    [CODIGO_CALLE]           INT         NULL,
    [DESDE]                  INT         NULL,
    [HASTA]                  INT         NULL,
    [PIT]                    VARCHAR (1) NULL,
    [fuera_de_zona]          TINYINT     NULL
);


GO

