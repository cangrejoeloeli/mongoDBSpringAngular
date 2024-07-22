CREATE TABLE [dbo].[Items_clientes_servicios_en_archivo] (
    [ITEMS_CLIENTES_SERVICIOS_EN_ARCHIVO_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]                    INT             NULL,
    [DESCRIPCION]                            VARCHAR (40)    NULL,
    [CUOTA]                                  TINYINT         NULL,
    [CUOTAS]                                 TINYINT         NULL,
    [COLUMNA_SUBDIARIO]                      TINYINT         NULL,
    [SUSPENDIDO]                             TINYINT         NULL,
    [SERVICIOS]                              VARCHAR (19)    NULL,
    [FACTURA]                                VARCHAR (19)    NULL,
    [IMPORTE]                                DECIMAL (11, 2) NULL,
    [MARCA]                                  TINYINT         NULL,
    [PERIODO_ID]                             INT             NULL,
    [Item_facturacion_id]                    INT             NULL,
    [factura_que_lo_genero_id]               INT             NULL,
    [factura_que_lo_genero]                  VARCHAR (50)    NULL,
    CONSTRAINT [PK__Items_clientes_s__02E7657A] PRIMARY KEY CLUSTERED ([ITEMS_CLIENTES_SERVICIOS_EN_ARCHIVO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ITE112_ITEMS_DE_ARCHIVO_X_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_clientes_servicios_en_archivo]([ITEMS_CLIENTES_SERVICIOS_EN_ARCHIVO_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE112_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_clientes_servicios_en_archivo]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [por_factura_que_lo_genero]
    ON [dbo].[Items_clientes_servicios_en_archivo]([factura_que_lo_genero_id] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE112_ITEMS_DE_ARCHIVO_X_ID_Y_CLIENTE_ID]
    ON [dbo].[Items_clientes_servicios_en_archivo]([ITEMS_CLIENTES_SERVICIOS_EN_ARCHIVO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE112_POR_CABECERA_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_clientes_servicios_en_archivo]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [UQ__Items_clientes_s__03DB89B3]
    ON [dbo].[Items_clientes_servicios_en_archivo]([CLIENTE_SERVICIO_ID] ASC, [PERIODO_ID] ASC, [CUOTA] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE112_ITEMS_EN_ARCHIVOS_DETALLE_X_DESCRIPCION]
    ON [dbo].[Items_clientes_servicios_en_archivo]([DESCRIPCION] ASC);


GO

