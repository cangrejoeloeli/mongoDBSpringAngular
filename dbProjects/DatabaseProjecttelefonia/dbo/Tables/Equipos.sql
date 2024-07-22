CREATE TABLE [dbo].[Equipos] (
    [EQUIPOS_ID]          INT          NOT NULL,
    [POSICIONES_RACK_ID]  INT          NULL,
    [DESCRIPCION]         VARCHAR (30) NULL,
    [MARCA]               VARCHAR (30) NULL,
    [MODELO]              VARCHAR (30) NULL,
    [POSICIONES]          INT          NULL,
    [script_id]           INT          NULL,
    [script_telefonia_id] INT          NULL,
    CONSTRAINT [PK__Equipos__1FEDB87C] PRIMARY KEY CLUSTERED ([EQUIPOS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [EQU_EQUIPOS_X_POSICION_RACK_ID]
    ON [dbo].[Equipos]([POSICIONES_RACK_ID] ASC);


GO

