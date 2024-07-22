CREATE TABLE [dbo].[ss_call] (
    [DESCRIPTION]      VARCHAR (200) NULL,
    [NO]               INT           NOT NULL,
    [PROCNO]           INT           NULL,
    [REQUEST]          INT           NULL,
    [USERNO]           INT           NULL,
    [DATE]             INT           NULL,
    [TIME]             INT           NULL,
    [FILENO]           INT           NULL,
    [PRIMARYKEY]       INT           NULL,
    [ACCESSDENIED]     TINYINT       NULL,
    [REQUESTCANCELLED] TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [SCALL__USERKEY]
    ON [dbo].[ss_call]([USERNO] ASC, [DATE] ASC, [TIME] ASC);


GO

CREATE NONCLUSTERED INDEX [SCALL__PROCREQKEY]
    ON [dbo].[ss_call]([PROCNO] ASC, [REQUEST] ASC, [DATE] ASC, [TIME] ASC);


GO

CREATE NONCLUSTERED INDEX [SCALL__FILEKEY]
    ON [dbo].[ss_call]([FILENO] ASC, [DATE] ASC, [TIME] ASC);


GO

CREATE NONCLUSTERED INDEX [SCALL__DATEKEY]
    ON [dbo].[ss_call]([DATE] ASC, [TIME] ASC);


GO

CREATE NONCLUSTERED INDEX [SCALL__PROCKEY]
    ON [dbo].[ss_call]([PROCNO] ASC, [DATE] ASC, [TIME] ASC);


GO

