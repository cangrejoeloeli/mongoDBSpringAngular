CREATE TABLE [dbo].[Items_en_clientes_servicios_acerca_tv] (
    [ITEMS_EN_CLIENTE_SERVICIO_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]          INT             NULL,
    [PLAN_COMERCIAL_ID]            INT             NULL,
    [ITEM_FACTURACION_ID]          INT             NULL,
    [SUSPENDIDO]                   TINYINT         NULL,
    [VIGENCIA]                     DATETIME        NULL,
    [CANTIDAD_CUOTAS]              INT             NULL,
    [CUOTA_ACTUAL]                 INT             NULL,
    [ORDEN]                        INT             NULL,
    [VALOR]                        DECIMAL (19, 6) NULL,
    [PORCENTAJE_DESCUENTO]         DECIMAL (7, 2)  NULL,
    [ITEM_APLICACION_ID]           INT             NULL,
    [ITEM_FUERA_DE_PLAN]           TINYINT         NULL,
    [VER_EN_TECNICA]               TINYINT         NULL,
    [CANTIDAD_DE_ITEMS]            TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ORDEN] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ITE116_X_CLIENTE_SERVICIO_ID_Y_ITEM_FACTURACION_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE116_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE116_ITEMS_EN_CLIENTES_SERVICIOS_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE116_POR_PLAN_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([PLAN_COMERCIAL_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE116_X_ITEM_FACTURACION_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([ITEM_FACTURACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE116_POR_FECHA_VIGENCIA]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([VIGENCIA] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE116_POR_PLAN_ID_Y_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);


GO

