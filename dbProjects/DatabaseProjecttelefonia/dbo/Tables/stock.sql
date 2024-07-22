CREATE TABLE [dbo].[stock] (
    [ID]          INT          NOT NULL,
    [DESCRIPCION] VARCHAR (99) NULL,
    [MARCA]       VARCHAR (49) NULL,
    [MODELO]      VARCHAR (49) NULL,
    [STOCK]       INT          NULL,
    [stock_min]   INT          NULL,
    [material]    INT          NULL,
    [tipo]        INT          NULL,
    [internet]    TINYINT      NULL,
    [sip]         TINYINT      NULL,
    [sip2]        TINYINT      NULL,
    [puertos_lan] INT          NULL,
    [ftth]        TINYINT      NULL,
    [que_es]      VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

