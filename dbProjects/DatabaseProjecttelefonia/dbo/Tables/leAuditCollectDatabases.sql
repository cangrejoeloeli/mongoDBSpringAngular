CREATE TABLE [dbo].[leAuditCollectDatabases] (
    [databaseid]            INT             IDENTITY (1, 1) NOT NULL,
    [databasename]          NVARCHAR (255)  NULL,
    [databaselogbackuppool] NVARCHAR (1024) NULL,
    [backupppid]            INT             NULL,
    [repositoryhostname]    NVARCHAR (1024) NULL,
    [repositoryhostport]    INT             NULL,
    [globalrepositoryname]  NVARCHAR (1024) NULL,
    [auditon]               CHAR (1)        NOT NULL,
    [opfilter]              NVARCHAR (255)  NULL,
    PRIMARY KEY CLUSTERED ([databaseid] ASC)
);


GO

