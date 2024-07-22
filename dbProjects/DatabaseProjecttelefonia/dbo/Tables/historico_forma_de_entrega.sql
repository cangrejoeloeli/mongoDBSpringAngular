CREATE TABLE [dbo].[historico_forma_de_entrega] (
    [ID]                 INT            NULL,
    [ID_FORMA]           INT            NULL,
    [TIPO]               VARCHAR (21)   NULL,
    [FORMA]              VARCHAR (20)   NULL,
    [SERVICIO]           VARCHAR (19)   NULL,
    [IMPORTE_VIEJO]      DECIMAL (7, 2) NULL,
    [IMPORTE_NUEVO]      DECIMAL (7, 2) NULL,
    [OPERADOR]           VARCHAR (142)  NULL,
    [FECHA_MODIFICACION] DATETIME       NULL
);


GO

