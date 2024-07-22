CREATE TABLE [dbo].[consumos_telefonia_historico] (
    [CONSUMOS_TELEFONIA_ID]     INT             NOT NULL,
    [ITEM_FACTURACION_ID]       INT             NULL,
    [PLAN_TAFIRA_ID]            INT             NULL,
    [PTFO]                      INT             NULL,
    [PERIODO_ID]                INT             NULL,
    [PERIODO]                   VARCHAR (7)     NULL,
    [CLIENTE_ID]                INT             NULL,
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
    CONSTRAINT [PK_consumos_telefonia_historico] PRIMARY KEY CLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC),
    CONSTRAINT [IX_consumos_telefonia_historico] UNIQUE NONCLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_id_y_tipo_y_plan_tarifa]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [TIPO] ASC, [PLAN_TAFIRA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [con_consumos_telefonia_x_cliente_servicio]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_tipo_y_periodo_id]
    ON [dbo].[consumos_telefonia_historico]([TIPO] ASC, [PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [consumos_telefonia_x_numero_telefono]
    ON [dbo].[consumos_telefonia_historico]([NUMERO_TELEFONO] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_tipo_y_plan_periodo_id]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [TIPO] ASC, [PLAN_TAFIRA_ID] ASC, [PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [consumos_telefon_x_cliente_y_periodo]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_id_y_tipo]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [TIPO] ASC);


GO

CREATE NONCLUSTERED INDEX [x_periodo_id]
    ON [dbo].[consumos_telefonia_historico]([PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [consumos_telefonia_x_plan_comercial_id]
    ON [dbo].[consumos_telefonia_historico]([PLAN_COMERCIAL_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_tipo_y_periodo_id]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [TIPO] ASC, [PERIODO_ID] ASC);


GO

