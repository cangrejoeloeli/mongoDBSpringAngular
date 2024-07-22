CREATE TABLE [dbo].[Clientes_servicios_a_facturar] (
    [ID]                  INT          NOT NULL,
    [RUTA]                TINYINT      NULL,
    [CODIGO_CALLE_P]      INT          NULL,
    [ORDEN]               INT          NULL,
    [NUMERO_P]            INT          NULL,
    [LOCALIDAD_ID_P]      INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [PERIODO_ID]          INT          NULL,
    [SERVICIOS]           VARCHAR (19) NULL,
    [FECHA_HABILITACION]  DATETIME     NULL,
    [FECHA_PERIODO_DESDE] DATETIME     NULL,
    [FECHA_PERIODO_HASTA] DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PERIODO_ID] ASC, [SERVICIOS] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CLI2_POR_PERIODO_ID_Y_SERVICIOS]
    ON [dbo].[Clientes_servicios_a_facturar]([PERIODO_ID] ASC, [SERVICIOS] ASC, [ORDEN] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI2_CLIENTES_A_FACTURAR_POR_PERIODO_ID]
    ON [dbo].[Clientes_servicios_a_facturar]([PERIODO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI2_X_CALLE_DES]
    ON [dbo].[Clientes_servicios_a_facturar]([CODIGO_CALLE_P] ASC, [NUMERO_P] DESC);


GO

CREATE NONCLUSTERED INDEX [CLI2_X_CALLE_ASC]
    ON [dbo].[Clientes_servicios_a_facturar]([CODIGO_CALLE_P] ASC, [NUMERO_P] ASC);


GO

