CREATE TABLE [dbo].[clientes_para_avisos1] (
    [ID]                     INT          NOT NULL,
    [CLIENTE_SERVICIO_ID]    INT          NULL,
    [EMAIL]                  VARCHAR (89) NULL,
    [MARCA]                  TINYINT      NULL,
    [MARCA_EMAIL_SECUNDARIO] TINYINT      NULL,
    [FECHA_DE_ENVIO]         INT          NULL,
    [HORA_DE_ENVIO]          INT          NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

