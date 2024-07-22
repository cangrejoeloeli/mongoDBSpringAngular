CREATE TABLE [dbo].[DDI] (
    [ID]                             INT            NOT NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_con_descuento]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_con_descuento] DECIMAL (9, 4) NULL,
    [importe_lama]                   DECIMAL (9, 4) NULL,
    [Descripcion]                    VARCHAR (50)   NULL,
    CONSTRAINT [PK_DDI] PRIMARY KEY CLUSTERED ([ID] ASC),
    CONSTRAINT [IX_DDI] UNIQUE NONCLUSTERED ([ID] ASC),
    CONSTRAINT [IX_DDI_1] UNIQUE NONCLUSTERED ([CODIGO] ASC)
);


GO

