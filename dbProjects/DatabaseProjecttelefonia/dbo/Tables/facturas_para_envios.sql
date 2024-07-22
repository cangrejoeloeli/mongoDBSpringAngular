CREATE TABLE [dbo].[facturas_para_envios] (
    [ID]                    INT             NOT NULL,
    [MARCA]                 TINYINT         NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (39)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (13, 2) NULL,
    [PERIODO]               VARCHAR (19)    NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [email_1]               VARCHAR (59)    NULL,
    [marca_mail_secundario] TINYINT         NULL,
    [mail_secundario]       VARCHAR (59)    NULL,
    [hora_de_envio]         INT             NULL,
    [cliente]               VARCHAR (40)    NULL,
    [cis]                   VARCHAR (12)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [FAC8_X_PERIODO]
    ON [dbo].[facturas_para_envios]([PERIODO] ASC);


GO

