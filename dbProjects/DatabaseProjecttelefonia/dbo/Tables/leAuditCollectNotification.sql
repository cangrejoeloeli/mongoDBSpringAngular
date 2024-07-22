CREATE TABLE [dbo].[leAuditCollectNotification] (
    [notificationid] INT            IDENTITY (1, 1) NOT NULL,
    [type]           INT            NOT NULL,
    [param1]         NVARCHAR (512) NULL,
    [param2]         NVARCHAR (512) NULL,
    PRIMARY KEY CLUSTERED ([notificationid] ASC)
);


GO

