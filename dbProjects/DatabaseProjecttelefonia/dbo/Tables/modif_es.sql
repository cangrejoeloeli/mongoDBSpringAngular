CREATE TABLE [dbo].[modif_es] (
    [MODIF_ID]             INT           NOT NULL,
    [CLIENTE_SERVICIO_ID]  INT           NULL,
    [ESTADO]               INT           NULL,
    [FECHA_MODIF]          DATETIME      NULL,
    [OBSERVACION]          VARCHAR (299) NULL,
    [USUARIO_ID]           INT           NULL,
    [TIPO_MODIFICACION_ID] INT           NULL,
    [usuario]              VARCHAR (50)  NULL,
    PRIMARY KEY CLUSTERED ([MODIF_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [EST2_MODIF_X_TIPO_ID]
    ON [dbo].[modif_es]([TIPO_MODIFICACION_ID] ASC);


GO

