CREATE TABLE [dbo].[clientes_ventas] (
    [CLIENTE_ID] INT            NOT NULL,
    [TIPO_DOC]   VARCHAR (19)   NULL,
    [NRO_DOC]    VARCHAR (19)   NULL,
    [CUIT_1]     VARCHAR (19)   NULL,
    [IB]         DECIMAL (9, 2) NULL,
    [PORCENTAJE] DECIMAL (7, 2) NULL,
    PRIMARY KEY CLUSTERED ([CLIENTE_ID] ASC)
);


GO

