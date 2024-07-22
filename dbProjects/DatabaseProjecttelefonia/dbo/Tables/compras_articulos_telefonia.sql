CREATE TABLE [dbo].[compras_articulos_telefonia] (
    [ID_COMPRAS]   INT          NOT NULL,
    [PROVEEDOR_ID] INT          NULL,
    [CANTIDAD]     DECIMAL (13) NULL,
    [FECHA]        DATETIME     NULL,
    [STOCK_ID]     INT          NULL,
    PRIMARY KEY CLUSTERED ([ID_COMPRAS] ASC)
);


GO

CREATE NONCLUSTERED INDEX [COM2_X_PROVEEDORES_ID]
    ON [dbo].[compras_articulos_telefonia]([PROVEEDOR_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [COM2_X_STOCK_ID]
    ON [dbo].[compras_articulos_telefonia]([STOCK_ID] ASC);


GO

