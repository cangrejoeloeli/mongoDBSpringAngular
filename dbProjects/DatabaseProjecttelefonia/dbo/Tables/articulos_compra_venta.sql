CREATE TABLE [dbo].[articulos_compra_venta] (
    [ID]                INT             NOT NULL,
    [ARTICULO_ID]       INT             NULL,
    [FECHA_COMPRA]      DATETIME        NULL,
    [FECHA_VENTA]       DATETIME        NULL,
    [CANTIDAD_COMPRADA] TINYINT         NULL,
    [CANTIDAD_RESTANTE] TINYINT         NULL,
    [COSTO]             DECIMAL (13, 4) NULL,
    [SERIE]             VARCHAR (64)    NULL,
    [COD_BARRA]         VARCHAR (59)    NULL,
    [CODIGO_QR]         VARCHAR (59)    NULL,
    [ORDEN_COMPRA_ID]   INT             NULL,
    [DEPOSITO_ID]       INT             NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ART1_X_ARTICULO]
    ON [dbo].[articulos_compra_venta]([ARTICULO_ID] ASC);


GO

