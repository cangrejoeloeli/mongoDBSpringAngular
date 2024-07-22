CREATE TABLE [dbo].[S_Ant_final] (
    [ID_ANT_FINAL]     INT            NOT NULL,
    [ANO]              VARCHAR (4)    NULL,
    [MES]              VARCHAR (2)    NULL,
    [COD_EMPLEADO]     INT            NULL,
    [IMPORTE_ANTICIPO] DECIMAL (7, 2) NULL,
    PRIMARY KEY CLUSTERED ([ID_ANT_FINAL] ASC),
    UNIQUE NONCLUSTERED ([MES] ASC, [ANO] ASC, [COD_EMPLEADO] ASC)
);


GO

