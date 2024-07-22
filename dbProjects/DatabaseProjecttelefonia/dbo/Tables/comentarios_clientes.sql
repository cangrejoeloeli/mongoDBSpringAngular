CREATE TABLE [dbo].[comentarios_clientes] (
    [ID_COMENTARIO]       INT           NOT NULL,
    [USUARIO]             VARCHAR (39)  NULL,
    [COMENTARIO]          VARCHAR (149) NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [CLIENTE_ID]          INT           NULL,
    [FECHA]               INT           NULL,
    [cis]                 VARCHAR (12)  NULL,
    PRIMARY KEY CLUSTERED ([ID_COMENTARIO] ASC)
);


GO

