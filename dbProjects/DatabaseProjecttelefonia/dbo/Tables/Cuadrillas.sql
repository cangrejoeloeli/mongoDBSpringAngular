CREATE TABLE [dbo].[Cuadrillas] (
    [CUADRILLAS_ID] INT          NOT NULL,
    [DESCRIPCION]   VARCHAR (30) NULL,
    [INTEGRANTES]   VARCHAR (89) NULL,
    PRIMARY KEY CLUSTERED ([CUADRILLAS_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);


GO

