CREATE TABLE [dbo].[DDI_tarifas_especiales] (
    [ID]                             INT            NOT NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_con_descuento]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_con_descuento] DECIMAL (9, 4) NULL,
    [fecha_vigencia_desde]           DATETIME       NULL,
    [fecha_vigencia_hasta]           DATETIME       NULL
);


GO

CREATE NONCLUSTERED INDEX [DDI_x_pais]
    ON [dbo].[DDI_tarifas_especiales]([PAIS] ASC);


GO

