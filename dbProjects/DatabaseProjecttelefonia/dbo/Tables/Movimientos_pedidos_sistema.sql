CREATE TABLE [dbo].[Movimientos_pedidos_sistema] (
    [ID_TABLA]   INT           NOT NULL,
    [ID_PEDIDO]  INT           NULL,
    [ESTADO_ID]  INT           NULL,
    [ESTADO]     VARCHAR (89)  NULL,
    [COMENTARIO] VARCHAR (449) NULL,
    [FECHA]      DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([ID_TABLA] ASC)
);


GO

