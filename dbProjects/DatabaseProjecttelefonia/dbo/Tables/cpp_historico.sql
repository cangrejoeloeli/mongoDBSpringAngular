CREATE TABLE [dbo].[cpp_historico] (
    [CPP_ID]                 INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA_CPP]              DATETIME        NULL,
    [HORA]                   VARCHAR (8)     NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (9, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE]                DECIMAL (11, 3) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [REDUCIDO]               TINYINT         NULL,
    [ID]                     INT             NULL,
    [CLIENTE_SERVICIO_ID]    INT             NULL,
    [PLAN_COMERCIAL_ID]      INT             NULL,
    [CLAVE]                  TINYINT         NULL,
    [TIPO]                   INT             NULL,
    [CODIGO]                 VARCHAR (6)     NULL,
    [PRESTATARIA_CPP]        TINYINT         NULL,
    [NUM_LOTE]               VARCHAR (50)    NULL,
    [CONCILIACION]           TINYINT         NULL,
    [PERIODO_ID]             INT             NULL,
    CONSTRAINT [PK__cpp_historico1__2C5E7C59] PRIMARY KEY CLUSTERED ([CPP_ID] ASC),
    CONSTRAINT [IX_cpp_historico1] UNIQUE NONCLUSTERED ([REDUCIDO] ASC, [NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_CPP] ASC, [SEGUNDOS] ASC, [CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC, [IMPORTE] ASC, [HORA] ASC),
    CONSTRAINT [UQ__cpp_historico1__2D52A092] UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_CPP] ASC, [HORA] ASC, [CPP_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CPP113_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [FECHA_CPP] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP113_X_TODO]
    ON [dbo].[cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP113_CPP_X_CLIENTE_SERVICIO_Y_PRESTATARIA]
    ON [dbo].[cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP113_X_NUMERO]
    ON [dbo].[cpp_historico]([NUMERO_ORIGEN] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP113_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpp_historico]([CLIENTE_SERVICIO_ID] ASC);


GO

