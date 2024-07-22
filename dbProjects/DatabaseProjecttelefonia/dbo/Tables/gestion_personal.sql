CREATE TABLE [dbo].[gestion_personal] (
    [ID]                  INT             NOT NULL,
    [CLIENTE_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [TELEFONO]            VARCHAR (29)    NULL,
    [NUMERO_FACTURA]      VARCHAR (19)    NULL,
    [SALDO]               DECIMAL (15, 2) NULL,
    [VENCIMIENTO]         INT             NULL,
    [OPERADOR]            VARCHAR (40)    NULL,
    [FECHA]               DATETIME        NULL,
    [COMENTARIO]          VARCHAR (254)   NULL,
    [ATENDIDO]            TINYINT         NULL,
    [ESTADO]              TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [GES_X_CLIENTE_ID]
    ON [dbo].[gestion_personal]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [GES_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[gestion_personal]([CLIENTE_SERVICIO_ID] ASC);


GO

