CREATE TABLE [dbo].[Puertos] (
    [PUERTOS_ID]           INT           NOT NULL,
    [PLACA_ID]             INT           NULL,
    [NUMERO_DE_PUERTO]     INT           NULL,
    [IP_FIJA]              TINYINT       NULL,
    [OCUPADO]              TINYINT       NULL,
    [EQUIPOS_DE_ACCESO_ID] INT           NULL,
    [PAR_ID]               INT           NULL,
    [falla]                VARCHAR (50)  NULL,
    [calle_numero]         VARCHAR (50)  NULL,
    [observaciones]        VARCHAR (100) NULL,
    [fecha_vencimiento]    DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([PUERTOS_ID] ASC),
    UNIQUE NONCLUSTERED ([PLACA_ID] ASC, [PUERTOS_ID] ASC, [NUMERO_DE_PUERTO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [PUE_PUERTOS_X_PAR_ID]
    ON [dbo].[Puertos]([PAR_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [PUE_PUERTOS_X_PLACA_ID_X_PUERTO]
    ON [dbo].[Puertos]([PLACA_ID] ASC, [NUMERO_DE_PUERTO] ASC);


GO

CREATE NONCLUSTERED INDEX [PUE_PUERTOS_X_EQUIPOS_DE_ACCESO]
    ON [dbo].[Puertos]([EQUIPOS_DE_ACCESO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [PUE_PUERTOS_X_PLACA_ID]
    ON [dbo].[Puertos]([PLACA_ID] ASC);


GO

