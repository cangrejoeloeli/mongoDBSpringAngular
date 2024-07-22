CREATE TABLE [dbo].[DDI_planes_comerciales] (
    [ID]                             INT            NOT NULL,
    [PLAN_COMERCIAL_ID]              INT            NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    CONSTRAINT [PK__DDI_planes_comer__192BAC54] PRIMARY KEY CLUSTERED ([ID] ASC),
    CONSTRAINT [UQ__DDI_planes_comer__1A1FD08D] UNIQUE NONCLUSTERED ([PAIS] ASC, [ID] ASC),
    CONSTRAINT [UQ__DDI_planes_comer__1B13F4C6] UNIQUE NONCLUSTERED ([CODIGO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [DDI2_X_PLAN_COMERCIAL_ID]
    ON [dbo].[DDI_planes_comerciales]([PLAN_COMERCIAL_ID] ASC);


GO

