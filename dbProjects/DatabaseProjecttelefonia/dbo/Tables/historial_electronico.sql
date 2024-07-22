CREATE TABLE [dbo].[historial_electronico] (
    [ID_HISTORIAL]        INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [FACTURA_ELECTRONICA] TINYINT       NULL,
    [AVISO_ELECTRONICO]   TINYINT       NULL,
    [COMENTARIO]          VARCHAR (999) NULL,
    [USUARIO]             VARCHAR (49)  NULL,
    [PERIODO]             VARCHAR (49)  NULL,
    [FECHA]               DATETIME      NULL,
    [motivo]              VARCHAR (500) NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORIAL] ASC)
);


GO

CREATE NONCLUSTERED INDEX [HIS8_X_ID_Y_CLIENTE_SERVICIO]
    ON [dbo].[historial_electronico]([CLIENTE_SERVICIO_ID] ASC);


GO

