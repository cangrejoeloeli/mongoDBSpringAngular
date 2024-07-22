CREATE TABLE [dbo].[DDI_planes_especiales] (
    [ID]                             INT            NOT NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [IMPORTE_LAMA]                   DECIMAL (9, 4) NULL,
    [DESCRIPCION]                    VARCHAR (49)   NULL,
    [FECHA_DESDE]                    DATETIME       NULL,
    [FECHA_HASTA]                    DATETIME       NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [DDI4_DDI_X_PAIS_Y_ID]
    ON [dbo].[DDI_planes_especiales]([PAIS] ASC, [ID] ASC);


GO

