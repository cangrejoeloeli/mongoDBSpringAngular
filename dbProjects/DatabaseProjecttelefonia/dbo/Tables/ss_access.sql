CREATE TABLE [dbo].[ss_access] (
    [USERNO]   INT     NOT NULL,
    [DOORNO]   INT     NOT NULL,
    [DENYFLAG] TINYINT NULL,
    PRIMARY KEY CLUSTERED ([USERNO] ASC, [DOORNO] ASC),
    UNIQUE NONCLUSTERED ([DOORNO] ASC, [USERNO] ASC)
);


GO

