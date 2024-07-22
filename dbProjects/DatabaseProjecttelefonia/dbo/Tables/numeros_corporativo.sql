CREATE TABLE [dbo].[numeros_corporativo] (
    [NUMEROS_CORPORATIVO_ID] INT      NOT NULL,
    [CLIENTE_SERVICIO_ID]    INT      NULL,
    [NUMERO_TELEFONICO]      INT      NULL,
    [fecha_vigencia]         DATETIME NULL,
    [fecha_ingreso]          DATETIME NULL,
    [fecha_baja]             DATETIME NULL,
    [baja]                   TINYINT  NULL,
    CONSTRAINT [PK__numeros_corporat__21F5FC7F] PRIMARY KEY CLUSTERED ([NUMEROS_CORPORATIVO_ID] ASC),
    CONSTRAINT [UQ__numeros_corporat__22EA20B8] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [NUMERO_TELEFONICO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [NUM1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[numeros_corporativo]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [NUM1_X_NUMERO_TELEFONICO]
    ON [dbo].[numeros_corporativo]([NUMERO_TELEFONICO] ASC);


GO

