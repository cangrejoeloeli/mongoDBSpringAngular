CREATE TABLE [dbo].[conciliacion_lama_cpp] (
    [CONCILIACION_ID]     INT          NOT NULL,
    [NUMERO_ORIGEN_LAMA]  INT          NULL,
    [NUMERO_ORIGEN_CPP]   INT          NULL,
    [NUMERO_DESTINO_LAMA] VARCHAR (19) NULL,
    [NUMERO_DESTINO_CPP]  VARCHAR (19) NULL,
    [FECHA_LAMA]          DATETIME     NULL,
    [FECHA_CPP]           DATETIME     NULL,
    [HORA_LAMA]           VARCHAR (5)  NULL,
    [HORA_CPP]            VARCHAR (5)  NULL,
    [SEGUNDOS_LAMA]       INT          NULL,
    [SEGUNDOS_CPP]        INT          NULL,
    [CPP_ID]              INT          NULL,
    [LAMA_ID]             INT          NULL,
    [PRESTATARIA_CPP]     TINYINT      NULL,
    [NUM_LOTE]            VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([CONCILIACION_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CPP1111_X_FECHA_CPP]
    ON [dbo].[conciliacion_lama_cpp]([FECHA_CPP] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP1111_X_NUMERO_ORIGEN_CPP]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_ORIGEN_CPP] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP1111_X_NUMERO_DESTINO_CPP]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_DESTINO_CPP] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP1111_CONCILIACION_PARA_BROWSE]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_ORIGEN_LAMA] ASC, [FECHA_CPP] ASC, [HORA_LAMA] ASC, [CONCILIACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP1111_X_NUMERO_ORIGEN_LAMA]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_ORIGEN_LAMA] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP1111_X_FECHA_LAMA]
    ON [dbo].[conciliacion_lama_cpp]([FECHA_LAMA] ASC);


GO

CREATE NONCLUSTERED INDEX [CPP1111_X_NUMERO_DESTINO_LAMA]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_DESTINO_LAMA] ASC);


GO

