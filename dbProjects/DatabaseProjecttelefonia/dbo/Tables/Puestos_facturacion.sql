CREATE TABLE [dbo].[Puestos_facturacion] (
    [PUESTO_ID]   INT          NOT NULL,
    [PUESTO]      INT          NULL,
    [TIPO]        VARCHAR (1)  NULL,
    [NUMERO]      INT          NULL,
    [codigo]      INT          NULL,
    [quees]       VARCHAR (50) NULL,
    [servicio]    VARCHAR (50) NULL,
    [comprobante] VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([PUESTO_ID] ASC),
    CONSTRAINT [UQ__Puestos_facturac__00FF1D08] UNIQUE NONCLUSTERED ([TIPO] ASC, [PUESTO] ASC, [comprobante] ASC)
);


GO

