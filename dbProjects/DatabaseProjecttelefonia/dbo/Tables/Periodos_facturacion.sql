CREATE TABLE [dbo].[Periodos_facturacion] (
    [PERIODO_ID]                    INT            NOT NULL,
    [SERVICIOS]                     VARCHAR (19)   NULL,
    [A]                             INT            NULL,
    [M]                             TINYINT        NULL,
    [PERIODO]                       VARCHAR (10)   NULL,
    [LEYENDA]                       VARCHAR (2000) NULL,
    [CERRADO]                       TINYINT        NULL,
    [ORDEN_IMPRESION_A]             INT            NULL,
    [ORDEN_IMPRESION_B]             INT            NULL,
    [ORDEN_IMPRESION_S]             INT            NULL,
    [CLIENTES_HASTA]                DATETIME       NULL,
    [PERIODO_DESDE]                 DATETIME       NULL,
    [VENCIMIENTO]                   DATETIME       NULL,
    [PROXIMO_VENCIMIENTO]           DATETIME       NULL,
    [PERIODO_HASTA]                 DATETIME       NULL,
    [Ventas_internet_p_inicio]      INT            NULL,
    [Ventas_internet_p_final]       INT            NULL,
    [CLIENTES_DESDE]                DATETIME       NULL,
    [PERIODO_ADELANTADO_DESDE]      DATETIME       NULL,
    [consumo_desde]                 DATETIME       NULL,
    [consumo_hasta]                 DATETIME       NULL,
    [fecha_debito_auto]             DATETIME       NULL,
    [periodo_facturado]             TINYINT        NULL,
    [clientes_agrupados_facturados] TINYINT        NULL
);


GO

