CREATE TABLE [dbo].[Tipo_reclamo_items] (
    [TIPO_RECLAMO_ID] INT           NOT NULL,
    [DESCRIPCION]     VARCHAR (254) NULL,
    [SERVICIO]        VARCHAR (9)   NULL,
    [item_inicio]     INT           NULL,
    PRIMARY KEY CLUSTERED ([TIPO_RECLAMO_ID] ASC)
);


GO

