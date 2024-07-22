CREATE TABLE [dbo].[historico_llamado_rechazado] (
    [HISTO_ID]            INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [OPERADOR_ID]         INT           NULL,
    [OPERADOR]            VARCHAR (39)  NULL,
    [FECHA]               DATETIME      NULL,
    [TIPO_RESPUESTA]      TINYINT       NULL,
    [RESPUESTA]           VARCHAR (19)  NULL,
    [COMENTARIO]          VARCHAR (599) NULL,
    [gas]                 TINYINT       NULL,
    [nombre_apellido]     VARCHAR (60)  NULL,
    [tel_contacto]        VARCHAR (30)  NULL,
    PRIMARY KEY CLUSTERED ([HISTO_ID] ASC)
);


GO

