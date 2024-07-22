CREATE TABLE [dbo].[Pure_06] (
    [PREMIOS_Y_CASTIGOS_ID] INT             NOT NULL,
    [CUENTA]                INT             NULL,
    [QUEES]                 VARCHAR (1)     NULL,
    [CONSUMO_ORIGINAL]      DECIMAL (11, 2) NULL,
    [CONSUMO]               DECIMAL (11, 2) NULL,
    [DIFERENCIA_CONUMO]     DECIMAL (11, 2) NULL,
    [PERIODO]               VARCHAR (11)    NULL,
    [IMPORTE_METROS]        DECIMAL (7, 4)  NULL,
    [IMPORTE_METROS_1]      DECIMAL (7, 4)  NULL,
    [IMPORTE_METROS_2]      DECIMAL (7, 4)  NULL,
    [IMPORTE_METROS_3]      DECIMAL (7, 4)  NULL,
    [IMPORTE]               DECIMAL (7, 2)  NULL,
    [SALDO]                 DECIMAL (7, 2)  NULL,
    [R]                     TINYINT         NULL,
    [TIPO_SUMINISTRO]       VARCHAR (15)    NULL,
    [FACTURA]               VARCHAR (15)    NULL,
    [PRE_FACTURA]           VARCHAR (15)    NULL,
    [FACTURA_QUE_LO_GENERO] VARCHAR (15)    NULL,
    [PERIODO_BASE]          VARCHAR (14)    NULL,
    [TEMPERATURA_BASE]      DECIMAL (7, 1)  NULL,
    [METROS_BASE]           DECIMAL (9, 2)  NULL,
    [PERIODO_ACTUAL]        VARCHAR (14)    NULL,
    [TEMPERATURA_ACTUAL]    DECIMAL (7, 1)  NULL,
    [METROS_ACTUAL]         DECIMAL (9, 2)  NULL,
    [VALOR_AJUSTE]          DECIMAL (9, 2)  NULL,
    [LEYENDA_PREMIO]        VARCHAR (40)    NULL,
    [LEYENDA_CASTIGO]       VARCHAR (40)    NULL,
    [PERIODICIDAD]          VARCHAR (10)    NULL,
    PRIMARY KEY CLUSTERED ([PREMIOS_Y_CASTIGOS_ID] ASC),
    UNIQUE NONCLUSTERED ([CUENTA] ASC, [PREMIOS_Y_CASTIGOS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [PRE1_X_CUENTA_Y_PERIODO]
    ON [dbo].[Pure_06]([CUENTA] ASC, [PERIODO] ASC);


GO

CREATE NONCLUSTERED INDEX [PRE1_PREMIOS_Y_CASTIGOS_X_FACTURA_QUE_LO_GENERO]
    ON [dbo].[Pure_06]([FACTURA_QUE_LO_GENERO] ASC);


GO

CREATE NONCLUSTERED INDEX [PRE1_PREMIOS_CASTIGOS_X_CUENTA]
    ON [dbo].[Pure_06]([CUENTA] ASC);


GO

CREATE NONCLUSTERED INDEX [PRE1_PREMIOS_Y_CASTIGOS_X_FACTURA]
    ON [dbo].[Pure_06]([FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [PRE1_PREMIOS_Y_CASTIGOS_X_PRE_FACTURA]
    ON [dbo].[Pure_06]([PRE_FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [PRE1_PREMIOS_CASTIGOS_X_PERIODO]
    ON [dbo].[Pure_06]([PERIODO] ASC);


GO

