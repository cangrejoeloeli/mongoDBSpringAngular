CREATE TABLE [dbo].[Marca_Telefonos] (
    [MARCA_ID] INT          NOT NULL,
    [MARCA]    VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([MARCA_ID] ASC),
    UNIQUE NONCLUSTERED ([MARCA] ASC)
);


GO

