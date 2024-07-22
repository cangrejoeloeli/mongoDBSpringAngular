CREATE TABLE [dbo].[Facturacion_para_rentas] (
    [FACTURACION_PARA_RENTAS_ID] INT          NOT NULL,
    [PERIODO]                    VARCHAR (20) NULL,
    [TIPO]                       VARCHAR (20) NULL,
    [DESDE]                      INT          NULL,
    [HASTA]                      INT          NULL,
    [NOMBRE_ARCHIVO_TXT]         VARCHAR (20) NULL,
    PRIMARY KEY CLUSTERED ([FACTURACION_PARA_RENTAS_ID] ASC)
);


GO

