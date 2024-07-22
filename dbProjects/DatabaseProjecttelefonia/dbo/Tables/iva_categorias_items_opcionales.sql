CREATE TABLE [dbo].[iva_categorias_items_opcionales] (
    [IVA_ID]              INT NOT NULL,
    [CATEGORIA_ID]        INT NULL,
    [ITEM_FACTURACION_ID] INT NULL,
    PRIMARY KEY CLUSTERED ([IVA_ID] ASC),
    UNIQUE NONCLUSTERED ([CATEGORIA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [IVA11_X_CATEGOIRA_ID_Y_ITEM_FACTURACION_ID]
    ON [dbo].[iva_categorias_items_opcionales]([CATEGORIA_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [IVA11_X_ITEM_FACTURACION_ID]
    ON [dbo].[iva_categorias_items_opcionales]([ITEM_FACTURACION_ID] ASC);


GO

