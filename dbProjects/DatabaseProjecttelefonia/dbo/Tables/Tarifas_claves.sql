CREATE TABLE [dbo].[Tarifas_claves] (
    [TARIFAS_CLAVES_ID] INT             NOT NULL,
    [CLAVE]             INT             NULL,
    [PRECIO]            DECIMAL (11, 4) NULL,
    [PRESTATARIA_ID]    INT             NULL,
    PRIMARY KEY CLUSTERED ([TARIFAS_CLAVES_ID] ASC),
    UNIQUE NONCLUSTERED ([CLAVE] ASC)
);


GO

CREATE NONCLUSTERED INDEX [TAR_X_PRESTATARIA]
    ON [dbo].[Tarifas_claves]([PRESTATARIA_ID] ASC);


GO

