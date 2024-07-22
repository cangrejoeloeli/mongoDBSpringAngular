CREATE TABLE [dbo].[Categorias_iva_alicuotas_cpp] (
    [CATEGORIAS_IVA_CPP_ALICUOTAS_ID] TINYINT NOT NULL,
    [IVA_CPP_ID]                      INT     NULL,
    [ALICUOTA_1]                      TINYINT NULL,
    [ALICUOTA_2]                      TINYINT NULL,
    [DESDE]                           INT     NULL,
    [HASTA]                           INT     NULL,
    [COLUMNA]                         TINYINT NULL,
    PRIMARY KEY CLUSTERED ([CATEGORIAS_IVA_CPP_ALICUOTAS_ID] ASC),
    UNIQUE NONCLUSTERED ([IVA_CPP_ID] ASC, [CATEGORIAS_IVA_CPP_ALICUOTAS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CAT3_CATEGORIAS_IVA_CPP_X_IVA_ID_SOLO]
    ON [dbo].[Categorias_iva_alicuotas_cpp]([IVA_CPP_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CAT3_CATEGORIAS_IVA_CPP_X_ALICUOTA_1]
    ON [dbo].[Categorias_iva_alicuotas_cpp]([ALICUOTA_1] ASC);


GO

CREATE NONCLUSTERED INDEX [CAT3_CATEGORIAS_IVA_CPP_X_ALICUOTA_2]
    ON [dbo].[Categorias_iva_alicuotas_cpp]([ALICUOTA_2] ASC);


GO

