CREATE TABLE [dbo].[parametros_agua] (
    [CODIGO]                INT         NOT NULL,
    [NUMERO_USUARIO]        DECIMAL (9) NULL,
    [PERIODO]               VARCHAR (6) NULL,
    [PERIODO_2]             VARCHAR (6) NULL,
    [PERIODO_3]             VARCHAR (6) NULL,
    [FECHA_FACTURA]         INT         NULL,
    [T_ANTERIOR]            INT         NULL,
    [T_ANTERIOR_M]          INT         NULL,
    [T_ACTUAL]              INT         NULL,
    [T_ACTUAL_M]            INT         NULL,
    [FECHA_MENSUAL]         INT         NULL,
    [VENCE1]                INT         NULL,
    [VENCE1_M]              INT         NULL,
    [VENCE2]                INT         NULL,
    [VENCE2_M]              INT         NULL,
    [VENCE3]                INT         NULL,
    [VENCE3_M]              INT         NULL,
    [VENCE4_M]              INT         NULL,
    [NRO_FACTURA]           DECIMAL (9) NULL,
    [NRO_FACTURA_MUNI]      DECIMAL (9) NULL,
    [NRO_FACTURA_MORATORIA] DECIMAL (9) NULL,
    [NUMERO_INTIMACION]     INT         NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC),
    UNIQUE NONCLUSTERED ([PERIODO] ASC)
);


GO

