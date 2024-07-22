CREATE TABLE [dbo].[clientes_para_qr] (
    [CLIENTE]                VARCHAR (60) NULL,
    [DOCUMENTO]              CHAR (20)    NULL,
    [ID]                     INT          NOT NULL,
    [CLIENTE_SERVICIO_ID]    INT          NULL,
    [EMAIL]                  VARCHAR (89) NULL,
    [MARCA]                  TINYINT      NULL,
    [MARCA_EMAIL_SECUNDARIO] TINYINT      NULL,
    [FECHA_DE_ENVIO]         INT          NULL,
    [HORA_DE_ENVIO]          INT          NULL,
    [SERVICIO]               VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

