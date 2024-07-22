CREATE TABLE [dbo].[Items_en_clientes_servicios] (
    [ITEMS_EN_CLIENTE_SERVICIO_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]          INT             NULL,
    [PLAN_COMERCIAL_ID]            INT             NULL,
    [ITEM_FACTURACION_ID]          INT             NULL,
    [SUSPENDIDO]                   TINYINT         NULL,
    [VIGENCIA]                     DATETIME        NULL,
    [CANTIDAD_CUOTAS]              INT             NULL,
    [CUOTA_ACTUAL]                 INT             NULL,
    [ORDEN]                        INT             NULL,
    [VALOR]                        DECIMAL (18, 6) NULL,
    [PORCENTAJE_DESCUENTO]         DECIMAL (7, 2)  NULL,
    [ITEM_APLICACION_ID]           INT             NULL,
    [Item_fuera_de_plan]           INT             NULL,
    [ver_en_tecnica]               INT             NULL,
    [cantidad_de_items]            TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ORDEN] ASC),
    CONSTRAINT [x_cliente_servicio_id_y_item_facturacion_id] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ITE11_POR_PLAN_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios]([PLAN_COMERCIAL_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE11_POR_FECHA_VIGENCIA]
    ON [dbo].[Items_en_clientes_servicios]([VIGENCIA] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE11_POR_PLAN_ID_Y_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios]([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

CREATE UNIQUE NONCLUSTERED INDEX [UQ__Items_en_cliente__673F4B05]
    ON [dbo].[Items_en_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE11_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE11_ITEMS_EN_CLIENTES_SERVICIOS_X_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios]([ITEM_FACTURACION_ID] ASC);


GO

