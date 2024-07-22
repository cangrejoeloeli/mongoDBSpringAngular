CREATE TABLE [dbo].[factura_memory_sql] (
    [ID]                  INT             NOT NULL,
    [QUE_ES]              VARCHAR (19)    NULL,
    [FECHA_EMISION]       DATETIME        NULL,
    [FACTURA_ID]          INT             NULL,
    [NUMERO_FACTURA]      VARCHAR (24)    NULL,
    [NUMERO_FACTURA2]     VARCHAR (19)    NULL,
    [SERVICIO]            VARCHAR (19)    NULL,
    [IMPORTE]             DECIMAL (11, 2) NULL,
    [USUARIO]             VARCHAR (49)    NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [CLIENTE_ID]          INT             NULL,
    [MARCA]               TINYINT         NULL,
    [MAIL]                VARCHAR (79)    NULL,
    [NOMBRE]              VARCHAR (89)    NULL,
    [DOCUMENTO]           VARCHAR (19)    NULL,
    [CALLE]               VARCHAR (49)    NULL,
    [CALLE_NUMERO]        INT             NULL,
    [TELEFONO]            VARCHAR (44)    NULL,
    [FACTURA_DE_CREDITO]  TINYINT         NULL,
    [FACTURA_AGRUPADA]    TINYINT         NULL,
    [PERIODO]             INT             NULL,
    [DETALLE_LLAMADA]     TINYINT         NULL,
    [FECHA_ENVIO]         INT             NULL,
    [HORA_ENVIO]          INT             NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC)
);


GO

