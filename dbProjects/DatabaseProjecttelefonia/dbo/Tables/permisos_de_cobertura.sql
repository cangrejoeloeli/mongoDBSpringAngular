CREATE TABLE [dbo].[permisos_de_cobertura] (
    [COBERTURAS_DE_CAJAS_ID] INT           NOT NULL,
    [CAJAS_ID]               INT           NULL,
    [CODIGO_CALLE]           INT           NULL,
    [DESDE]                  INT           NULL,
    [HASTA]                  INT           NULL,
    [FUERA_DE_ZONA]          TINYINT       NULL,
    [OBSERVACION]            VARCHAR (199) NULL,
    PRIMARY KEY CLUSTERED ([COBERTURAS_DE_CAJAS_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_CALLE] ASC, [COBERTURAS_DE_CAJAS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [COB2_COBERTURAS_DE_CAJAS_X_CODIGO_CALLE]
    ON [dbo].[permisos_de_cobertura]([CODIGO_CALLE] ASC);


GO

CREATE NONCLUSTERED INDEX [COB2_COBERTURAS_DE_CAJAS_X_CAJA_ID]
    ON [dbo].[permisos_de_cobertura]([CAJAS_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [COB2_COBERTURAS_DE_CAJAS_X_CAJAS_ID_Y_ID]
    ON [dbo].[permisos_de_cobertura]([CAJAS_ID] ASC, [COBERTURAS_DE_CAJAS_ID] ASC);


GO

