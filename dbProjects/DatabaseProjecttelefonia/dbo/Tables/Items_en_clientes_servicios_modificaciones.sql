CREATE TABLE [dbo].[Items_en_clientes_servicios_modificaciones] (
    [ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]                         INT             NULL,
    [PLAN_COMERCIAL_ID]                           INT             NULL,
    [ITEM_FACTURACION_ID]                         INT             NULL,
    [SUSPENDIDO]                                  TINYINT         NULL,
    [VIGENCIA]                                    DATETIME        NULL,
    [CANTIDAD_CUOTAS]                             INT             NULL,
    [CUOTA_ACTUAL]                                INT             NULL,
    [ORDEN]                                       INT             NULL,
    [VALOR]                                       DECIMAL (18, 6) NULL,
    [PORCENTAJE_DESCUENTO]                        DECIMAL (7, 2)  NULL,
    [ITEM_APLICACION_ID]                          INT             NULL,
    [ITEM_FUERA_DE_PLAN]                          TINYINT         NULL,
    [ESTADO]                                      TINYINT         NULL,
    [ITEM_CLIENTE_SERVICIO_ID]                    INT             NULL,
    [PARA_BAJA]                                   TINYINT         NULL,
    [cantidad_de_items]                           TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ORDEN] ASC, [ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([ITEM_CLIENTE_SERVICIO_ID] ASC, [ESTADO] ASC, [PARA_BAJA] ASC, [ITEM_FACTURACION_ID] ASC, [ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ITE115_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE115_ITEMS_EN_CLIENTES_SERVICIOS_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE115_POR_FECHA_VIGENCIA]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([VIGENCIA] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE115_POR_PLAN_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([PLAN_COMERCIAL_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE115_POR_PLAN_ID_Y_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE115_X_ITEM_FACTURACION]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([ITEM_FACTURACION_ID] ASC);


GO

