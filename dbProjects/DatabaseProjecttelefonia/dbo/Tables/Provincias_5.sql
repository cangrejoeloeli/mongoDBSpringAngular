CREATE TABLE [dbo].[Provincias_5] (
    [PROVINCIA_ID] INT          NOT NULL,
    [PROVINCIA]    VARCHAR (40) NULL,
    PRIMARY KEY CLUSTERED ([PROVINCIA_ID] ASC),
    UNIQUE NONCLUSTERED ([PROVINCIA] ASC)
);


GO
