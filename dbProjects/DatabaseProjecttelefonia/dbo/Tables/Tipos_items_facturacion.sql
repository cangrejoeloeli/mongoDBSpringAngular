CREATE TABLE [dbo].[Tipos_items_facturacion] (
    [TIPO_ID]     INT          NOT NULL,
    [DESCRIPCION] VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([TIPO_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);


GO

