CREATE TABLE [dbo].[cajas] (
    [CAJAS_ID]                     INT             NOT NULL,
    [NUMERO_DE_CAJA]               INT             NULL,
    [DESCRIPCION]                  VARCHAR (30)    NULL,
    [CODIGO_CALLE]                 INT             NULL,
    [NUMERO]                       INT             NULL,
    [LUGAR]                        VARCHAR (30)    NULL,
    [CANTIDAD_DE_PARES]            INT             NULL,
    [CANTIDAD_DE_PARES_UTILIZADOS] INT             NULL,
    [LUGAR_INGRESO]                VARCHAR (30)    NULL,
    [ARMARIO_ID]                   INT             NULL,
    [PORC_INTERNET]                TINYINT         NULL,
    [PORC_TELEFONIA]               TINYINT         NULL,
    [capacitancia]                 INT             NULL,
    [wifi]                         TINYINT         NULL,
    [x]                            DECIMAL (18, 7) NULL,
    [y]                            DECIMAL (18, 7) NULL,
    [Permiso_rehusado]             INT             NULL,
    [Comentario_permiso]           VARCHAR (250)   NULL,
    [En_reparacion]                INT             NULL,
    [Reserva_tecnica]              INT             NULL,
    [nombre_calle]                 VARCHAR (80)    NULL,
    [FTTP]                         TINYINT         NULL,
    [caja_instalada]               TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([CAJAS_ID] ASC),
    UNIQUE NONCLUSTERED ([ARMARIO_ID] ASC, [CAJAS_ID] ASC),
    UNIQUE NONCLUSTERED ([CAJAS_ID] ASC, [ARMARIO_ID] ASC),
    CONSTRAINT [CAJ_CAJAS_X_NUMERO] UNIQUE NONCLUSTERED ([NUMERO_DE_CAJA] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CAJ_CAJAS_X_ARMARIOS_ID]
    ON [dbo].[cajas]([ARMARIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CAJ_CAJAS_X_CODIGO_DE_CALLE]
    ON [dbo].[cajas]([CODIGO_CALLE] ASC);


GO

