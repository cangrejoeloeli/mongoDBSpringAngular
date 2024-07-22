CREATE TABLE [dbo].[S_Preliq] (
    [ANO]               VARCHAR (4)     NULL,
    [MES]               VARCHAR (2)     NULL,
    [PERI]              TINYINT         NULL,
    [CODIGO]            INT             NULL,
    [LEGAJO]            VARCHAR (19)    NULL,
    [SECCION]           INT             NULL,
    [CODIGO_AUTO]       INT             NULL,
    [APELLIDO]          VARCHAR (50)    NULL,
    [DETALLE]           VARCHAR (2499)  NULL,
    [IMPORTER]          DECIMAL (13, 2) NULL,
    [IMPORTEE]          DECIMAL (11, 2) NULL,
    [IMPORTED]          DECIMAL (11, 2) NULL,
    [IMPORTET]          DECIMAL (11, 2) NULL,
    [IMPORTEA]          DECIMAL (11, 2) NULL,
    [IMPORTE_HS_EXTRAS] DECIMAL (11, 2) NULL,
    [IMPORTE_PROMEDIO]  DECIMAL (11, 2) NULL,
    [PESOS]             DECIMAL (11, 2) NULL,
    [BONOS]             DECIMAL (11, 2) NULL,
    UNIQUE NONCLUSTERED ([LEGAJO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [PRE_CODPRE]
    ON [dbo].[S_Preliq]([CODIGO] ASC);


GO

CREATE NONCLUSTERED INDEX [PRE_X_CODIGO_AUTO]
    ON [dbo].[S_Preliq]([CODIGO_AUTO] ASC);


GO

