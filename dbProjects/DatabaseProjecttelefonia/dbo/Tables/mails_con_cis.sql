CREATE TABLE [dbo].[mails_con_cis] (
    [ID_TABLA]  INT          NOT NULL,
    [CIS]       CHAR (15)    NULL,
    [EMAIL]     VARCHAR (49) NULL,
    [TELEFONO]  CHAR (40)    NULL,
    [VALIDADO]  TINYINT      NULL,
    [GAS]       TINYINT      NULL,
    [FECHA]     DATETIME     NULL,
    [baja]      TINYINT      NULL,
    [procesado] TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([ID_TABLA] ASC)
);


GO

