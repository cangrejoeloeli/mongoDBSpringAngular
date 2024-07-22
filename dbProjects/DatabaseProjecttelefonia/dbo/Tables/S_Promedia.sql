CREATE TABLE [dbo].[S_Promedia] (
    [ID_PROMEDIA] INT          NULL,
    [DESCRIPCION] VARCHAR (30) NULL,
    [MES1]        TINYINT      NULL,
    [MES2]        TINYINT      NULL,
    [MES3]        TINYINT      NULL,
    [MES4]        TINYINT      NULL,
    [MES5]        TINYINT      NULL,
    [MES6]        TINYINT      NULL,
    [MES7]        TINYINT      NULL,
    [MES8]        TINYINT      NULL,
    [MES9]        TINYINT      NULL,
    [MES10]       TINYINT      NULL,
    [MES11]       TINYINT      NULL,
    [MES12]       TINYINT      NULL,
    [ULTIMO_MES]  VARCHAR (2)  NULL,
    [ULTIMO_ANO]  VARCHAR (4)  NULL,
    UNIQUE NONCLUSTERED ([ID_PROMEDIA] ASC)
);


GO

