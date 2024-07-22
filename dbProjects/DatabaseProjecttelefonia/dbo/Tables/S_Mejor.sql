CREATE TABLE [dbo].[S_Mejor] (
    [LEGAJO]        INT            NOT NULL,
    [REMU_ANTERIOR] DECIMAL (9, 2) NULL,
    [REMU]          DECIMAL (9, 2) NULL,
    [MES]           INT            NULL,
    [CUENTA]        INT            NULL,
    PRIMARY KEY CLUSTERED ([LEGAJO] ASC)
);


GO

