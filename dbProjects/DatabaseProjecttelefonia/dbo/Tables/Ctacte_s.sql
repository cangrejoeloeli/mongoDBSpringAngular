CREATE TABLE [dbo].[Ctacte_s] (
    [CTA_ID]              INT             NOT NULL,
    [CLIENTE_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [DESCRIPCION]         VARCHAR (40)    NULL,
    [COMPROBANTE]         VARCHAR (15)    NULL,
    [TIPO_COMPROBANTE]    VARCHAR (20)    NULL,
    [A]                   VARCHAR (1)     NULL,
    [FECHA]               DATETIME        NULL,
    [DEBE]                DECIMAL (11, 2) NULL,
    [HABER]               DECIMAL (11, 2) NULL,
    [DONDE]               VARCHAR (30)    NULL,
    [SERVICIOS]           VARCHAR (19)    NULL,
    [factura_id]          INT             NULL,
    [comprobante_id]      INT             NULL,
    [caja]                INT             NULL,
    [numero_comprobante]  VARCHAR (20)    NULL,
    [cliente_agrupado]    TINYINT         NULL,
    CONSTRAINT [PK__Ctacte__1D9B5BB6] PRIMARY KEY CLUSTERED ([CTA_ID] ASC),
    CONSTRAINT [UQ__Ctacte__1E8F7FEF] UNIQUE NONCLUSTERED ([CLIENTE_ID] ASC, [CTA_ID] ASC),
    CONSTRAINT [UQ__Ctacte__1F83A428] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [CTA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [IX_Ctacte_s]
    ON [dbo].[Ctacte_s]([comprobante_id] ASC);


GO

CREATE NONCLUSTERED INDEX [CTA_CTACTE_X_CLIENTE_ID]
    ON [dbo].[Ctacte_s]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [x_factura_id]
    ON [dbo].[Ctacte_s]([factura_id] ASC);


GO

CREATE NONCLUSTERED INDEX [CTA_CTACTE_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Ctacte_s]([CLIENTE_SERVICIO_ID] ASC);


GO

