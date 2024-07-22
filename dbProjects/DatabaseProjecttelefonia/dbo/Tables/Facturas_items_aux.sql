CREATE TABLE [dbo].[Facturas_items_aux] (
    [FACTURAS_ITEMS_ID]                       INT             NOT NULL,
    [FACTURA_ID]                              INT             NULL,
    [NUMERO_FACTURA]                          VARCHAR (19)    NULL,
    [ITEM_FACTURACION_ID]                     INT             NULL,
    [ITEM_FACTURACION_DESCRIPCION]            VARCHAR (40)    NULL,
    [ITEM_EN_CLIENTE_SERVICIO_ID]             INT             NULL,
    [ITEM_EN_CLIENTE_SERVICIO_PARA_CORTE_ID]  INT             NULL,
    [ITEM_EN_CLIENTES_SERVICIOS_HISTORICO_ID] INT             NULL,
    [VALOR_UNITARIO]                          DECIMAL (13, 2) NULL,
    [TOTAL]                                   DECIMAL (13, 2) NULL,
    [IVA]                                     DECIMAL (11, 2) NULL,
    [COLUMNA_SUBDIARIO_FACTURACION]           TINYINT         NULL,
    [COLUMNA_SUBDIARIO_IVA]                   TINYINT         NULL,
    [ITEMS_ARCHIVOS_ID]                       INT             NULL,
    [ARTICULO_ID]                             INT             NULL,
    [CANTIDAD]                                DECIMAL (7, 2)  NULL,
    [PERIODO]                                 VARCHAR (10)    NULL,
    [SERVICIOS]                               VARCHAR (19)    NULL,
    [PERIODO_ID]                              INT             NULL,
    [EN_FACTURA]                              TINYINT         NULL,
    [IMPORTE_FACTURA]                         DECIMAL (13, 2) NULL,
    [TOTAL_CUOTAS]                            INT             NULL,
    [CUOTA_ACTUAL]                            INT             NULL,
    [PINTA]                                   TINYINT         NULL,
    [ITEMS_APLICACION_ID]                     INT             NULL,
    [QUE_ES]                                  VARCHAR (19)    NULL,
    PRIMARY KEY CLUSTERED ([FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC, [FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_FACTURA] ASC, [FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([PERIODO_ID] ASC, [FACTURAS_ITEMS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [FAC13_X_FACTURA_ID_Y_ITEM_ID]
    ON [dbo].[Facturas_items_aux]([FACTURA_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC13_X_PERIODO]
    ON [dbo].[Facturas_items_aux]([PERIODO] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC13_X_FACTURA]
    ON [dbo].[Facturas_items_aux]([NUMERO_FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC13_POR_PERIODO_ID]
    ON [dbo].[Facturas_items_aux]([PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC13_X_FACTURA_ID]
    ON [dbo].[Facturas_items_aux]([FACTURA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC13_X_ITEM_ID]
    ON [dbo].[Facturas_items_aux]([ITEM_FACTURACION_ID] ASC);


GO

