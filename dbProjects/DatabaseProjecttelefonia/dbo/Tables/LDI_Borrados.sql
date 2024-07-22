CREATE TABLE [dbo].[LDI_Borrados] (
    [LAMA_ID]                INT              NOT NULL,
    [NUMERO_ORIGEN]          INT              NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_LAMA]             DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [MINUTOS_A_DESCONTAR]    INT              NULL,
    [IMPORTE]                DECIMAL (11, 10) NULL,
    [DESTINO]                VARCHAR (40)     NULL,
    [REDUCIDO]               TINYINT          NULL,
    [ID]                     INT              NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    [PLAN_COMERCIAL_ID]      INT              NULL,
    [CLAVE]                  TINYINT          NULL,
    [TIPO]                   INT              NULL,
    [CODIGO]                 VARCHAR (6)      NULL,
    [OPERADOR]               VARCHAR (49)     NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LAM5_X_NUMERO]
    ON [dbo].[LDI_Borrados]([NUMERO_ORIGEN] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM5_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[LDI_Borrados]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM5_X_TODO]
    ON [dbo].[LDI_Borrados]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM5_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[LDI_Borrados]([CLIENTE_SERVICIO_ID] ASC, [FECHA_LAMA] ASC);


GO

CREATE NONCLUSTERED INDEX [LAM5_PARA_CLAVE_UNICA]
    ON [dbo].[LDI_Borrados]([NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [SEGUNDOS] ASC, [IMPORTE] ASC, [CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [CLAVE] ASC, [TIPO] ASC);


GO

