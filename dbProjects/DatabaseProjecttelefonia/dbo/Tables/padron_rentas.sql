CREATE TABLE [dbo].[padron_rentas] (
    [CUIT]                 VARCHAR (11)   NOT NULL,
    [ALICUOTAS_PERCEPCION] DECIMAL (7, 2) NULL,
    [ALICUOTA_RETENCION]   DECIMAL (7, 2) NULL,
    [GRUPO_PERCEPCION]     TINYINT        NULL,
    [GRUPO_RETENCION]      TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([CUIT] ASC)
);


GO

