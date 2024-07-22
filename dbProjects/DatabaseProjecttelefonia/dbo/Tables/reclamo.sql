CREATE TABLE [dbo].[reclamo] (
    [RECLAMOS_ID]            INT           NOT NULL,
    [MEDIO_ALTA_ID]          INT           NULL,
    [SERVICIO]               VARCHAR (40)  NULL,
    [OPERADOR_ID]            INT           NULL,
    [CLIENTE_ID]             INT           NULL,
    [CLIENTE_SERVICIO_ID]    INT           NULL,
    [FECHA]                  DATETIME      NULL,
    [FECHA_GUARDAR]          DATETIME      NULL,
    [TIPO_RECLAMO_ID]        INT           NULL,
    [DERIVAR_A]              INT           NULL,
    [OBSERVACIONES]          VARCHAR (999) NULL,
    [VENCE]                  DATETIME      NULL,
    [SOLUCION_ID]            INT           NULL,
    [FECHA_SOLUCION]         DATETIME      NULL,
    [PRIORIDAD]              INT           NULL,
    [ELIMINADO]              INT           NULL,
    [ELIMINADO_POR]          INT           NULL,
    [ESTADO]                 INT           NULL,
    [ESTADO_POR]             INT           NULL,
    [ESTADO_DERIVADO]        INT           NULL,
    [ESTADO_DERIVADO_POR]    INT           NULL,
    [AREA_SOLUCIONA]         INT           NULL,
    [OPERADOR_SOLUCIONA]     INT           NULL,
    [OBSERVACION_SOLUCION]   VARCHAR (999) NULL,
    [observacion_operador]   VARCHAR (999) NULL,
    [mes]                    INT           NULL,
    [id_agrupa_tipo_reclamo] INT           NULL,
    [periodo_reclamo]        VARCHAR (50)  NULL,
    [operador_alta]          INT           NULL,
    [wifi]                   TINYINT       NULL,
    [llamada]                TINYINT       CONSTRAINT [DF_reclamo_llamada] DEFAULT ((0)) NULL,
    [comentario]             NCHAR (999)   NULL,
    [fecha_llamada]          DATETIME      NULL,
    [comentarios]            VARCHAR (999) NULL,
    [hora_llamada]           VARCHAR (50)  NULL,
    [id_categoria_cnc]       TINYINT       NULL,
    [user_llamada_id]        INT           NULL,
    [respuesta_id]           TINYINT       CONSTRAINT [DF_reclamo_respuesta_id] DEFAULT ((1)) NULL,
    [impreso]                INT           NULL,
    [cuadrilla_soluciona_id] INT           NULL,
    [visita_tecnica]         TINYINT       NULL,
    [sip]                    TINYINT       NULL,
    [cuadrilla_solucion]     VARCHAR (90)  NULL,
    [problema_cliente]       TINYINT       NULL,
    [nodo]                   VARCHAR (50)  NULL,
    [calle_servicio]         VARCHAR (150) NULL,
    [nro_servicio]           INT           NULL,
    [numero_telefono]        VARCHAR (20)  NULL,
    [sector]                 VARCHAR (3)   NULL,
    [block]                  VARCHAR (3)   NULL,
    [torre]                  VARCHAR (4)   NULL,
    [piso]                   TINYINT       NULL,
    [dto]                    VARCHAR (4)   NULL,
    [casa]                   INT           NULL,
    [barrio]                 VARCHAR (16)  NULL,
    [tipo_rec]               VARCHAR (40)  NULL,
    [cantidad_movimientos]   INT           NULL,
    PRIMARY KEY CLUSTERED ([RECLAMOS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_OPERADOR_RECLAMO]
    ON [dbo].[reclamo]([OPERADOR_ID] ASC, [RECLAMOS_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_OPERADOR_ID]
    ON [dbo].[reclamo]([OPERADOR_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_TIPO_RECLAMO]
    ON [dbo].[reclamo]([TIPO_RECLAMO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEYESTADO_RECLAMO]
    ON [dbo].[reclamo]([ESTADO] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_ESTADO]
    ON [dbo].[reclamo]([ESTADO] ASC, [SERVICIO] ASC, [ESTADO_POR] ASC, [RECLAMOS_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_SERVICIO]
    ON [dbo].[reclamo]([SERVICIO] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_SOLUCION_ID]
    ON [dbo].[reclamo]([SOLUCION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEYPRIORIDAD]
    ON [dbo].[reclamo]([PRIORIDAD] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_SOLUCIONADOS]
    ON [dbo].[reclamo]([ESTADO] ASC, [RECLAMOS_ID] ASC, [FECHA] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_ELIMINADP_POR]
    ON [dbo].[reclamo]([ELIMINADO_POR] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_MEDIO_ALTA_ID]
    ON [dbo].[reclamo]([MEDIO_ALTA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_OPERADOR_SOLUCIONA]
    ON [dbo].[reclamo]([OPERADOR_SOLUCIONA] ASC, [AREA_SOLUCIONA] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_CLIENTE_ID]
    ON [dbo].[reclamo]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_ESTADO_POR]
    ON [dbo].[reclamo]([ESTADO_POR] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_CLIENTE_SERVICIO_ID]
    ON [dbo].[reclamo]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_ADMINISTRAR_RECLAMOS]
    ON [dbo].[reclamo]([RECLAMOS_ID] ASC, [OPERADOR_ID] ASC, [SERVICIO] ASC, [ESTADO] ASC);


GO

CREATE NONCLUSTERED INDEX [REC_KEY_OBSERVACION_SOLUCION]
    ON [dbo].[reclamo]([OBSERVACION_SOLUCION] ASC);


GO

