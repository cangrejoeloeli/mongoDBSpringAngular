CREATE TABLE [dbo].[autorizar_cambio_titularidad] (
    [ID_CAMBIO]           INT NOT NULL,
    [PERMISO_FACTURACION] INT NULL,
    [PERMISO_GERENCIA]    INT NULL,
    PRIMARY KEY CLUSTERED ([ID_CAMBIO] ASC)
);


GO

