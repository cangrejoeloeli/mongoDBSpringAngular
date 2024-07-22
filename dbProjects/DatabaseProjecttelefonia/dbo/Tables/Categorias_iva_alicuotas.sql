CREATE TABLE [dbo].[Categorias_iva_alicuotas] (
    [CATEGORIAS_IVA_ALICUOTAS_ID] TINYINT      NOT NULL,
    [IVA_ID]                      INT          NULL,
    [ALICUOTA_1]                  TINYINT      NULL,
    [ALICUOTA_2]                  TINYINT      NULL,
    [DESDE]                       INT          NULL,
    [HASTA]                       INT          NULL,
    [COMPRA]                      TINYINT      NULL,
    [VENTA]                       TINYINT      NULL,
    [COLUMNA_IVA_1]               TINYINT      NULL,
    [COLUMNA_IVA_2]               TINYINT      NULL,
    [COLUMNA_FAC_1]               TINYINT      NULL,
    [COLUMNA_FAC_2]               TINYINT      NULL,
    [COLUMNA]                     TINYINT      NULL,
    [SERVICIO]                    VARCHAR (10) NULL,
    PRIMARY KEY CLUSTERED ([CATEGORIAS_IVA_ALICUOTAS_ID] ASC),
    UNIQUE NONCLUSTERED ([IVA_ID] ASC, [CATEGORIAS_IVA_ALICUOTAS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CAT_CATEGORIAS_IVA_X_ALICUOTA_1]
    ON [dbo].[Categorias_iva_alicuotas]([ALICUOTA_1] ASC);


GO

CREATE NONCLUSTERED INDEX [CAT_CATEGORIAS_IVA_X_IVA_ID_SOLO]
    ON [dbo].[Categorias_iva_alicuotas]([IVA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CAT_CATEGORIAS_IVA_X_ALICUOTA_2]
    ON [dbo].[Categorias_iva_alicuotas]([ALICUOTA_2] ASC);


GO

