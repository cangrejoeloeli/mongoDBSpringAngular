CREATE TABLE [dbo].[toma_estados] (
    [Codigo]                 TINYINT        NOT NULL,
    [CANTIDAD]               DECIMAL (9)    NULL,
    [VAN]                    DECIMAL (9)    NULL,
    [FLAG_ARMANDO]           TINYINT        NULL,
    [FLAG_ARMANDO_AGUA]      TINYINT        NULL,
    [FLAG_TOMANDO]           TINYINT        NULL,
    [FLAG_TOMANDO_AGUA]      TINYINT        NULL,
    [FLAG_FACTURANDO]        TINYINT        NULL,
    [FLAG_1]                 VARCHAR (1)    NULL,
    [FLAG_SEPUEDETOMAR]      TINYINT        NULL,
    [FLAG_SEPUEDETOMAR_AGUA] TINYINT        NULL,
    [FLAG]                   VARCHAR (1)    NULL,
    [Nombre]                 VARCHAR (40)   NOT NULL,
    [ZONA]                   DECIMAL (5)    NULL,
    [FLAG_PRE]               TINYINT        NULL,
    [FLAG_PRE_AGUA]          TINYINT        NULL,
    [GAS]                    INT            NULL,
    [AGUA]                   INT            NULL,
    [M_AGUA]                 TINYINT        NULL,
    [M_GAS]                  TINYINT        NULL,
    [F_GAS]                  TINYINT        NULL,
    [F_AGUA]                 TINYINT        NULL,
    [F_AGRUPA]               TINYINT        NULL,
    [A_MEDIR_GAS_M]          INT            NULL,
    [A_MEDIR_GAS_B]          INT            NULL,
    [A_MEDIR_AGUA_M]         INT            NULL,
    [A_MEDIR_AGUA_B]         INT            NULL,
    [QUIEN_TOMA]             VARCHAR (40)   NULL,
    [AGRUPA]                 INT            NULL,
    [PARA_GRAFICO]           TINYINT        NULL,
    [TOTAL_GAS_M]            INT            NULL,
    [TOTAL_GAS_B]            INT            NULL,
    [TOTAL_AGUA_M_F]         INT            NULL,
    [TOTAL_AGUA_M_I]         INT            NULL,
    [CARGA_BASICA_M_F]       DECIMAL (9, 2) NULL,
    [CARGA_BASICA_M_I]       DECIMAL (9, 2) NULL,
    [DESCUENTO_M_F]          DECIMAL (9, 2) NULL,
    [DESCUENTO_M_I]          DECIMAL (9, 2) NULL,
    [MORATORIAS_M_F]         DECIMAL (9, 2) NULL,
    [MORATORIAS_M_I]         DECIMAL (9, 2) NULL,
    [GALPONES_M_F]           INT            NULL,
    [GALPONES_M_I]           INT            NULL,
    [LOTES_M_I]              INT            NULL,
    [LOTES_M_F]              INT            NULL,
    [P_H_SIN_M_I]            INT            NULL,
    [P_H_SIN_M_F]            INT            NULL,
    [P_H_CON_M_I]            INT            NULL,
    [P_H_CON_M_F]            INT            NULL,
    [TOTAL_AGUA_B_I]         INT            NULL,
    [TOTAL_AGUA_B_A_MEDIR]   INT            NULL,
    [TOTAL_AGUA_M_A_MEDIR]   INT            NULL,
    [TOTAL_AGUA_B_F]         INT            NULL,
    [CARGA_BASICA_B_I]       DECIMAL (9, 2) NULL,
    [CARGA_BASICA_B_F]       DECIMAL (9, 2) NULL,
    [DESCUENTO_B_I]          DECIMAL (9, 2) NULL,
    [DESCUENTO_B_F]          DECIMAL (9, 2) NULL,
    [MORATORIAS_B_I]         DECIMAL (9, 2) NULL,
    [MORATORIAS_B_F]         DECIMAL (9, 2) NULL,
    [GALPONES_B_I]           INT            NULL,
    [GALPONES_B_F]           INT            NULL,
    [LOTES_B_I]              INT            NULL,
    [LOTES_B_F]              INT            NULL,
    [P_H_SIN_B_I]            INT            NULL,
    [P_H_SIN_B_F]            INT            NULL,
    [P_H_CON_B_I]            INT            NULL,
    [P_H_CON_B_F]            INT            NULL,
    [A_INTIMAR]              INT            NULL,
    [FLAG_CRONOGRAMA]        TINYINT        NULL,
    [FLAG_INTIMAR]           TINYINT        NULL,
    [IMPORTE_A_INTIMAR]      DECIMAL (9, 2) NULL,
    [DIS_GAS]                INT            NULL,
    [DIS_AGUA]               INT            NULL,
    [FALTAN_IMPRIMIR_GAS]    INT            NULL,
    [FALTAN_IMPRIMIR_AGUA]   INT            NULL,
    [FALTAN_INTIMAR_AGUA]    INT            NULL,
    [FALTAN_REINTIMAR_AGUA]  INT            NULL,
    [NO_EMITIDAS]            INT            NULL,
    PRIMARY KEY CLUSTERED ([Codigo] ASC),
    UNIQUE NONCLUSTERED ([AGRUPA] ASC, [Codigo] ASC)
);


GO

CREATE NONCLUSTERED INDEX [TOM_TOMA_ESTADO_FLAG]
    ON [dbo].[toma_estados]([FLAG] ASC);


GO

CREATE NONCLUSTERED INDEX [Toma_estado_nombre]
    ON [dbo].[toma_estados]([Nombre] ASC);


GO

CREATE NONCLUSTERED INDEX [TOM_TOMA_ESTADO_FLAG_1]
    ON [dbo].[toma_estados]([FLAG_1] ASC);


GO

CREATE NONCLUSTERED INDEX [TOM_TOMA_ESTADO_PARA_GRAFICO]
    ON [dbo].[toma_estados]([PARA_GRAFICO] ASC);


GO

