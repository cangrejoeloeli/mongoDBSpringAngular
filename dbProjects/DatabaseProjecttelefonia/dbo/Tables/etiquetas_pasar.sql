CREATE TABLE [dbo].[etiquetas_pasar] (
    [ID]        INT          NOT NULL,
    [APELLIDO]  VARCHAR (40) NULL,
    [NOMBRE]    VARCHAR (40) NULL,
    [DNI]       VARCHAR (14) NULL,
    [DOMICILIO] VARCHAR (50) NULL,
    [EMAIL]     VARCHAR (60) NULL,
    [CELULAR]   VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

