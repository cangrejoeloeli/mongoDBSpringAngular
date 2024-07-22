CREATE TABLE [dbo].[items_planes_de_pago] (
    [ITEMS_PLANES_DE_PAGO_ID] INT           NOT NULL,
    [PLANES_DE_PAGO_ID]       INT           NULL,
    [DESCRIPCION]             VARCHAR (100) NULL,
    [PORCENTAJE_1]            INT           NULL,
    [PORCENTAJE_2]            INT           NULL,
    [CUOTAS_1]                TINYINT       NULL,
    [CUOTAS_2]                TINYINT       NULL,
    [ITEM_FACTURACION_ID]     INT           NULL,
    [DIAS]                    INT           NULL,
    [habilita]                TINYINT       NULL,
    [prejudicial]             TINYINT       NULL,
    [financiera]              TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_PLANES_DE_PAGO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ITE2_X_PLANES_DE_PAGO_ID]
    ON [dbo].[items_planes_de_pago]([PLANES_DE_PAGO_ID] ASC);


GO

