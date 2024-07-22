CREATE TABLE [dbo].[lama_historico_no_facturado] (
    [LAMA_ID]                INT              NOT NULL,
    [TASACION]               DECIMAL (19, 10) NULL,
    [NUMERO_ORIGEN]          INT              NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_LAMA]             DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [MINUTOS_A_DESCONTAR]    INT              NULL,
    [IMPORTE]                DECIMAL (11, 2)  NULL,
    [DESTINO]                VARCHAR (40)     NULL,
    [REDUCIDO]               TINYINT          NULL,
    [ID]                     INT              NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    [PLAN_COMERCIAL_ID]      INT              NULL,
    [CLAVE]                  TINYINT          NULL,
    [TIPO]                   INT              NULL,
    [CODIGO]                 VARCHAR (6)      NULL,
    [CONCILIACION]           TINYINT          NULL,
    [PERIODO_ID]             INT              NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LAM11_X_NUMERO_Y_PERIODO]
    ON [dbo].[lama_historico_no_facturado]([NUMERO_ORIGEN] ASC, [PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM11_X_NUMERO]
    ON [dbo].[lama_historico_no_facturado]([NUMERO_ORIGEN] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM11_X_TODO]
    ON [dbo].[lama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM11_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[lama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC, [FECHA_LAMA] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM11_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[lama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC);


GO

