CREATE TABLE [dbo].[ss_Procedimiento] (
    [NO]              INT          NOT NULL,
    [PROGNO]          INT          NULL,
    [NAME]            VARCHAR (30) NULL,
    [GENERALDOORNO]   INT          NULL,
    [GENERALOVERRIDE] TINYINT      NULL,
    [INSERTDOORNO]    INT          NULL,
    [INSERTOVERRIDE]  TINYINT      NULL,
    [CHANGEDOORNO]    INT          NULL,
    [CHANGEOVERRIDE]  TINYINT      NULL,
    [DELETEDOORNO]    INT          NULL,
    [DELETEOVERRIDE]  TINYINT      NULL,
    [VIEWDOORNO]      INT          NULL,
    [VIEWOVERRIDE]    TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [SPROC__PROGKEY]
    ON [dbo].[ss_Procedimiento]([PROGNO] ASC, [NAME] ASC);


GO

