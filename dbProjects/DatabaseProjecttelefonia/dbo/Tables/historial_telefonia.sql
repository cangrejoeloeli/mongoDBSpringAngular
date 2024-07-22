CREATE TABLE [dbo].[historial_telefonia] (
    [ID]                  INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [TELEFONO]            VARCHAR (49)  NULL,
    [COMENTARIO]          VARCHAR (119) NULL,
    [FECHA]               DATETIME      NULL,
    [cis]                 VARCHAR (90)  NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [HIS3_X_TELEFONO]
    ON [dbo].[historial_telefonia]([TELEFONO] ASC);


GO

