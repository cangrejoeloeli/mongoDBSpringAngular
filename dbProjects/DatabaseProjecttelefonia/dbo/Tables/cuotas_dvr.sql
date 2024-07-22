CREATE TABLE [dbo].[cuotas_dvr] (
    [CUOTAS_DVR_ID]           INT             NOT NULL,
    [CUOTA]                   TINYINT         NULL,
    [CLIENTE_SERVICIO_ID]     INT             NULL,
    [DESCRIPCION]             VARCHAR (19)    NULL,
    [FACTURA_ORIGEN_ID]       INT             NULL,
    [FACTURA_DESTINO_ID]      INT             NULL,
    [PORCENTAJE]              DECIMAL (7, 2)  NULL,
    [PAGA]                    TINYINT         NULL,
    [TOTAL_CUOTAS]            TINYINT         NULL,
    [FECHA_DVR]               DATETIME        NULL,
    [FECHA_INCLUSION]         DATETIME        NULL,
    [SALDO]                   DECIMAL (7, 2)  NULL,
    [DVR_CLIENTE_SERVICIO_ID] INT             NULL,
    [IMPORTE]                 DECIMAL (18, 2) NULL,
    PRIMARY KEY CLUSTERED ([CUOTAS_DVR_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CUO2_X_PLAN_DE_PAGO]
    ON [dbo].[cuotas_dvr]([FACTURA_ORIGEN_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CUO2_X_FACTURA_DESTINO_ID]
    ON [dbo].[cuotas_dvr]([FACTURA_DESTINO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CUO2_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cuotas_dvr]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CUO2_X_DVR_CLIENTE_SERVICIO]
    ON [dbo].[cuotas_dvr]([DVR_CLIENTE_SERVICIO_ID] ASC);


GO

