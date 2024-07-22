CREATE TABLE [dbo].[Devolucion_2067] (
    [ID]                        INT             NOT NULL,
    [CLIENTE_ID]                INT             NULL,
    [CUENTA]                    INT             NULL,
    [DIFERENCIA_2067]           DECIMAL (13, 2) NULL,
    [IMPORTE_ORIGINAL]          DECIMAL (13, 2) NULL,
    [DIFERENCIA_INTERESES_2067] DECIMAL (13, 2) NULL,
    [DIFERENCIA_IVA_2067]       DECIMAL (13, 2) NULL,
    [DIAS]                      TINYINT         NULL,
    [DIAS_PERIODO]              TINYINT         NULL,
    [SALDO_2067]                DECIMAL (13, 2) NULL,
    [SALDO_2067_COBRANZA]       DECIMAL (13, 2) NULL,
    [FACTURA]                   VARCHAR (13)    NULL,
    [INICIO]                    INT             NULL,
    [FINAL]                     INT             NULL,
    [CLASIFICACION]             VARCHAR (5)     NULL,
    [NOTA_DE_CREDITO]           VARCHAR (15)    NULL,
    [GENERADA]                  TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [DEV1_X_FACTURA]
    ON [dbo].[Devolucion_2067]([FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [DEV1_X_CLIENTE]
    ON [dbo].[Devolucion_2067]([CLIENTE_ID] ASC);


GO

