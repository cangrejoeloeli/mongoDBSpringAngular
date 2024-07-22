CREATE TABLE [dbo].[movimientos_reservas] (
    [MOV_ID]       INT           NOT NULL,
    [MOVIMIENTO]   DATETIME      NULL,
    [OPERADOR_ID]  INT           NULL,
    [DESCRIPCION]  VARCHAR (199) NULL,
    [NRO_TELEFONO] INT           NULL,
    PRIMARY KEY CLUSTERED ([MOV_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [MOV_POR_NRO_TELEFONO]
    ON [dbo].[movimientos_reservas]([NRO_TELEFONO] ASC);


GO

CREATE NONCLUSTERED INDEX [MOV_POR_FECHA]
    ON [dbo].[movimientos_reservas]([MOVIMIENTO] ASC);


GO

