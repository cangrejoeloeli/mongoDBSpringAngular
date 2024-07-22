CREATE TABLE [dbo].[AuditRec] (
    [ID]             INT      NOT NULL,
    [InternalNumber] INT      NULL,
    [IdUser]         SMALLINT NULL,
    [DateRec]        DATETIME NULL,
    [Forced]         TINYINT  NULL,
    [Renumbered]     TINYINT  NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [byIntNumber]
    ON [dbo].[AuditRec]([InternalNumber] ASC, [ID] ASC);


GO

