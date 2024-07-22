CREATE TABLE [dbo].[ama_historico_no_facturado] (
    [AMA_ID]                 INT              NOT NULL,
    [NUMERO_ORIGEN]          VARCHAR (19)     NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_AMA]              DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [IMPORTE]                DECIMAL (11, 10) NULL,
    [TIPO]                   TINYINT          NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    PRIMARY KEY CLUSTERED ([AMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_AMA] ASC, [HORA] ASC, [AMA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LAM411_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[ama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC, [FECHA_AMA] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM411_PARA_CLAVE_UNICA]
    ON [dbo].[ama_historico_no_facturado]([NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_AMA] ASC, [HORA] ASC, [SEGUNDOS] ASC, [IMPORTE] ASC, [CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM411_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[ama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM411_X_NUMERO]
    ON [dbo].[ama_historico_no_facturado]([NUMERO_ORIGEN] ASC);


GO

