CREATE TABLE [dbo].[inconsistencia_bajas_planes] (
    [INCONSISTENCIA_BAJAS_PLANES_ID] INT          NOT NULL,
    [CLIENTE_ID]                     INT          NULL,
    [CLIENTE_SERVICIO_ID]            INT          NULL,
    [PLAN_INTERNET_ID]               INT          NULL,
    [PLAN_TELEFONIA_ID]              INT          NULL,
    [SERVICIO]                       VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([INCONSISTENCIA_BAJAS_PLANES_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [BAJ_X_PLAN_INTERNET_ID]
    ON [dbo].[inconsistencia_bajas_planes]([PLAN_INTERNET_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [BAJ_X_SERVICIO]
    ON [dbo].[inconsistencia_bajas_planes]([SERVICIO] ASC);


GO

CREATE NONCLUSTERED INDEX [BAJ_X_PLAN_TELEFONIA_ID]
    ON [dbo].[inconsistencia_bajas_planes]([PLAN_TELEFONIA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [BAJ_X_PLAN_TELEFONIA_E_INTERNET_ID]
    ON [dbo].[inconsistencia_bajas_planes]([PLAN_TELEFONIA_ID] ASC, [PLAN_INTERNET_ID] ASC);


GO

