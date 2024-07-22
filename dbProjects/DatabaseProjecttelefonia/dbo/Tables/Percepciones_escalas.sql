CREATE TABLE [dbo].[Percepciones_escalas] (
    [PERCEPCIONES_ESCALAS_ID] INT            NOT NULL,
    [PERCEPCION_ID]           INT            NULL,
    [POR_IMPORTE]             TINYINT        NULL,
    [POR_PORCENTAJE]          TINYINT        NULL,
    [DESDE]                   DECIMAL (9, 2) NULL,
    [HASTA]                   DECIMAL (9, 2) NULL,
    [RETENCION]               DECIMAL (5, 2) NULL,
    [FIJO]                    DECIMAL (9, 2) NULL,
    PRIMARY KEY CLUSTERED ([PERCEPCIONES_ESCALAS_ID] ASC),
    UNIQUE NONCLUSTERED ([PERCEPCION_ID] ASC, [PERCEPCIONES_ESCALAS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [PR2_PERCEPCIONES_ESCALAS_X_PERCEPCION_ID]
    ON [dbo].[Percepciones_escalas]([PERCEPCION_ID] ASC);


GO

