CREATE TABLE [dbo].[clientes_historico_movimientos] (
    [ID_MOV]              INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [SERVICIO]            VARCHAR (98)  NULL,
    [FECHA_MOVIMIENTO_S]  DATETIME      NULL,
    [DESCRIPCION]         VARCHAR (89)  NULL,
    [nombre]              VARCHAR (150) NULL,
    [calle]               VARCHAR (150) NULL,
    [numero_calle]        INT           NULL,
    PRIMARY KEY CLUSTERED ([ID_MOV] ASC)
);


GO

