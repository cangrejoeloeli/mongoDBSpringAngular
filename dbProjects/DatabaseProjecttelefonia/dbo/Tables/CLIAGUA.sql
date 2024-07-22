CREATE TABLE [dbo].[CLIAGUA] (
    [NUMERO]                            DECIMAL (9)     NOT NULL,
    [TE]                                VARCHAR (20)    NULL,
    [CALLE_RECLAMO]                     VARCHAR (40)    NULL,
    [NRO_CASA_RECLAMO]                  INT             NULL,
    [CUENTA]                            INT             NULL,
    [USUARIO]                           VARCHAR (40)    NULL,
    [TIPO_DOC_USUARIO]                  VARCHAR (3)     NULL,
    [NUM_DOC_USUARIO]                   DECIMAL (11)    NULL,
    [TIPO_CONSUMO]                      VARCHAR (3)     NULL,
    [MEDIDOR_1]                         VARCHAR (15)    NULL,
    [FECHA_INSTALACION_MEDIDOR_1]       INT             NULL,
    [ESTADO_ANTERIOR_MEDIDOR_1]         INT             NULL,
    [ESTADO_ACTUAL_MEDIDOR_1]           INT             NULL,
    [MARCA_MEDIDOR_1]                   VARCHAR (15)    NULL,
    [CAPACIDAD_MEDIDOR_1]               INT             NULL,
    [FECHA_TOMA_ESTADO_MEDIDOR_1]       INT             NULL,
    [MEDIDOR_2]                         VARCHAR (15)    NULL,
    [FECHA_INSTALACION_MEDIDOR_2]       INT             NULL,
    [ESTADO_ANTERIOR_MEDIDOR_2]         INT             NULL,
    [ESTADO_ACTUAL_MEDIDOR_2]           INT             NULL,
    [FECHA_TOMA_ESTADO_MEDIDOR_2]       INT             NULL,
    [MARCA_MEDIDOR_2]                   VARCHAR (15)    NULL,
    [CALLE_MEDIDOR_2]                   VARCHAR (40)    NULL,
    [CALLE_MEDIDOR_3]                   VARCHAR (40)    NULL,
    [CALLE_MEDIDOR_4]                   VARCHAR (40)    NULL,
    [CALLE_MEDIDOR_5]                   VARCHAR (40)    NULL,
    [CALLE_MEDIDOR_6]                   VARCHAR (40)    NULL,
    [NUMERO_CASA_MEDIDOR_2]             DECIMAL (7)     NULL,
    [NUMERO_CASA_MEDIDOR_3]             DECIMAL (7)     NULL,
    [NUMERO_CASA_MEDIDOR_4]             DECIMAL (7)     NULL,
    [NUMERO_CASA_MEDIDOR_5]             DECIMAL (7)     NULL,
    [NUMERO_CASA_MEDIDOR_6]             DECIMAL (7)     NULL,
    [CAPACIDAD_MEDIDOR_2]               INT             NULL,
    [MEDIDOR_3]                         VARCHAR (15)    NULL,
    [FECHA_INSTALACION_MEDIDOR_3]       INT             NULL,
    [ESTADO_ANTERIOR_MEDIDOR_3]         INT             NULL,
    [ESTADO_ACTUAL_MEDIDOR_3]           INT             NULL,
    [MARCA_MEDIDOR_3]                   VARCHAR (15)    NULL,
    [CAPACIDAD_MEDIDOR_3]               INT             NULL,
    [TITULAR]                           VARCHAR (40)    NULL,
    [CALLE_INMUEBLE]                    VARCHAR (40)    NULL,
    [NUMERO_INMUEBLE]                   INT             NULL,
    [PISO_INMUEBLE]                     VARCHAR (3)     NULL,
    [VARIOS_INMUEBLE]                   VARCHAR (20)    NULL,
    [CODIGO_CALLE_INMUEBLE]             INT             NULL,
    [CIRC]                              VARCHAR (3)     NULL,
    [SEC]                               VARCHAR (1)     NULL,
    [NRO_FRACCION]                      INT             NULL,
    [LETRA_FRACCION]                    VARCHAR (2)     NULL,
    [NRO_CHACRA]                        INT             NULL,
    [LETRA_CHACRA]                      VARCHAR (2)     NULL,
    [NRO_QUINTA]                        INT             NULL,
    [LETRA_QUINTA]                      VARCHAR (1)     NULL,
    [NRO_MANZANA]                       INT             NULL,
    [LETRA_MANZANA]                     VARCHAR (2)     NULL,
    [NRO_PARCELA]                       INT             NULL,
    [LETRA_PARCELA]                     VARCHAR (3)     NULL,
    [SUBPARCELA]                        VARCHAR (4)     NULL,
    [CALLE_POSTAL]                      VARCHAR (40)    NULL,
    [NUMERO_CASA_POSTAL]                INT             NULL,
    [PISO_POSTAL]                       VARCHAR (3)     NULL,
    [VARIOS_POSTAL]                     VARCHAR (20)    NULL,
    [LOCALIDAD_POSTAL]                  VARCHAR (20)    NULL,
    [CODIGO_POSTAL]                     VARCHAR (15)    NULL,
    [CODIGO_CALLE_POSTAL]               INT             NULL,
    [CALLE_MEDIDOR]                     VARCHAR (40)    NULL,
    [NUMERO_CASA_MEDIDOR]               INT             NULL,
    [CODIGO_CALLE_MEDIDOR]              INT             NULL,
    [CONDICION]                         VARCHAR (10)    NULL,
    [SERVICIO]                          VARCHAR (20)    NULL,
    [TIPO_DE_USUARIO]                   VARCHAR (15)    NULL,
    [CARGA_BASICA]                      DECIMAL (11, 2) NULL,
    [IMPORTE_POR_MEDIDOR]               DECIMAL (11, 2) NULL,
    [CUOTA_DE_MEDIDOR]                  INT             NULL,
    [TIPO]                              VARCHAR (15)    NULL,
    [MONTO_DEVOLUC_IVA]                 DECIMAL (11, 2) NULL,
    [CUOTA_DEVOLUC_IVA]                 INT             NULL,
    [TOTAL_CUOTAS_DEVOLUC_IVA]          INT             NULL,
    [NUMERO_PLAN_MORATORIA]             INT             NULL,
    [NUMERO_PLAN_MORATORIA_MEDIDO]      INT             NULL,
    [CUOTA_PLAN_MORATORIA]              INT             NULL,
    [CUOTA_PLAN_MORATORIA_MEDIDO_1]     INT             NULL,
    [CUOTA_PLAN_MORATORIA_MEDIDO_2]     INT             NULL,
    [TOTAL_CUOTAS_PLAN_MORATORIA]       INT             NULL,
    [TOTAL_CUOTAS_PLAN_MORATORIA_ME]    INT             NULL,
    [IMPORTE_CUOTA_MORATORIA]           DECIMAL (11, 2) NULL,
    [IMPORTE_CUOTA_MORATORIA_M1]        DECIMAL (11, 2) NULL,
    [IMPORTE_CUOTA_MORATORIA_M2]        DECIMAL (11, 2) NULL,
    [DESCUENTO_BUEN_CONTIBUYENTE]       DECIMAL (11, 2) NULL,
    [CONDICION_DEL_CONTRIBUYENTE]       VARCHAR (15)    NULL,
    [DEBITO_ATOMATICO_BANCO]            VARCHAR (15)    NULL,
    [TIPO_DE_DEBITO]                    VARCHAR (15)    NULL,
    [NUMERO_DE_CUENTA_DEBITO]           INT             NULL,
    [METROS_BASE]                       INT             NULL,
    [FACTURAR]                          VARCHAR (2)     NULL,
    [DIF_0]                             DECIMAL (9, 2)  NULL,
    [DIF_1]                             DECIMAL (9, 2)  NULL,
    [DIF_2]                             DECIMAL (9, 2)  NULL,
    [DIF_3]                             DECIMAL (9, 2)  NULL,
    [MONTO_BASE]                        DECIMAL (9, 2)  NULL,
    [EXEDENTE]                          DECIMAL (9, 2)  NULL,
    [M_0]                               DECIMAL (9, 2)  NULL,
    [M_1]                               DECIMAL (9, 2)  NULL,
    [M_2]                               DECIMAL (9, 2)  NULL,
    [M_3]                               DECIMAL (9, 2)  NULL,
    [P_1]                               DECIMAL (5, 2)  NULL,
    [CONSUMO]                           DECIMAL (9)     NULL,
    [ESTADO_VIEJO]                      DECIMAL (9)     NULL,
    [MES0]                              DECIMAL (7)     NULL,
    [MES2]                              DECIMAL (7)     NULL,
    [FECHA_TOMA_ESTADO_ACTUAL]          INT             NULL,
    [FECHA_TOMA_ESTADO_ANT]             INT             NULL,
    [PERIODO]                           VARCHAR (19)    NULL,
    [FECHA_PAGO_ANTERIOR]               INT             NULL,
    [PERIODO_VIEJO]                     VARCHAR (19)    NULL,
    [FEBRERO]                           DECIMAL (9)     NULL,
    [ABRIL]                             DECIMAL (9)     NULL,
    [JUNIO]                             DECIMAL (9)     NULL,
    [JULIO]                             DECIMAL (9)     NULL,
    [SETIEMBRE]                         DECIMAL (9)     NULL,
    [OCTUBRE]                           DECIMAL (9)     NULL,
    [NOVIEMBRE]                         DECIMAL (9)     NULL,
    [MEDIDOR_NUEVO]                     VARCHAR (15)    NULL,
    [CARGA_BASICA_NUEVO]                DECIMAL (11, 2) NULL,
    [METROS_BASE_NUEVO]                 INT             NULL,
    [CONDICION_NUEVO]                   VARCHAR (10)    NULL,
    [TIPO_CONSUMO_NUEVO]                VARCHAR (3)     NULL,
    [DESCUENTO_BUEN_CONTIBUYENTE_NUEVO] DECIMAL (11, 2) NULL,
    [CALLE_POSTAL_NUEVO]                VARCHAR (40)    NULL,
    [FECHA_INSTALACION_MEDIDOR_NUEVO]   INT             NULL,
    [TIPO_NUEVO]                        VARCHAR (15)    NULL,
    [IMPORTE_CUOTA_MORATORIA_NUEVO]     DECIMAL (11, 2) NULL,
    [IMPORTE_CUOTA_MORATORIA_M1_NUEVO]  DECIMAL (11, 2) NULL,
    [FLAG_CONTROL]                      INT             NULL,
    [FLAG_IMPRIME]                      INT             NULL,
    [ORDEN]                             DECIMAL (9)     NULL,
    [CROQUIS]                           VARCHAR (10)    NULL,
    [CROQUIS_POSTAL]                    VARCHAR (10)    NULL,
    [TOMADOR]                           INT             NULL,
    [ESTADO]                            INT             NULL,
    [PH_CON_CONSUMO]                    TINYINT         NULL,
    [PH_PADRE]                          INT             NULL,
    [PH_HIJO]                           INT             NULL,
    [TIPO_PH]                           TINYINT         NULL,
    [QUEHACER]                          VARCHAR (10)    NULL,
    [QUEHACER_NUEVO]                    VARCHAR (10)    NULL,
    [BAJO_COLECTORA]                    TINYINT         NULL,
    [FACTURA_CONSUMO]                   TINYINT         NULL,
    [FACTURADO]                         TINYINT         NULL,
    [A_CONTROLAR]                       TINYINT         NULL,
    [CLASE_1]                           INT             NULL,
    [CLASE_2]                           INT             NULL,
    [SALDO]                             DECIMAL (11, 2) NULL,
    [DEBE]                              VARCHAR (1)     NULL,
    [CANTIDAD_FACTURAS]                 SMALLINT        NULL,
    [AGRUPA]                            INT             NULL,
    [MARCA_INTIMA]                      SMALLINT        NULL,
    [MARCA_TELE]                        TINYINT         NULL,
    [ESTOY_LLAMANDO]                    SMALLINT        NULL,
    [RANGO]                             INT             NULL,
    [YA_FUE_FACTURADO]                  TINYINT         NULL,
    [DTO_POSTAL]                        VARCHAR (3)     NULL,
    [REPARTIDOR]                        INT             NULL,
    [ACUERDO]                           INT             NULL,
    [ENTREGA_ESPECIAL]                  VARCHAR (50)    NULL,
    [SALDO_CONTROL]                     DECIMAL (11, 2) NULL,
    [CANTIDAD_FACTURAS_CONTROL]         INT             NULL,
    [TIENE_GAS]                         TINYINT         NULL,
    [TIPO_VIVIENDA]                     VARCHAR (30)    NULL,
    [DESECHO]                           DECIMAL (9, 2)  NULL,
    [EMITE]                             TINYINT         NULL,
    [INTIMACIONES]                      INT             NULL,
    [REINTIMACIONES]                    INT             NULL,
    [DOMICILIOS]                        INT             NULL,
    [TELECOBRANZAS]                     INT             NULL,
    [PERSONALES]                        INT             NULL,
    [CARTAS_DOCUMENTO]                  INT             NULL,
    [ACTAS_DE_CORTE]                    INT             NULL,
    [FEHACIENTE]                        INT             NULL,
    [CADUCIDADES]                       INT             NULL,
    [TASA_1]                            TINYINT         NULL,
    [TASA_2]                            TINYINT         NULL,
    [PERIODOS_GESTION]                  INT             NULL,
    [IMPORTE_GESTION]                   DECIMAL (11, 2) NULL,
    [MORATORIA_SI_NO]                   TINYINT         NULL,
    [NRO_CUOTA_ACUERDO]                 INT             NULL,
    [DEBITO]                            VARCHAR (1)     NULL,
    [SUCURSAL]                          INT             NULL,
    [NOMSUC]                            VARCHAR (20)    NULL,
    [CBU_1]                             DECIMAL (9)     NULL,
    [CBU_2]                             DECIMAL (15)    NULL,
    [COMO_DEBITO]                       VARCHAR (25)    NULL,
    [DESECHOS]                          DECIMAL (9, 2)  NULL,
    [BONI_B_C]                          DECIMAL (9, 2)  NULL,
    [BONI_B_C_MEDIDOR]                  DECIMAL (9, 2)  NULL,
    [TORRE]                             VARCHAR (15)    NULL,
    [CASA]                              VARCHAR (15)    NULL,
    [ESTADO_ACTUAL]                     DECIMAL (9, 2)  NULL,
    [ESTADO_ANTERIOR]                   DECIMAL (9, 2)  NULL,
    [NOVEDAD_M1]                        INT             NULL,
    [NOVEDAD_M2]                        INT             NULL,
    [NOVEDAD_M3]                        INT             NULL,
    [PRORRATEO]                         VARCHAR (1)     NULL,
    PRIMARY KEY CLUSTERED ([NUMERO] ASC),
    UNIQUE NONCLUSTERED ([CUENTA] ASC),
    UNIQUE NONCLUSTERED ([NUMERO] ASC),
    UNIQUE NONCLUSTERED ([NUMERO] ASC),
    UNIQUE NONCLUSTERED ([NUMERO] ASC),
    UNIQUE NONCLUSTERED ([FLAG_CONTROL] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([MARCA_INTIMA] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([MEDIDOR_1] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([MEDIDOR_2] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([MEDIDOR_3] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([ORDEN] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([PH_HIJO] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([PH_PADRE] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([TITULAR] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([USUARIO] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([CALLE_INMUEBLE] ASC, [NUMERO_INMUEBLE] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([CALLE_MEDIDOR] ASC, [NUMERO_CASA_MEDIDOR] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([CALLE_POSTAL] ASC, [NUMERO_CASA_POSTAL] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([CLASE_1] ASC, [CLASE_2] ASC, [NUMERO] ASC),
    UNIQUE NONCLUSTERED ([CLASE_2] ASC, [CLASE_1] ASC, [NUMERO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_COD_CALLE_POSTAL_DES]
    ON [dbo].[CLIAGUA]([CODIGO_CALLE_POSTAL] ASC, [NUMERO_CASA_POSTAL] DESC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_COD_CALLE_DES]
    ON [dbo].[CLIAGUA]([CODIGO_CALLE_MEDIDOR] ASC, [NUMERO_CASA_MEDIDOR] DESC);


GO

CREATE NONCLUSTERED INDEX [CLI1_XME]
    ON [dbo].[CLIAGUA]([MEDIDOR_1] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_COD_CALLE_ASC]
    ON [dbo].[CLIAGUA]([CODIGO_CALLE_MEDIDOR] ASC, [NUMERO_CASA_MEDIDOR] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_COD_CALLE_POSTAL_ASC]
    ON [dbo].[CLIAGUA]([CODIGO_CALLE_POSTAL] ASC, [NUMERO_CASA_POSTAL] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_TOMADOR]
    ON [dbo].[CLIAGUA]([TOMADOR] ASC, [ORDEN] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_ESTADO]
    ON [dbo].[CLIAGUA]([ESTADO] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_CROQUIS_POSTAL_ASC]
    ON [dbo].[CLIAGUA]([CROQUIS_POSTAL] ASC, [NUMERO_CASA_POSTAL] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_CROQUIS_ASC]
    ON [dbo].[CLIAGUA]([CROQUIS] ASC, [NUMERO_CASA_MEDIDOR] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_CROQUIS_DES]
    ON [dbo].[CLIAGUA]([CROQUIS] ASC, [NUMERO_CASA_MEDIDOR] DESC);


GO

CREATE NONCLUSTERED INDEX [CLI1_CLI_AGUA_X_MARCA_TELE_1]
    ON [dbo].[CLIAGUA]([MARCA_TELE] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_CLI_AGUA_X_RANGO]
    ON [dbo].[CLIAGUA]([RANGO] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_CLI_AGUA_X_FLAG_CONTROL_SOLO]
    ON [dbo].[CLIAGUA]([FLAG_CONTROL] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_CLI_AGUA_X_MARCA_INTIMA]
    ON [dbo].[CLIAGUA]([MARCA_INTIMA] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_CROQUIS_POSTAL_DES]
    ON [dbo].[CLIAGUA]([CROQUIS_POSTAL] ASC, [NUMERO_CASA_POSTAL] DESC);


GO

CREATE NONCLUSTERED INDEX [CLI1_CLI_AGUA_X_SECTOR]
    ON [dbo].[CLIAGUA]([SEC] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_AGUA_X_DEBITO]
    ON [dbo].[CLIAGUA]([DEBITO] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_CLI_AGUA_X_TOMADOR]
    ON [dbo].[CLIAGUA]([TOMADOR] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_X_FLAG_IMPRIME]
    ON [dbo].[CLIAGUA]([FLAG_IMPRIME] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI1_CLI_AGUA_X_DEBE]
    ON [dbo].[CLIAGUA]([DEBE] ASC);


GO

