CREATE TABLE [dbo].[S_Datos] (
    [CODIGO]            INT            NOT NULL,
    [DESCRIPCION_BASE]  VARCHAR (50)   NULL,
    [IMPORTE_BASE]      DECIMAL (9, 2) NULL,
    [BASE_POR_CANTIDAD] TINYINT        NULL,
    [CANTIDAD_BASE]     DECIMAL (7, 2) NULL,
    [CTA_CONTABLE]      VARCHAR (19)   NULL,
    [LEGAJO]            VARCHAR (19)   NULL,
    [DIAS_TRABAJADOS]   INT            NULL,
    [SECCION]           INT            NULL,
    [FECHA_INGRESO]     INT            NULL,
    [APELLIDO]          VARCHAR (50)   NULL,
    [DOMICILIO]         VARCHAR (40)   NULL,
    [LOCALIDAD]         VARCHAR (30)   NULL,
    [TELEFONO]          VARCHAR (30)   NULL,
    [FECHA_NACIO]       INT            NULL,
    [ESTADO_CIVIL]      VARCHAR (10)   NULL,
    [MARCA_AFIP]        TINYINT        NULL,
    [CUIL]              VARCHAR (15)   NULL,
    [TIPO]              VARCHAR (6)    NULL,
    [NRO_DOC]           VARCHAR (10)   NULL,
    [MARCA]             TINYINT        NULL,
    [TAREA]             INT            NULL,
    [IMP_GCIAS]         VARCHAR (2)    NULL,
    [CODTAR]            INT            NULL,
    [ESTADO]            VARCHAR (30)   NULL,
    [DESDE_FECHA]       INT            NULL,
    [HASTA_FECHA]       INT            NULL,
    [ANTICIPO]          DECIMAL (7, 2) NULL,
    [LU]                TINYINT        NULL,
    [MA]                TINYINT        NULL,
    [MI]                TINYINT        NULL,
    [JU]                TINYINT        NULL,
    [BANCO_ID]          TINYINT        NULL,
    [VI]                TINYINT        NULL,
    [SA]                TINYINT        NULL,
    [D]                 TINYINT        NULL,
    [PROMEDIO_ANTERIOR] DECIMAL (9, 2) NULL,
    [ULTIMO_PROMEDIO]   DECIMAL (9, 2) NULL,
    [NACIONALIDAD]      VARCHAR (29)   NULL,
    [SEXO]              VARCHAR (19)   NULL,
    [DOBLE_TURNO]       TINYINT        NULL,
    [NRO_TARJETA_SUPER] INT            NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC),
    UNIQUE NONCLUSTERED ([CODTAR] ASC),
    UNIQUE NONCLUSTERED ([LEGAJO] ASC),
    UNIQUE NONCLUSTERED ([APELLIDO] ASC, [CODIGO] ASC),
    UNIQUE NONCLUSTERED ([LEGAJO] ASC, [CODIGO] ASC),
    UNIQUE NONCLUSTERED ([SECCION] ASC, [CODIGO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [DAT_PORESTADO]
    ON [dbo].[S_Datos]([ESTADO] ASC);


GO

CREATE NONCLUSTERED INDEX [DAT_POR_TARJETA_SUPER]
    ON [dbo].[S_Datos]([NRO_TARJETA_SUPER] ASC);


GO

CREATE NONCLUSTERED INDEX [DAT_DATOS_X_SECCION]
    ON [dbo].[S_Datos]([SECCION] ASC);


GO

CREATE NONCLUSTERED INDEX [DAT_TAREAS]
    ON [dbo].[S_Datos]([TAREA] ASC);


GO

