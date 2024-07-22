CREATE TABLE [dbo].[S_antiguedad] (
    [CODIGO] INT NOT NULL,
    [LEGAJO] INT NULL,
    [INICIO] INT NULL,
    [FINAL]  INT NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC),
    UNIQUE NONCLUSTERED ([LEGAJO] ASC, [INICIO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ANT_ANTIGUEDAD_X_LEGAJO]
    ON [dbo].[S_antiguedad]([LEGAJO] ASC);


GO

