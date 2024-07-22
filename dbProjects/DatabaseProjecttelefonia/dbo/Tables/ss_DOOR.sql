CREATE TABLE [dbo].[ss_DOOR] (
    [NO]          INT          NOT NULL,
    [DGRPNO]      INT          NULL,
    [EQUATE]      VARCHAR (30) NULL,
    [DESCRIPTION] VARCHAR (60) NULL,
    [FREEZE]      TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([EQUATE] ASC),
    UNIQUE NONCLUSTERED ([DGRPNO] ASC, [DESCRIPTION] ASC)
);


GO

