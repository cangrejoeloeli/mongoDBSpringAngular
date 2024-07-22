CREATE TABLE [dbo].[resultados_de_llamados] (
    [ID_RESULTADOS_DE_LLAMADOS] INT          NOT NULL,
    [CLIENTES_SERVICIOS_ID]     INT          NULL,
    [CLIENTE]                   VARCHAR (49) NULL,
    [PREGUNTA_ID]               INT          NULL,
    [RESPUESTA_ID]              INT          NULL,
    [PREGUNTA]                  VARCHAR (89) NULL,
    [RESPUESTA]                 VARCHAR (89) NULL,
    [FECHA_RESULTADOS]          DATETIME     NULL,
    [estado_servicio]           VARCHAR (50) NULL,
    [estado_wifi]               TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([ID_RESULTADOS_DE_LLAMADOS] ASC)
);


GO

