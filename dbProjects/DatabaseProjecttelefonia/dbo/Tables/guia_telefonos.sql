CREATE TABLE [dbo].[guia_telefonos] (
    [guia_telefonos_id] INT           NOT NULL,
    [telefono]          INT           NOT NULL,
    [apellido_nombre]   VARCHAR (255) NOT NULL,
    [direccion]         VARCHAR (255) NULL,
    [compania]          TINYINT       NULL,
    CONSTRAINT [PK_guia_telefonos] PRIMARY KEY CLUSTERED ([guia_telefonos_id] ASC)
);


GO

CREATE NONCLUSTERED INDEX [x_telefono]
    ON [dbo].[guia_telefonos]([telefono] ASC);


GO

CREATE NONCLUSTERED INDEX [x_apellido_nombre]
    ON [dbo].[guia_telefonos]([apellido_nombre] ASC);


GO

CREATE NONCLUSTERED INDEX [x_compania]
    ON [dbo].[guia_telefonos]([compania] ASC);


GO

