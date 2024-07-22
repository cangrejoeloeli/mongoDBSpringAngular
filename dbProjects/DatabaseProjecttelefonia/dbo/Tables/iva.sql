CREATE TABLE [dbo].[iva] (
    [IVA_ID]                  INT          NOT NULL,
    [DESCRIPCION]             VARCHAR (40) NULL,
    [PEDIR_CUIT]              TINYINT      NULL,
    [IB]                      TINYINT      NULL,
    [ALICUOTA_SOBRE_ALICUOTA] TINYINT      NULL,
    [A]                       TINYINT      NULL,
    [B]                       TINYINT      NULL,
    [C]                       TINYINT      NULL,
    [JURIDICA]                TINYINT      NULL,
    [desc_corta]              VARCHAR (4)  NULL,
    [Item_facturacion_id]     INT          NULL,
    [Item_facturacion_id_2]   INT          NULL,
    [Item_facturacion_id_3]   INT          NULL,
    [Item_facturacion_id_4]   INT          NULL,
    [clave_rentas]            TINYINT      NULL,
    [clave_afip]              TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([IVA_ID] ASC)
);


GO

