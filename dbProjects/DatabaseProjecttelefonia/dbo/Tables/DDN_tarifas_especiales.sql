CREATE TABLE [dbo].[DDN_tarifas_especiales] (
    [id]                             INT             NULL,
    [Codigo]                         VARCHAR (6)     NULL,
    [Localidad]                      VARCHAR (50)    NULL,
    [Clave]                          TINYINT         NULL,
    [Importe_comun]                  DECIMAL (18, 4) NULL,
    [Importe_reducido]               DECIMAL (18, 4) NULL,
    [importe_reducido_con_descuento] DECIMAL (18, 4) NULL,
    [Importe_comun_con_descuento]    DECIMAL (18, 4) NULL,
    [fecha_vigencia_desde]           DATETIME        NULL,
    [fecha_vigencia_hasta]           DATETIME        NULL
);


GO

CREATE NONCLUSTERED INDEX [DDN_x_localidad]
    ON [dbo].[DDN_tarifas_especiales]([Localidad] ASC);


GO

