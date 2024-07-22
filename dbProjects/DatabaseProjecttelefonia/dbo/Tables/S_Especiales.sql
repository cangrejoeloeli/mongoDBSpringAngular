CREATE TABLE [dbo].[S_Especiales] (
    [CODIGO_ESPECIAL] INT            NULL,
    [CODIGOEMP]       INT            NOT NULL,
    [CONCEPTOE]       VARCHAR (30)   NOT NULL,
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
    [CTA_CONTABLE]    VARCHAR (20)   NULL,
    [IMPORTE]         DECIMAL (7, 2) NULL,
    PRIMARY KEY CLUSTERED ([CONCEPTOE] ASC, [CODIGOEMP] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_ESPECIAL] ASC),
    UNIQUE NONCLUSTERED ([CODIGOEMP] ASC, [CODIGO_ESPECIAL] ASC),
    UNIQUE NONCLUSTERED ([CODIGOEMP] ASC, [CONCEPTOE] ASC)
);


GO

