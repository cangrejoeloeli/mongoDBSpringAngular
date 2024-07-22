CREATE TABLE [dbo].[Percepciones_items_opcionales] (
    [PERCEPCION_ID]                     INT            NOT NULL,
    [DESCRIPCION]                       VARCHAR (30)   NULL,
    [COLUMNA_SUBDIARIO_IVA]             TINYINT        NULL,
    [DESCRIPCION_SUBDIARIO_IVA]         VARCHAR (8)    NULL,
    [COLUMNA_SUBDIARIO_FACTURACION]     TINYINT        NULL,
    [DESCRIPCION_SUBDIARIO_FACTURACION] VARCHAR (8)    NULL,
    [CUENTA]                            VARCHAR (30)   NULL,
    [LIBRO_IVA]                         TINYINT        NULL,
    [TIPO]                              VARCHAR (4)    NULL,
    [BASE_IMPONIBLE]                    DECIMAL (9, 2) NULL,
    [CODIGO_DE_IMPUESTO]                INT            NULL,
    [CODIGO_DE_REGIMEN]                 INT            NULL,
    [PORCENTAJE_DE_APLICACION]          DECIMAL (7, 2) NULL,
    [IMPORTE_DE_APLICACION]             DECIMAL (9, 2) NULL,
    [FECHA_BOLETIN]                     DATETIME       NULL,
    [POR_ESCALAS]                       TINYINT        NULL,
    [ITEM_FACTURACION_ID]               INT            NULL,
    PRIMARY KEY CLUSTERED ([PERCEPCION_ID] ASC)
);


GO

