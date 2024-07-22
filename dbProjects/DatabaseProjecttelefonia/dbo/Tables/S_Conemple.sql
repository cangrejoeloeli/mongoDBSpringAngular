CREATE TABLE [dbo].[S_Conemple] (
    [CODIGO]          INT            NOT NULL,
    [IMPORTE]         DECIMAL (9, 2) NULL,
    [CONCEPTO]        INT            NOT NULL,
    [CANTIDAD]        DECIMAL (5, 2) NULL,
    [MES1]            TINYINT        NULL,
    [MES2]            TINYINT        NULL,
    [MES3]            TINYINT        NULL,
    [MES4]            TINYINT        NULL,
    [MES5]            TINYINT        NULL,
    [MES6]            TINYINT        NULL,
    [MES7]            TINYINT        NULL,
    [MES8]            TINYINT        NULL,
    [MES9]            TINYINT        NULL,
    [MES10]           TINYINT        NULL,
    [MES11]           TINYINT        NULL,
    [MES12]           TINYINT        NULL,
    [POR_UNICA_VEZ]   TINYINT        NULL,
    [CUENTA_CONTABLE] VARCHAR (19)   NULL,
    [PERIODO]         TINYINT        NULL,
    [PARA_EXTRAS]     TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([CONCEPTO] ASC, [CODIGO] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC, [CONCEPTO] ASC)
);


GO

