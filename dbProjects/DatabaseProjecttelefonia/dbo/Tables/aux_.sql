CREATE TABLE [dbo].[aux] (
    [C1] VARCHAR (19) NULL,
    [C2] VARCHAR (50) NULL,
    [C3] VARCHAR (50) NULL,
    [C4] VARCHAR (50) NULL
);


GO

CREATE NONCLUSTERED INDEX [AUX_POR_A]
    ON [dbo].[aux]([C1] ASC);


GO

