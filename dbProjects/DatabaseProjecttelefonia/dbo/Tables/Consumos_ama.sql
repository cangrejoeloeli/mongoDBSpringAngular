CREATE TABLE [dbo].[Consumos_ama] (
    [CONSUMOS_AMA_ID]     INT             NOT NULL,
    [LLAMADAS]            INT             NULL,
    [PERIODO_ID]          INT             NULL,
    [PERIODO]             VARCHAR (7)     NULL,
    [MINUTOS]             DECIMAL (18, 9) NULL,
    [IMPORTE]             DECIMAL (13, 6) NULL,
    [TIPO]                INT             NULL,
    [DESCRIPCION]         VARCHAR (40)    NULL,
    [IMPORTE_REDUCIDO]    DECIMAL (13, 6) NULL,
    [ITEM_FACTURACION_ID] INT             NULL,
    CONSTRAINT [PK__Consumos_ama__28C2F59F] PRIMARY KEY CLUSTERED ([CONSUMOS_AMA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CON21_X_TIPO]
    ON [dbo].[Consumos_ama]([TIPO] ASC);


GO

CREATE NONCLUSTERED INDEX [CON21_X_PERIODO_ID]
    ON [dbo].[Consumos_ama]([PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CON21_X_TIPO_Y_PERIODO_ID]
    ON [dbo].[Consumos_ama]([TIPO] ASC, [PERIODO_ID] ASC);


GO

