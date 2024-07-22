CREATE TABLE [dbo].[p_Facturas_items] (
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
    [orden]                                   INT             NULL
);


GO

