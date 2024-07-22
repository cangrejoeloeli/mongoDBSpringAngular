CREATE TABLE [dbo].[Ctacte] (
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
    PRIMARY KEY CLUSTERED ([CTA_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_ID] ASC, [CTA_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [CTA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CTA_CTACTE_X_CLIENTE_ID]
    ON [dbo].[Ctacte]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CTA_CTACTE_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Ctacte]([CLIENTE_SERVICIO_ID] ASC);


GO

