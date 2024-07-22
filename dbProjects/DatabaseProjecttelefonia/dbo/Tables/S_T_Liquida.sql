CREATE TABLE [dbo].[S_T_Liquida] (
    [ANO]                  VARCHAR (4)     NOT NULL,
    [MES]                  VARCHAR (2)     NOT NULL,
    [PERI]                 TINYINT         NOT NULL,
    [LEGAJO]               INT             NOT NULL,
    [CONCEPTO]             INT             NOT NULL,
    [QUEES]                VARCHAR (1)     NULL,
    [DESCRIPCION]          VARCHAR (50)    NULL,
    [CANTIDAD]             DECIMAL (5, 2)  NULL,
    [IMPORTE]              DECIMAL (11, 2) NULL,
    [POR_UNICA_VEZ]        TINYINT         NULL,
    [C_E]                  VARCHAR (1)     NULL,
    [CODIGO_CUOTA_A_PAGAR] INT             NULL,
    PRIMARY KEY CLUSTERED ([ANO] ASC, [MES] ASC, [PERI] ASC, [LEGAJO] ASC, [CONCEPTO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [T_LIQ_T_LIQUIDA_X_ANO_MES_LEGAJO]
    ON [dbo].[S_T_Liquida]([MES] ASC, [ANO] ASC, [PERI] ASC, [LEGAJO] ASC);


GO

CREATE NONCLUSTERED INDEX [T_LIQ_X_CONCEPTO]
    ON [dbo].[S_T_Liquida]([CONCEPTO] ASC);


GO

CREATE NONCLUSTERED INDEX [T_LIQ_X_LEGAJO]
    ON [dbo].[S_T_Liquida]([LEGAJO] ASC);


GO

CREATE NONCLUSTERED INDEX [T_LIQ_X_ANOYMES]
    ON [dbo].[S_T_Liquida]([ANO] ASC, [MES] ASC, [PERI] ASC);


GO

