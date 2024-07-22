CREATE TABLE [dbo].[Tarifas_codigo_area_nacional] (
    [TARIFAS_CODIGO_AREA_NACIONAL_ID] INT             NOT NULL,
    [CODIGO_AREA]                     VARCHAR (6)     NULL,
    [PRECIO]                          DECIMAL (13, 4) NULL,
    [PRESTATARIA_ID]                  INT             NULL,
    PRIMARY KEY CLUSTERED ([TARIFAS_CODIGO_AREA_NACIONAL_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_AREA] ASC, [PRESTATARIA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [TAR1_X_CODIGO_AREA]
    ON [dbo].[Tarifas_codigo_area_nacional]([CODIGO_AREA] ASC);


GO

CREATE NONCLUSTERED INDEX [TAR1_X_PRESTATARIA_ID]
    ON [dbo].[Tarifas_codigo_area_nacional]([PRESTATARIA_ID] ASC);


GO

