CREATE TABLE [dbo].[solicitud_sistema] (
    [ID_TABLA]             INT           NOT NULL,
    [OPERADOR_ID]          INT           NULL,
    [OPERADOR]             VARCHAR (44)  NULL,
    [PEDIDO]               VARCHAR (999) NULL,
    [AREA]                 VARCHAR (19)  NULL,
    [PRIORIDAD]            TINYINT       NULL,
    [ESTADO]               TINYINT       NULL,
    [ESTADO_DESC]          VARCHAR (89)  NULL,
    [FECHA_INGRESO]        DATETIME      NULL,
    [FECHA_FINALIZADO]     DATETIME      NULL,
    [FECHA_DE_INICIO]      DATETIME      NULL,
    [GERENCIA_ID]          INT           NULL,
    [SECTOR_ID]            INT           NULL,
    [SECTOR]               VARCHAR (44)  NULL,
    [SERVICIO]             VARCHAR (44)  NULL,
    [OPERADOR_SOLUCION]    VARCHAR (44)  NULL,
    [OPERADOR_SOLUCION_ID] INT           NULL,
    [COMENTARIO_SOLUCION]  VARCHAR (454) NULL,
    [FECHA_ESTIMADA]       DATETIME      NULL,
    [FECHA_INICIO_TEST]    DATETIME      NULL,
    [FECHA_FIN_TEST]       DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([ID_TABLA] ASC)
);


GO

