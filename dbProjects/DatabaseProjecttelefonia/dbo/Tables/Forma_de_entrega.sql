CREATE TABLE [dbo].[Forma_de_entrega] (
    [FORMA_DE_ENTREGA_ID] INT            NOT NULL,
    [TIPO]                VARCHAR (20)   NULL,
    [FORMA]               VARCHAR (20)   NULL,
    [CUOTAS]              TINYINT        NULL,
    [IMPORTE]             DECIMAL (7, 2) NULL,
    [ITEM_FACTURACION_ID] INT            NULL,
    [Servicio]            VARCHAR (10)   NULL,
    PRIMARY KEY CLUSTERED ([FORMA_DE_ENTREGA_ID] ASC)
);


GO

