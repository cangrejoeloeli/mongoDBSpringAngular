CREATE TABLE [dbo].[Items_en_clientes_servicios_historico] (
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
    [ITEM_FUERA_DE_PLAN]           TINYINT         NULL,
    [NUMERO_FACTURA]               VARCHAR (19)    NULL,
    [TIPO_FACTURA]                 VARCHAR (1)     NULL,
    [cantidad_de_items]            TINYINT         NULL,
    [modificacion]                 VARCHAR (50)    NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [UQ__Items_en_cliente__758D6A5C] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ITEMS_EN_CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [UQ__Items_en_cliente__76818E95] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ORDEN] ASC, [ITEMS_EN_CLIENTE_SERVICIO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ITE111_POR_PLAN_ID_Y_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios_historico]([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE111_ITEMS_EN_CLIENTES_SERVICIOS_X_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios_historico]([ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE111_POR_PLAN_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_historico]([PLAN_COMERCIAL_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE111_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_historico]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE111_POR_FECHA_VIGENCIA]
    ON [dbo].[Items_en_clientes_servicios_historico]([VIGENCIA] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_item]
    ON [dbo].[Items_en_clientes_servicios_historico]([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

