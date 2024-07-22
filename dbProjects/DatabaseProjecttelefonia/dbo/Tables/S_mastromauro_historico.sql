CREATE TABLE [dbo].[S_mastromauro_historico] (
    [ID]                  INT            NOT NULL,
    [LEGAJO_ID]           INT            NULL,
    [FECHA_S]             DATETIME       NULL,
    [TOTAL]               DECIMAL (9, 2) NULL,
    [NETO_21]             DECIMAL (9, 2) NULL,
    [IVA_21]              DECIMAL (9, 2) NULL,
    [NETO_105]            DECIMAL (9, 2) NULL,
    [IVA_105]             DECIMAL (9, 2) NULL,
    [PERIODO_LIQUIDACION] VARCHAR (10)   NULL,
    [NRO_TARJETA]         INT            NULL,
    [IMP_A_DESCONTAR]     DECIMAL (9, 2) NULL,
    [NOMBRE]              VARCHAR (49)   NULL,
    [PERIODO]             VARCHAR (8)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([LEGAJO_ID] ASC, [ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [MAS1_POR_LEGAJO]
    ON [dbo].[S_mastromauro_historico]([LEGAJO_ID] ASC);


GO

