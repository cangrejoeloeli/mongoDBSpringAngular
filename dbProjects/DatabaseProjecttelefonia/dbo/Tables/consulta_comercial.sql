CREATE TABLE [dbo].[consulta_comercial] (
    [ID_CONSULTA_COMERCIAL] INT           NOT NULL,
    [CLIENTE_ID]            INT           NULL,
    [NOMBRE]                VARCHAR (19)  NULL,
    [TELEFONO]              INT           NULL,
    [ESTADO]                TINYINT       NULL,
    [MENSAJE]               VARCHAR (139) NULL,
    PRIMARY KEY CLUSTERED ([ID_CONSULTA_COMERCIAL] ASC)
);


GO

