CREATE TABLE [dbo].[avisos_enviados] (
    [ID]                    INT             NOT NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [CLIENTE]               VARCHAR (40)    NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [MARCA]                 TINYINT         NULL,
    [MARCA_MAIL_SECUNDARIO] TINYINT         NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (19, 2) NULL,
    [PERIODO]               VARCHAR (19)    NOT NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [HORA_DE_ENVIO]         INT             NULL,
    [CIS]                   VARCHAR (12)    NOT NULL,
    [TIPO]                  VARCHAR (30)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [FAC3111_X_CIS_Y_PERIODO]
    ON [dbo].[avisos_enviados]([CIS] ASC, [PERIODO] ASC);


GO

CREATE NONCLUSTERED INDEX [FAC3111_X_PERIODO]
    ON [dbo].[avisos_enviados]([PERIODO] ASC);


GO

