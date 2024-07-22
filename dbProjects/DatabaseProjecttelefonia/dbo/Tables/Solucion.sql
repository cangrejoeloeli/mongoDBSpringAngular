CREATE TABLE [dbo].[Solucion] (
    [SOLUCION_ID]        INT           NOT NULL,
    [SERVICIO]           VARCHAR (40)  NULL,
    [DESCRIPCION]        VARCHAR (255) NULL,
    [OPERADOR_ID]        INT           NULL,
    [id_agrupa_solucion] INT           NULL,
    [fuera_de_uso]       TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([SOLUCION_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [SOL_KEY_DESCRIPCION]
    ON [dbo].[Solucion]([DESCRIPCION] ASC);


GO

CREATE NONCLUSTERED INDEX [SOL_KEY_SERVICIO]
    ON [dbo].[Solucion]([SERVICIO] ASC);


GO

CREATE NONCLUSTERED INDEX [SOL_KEY_OPERADOR_ID]
    ON [dbo].[Solucion]([OPERADOR_ID] ASC);


GO

