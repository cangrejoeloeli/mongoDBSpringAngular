CREATE TABLE [dbo].[AUDIT] (
    [InternalNumber]  INT          NOT NULL,
    [MemoField1]      CHAR (3)     NULL,
    [MemoField2]      CHAR (3)     NULL,
    [CompressionFlag] TINYINT      NULL,
    [FileName]        VARCHAR (40) NOT NULL,
    [FileVersion]     SMALLINT     NULL,
    [DateAudit]       DATETIME     NOT NULL,
    [IDUser]          INT          NOT NULL,
    [Station]         CHAR (20)    NOT NULL,
    [ProcedureName]   CHAR (14)    NOT NULL,
    [Operation]       CHAR (2)     NOT NULL,
    [SearchKey]       VARCHAR (40) NOT NULL,
    [STOREDRECORD]    IMAGE        NULL,
    PRIMARY KEY CLUSTERED ([InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([IDUser] ASC, [InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([Operation] ASC, [InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([ProcedureName] ASC, [InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([Station] ASC, [InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([SearchKey] ASC, [FileName] ASC, [InternalNumber] ASC)
);


GO

CREATE NONCLUSTERED INDEX [byAuditDateTime]
    ON [dbo].[AUDIT]([DateAudit] ASC, [InternalNumber] ASC);


GO

CREATE NONCLUSTERED INDEX [byFilenameDateTime]
    ON [dbo].[AUDIT]([FileName] ASC, [DateAudit] ASC);


GO

