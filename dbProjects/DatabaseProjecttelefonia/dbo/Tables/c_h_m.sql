CREATE TABLE [dbo].[c_h_m] (
    [ID]                  INT          NOT NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [SERVICIO]            VARCHAR (98) NULL,
    [WIFI]                TINYINT      NULL,
    [SIP]                 TINYINT      NULL,
    [FECHA_HABILITACION]  INT          NULL,
    [FECHA_BAJA]          INT          NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [C_H_X_CLIENTE_SERVICIO]
    ON [dbo].[c_h_m]([CLIENTE_SERVICIO_ID] ASC);


GO

