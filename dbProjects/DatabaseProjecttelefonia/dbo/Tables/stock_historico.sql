CREATE TABLE [dbo].[stock_historico] (
    [ID]                  INT             NOT NULL,
    [STOCK_ID]            INT             NULL,
    [FECHA]               DATETIME        NULL,
    [CANTIDAD]            INT             NULL,
    [USUARIO_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [IMPORTE]             DECIMAL (11, 2) NULL,
    [COMENTARIO]          VARCHAR (499)   NULL,
    [articulo_id]         INT             NULL,
    [proveedor_id]        INT             NULL,
    [cis]                 VARCHAR (15)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [STO1_X_STOCK_ID]
    ON [dbo].[stock_historico]([STOCK_ID] ASC);


GO

