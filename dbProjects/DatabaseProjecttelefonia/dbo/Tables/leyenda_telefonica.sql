CREATE TABLE [dbo].[leyenda_telefonica] (
    [LEYENDA_ID] INT          NOT NULL,
    [PEDIDO]     VARCHAR (10) NULL,
    [HEA]        VARCHAR (10) NULL,
    [FACTURA_ID] INT          NULL,
    [TICKET]     VARCHAR (39) NULL,
    [PERIODO_ID] INT          NULL,
    PRIMARY KEY CLUSTERED ([LEYENDA_ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LEY_X_PERIODO]
    ON [dbo].[leyenda_telefonica]([PERIODO_ID] ASC);


GO

