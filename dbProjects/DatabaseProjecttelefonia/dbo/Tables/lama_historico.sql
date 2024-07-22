CREATE TABLE [dbo].[lama_historico] (
    [LAMA_ID]                INT              NOT NULL,
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
    [tasacion]               DECIMAL (18, 10) NULL,
    [seg]                    INT              NULL,
    [conciliacion]           TINYINT          NULL,
    [periodo_id]             INT              NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LAM1_X_NUMERO]
    ON [dbo].[lama_historico]([NUMERO_ORIGEN] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM1_X_TODO]
    ON [dbo].[lama_historico]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM1_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[lama_historico]([CLIENTE_SERVICIO_ID] ASC, [FECHA_LAMA] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[lama_historico]([CLIENTE_SERVICIO_ID] ASC);


GO

