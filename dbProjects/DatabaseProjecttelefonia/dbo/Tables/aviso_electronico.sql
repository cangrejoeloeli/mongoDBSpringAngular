CREATE TABLE [dbo].[aviso_electronico] (
    [AVISO_ID]            INT             NOT NULL,
    [MARCA_ENVIADO]       TINYINT         NULL,
    [CLIENTE_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [NUMERO_FACTURA]      VARCHAR (49)    NULL,
    [IMPORTE]             DECIMAL (13, 2) NULL,
    [FECHA_VENCIMIENTO]   INT             NULL,
    [EMAIL]               VARCHAR (79)    NULL,
    [EMAIL_SEC]           VARCHAR (79)    NULL,
    [NOMBRE_USUARIO]      VARCHAR (79)    NULL,
    [FECHA_GENERACION]    DATETIME        NULL,
    [FECHA_ENVIO]         DATETIME        NULL,
    PRIMARY KEY CLUSTERED ([AVISO_ID] ASC)
);


GO

