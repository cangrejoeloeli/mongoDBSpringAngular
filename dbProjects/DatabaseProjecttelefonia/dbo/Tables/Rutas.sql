CREATE TABLE [dbo].[Rutas] (
    [RUTA_ID] INT          NOT NULL,
    [RUTA]    VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([RUTA_ID] ASC),
    UNIQUE NONCLUSTERED ([RUTA] ASC)
);


GO

