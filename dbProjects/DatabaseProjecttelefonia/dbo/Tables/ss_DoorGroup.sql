CREATE TABLE [dbo].[ss_DoorGroup] (
    [NO]     INT          NOT NULL,
    [NAME]   VARCHAR (30) NULL,
    [FREEZE] TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([NAME] ASC)
);


GO

