CREATE TABLE [dbo].[alicuotas_articulos] (
    [ALICUOTAS_ARTICULOS_ID] INT            NOT NULL,
    [ITEM_FACTURACION_ID]    INT            NULL,
    [ITEM_DE_APLICACION_ID]  INT            NULL,
    [ALICUOTA]               DECIMAL (7, 2) NULL,
    [SERVICIO]               VARCHAR (19)   NULL,
    [IVA_ID]                 INT            NULL,
    PRIMARY KEY CLUSTERED ([ALICUOTAS_ARTICULOS_ID] ASC),
    UNIQUE NONCLUSTERED ([ITEM_DE_APLICACION_ID] ASC, [SERVICIO] ASC)
);


GO

