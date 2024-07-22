CREATE TABLE [dbo].[DDN_planes_especiales] (
    [ID]                             INT            NOT NULL,
    [CODIGO]                         VARCHAR (6)    NULL,
    [LOCALIDAD]                      VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_LAMA]                   DECIMAL (9, 4) NULL,
    [FECHA_DESDE]                    DATETIME       NULL,
    [FECHA_HASTA]                    DATETIME       NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC),
    UNIQUE NONCLUSTERED ([LOCALIDAD] ASC, [ID] ASC)
);


GO

