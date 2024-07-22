CREATE TABLE [dbo].[historico_consulta_c] (
    [ID_HISTORICO]  INT           NOT NULL,
    [ID_CONSULTA_C] INT           NULL,
    [FECHA]         DATETIME      NULL,
    [USUARIO]       VARCHAR (29)  NULL,
    [COMENTARIO]    VARCHAR (119) NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);


GO

