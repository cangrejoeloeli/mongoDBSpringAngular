CREATE TABLE [dbo].[Tipo_de_puertos] (
    [TIPO_PUERTO_ID] INT          NOT NULL,
    [NOMBRE]         VARCHAR (40) NULL,
    PRIMARY KEY CLUSTERED ([TIPO_PUERTO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [TIP1_KEY_TIPO_ID_Y_NOMBRE]
    ON [dbo].[Tipo_de_puertos]([TIPO_PUERTO_ID] ASC, [NOMBRE] ASC);


GO

CREATE NONCLUSTERED INDEX [TIP1_KEY_NOMBRE_PUERTO]
    ON [dbo].[Tipo_de_puertos]([NOMBRE] ASC);


GO

