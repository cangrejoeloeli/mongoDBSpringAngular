CREATE TABLE [dbo].[a_imprimir_acerca] (
    [ID_MEZCLA]           INT          NOT NULL,
    [CODIGO_CALLE]        INT          NULL,
    [NUMERO]              INT          NULL,
    [ORDEN]               INT          NULL,
    [RUTA]                INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [CLIENTE_ID]          INT          NULL,
    [FACTURA_ID]          VARCHAR (79) NULL,
    [LOCALIDAD_POSTAL]    VARCHAR (79) NULL,
    [SERVICIO]            VARCHAR (33) NULL,
    [IMPRESO]             TINYINT      NULL,
    [PERIODO_ID]          INT          NULL,
    [electronica]         TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([ID_MEZCLA] ASC)
);


GO

CREATE NONCLUSTERED INDEX [AIA_X_CALLE_DES]
    ON [dbo].[a_imprimir_acerca]([CODIGO_CALLE] DESC, [NUMERO] DESC);


GO

CREATE NONCLUSTERED INDEX [AIA_X_CALLE_ASC]
    ON [dbo].[a_imprimir_acerca]([CODIGO_CALLE] ASC, [NUMERO] ASC);


GO

CREATE NONCLUSTERED INDEX [AIA_X_RUTA]
    ON [dbo].[a_imprimir_acerca]([RUTA] ASC, [ORDEN] ASC);


GO

