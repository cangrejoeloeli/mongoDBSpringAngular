CREATE TABLE [dbo].[fecha_suspension_habilitacion] (
    [FECHA_SUSPENSION_HABILITACION_ID] INT          NOT NULL,
    [CLIENTE_SERVICIO_ID]              INT          NULL,
    [PERIODO_ID]                       INT          NULL,
    [FECHA_HABILITACION1]              DATETIME     NULL,
    [FECHA_SUSPENSION1]                DATETIME     NULL,
    [FECHA_HABILITACION2]              DATETIME     NULL,
    [FECHA_SUSPENSION2]                DATETIME     NULL,
    [NUM_FACTURA]                      VARCHAR (29) NULL,
    PRIMARY KEY CLUSTERED ([FECHA_SUSPENSION_HABILITACION_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [FEC1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[fecha_suspension_habilitacion]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [FEC1_X_NUM_FACTURA]
    ON [dbo].[fecha_suspension_habilitacion]([NUM_FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [FEC1_X_CLIENTE_SERVICIO_Y_PERIODO_ID]
    ON [dbo].[fecha_suspension_habilitacion]([CLIENTE_SERVICIO_ID] ASC, [PERIODO_ID] ASC);


GO

