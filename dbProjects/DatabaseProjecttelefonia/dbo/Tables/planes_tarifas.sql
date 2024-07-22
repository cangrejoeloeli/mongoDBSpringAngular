CREATE TABLE [dbo].[planes_tarifas] (
    [PLANES_TARIFAS_ID] INT          NOT NULL,
    [PLAN_COMERCIAL_ID] INT          NULL,
    [DESCRIPCION]       VARCHAR (19) NULL,
    [DESDE]             INT          NULL,
    [HASTA]             INT          NULL,
    [PORCENTAJE]        INT          NULL,
    [reducido]          TINYINT      NULL,
    [tipo]              TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([PLANES_TARIFAS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [x_plan_comercial_id_y_tipo]
    ON [dbo].[planes_tarifas]([PLAN_COMERCIAL_ID] ASC, [tipo] ASC);


GO

CREATE NONCLUSTERED INDEX [PLA3_X_PLAN_COMERCIAL_ID]
    ON [dbo].[planes_tarifas]([PLAN_COMERCIAL_ID] ASC);


GO

