CREATE TABLE [dbo].[reconexiones_con_deudas] (
    [ID]                    INT           NOT NULL,
    [CLIENTE_ID]            INT           NULL,
    [CLIENTE_SERVICIO_ID]   INT           NULL,
    [SERVICIO]              VARCHAR (49)  NULL,
    [USUARIO]               VARCHAR (79)  NULL,
    [OPERADOR]              VARCHAR (59)  NULL,
    [FECHA_DE_MODIFICACION] INT           NULL,
    [COMENTARIO]            VARCHAR (200) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

