CREATE TABLE [dbo].[pure_en_factura] (
    [ID]      INT            NOT NULL,
    [FACTURA] VARCHAR (19)   NULL,
    [LEYENDA] VARCHAR (4999) NULL,
    [CUENTA]  INT            NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA] ASC, [ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [PUR_POR_FACTURA]
    ON [dbo].[pure_en_factura]([FACTURA] ASC);


GO

