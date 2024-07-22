CREATE TABLE [dbo].[leAuditCollectAlerts] (
    [databaseid]     INT NULL,
    [alertid]        INT NOT NULL,
    [notificationid] INT NULL,
    FOREIGN KEY ([databaseid]) REFERENCES [dbo].[leAuditCollectDatabases] ([databaseid]),
    FOREIGN KEY ([notificationid]) REFERENCES [dbo].[leAuditCollectNotification] ([notificationid])
);


GO

