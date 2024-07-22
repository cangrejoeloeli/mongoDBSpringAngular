CREATE TABLE [dbo].[DDN_planes_comerciales] (
    [ID]                             INT            NOT NULL,
    [PLAN_COMERCIAL_ID]              INT            NULL,
    [CODIGO]                         VARCHAR (6)    NULL,
    [LOCALIDAD]                      VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC),
    UNIQUE NONCLUSTERED ([LOCALIDAD] ASC, [ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [DDN2_X_PLAN_COMERCIAL_ID]
    ON [dbo].[DDN_planes_comerciales]([PLAN_COMERCIAL_ID] ASC);


GO

