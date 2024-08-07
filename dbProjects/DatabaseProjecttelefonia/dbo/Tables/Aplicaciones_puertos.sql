CREATE TABLE [dbo].[Aplicaciones_puertos] (
    [APLICACION_ID]     INT          NOT NULL,
    [NOMBRE_APLICACION] VARCHAR (99) NULL,
    PRIMARY KEY CLUSTERED ([APLICACION_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [APL_KEY_NOMBRE_APLICACION]
    ON [dbo].[Aplicaciones_puertos]([NOMBRE_APLICACION] ASC);


GO

CREATE NONCLUSTERED INDEX [APL_KEY_APLICACION_ID_Y_NOMBRE]
    ON [dbo].[Aplicaciones_puertos]([APLICACION_ID] ASC, [NOMBRE_APLICACION] ASC);


GO
