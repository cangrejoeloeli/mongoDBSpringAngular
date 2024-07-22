CREATE TABLE [dbo].[consumos_cpp_historico] (
    [CONSUMOS_TELEFONIA_ID] INT             IDENTITY (1, 1) NOT NULL,
    [ITEM_FACTURACION_ID]   INT             NULL,
    [PERIODO_ID]            INT             NULL,
    [PERIODO]               VARCHAR (7)     NULL,
    [CLIENTE_SERVICIO_ID]   INT             NOT NULL,
    [CLIENTE_ID]            INT             NULL,
    [IMPORTE]               DECIMAL (13, 6) NULL,
    [LLAMADAS]              INT             NULL,
    [DESCRIPCION]           VARCHAR (40)    NULL,
    [FACTURA_ID]            INT             NULL,
    [SEGUNDOS]              INT             NULL,
    [PRESTATARIA_CPP]       TINYINT         NULL,
    CONSTRAINT [PK_consumos_cpp_historico] PRIMARY KEY CLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC),
    CONSTRAINT [IX_consumos_cpp_historico] UNIQUE NONCLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [x_periodo_id]
    ON [dbo].[consumos_cpp_historico]([PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_id_y_prestataria_cpp_y_periodo_id]
    ON [dbo].[consumos_cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC, [PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_prestataria_y_periodo_id]
    ON [dbo].[consumos_cpp_historico]([PRESTATARIA_CPP] ASC, [PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_fatura_id]
    ON [dbo].[consumos_cpp_historico]([FACTURA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_periodo]
    ON [dbo].[consumos_cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio]
    ON [dbo].[consumos_cpp_historico]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_prestataria_cpp]
    ON [dbo].[consumos_cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);


GO

