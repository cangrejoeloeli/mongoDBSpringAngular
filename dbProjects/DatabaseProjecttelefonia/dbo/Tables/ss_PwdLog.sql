CREATE TABLE [dbo].[ss_PwdLog] (
    [NO]       INT          NOT NULL,
    [USERNO]   INT          NULL,
    [PASSWORD] VARCHAR (20) NULL,
    [DATE]     INT          NULL,
    [TIME]     INT          NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([USERNO] ASC, [DATE] ASC, [NO] ASC)
);


GO

