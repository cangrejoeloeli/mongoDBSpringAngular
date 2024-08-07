CREATE TABLE [dbo].[cpp_lama] (
    [CPP_ID]                 INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA_CPP]              DATETIME        NULL,
    [HORA]                   VARCHAR (5)     NULL,
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
    PRIMARY KEY CLUSTERED ([CPP_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CPP111_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[cpp_lama]([CLIENTE_SERVICIO_ID] ASC, [FECHA_CPP] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP111_CPP_X_CLIENTE_SERVICIO_Y_PRESTATARIA]
    ON [dbo].[cpp_lama]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP111_X_NUMERO]
    ON [dbo].[cpp_lama]([NUMERO_ORIGEN] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP111_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpp_lama]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP111_CPP_PARA_BROWSE]
    ON [dbo].[cpp_lama]([NUMERO_ORIGEN] ASC, [FECHA_CPP] ASC, [HORA] ASC, [CPP_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP111_X_TODO]
    ON [dbo].[cpp_lama]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);


GO
