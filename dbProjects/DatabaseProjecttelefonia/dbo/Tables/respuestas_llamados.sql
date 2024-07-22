CREATE TABLE [dbo].[respuestas_llamados] (
    [ID_RESPUESTAS] INT           NOT NULL,
    [RESPUESTA]     VARCHAR (149) NULL,
    [ID_PREGUNTA]   INT           NULL,
    PRIMARY KEY CLUSTERED ([ID_RESPUESTAS] ASC)
);


GO

