CREATE TABLE [dbo].[fecha_suspencion] (
    [FECHA_SUSPENCION_ID] INT          NOT NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [PERIODO_ID]          INT          NULL,
    [FECHA]               DATETIME     NULL,
    [H_S]                 TINYINT      NULL,
    [NUM_FACTURA]         VARCHAR (29) NULL,
    [tipo]                VARCHAR (1)  NULL,
    [fecha_pago]          DATETIME     NULL,
    [que_es]              VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([FECHA_SUSPENCION_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [FEC_X_FECHA_H_S]
    ON [dbo].[fecha_suspencion]([FECHA] ASC, [H_S] ASC);


GO

CREATE NONCLUSTERED INDEX [FEC_X_H_S]
    ON [dbo].[fecha_suspencion]([H_S] ASC);


GO

CREATE NONCLUSTERED INDEX [FEC_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[fecha_suspencion]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [Por_Cliente_servicio_y_h_s]
    ON [dbo].[fecha_suspencion]([CLIENTE_SERVICIO_ID] ASC, [H_S] ASC);


GO

CREATE NONCLUSTERED INDEX [FEC_X_FECHA]
    ON [dbo].[fecha_suspencion]([FECHA] ASC);


GO

CREATE NONCLUSTERED INDEX [FEC_X_NUM_FACTURA]
    ON [dbo].[fecha_suspencion]([NUM_FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [x_cliente_servicio_x_h_s_y_periodo_id]
    ON [dbo].[fecha_suspencion]([CLIENTE_SERVICIO_ID] ASC, [H_S] ASC, [PERIODO_ID] ASC);


GO

