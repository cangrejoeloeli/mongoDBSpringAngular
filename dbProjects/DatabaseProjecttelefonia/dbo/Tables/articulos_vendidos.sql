CREATE TABLE [dbo].[articulos_vendidos] (
    [ID]                              INT     NOT NULL,
    [ID_ARTICULOS_COMPRADOS_VENDIDOS] INT     NULL,
    [ID_ARTICULO]                     INT     NULL,
    [ID_FACTURA]                      INT     NULL,
    [CANTIDAD]                        TINYINT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ART2_X_ID_FACTURA_Y_ARTICULO]
    ON [dbo].[articulos_vendidos]([ID_FACTURA] ASC, [ID_ARTICULO] ASC);


GO

CREATE NONCLUSTERED INDEX [ART2_X_ID_FACTURA]
    ON [dbo].[articulos_vendidos]([ID_FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [ART2_X_ID_ARTICULO]
    ON [dbo].[articulos_vendidos]([ID_ARTICULO] ASC);


GO

