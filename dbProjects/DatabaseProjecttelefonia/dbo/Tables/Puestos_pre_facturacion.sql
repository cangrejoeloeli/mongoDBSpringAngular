CREATE TABLE [dbo].[Puestos_pre_facturacion] (
    [PUESTO_ID] INT         NOT NULL,
    [PUESTO]    INT         NULL,
    [TIPO]      VARCHAR (1) NULL,
    [NUMERO]    INT         NULL,
    PRIMARY KEY CLUSTERED ([PUESTO_ID] ASC),
    UNIQUE NONCLUSTERED ([TIPO] ASC, [PUESTO] ASC)
);


GO

