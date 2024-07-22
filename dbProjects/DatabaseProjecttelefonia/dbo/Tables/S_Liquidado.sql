CREATE TABLE [dbo].[S_Liquidado] (
    [ANO]                     VARCHAR (4)     NOT NULL,
    [MES]                     VARCHAR (2)     NOT NULL,
    [PERI]                    TINYINT         NOT NULL,
    [LEGAJO]                  INT             NOT NULL,
    [CONCEPTO]                INT             NOT NULL,
    [QUEES]                   VARCHAR (1)     NULL,
    [DESCRIPCION]             VARCHAR (50)    NULL,
    [CANTIDAD]                DECIMAL (5, 2)  NULL,
    [IMPORTE]                 DECIMAL (11, 2) NULL,
    [POR_UNICA_VEZ]           TINYINT         NULL,
    [C_E]                     VARCHAR (1)     NULL,
    [CODIGO_CUOTA_A_PAGAR]    INT             NULL,
    [BASE_PROMEDIO_SEMESTRAL] DECIMAL (9, 2)  NULL,
    PRIMARY KEY CLUSTERED ([ANO] ASC, [MES] ASC, [PERI] ASC, [LEGAJO] ASC, [CONCEPTO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [T_LIQ1_POR_ANO_MES_LEGAJO_LIQUIDADO]
    ON [dbo].[S_Liquidado]([ANO] ASC, [MES] ASC, [PERI] ASC, [LEGAJO] ASC);


GO

