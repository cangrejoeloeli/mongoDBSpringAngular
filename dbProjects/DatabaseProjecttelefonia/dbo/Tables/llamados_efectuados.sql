CREATE TABLE [dbo].[llamados_efectuados] (
    [id_llamada]         INT             NOT NULL,
    [CLIENTE]            VARCHAR (40)    NULL,
    [FACTURA]            VARCHAR (20)    NULL,
    [VENCIMIENTO]        VARCHAR (10)    NULL,
    [SALDO]              DECIMAL (15, 2) NULL,
    [INTENTOS]           INT             NULL,
    [result_code]        VARCHAR (19)    NULL,
    [result_description] VARCHAR (40)    NULL,
    [TELEFONO]           VARCHAR (30)    NULL,
    [FECHA]              VARCHAR (29)    NULL,
    [HORA]               VARCHAR (8)     NULL,
    [FECHA_LLAMADA]      DATETIME        NULL,
    PRIMARY KEY CLUSTERED ([id_llamada] ASC),
    UNIQUE NONCLUSTERED ([id_llamada] ASC, [TELEFONO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LLA_X_CLIENTE_SERVICIO]
    ON [dbo].[llamados_efectuados]([CLIENTE] ASC);


GO

