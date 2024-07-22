CREATE TABLE [dbo].[Tipo_Reclamo] (
    [TIPO_RECLAMO_ID]        INT           NOT NULL,
    [SERVICIO]               VARCHAR (40)  NULL,
    [DESCRIPCION]            VARCHAR (255) NULL,
    [OBSERVACIONES]          VARCHAR (255) NULL,
    [DERIVAR_A]              INT           NULL,
    [VENCE]                  INT           NULL,
    [id_agrupa_tipo_reclamo] INT           NULL,
    [fuera_de_uso]           TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([TIPO_RECLAMO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [TIP_KEY_DERIVAR_A]
    ON [dbo].[Tipo_Reclamo]([DERIVAR_A] ASC);


GO

CREATE NONCLUSTERED INDEX [TIP_KEY_SERVICIO]
    ON [dbo].[Tipo_Reclamo]([SERVICIO] ASC);


GO

