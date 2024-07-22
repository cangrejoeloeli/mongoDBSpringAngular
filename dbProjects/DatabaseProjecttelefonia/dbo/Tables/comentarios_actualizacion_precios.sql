CREATE TABLE [dbo].[comentarios_actualizacion_precios] (
    [ID_COMENTARIO]            INT           NOT NULL,
    [USUARIO]                  VARCHAR (39)  NULL,
    [COMENTARIO]               VARCHAR (149) NULL,
    [FECHA]                    INT           NULL,
    [TIPO_ITEM_ACTUALIZADO_ID] INT           NULL,
    [servicio]                 VARCHAR (20)  NULL,
    PRIMARY KEY CLUSTERED ([ID_COMENTARIO] ASC)
);


GO

