CREATE TABLE [dbo].[S_Conceptos] (
    [CODIGO]        INT            NOT NULL,
    [CANTIDAD]      VARCHAR (2)    NULL,
    [DESCRI]        VARCHAR (50)   NULL,
    [IMPUTA]        VARCHAR (18)   NULL,
    [CTA_ADM]       VARCHAR (20)   NULL,
    [IMPORTE]       DECIMAL (7, 2) NULL,
    [FORMA]         VARCHAR (10)   NULL,
    [FLAG]          TINYINT        NULL,
    [MES1]          TINYINT        NULL,
    [MES2]          TINYINT        NULL,
    [MES3]          TINYINT        NULL,
    [MES4]          TINYINT        NULL,
    [MES5]          TINYINT        NULL,
    [MES6]          TINYINT        NULL,
    [MES7]          TINYINT        NULL,
    [MES8]          TINYINT        NULL,
    [MES9]          TINYINT        NULL,
    [MES10]         TINYINT        NULL,
    [MES11]         TINYINT        NULL,
    [MES12]         TINYINT        NULL,
    [DESC_SOBRE]    VARCHAR (1)    NULL,
    [REMU_SOBRE]    VARCHAR (1)    NULL,
    [SOBRE]         VARCHAR (20)   NULL,
    [FORMULA]       VARCHAR (50)   NULL,
    [POR_UNICA_VEZ] TINYINT        NULL,
    [PRESENTISMO]   TINYINT        NULL,
    [POR_PERIODO]   TINYINT        NULL,
    [ANTIGUEDAD]    TINYINT        NULL,
    [PARA_EXTRAS]   TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CON_PORDESCRI]
    ON [dbo].[S_Conceptos]([DESCRI] ASC);


GO

CREATE NONCLUSTERED INDEX [CON_PORFLAG]
    ON [dbo].[S_Conceptos]([FLAG] ASC);


GO

