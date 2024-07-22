CREATE TABLE [dbo].[irs_3] (
    [ID_IRS_3]       INT             NOT NULL,
    [PERIODO]        VARCHAR (29)    NULL,
    [PROVINCIA]      VARCHAR (29)    NULL,
    [PARTIDO_DEPTO]  VARCHAR (29)    NULL,
    [LOCALIDAD]      VARCHAR (29)    NULL,
    [VELOCIDAD]      DECIMAL (13, 2) NULL,
    [CUENTAS]        INT             NULL,
    [INGRESOS]       DECIMAL (13, 2) NULL,
    [ANIO]           INT             NULL,
    [id_velocidades] VARCHAR (50)    NULL,
    PRIMARY KEY CLUSTERED ([ID_IRS_3] ASC)
);


GO

CREATE NONCLUSTERED INDEX [IRS1_X_VELOCIDAD]
    ON [dbo].[irs_3]([VELOCIDAD] ASC);


GO

CREATE NONCLUSTERED INDEX [IRS1_X_PERIODO]
    ON [dbo].[irs_3]([PERIODO] ASC);


GO

