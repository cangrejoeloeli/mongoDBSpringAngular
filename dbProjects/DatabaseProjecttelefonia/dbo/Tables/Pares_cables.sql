CREATE TABLE [dbo].[Pares_cables] (
    [PAR_ID]                     INT           NOT NULL,
    [PAR_CRUZADA_ID]             INT           NULL,
    [CABLES_ID]                  INT           NULL,
    [CABLES_CRUZADA_ID]          INT           NULL,
    [NUMERO_DE_PAR]              INT           NULL,
    [NUMERO_DE_PAR_CRUZADA]      INT           NULL,
    [CAJA_ID]                    INT           NULL,
    [ARMARIO_ID]                 INT           NULL,
    [ESTADO]                     VARCHAR (2)   NULL,
    [CLIENTE_ID]                 INT           NULL,
    [TAG]                        TINYINT       NULL,
    [TAG_1]                      TINYINT       NULL,
    [PRIMARIO_SECUNDARIO]        VARCHAR (1)   NULL,
    [falla1]                     VARCHAR (50)  NULL,
    [calle_numero]               VARCHAR (50)  NULL,
    [fecha_vencimiento]          DATETIME      NULL,
    [observaciones]              VARCHAR (100) NULL,
    [numerador_hijos]            TINYINT       NULL,
    [cliente_servicio_internet]  INT           NULL,
    [cliente_servicio_telefonia] INT           NULL,
    PRIMARY KEY CLUSTERED ([PAR_ID] ASC),
    UNIQUE NONCLUSTERED ([CAJA_ID] ASC, [PAR_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_DE_PAR] ASC, [CABLES_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_DE_PAR] ASC, [PAR_ID] ASC),
    UNIQUE NONCLUSTERED ([PAR_ID] ASC, [CAJA_ID] ASC),
    UNIQUE NONCLUSTERED ([ARMARIO_ID] ASC, [PAR_ID] ASC, [NUMERO_DE_PAR] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_DE_PAR_CRUZADA] ASC, [CABLES_ID] ASC, [PAR_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_HIJOS_ID]
    ON [dbo].[Pares_cables]([PAR_CRUZADA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_CLIENTE_ID]
    ON [dbo].[Pares_cables]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_TAG_1]
    ON [dbo].[Pares_cables]([TAG_1] ASC);


GO

CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_CABLES_ID]
    ON [dbo].[Pares_cables]([CABLES_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_TAG]
    ON [dbo].[Pares_cables]([TAG] ASC);


GO

CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_CAJA_ID]
    ON [dbo].[Pares_cables]([CAJA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_CABLE_ID_Y_NUMERO_PAR]
    ON [dbo].[Pares_cables]([CABLES_ID] ASC, [NUMERO_DE_PAR] ASC, [ESTADO] ASC);


GO

