CREATE TABLE [dbo].[calles] (
    [NOMBRE]       VARCHAR (40) NULL,
    [NUMERO]       INT          NULL,
    [cod_calle]    INT          NOT NULL,
    [codigo_calle] INT          NULL,
    PRIMARY KEY CLUSTERED ([cod_calle] ASC),
    UNIQUE NONCLUSTERED ([NOMBRE] ASC),
    UNIQUE NONCLUSTERED ([NUMERO] ASC)
);


GO

