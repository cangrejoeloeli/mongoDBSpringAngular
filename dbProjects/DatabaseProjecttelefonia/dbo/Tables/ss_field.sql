CREATE TABLE [dbo].[ss_field] (
    [NO]     INT          NOT NULL,
    [FILENO] INT          NULL,
    [NAME]   VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [SFIELD__FILEKEY]
    ON [dbo].[ss_field]([FILENO] ASC, [NAME] ASC);


GO

