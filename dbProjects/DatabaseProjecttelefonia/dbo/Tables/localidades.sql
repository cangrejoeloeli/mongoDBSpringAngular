CREATE TABLE [dbo].[localidades] (
    [LOCALIDAD_ID]  INT          NOT NULL,
    [LOCALIDAD]     VARCHAR (40) NULL,
    [PROVINCIA_ID]  INT          NULL,
    [CODIGO_POSTAL] VARCHAR (10) NULL,
    PRIMARY KEY CLUSTERED ([LOCALIDAD_ID] ASC),
    UNIQUE NONCLUSTERED ([LOCALIDAD] ASC, [PROVINCIA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LOC_X_LOCALIDAD_SOLA]
    ON [dbo].[localidades]([LOCALIDAD] ASC);


GO

CREATE NONCLUSTERED INDEX [LOC_X_PROVINCIA_ID]
    ON [dbo].[localidades]([PROVINCIA_ID] ASC);


GO
