CREATE TABLE [dbo].[S_Imp_para_promedio] (
    [COD_LEGAJO]      INT            NOT NULL,
    [REMU_SIN_EXTRAS] DECIMAL (9, 2) NULL,
    [MES]             INT            NOT NULL,
    PRIMARY KEY CLUSTERED ([COD_LEGAJO] ASC, [MES] ASC)
);


GO

CREATE NONCLUSTERED INDEX [MEJ1_POR_COD_LEGAJO]
    ON [dbo].[S_Imp_para_promedio]([COD_LEGAJO] ASC);


GO

