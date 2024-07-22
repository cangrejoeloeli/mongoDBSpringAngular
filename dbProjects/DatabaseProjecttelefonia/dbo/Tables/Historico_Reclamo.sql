CREATE TABLE [dbo].[Historico_Reclamo] (
    [HISTO_RECLAMO_ID]     INT           NOT NULL,
    [USUARIO_HISTORICO]    INT           NULL,
    [FECHA_HISTORICO]      DATETIME      NULL,
    [SERVICIO]             VARCHAR (40)  NULL,
    [MEDIO_ALTA_ID]        INT           NULL,
    [RECLAMOS_ID]          INT           NULL,
    [OPERADOR_ID]          INT           NULL,
    [CLIENTE_ID]           INT           NULL,
    [CLIENTE_SERVICIO_ID]  INT           NULL,
    [FECHA]                DATETIME      NULL,
    [FECHA_GUARDAR]        DATETIME      NULL,
    [TIPO_RECLAMO_ID]      INT           NULL,
    [DERIVAR_A]            INT           NULL,
    [OBSERVACIONES]        VARCHAR (999) NULL,
    [VENCE]                DATETIME      NULL,
    [SOLUCION_ID]          INT           NULL,
    [FECHA_SOLUCION]       DATETIME      NULL,
    [ESTADO]               INT           NULL,
    [ESTADO_POR]           INT           NULL,
    [PRIORIDAD]            INT           NULL,
    [ELIMINADO]            INT           NULL,
    [ELIMINADO_POR]        INT           NULL,
    [ESTADO_DERIVADO]      INT           NULL,
    [ESTADO_DERIVADO_POR]  INT           NULL,
    [AREA_SOLUCIONA]       INT           NULL,
    [OPERADOR_SOLUCIONA]   INT           NULL,
    [OBSERVACION_SOLUCION] VARCHAR (999) NULL,
    [observacion_operador] VARCHAR (999) NULL,
    [modif_tipo_reclamo]   TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([HISTO_RECLAMO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_TIPO_RECLAMO]
    ON [dbo].[Historico_Reclamo]([TIPO_RECLAMO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_HISTO_ESTADO_POR]
    ON [dbo].[Historico_Reclamo]([ESTADO_POR] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEYESTADO_RECLAMO]
    ON [dbo].[Historico_Reclamo]([ESTADO] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_MEDIO_ALTA_ID]
    ON [dbo].[Historico_Reclamo]([MEDIO_ALTA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_SOLUCION_ID]
    ON [dbo].[Historico_Reclamo]([SOLUCION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_OPERADOR_ID]
    ON [dbo].[Historico_Reclamo]([OPERADOR_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_OPERADOR_USUARIO]
    ON [dbo].[Historico_Reclamo]([USUARIO_HISTORICO] ASC, [OPERADOR_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEYPRIORIDAD]
    ON [dbo].[Historico_Reclamo]([PRIORIDAD] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_CLIENTE_ID]
    ON [dbo].[Historico_Reclamo]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_ELIMINADO_POR]
    ON [dbo].[Historico_Reclamo]([ELIMINADO_POR] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_CLIENTE_SERVICIO_ID]
    ON [dbo].[Historico_Reclamo]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_USUARIO_HISTORICO]
    ON [dbo].[Historico_Reclamo]([USUARIO_HISTORICO] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_HISTO_AREA_SOLUCIONA]
    ON [dbo].[Historico_Reclamo]([OPERADOR_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_RECLAMO]
    ON [dbo].[Historico_Reclamo]([RECLAMOS_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HISTO_KEY_HISTO_RECLAMO]
    ON [dbo].[Historico_Reclamo]([RECLAMOS_ID] ASC, [HISTO_RECLAMO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [key_histo_id_y_reclamo_id]
    ON [dbo].[Historico_Reclamo]([HISTO_RECLAMO_ID] ASC, [RECLAMOS_ID] ASC);


GO

