CREATE TABLE [dbo].[Consumos_telefonia] (
    [CONSUMOS_TELEFONIA_ID]     INT             NOT NULL,
    [ITEM_FACTURACION_ID]       INT             NULL,
    [PLAN_TAFIRA_ID]            INT             NULL,
    [PTFO]                      INT             NULL,
    [PERIODO_ID]                INT             NULL,
    [PERIODO]                   VARCHAR (7)     NULL,
    [CLIENTE_ID]                INT             NOT NULL,
    [MINUTOS]                   DECIMAL (11, 6) NULL,
    [MINUTOS_REDUCIDO]          DECIMAL (11, 6) NULL,
    [IMPORTE]                   DECIMAL (13, 6) NULL,
    [IMPORTE_SIN_DESC]          DECIMAL (13, 6) NULL,
    [IMPORTE_REDUCIDO]          DECIMAL (13, 6) NULL,
    [IMPORTE_REDUCIDO_SIN_DESC] DECIMAL (13, 6) NULL,
    [PTFO_REDUCIDO]             INT             NULL,
    [LLAMADAS_NORMAL]           INT             NULL,
    [LLAMADAS_REDUCIDAS]        INT             NULL,
    [TIPO]                      INT             NULL,
    [DESCRIPCION]               VARCHAR (40)    NULL,
    [NUMERO_TELEFONO]           INT             NULL,
    [PLAN_COMERCIAL_ID]         INT             NULL,
    [FACTURA_ID]                INT             NULL,
    PRIMARY KEY CLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CON_CONSUMOS_TELEFONIA_X_NUMERO_TELEFONO]
    ON [dbo].[Consumos_telefonia]([NUMERO_TELEFONO] ASC);


GO

CREATE NONCLUSTERED INDEX [CON_X_CLIENTE_SERVICIO_ID_Y_TIPO]
    ON [dbo].[Consumos_telefonia]([CLIENTE_ID] ASC, [TIPO] ASC);


GO

CREATE NONCLUSTERED INDEX [CON_CON_CONSUMOS_TELEFONIA_X_CLIENTE_SERVICIO]
    ON [dbo].[Consumos_telefonia]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CON_X_CLIENTE_Y_TIPO_Y_PLAN_TARIFA]
    ON [dbo].[Consumos_telefonia]([CLIENTE_ID] ASC, [TIPO] ASC, [PLAN_TAFIRA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CON_CONSUMOS_TELEFONIA_X_PLAN_COMERCIAL_ID]
    ON [dbo].[Consumos_telefonia]([PLAN_COMERCIAL_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CON_CONSUMOS_TELEFON_X_CLIENTE_Y_PERIODO]
    ON [dbo].[Consumos_telefonia]([CLIENTE_ID] ASC, [PERIODO_ID] ASC);


GO

