CREATE TABLE [dbo].[cuotas_cargos_206708] (
    [ID]         INT             NOT NULL,
    [IMPORTE]    DECIMAL (13, 2) NULL,
    [CLIENTE_ID] INT             NULL,
    [CUOTA]      TINYINT         NULL,
    [CUOTAS]     TINYINT         NULL,
    [FACTURA]    VARCHAR (19)    NULL,
    [MARCA]      INT             NULL,
    [NU]         VARCHAR (200)   NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CUO1_X_FACTURA]
    ON [dbo].[cuotas_cargos_206708]([FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [CUO1_X_CLIENTE_ID]
    ON [dbo].[cuotas_cargos_206708]([CLIENTE_ID] ASC);


GO

