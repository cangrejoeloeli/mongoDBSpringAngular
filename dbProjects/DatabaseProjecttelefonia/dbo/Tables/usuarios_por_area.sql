CREATE TABLE [dbo].[usuarios_por_area] (
    [USUARIOS_POR_AREA_ID] INT NOT NULL,
    [USUARIO_ID]           INT NULL,
    [AREA_ID]              INT NULL,
    [PERMISO_VER_AREAS]    INT NULL,
    [ELIMINADO]            INT NULL,
    PRIMARY KEY CLUSTERED ([USUARIOS_POR_AREA_ID] ASC),
    UNIQUE NONCLUSTERED ([USUARIO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [USU_KEY_USUARIO_AREA]
    ON [dbo].[usuarios_por_area]([USUARIO_ID] ASC, [AREA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [USU_KEY_USUARIO_AREA_PENDIENTE]
    ON [dbo].[usuarios_por_area]([USUARIO_ID] ASC, [AREA_ID] ASC, [PERMISO_VER_AREAS] ASC);


GO

CREATE NONCLUSTERED INDEX [USU_KEY_PERMISO_VER_AREA]
    ON [dbo].[usuarios_por_area]([PERMISO_VER_AREAS] ASC);


GO

CREATE NONCLUSTERED INDEX [USU_KEY_AREA_ID]
    ON [dbo].[usuarios_por_area]([AREA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [USU_KEY_USUARIO_PERMISO]
    ON [dbo].[usuarios_por_area]([USUARIO_ID] ASC, [PERMISO_VER_AREAS] ASC);


GO

