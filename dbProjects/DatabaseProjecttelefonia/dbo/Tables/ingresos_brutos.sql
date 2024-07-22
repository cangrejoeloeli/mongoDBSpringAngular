CREATE TABLE [dbo].[ingresos_brutos] (
    [INGRESOS_BRUTOS_ID] INT             NOT NULL,
    [PERIODO_ID]         INT             NULL,
    [SERVICIO]           VARCHAR (19)    NULL,
    [COMPROBANTE]        VARCHAR (19)    NULL,
    [TIPO]               VARCHAR (1)     NULL,
    [NUMERO_DE_FACTURA]  VARCHAR (19)    NULL,
    [NETO_IMPONIBLE]     DECIMAL (11, 2) NULL,
    [PERCEPCION]         DECIMAL (11, 2) NULL,
    [CUIT]               VARCHAR (13)    NULL,
    [FECHA]              DATETIME        NULL,
    PRIMARY KEY CLUSTERED ([INGRESOS_BRUTOS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ING_POR_SERVICIO_Y_POR_FECHA]
    ON [dbo].[ingresos_brutos]([SERVICIO] ASC, [FECHA] ASC);


GO

CREATE NONCLUSTERED INDEX [ING_INGRESOS_BRUTOS_X_PERIODO_ID]
    ON [dbo].[ingresos_brutos]([PERIODO_ID] ASC);


GO

