CREATE TABLE [dbo].[historial_internet] (
    [ID_HISTORIAL]        INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [COMENTARIO]          VARCHAR (249) NULL,
    [USUARIO]             VARCHAR (49)  NULL,
    [FECHA]               DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORIAL] ASC)
);


GO

