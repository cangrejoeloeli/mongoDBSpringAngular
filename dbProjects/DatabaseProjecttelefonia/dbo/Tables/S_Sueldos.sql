CREATE TABLE [dbo].[S_Sueldos] (
    [ANO]               VARCHAR (4)     NULL,
    [MES]               VARCHAR (2)     NULL,
    [PERI]              TINYINT         NULL,
    [CODIGO]            INT             NOT NULL,
    [LEGAJO]            VARCHAR (19)    NULL,
    [SECCION]           INT             NULL,
    [APELLIDO]          VARCHAR (50)    NULL,
    [DETALLE]           VARCHAR (2499)  NULL,
    [IMPORTER]          DECIMAL (11, 2) NULL,
    [IMPORTEE]          DECIMAL (11, 2) NULL,
    [IMPORTED]          DECIMAL (11, 2) NULL,
    [IMPORTET]          DECIMAL (11, 2) NULL,
    [IMPORTEA]          DECIMAL (11, 2) NULL,
    [IMPORTE_HS_EXTRAS] DECIMAL (11, 2) NULL,
    [IMPORTE_PROMEDIO]  DECIMAL (11, 2) NULL,
    [PERIODO]           VARCHAR (8)     NOT NULL,
    [FECHA]             INT             NULL,
    [MARCA]             TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([PERIODO] ASC, [CODIGO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [SUE_SUELDOS_POR_LEGAJO]
    ON [dbo].[S_Sueldos]([LEGAJO] ASC);


GO

CREATE NONCLUSTERED INDEX [SUE_PORCODIGOAM]
    ON [dbo].[S_Sueldos]([CODIGO] ASC, [ANO] ASC, [MES] ASC);


GO

CREATE NONCLUSTERED INDEX [SUE_SUELDOS_POR_CODIGO]
    ON [dbo].[S_Sueldos]([CODIGO] ASC);


GO

