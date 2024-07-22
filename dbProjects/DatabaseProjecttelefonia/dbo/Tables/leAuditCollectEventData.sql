CREATE TABLE [dbo].[leAuditCollectEventData] (
    [seqnum]               INT            IDENTITY (1, 1) NOT NULL,
    [eventtime]            DATETIME       NULL,
    [eventclass]           INT            NOT NULL,
    [alerttypeid]          INT            NULL,
    [eventsubclass]        INT            NULL,
    [starttime]            DATETIME       NULL,
    [endtime]              DATETIME       NULL,
    [textdata]             NTEXT          NULL,
    [success]              INT            NULL,
    [clienthostname]       NVARCHAR (128) NULL,
    [applicationname]      NVARCHAR (128) NULL,
    [ntusername]           NVARCHAR (128) NULL,
    [ntdomainname]         NVARCHAR (128) NULL,
    [sqlsecurityloginname] NVARCHAR (128) NULL,
    [spid]                 INT            NULL,
    [databaseid]           INT            NULL,
    [databasename]         NVARCHAR (128) NULL,
    [objectid]             INT            NULL,
    [objecttype]           INT            NULL,
    [objectname]           NVARCHAR (128) NULL,
    [objectowner]          NVARCHAR (128) NULL,
    [permissions]          INT            NULL,
    [targetrolename]       NVARCHAR (128) NULL,
    [targetloginname]      NVARCHAR (128) NULL,
    [targetusername]       NVARCHAR (128) NULL
);


GO

CREATE NONCLUSTERED INDEX [leEventDataIdx1]
    ON [dbo].[leAuditCollectEventData]([ntusername] ASC);


GO

CREATE NONCLUSTERED INDEX [leEventDataIdx6]
    ON [dbo].[leAuditCollectEventData]([starttime] ASC);


GO

CREATE NONCLUSTERED INDEX [leEventDataIdx3]
    ON [dbo].[leAuditCollectEventData]([applicationname] ASC);


GO

CREATE NONCLUSTERED INDEX [leEventDataIdx2]
    ON [dbo].[leAuditCollectEventData]([sqlsecurityloginname] ASC);


GO

CREATE NONCLUSTERED INDEX [leEventDataIdx8]
    ON [dbo].[leAuditCollectEventData]([spid] ASC);


GO

CREATE NONCLUSTERED INDEX [leEventDataIdx5]
    ON [dbo].[leAuditCollectEventData]([eventtime] ASC);


GO

CREATE NONCLUSTERED INDEX [leEventDataIdx7]
    ON [dbo].[leAuditCollectEventData]([endtime] ASC);


GO

CREATE NONCLUSTERED INDEX [leEventDataIdx4]
    ON [dbo].[leAuditCollectEventData]([clienthostname] ASC);


GO

