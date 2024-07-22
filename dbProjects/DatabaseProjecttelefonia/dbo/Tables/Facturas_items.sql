CREATE TABLE [dbo].[Facturas_items] (
    [FACTURAS_ITEMS_ID]                       INT             NOT NULL,
    [FACTURA_ID]                              INT             NULL,
    [NUMERO_FACTURA]                          VARCHAR (19)    NULL,
    [ITEM_FACTURACION_ID]                     INT             NULL,
    [ITEM_FACTURACION_DESCRIPCION]            VARCHAR (40)    NULL,
    [VALOR_UNITARIO]                          DECIMAL (13, 2) NULL,
    [TOTAL]                                   DECIMAL (13, 2) NULL,
    [IVA]                                     DECIMAL (11, 2) NULL,
    [Columna_subdiario_iva]                   TINYINT         NULL,
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
    [columna_subdiario_facturacion]           TINYINT         NULL,
    [item_en_cliente_servicio_id]             INT             NULL,
    [item_en_clientes_servicios_historico_id] INT             NULL,
    [items_aplicacion_id]                     INT             NULL,
    [ITEM_EN_CLIENTE_SERVICIO_PARA_CORTE_ID]  INT             NULL,
    [que_es]                                  VARCHAR (19)    NULL,
    [cliente_id]                              INT             NULL,
    [cliente_servicio_id]                     INT             NULL,
    [cliente]                                 VARCHAR (50)    NULL,
    [orden]                                   INT             NULL,
    PRIMARY KEY CLUSTERED ([FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC, [FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_FACTURA] ASC, [FACTURAS_ITEMS_ID] ASC),
    CONSTRAINT [IX_Facturas_items] UNIQUE NONCLUSTERED ([ITEM_FACTURACION_ID] ASC, [FACTURAS_ITEMS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [x_item_id]
    ON [dbo].[Facturas_items]([ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_factura_id_y_item_id]
    ON [dbo].[Facturas_items]([FACTURA_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC1_X_FACTURA_ID]
    ON [dbo].[Facturas_items]([FACTURA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_orden]
    ON [dbo].[Facturas_items]([FACTURA_ID] ASC, [orden] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC1_POR_PERIODO_ID]
    ON [dbo].[Facturas_items]([PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC1_X_FACTURA]
    ON [dbo].[Facturas_items]([NUMERO_FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [IX_Facturas_items_1]
    ON [dbo].[Facturas_items]([PERIODO_ID] ASC, [FACTURAS_ITEMS_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC1_X_PERIODO]
    ON [dbo].[Facturas_items]([PERIODO] ASC);


GO

