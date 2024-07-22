CREATE TABLE [dbo].[DDN] (
    [id]                             INT             NOT NULL,
    [Codigo]                         VARCHAR (6)     NULL,
    [Localidad]                      VARCHAR (50)    NULL,
    [Clave]                          TINYINT         NULL,
    [Importe_comun]                  DECIMAL (18, 4) NULL,
    [Importe_reducido]               DECIMAL (18, 4) NULL,
    [importe_reducido_con_descuento] DECIMAL (18, 4) NULL,
    [Importe_comun_con_descuento]    DECIMAL (18, 4) NULL,
    [importe_lama]                   DECIMAL (9, 4)  NULL,
    [prestataria_id]                 INT             NULL,
    [fecha_prestataria]              DATETIME        NULL,
    CONSTRAINT [PK_DDN] PRIMARY KEY CLUSTERED ([id] ASC),
    CONSTRAINT [IX_DDN] UNIQUE NONCLUSTERED ([Codigo] ASC)
);


GO

