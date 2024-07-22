CREATE TABLE [dbo].[movimientos_compras] (
    [ID_MOV]              INT          NULL,
    [STOCK_ID]            INT          NULL,
    [ID_COMPRAS]          INT          NULL,
    [ARTICULO_ID]         INT          NULL,
    [FECHA]               DATETIME     NULL,
    [ESTADO]              VARCHAR (19) NULL,
    [SERIE]               VARCHAR (29) NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [cantidad]            INT          NULL,
    UNIQUE NONCLUSTERED ([ID_MOV] ASC),
    UNIQUE NONCLUSTERED ([ID_COMPRAS] ASC, [ID_MOV] ASC)
);


GO

CREATE NONCLUSTERED INDEX [MOV_X_COMPRAS_ID]
    ON [dbo].[movimientos_compras]([ID_COMPRAS] ASC);


GO

