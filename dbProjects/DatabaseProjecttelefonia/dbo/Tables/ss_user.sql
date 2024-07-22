CREATE TABLE [dbo].[ss_user] (
    [NO]                  INT             NOT NULL,
    [GROUPFLAG]           TINYINT         NULL,
    [LASTNAME]            VARCHAR (25)    NULL,
    [FIRSTNAME]           VARCHAR (15)    NULL,
    [PASSWORD]            VARCHAR (20)    NULL,
    [LEVEL]               SMALLINT        NULL,
    [PASSWORDSIZE]        TINYINT         NULL,
    [PASSWORDMAXAGE]      SMALLINT        NULL,
    [PASSWORDDATE]        INT             NULL,
    [PASSWORDTIME]        INT             NULL,
    [LOGONDATE]           INT             NULL,
    [LOGONTIME]           INT             NULL,
    [FAILURES]            SMALLINT        NULL,
    [LOCKED]              TINYINT         NULL,
    [Maximo]              DECIMAL (18, 2) NULL,
    [Solicita]            INT             NULL,
    [Autoriza]            INT             NULL,
    [Codigo_autorizacion] INT             NULL,
    [email]               VARCHAR (50)    NULL,
    [baja]                INT             NULL,
    [area_id]             INT             NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([LASTNAME] ASC, [FIRSTNAME] ASC),
    UNIQUE NONCLUSTERED ([GROUPFLAG] ASC, [LASTNAME] ASC, [FIRSTNAME] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LastNameKey]
    ON [dbo].[ss_user]([LASTNAME] ASC);


GO

CREATE NONCLUSTERED INDEX [LastNam]
    ON [dbo].[ss_user]([NO] ASC);


GO

