CREATE TABLE [dbo].[cuotas_plan_de_pago] (
    [CUOTAS_PLAN_DE_PAGO_ID] INT            NOT NULL,
    [CUOTA]                  TINYINT        NULL,
    [CLIENTE_SERVICIO_ID]    INT            NULL,
    [DESCRIPCION]            VARCHAR (19)   NULL,
    [PLAN_DE_PAGO]           INT            NULL,
    [IMPORTE]                DECIMAL (7, 4) NULL,
    [PORCENTAJE]             DECIMAL (7, 2) NULL,
    [PAGA]                   TINYINT        NULL,
    [TOTAL_CUOTAS]           TINYINT        NULL,
    [FECHA_PLAN_DE_PAGO]     DATETIME       NULL,
    [SALDO]                  DECIMAL (7, 2) NULL,
    [fecha_inclusion]        DATETIME       NULL,
    PRIMARY KEY CLUSTERED ([CUOTAS_PLAN_DE_PAGO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CUO_X_PLAN_DE_PAGO]
    ON [dbo].[cuotas_plan_de_pago]([PLAN_DE_PAGO] ASC);


GO

CREATE NONCLUSTERED INDEX [CUO_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cuotas_plan_de_pago]([CLIENTE_SERVICIO_ID] ASC);


GO

