CREATE TABLE [dbo].[Clientes_servicios_debito_automatico] (
    [CLIENTE_ID]                              INT          NULL,
    [CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_ID] INT          NOT NULL,
    [CLIENTE_SERVICIO_ID]                     INT          NULL,
    [BANCO]                                   INT          NULL,
    [SUCURSAL]                                INT          NULL,
    [CUENTA]                                  VARCHAR (19) NULL,
    [TIPO_DEBITO]                             INT          NULL,
    [CBU_1]                                   DECIMAL (9)  NULL,
    [CBU_2]                                   DECIMAL (15) NULL,
    [tipo_cuenta]                             TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [DDA_CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_X_CLIENTE_ID]
    ON [dbo].[Clientes_servicios_debito_automatico]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [DDA_CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_X_CLIENTE_SERVICIOS_ID]
    ON [dbo].[Clientes_servicios_debito_automatico]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [DDA_CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_X_BANCO]
    ON [dbo].[Clientes_servicios_debito_automatico]([BANCO] ASC);


GO

