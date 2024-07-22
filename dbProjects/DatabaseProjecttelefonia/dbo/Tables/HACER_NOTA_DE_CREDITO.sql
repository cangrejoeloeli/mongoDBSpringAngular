CREATE TABLE [dbo].[HACER_NOTA_DE_CREDITO] (
    [PRE_HACER_NOTA_DE_CREDITO_ID] INT             NOT NULL,
    [CLIENTE_ID]                   INT             NULL,
    [NUMERO_FACTURA]               VARCHAR (15)    NULL,
    [NUMERO_NOTA_DE_CREDITO]       VARCHAR (15)    NULL,
    [PERIODO]                      VARCHAR (9)     NULL,
    [IMPORTE_FACTURA]              DECIMAL (9, 2)  NULL,
    [IMPORTE_CREDITO]              DECIMAL (9, 2)  NULL,
    [DIFERENCIA]                   DECIMAL (11, 2) NULL,
    [RECIBO]                       INT             NULL,
    [FECHA_RECIBO]                 INT             NULL,
    [FORMA_PAGO]                   VARCHAR (200)   NULL,
    [IMPRESA]                      TINYINT         NULL,
    [TESORERIA]                    TINYINT         NULL,
    [CUENTA]                       INT             NULL,
    [NOMBRE]                       VARCHAR (40)    NULL,
    [METROS]                       DECIMAL (9, 2)  NULL,
    [PREMIOS_Y_CASTIGOS_ID]        INT             NULL,
    PRIMARY KEY CLUSTERED ([PRE_HACER_NOTA_DE_CREDITO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [HAC5_HACER_NOTA_DE_CREDITO_X_RECIBO]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([RECIBO] ASC);


GO

CREATE NONCLUSTERED INDEX [HAC5_HACER_NOTA_DE_CREDITO_X_PERIODO]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([PERIODO] ASC);


GO

CREATE NONCLUSTERED INDEX [HAC5_HARCER_NOTA_DE_CREDITO_X_CUENTA_Y_PERIODO]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([CUENTA] ASC, [PERIODO] ASC);


GO

CREATE NONCLUSTERED INDEX [HAC5_HACER_NOTA_DE_CREDITO_X_FACTURA]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([NUMERO_FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [HAC5_HACER_NOTA_DE_CREDITO_X_CUENTA]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([CLIENTE_ID] ASC);


GO

