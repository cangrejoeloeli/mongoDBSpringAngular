CREATE TABLE [dbo].[Clientes_servicios_Historico] (
    [CLIENTES_SERVICIO_HISTORICO_ID] INT           NOT NULL,
    [CLIENTE_ID]                     INT           NULL,
    [CLIENTE_SERVICIO_ID]            INT           NULL,
    [NUMERADOR_HIJOS]                INT           NULL,
    [CLASIFICACION_DE_CLIENTES_ID]   INT           NULL,
    [TIPO_MODIFICACION]              VARCHAR (40)  NULL,
    [FECHA_MODIFICACION]             DATETIME      NULL,
    [CODIGO_CALLE]                   INT           NULL,
    [NUMERO]                         INT           NULL,
    [SECTOR]                         VARCHAR (2)   NULL,
    [BLOCK]                          VARCHAR (2)   NULL,
    [TORRE]                          VARCHAR (3)   NULL,
    [PISO]                           TINYINT       NULL,
    [DTO]                            VARCHAR (3)   NULL,
    [CASA]                           INT           NULL,
    [BARRIO]                         VARCHAR (15)  NULL,
    [LOCALIDAD_ID]                   INT           NULL,
    [CODIGO_POSTAL]                  VARCHAR (10)  NULL,
    [ENTRE_CODIGO_CALLE_1]           INT           NULL,
    [ENTRE_CODIGO_CALLE_2]           INT           NULL,
    [CODIGO_CALLE_P]                 INT           NULL,
    [CALLE_POSTAL]                   VARCHAR (40)  NULL,
    [NUMERO_P]                       INT           NULL,
    [SECTOR_P]                       VARCHAR (2)   NULL,
    [BLOCK_P]                        VARCHAR (2)   NULL,
    [TORRE_P]                        VARCHAR (3)   NULL,
    [PISO_P]                         TINYINT       NULL,
    [DTO_P]                          VARCHAR (3)   NULL,
    [CASA_P]                         INT           NULL,
    [BARRIO_P]                       VARCHAR (15)  NULL,
    [LOCALIDAD_ID_P]                 INT           NULL,
    [CODIGO_POSTAL_P]                VARCHAR (10)  NULL,
    [SERVICIO]                       VARCHAR (10)  NULL,
    [NUMERO_TELEFONO]                INT           NULL,
    [TIPO_DOC]                       VARCHAR (4)   NULL,
    [CLAVE]                          TINYINT       NULL,
    [NUMERO_DOC]                     VARCHAR (19)  NULL,
    [DIGITO_VERIFICADOR]             TINYINT       NULL,
    [DOCUMENTO]                      VARCHAR (20)  NULL,
    [CLASIFICACION_IVA_ID]           INT           NULL,
    [PIB]                            VARCHAR (2)   NULL,
    [PERCEPCION_ID]                  TINYINT       NULL,
    [FECHA_INSTALACION]              DATETIME      NULL,
    [FECHA_SOLICITUD]                DATETIME      NULL,
    [FECHA_HABILITACION]             DATETIME      NULL,
    [FECHA_BAJA]                     DATETIME      NULL,
    [FECHA_INGRESO_AL_SISTEMA]       DATETIME      NULL,
    [PLAN_COMERCIAL]                 INT           NULL,
    [ESTADO]                         TINYINT       NULL,
    [NUMERO_SOLICITUD]               INT           NULL,
    [VENDEDOR]                       INT           NULL,
    [PERTENECE_A]                    VARCHAR (40)  NULL,
    [CUADRILLA]                      VARCHAR (60)  NULL,
    [OBSERVACIONES]                  VARCHAR (300) NULL,
    [MODEM_ID]                       INT           NULL,
    [PAR_ID]                         INT           NULL,
    [PUERTOS_ID]                     INT           NULL,
    [ORDEN_INSTALACION]              INT           NULL,
    [TIPO_CONEXION]                  VARCHAR (7)   NULL,
    [USER_NAME]                      VARCHAR (20)  NULL,
    [PASSWORD]                       VARCHAR (8)   NULL,
    [IP_1]                           TINYINT       NULL,
    [IP_2]                           TINYINT       NULL,
    [IP_3]                           TINYINT       NULL,
    [IP_4]                           TINYINT       NULL,
    [BAJADA]                         TINYINT       NULL,
    [F_E_ID]                         INT           NULL,
    [CANTIDAD_DE_BOCAS]              TINYINT       NULL,
    [CLASIFICACION_SERVICIO]         INT           NULL,
    [FIGURACION_EN_GUIA]             VARCHAR (3)   NULL,
    [partida]                        INT           NULL,
    [metros_cuadrados_vivienda]      DECIMAL (18)  NULL,
    [nombre_fantasia]                VARCHAR (55)  NULL,
    [fecha_intimacion]               DATETIME      NULL,
    [fecha_telecobranza]             DATETIME      NULL,
    [fecha_suspencion]               DATETIME      NULL,
    [telefono_id]                    INT           NULL,
    [cantidad_de_facturas_adeudadas] INT           NULL,
    [intima]                         TINYINT       NULL,
    [cantidad_de_bocas_adicionales]  TINYINT       NULL,
    [cantidad_de_bocas_existentes]   TINYINT       NULL,
    [Motivo]                         VARCHAR (150) NULL,
    [no_genera_intereses]            TINYINT       NULL,
    [modem2_id]                      INT           NULL,
    [housing]                        TINYINT       NULL,
    [hosting]                        TINYINT       NULL,
    [cliente_anterior]               VARCHAR (90)  NULL,
    [cliente_nuevo]                  VARCHAR (90)  NULL,
    CONSTRAINT [PK__Clientes_servici__457442E6] PRIMARY KEY CLUSTERED ([CLIENTES_SERVICIO_HISTORICO_ID] ASC),
    CONSTRAINT [UQ__Clientes_servici__4668671F] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [CLIENTES_SERVICIO_HISTORICO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CLI13_CLIENTES_S_H_X_CLIENTE_ID]
    ON [dbo].[Clientes_servicios_Historico]([CLIENTE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CLI13_CLIENTES_S_H_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Clientes_servicios_Historico]([CLIENTE_SERVICIO_ID] ASC);


GO

