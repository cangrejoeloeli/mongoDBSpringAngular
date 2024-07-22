CREATE TABLE [dbo].[Items_en_clientes_servicios_para_corte] (
    [ITEMS_EN_CLIENTE_SERVICIO_PARA_CORTE_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]                     INT             NULL,
    [DESCRIPCION]                             VARCHAR (40)    NULL,
    [ITEM_FACTURACION_ID]                     INT             NULL,
    [VALOR]                                   DECIMAL (18, 6) NULL,
    [NUMERO_FACTURA]                          VARCHAR (20)    NULL,
    [DIAS_PARA_COBRAR_EN_BAJA]                INT             NULL,
    [por_dias]                                VARCHAR (2)     NULL,
    [factura]                                 TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_PARA_CORTE_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ITE113_ITEMS_EN_CLIENTES_SERVICIOS_PARA_CORTE_X_CS_ID]
    ON [dbo].[Items_en_clientes_servicios_para_corte]([CLIENTE_SERVICIO_ID] ASC);


GO

