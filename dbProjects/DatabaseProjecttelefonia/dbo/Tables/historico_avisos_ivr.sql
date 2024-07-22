CREATE TABLE [dbo].[historico_avisos_ivr] (
    [HISTORICO_IVR]  INT          NOT NULL,
    [CLIENTE_ID]     INT          NULL,
    [SERVICIO_ID]    INT          NULL,
    [SERVICIO]       VARCHAR (19) NULL,
    [NUMERO_FACTURA] VARCHAR (24) NULL,
    [PERIODO]        VARCHAR (19) NULL,
    [TIPO_DE_AVISO]  VARCHAR (19) NULL,
    [OPERADOR]       VARCHAR (19) NULL,
    [FECHA]          DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([HISTORICO_IVR] ASC)
);


GO

