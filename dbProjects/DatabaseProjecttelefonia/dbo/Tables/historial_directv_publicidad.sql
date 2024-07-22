CREATE TABLE [dbo].[historial_directv_publicidad] (
    [ID]          INT          NOT NULL,
    [CLIENTE_ID]  INT          NULL,
    [SERVICIO_ID] INT          NULL,
    [EMAIL]       VARCHAR (43) NULL,
    [FECHA]       DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

