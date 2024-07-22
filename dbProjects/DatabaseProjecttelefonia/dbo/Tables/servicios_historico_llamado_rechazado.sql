CREATE TABLE [dbo].[servicios_historico_llamado_rechazado] (
    [HISTO_ID]            INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [OPERADOR_ID]         INT           NULL,
    [OPERADOR]            VARCHAR (39)  NULL,
    [FECHA]               DATETIME      NULL,
    [TIPO_RESPUESTA]      TINYINT       NULL,
    [RESPUESTA]           VARCHAR (19)  NULL,
    [COMENTARIO]          VARCHAR (599) NULL,
    PRIMARY KEY CLUSTERED ([HISTO_ID] ASC)
);


GO

