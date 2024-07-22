CREATE TABLE [dbo].[scripts] (
    [ID]          INT            NOT NULL,
    [SCRIPT]      VARCHAR (1000) NULL,
    [DESCRIPCION] VARCHAR (49)   NULL,
    [servicio]    INT            NULL,
    [motivo]      VARCHAR (80)   NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

