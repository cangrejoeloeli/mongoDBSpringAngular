CREATE TABLE [dbo].[trs2] (
    [TRS2_ID]       INT          NOT NULL,
    [PERIODO]       VARCHAR (39) NULL,
    [PROVINCIA]     VARCHAR (39) NULL,
    [PARTIDO_DEPTO] VARCHAR (39) NULL,
    [LOCALIDAD]     VARCHAR (39) NULL,
    [AREA_LOCAL]    VARCHAR (39) NULL,
    [HOGARES]       INT          NULL,
    [COMERCIAL]     INT          NULL,
    [GOBIERNO]      INT          NULL,
    [OTROS]         INT          NULL,
    [ANIO]          INT          NULL,
    PRIMARY KEY CLUSTERED ([TRS2_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [TRS_X_PERIODO]
    ON [dbo].[trs2]([PERIODO] ASC);


GO

CREATE NONCLUSTERED INDEX [TRS_X_ANIO]
    ON [dbo].[trs2]([ANIO] ASC);


GO

