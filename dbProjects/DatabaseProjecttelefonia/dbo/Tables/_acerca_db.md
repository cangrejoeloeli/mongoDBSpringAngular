## 0001 : 70 clientes.sql
### Listado de clientes de Acerca
#### Arranque de proceso
CREATE TABLE [dbo].[clientes] (
    [CLIENTE_ID]                    INT           NOT NULL,
    [NUMERADOR_HIJOS]  **Cantidad de Servicios**  INT           NULL, 
    [CODIGO_CALLE] **en base de gas**            INT           NULL,
    [NUMERO] **altura**                       INT           NULL,
    [PISO]                          TINYINT       NULL,
    [SECTOR]                        VARCHAR (2)   NULL,
    [TORRE]                         VARCHAR (3)   NULL,
    [CASA]                          INT           NULL,
    [BARRIO]                        VARCHAR (15)  NULL,
    [Block_titular]                 VARCHAR (2)   NULL,
    [DTO]                           VARCHAR (3)   NULL,
    [LOCALIDAD_ID]                  INT           NULL,
    [CODIGO_POSTAL]                 VARCHAR (10)  NULL,
    [FISICA_JURIDICA]   **F o J**            VARCHAR (1)   NULL,
    [APELLIDO_NOMBRES_RAZON_SOCIAL] VARCHAR (40)  NULL,
    [TE_TITULAR]                    VARCHAR (15)  NULL,
    [CLASIFICACION_IVA_ID]   **dbo.iva**       INT           NULL,
    [PIB]    **PAGA IB**                       VARCHAR (2)   NULL,
    [CLAVE]                         TINYINT       NULL,
    [TIPO_DOC]                      VARCHAR (4)   NULL,
    [NUMERO_DOC]                    VARCHAR (19)  NULL,
    [DIGITO_VERIFICADOR]            TINYINT       NULL,
    [DOCUMENTO]                     VARCHAR (20)  NULL,
    [FECHA_ingreso_al_sistema]      DATETIME      NULL,
    [Apoderado]                     VARCHAR (40)  NULL,
    [TIPO_DOC_apoderado]            VARCHAR (4)   NULL,
    [NUMERO_DOC_apoderado]          VARCHAR (19)  NULL,
    [nombre_calle]                  VARCHAR (150) NULL,
    [te_1]                          VARCHAR (20)  NULL,
    [cliente_agrupado]              TINYINT       NULL,
    [acerca_tv]                     INT           NULL,
    PRIMARY KEY CLUSTERED ([CLIENTE_ID] ASC),
    UNIQUE NONCLUSTERED ([APELLIDO_NOMBRES_RAZON_SOCIAL] ASC, [CLIENTE_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_CALLE] ASC, [NUMERO] ASC, [PISO] ASC, [SECTOR] ASC, [TORRE] ASC, [CASA] ASC, [BARRIO] ASC, [Block_titular] ASC, [DTO] ASC, [CLIENTE_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI_CLIENTES_X_CALLE]
    ON [dbo].[clientes]([CODIGO_CALLE] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI_CLIENTES_X_LOCALIDAD_ID]
    ON [dbo].[clientes]([LOCALIDAD_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [UQ__clientes__01342732]
    ON [dbo].[clientes]([DOCUMENTO] ASC);
GO

## 68: Clientes_servicios.sql
### Listado de Servicios de Acerca en db
#### Vinculado con CLIENTE_ID en clientes
CREATE TABLE [dbo].[Clientes_servicios] (
    [CLIENTE_ID]                      INT              NULL,
    [CLIENTE_SERVICIO_ID]             INT              NOT NULL,
    [NUMERADOR_HIJOS]                 INT              NULL,
    [CODIGO_CALLE]                    INT              NULL,
    [NUMERO]                          INT              NULL,
    [SECTOR]                          VARCHAR (2)      NULL,
    [BLOCK]                           VARCHAR (2)      NULL,
    [TORRE]                           VARCHAR (3)      NULL,
    [PISO]                            TINYINT          NULL,
    [DTO]                             VARCHAR (3)      NULL,
    [CASA]                            INT              NULL,
    [BARRIO]                          VARCHAR (15)     NULL,
    [LOCALIDAD_ID]                    INT              NULL,
    [CODIGO_POSTAL]                   VARCHAR (10)     NULL,
    [ENTRE_CODIGO_CALLE_1]            INT              NULL,
    [ENTRE_CODIGO_CALLE_2]            INT              NULL,
    [CODIGO_CALLE_P]                  INT              NULL,
    [NUMERO_P]                        INT              NULL,
    [SECTOR_P]                        VARCHAR (2)      NULL,
    [BLOCK_P]                         VARCHAR (2)      NULL,
    [TORRE_P]                         VARCHAR (3)      NULL,
    [PISO_P]                          TINYINT          NULL,
    [DTO_P]                           VARCHAR (3)      NULL,
    [CASA_P]                          INT              NULL,
    [BARRIO_P]                        VARCHAR (15)     NULL,
    [LOCALIDAD_ID_P]                  INT              NULL,
    [CODIGO_POSTAL_P]                 VARCHAR (10)     NULL,
    [SERVICIO]                        VARCHAR (20)     NULL,
    [NUMERO_TELEFONO]                 INT              NULL,
    [USER_NAME]                       VARCHAR (30)     NULL,
    [PAR_ID]                          INT              NULL,
    [PUERTOS_ID]                      INT              NULL,
    [TIPO_DOC]                        VARCHAR (4)      NULL,
    [CLAVE]                           TINYINT          NULL,
    [NUMERO_DOC]                      VARCHAR (19)     NULL,
    [DIGITO_VERIFICADOR]              TINYINT          NULL,
    [DOCUMENTO]                       VARCHAR (20)     NULL,
    [CLASIFICACION_IVA_ID]            INT              NULL,
    [PIB]                             VARCHAR (2)      NULL,
    [FECHA_INSTALACION]               DATETIME         NULL,
    [FECHA_SOLICITUD]                 DATETIME         NULL,
    [FECHA_HABILITACION]              DATETIME         NULL,
    [PLAN_COMERCIAL]                  INT              NULL,
    [ESTADO]                          TINYINT          NULL,
    [NUMERO_SOLICITUD]                INT              NULL,
    [VENDEDOR]                        INT              NULL,
    [orden_instalacion]               INT              NULL,
    [FECHA_INSTALACION1]              DATETIME         NULL,
    [Pertenece_a]                     VARCHAR (40)     NULL,
    [FECHA_ingreso_al_sistema]        DATETIME         NULL,
    [Cuadrilla]                       VARCHAR (50)     NULL,
    [Modem_id]                        INT              NULL,
    [Observaciones]                   VARCHAR (300)    NULL,
    [tipo_conexion]                   VARCHAR (20)     NULL,
    [Password]                        VARCHAR (49)     NULL,
    [ip_1]                            TINYINT          NULL,
    [ip_2]                            TINYINT          NULL,
    [ip_3]                            TINYINT          NULL,
    [percepcion_id]                   TINYINT          NULL,
    [F_e_id]                          INT              NULL,
    [calle_postal]                    VARCHAR (40)     NULL,
    [Fecha_baja]                      DATETIME         NULL,
    [ip_4]                            TINYINT          NULL,
    [bajada]                          TINYINT          NULL,
    [Clasificacion_de_clientes_id]    INT              NULL,
    [Cantidad_de_bocas]               INT              NULL,
    [Figuracion_en_guia]              VARCHAR (2)      NULL,
    [telefono_id]                     INT              NULL,
    [partida]                         INT              NULL,
    [metros_cuadrados_vivienda]       DECIMAL (18)     NULL,
    [monto_acumulado_facturacion]     DECIMAL (18, 2)  NULL,
    [iva_monto_acumulado_facturacion] DECIMAL (18, 2)  NULL,
    [nombre_fantasia]                 VARCHAR (55)     NULL,
    [cantidad_de_facturas_adeudadas]  INT              NULL,
    [fecha_intimacion]                DATETIME         NULL,
    [fecha_telecobranza]              DATETIME         NULL,
    [intima]                          TINYINT          NULL,
    [fecha_suspencion]                DATETIME         NULL,
    [Fecha_proxima_inclusion]         DATETIME         NULL,
    [cantidad_de_facturas_intimadas]  INT              NULL,
    [cantidad_de_bocas_adicionales]   TINYINT          NULL,
    [cantidad_de_bocas_existentes]    TINYINT          NULL,
    [Motivo]                          VARCHAR (150)    NULL,
    [no_genera_intereses]             TINYINT          NULL,
    [plan_de_pago]                    TINYINT          NULL,
    [modem2_id]                       INT              NULL,
    [orden]                           INT              NULL,
    [ruta]                            INT              NULL,
    [housing]                         TINYINT          NULL,
    [fecha_cambio_numero]             DATETIME         NULL,
    [hosting]                         TINYINT          NULL,
    [Consumo_promedio]                DECIMAL (18, 2)  NULL,
    [cantidad_de_facturas]            INT              NULL,
    [prejudicial]                     INT              CONSTRAINT [DF_Clientes_servicios_prejudicial] DEFAULT ((0)) NULL,
    [financiera]                      INT              CONSTRAINT [DF_Clientes_servicios_financiera] DEFAULT ((0)) NULL,
    [cantidad_ivr]                    TINYINT          CONSTRAINT [DF_Clientes_servicios_cantidad_ivr] DEFAULT ((0)) NULL,
    [cuota_dvr]                       TINYINT          NULL,
    [propio]                          TINYINT          CONSTRAINT [DF_Clientes_servicios_propio] DEFAULT ((0)) NULL,
    [no_intimacion]                   TINYINT          NULL,
    [mes]                             INT              NULL,
    [anio]                            INT              NULL,
    [cpe_id]                          INT              NULL,
    [wifi]                            TINYINT          NULL,
    [estado_wifi]                     TINYINT          NULL,
    [fecha_rechazo]                   DATETIME         NULL,
    [rechazo_id]                      INT              NULL,
    [numero_orden_wifi]               INT              NULL,
    [impreso_solicitud_wifi]          TINYINT          NULL,
    [TIPO_CTA_DEBITO]                 TINYINT          NULL,
    [SIP]                             TINYINT          NULL,
    [PASS]                            VARCHAR (30)     NULL,
    [fecha_revision_wifi]             DATETIME         NULL,
    [id_categoria_cnc]                TINYINT          NULL,
    [acceso_remoto]                   TINYINT          NULL,
    [estabilizador_id]                INT              NULL,
    [vpn]                             TINYINT          NULL,
    [prebaja_id]                      INT              NULL,
    [ip_id]                           INT              NULL,
    [MZ]                              VARCHAR (4)      NULL,
    [Secc]                            VARCHAR (4)      NULL,
    [croquis]                         CHAR (10)        NULL,
    [servicio_bonificado]             INT              NULL,
    [marca_llamados]                  TINYINT          NULL,
    [nombre_calle]                    VARCHAR (150)    NULL,
    [mail]                            VARCHAR (50)     NULL,
    [fecha_factibilidad]              DATETIME         NULL,
    [detalle_llamadas]                TINYINT          NULL,
    [comentario_bajas]                VARCHAR (90)     NULL,
    [nodo_id]                         INT              NULL,
    [Nombre_cliente]                  VARCHAR (50)     NULL,
    [par_guardado]                    INT              NULL,
    [cambio_interes]                  TINYINT          NULL,
    [m_deb_auto]                      TINYINT          NULL,
    [factura_electronica]             INT              NULL,
    [aviso_electronico]               INT              NULL,
    [email]                           VARCHAR (61)     NULL,
    [FTTH]                            TINYINT          NULL,
    [posicion_ftth]                   INT              NULL,
    [relacion_ftth]                   TINYINT          NULL,
    [cambio_a_ftth]                   TINYINT          NULL,
    [fecha_prejudicial]               DATETIME         NULL,
    [calle_google]                    VARCHAR (40)     NULL,
    [latitud]                         DECIMAL (18, 10) NULL,
    [longitud]                        DECIMAL (18, 10) NULL,
    [localidad]                       VARCHAR (40)     NULL,
    [la]                              DECIMAL (18, 10) NULL,
    [te_1]                            VARCHAR (20)     NULL,
    [region]                          VARCHAR (50)     NULL,
    [gubernamental]                   TINYINT          NULL,
    [te_contacto]                     NVARCHAR (30)    NULL,
    [nombre_titular]                  VARCHAR (90)     NULL,
    [nodo_descrip]                    VARCHAR (90)     NULL,
    [placa_descripcion]               VARCHAR (90)     NULL,
    [nodo_ftth]                       VARCHAR (90)     NULL,
    [ip]                              VARCHAR (50)     NULL,
    [carga_pos_manual]                TINYINT          NULL,
    [aviso_electronico_enviado]       TINYINT          NULL,
    [mail_secundario]                 VARCHAR (80)     NULL,
    [marcar_no_suspender]             TINYINT          NULL,
    [devolver_interes]                TINYINT          NULL,
    [importe_interes]                 DECIMAL (18, 2)  NULL,
    [fecha_modif_datos]               INT              NULL,
    [cliente_agrupado]                TINYINT          NULL,
    [factura_de_credito]              TINYINT          NULL,
    [CIS]                             VARCHAR (15)     NULL,
    [cliente_agrupado_id]             INT              NULL,
    [llamado_rechazado]               TINYINT          NULL,
    [fecha_llamada_rechazada]         DATETIME         NULL,
    [marca_cambio_titularidad]        TINYINT          NULL,
    [baja_sin_factura]                TINYINT          NULL,
    [no_avisos_ivr]                   TINYINT          NULL,
    [punto_camara]                    INT              NULL,
    [acerca_tv]                       INT              NULL,
    [fecha_alta_acerca_tv]            DATETIME         NULL,
    [fecha_ingreso_acerca_tv]         DATETIME         NULL,
    [factura_paga_acerca_tv]          INT              NULL,
    [operador]                        VARCHAR (40)     NULL,
    [ingreso_a_plataforma]            INT              NULL,
    [factura_acercatv_id]             INT              NULL,
    [email_acceso]                    VARCHAR (100)    NULL,
    [IdClienteWeb]                    INT              NULL,
    CONSTRAINT [PK__Clientes_servici__2A6B46EF] PRIMARY KEY CLUSTERED ([CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [Clientes_servicios_x_par_id_y_x_id] UNIQUE NONCLUSTERED ([PAR_ID] ASC, [CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [IX_Clientes_servicios] UNIQUE NONCLUSTERED ([FECHA_HABILITACION] ASC, [CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [IX_Clientes_servicios_1] UNIQUE NONCLUSTERED ([Fecha_baja] ASC, [CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [UQ__Clientes_servici__2B5F6B28] UNIQUE NONCLUSTERED ([ESTADO] ASC, [CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [UQ__Clientes_servici__2C538F61] UNIQUE NONCLUSTERED ([CODIGO_CALLE] ASC, [NUMERO] ASC, [PISO] ASC, [SECTOR] ASC, [TORRE] ASC, [CASA] ASC, [BARRIO] ASC, [BLOCK] ASC, [DTO] ASC, [CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [UQ__Clientes_servici__2D47B39A] UNIQUE NONCLUSTERED ([CLIENTE_ID] ASC, [CLIENTE_SERVICIO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI1_CLIENTES_SERVICIOS_X_NUMERADOR_HIJOS_E_ID]
    ON [dbo].[Clientes_servicios]([NUMERADOR_HIJOS] ASC, [CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [IX_Clientes_servicios_3]
    ON [dbo].[Clientes_servicios]([orden] ASC, [ruta] ASC);
GO
CREATE NONCLUSTERED INDEX [x_acerca_tv_1]
    ON [dbo].[Clientes_servicios]([FTTH] ASC, [ESTADO] ASC, [acerca_tv] ASC, [CIS] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI1_CLIENTES_SERVICIOS_X_CALLE_DOMICILIO]
    ON [dbo].[Clientes_servicios]([CODIGO_CALLE] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI1_CLIENTES_SERVICIOS_X_DOCUMENTO]
    ON [dbo].[Clientes_servicios]([DOCUMENTO] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_id_y_numerador_hijos]
    ON [dbo].[Clientes_servicios]([CLIENTE_ID] ASC, [NUMERADOR_HIJOS] ASC);
GO
CREATE NONCLUSTERED INDEX [x_servicio]
    ON [dbo].[Clientes_servicios]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [x_acerca_tv]
    ON [dbo].[Clientes_servicios]([FTTH] ASC, [ESTADO] ASC, [acerca_tv] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI1_CLIENTES_SERVICIOS_X_FECHA_HABILITACION]
    ON [dbo].[Clientes_servicios]([FECHA_HABILITACION] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI1_CLIENTES_SERVICIOS_X_LOCALIDAD_ID]
    ON [dbo].[Clientes_servicios]([LOCALIDAD_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [IX_Clientes_servicios_2]
    ON [dbo].[Clientes_servicios]([NUMERO_TELEFONO] ASC);
GO
CREATE NONCLUSTERED INDEX [IX_Clientes_servicios_5]
    ON [dbo].[Clientes_servicios]([CODIGO_CALLE_P] ASC, [NUMERO_P] DESC);
GO
CREATE NONCLUSTERED INDEX [CLI1_CLIENTES_X_ID]
    ON [dbo].[Clientes_servicios]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI1_CLIENTES_SERVICIOS_X_CALLE_DOMICILIO_POSTAL]
    ON [dbo].[Clientes_servicios]([CODIGO_CALLE_P] ASC);
GO
CREATE NONCLUSTERED INDEX [Clientes_servicios_x_numerador_hijos_y_servicio]
    ON [dbo].[Clientes_servicios]([CLIENTE_ID] ASC, [NUMERADOR_HIJOS] ASC, [SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [IX_Clientes_servicios_4]
    ON [dbo].[Clientes_servicios]([CODIGO_CALLE_P] ASC, [NUMERO_P] ASC);
GO

## 384: Tipos_items_facturacion.sql
### Los tipos para los items de facturación.
CREATE TABLE [dbo].[Tipos_items_facturacion] (
    [TIPO_ID]     INT          NOT NULL,
    [DESCRIPCION] VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([TIPO_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);
GO

## 374: Tarifas_codigo_area_nacional.sql
### Precios / tarifa por código de área nacional
CREATE TABLE [dbo].[Tarifas_codigo_area_nacional] (
    [TARIFAS_CODIGO_AREA_NACIONAL_ID] INT             NOT NULL,
    [CODIGO_AREA]                     VARCHAR (6)     NULL,
    [PRECIO]                          DECIMAL (13, 4) NULL,
    [PRESTATARIA_ID]                  INT             NULL,
    PRIMARY KEY CLUSTERED ([TARIFAS_CODIGO_AREA_NACIONAL_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_AREA] ASC, [PRESTATARIA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TAR1_X_CODIGO_AREA]
    ON [dbo].[Tarifas_codigo_area_nacional]([CODIGO_AREA] ASC);
GO
CREATE NONCLUSTERED INDEX [TAR1_X_PRESTATARIA_ID]
    ON [dbo].[Tarifas_codigo_area_nacional]([PRESTATARIA_ID] ASC);
GO

## 373: Tarifas_claves.sql
### tarifas precios por clave
CREATE TABLE [dbo].[Tarifas_claves] (
    [TARIFAS_CLAVES_ID] INT             NOT NULL,
    [CLAVE]             INT             NULL,
    [PRECIO]            DECIMAL (11, 4) NULL,
    [PRESTATARIA_ID]    INT             NULL,
    PRIMARY KEY CLUSTERED ([TARIFAS_CLAVES_ID] ASC),
    UNIQUE NONCLUSTERED ([CLAVE] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TAR_X_PRESTATARIA]
    ON [dbo].[Tarifas_claves]([PRESTATARIA_ID] ASC);
GO


## 1: agrupa_tipo_reclamo.sql
CREATE TABLE [dbo].[agrupa_tipo_reclamo] (
    [ID_AGRUPA_TIPO_RECLAMO] INT           NOT NULL,
    [AGRUPAMIENTO]           VARCHAR (140) NULL,
    [SERVICIO]               VARCHAR (40)  NULL,
    [id_categoria_cnc]       TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([ID_AGRUPA_TIPO_RECLAMO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [AGR_KEY_AGRUPAMIENTO]
    ON [dbo].[agrupa_tipo_reclamo]([AGRUPAMIENTO] ASC);
GO
CREATE NONCLUSTERED INDEX [AGR_KEY_SERVICIO]
    ON [dbo].[agrupa_tipo_reclamo]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [AGR_KEY_ID_AGRUPA_POR_SERVICIO]
    ON [dbo].[agrupa_tipo_reclamo]([ID_AGRUPA_TIPO_RECLAMO] ASC, [SERVICIO] ASC);
GO


## 2: agrupa_tipo_solucion.sql
CREATE TABLE [dbo].[agrupa_tipo_solucion] (
    [ID_AGRUPAMIENTO] INT           NOT NULL,
    [AGRUPAMIENTO]    VARCHAR (144) NULL,
    [SERVICIO]        VARCHAR (44)  NULL,
    PRIMARY KEY CLUSTERED ([ID_AGRUPAMIENTO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [AGR1_X_SERVICIO]
    ON [dbo].[agrupa_tipo_solucion]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [AGR1_X_AGRUPAMIENTO]
    ON [dbo].[agrupa_tipo_solucion]([AGRUPAMIENTO] ASC);
GO
CREATE NONCLUSTERED INDEX [AGR1_X_AGRUPAMIENTO_ID_Y_SERVICIO]
    ON [dbo].[agrupa_tipo_solucion]([ID_AGRUPAMIENTO] ASC, [SERVICIO] ASC);
GO


## 3: a_imprimir_acerca.sql
CREATE TABLE [dbo].[a_imprimir_acerca] (
    [ID_MEZCLA]           INT          NOT NULL,
    [CODIGO_CALLE]        INT          NULL,
    [NUMERO]              INT          NULL,
    [ORDEN]               INT          NULL,
    [RUTA]                INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [CLIENTE_ID]          INT          NULL,
    [FACTURA_ID]          VARCHAR (79) NULL,
    [LOCALIDAD_POSTAL]    VARCHAR (79) NULL,
    [SERVICIO]            VARCHAR (33) NULL,
    [IMPRESO]             TINYINT      NULL,
    [PERIODO_ID]          INT          NULL,
    [electronica]         TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([ID_MEZCLA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [AIA_X_CALLE_DES]
    ON [dbo].[a_imprimir_acerca]([CODIGO_CALLE] DESC, [NUMERO] DESC);
GO
CREATE NONCLUSTERED INDEX [AIA_X_CALLE_ASC]
    ON [dbo].[a_imprimir_acerca]([CODIGO_CALLE] ASC, [NUMERO] ASC);
GO
CREATE NONCLUSTERED INDEX [AIA_X_RUTA]
    ON [dbo].[a_imprimir_acerca]([RUTA] ASC, [ORDEN] ASC);
GO


## 4: alcance_normativo.sql
CREATE TABLE [dbo].[alcance_normativo] (
    [CODIGO]            INT           NOT NULL,
    [NORMATIVA]         VARCHAR (25)  NULL,
    [DESCRIPCION]       VARCHAR (100) NULL,
    [ALCANCE]           VARCHAR (20)  NULL,
    [RENUNCIA_SUBSIDIO] TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC)
);
GO


## 5: alicuotas_articulos.sql
CREATE TABLE [dbo].[alicuotas_articulos] (
    [ALICUOTAS_ARTICULOS_ID] INT            NOT NULL,
    [ITEM_FACTURACION_ID]    INT            NULL,
    [ITEM_DE_APLICACION_ID]  INT            NULL,
    [ALICUOTA]               DECIMAL (7, 2) NULL,
    [SERVICIO]               VARCHAR (19)   NULL,
    [IVA_ID]                 INT            NULL,
    PRIMARY KEY CLUSTERED ([ALICUOTAS_ARTICULOS_ID] ASC),
    UNIQUE NONCLUSTERED ([ITEM_DE_APLICACION_ID] ASC, [SERVICIO] ASC)
);
GO


## 6: alicuotas_iva_cpp.sql
CREATE TABLE [dbo].[alicuotas_iva_cpp] (
    [ALICUOTA_CPP_ID]               TINYINT        NOT NULL,
    [ALICUOTA]                      DECIMAL (9, 2) NULL,
    [COLUMNA_SUBDIARIO_IVA]         TINYINT        NULL,
    [COLUMNA_SUBDIARIO_FACTURACION] TINYINT        NULL,
    [LETRA_FACTURA]                 VARCHAR (1)    NULL,
    [CUENTA_CONTABLE]               VARCHAR (30)   NULL,
    PRIMARY KEY CLUSTERED ([ALICUOTA_CPP_ID] ASC),
    UNIQUE NONCLUSTERED ([ALICUOTA] ASC, [LETRA_FACTURA] ASC),
    UNIQUE NONCLUSTERED ([COLUMNA_SUBDIARIO_IVA] ASC, [LETRA_FACTURA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ALI101_ALICUOTAS_CP_X_ALICUOTA]
    ON [dbo].[alicuotas_iva_cpp]([ALICUOTA] ASC);
GO


## 7: alicuotas_iva_items_opcionales.sql
CREATE TABLE [dbo].[alicuotas_iva_items_opcionales] (
    [ALICUOTA_ID]                   TINYINT        NOT NULL,
    [ALICUOTA]                      DECIMAL (9, 2) NULL,
    [COLUMNA_SUBDIARIO_IVA]         TINYINT        NULL,
    [COLUMNA_SUBDIARIO_FACTURACION] TINYINT        NULL,
    [LETRA_FACTURA]                 VARCHAR (1)    NULL,
    [CUENTA_CONTABLE]               VARCHAR (30)   NULL,
    [ITEM_FACTURACION_ID]           INT            NULL,
    PRIMARY KEY CLUSTERED ([ALICUOTA_ID] ASC),
    UNIQUE NONCLUSTERED ([ALICUOTA] ASC, [LETRA_FACTURA] ASC),
    UNIQUE NONCLUSTERED ([COLUMNA_SUBDIARIO_IVA] ASC, [LETRA_FACTURA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ALI1011_ALICUOTAS_X_ALICUOTA]
    ON [dbo].[alicuotas_iva_items_opcionales]([ALICUOTA] ASC);
GO


## 8: alicuotas_iva.sql
CREATE TABLE [dbo].[alicuotas_iva] (
    [ALICUOTA_ID]                   TINYINT        NOT NULL,
    [ALICUOTA]                      DECIMAL (9, 2) NULL,
    [COLUMNA_SUBDIARIO_IVA]         TINYINT        NULL,
    [LETRA_FACTURA]                 VARCHAR (1)    NULL,
    [CUENTA_CONTABLE]               VARCHAR (30)   NULL,
    [COLUMNA_SUBDIARIO_FACTURACION] TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([ALICUOTA_ID] ASC),
    UNIQUE NONCLUSTERED ([ALICUOTA] ASC, [LETRA_FACTURA] ASC),
    UNIQUE NONCLUSTERED ([COLUMNA_SUBDIARIO_IVA] ASC, [LETRA_FACTURA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ALI10_ALICUOTAS_X_ALICUOTA]
    ON [dbo].[alicuotas_iva]([ALICUOTA] ASC);
GO


## 9: alicuotas_max_ib.sql
CREATE TABLE [dbo].[alicuotas_max_ib] (
    [ID]           INT NOT NULL,
    [ALICUOTA_MAX] INT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 10: ama_historico_no_facturado_historico_.sql
CREATE TABLE [dbo].[ama_historico_no_facturado(historico)] (
    [AMA_ID]                 INT              NOT NULL,
    [NUMERO_ORIGEN]          VARCHAR (19)     NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_AMA]              DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                INT              NULL,
    [IMPORTE]                DECIMAL (11, 10) NULL,
    [TIPO]                   TINYINT          NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    PRIMARY KEY CLUSTERED ([AMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_AMA] ASC, [HORA] ASC, [AMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM411_X_NUMERO]
    ON [dbo].[ama_historico_no_facturado(historico)]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM411_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[ama_historico_no_facturado(historico)]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM411_PARA_CLAVE_UNICA]
    ON [dbo].[ama_historico_no_facturado(historico)]([NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_AMA] ASC, [HORA] ASC, [SEGUNDOS] ASC, [IMPORTE] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM411_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[ama_historico_no_facturado(historico)]([CLIENTE_SERVICIO_ID] ASC, [FECHA_AMA] ASC);
GO


## 11: ama_historico_no_facturado.sql
CREATE TABLE [dbo].[ama_historico_no_facturado] (
    [AMA_ID]                 INT              NOT NULL,
    [NUMERO_ORIGEN]          VARCHAR (19)     NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_AMA]              DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [IMPORTE]                DECIMAL (11, 10) NULL,
    [TIPO]                   TINYINT          NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    PRIMARY KEY CLUSTERED ([AMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_AMA] ASC, [HORA] ASC, [AMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM411_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[ama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC, [FECHA_AMA] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM411_PARA_CLAVE_UNICA]
    ON [dbo].[ama_historico_no_facturado]([NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_AMA] ASC, [HORA] ASC, [SEGUNDOS] ASC, [IMPORTE] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM411_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[ama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM411_X_NUMERO]
    ON [dbo].[ama_historico_no_facturado]([NUMERO_ORIGEN] ASC);
GO


## 12: ama_historico.sql
CREATE TABLE [dbo].[ama_historico] (
    [AMA_ID]                 INT              NOT NULL,
    [NUMERO_ORIGEN]          VARCHAR (19)     NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_AMA]              DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [IMPORTE]                DECIMAL (11, 10) NULL,
    [TIPO]                   TINYINT          NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    PRIMARY KEY CLUSTERED ([AMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_AMA] ASC, [HORA] ASC, [AMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM41_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[ama_historico]([CLIENTE_SERVICIO_ID] ASC, [FECHA_AMA] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM41_PARA_CLAVE_UNICA]
    ON [dbo].[ama_historico]([NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_AMA] ASC, [HORA] ASC, [SEGUNDOS] ASC, [IMPORTE] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM41_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[ama_historico]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM41_X_NUMERO]
    ON [dbo].[ama_historico]([NUMERO_ORIGEN] ASC);
GO


## 13: ama.sql
CREATE TABLE [dbo].[ama] (
    [AMA_ID]                 INT              NOT NULL,
    [NUMERO_ORIGEN]          VARCHAR (19)     NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_AMA]              DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [IMPORTE]                DECIMAL (11, 10) NULL,
    [TIPO]                   TINYINT          NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    PRIMARY KEY CLUSTERED ([AMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_AMA] ASC, [HORA] ASC, [AMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM4_PARA_CLAVE_UNICA]
    ON [dbo].[ama]([NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_AMA] ASC, [HORA] ASC, [SEGUNDOS] ASC, [IMPORTE] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM4_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[ama]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM4_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[ama]([CLIENTE_SERVICIO_ID] ASC, [FECHA_AMA] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM4_X_NUMERO]
    ON [dbo].[ama]([NUMERO_ORIGEN] ASC);
GO


## 14: Aplicaciones_puertos.sql
CREATE TABLE [dbo].[Aplicaciones_puertos] (
    [APLICACION_ID]     INT          NOT NULL,
    [NOMBRE_APLICACION] VARCHAR (99) NULL,
    PRIMARY KEY CLUSTERED ([APLICACION_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [APL_KEY_NOMBRE_APLICACION]
    ON [dbo].[Aplicaciones_puertos]([NOMBRE_APLICACION] ASC);
GO
CREATE NONCLUSTERED INDEX [APL_KEY_APLICACION_ID_Y_NOMBRE]
    ON [dbo].[Aplicaciones_puertos]([APLICACION_ID] ASC, [NOMBRE_APLICACION] ASC);
GO


## 15: Areas.sql
CREATE TABLE [dbo].[Areas] (
    [AREA_ID]     INT           NOT NULL,
    [AREA_NOMBRE] VARCHAR (100) NULL,
    PRIMARY KEY CLUSTERED ([AREA_ID] ASC)
);
GO


## 16: Armarios.sql
CREATE TABLE [dbo].[Armarios] (
    [ARMARIO_ID]   INT          NOT NULL,
    [DESCRIPCION]  VARCHAR (30) NULL,
    [CODIGO_CALLE] INT          NULL,
    [NUMERO]       INT          NULL,
    [LUGAR]        VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([ARMARIO_ID] ASC),
    UNIQUE NONCLUSTERED ([ARMARIO_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ARM_ARMARIO_X_CODIGO_CALLE]
    ON [dbo].[Armarios]([CODIGO_CALLE] ASC);
GO


## 17: articulos_compra_venta.sql
CREATE TABLE [dbo].[articulos_compra_venta] (
    [ID]                INT             NOT NULL,
    [ARTICULO_ID]       INT             NULL,
    [FECHA_COMPRA]      DATETIME        NULL,
    [FECHA_VENTA]       DATETIME        NULL,
    [CANTIDAD_COMPRADA] TINYINT         NULL,
    [CANTIDAD_RESTANTE] TINYINT         NULL,
    [COSTO]             DECIMAL (13, 4) NULL,
    [SERIE]             VARCHAR (64)    NULL,
    [COD_BARRA]         VARCHAR (59)    NULL,
    [CODIGO_QR]         VARCHAR (59)    NULL,
    [ORDEN_COMPRA_ID]   INT             NULL,
    [DEPOSITO_ID]       INT             NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ART1_X_ARTICULO]
    ON [dbo].[articulos_compra_venta]([ARTICULO_ID] ASC);
GO


## 18: articulos_vendidos.sql
CREATE TABLE [dbo].[articulos_vendidos] (
    [ID]                              INT     NOT NULL,
    [ID_ARTICULOS_COMPRADOS_VENDIDOS] INT     NULL,
    [ID_ARTICULO]                     INT     NULL,
    [ID_FACTURA]                      INT     NULL,
    [CANTIDAD]                        TINYINT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ART2_X_ID_FACTURA_Y_ARTICULO]
    ON [dbo].[articulos_vendidos]([ID_FACTURA] ASC, [ID_ARTICULO] ASC);
GO
CREATE NONCLUSTERED INDEX [ART2_X_ID_FACTURA]
    ON [dbo].[articulos_vendidos]([ID_FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [ART2_X_ID_ARTICULO]
    ON [dbo].[articulos_vendidos]([ID_ARTICULO] ASC);
GO


## 19: AuditRec.sql
CREATE TABLE [dbo].[AuditRec] (
    [ID]             INT      NOT NULL,
    [InternalNumber] INT      NULL,
    [IdUser]         SMALLINT NULL,
    [DateRec]        DATETIME NULL,
    [Forced]         TINYINT  NULL,
    [Renumbered]     TINYINT  NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [byIntNumber]
    ON [dbo].[AuditRec]([InternalNumber] ASC, [ID] ASC);
GO


## 20: AUDIT.sql
CREATE TABLE [dbo].[AUDIT] (
    [InternalNumber]  INT          NOT NULL,
    [MemoField1]      CHAR (3)     NULL,
    [MemoField2]      CHAR (3)     NULL,
    [CompressionFlag] TINYINT      NULL,
    [FileName]        VARCHAR (40) NOT NULL,
    [FileVersion]     SMALLINT     NULL,
    [DateAudit]       DATETIME     NOT NULL,
    [IDUser]          INT          NOT NULL,
    [Station]         CHAR (20)    NOT NULL,
    [ProcedureName]   CHAR (14)    NOT NULL,
    [Operation]       CHAR (2)     NOT NULL,
    [SearchKey]       VARCHAR (40) NOT NULL,
    [STOREDRECORD]    IMAGE        NULL,
    PRIMARY KEY CLUSTERED ([InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([IDUser] ASC, [InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([Operation] ASC, [InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([ProcedureName] ASC, [InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([Station] ASC, [InternalNumber] ASC),
    UNIQUE NONCLUSTERED ([SearchKey] ASC, [FileName] ASC, [InternalNumber] ASC)
);
GO
CREATE NONCLUSTERED INDEX [byAuditDateTime]
    ON [dbo].[AUDIT]([DateAudit] ASC, [InternalNumber] ASC);
GO
CREATE NONCLUSTERED INDEX [byFilenameDateTime]
    ON [dbo].[AUDIT]([FileName] ASC, [DateAudit] ASC);
GO


## 21: aumento_internet.sql
CREATE TABLE [dbo].[aumento_internet] (
    [PLAN_ID] INT            NOT NULL,
    [PRECIO]  DECIMAL (7, 2) NULL,
    PRIMARY KEY CLUSTERED ([PLAN_ID] ASC)
);
GO


## 22: autorizaciones.sql
CREATE TABLE [dbo].[autorizaciones] (
    [AUTORIZACION_ID]       INT      NOT NULL,
    [USUARIO_ID]            INT      NULL,
    [USUARIO_AUTORIZADO_ID] INT      NULL,
    [CLIENTE_SERVICIO_ID]   INT      NULL,
    [PERMISO_ID]            INT      NULL,
    [FECHA]                 DATETIME NULL,
    PRIMARY KEY CLUSTERED ([AUTORIZACION_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PERMISO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [USUARIO_AUTORIZADO_ID] ASC, [PERMISO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [AUT_X_USUARIO_ID_Y_CLIENTE_SERVICIO_ID_Y_PERMISO_ID]
    ON [dbo].[autorizaciones]([USUARIO_ID] ASC, [CLIENTE_SERVICIO_ID] ASC, [PERMISO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [AUT_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[autorizaciones]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [AUT_X_USUARIO_ID]
    ON [dbo].[autorizaciones]([USUARIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [AUT_X_PERMISO_ID]
    ON [dbo].[autorizaciones]([PERMISO_ID] ASC);
GO


## 23: autorizar_botones_especiales.sql
CREATE TABLE [dbo].[autorizar_botones_especiales] (
    [ID]       INT     NOT NULL,
    [AUTORIZA] TINYINT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 24: autorizar_cambio_titularidad.sql
CREATE TABLE [dbo].[autorizar_cambio_titularidad] (
    [ID_CAMBIO]           INT NOT NULL,
    [PERMISO_FACTURACION] INT NULL,
    [PERMISO_GERENCIA]    INT NULL,
    PRIMARY KEY CLUSTERED ([ID_CAMBIO] ASC)
);
GO


## 25: aux_.sql
CREATE TABLE [dbo].[aux] (
    [C1] VARCHAR (19) NULL,
    [C2] VARCHAR (50) NULL,
    [C3] VARCHAR (50) NULL,
    [C4] VARCHAR (50) NULL
);
GO
CREATE NONCLUSTERED INDEX [AUX_POR_A]
    ON [dbo].[aux]([C1] ASC);
GO


## 26: aux_sql2.sql
CREATE TABLE [dbo].[aux_sql2] (
    [C1] VARCHAR (19) NULL,
    [C2] VARCHAR (50) NULL,
    [C3] VARCHAR (50) NULL
);
GO


## 27: aviso_electronico.sql
CREATE TABLE [dbo].[aviso_electronico] (
    [AVISO_ID]            INT             NOT NULL,
    [MARCA_ENVIADO]       TINYINT         NULL,
    [CLIENTE_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [NUMERO_FACTURA]      VARCHAR (49)    NULL,
    [IMPORTE]             DECIMAL (13, 2) NULL,
    [FECHA_VENCIMIENTO]   INT             NULL,
    [EMAIL]               VARCHAR (79)    NULL,
    [EMAIL_SEC]           VARCHAR (79)    NULL,
    [NOMBRE_USUARIO]      VARCHAR (79)    NULL,
    [FECHA_GENERACION]    DATETIME        NULL,
    [FECHA_ENVIO]         DATETIME        NULL,
    PRIMARY KEY CLUSTERED ([AVISO_ID] ASC)
);
GO


## 28: avisos_enviados.sql
CREATE TABLE [dbo].[avisos_enviados] (
    [ID]                    INT             NOT NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [CLIENTE]               VARCHAR (40)    NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [MARCA]                 TINYINT         NULL,
    [MARCA_MAIL_SECUNDARIO] TINYINT         NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (19, 2) NULL,
    [PERIODO]               VARCHAR (19)    NOT NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [HORA_DE_ENVIO]         INT             NULL,
    [CIS]                   VARCHAR (12)    NOT NULL,
    [TIPO]                  VARCHAR (30)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC3111_X_CIS_Y_PERIODO]
    ON [dbo].[avisos_enviados]([CIS] ASC, [PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3111_X_PERIODO]
    ON [dbo].[avisos_enviados]([PERIODO] ASC);
GO


## 29: bajas_facturar.sql
CREATE TABLE [dbo].[bajas_facturar] (
    [Id]            INT             IDENTITY (1, 1) NOT NULL,
    [IdTransaccion] INT             NOT NULL,
    [Renglon]       INT             NOT NULL,
    [FechaAlta]     DATETIME        NULL,
    [IdServicio]    SMALLINT        NULL,
    [IdEvento]      SMALLINT        NULL,
    [CIS]           VARCHAR (100)   NULL,
    [Marca]         VARCHAR (100)   NULL,
    [Modelo]        VARCHAR (100)   NULL,
    [Serie]         VARCHAR (100)   NULL,
    [Cantidad]      SMALLINT        NULL,
    [BajaCorte]     VARCHAR (10)    NULL,
    [IdStatus]      TINYINT         NULL,
    [FACTURA_ID]    INT             NULL,
    [Error]         TINYINT         NULL,
    [ErrorMensaje]  TEXT            NULL,
    [Descripcion]   VARCHAR (150)   NULL,
    [Importe]       DECIMAL (15, 2) NULL,
    [Modo]          TINYINT         NULL,
    [Legales]       TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([Id] ASC)
);
GO


## 30: bancos.sql
CREATE TABLE [dbo].[bancos] (
    [BANCO_ID]   INT          NOT NULL,
    [BANCO]      CHAR (40)    NULL,
    [SUCURSAL]   VARCHAR (20) NULL,
    [CLEARING_1] DECIMAL (3)  NULL,
    [codigo]     TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([BANCO_ID] ASC),
    UNIQUE NONCLUSTERED ([BANCO] ASC, [BANCO_ID] ASC)
);
GO


## 31: cables.sql
CREATE TABLE [dbo].[cables] (
    [CABLES_ID]           INT          NOT NULL,
    [DESCRIPCION]         VARCHAR (30) NULL,
    [CANTIDAD_DE_PARES]   INT          NULL,
    [PRIMARIO_SECUNDARIO] VARCHAR (1)  NULL,
    [ARMARIO_ID]          INT          NULL,
    [NODO_ID]             INT          NULL,
    PRIMARY KEY CLUSTERED ([CABLES_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC),
    UNIQUE NONCLUSTERED ([ARMARIO_ID] ASC, [CABLES_ID] ASC),
    UNIQUE NONCLUSTERED ([ARMARIO_ID] ASC, [CABLES_ID] ASC),
    UNIQUE NONCLUSTERED ([NODO_ID] ASC, [CABLES_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CAB_CABLES_X_ARMARIO_ID]
    ON [dbo].[cables]([ARMARIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CAB_CABLES_X_NODO_ID]
    ON [dbo].[cables]([NODO_ID] ASC);
GO


## 32: Cae_a_pedir.sql
CREATE TABLE [dbo].[Cae_a_pedir] (
    [ID]                  INT             NOT NULL,
    [ID_AUTONUMERADO]     INT             NULL,
    [PUESTO]              VARCHAR (4)     NULL,
    [TIPO_FACTURA]        INT             NULL,
    [TIPO_DOC]            VARCHAR (2)     NULL,
    [DOC]                 VARCHAR (19)    NULL,
    [NUMERO_INICIAL]      VARCHAR (8)     NULL,
    [NUMERO_FINAL]        VARCHAR (8)     NULL,
    [FECHA_EMISION]       VARCHAR (10)    NULL,
    [IMPORTE]             DECIMAL (15, 2) NULL,
    [NETO]                DECIMAL (15, 2) NULL,
    [IB]                  DECIMAL (15, 2) NULL,
    [IVA]                 DECIMAL (15, 2) NULL,
    [PERIODO_DESDE]       VARCHAR (10)    NULL,
    [PERIODO_HASTA]       VARCHAR (10)    NULL,
    [VENCIMIENTO]         VARCHAR (10)    NULL,
    [ALICUOTA_IB]         DECIMAL (7, 2)  NULL,
    [NETO1]               DECIMAL (15, 2) NULL,
    [NETO2]               DECIMAL (15, 2) NULL,
    [IVA_21]              DECIMAL (15, 2) NULL,
    [IVA_105]             DECIMAL (15, 2) NULL,
    [RESPUESTA]           VARCHAR (1)     NULL,
    [VENCIMIENTO_CAE]     VARCHAR (10)    NULL,
    [NUMERO_CAE]          VARCHAR (20)    NULL,
    [CODIGO_ERROR]        VARCHAR (14)    NULL,
    [DESCRIPCION_ERROR]   VARCHAR (499)   NULL,
    [TEST_1]              TINYINT         NULL,
    [FACTURA_DE_CREDITO]  TINYINT         NULL,
    [NUMERO_ASOCIADO]     INT             NULL,
    [PTO_VTA_ASOCIADO]    INT             NULL,
    [TIPO_CBTE_ASOCIADO]  INT             NULL,
    [NRO_DOC_ASOCIADO]    CHAR (20)       NULL,
    [FECHA_CBTE_ASOCIADO] VARCHAR (10)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([ID_AUTONUMERADO] ASC)
);
GO


## 33: CAE.sql
CREATE TABLE [dbo].[CAE] (
    [ID]                    INT           NOT NULL,
    [TIPO_CBTE]             INT           NULL,
    [PUNTO_VTA]             INT           NULL,
    [CBTO_NRO]              INT           NULL,
    [COMPROBANTE]           VARCHAR (48)  NULL,
    [FECHA_CBTE]            CHAR (8)      NULL,
    [CAE]                   VARCHAR (49)  NULL,
    [FCH_CBTE_CAE]          CHAR (8)      NULL,
    [FECHA_VENCIMIENTO_CAE] VARCHAR (19)  NULL,
    [LINEA]                 VARCHAR (499) NULL,
    [PERIODO_ID]            INT           NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([COMPROBANTE] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CAE_X_NUMERO_COMPROBANTE]
    ON [dbo].[CAE]([CBTO_NRO] ASC);
GO


## 34: cajas_pares.sql
CREATE TABLE [dbo].[cajas_pares] (
    [CAJA_ID]   INT NOT NULL,
    [PAR_DESDE] INT NULL,
    [PAR_HASTA] INT NULL
);
GO


## 35: cajas.sql
CREATE TABLE [dbo].[cajas] (
    [CAJAS_ID]                     INT             NOT NULL,
    [NUMERO_DE_CAJA]               INT             NULL,
    [DESCRIPCION]                  VARCHAR (30)    NULL,
    [CODIGO_CALLE]                 INT             NULL,
    [NUMERO]                       INT             NULL,
    [LUGAR]                        VARCHAR (30)    NULL,
    [CANTIDAD_DE_PARES]            INT             NULL,
    [CANTIDAD_DE_PARES_UTILIZADOS] INT             NULL,
    [LUGAR_INGRESO]                VARCHAR (30)    NULL,
    [ARMARIO_ID]                   INT             NULL,
    [PORC_INTERNET]                TINYINT         NULL,
    [PORC_TELEFONIA]               TINYINT         NULL,
    [capacitancia]                 INT             NULL,
    [wifi]                         TINYINT         NULL,
    [x]                            DECIMAL (18, 7) NULL,
    [y]                            DECIMAL (18, 7) NULL,
    [Permiso_rehusado]             INT             NULL,
    [Comentario_permiso]           VARCHAR (250)   NULL,
    [En_reparacion]                INT             NULL,
    [Reserva_tecnica]              INT             NULL,
    [nombre_calle]                 VARCHAR (80)    NULL,
    [FTTP]                         TINYINT         NULL,
    [caja_instalada]               TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([CAJAS_ID] ASC),
    UNIQUE NONCLUSTERED ([ARMARIO_ID] ASC, [CAJAS_ID] ASC),
    UNIQUE NONCLUSTERED ([CAJAS_ID] ASC, [ARMARIO_ID] ASC),
    CONSTRAINT [CAJ_CAJAS_X_NUMERO] UNIQUE NONCLUSTERED ([NUMERO_DE_CAJA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CAJ_CAJAS_X_ARMARIOS_ID]
    ON [dbo].[cajas]([ARMARIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CAJ_CAJAS_X_CODIGO_DE_CALLE]
    ON [dbo].[cajas]([CODIGO_CALLE] ASC);
GO


## 36: calles.sql
CREATE TABLE [dbo].[calles] (
    [NOMBRE]       VARCHAR (40) NULL,
    [NUMERO]       INT          NULL,
    [cod_calle]    INT          NOT NULL,
    [codigo_calle] INT          NULL,
    PRIMARY KEY CLUSTERED ([cod_calle] ASC),
    UNIQUE NONCLUSTERED ([NOMBRE] ASC),
    UNIQUE NONCLUSTERED ([NUMERO] ASC)
);
GO


## 37: cambios_numeracion.sql
CREATE TABLE [dbo].[cambios_numeracion] (
    [CAMBIOS_NUMERACION_ID] INT      NOT NULL,
    [CLIENTE_SERVICIO_ID]   INT      NULL,
    [FECHA]                 DATETIME NULL,
    [FECHA_HASTA]           DATETIME NULL,
    [NUMERO_TELEFONO]       INT      NULL,
    PRIMARY KEY CLUSTERED ([CAMBIOS_NUMERACION_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FEC2_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cambios_numeracion]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FEC2_X_FECHA]
    ON [dbo].[cambios_numeracion]([FECHA] ASC);
GO
CREATE NONCLUSTERED INDEX [FEC2_X_NUMERO_TELEFONO]
    ON [dbo].[cambios_numeracion]([NUMERO_TELEFONO] ASC);
GO


## 38: cambios_planes.sql
CREATE TABLE [dbo].[cambios_planes] (
    [CAMBIO_ID]         INT          NOT NULL,
    [PLAN_COMERCIAL_ID] INT          NULL,
    [PLAN]              VARCHAR (79) NULL,
    [CAMBIO]            VARCHAR (98) NULL,
    [OPERADOR]          VARCHAR (43) NULL,
    [FECHA]             DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([CAMBIO_ID] ASC)
);
GO


## 39: cambios_vendedores.sql
CREATE TABLE [dbo].[cambios_vendedores] (
    [ID]                   INT          NOT NULL,
    [VENDEDOR_ANTERIOR_ID] INT          NULL,
    [VENDEDOR_NUEVO]       INT          NULL,
    [OPERADOR]             VARCHAR (54) NULL,
    [MOTIVO]               VARCHAR (90) NULL,
    [FECHA]                DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 40: cargar_incidencia.sql
CREATE TABLE [dbo].[cargar_incidencia] (
    [ID_INCIDENCIA]    INT           NOT NULL,
    [INCIDENCIA]       VARCHAR (399) NULL,
    [COMENTARIO]       VARCHAR (249) NULL,
    [FECHA_INCIDENCIA] DATETIME      NULL,
    [TIEMPO_DESDE]     DATETIME      NULL,
    [TIEMPO_HASTA]     DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([ID_INCIDENCIA] ASC)
);
GO


## 41: categoria_iva_clasificacion_clientes.sql
CREATE TABLE [dbo].[categoria_iva_clasificacion_clientes] (
    [CATEGORIA_IVA_CLASIFICACION_CLIENTES_ID] INT NOT NULL,
    [CATEGORIA_IVA]                           INT NULL,
    [CLASIFICACION_CLIENTES]                  INT NULL,
    PRIMARY KEY CLUSTERED ([CATEGORIA_IVA_CLASIFICACION_CLIENTES_ID] ASC),
    UNIQUE NONCLUSTERED ([CLASIFICACION_CLIENTES] ASC, [CATEGORIA_IVA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CAT2_X_CLASIFICACION_ID]
    ON [dbo].[categoria_iva_clasificacion_clientes]([CLASIFICACION_CLIENTES] ASC);
GO
CREATE NONCLUSTERED INDEX [CAT2_X_CATEGORIA_ID]
    ON [dbo].[categoria_iva_clasificacion_clientes]([CATEGORIA_IVA] ASC);
GO


## 42: categorias_cnc.sql
CREATE TABLE [dbo].[categorias_cnc] (
    [id_categoria_cnc] TINYINT      NOT NULL,
    [categoria]        VARCHAR (50) NULL,
    CONSTRAINT [PK_categorias_cnc] PRIMARY KEY CLUSTERED ([id_categoria_cnc] ASC)
);
GO


## 43: Categorias_iva_alicuotas_cpp.sql
CREATE TABLE [dbo].[Categorias_iva_alicuotas_cpp] (
    [CATEGORIAS_IVA_CPP_ALICUOTAS_ID] TINYINT NOT NULL,
    [IVA_CPP_ID]                      INT     NULL,
    [ALICUOTA_1]                      TINYINT NULL,
    [ALICUOTA_2]                      TINYINT NULL,
    [DESDE]                           INT     NULL,
    [HASTA]                           INT     NULL,
    [COLUMNA]                         TINYINT NULL,
    PRIMARY KEY CLUSTERED ([CATEGORIAS_IVA_CPP_ALICUOTAS_ID] ASC),
    UNIQUE NONCLUSTERED ([IVA_CPP_ID] ASC, [CATEGORIAS_IVA_CPP_ALICUOTAS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CAT3_CATEGORIAS_IVA_CPP_X_IVA_ID_SOLO]
    ON [dbo].[Categorias_iva_alicuotas_cpp]([IVA_CPP_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CAT3_CATEGORIAS_IVA_CPP_X_ALICUOTA_1]
    ON [dbo].[Categorias_iva_alicuotas_cpp]([ALICUOTA_1] ASC);
GO
CREATE NONCLUSTERED INDEX [CAT3_CATEGORIAS_IVA_CPP_X_ALICUOTA_2]
    ON [dbo].[Categorias_iva_alicuotas_cpp]([ALICUOTA_2] ASC);
GO


## 44: Categorias_iva_alicuotas.sql
CREATE TABLE [dbo].[Categorias_iva_alicuotas] (
    [CATEGORIAS_IVA_ALICUOTAS_ID] TINYINT      NOT NULL,
    [IVA_ID]                      INT          NULL,
    [ALICUOTA_1]                  TINYINT      NULL,
    [ALICUOTA_2]                  TINYINT      NULL,
    [DESDE]                       INT          NULL,
    [HASTA]                       INT          NULL,
    [COMPRA]                      TINYINT      NULL,
    [VENTA]                       TINYINT      NULL,
    [COLUMNA_IVA_1]               TINYINT      NULL,
    [COLUMNA_IVA_2]               TINYINT      NULL,
    [COLUMNA_FAC_1]               TINYINT      NULL,
    [COLUMNA_FAC_2]               TINYINT      NULL,
    [COLUMNA]                     TINYINT      NULL,
    [SERVICIO]                    VARCHAR (10) NULL,
    PRIMARY KEY CLUSTERED ([CATEGORIAS_IVA_ALICUOTAS_ID] ASC),
    UNIQUE NONCLUSTERED ([IVA_ID] ASC, [CATEGORIAS_IVA_ALICUOTAS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CAT_CATEGORIAS_IVA_X_ALICUOTA_1]
    ON [dbo].[Categorias_iva_alicuotas]([ALICUOTA_1] ASC);
GO
CREATE NONCLUSTERED INDEX [CAT_CATEGORIAS_IVA_X_IVA_ID_SOLO]
    ON [dbo].[Categorias_iva_alicuotas]([IVA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CAT_CATEGORIAS_IVA_X_ALICUOTA_2]
    ON [dbo].[Categorias_iva_alicuotas]([ALICUOTA_2] ASC);
GO


## 45: CCTMOVIM.sql
CREATE TABLE [dbo].[CCTMOVIM] (
    [CAI]         VARCHAR (50)    NULL,
    [CONCOD]      INT             NOT NULL,
    [CTACOD]      INT             NOT NULL,
    [CTANOM]      VARCHAR (65)    NULL,
    [FORMAPAGO]   INT             NULL,
    [HISFACCICLO] INT             NULL,
    [LIQCOD]      VARCHAR (16)    NULL,
    [MOVCTA]      INT             NOT NULL,
    [MOVFEC]      DATETIME        NOT NULL,
    [MOVGRA]      DATETIME        NULL,
    [MOVICC]      INT             NULL,
    [MOVICL]      CHAR (1)        NULL,
    [MOVICT]      INT             NULL,
    [MOVIMP]      DECIMAL (11, 2) NULL,
    [MOVINC]      DECIMAL (19)    NULL,
    [MOVIPV]      INT             NULL,
    [MOVLET]      CHAR (1)        NOT NULL,
    [MOVMAR]      VARCHAR (2)     NULL,
    [MOVNET]      DECIMAL (11, 2) NULL,
    [MOVNETGA]    DECIMAL (11, 2) NULL,
    [MOVNETIB]    DECIMAL (11, 2) NULL,
    [MOVNPV]      INT             NOT NULL,
    [MOVNRO]      INT             NOT NULL,
    [MOVPAG]      VARCHAR (1)     NULL,
    [MOVREF__1]   VARCHAR (20)    NULL,
    [MOVREF__2]   VARCHAR (20)    NULL,
    [MOVREF__3]   VARCHAR (20)    NULL,
    [MOVSAL]      DECIMAL (11, 2) NULL,
    [MOVVTO]      DATETIME        NULL,
    [NOVCON]      INT             NULL,
    [ORIITEM]     CHAR (2)        NULL,
    [REGFEC]      DATETIME        NULL,
    [SERCOD]      DECIMAL (19)    NULL,
    [SISCOD]      VARCHAR (2)     NOT NULL,
    [USUCOD]      VARCHAR (25)    NOT NULL,
    [ZONCOD]      INT             NULL,
    PRIMARY KEY CLUSTERED ([SISCOD] ASC, [CTACOD] ASC, [USUCOD] ASC, [MOVFEC] ASC, [CONCOD] ASC, [MOVNPV] ASC, [MOVNRO] ASC, [MOVCTA] ASC, [MOVLET] ASC),
    UNIQUE NONCLUSTERED ([MOVLET] ASC, [MOVNPV] ASC, [MOVNRO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [_WA_Sys_ctacod_1DB46302]
    ON [dbo].[CCTMOVIM]([CTACOD] ASC);
GO


## 46: cdr.sql
CREATE TABLE [dbo].[cdr] (
    [CDR_ID]              INT            NOT NULL,
    [CONTINUACION]        CHAR (2)       NULL,
    [FECHA]               DATETIME       NULL,
    [HORA]                VARCHAR (5)    NULL,
    [MONTO_DEBITADO]      DECIMAL (7, 2) NULL,
    [NUMERO_DESTINO]      INT            NULL,
    [TRONCAL_DESTINO]     CHAR (51)      NULL,
    [TIPO_DE_DESTINO]     TINYINT        NULL,
    [NUMERO_SRC]          INT            NULL,
    [NUMERO_DE_SECUENCIA] TINYINT        NULL,
    [TIPO_DE_SERVICIO]    TINYINT        NULL,
    [DURACION_DE_TICKET]  INT            NULL,
    PRIMARY KEY CLUSTERED ([CDR_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CDR_X_NUMERO_DESTINO]
    ON [dbo].[cdr]([NUMERO_DESTINO] ASC);
GO
CREATE NONCLUSTERED INDEX [CDR_X_FECHA]
    ON [dbo].[cdr]([FECHA] ASC);
GO
CREATE NONCLUSTERED INDEX [CDR_X_TIPO_DE_DESTINO]
    ON [dbo].[cdr]([TIPO_DE_DESTINO] ASC);
GO
CREATE NONCLUSTERED INDEX [CDR_X_NUMERO_DE_SECUENCIA]
    ON [dbo].[cdr]([NUMERO_DE_SECUENCIA] ASC);
GO


## 47: c_h_m.sql
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


## 48: CIRC.sql
CREATE TABLE [dbo].[CIRC] (
    [CIRC] VARCHAR (3) NOT NULL,
    PRIMARY KEY CLUSTERED ([CIRC] ASC)
);
GO


## 49: clasificacion_clientes_planes_comerciales.sql
CREATE TABLE [dbo].[clasificacion_clientes_planes_comerciales] (
    [CLASIFICACION_PLANES_ID]      INT NOT NULL,
    [CLASIFICACION_DE_CLIENTES_ID] INT NULL,
    [PLAN_COMERCIAL_ID]            INT NULL,
    PRIMARY KEY CLUSTERED ([CLASIFICACION_PLANES_ID] ASC),
    UNIQUE NONCLUSTERED ([CLASIFICACION_DE_CLIENTES_ID] ASC, [PLAN_COMERCIAL_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLA_CCPC_X_PLAN]
    ON [dbo].[clasificacion_clientes_planes_comerciales]([PLAN_COMERCIAL_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CLA_CCPC_X_CLI]
    ON [dbo].[clasificacion_clientes_planes_comerciales]([CLASIFICACION_DE_CLIENTES_ID] ASC);
GO


## 50: Clasificacion_de_clientes.sql
CREATE TABLE [dbo].[Clasificacion_de_clientes] (
    [CLASIFICACION_DE_CLIENTES_ID] INT          NOT NULL,
    [DESCRIPCION]                  VARCHAR (19) NULL,
    [SERVICIO]                     VARCHAR (10) NULL,
    PRIMARY KEY CLUSTERED ([CLASIFICACION_DE_CLIENTES_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC, [SERVICIO] ASC)
);
GO


## 51: CLIAGUA.sql
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


## 52: clientes_a_llamar.sql
CREATE TABLE [dbo].[clientes_a_llamar] (
    [CLIENTE]     VARCHAR (40)   NOT NULL,
    [FACTURA]     VARCHAR (20)   NOT NULL,
    [VENCIMIENTO] VARCHAR (10)   NOT NULL,
    [SALDO]       DECIMAL (9, 2) NOT NULL,
    [INTENTOS]    INT            NOT NULL,
    [RESPUESTA]   INT            NOT NULL,
    [TELEFONO]    VARCHAR (30)   NOT NULL,
    [FECHA]       DATETIME       NOT NULL,
    [id_llamada]  INT            IDENTITY (1, 1) NOT NULL,
    CONSTRAINT [PK_clientes_a_llamar] PRIMARY KEY CLUSTERED ([id_llamada] ASC)
);
GO
CREATE NONCLUSTERED INDEX [_WA_Sys_saldo_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([SALDO] ASC);
GO
CREATE NONCLUSTERED INDEX [_WA_Sys_respuesta_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([RESPUESTA] ASC);
GO
CREATE NONCLUSTERED INDEX [_WA_Sys_factura_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [_WA_Sys_fecha_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([FECHA] ASC);
GO
CREATE NONCLUSTERED INDEX [_WA_Sys_intentos_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([INTENTOS] ASC);
GO
CREATE NONCLUSTERED INDEX [_WA_Sys_cliente_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([CLIENTE] ASC);
GO
CREATE NONCLUSTERED INDEX [_WA_Sys_vencimiento_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([VENCIMIENTO] ASC);
GO
CREATE NONCLUSTERED INDEX [_WA_Sys_telefono_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([TELEFONO] ASC);
GO


## 53: Clientes_comentarios.sql
CREATE TABLE [dbo].[Clientes_comentarios] (
    [CLIENTES_COMENTARIOS_ID] INT           NOT NULL,
    [CLIENTE_ID]              INT           NULL,
    [CLIENTE_SERVICIO_ID]     INT           NULL,
    [COMENTARIO]              VARCHAR (500) NULL,
    [FECHA]                   DATETIME      NULL,
    [operador]                VARCHAR (50)  NULL,
    PRIMARY KEY CLUSTERED ([CLIENTES_COMENTARIOS_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [FECHA] ASC, [CLIENTES_COMENTARIOS_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [FECHA] ASC, [CLIENTES_COMENTARIOS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI3_CLIENTES_COMENTARIOS_ID_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Clientes_comentarios]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI3_CLIENTES_COMENTARIOS_ID_X_CLIENTE_ID]
    ON [dbo].[Clientes_comentarios]([CLIENTE_ID] ASC);
GO


## 54: clientes_historico_movimientos.sql
CREATE TABLE [dbo].[clientes_historico_movimientos] (
    [ID_MOV]              INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [SERVICIO]            VARCHAR (98)  NULL,
    [FECHA_MOVIMIENTO_S]  DATETIME      NULL,
    [DESCRIPCION]         VARCHAR (89)  NULL,
    [nombre]              VARCHAR (150) NULL,
    [calle]               VARCHAR (150) NULL,
    [numero_calle]        INT           NULL,
    PRIMARY KEY CLUSTERED ([ID_MOV] ASC)
);
GO


## 55: Clientes_historico.sql
CREATE TABLE [dbo].[Clientes_historico] (
    [CLIENTES_HISTORICO_ID]         INT          NOT NULL,
    [TIPO_MODIFICACION]             VARCHAR (40) NULL,
    [FECHA_MODIFICACION]            DATETIME     NULL,
    [CLIENTE_ID]                    INT          NULL,
    [NUMERADOR_HIJOS]               INT          NULL,
    [CODIGO_CALLE]                  INT          NULL,
    [NUMERO]                        INT          NULL,
    [PISO]                          TINYINT      NULL,
    [SECTOR]                        VARCHAR (2)  NULL,
    [TORRE]                         VARCHAR (3)  NULL,
    [CASA]                          INT          NULL,
    [BARRIO]                        VARCHAR (15) NULL,
    [Block_titular]                 VARCHAR (2)  NULL,
    [DTO]                           VARCHAR (3)  NULL,
    [LOCALIDAD_ID]                  INT          NULL,
    [CODIGO_POSTAL]                 VARCHAR (10) NULL,
    [FISICA_JURIDICA]               VARCHAR (1)  NULL,
    [APELLIDO_NOMBRES_RAZON_SOCIAL] VARCHAR (40) NULL,
    [APODERADO]                     VARCHAR (40) NULL,
    [TIPO_DOC_APODERADO]            VARCHAR (4)  NULL,
    [NUMERO_DOC_APODERADO]          VARCHAR (19) NULL,
    [TE_TITULAR]                    VARCHAR (15) NULL,
    [CLASIFICACION_IVA_ID]          INT          NULL,
    [PIB]                           VARCHAR (2)  NULL,
    [CLAVE]                         TINYINT      NULL,
    [TIPO_DOC]                      VARCHAR (4)  NULL,
    [NUMERO_DOC]                    VARCHAR (19) NULL,
    [DIGITO_VERIFICADOR]            TINYINT      NULL,
    [DOCUMENTO]                     VARCHAR (20) NULL,
    [FECHA_INGRESO_AL_SISTEMA]      DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([CLIENTES_HISTORICO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_ID] ASC, [CLIENTES_HISTORICO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI4_CLIENTES_X_CLIENTE_ID]
    ON [dbo].[Clientes_historico]([CLIENTE_ID] ASC);
GO


## 56: clientes_para_avisos1.sql
CREATE TABLE [dbo].[clientes_para_avisos1] (
    [ID]                     INT          NOT NULL,
    [CLIENTE_SERVICIO_ID]    INT          NULL,
    [EMAIL]                  VARCHAR (89) NULL,
    [MARCA]                  TINYINT      NULL,
    [MARCA_EMAIL_SECUNDARIO] TINYINT      NULL,
    [FECHA_DE_ENVIO]         INT          NULL,
    [HORA_DE_ENVIO]          INT          NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 57: clientes_para_avisos.sql
CREATE TABLE [dbo].[clientes_para_avisos] (
    [ID]                     INT          NOT NULL,
    [CLIENTE_SERVICIO_ID]    INT          NULL,
    [EMAIL]                  VARCHAR (89) NULL,
    [MARCA]                  TINYINT      NULL,
    [MARCA_EMAIL_SECUNDARIO] TINYINT      NULL,
    [FECHA_DE_ENVIO]         INT          NULL,
    [HORA_DE_ENVIO]          INT          NULL,
    [SERVICIO]               VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 58: clientes_para_qr.sql
CREATE TABLE [dbo].[clientes_para_qr] (
    [CLIENTE]                VARCHAR (60) NULL,
    [DOCUMENTO]              CHAR (20)    NULL,
    [ID]                     INT          NOT NULL,
    [CLIENTE_SERVICIO_ID]    INT          NULL,
    [EMAIL]                  VARCHAR (89) NULL,
    [MARCA]                  TINYINT      NULL,
    [MARCA_EMAIL_SECUNDARIO] TINYINT      NULL,
    [FECHA_DE_ENVIO]         INT          NULL,
    [HORA_DE_ENVIO]          INT          NULL,
    [SERVICIO]               VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 59: Cliente.sql
CREATE TABLE [dbo].[Cliente] (
    [CLIENTE_ID]          INT          NOT NULL,
    [NOMBRE]              VARCHAR (60) NULL,
    [TIPO_DE_DOCUMENTO]   VARCHAR (4)  NULL,
    [NUMERO_DE_DOCUMENTO] DECIMAL (15) NULL,
    PRIMARY KEY CLUSTERED ([CLIENTE_ID] ASC),
    UNIQUE NONCLUSTERED ([NOMBRE] ASC, [CLIENTE_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_DE_DOCUMENTO] ASC, [TIPO_DE_DOCUMENTO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI1_POR_NOMBRE_SOLO]
    ON [dbo].[Cliente]([NOMBRE] ASC);
GO


## 60: Clientes_reserva.sql
CREATE TABLE [dbo].[Clientes_reserva] (
    [CLIENTE_SERVICIO_ID]  INT           NOT NULL,
    [CODIGO_CALLE]         INT           NULL,
    [NUMERO]               INT           NULL,
    [ENTRE_CODIGO_CALLE_1] INT           NULL,
    [ENTRE_CODIGO_CALLE_2] INT           NULL,
    [SERVICIO]             VARCHAR (10)  NULL,
    [NUMERO_TELEFONO]      INT           NULL,
    [DOCUMENTO]            VARCHAR (20)  NULL,
    [FECHA_SOLICITUD]      DATETIME      NULL,
    [ESTADO]               TINYINT       NULL,
    [NUMERO_SOLICITUD]     INT           NULL,
    [VENDEDOR]             INT           NULL,
    [OBSERVACIONES]        VARCHAR (300) NULL,
    [NOMBRE_APELLIDO]      VARCHAR (49)  NULL,
    [HORA]                 VARCHAR (19)  NULL,
    [Telefono]             VARCHAR (49)  NULL,
    [Croquis]              VARCHAR (10)  NULL,
    PRIMARY KEY CLUSTERED ([CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([ESTADO] ASC, [CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_CALLE] ASC, [NUMERO] ASC, [CLIENTE_SERVICIO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI15_CLIENTES_SERVICIOS_X_DOCUMENTO]
    ON [dbo].[Clientes_reserva]([DOCUMENTO] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI15_CLIENTE_SERVICIO_X_NUMERO_TELEFONICO]
    ON [dbo].[Clientes_reserva]([NUMERO_TELEFONO] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI15_CLIENTES_SERVICIOS_X_CALLE_DOMICILIO]
    ON [dbo].[Clientes_reserva]([CODIGO_CALLE] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI15_X_SERVICIO]
    ON [dbo].[Clientes_reserva]([SERVICIO] ASC);
GO


## 61: Clientes_servicios_a_facturar.sql
CREATE TABLE [dbo].[Clientes_servicios_a_facturar] (
    [ID]                  INT          NOT NULL,
    [RUTA]                TINYINT      NULL,
    [CODIGO_CALLE_P]      INT          NULL,
    [ORDEN]               INT          NULL,
    [NUMERO_P]            INT          NULL,
    [LOCALIDAD_ID_P]      INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [PERIODO_ID]          INT          NULL,
    [SERVICIOS]           VARCHAR (19) NULL,
    [FECHA_HABILITACION]  DATETIME     NULL,
    [FECHA_PERIODO_DESDE] DATETIME     NULL,
    [FECHA_PERIODO_HASTA] DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PERIODO_ID] ASC, [SERVICIOS] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI2_POR_PERIODO_ID_Y_SERVICIOS]
    ON [dbo].[Clientes_servicios_a_facturar]([PERIODO_ID] ASC, [SERVICIOS] ASC, [ORDEN] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI2_CLIENTES_A_FACTURAR_POR_PERIODO_ID]
    ON [dbo].[Clientes_servicios_a_facturar]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI2_X_CALLE_DES]
    ON [dbo].[Clientes_servicios_a_facturar]([CODIGO_CALLE_P] ASC, [NUMERO_P] DESC);
GO
CREATE NONCLUSTERED INDEX [CLI2_X_CALLE_ASC]
    ON [dbo].[Clientes_servicios_a_facturar]([CODIGO_CALLE_P] ASC, [NUMERO_P] ASC);
GO


## 62: clientes_servicios_agrupados.sql
CREATE TABLE [dbo].[clientes_servicios_agrupados] (
    [CLIENTE_ID]                    INT           NULL,
    [CLIENTE_SERVICIO_AGRUPADO_ID]  INT           NOT NULL,
    [NUMERADOR_HIJOS]               INT           NULL,
    [CODIGO_CALLE]                  INT           NULL,
    [NOMBRE_CALLE]                  VARCHAR (119) NULL,
    [NUMERO]                        INT           NULL,
    [PISO]                          TINYINT       NULL,
    [SECTOR]                        VARCHAR (2)   NULL,
    [TORRE]                         VARCHAR (3)   NULL,
    [CASA]                          INT           NULL,
    [BARRIO]                        VARCHAR (15)  NULL,
    [Block_titular]                 VARCHAR (2)   NULL,
    [DTO]                           VARCHAR (3)   NULL,
    [LOCALIDAD_ID]                  INT           NULL,
    [CODIGO_POSTAL]                 VARCHAR (10)  NULL,
    [FISICA_JURIDICA]               VARCHAR (1)   NULL,
    [APELLIDO_NOMBRES_RAZON_SOCIAL] VARCHAR (40)  NULL,
    [APODERADO]                     VARCHAR (40)  NULL,
    [TIPO_DOC_APODERADO]            VARCHAR (4)   NULL,
    [NUMERO_DOC_APODERADO]          VARCHAR (19)  NULL,
    [TE_TITULAR]                    VARCHAR (15)  NULL,
    [CLASIFICACION_IVA_ID]          INT           NULL,
    [PIB]                           VARCHAR (2)   NULL,
    [CLAVE]                         TINYINT       NULL,
    [TIPO_DOC]                      VARCHAR (4)   NULL,
    [NUMERO_DOC]                    VARCHAR (19)  NULL,
    [DIGITO_VERIFICADOR]            TINYINT       NULL,
    [DOCUMENTO]                     VARCHAR (20)  NULL,
    [FECHA_INGRESO_AL_SISTEMA]      DATETIME      NULL,
    [TIPO_SERVICIOS]                VARCHAR (19)  NULL,
    [CANTIDAD_DE_SERVICIOS]         INT           NULL,
    [EMAIL]                         VARCHAR (89)  NULL,
    [EMAIL_SECUNDARIO]              VARCHAR (89)  NULL,
    [CIS]                           VARCHAR (15)  NULL,
    PRIMARY KEY CLUSTERED ([CLIENTE_SERVICIO_AGRUPADO_ID] ASC)
);
GO


## 63: Clientes_servicios_debito_automatico.sql
CREATE TABLE [dbo].[Clientes_servicios_debito_automatico] (
    [CLIENTE_ID]                              INT          NULL,
    [CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_ID] INT          NOT NULL,
    [CLIENTE_SERVICIO_ID]                     INT          NULL,
    [BANCO]                                   INT          NULL,
    [SUCURSAL]                                INT          NULL,
    [CUENTA]                                  VARCHAR (19) NULL,
    [TIPO_DEBITO]                             INT          NULL,
    [CBU_1]                                   DECIMAL (9)  NULL,
    [CBU_2]                                   DECIMAL (15) NULL,
    [tipo_cuenta]                             TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [DDA_CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_X_CLIENTE_ID]
    ON [dbo].[Clientes_servicios_debito_automatico]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [DDA_CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_X_CLIENTE_SERVICIOS_ID]
    ON [dbo].[Clientes_servicios_debito_automatico]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [DDA_CLIENTES_SERVICIOS_DEBITO_AUTOMATICO_X_BANCO]
    ON [dbo].[Clientes_servicios_debito_automatico]([BANCO] ASC);
GO


## 64: Clientes_servicios_Historico1.sql
CREATE TABLE [dbo].[Clientes_servicios_Historico1] (
    [CLIENTES_SERVICIO_HISTORICO_ID] INT            NOT NULL,
    [NOMBRE_FANTASIA]                VARCHAR (55)   NULL,
    [CLIENTE_ID]                     INT            NULL,
    [CLIENTE_SERVICIO_ID]            INT            NULL,
    [NUMERADOR_HIJOS]                INT            NULL,
    [CLASIFICACION_DE_CLIENTES_ID]   INT            NULL,
    [TIPO_MODIFICACION]              VARCHAR (40)   NULL,
    [FECHA_MODIFICACION]             DATETIME       NULL,
    [CODIGO_CALLE]                   INT            NULL,
    [NUMERO]                         INT            NULL,
    [SECTOR]                         VARCHAR (2)    NULL,
    [BLOCK]                          VARCHAR (2)    NULL,
    [TORRE]                          VARCHAR (3)    NULL,
    [PISO]                           TINYINT        NULL,
    [DTO]                            VARCHAR (3)    NULL,
    [CASA]                           INT            NULL,
    [BARRIO]                         VARCHAR (15)   NULL,
    [LOCALIDAD_ID]                   INT            NULL,
    [CODIGO_POSTAL]                  VARCHAR (10)   NULL,
    [ENTRE_CODIGO_CALLE_1]           INT            NULL,
    [ENTRE_CODIGO_CALLE_2]           INT            NULL,
    [CODIGO_CALLE_P]                 INT            NULL,
    [CALLE_POSTAL]                   VARCHAR (40)   NULL,
    [NUMERO_P]                       INT            NULL,
    [SECTOR_P]                       VARCHAR (2)    NULL,
    [BLOCK_P]                        VARCHAR (2)    NULL,
    [TORRE_P]                        VARCHAR (3)    NULL,
    [PISO_P]                         TINYINT        NULL,
    [DTO_P]                          VARCHAR (3)    NULL,
    [CASA_P]                         INT            NULL,
    [BARRIO_P]                       VARCHAR (15)   NULL,
    [LOCALIDAD_ID_P]                 INT            NULL,
    [CODIGO_POSTAL_P]                VARCHAR (10)   NULL,
    [CLASIFICACION_SERVICIO]         INT            NULL,
    [SERVICIO]                       VARCHAR (10)   NULL,
    [NUMERO_TELEFONO]                INT            NULL,
    [PARTIDA]                        INT            NULL,
    [METROS_CUADRADOS_VIVIENDA]      DECIMAL (7, 2) NULL,
    [TIPO_DOC]                       VARCHAR (4)    NULL,
    [CLAVE]                          TINYINT        NULL,
    [NUMERO_DOC]                     VARCHAR (19)   NULL,
    [DIGITO_VERIFICADOR]             TINYINT        NULL,
    [DOCUMENTO]                      VARCHAR (20)   NULL,
    [CLASIFICACION_IVA_ID]           INT            NULL,
    [PIB]                            VARCHAR (2)    NULL,
    [PERCEPCION_ID]                  TINYINT        NULL,
    [FECHA_SUSPENCION]               DATETIME       NULL,
    [FECHA_TELECOBRANZA]             DATETIME       NULL,
    [FECHA_INTIMACION]               DATETIME       NULL,
    [FECHA_INSTALACION]              DATETIME       NULL,
    [FECHA_SOLICITUD]                DATETIME       NULL,
    [FECHA_HABILITACION]             DATETIME       NULL,
    [FECHA_BAJA]                     DATETIME       NULL,
    [FECHA_INGRESO_AL_SISTEMA]       DATETIME       NULL,
    [PLAN_COMERCIAL]                 INT            NULL,
    [ESTADO]                         TINYINT        NULL,
    [NUMERO_SOLICITUD]               INT            NULL,
    [CANTIDAD_DE_FACTURAS_ADEUDADAS] INT            NULL,
    [INTIMA]                         TINYINT        NULL,
    [VENDEDOR]                       INT            NULL,
    [FIGURACION_EN_GUIA]             VARCHAR (2)    NULL,
    [PERTENECE_A]                    VARCHAR (40)   NULL,
    [CUADRILLA]                      VARCHAR (20)   NULL,
    [OBSERVACIONES]                  VARCHAR (300)  NULL,
    [MOTIVO]                         VARCHAR (150)  NULL,
    [NO_GENERA_INTERESES]            TINYINT        NULL,
    [MODEM_ID]                       INT            NULL,
    [MODEM2_ID]                      INT            NULL,
    [TELEFONO_ID]                    INT            NULL,
    [PAR_ID]                         INT            NULL,
    [PUERTOS_ID]                     INT            NULL,
    [ORDEN_INSTALACION]              INT            NULL,
    [TIPO_CONEXION]                  VARCHAR (7)    NULL,
    [USER_NAME]                      VARCHAR (20)   NULL,
    [PASSWORD]                       VARCHAR (8)    NULL,
    [IP_1]                           TINYINT        NULL,
    [IP_2]                           TINYINT        NULL,
    [IP_3]                           TINYINT        NULL,
    [IP_4]                           TINYINT        NULL,
    [BAJADA]                         TINYINT        NULL,
    [F_E_ID]                         INT            NULL,
    [CANTIDAD_DE_BOCAS]              TINYINT        NULL,
    [CANTIDAD_DE_BOCAS_ADICIONALES]  TINYINT        NULL,
    [CANTIDAD_DE_BOCAS_EXISTENTES]   TINYINT        NULL,
    [HOUSING]                        TINYINT        NULL,
    [HOSTING]                        TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([CLIENTES_SERVICIO_HISTORICO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [CLIENTES_SERVICIO_HISTORICO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI131_CLIENTES_S_H_X_CLIENTE_ID]
    ON [dbo].[Clientes_servicios_Historico1]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI131_CLIENTES_S_H_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Clientes_servicios_Historico1]([CLIENTE_SERVICIO_ID] ASC);
GO


## 65: Clientes_servicios_Historico.sql
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


## 66: Clientes_servicios_internet_a_facturar.sql
CREATE TABLE [dbo].[Clientes_servicios_internet_a_facturar] (
    [ID]                  INT          NOT NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [PERIODO_ID]          INT          NULL,
    [SERVICIOS]           VARCHAR (19) NULL,
    [FECHA_HABILITACION]  DATETIME     NULL,
    [FECHA_PERIODO_DESDE] DATETIME     NULL,
    [FECHA_PERIODO_HASTA] DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PERIODO_ID] ASC, [SERVICIOS] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI2_CLIENTES_A_FACTURAR_POR_PERIODO_ID]
    ON [dbo].[Clientes_servicios_internet_a_facturar]([PERIODO_ID] ASC);
GO


## 67: Clientes_servicios_modificaciones.sql
CREATE TABLE [dbo].[Clientes_servicios_modificaciones] (
    [MODIFICACIONES_ID]             INT           NOT NULL,
    [TIPO_DE_MODIFICACION]          TINYINT       NULL,
    [CLIENTE_ID]                    INT           NULL,
    [CLIENTE_SERVICIO_ID]           INT           NULL,
    [CODIGO_CALLE]                  INT           NULL,
    [NUMERO]                        INT           NULL,
    [SECTOR]                        VARCHAR (2)   NULL,
    [BLOCK]                         VARCHAR (2)   NULL,
    [TORRE]                         VARCHAR (3)   NULL,
    [PISO]                          TINYINT       NULL,
    [DTO]                           VARCHAR (3)   NULL,
    [CASA]                          INT           NULL,
    [BARRIO]                        VARCHAR (15)  NULL,
    [LOCALIDAD_ID]                  INT           NULL,
    [CODIGO_POSTAL]                 VARCHAR (10)  NULL,
    [ENTRE_CODIGO_CALLE_1]          INT           NULL,
    [ENTRE_CODIGO_CALLE_2]          INT           NULL,
    [SERVICIO]                      VARCHAR (10)  NULL,
    [NUMERO_TELEFONO]               INT           NULL,
    [FECHA_SOLICITUD_CAMBIO]        DATETIME      NULL,
    [FECHA_INGRESO_AL_SISTEMA]      DATETIME      NULL,
    [PLAN_COMERCIAL]                INT           NULL,
    [ESTADO]                        TINYINT       NULL,
    [NUMERO_SOLICITUD]              INT           NULL,
    [OBSERVACIONES]                 VARCHAR (300) NULL,
    [TIPO_CONEXION]                 VARCHAR (20)  NULL,
    [F_E_I]                         INT           NULL,
    [PAR_ID]                        INT           NULL,
    [PUERTOS_ID]                    INT           NULL,
    [CANTIDAD_DE_BOCAS]             INT           NULL,
    [FIGURACION_EN_GUIA]            VARCHAR (3)   NULL,
    [MODEM_ID]                      INT           NULL,
    [TELEFONO_ID]                   INT           NULL,
    [CLASIFICACION_DE_SERVICIO]     INT           NULL,
    [factura]                       TINYINT       NULL,
    [cantidad_de_bocas_adicionales] TINYINT       NULL,
    [cantidad_de_bocas_existentes]  TINYINT       NULL,
    [num_factura]                   VARCHAR (50)  NULL,
    [tipo]                          VARCHAR (50)  NULL,
    [susp_masiva]                   INT           NULL,
    [usuario_id]                    TINYINT       NULL,
    [fecha_mod]                     DATETIME      NULL,
    [devuelve_m]                    INT           NULL,
    [devuelve_c]                    INT           NULL,
    [devuelve_t]                    INT           NULL,
    [comentarios]                   VARCHAR (200) NULL,
    [cpe_id]                        INT           NULL,
    [marca]                         INT           NULL,
    [modem_o_id]                    INT           NULL,
    [cpe_o_id]                      INT           NULL,
    [ata_o_id]                      INT           NULL,
    [cumplido]                      TINYINT       NULL,
    [cumplido_1]                    INT           NULL,
    [impreso]                       INT           NULL,
    [tecnica]                       INT           NULL,
    [marca_item]                    TINYINT       NULL,
    [marca_cambio_titularidad]      TINYINT       NULL,
    [fecha_cambio_estado]           DATETIME      NULL,
    [hora_cambio_estado]            INT           NULL,
    [habilitado_con_deuda]          TINYINT       NULL,
    [cliente_anterior]              VARCHAR (90)  NULL,
    [cliente_nuevo]                 VARCHAR (90)  NULL,
    [cis]                           VARCHAR (15)  NULL,
    [generacion_listado_cortes]     INT           NULL,
    PRIMARY KEY CLUSTERED ([MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([ESTADO] ASC, [CLIENTE_SERVICIO_ID] ASC, [MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([FECHA_SOLICITUD_CAMBIO] ASC, [CLIENTE_SERVICIO_ID] ASC, [MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_CALLE] ASC, [NUMERO] ASC, [PISO] ASC, [SECTOR] ASC, [TORRE] ASC, [CASA] ASC, [BARRIO] ASC, [BLOCK] ASC, [DTO] ASC, [CLIENTE_SERVICIO_ID] ASC, [MODIFICACIONES_ID] ASC),
    CONSTRAINT [UQ__Clientes_servici__086B34A6] UNIQUE NONCLUSTERED ([CLIENTE_ID] ASC, [CLIENTE_SERVICIO_ID] ASC, [TIPO_DE_MODIFICACION] ASC, [MODIFICACIONES_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI12_CLIENTES_SERVICIOS_X_CALLE_DOMICILIO]
    ON [dbo].[Clientes_servicios_modificaciones]([CODIGO_CALLE] ASC);
GO
CREATE NONCLUSTERED INDEX [x_tipo_de_modificacion_y_estado]
    ON [dbo].[Clientes_servicios_modificaciones]([TIPO_DE_MODIFICACION] ASC, [ESTADO] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI12_CLIENTES_SERVICIOS_X_PLAN_COMERCIAL_ID]
    ON [dbo].[Clientes_servicios_modificaciones]([PLAN_COMERCIAL] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio]
    ON [dbo].[Clientes_servicios_modificaciones]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI12_CLIENTES_SERVICIOS_X_LOCALIDAD_ID]
    ON [dbo].[Clientes_servicios_modificaciones]([LOCALIDAD_ID] ASC);
GO



## 69: clientes_sin_items.sql
CREATE TABLE [dbo].[clientes_sin_items] (
    [ID]                  INT NOT NULL,
    [CLIENTE_ID]          INT NULL,
    [CLIENTE_SERVICIO_ID] INT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO





## 71: clientes_ventas.sql
CREATE TABLE [dbo].[clientes_ventas] (
    [CLIENTE_ID] INT            NOT NULL,
    [TIPO_DOC]   VARCHAR (19)   NULL,
    [NRO_DOC]    VARCHAR (19)   NULL,
    [CUIT_1]     VARCHAR (19)   NULL,
    [IB]         DECIMAL (9, 2) NULL,
    [PORCENTAJE] DECIMAL (7, 2) NULL,
    PRIMARY KEY CLUSTERED ([CLIENTE_ID] ASC)
);
GO


## 72: Coberturas_de_cajas.sql
CREATE TABLE [dbo].[Coberturas_de_cajas] (
    [COBERTURAS_DE_CAJAS_ID] INT         NOT NULL,
    [CAJAS_ID]               INT         NULL,
    [CODIGO_CALLE]           INT         NULL,
    [DESDE]                  INT         NULL,
    [HASTA]                  INT         NULL,
    [PIT]                    VARCHAR (1) NULL,
    [fuera_de_zona]          TINYINT     NULL
);
GO


## 73: cobrado.sql
CREATE TABLE [dbo].[cobrado] (
    [ID]             INT            NOT NULL,
    [IMPORTE]        DECIMAL (7, 2) NULL,
    [FECHA]          DATETIME       NULL,
    [RECIBO_ID]      INT            NULL,
    [NUMERO_FACTURA] VARCHAR (49)   NULL,
    [SERVICIO]       VARCHAR (19)   NULL,
    [SIN_CARGO]      TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC1_X_RECIBO]
    ON [dbo].[cobrado]([RECIBO_ID] ASC);
GO


## 74: comentarios_actualizacion_precios.sql
CREATE TABLE [dbo].[comentarios_actualizacion_precios] (
    [ID_COMENTARIO]            INT           NOT NULL,
    [USUARIO]                  VARCHAR (39)  NULL,
    [COMENTARIO]               VARCHAR (149) NULL,
    [FECHA]                    INT           NULL,
    [TIPO_ITEM_ACTUALIZADO_ID] INT           NULL,
    [servicio]                 VARCHAR (20)  NULL,
    PRIMARY KEY CLUSTERED ([ID_COMENTARIO] ASC)
);
GO


## 75: comentarios_clientes.sql
CREATE TABLE [dbo].[comentarios_clientes] (
    [ID_COMENTARIO]       INT           NOT NULL,
    [USUARIO]             VARCHAR (39)  NULL,
    [COMENTARIO]          VARCHAR (149) NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [CLIENTE_ID]          INT           NULL,
    [FECHA]               INT           NULL,
    [cis]                 VARCHAR (12)  NULL,
    PRIMARY KEY CLUSTERED ([ID_COMENTARIO] ASC)
);
GO


## 76: compras_articulos_telefonia.sql
CREATE TABLE [dbo].[compras_articulos_telefonia] (
    [ID_COMPRAS]   INT          NOT NULL,
    [PROVEEDOR_ID] INT          NULL,
    [CANTIDAD]     DECIMAL (13) NULL,
    [FECHA]        DATETIME     NULL,
    [STOCK_ID]     INT          NULL,
    PRIMARY KEY CLUSTERED ([ID_COMPRAS] ASC)
);
GO
CREATE NONCLUSTERED INDEX [COM2_X_PROVEEDORES_ID]
    ON [dbo].[compras_articulos_telefonia]([PROVEEDOR_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [COM2_X_STOCK_ID]
    ON [dbo].[compras_articulos_telefonia]([STOCK_ID] ASC);
GO


## 77: conciliacion_lama_cpp.sql
CREATE TABLE [dbo].[conciliacion_lama_cpp] (
    [CONCILIACION_ID]     INT          NOT NULL,
    [NUMERO_ORIGEN_LAMA]  INT          NULL,
    [NUMERO_ORIGEN_CPP]   INT          NULL,
    [NUMERO_DESTINO_LAMA] VARCHAR (19) NULL,
    [NUMERO_DESTINO_CPP]  VARCHAR (19) NULL,
    [FECHA_LAMA]          DATETIME     NULL,
    [FECHA_CPP]           DATETIME     NULL,
    [HORA_LAMA]           VARCHAR (5)  NULL,
    [HORA_CPP]            VARCHAR (5)  NULL,
    [SEGUNDOS_LAMA]       INT          NULL,
    [SEGUNDOS_CPP]        INT          NULL,
    [CPP_ID]              INT          NULL,
    [LAMA_ID]             INT          NULL,
    [PRESTATARIA_CPP]     TINYINT      NULL,
    [NUM_LOTE]            VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([CONCILIACION_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CPP1111_X_FECHA_CPP]
    ON [dbo].[conciliacion_lama_cpp]([FECHA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1111_X_NUMERO_ORIGEN_CPP]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_ORIGEN_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1111_X_NUMERO_DESTINO_CPP]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_DESTINO_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1111_CONCILIACION_PARA_BROWSE]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_ORIGEN_LAMA] ASC, [FECHA_CPP] ASC, [HORA_LAMA] ASC, [CONCILIACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1111_X_NUMERO_ORIGEN_LAMA]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_ORIGEN_LAMA] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1111_X_FECHA_LAMA]
    ON [dbo].[conciliacion_lama_cpp]([FECHA_LAMA] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1111_X_NUMERO_DESTINO_LAMA]
    ON [dbo].[conciliacion_lama_cpp]([NUMERO_DESTINO_LAMA] ASC);
GO


## 78: configuracion_lama.sql
CREATE TABLE [dbo].[configuracion_lama] (
    [CONFIGURACION_LAMA_ID]   INT NOT NULL,
    [NUMERO_ORIGEN_INICIO]    INT NULL,
    [NUMERO_ORIGEN_A_TOMAR]   INT NULL,
    [NUMERO_DESTINO_INICIO]   INT NULL,
    [NUMERO_DESTINO_A_TOMAR]  INT NULL,
    [FECHA_LAMA_DIA_INICIO]   INT NULL,
    [FECHA_LAMA_DIA_TOMAR]    INT NULL,
    [FECHA_LAMA_MES_INICIO]   INT NULL,
    [FECHA_LAMA_MES_A_TOMAR]  INT NULL,
    [FECHA_LAMA_ANIO_INICIO]  INT NULL,
    [FECHA_LAMA_ANIO_A_TOMAR] INT NULL,
    [HORA_INICIO]             INT NULL,
    [HORA_A_TOMAR]            INT NULL,
    [HORA_MINUTOS_INICIO]     INT NULL,
    [HORA_MINUTOS_A_TOMAR]    INT NULL,
    [HORA_SEGUNDOS_INICIO]    INT NULL,
    [HORA_SEGUNDOS_A_TOMAR]   INT NULL,
    [SEGUNDOS_INICIO]         INT NULL,
    [SEGUNDOS_A_TOMAR]        INT NULL,
    PRIMARY KEY CLUSTERED ([CONFIGURACION_LAMA_ID] ASC)
);
GO


## 79: consulta_comercial.sql
CREATE TABLE [dbo].[consulta_comercial] (
    [ID_CONSULTA_COMERCIAL] INT           NOT NULL,
    [CLIENTE_ID]            INT           NULL,
    [NOMBRE]                VARCHAR (19)  NULL,
    [TELEFONO]              INT           NULL,
    [ESTADO]                TINYINT       NULL,
    [MENSAJE]               VARCHAR (139) NULL,
    PRIMARY KEY CLUSTERED ([ID_CONSULTA_COMERCIAL] ASC)
);
GO


## 80: Consumos_ama.sql
CREATE TABLE [dbo].[Consumos_ama] (
    [CONSUMOS_AMA_ID]     INT             NOT NULL,
    [LLAMADAS]            INT             NULL,
    [PERIODO_ID]          INT             NULL,
    [PERIODO]             VARCHAR (7)     NULL,
    [MINUTOS]             DECIMAL (18, 9) NULL,
    [IMPORTE]             DECIMAL (13, 6) NULL,
    [TIPO]                INT             NULL,
    [DESCRIPCION]         VARCHAR (40)    NULL,
    [IMPORTE_REDUCIDO]    DECIMAL (13, 6) NULL,
    [ITEM_FACTURACION_ID] INT             NULL,
    CONSTRAINT [PK__Consumos_ama__28C2F59F] PRIMARY KEY CLUSTERED ([CONSUMOS_AMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CON21_X_TIPO]
    ON [dbo].[Consumos_ama]([TIPO] ASC);
GO
CREATE NONCLUSTERED INDEX [CON21_X_PERIODO_ID]
    ON [dbo].[Consumos_ama]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CON21_X_TIPO_Y_PERIODO_ID]
    ON [dbo].[Consumos_ama]([TIPO] ASC, [PERIODO_ID] ASC);
GO


## 81: consumos_celulares_historico.sql
CREATE TABLE [dbo].[consumos_celulares_historico] (
    [CONSUMOS_ID]            INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [SERVICIO_ID]            INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA]                  DATETIME        NULL,
    [HORA]                   VARCHAR (19)    NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (7, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE_TIERRA]         DECIMAL (13, 8) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [MINUTOS_NACIONAL]       DECIMAL (11, 2) NULL,
    [SEGUNDOS_NACIONAL]      INT             NULL,
    [IMPORTE_AIRE]           DECIMAL (13, 8) NULL,
    [PERIODO_ID]             INT             NULL,
    PRIMARY KEY CLUSTERED ([CONSUMOS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CON6_X_NUM_DESTINO]
    ON [dbo].[consumos_celulares_historico]([NUMERO_DESTINO] ASC);
GO
CREATE NONCLUSTERED INDEX [CON6_X_SERVICIO_ID]
    ON [dbo].[consumos_celulares_historico]([SERVICIO_ID] ASC);
GO


## 82: consumos_celulares.sql
CREATE TABLE [dbo].[consumos_celulares] (
    [CONSUMOS_ID]            INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [SERVICIO_ID]            INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA]                  DATETIME        NULL,
    [HORA]                   VARCHAR (19)    NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (7, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE_TIERRA]         DECIMAL (13, 8) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [MINUTOS_NACIONAL]       DECIMAL (13, 2) NULL,
    [SEGUNDOS_NACIONAL]      INT             NULL,
    [IMPORTE_AIRE]           DECIMAL (13, 8) NULL,
    PRIMARY KEY CLUSTERED ([CONSUMOS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CON5_X_NUM_DESTINO]
    ON [dbo].[consumos_celulares]([NUMERO_DESTINO] ASC);
GO
CREATE NONCLUSTERED INDEX [CON5_X_SERVICIO_ID]
    ON [dbo].[consumos_celulares]([SERVICIO_ID] ASC);
GO


## 83: consumos_cpp_historico.sql
CREATE TABLE [dbo].[consumos_cpp_historico] (
    [CONSUMOS_TELEFONIA_ID] INT             IDENTITY (1, 1) NOT NULL,
    [ITEM_FACTURACION_ID]   INT             NULL,
    [PERIODO_ID]            INT             NULL,
    [PERIODO]               VARCHAR (7)     NULL,
    [CLIENTE_SERVICIO_ID]   INT             NOT NULL,
    [CLIENTE_ID]            INT             NULL,
    [IMPORTE]               DECIMAL (13, 6) NULL,
    [LLAMADAS]              INT             NULL,
    [DESCRIPCION]           VARCHAR (40)    NULL,
    [FACTURA_ID]            INT             NULL,
    [SEGUNDOS]              INT             NULL,
    [PRESTATARIA_CPP]       TINYINT         NULL,
    CONSTRAINT [PK_consumos_cpp_historico] PRIMARY KEY CLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC),
    CONSTRAINT [IX_consumos_cpp_historico] UNIQUE NONCLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [x_periodo_id]
    ON [dbo].[consumos_cpp_historico]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_id_y_prestataria_cpp_y_periodo_id]
    ON [dbo].[consumos_cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_prestataria_y_periodo_id]
    ON [dbo].[consumos_cpp_historico]([PRESTATARIA_CPP] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_fatura_id]
    ON [dbo].[consumos_cpp_historico]([FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_periodo]
    ON [dbo].[consumos_cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio]
    ON [dbo].[consumos_cpp_historico]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_prestataria_cpp]
    ON [dbo].[consumos_cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);
GO


## 84: consumos_cpp.sql
CREATE TABLE [dbo].[consumos_cpp] (
    [CONSUMOS_TELEFONIA_ID] INT             NOT NULL,
    [ITEM_FACTURACION_ID]   INT             NULL,
    [PERIODO_ID]            INT             NULL,
    [PERIODO]               VARCHAR (7)     NULL,
    [CLIENTE_SERVICIO_ID]   INT             NOT NULL,
    [CLIENTE_ID]            INT             NULL,
    [IMPORTE]               DECIMAL (13, 6) NULL,
    [LLAMADAS]              INT             NULL,
    [DESCRIPCION]           VARCHAR (40)    NULL,
    [FACTURA_ID]            INT             NULL,
    [SEGUNDOS]              INT             NULL,
    [PRESTATARIA_CPP]       TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CON1_CONSUMOS_X_CLIENTE_SERVICIO]
    ON [dbo].[consumos_cpp]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CON1_CONSUMOS_X_CLIENTE_SERVICIO_ID_Y_PRESTATARIA_ID]
    ON [dbo].[consumos_cpp]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CON1_CONSUMOS_CPP_X_CLIENTE_Y_PERIODO]
    ON [dbo].[consumos_cpp]([CLIENTE_SERVICIO_ID] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CON1_CONSUMOS_X_FACTURA_ID]
    ON [dbo].[consumos_cpp]([FACTURA_ID] ASC);
GO


## 85: consumos_telefonia_historico.sql
CREATE TABLE [dbo].[consumos_telefonia_historico] (
    [CONSUMOS_TELEFONIA_ID]     INT             NOT NULL,
    [ITEM_FACTURACION_ID]       INT             NULL,
    [PLAN_TAFIRA_ID]            INT             NULL,
    [PTFO]                      INT             NULL,
    [PERIODO_ID]                INT             NULL,
    [PERIODO]                   VARCHAR (7)     NULL,
    [CLIENTE_ID]                INT             NULL,
    [MINUTOS]                   DECIMAL (11, 6) NULL,
    [MINUTOS_REDUCIDO]          DECIMAL (11, 6) NULL,
    [IMPORTE]                   DECIMAL (13, 6) NULL,
    [IMPORTE_SIN_DESC]          DECIMAL (13, 6) NULL,
    [IMPORTE_REDUCIDO]          DECIMAL (13, 6) NULL,
    [IMPORTE_REDUCIDO_SIN_DESC] DECIMAL (13, 6) NULL,
    [PTFO_REDUCIDO]             INT             NULL,
    [LLAMADAS_NORMAL]           INT             NULL,
    [LLAMADAS_REDUCIDAS]        INT             NULL,
    [TIPO]                      INT             NULL,
    [DESCRIPCION]               VARCHAR (40)    NULL,
    [NUMERO_TELEFONO]           INT             NULL,
    [PLAN_COMERCIAL_ID]         INT             NULL,
    [FACTURA_ID]                INT             NULL,
    CONSTRAINT [PK_consumos_telefonia_historico] PRIMARY KEY CLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC),
    CONSTRAINT [IX_consumos_telefonia_historico] UNIQUE NONCLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_id_y_tipo_y_plan_tarifa]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [TIPO] ASC, [PLAN_TAFIRA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [con_consumos_telefonia_x_cliente_servicio]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_tipo_y_periodo_id]
    ON [dbo].[consumos_telefonia_historico]([TIPO] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [consumos_telefonia_x_numero_telefono]
    ON [dbo].[consumos_telefonia_historico]([NUMERO_TELEFONO] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_tipo_y_plan_periodo_id]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [TIPO] ASC, [PLAN_TAFIRA_ID] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [consumos_telefon_x_cliente_y_periodo]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_id_y_tipo]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [TIPO] ASC);
GO
CREATE NONCLUSTERED INDEX [x_periodo_id]
    ON [dbo].[consumos_telefonia_historico]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [consumos_telefonia_x_plan_comercial_id]
    ON [dbo].[consumos_telefonia_historico]([PLAN_COMERCIAL_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_tipo_y_periodo_id]
    ON [dbo].[consumos_telefonia_historico]([CLIENTE_ID] ASC, [TIPO] ASC, [PERIODO_ID] ASC);
GO


## 86: Consumos_telefonia.sql
CREATE TABLE [dbo].[Consumos_telefonia] (
    [CONSUMOS_TELEFONIA_ID]     INT             NOT NULL,
    [ITEM_FACTURACION_ID]       INT             NULL,
    [PLAN_TAFIRA_ID]            INT             NULL,
    [PTFO]                      INT             NULL,
    [PERIODO_ID]                INT             NULL,
    [PERIODO]                   VARCHAR (7)     NULL,
    [CLIENTE_ID]                INT             NOT NULL,
    [MINUTOS]                   DECIMAL (11, 6) NULL,
    [MINUTOS_REDUCIDO]          DECIMAL (11, 6) NULL,
    [IMPORTE]                   DECIMAL (13, 6) NULL,
    [IMPORTE_SIN_DESC]          DECIMAL (13, 6) NULL,
    [IMPORTE_REDUCIDO]          DECIMAL (13, 6) NULL,
    [IMPORTE_REDUCIDO_SIN_DESC] DECIMAL (13, 6) NULL,
    [PTFO_REDUCIDO]             INT             NULL,
    [LLAMADAS_NORMAL]           INT             NULL,
    [LLAMADAS_REDUCIDAS]        INT             NULL,
    [TIPO]                      INT             NULL,
    [DESCRIPCION]               VARCHAR (40)    NULL,
    [NUMERO_TELEFONO]           INT             NULL,
    [PLAN_COMERCIAL_ID]         INT             NULL,
    [FACTURA_ID]                INT             NULL,
    PRIMARY KEY CLUSTERED ([CONSUMOS_TELEFONIA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CON_CONSUMOS_TELEFONIA_X_NUMERO_TELEFONO]
    ON [dbo].[Consumos_telefonia]([NUMERO_TELEFONO] ASC);
GO
CREATE NONCLUSTERED INDEX [CON_X_CLIENTE_SERVICIO_ID_Y_TIPO]
    ON [dbo].[Consumos_telefonia]([CLIENTE_ID] ASC, [TIPO] ASC);
GO
CREATE NONCLUSTERED INDEX [CON_CON_CONSUMOS_TELEFONIA_X_CLIENTE_SERVICIO]
    ON [dbo].[Consumos_telefonia]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CON_X_CLIENTE_Y_TIPO_Y_PLAN_TARIFA]
    ON [dbo].[Consumos_telefonia]([CLIENTE_ID] ASC, [TIPO] ASC, [PLAN_TAFIRA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CON_CONSUMOS_TELEFONIA_X_PLAN_COMERCIAL_ID]
    ON [dbo].[Consumos_telefonia]([PLAN_COMERCIAL_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CON_CONSUMOS_TELEFON_X_CLIENTE_Y_PERIODO]
    ON [dbo].[Consumos_telefonia]([CLIENTE_ID] ASC, [PERIODO_ID] ASC);
GO


## 87: control_items.sql
CREATE TABLE [dbo].[control_items] (
    [CONTROL_DE_ITEMS_ID] INT          NOT NULL,
    [ITEM_ID]             INT          NULL,
    [ITEM2_ID]            INT          NULL,
    [TIPO]                TINYINT      NULL,
    [CONTROL]             VARCHAR (49) NULL,
    PRIMARY KEY CLUSTERED ([CONTROL_DE_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([ITEM_ID] ASC, [ITEM2_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CON4_X_ITEM2]
    ON [dbo].[control_items]([ITEM2_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CON4_X_ITEM]
    ON [dbo].[control_items]([ITEM_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CON4_X_TIPO]
    ON [dbo].[control_items]([TIPO] ASC);
GO
CREATE NONCLUSTERED INDEX [CON4_X_CONTROL_Y_ITEM]
    ON [dbo].[control_items]([CONTROL] ASC, [ITEM_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CON4_X_CONTROL]
    ON [dbo].[control_items]([CONTROL] ASC);
GO
CREATE NONCLUSTERED INDEX [CON4_X_CONTROL_ITEM2]
    ON [dbo].[control_items]([CONTROL] ASC, [ITEM2_ID] ASC);
GO


## 88: coordenadas_cajas.sql
CREATE TABLE [dbo].[coordenadas_cajas] (
    [caja_id] INT             NOT NULL,
    [x]       DECIMAL (18, 7) NULL,
    [y]       DECIMAL (18, 7) NULL,
    CONSTRAINT [PK_coordenadas_cajas] PRIMARY KEY CLUSTERED ([caja_id] ASC)
);
GO


## 89: cpe.sql
CREATE TABLE [dbo].[cpe] (
    [CPE_ID]              INT          NOT NULL,
    [MARCA]               VARCHAR (49) NULL,
    [MODELO]              VARCHAR (49) NULL,
    [SERIE]               VARCHAR (49) NULL,
    [UTILIZADO]           TINYINT      NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [IP]                  VARCHAR (19) NULL,
    [USUARIO]             VARCHAR (30) NULL,
    [PASSWORD]            VARCHAR (30) NULL,
    [BAJA]                TINYINT      NULL,
    [HOSTNAME]            VARCHAR (49) NULL,
    [stock_id]            INT          NULL,
    [estado_modem_id]     INT          NULL,
    [fecha_compra]        DATETIME     NULL,
    [proveedor_id]        INT          NULL,
    [otro]                INT          NULL,
    [tipo]                INT          NULL,
    [comentario]          VARCHAR (90) NULL,
    [cis]                 VARCHAR (15) NULL,
    PRIMARY KEY CLUSTERED ([CPE_ID] ASC),
    UNIQUE NONCLUSTERED ([SERIE] ASC, [CPE_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MOD1_CPE_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpe]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [UQ__cpe__B55A243871C7C670]
    ON [dbo].[cpe]([SERIE] ASC);
GO


## 90: cpp_historico1.sql
CREATE TABLE [dbo].[cpp_historico1] (
    [CPP_ID]                 INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA_CPP]              DATETIME        NULL,
    [HORA]                   VARCHAR (8)     NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (9, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE]                DECIMAL (11, 3) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [REDUCIDO]               TINYINT         NULL,
    [ID]                     INT             NULL,
    [CLIENTE_SERVICIO_ID]    INT             NULL,
    [PLAN_COMERCIAL_ID]      INT             NULL,
    [CLAVE]                  TINYINT         NULL,
    [TIPO]                   INT             NULL,
    [CODIGO]                 VARCHAR (6)     NULL,
    [PRESTATARIA_CPP]        TINYINT         NULL,
    [NUM_LOTE]               VARCHAR (50)    NULL,
    [CONCILIACION]           TINYINT         NULL,
    [PERIODO_ID]             INT             NULL,
    PRIMARY KEY CLUSTERED ([CPP_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_CPP] ASC, [HORA] ASC, [CPP_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CPP113_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpp_historico1]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP113_CPP_X_CLIENTE_SERVICIO_Y_PRESTATARIA]
    ON [dbo].[cpp_historico1]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP113_X_TODO]
    ON [dbo].[cpp_historico1]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP113_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[cpp_historico1]([CLIENTE_SERVICIO_ID] ASC, [FECHA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP113_X_NUMERO]
    ON [dbo].[cpp_historico1]([NUMERO_ORIGEN] ASC);
GO


## 91: cpp_historico_no_facturado1.sql
CREATE TABLE [dbo].[cpp_historico_no_facturado1] (
    [CPP_ID]                 INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA_CPP]              DATETIME        NULL,
    [HORA]                   VARCHAR (8)     NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (9, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE]                DECIMAL (11, 3) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [REDUCIDO]               TINYINT         NULL,
    [ID]                     INT             NULL,
    [CLIENTE_SERVICIO_ID]    INT             NULL,
    [PLAN_COMERCIAL_ID]      INT             NULL,
    [CLAVE]                  TINYINT         NULL,
    [TIPO]                   INT             NULL,
    [CODIGO]                 VARCHAR (6)     NULL,
    [PRESTATARIA_CPP]        TINYINT         NULL,
    [NUM_LOTE]               VARCHAR (50)    NULL,
    [CONCILIACION]           TINYINT         NULL,
    [PERIODO_ID]             INT             NULL,
    PRIMARY KEY CLUSTERED ([CPP_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_CPP] ASC, [HORA] ASC, [CPP_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CPP1121_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpp_historico_no_facturado1]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1121_CPP_X_CLIENTE_SERVICIO_Y_PRESTATARIA]
    ON [dbo].[cpp_historico_no_facturado1]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1121_X_TODO]
    ON [dbo].[cpp_historico_no_facturado1]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1121_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[cpp_historico_no_facturado1]([CLIENTE_SERVICIO_ID] ASC, [FECHA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1121_X_NUMERO]
    ON [dbo].[cpp_historico_no_facturado1]([NUMERO_ORIGEN] ASC);
GO


## 92: cpp_historico_no_facturado.sql
CREATE TABLE [dbo].[cpp_historico_no_facturado] (
    [CPP_ID]                 INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA_CPP]              DATETIME        NULL,
    [HORA]                   VARCHAR (8)     NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (9, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE]                DECIMAL (11, 3) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [REDUCIDO]               TINYINT         NULL,
    [ID]                     INT             NULL,
    [CLIENTE_SERVICIO_ID]    INT             NULL,
    [PLAN_COMERCIAL_ID]      INT             NULL,
    [CLAVE]                  TINYINT         NULL,
    [TIPO]                   INT             NULL,
    [CODIGO]                 VARCHAR (6)     NULL,
    [PRESTATARIA_CPP]        TINYINT         NULL,
    [NUM_LOTE]               VARCHAR (50)    NULL,
    [CONCILIACION]           TINYINT         NULL,
    [PERIODO_ID]             INT             NULL,
    PRIMARY KEY CLUSTERED ([CPP_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_CPP] ASC, [HORA] ASC, [CPP_ID] ASC),
    CONSTRAINT [IX_cpp_historico_no_facturado1] UNIQUE NONCLUSTERED ([REDUCIDO] ASC, [NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_CPP] ASC, [SEGUNDOS] ASC, [CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC, [IMPORTE] ASC, [HORA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CPP1121_CPP_X_CLIENTE_SERVICIO_Y_PRESTATARIA]
    ON [dbo].[cpp_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1121_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpp_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1121_X_TODO]
    ON [dbo].[cpp_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1121_X_NUMERO]
    ON [dbo].[cpp_historico_no_facturado]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1121_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[cpp_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC, [FECHA_CPP] ASC);
GO


## 93: cpp_historico.sql
CREATE TABLE [dbo].[cpp_historico] (
    [CPP_ID]                 INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA_CPP]              DATETIME        NULL,
    [HORA]                   VARCHAR (8)     NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (9, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE]                DECIMAL (11, 3) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [REDUCIDO]               TINYINT         NULL,
    [ID]                     INT             NULL,
    [CLIENTE_SERVICIO_ID]    INT             NULL,
    [PLAN_COMERCIAL_ID]      INT             NULL,
    [CLAVE]                  TINYINT         NULL,
    [TIPO]                   INT             NULL,
    [CODIGO]                 VARCHAR (6)     NULL,
    [PRESTATARIA_CPP]        TINYINT         NULL,
    [NUM_LOTE]               VARCHAR (50)    NULL,
    [CONCILIACION]           TINYINT         NULL,
    [PERIODO_ID]             INT             NULL,
    CONSTRAINT [PK__cpp_historico1__2C5E7C59] PRIMARY KEY CLUSTERED ([CPP_ID] ASC),
    CONSTRAINT [IX_cpp_historico1] UNIQUE NONCLUSTERED ([REDUCIDO] ASC, [NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_CPP] ASC, [SEGUNDOS] ASC, [CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC, [IMPORTE] ASC, [HORA] ASC),
    CONSTRAINT [UQ__cpp_historico1__2D52A092] UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_CPP] ASC, [HORA] ASC, [CPP_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CPP113_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [FECHA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP113_X_TODO]
    ON [dbo].[cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP113_CPP_X_CLIENTE_SERVICIO_Y_PRESTATARIA]
    ON [dbo].[cpp_historico]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP113_X_NUMERO]
    ON [dbo].[cpp_historico]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP113_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpp_historico]([CLIENTE_SERVICIO_ID] ASC);
GO


## 94: cpp_lama.sql
CREATE TABLE [dbo].[cpp_lama] (
    [CPP_ID]                 INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA_CPP]              DATETIME        NULL,
    [HORA]                   VARCHAR (5)     NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (9, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE]                DECIMAL (11, 3) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [REDUCIDO]               TINYINT         NULL,
    [ID]                     INT             NULL,
    [CLIENTE_SERVICIO_ID]    INT             NULL,
    [PLAN_COMERCIAL_ID]      INT             NULL,
    [CLAVE]                  TINYINT         NULL,
    [TIPO]                   INT             NULL,
    [CODIGO]                 VARCHAR (6)     NULL,
    [PRESTATARIA_CPP]        TINYINT         NULL,
    [NUM_LOTE]               VARCHAR (50)    NULL,
    PRIMARY KEY CLUSTERED ([CPP_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CPP111_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[cpp_lama]([CLIENTE_SERVICIO_ID] ASC, [FECHA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP111_CPP_X_CLIENTE_SERVICIO_Y_PRESTATARIA]
    ON [dbo].[cpp_lama]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP111_X_NUMERO]
    ON [dbo].[cpp_lama]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP111_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpp_lama]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP111_CPP_PARA_BROWSE]
    ON [dbo].[cpp_lama]([NUMERO_ORIGEN] ASC, [FECHA_CPP] ASC, [HORA] ASC, [CPP_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP111_X_TODO]
    ON [dbo].[cpp_lama]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO


## 95: cpp.sql
CREATE TABLE [dbo].[cpp] (
    [CPP_ID]                 INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA_CPP]              DATETIME        NULL,
    [HORA]                   VARCHAR (8)     NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (9, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE]                DECIMAL (11, 3) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [REDUCIDO]               TINYINT         NULL,
    [ID]                     INT             NULL,
    [CLIENTE_SERVICIO_ID]    INT             NULL,
    [PLAN_COMERCIAL_ID]      INT             NULL,
    [CLAVE]                  TINYINT         NULL,
    [TIPO]                   INT             NULL,
    [CODIGO]                 VARCHAR (6)     NULL,
    [PRESTATARIA_CPP]        TINYINT         NULL,
    [NUM_LOTE]               VARCHAR (50)    NULL,
    CONSTRAINT [PK__cpp__392E6792] PRIMARY KEY CLUSTERED ([CPP_ID] ASC),
    CONSTRAINT [UQ__cpp__3A228BCB] UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_CPP] ASC, [HORA] ASC, [CPP_ID] ASC),
    CONSTRAINT [x_registro] UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_CPP] ASC, [SEGUNDOS] ASC, [IMPORTE] ASC, [REDUCIDO] ASC, [CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC, [HORA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CPP1_X_NUMERO]
    ON [dbo].[cpp]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1_X_TODO]
    ON [dbo].[cpp]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1_CPP_X_CLIENTE_SERVICIO_Y_PRESTATARIA]
    ON [dbo].[cpp]([CLIENTE_SERVICIO_ID] ASC, [PRESTATARIA_CPP] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cpp]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CPP1_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[cpp]([CLIENTE_SERVICIO_ID] ASC, [FECHA_CPP] ASC);
GO


## 96: croquis.sql
CREATE TABLE [dbo].[croquis] (
    [CROQUIS] VARCHAR (11) NOT NULL,
    [GRAFICO] VARCHAR (40) NULL,
    PRIMARY KEY CLUSTERED ([CROQUIS] ASC),
    UNIQUE NONCLUSTERED ([CROQUIS] ASC)
);
GO


## 97: Ctacte.sql
CREATE TABLE [dbo].[Ctacte] (
    [CTA_ID]              INT             NOT NULL,
    [CLIENTE_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [DESCRIPCION]         VARCHAR (40)    NULL,
    [COMPROBANTE]         VARCHAR (15)    NULL,
    [TIPO_COMPROBANTE]    VARCHAR (20)    NULL,
    [A]                   VARCHAR (1)     NULL,
    [FECHA]               DATETIME        NULL,
    [DEBE]                DECIMAL (11, 2) NULL,
    [HABER]               DECIMAL (11, 2) NULL,
    [DONDE]               VARCHAR (30)    NULL,
    [SERVICIOS]           VARCHAR (19)    NULL,
    PRIMARY KEY CLUSTERED ([CTA_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_ID] ASC, [CTA_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [CTA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CTA_CTACTE_X_CLIENTE_ID]
    ON [dbo].[Ctacte]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CTA_CTACTE_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Ctacte]([CLIENTE_SERVICIO_ID] ASC);
GO


## 98: Ctacte_s.sql
CREATE TABLE [dbo].[Ctacte_s] (
    [CTA_ID]              INT             NOT NULL,
    [CLIENTE_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [DESCRIPCION]         VARCHAR (40)    NULL,
    [COMPROBANTE]         VARCHAR (15)    NULL,
    [TIPO_COMPROBANTE]    VARCHAR (20)    NULL,
    [A]                   VARCHAR (1)     NULL,
    [FECHA]               DATETIME        NULL,
    [DEBE]                DECIMAL (11, 2) NULL,
    [HABER]               DECIMAL (11, 2) NULL,
    [DONDE]               VARCHAR (30)    NULL,
    [SERVICIOS]           VARCHAR (19)    NULL,
    [factura_id]          INT             NULL,
    [comprobante_id]      INT             NULL,
    [caja]                INT             NULL,
    [numero_comprobante]  VARCHAR (20)    NULL,
    [cliente_agrupado]    TINYINT         NULL,
    CONSTRAINT [PK__Ctacte__1D9B5BB6] PRIMARY KEY CLUSTERED ([CTA_ID] ASC),
    CONSTRAINT [UQ__Ctacte__1E8F7FEF] UNIQUE NONCLUSTERED ([CLIENTE_ID] ASC, [CTA_ID] ASC),
    CONSTRAINT [UQ__Ctacte__1F83A428] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [CTA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [IX_Ctacte_s]
    ON [dbo].[Ctacte_s]([comprobante_id] ASC);
GO
CREATE NONCLUSTERED INDEX [CTA_CTACTE_X_CLIENTE_ID]
    ON [dbo].[Ctacte_s]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_factura_id]
    ON [dbo].[Ctacte_s]([factura_id] ASC);
GO
CREATE NONCLUSTERED INDEX [CTA_CTACTE_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Ctacte_s]([CLIENTE_SERVICIO_ID] ASC);
GO


## 99: Cuadrillas.sql
CREATE TABLE [dbo].[Cuadrillas] (
    [CUADRILLAS_ID] INT          NOT NULL,
    [DESCRIPCION]   VARCHAR (30) NULL,
    [INTEGRANTES]   VARCHAR (89) NULL,
    PRIMARY KEY CLUSTERED ([CUADRILLAS_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);
GO


## 100: cuotas_cargos_206708.sql
CREATE TABLE [dbo].[cuotas_cargos_206708] (
    [ID]         INT             NOT NULL,
    [IMPORTE]    DECIMAL (13, 2) NULL,
    [CLIENTE_ID] INT             NULL,
    [CUOTA]      TINYINT         NULL,
    [CUOTAS]     TINYINT         NULL,
    [FACTURA]    VARCHAR (19)    NULL,
    [MARCA]      INT             NULL,
    [NU]         VARCHAR (200)   NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CUO1_X_FACTURA]
    ON [dbo].[cuotas_cargos_206708]([FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [CUO1_X_CLIENTE_ID]
    ON [dbo].[cuotas_cargos_206708]([CLIENTE_ID] ASC);
GO


## 101: cuotas_dvr.sql
CREATE TABLE [dbo].[cuotas_dvr] (
    [CUOTAS_DVR_ID]           INT             NOT NULL,
    [CUOTA]                   TINYINT         NULL,
    [CLIENTE_SERVICIO_ID]     INT             NULL,
    [DESCRIPCION]             VARCHAR (19)    NULL,
    [FACTURA_ORIGEN_ID]       INT             NULL,
    [FACTURA_DESTINO_ID]      INT             NULL,
    [PORCENTAJE]              DECIMAL (7, 2)  NULL,
    [PAGA]                    TINYINT         NULL,
    [TOTAL_CUOTAS]            TINYINT         NULL,
    [FECHA_DVR]               DATETIME        NULL,
    [FECHA_INCLUSION]         DATETIME        NULL,
    [SALDO]                   DECIMAL (7, 2)  NULL,
    [DVR_CLIENTE_SERVICIO_ID] INT             NULL,
    [IMPORTE]                 DECIMAL (18, 2) NULL,
    PRIMARY KEY CLUSTERED ([CUOTAS_DVR_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CUO2_X_PLAN_DE_PAGO]
    ON [dbo].[cuotas_dvr]([FACTURA_ORIGEN_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CUO2_X_FACTURA_DESTINO_ID]
    ON [dbo].[cuotas_dvr]([FACTURA_DESTINO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CUO2_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[cuotas_dvr]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CUO2_X_DVR_CLIENTE_SERVICIO]
    ON [dbo].[cuotas_dvr]([DVR_CLIENTE_SERVICIO_ID] ASC);
GO


## 102: cuotas_plan_de_pago.sql
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


## 103: DDI_clientes_servicios.sql
CREATE TABLE [dbo].[DDI_clientes_servicios] (
    [ID]                             INT            NOT NULL,
    [CLIENTE_SERVICIO_ID]            INT            NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [fecha_vigencia_desde]           DATETIME       NULL,
    [fecha_vigencia_hasta]           DATETIME       NULL,
    [fecha_baja]                     DATETIME       NULL,
    [baja]                           TINYINT        NULL,
    [ddi_id]                         INT            NULL,
    [promocion]                      TINYINT        NULL,
    CONSTRAINT [PK__DDI_clientes_ser__25918339] PRIMARY KEY CLUSTERED ([ID] ASC),
    CONSTRAINT [UQ__DDI_clientes_ser__2685A772] UNIQUE NONCLUSTERED ([PAIS] ASC, [ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [DDI1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[DDI_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [UQ__DDI_clientes_ser__2779CBAB]
    ON [dbo].[DDI_clientes_servicios]([CODIGO] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_codigo_y_baja]
    ON [dbo].[DDI_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [CODIGO] ASC, [baja] ASC);
GO
CREATE NONCLUSTERED INDEX [DDI_x_cliente_servicio_id_y_codigo]
    ON [dbo].[DDI_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [CODIGO] ASC);
GO


## 104: DDI_planes_comerciales.sql
CREATE TABLE [dbo].[DDI_planes_comerciales] (
    [ID]                             INT            NOT NULL,
    [PLAN_COMERCIAL_ID]              INT            NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    CONSTRAINT [PK__DDI_planes_comer__192BAC54] PRIMARY KEY CLUSTERED ([ID] ASC),
    CONSTRAINT [UQ__DDI_planes_comer__1A1FD08D] UNIQUE NONCLUSTERED ([PAIS] ASC, [ID] ASC),
    CONSTRAINT [UQ__DDI_planes_comer__1B13F4C6] UNIQUE NONCLUSTERED ([CODIGO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [DDI2_X_PLAN_COMERCIAL_ID]
    ON [dbo].[DDI_planes_comerciales]([PLAN_COMERCIAL_ID] ASC);
GO


## 105: DDI_planes_especiales.sql
CREATE TABLE [dbo].[DDI_planes_especiales] (
    [ID]                             INT            NOT NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [IMPORTE_LAMA]                   DECIMAL (9, 4) NULL,
    [DESCRIPCION]                    VARCHAR (49)   NULL,
    [FECHA_DESDE]                    DATETIME       NULL,
    [FECHA_HASTA]                    DATETIME       NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [DDI4_DDI_X_PAIS_Y_ID]
    ON [dbo].[DDI_planes_especiales]([PAIS] ASC, [ID] ASC);
GO


## 106: DDI.sql
CREATE TABLE [dbo].[DDI] (
    [ID]                             INT            NOT NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_con_descuento]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_con_descuento] DECIMAL (9, 4) NULL,
    [importe_lama]                   DECIMAL (9, 4) NULL,
    [Descripcion]                    VARCHAR (50)   NULL,
    CONSTRAINT [PK_DDI] PRIMARY KEY CLUSTERED ([ID] ASC),
    CONSTRAINT [IX_DDI] UNIQUE NONCLUSTERED ([ID] ASC),
    CONSTRAINT [IX_DDI_1] UNIQUE NONCLUSTERED ([CODIGO] ASC)
);
GO


## 107: DDI_tarifas_especiales.sql
CREATE TABLE [dbo].[DDI_tarifas_especiales] (
    [ID]                             INT            NOT NULL,
    [CODIGO]                         VARCHAR (15)   NULL,
    [PAIS]                           VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_con_descuento]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_con_descuento] DECIMAL (9, 4) NULL,
    [fecha_vigencia_desde]           DATETIME       NULL,
    [fecha_vigencia_hasta]           DATETIME       NULL
);
GO
CREATE NONCLUSTERED INDEX [DDI_x_pais]
    ON [dbo].[DDI_tarifas_especiales]([PAIS] ASC);
GO


## 108: DDN_clientes_servicios.sql
CREATE TABLE [dbo].[DDN_clientes_servicios] (
    [ID]                             INT            NOT NULL,
    [CLIENTE_SERVICIO_ID]            INT            NULL,
    [CODIGO]                         VARCHAR (6)    NULL,
    [LOCALIDAD]                      VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [fecha_vigencia_desde]           DATETIME       NULL,
    [fecha_vigencia_hasta]           DATETIME       NULL,
    [fecha_baja]                     DATETIME       NULL,
    [baja]                           TINYINT        NULL,
    [ddn_id]                         INT            NULL,
    [promocion]                      TINYINT        NULL,
    CONSTRAINT [PK__DDN_clientes_ser__2962141D] PRIMARY KEY CLUSTERED ([ID] ASC),
    CONSTRAINT [UQ__DDN_clientes_ser__2A563856] UNIQUE NONCLUSTERED ([LOCALIDAD] ASC, [ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [UQ__DDN_clientes_ser__2B4A5C8F]
    ON [dbo].[DDN_clientes_servicios]([CODIGO] ASC);
GO
CREATE NONCLUSTERED INDEX [DDN1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[DDN_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_codigo_y_baja]
    ON [dbo].[DDN_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [CODIGO] ASC, [baja] ASC);
GO
CREATE NONCLUSTERED INDEX [DDN_x_cliente_servicio_id_y_codigo]
    ON [dbo].[DDN_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [CODIGO] ASC);
GO


## 109: DDN_planes_comerciales.sql
CREATE TABLE [dbo].[DDN_planes_comerciales] (
    [ID]                             INT            NOT NULL,
    [PLAN_COMERCIAL_ID]              INT            NULL,
    [CODIGO]                         VARCHAR (6)    NULL,
    [LOCALIDAD]                      VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC),
    UNIQUE NONCLUSTERED ([LOCALIDAD] ASC, [ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [DDN2_X_PLAN_COMERCIAL_ID]
    ON [dbo].[DDN_planes_comerciales]([PLAN_COMERCIAL_ID] ASC);
GO


## 110: DDN_planes_especiales.sql
CREATE TABLE [dbo].[DDN_planes_especiales] (
    [ID]                             INT            NOT NULL,
    [CODIGO]                         VARCHAR (6)    NULL,
    [LOCALIDAD]                      VARCHAR (50)   NULL,
    [CLAVE]                          TINYINT        NULL,
    [IMPORTE_COMUN]                  DECIMAL (9, 4) NULL,
    [IMPORTE_COMUN_CON_DESCUENTO]    DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO_CON_DESCUENTO] DECIMAL (9, 4) NULL,
    [IMPORTE_REDUCIDO]               DECIMAL (9, 4) NULL,
    [IMPORTE_LAMA]                   DECIMAL (9, 4) NULL,
    [FECHA_DESDE]                    DATETIME       NULL,
    [FECHA_HASTA]                    DATETIME       NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC),
    UNIQUE NONCLUSTERED ([LOCALIDAD] ASC, [ID] ASC)
);
GO


## 111: DDN.sql
CREATE TABLE [dbo].[DDN] (
    [id]                             INT             NOT NULL,
    [Codigo]                         VARCHAR (6)     NULL,
    [Localidad]                      VARCHAR (50)    NULL,
    [Clave]                          TINYINT         NULL,
    [Importe_comun]                  DECIMAL (18, 4) NULL,
    [Importe_reducido]               DECIMAL (18, 4) NULL,
    [importe_reducido_con_descuento] DECIMAL (18, 4) NULL,
    [Importe_comun_con_descuento]    DECIMAL (18, 4) NULL,
    [importe_lama]                   DECIMAL (9, 4)  NULL,
    [prestataria_id]                 INT             NULL,
    [fecha_prestataria]              DATETIME        NULL,
    CONSTRAINT [PK_DDN] PRIMARY KEY CLUSTERED ([id] ASC),
    CONSTRAINT [IX_DDN] UNIQUE NONCLUSTERED ([Codigo] ASC)
);
GO


## 112: DDN_tarifas_especiales.sql
CREATE TABLE [dbo].[DDN_tarifas_especiales] (
    [id]                             INT             NULL,
    [Codigo]                         VARCHAR (6)     NULL,
    [Localidad]                      VARCHAR (50)    NULL,
    [Clave]                          TINYINT         NULL,
    [Importe_comun]                  DECIMAL (18, 4) NULL,
    [Importe_reducido]               DECIMAL (18, 4) NULL,
    [importe_reducido_con_descuento] DECIMAL (18, 4) NULL,
    [Importe_comun_con_descuento]    DECIMAL (18, 4) NULL,
    [fecha_vigencia_desde]           DATETIME        NULL,
    [fecha_vigencia_hasta]           DATETIME        NULL
);
GO
CREATE NONCLUSTERED INDEX [DDN_x_localidad]
    ON [dbo].[DDN_tarifas_especiales]([Localidad] ASC);
GO


## 113: Devolucion_2067.sql
CREATE TABLE [dbo].[Devolucion_2067] (
    [ID]                        INT             NOT NULL,
    [CLIENTE_ID]                INT             NULL,
    [CUENTA]                    INT             NULL,
    [DIFERENCIA_2067]           DECIMAL (13, 2) NULL,
    [IMPORTE_ORIGINAL]          DECIMAL (13, 2) NULL,
    [DIFERENCIA_INTERESES_2067] DECIMAL (13, 2) NULL,
    [DIFERENCIA_IVA_2067]       DECIMAL (13, 2) NULL,
    [DIAS]                      TINYINT         NULL,
    [DIAS_PERIODO]              TINYINT         NULL,
    [SALDO_2067]                DECIMAL (13, 2) NULL,
    [SALDO_2067_COBRANZA]       DECIMAL (13, 2) NULL,
    [FACTURA]                   VARCHAR (13)    NULL,
    [INICIO]                    INT             NULL,
    [FINAL]                     INT             NULL,
    [CLASIFICACION]             VARCHAR (5)     NULL,
    [NOTA_DE_CREDITO]           VARCHAR (15)    NULL,
    [GENERADA]                  TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [DEV1_X_FACTURA]
    ON [dbo].[Devolucion_2067]([FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [DEV1_X_CLIENTE]
    ON [dbo].[Devolucion_2067]([CLIENTE_ID] ASC);
GO


## 114: Devoluciones_varias.sql
CREATE TABLE [dbo].[Devoluciones_varias] (
    [ID]               INT             NOT NULL,
    [CLIENTE_ID]       INT             NULL,
    [IMPORTE]          DECIMAL (11, 2) NULL,
    [FACTURA]          VARCHAR (14)    NULL,
    [USUARIO]          VARCHAR (49)    NULL,
    [SALDO]            DECIMAL (11, 2) NULL,
    [FACTURA_ORIGEN]   VARCHAR (19)    NULL,
    [OPERADOR_ID]      INT             NULL,
    [OPERADOR]         VARCHAR (39)    NULL,
    [FECHA_GENERACION] INT             NULL,
    [FECHA_APROBACION] INT             NULL,
    [APROBADA]         TINYINT         NULL,
    [NRO_CAJA]         INT             NULL,
    [NRO_EXPEDIENTE]   VARCHAR (19)    NULL,
    [SERVICIO]         VARCHAR (12)    NULL,
    [Items_id]         INT             NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [DEV231_POR_FECHA_APROBACION]
    ON [dbo].[Devoluciones_varias]([FECHA_APROBACION] ASC);
GO
CREATE NONCLUSTERED INDEX [DEV231_POR_FECHA_DE_CARGA]
    ON [dbo].[Devoluciones_varias]([FECHA_GENERACION] ASC);
GO
CREATE NONCLUSTERED INDEX [DEV231_POR_CLIENTE_ID]
    ON [dbo].[Devoluciones_varias]([CLIENTE_ID] ASC);
GO


## 115: EMPRESA.sql
CREATE TABLE [dbo].[EMPRESA] (
    [EMPRESA_ID] TINYINT       NOT NULL,
    [EMPRESA]    VARCHAR (40)  NULL,
    [DIRECCION]  VARCHAR (40)  NULL,
    [LOCALIDAD]  VARCHAR (40)  NULL,
    [PROVINCIA]  VARCHAR (40)  NULL,
    [CUIT]       VARCHAR (19)  NULL,
    [NRO_IB]     VARCHAR (19)  NULL,
    [NRO_GAN]    VARCHAR (19)  NULL,
    [LOGO]       VARCHAR (100) NULL,
    [CBU]        VARCHAR (50)  NULL,
    [Alias_CBU]  VARCHAR (90)  NULL,
    PRIMARY KEY CLUSTERED ([EMPRESA_ID] ASC)
);
GO


## 116: equipo_scripts.sql
CREATE TABLE [dbo].[equipo_scripts] (
    [ID]        INT NOT NULL,
    [ID_EQUIPO] INT NULL,
    [ID_SCRIPT] INT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([ID_EQUIPO] ASC, [ID_SCRIPT] ASC)
);
GO


## 117: equipos_FTTH.sql
CREATE TABLE [dbo].[equipos_FTTH] (
    [EQUIPO_ID]        INT          NOT NULL,
    [POSICION_RACK_ID] INT          NULL,
    [DESCRIPCION]      VARCHAR (59) NULL,
    [MARCA]            VARCHAR (59) NULL,
    [MODELO]           VARCHAR (59) NULL,
    [POSICIONES]       INT          NULL,
    PRIMARY KEY CLUSTERED ([EQUIPO_ID] ASC)
);
GO


## 118: equipos_FTTP.sql
CREATE TABLE [dbo].[equipos_FTTP] (
    [EQUIPO_ID]        INT          NOT NULL,
    [POSICION_RACK_ID] INT          NULL,
    [DESCRIPCION]      VARCHAR (59) NULL,
    [MARCA]            VARCHAR (59) NULL,
    [MODELO]           VARCHAR (59) NULL,
    [POSICIONES]       INT          NULL,
    PRIMARY KEY CLUSTERED ([EQUIPO_ID] ASC)
);
GO


## 119: Equipos.sql
CREATE TABLE [dbo].[Equipos] (
    [EQUIPOS_ID]          INT          NOT NULL,
    [POSICIONES_RACK_ID]  INT          NULL,
    [DESCRIPCION]         VARCHAR (30) NULL,
    [MARCA]               VARCHAR (30) NULL,
    [MODELO]              VARCHAR (30) NULL,
    [POSICIONES]          INT          NULL,
    [script_id]           INT          NULL,
    [script_telefonia_id] INT          NULL,
    CONSTRAINT [PK__Equipos__1FEDB87C] PRIMARY KEY CLUSTERED ([EQUIPOS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [EQU_EQUIPOS_X_POSICION_RACK_ID]
    ON [dbo].[Equipos]([POSICIONES_RACK_ID] ASC);
GO


## 120: estado_beneficio.sql
CREATE TABLE [dbo].[estado_beneficio] (
    [CODIGO]            INT           NOT NULL,
    [DESCRIPCION]       VARCHAR (100) NULL,
    [TIPO_USUARIO]      VARCHAR (25)  NULL,
    [CONSECUENCIA]      VARCHAR (20)  NULL,
    [RENUNCIA_SUBSIDIO] TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC)
);
GO


## 121: estado_modem.sql
CREATE TABLE [dbo].[estado_modem] (
    [estado_modem_id] INT          NULL,
    [estado]          VARCHAR (50) NULL
);
GO


## 122: Estados.sql
CREATE TABLE [dbo].[Estados] (
    [ESTADO_ID] INT          NOT NULL,
    [ESTADO]    VARCHAR (40) NULL,
    PRIMARY KEY CLUSTERED ([ESTADO_ID] ASC)
);
GO


## 123: etiquetas_imprimir.sql
CREATE TABLE [dbo].[etiquetas_imprimir] (
    [ID]          INT          NOT NULL,
    [APELLIDO_1]  VARCHAR (40) NULL,
    [APELLIDO_2]  VARCHAR (40) NULL,
    [APELLIDO_3]  VARCHAR (40) NULL,
    [DNI_1]       VARCHAR (14) NULL,
    [DNI_2]       VARCHAR (14) NULL,
    [DNI_3]       VARCHAR (14) NULL,
    [DOMICILIO_1] VARCHAR (50) NULL,
    [DOMICILIO_2] VARCHAR (50) NULL,
    [DOMICILIO_3] VARCHAR (50) NULL,
    [EMAIL_1]     VARCHAR (60) NULL,
    [EMAIL_2]     VARCHAR (60) NULL,
    [EMAIL_3]     VARCHAR (60) NULL,
    [CELULAR_1]   VARCHAR (19) NULL,
    [CELULAR_2]   VARCHAR (19) NULL,
    [CELULAR_3]   VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 124: etiquetas_pasar.sql
CREATE TABLE [dbo].[etiquetas_pasar] (
    [ID]        INT          NOT NULL,
    [APELLIDO]  VARCHAR (40) NULL,
    [NOMBRE]    VARCHAR (40) NULL,
    [DNI]       VARCHAR (14) NULL,
    [DOMICILIO] VARCHAR (50) NULL,
    [EMAIL]     VARCHAR (60) NULL,
    [CELULAR]   VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 125: etiquetas.sql
CREATE TABLE [dbo].[etiquetas] (
    [ID]       INT          NOT NULL,
    [CIS1]     VARCHAR (11) NULL,
    [CIS2]     VARCHAR (11) NULL,
    [CIS3]     VARCHAR (11) NULL,
    [SERVICIO] VARCHAR (14) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 126: Facturacion_para_afip.sql
CREATE TABLE [dbo].[Facturacion_para_afip] (
    [FACTURACION_PARA_AFIP_ID] INT          NOT NULL,
    [PERIODO]                  VARCHAR (20) NULL,
    [TIPO]                     VARCHAR (20) NULL,
    [DESDE]                    INT          NULL,
    [HASTA]                    INT          NULL,
    [NOMBRE_ARCHIVO_TXT]       VARCHAR (20) NULL,
    PRIMARY KEY CLUSTERED ([FACTURACION_PARA_AFIP_ID] ASC)
);
GO


## 127: Facturacion_para_rentas.sql
CREATE TABLE [dbo].[Facturacion_para_rentas] (
    [FACTURACION_PARA_RENTAS_ID] INT          NOT NULL,
    [PERIODO]                    VARCHAR (20) NULL,
    [TIPO]                       VARCHAR (20) NULL,
    [DESDE]                      INT          NULL,
    [HASTA]                      INT          NULL,
    [NOMBRE_ARCHIVO_TXT]         VARCHAR (20) NULL,
    PRIMARY KEY CLUSTERED ([FACTURACION_PARA_RENTAS_ID] ASC)
);
GO


## 128: factura_memory_sql.sql
CREATE TABLE [dbo].[factura_memory_sql] (
    [ID]                  INT             NOT NULL,
    [QUE_ES]              VARCHAR (19)    NULL,
    [FECHA_EMISION]       DATETIME        NULL,
    [FACTURA_ID]          INT             NULL,
    [NUMERO_FACTURA]      VARCHAR (24)    NULL,
    [NUMERO_FACTURA2]     VARCHAR (19)    NULL,
    [SERVICIO]            VARCHAR (19)    NULL,
    [IMPORTE]             DECIMAL (11, 2) NULL,
    [USUARIO]             VARCHAR (49)    NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [CLIENTE_ID]          INT             NULL,
    [MARCA]               TINYINT         NULL,
    [MAIL]                VARCHAR (79)    NULL,
    [NOMBRE]              VARCHAR (89)    NULL,
    [DOCUMENTO]           VARCHAR (19)    NULL,
    [CALLE]               VARCHAR (49)    NULL,
    [CALLE_NUMERO]        INT             NULL,
    [TELEFONO]            VARCHAR (44)    NULL,
    [FACTURA_DE_CREDITO]  TINYINT         NULL,
    [FACTURA_AGRUPADA]    TINYINT         NULL,
    [PERIODO]             INT             NULL,
    [DETALLE_LLAMADA]     TINYINT         NULL,
    [FECHA_ENVIO]         INT             NULL,
    [HORA_ENVIO]          INT             NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC)
);
GO


## 129: Facturas_aux.sql
CREATE TABLE [dbo].[Facturas_aux] (
    [FACTURA_ID]            INT             NOT NULL,
    [USUARIO]               VARCHAR (99)    NULL,
    [PREJUDICIAL]           TINYINT         NULL,
    [CAE]                   VARCHAR (49)    NULL,
    [RUTA]                  TINYINT         NULL,
    [QUE_ES]                VARCHAR (19)    NULL,
    [TIPO]                  VARCHAR (1)     NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [SERVICIOS]             VARCHAR (19)    NULL,
    [PERIODO]               VARCHAR (10)    NULL,
    [PERIODO_ID]            INT             NULL,
    [PERIODO_CALCULO_ID]    INT             NULL,
    [ANULADO]               TINYINT         NULL,
    [IMPRESO]               TINYINT         NULL,
    [ORDEN_IMPRESION]       INT             NULL,
    [NOTA_DE_CREDITO]       VARCHAR (19)    NULL,
    [MOTIVO]                VARCHAR (20)    NULL,
    [CONTROL]               TINYINT         NULL,
    [CLIENTE_ID]            INT             NULL,
    [CLIENTE_SERVICIO_ID]   INT             NULL,
    [CLASIFICACION_IVA]     TINYINT         NULL,
    [PERCEPCION_ID]         INT             NULL,
    [IMPORTE]               DECIMAL (15, 4) NULL,
    [SALDO]                 DECIMAL (15, 4) NULL,
    [PARA_INTERESES]        DECIMAL (15, 4) NULL,
    [FECHA_PREJUDICIAL]     DATETIME        NULL,
    [DESDE]                 DATETIME        NULL,
    [HASTA]                 DATETIME        NULL,
    [FECHA_EMISION]         DATETIME        NULL,
    [FECHA_VENCIMIENTO]     DATETIME        NULL,
    [FECHA_PAGO]            DATETIME        NULL,
    [NEXTEL_NETO]           DECIMAL (7, 2)  NULL,
    [NEXTEL_IVA21]          DECIMAL (7, 2)  NULL,
    [NEXTEL_IVA105]         DECIMAL (7, 2)  NULL,
    [NEXTEL_IVA27]          DECIMAL (7, 2)  NULL,
    [NEXTEL_IVA135]         DECIMAL (7, 2)  NULL,
    [NEXTEL_PIB]            DECIMAL (7, 2)  NULL,
    [NETO]                  DECIMAL (11, 2) NULL,
    [NETO_2]                DECIMAL (11, 2) NULL,
    [NETO_PLAN_DE_PAGO]     DECIMAL (11, 2) NULL,
    [IVA_1]                 DECIMAL (11, 2) NULL,
    [IVA_2]                 DECIMAL (11, 2) NULL,
    [IVA_3]                 DECIMAL (11, 2) NULL,
    [IVA_4]                 DECIMAL (11, 2) NULL,
    [EXENTO]                DECIMAL (11, 2) NULL,
    [IB]                    DECIMAL (11, 2) NULL,
    [INTERES]               DECIMAL (9, 2)  NULL,
    [IVA_INTERES]           DECIMAL (9, 2)  NULL,
    [PUESTO_ID]             INT             NULL,
    [DEBITO_AUTOMATICO]     TINYINT         NULL,
    [ITEMS_OPCIONALES_PIB]  DECIMAL (11, 2) NULL,
    [PERSONAL_NETO]         DECIMAL (11, 2) NULL,
    [PERSONAL_IVA21]        DECIMAL (11, 2) NULL,
    [PERSONAL_IVA105]       DECIMAL (11, 2) NULL,
    [PERSONAL_IVA27]        DECIMAL (11, 2) NULL,
    [PERSONAL_IVA135]       DECIMAL (11, 2) NULL,
    [PERSONAL_PIB]          DECIMAL (11, 2) NULL,
    [MOVISTAR_NETO]         DECIMAL (11, 2) NULL,
    [MOVISTAR_IVA21]        DECIMAL (11, 2) NULL,
    [MOVISTAR_IVA105]       DECIMAL (11, 2) NULL,
    [MOVISTAR_IVA27]        DECIMAL (11, 2) NULL,
    [MOVISTAR_IVA135]       DECIMAL (11, 2) NULL,
    [MOVISTAR_PIB]          DECIMAL (11, 2) NULL,
    [CTI_NETO]              DECIMAL (11, 2) NULL,
    [CTI_IVA21]             DECIMAL (11, 2) NULL,
    [CTI_IVA27]             DECIMAL (11, 2) NULL,
    [CTI_IVA105]            DECIMAL (11, 2) NULL,
    [CTI_IVA135]            DECIMAL (11, 2) NULL,
    [CTI_PIB]               DECIMAL (11, 2) NULL,
    [ITEM_OPCIONAL_NETO]    DECIMAL (9, 2)  NULL,
    [ITEM_OPCIONAL_IVA21]   DECIMAL (9, 2)  NULL,
    [ITEM_OPCIONAL_IVA27]   DECIMAL (9, 2)  NULL,
    [ITEM_OPCIONAL_IVA105]  DECIMAL (9, 2)  NULL,
    [ITEM_OPCIONAL_IVA135]  DECIMAL (9, 2)  NULL,
    [FECHA_INTIMACION]      DATETIME        NULL,
    [INTIMA]                TINYINT         NULL,
    [RECIBIDA]              TINYINT         NULL,
    [NUMERO_INTIMACION]     INT             NULL,
    [FECHA_SUSPENSION]      DATETIME        NULL,
    [FECHA_VENCIMIENTO_CAE] VARCHAR (19)    NULL,
    [FECHA_TELECOBRANZA]    DATETIME        NULL,
    [PLAN_DE_PAGO]          INT             NULL,
    [IVR]                   TINYINT         NULL,
    [CANTIDAD_IVR]          TINYINT         NULL,
    [CUOTA_DVR]             DECIMAL (7, 2)  NULL,
    PRIMARY KEY CLUSTERED ([FACTURA_ID] ASC),
    UNIQUE NONCLUSTERED ([TIPO] ASC, [NUMERO_FACTURA] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [SERVICIOS] ASC, [PERIODO_ID] ASC, [QUE_ES] ASC),
    UNIQUE NONCLUSTERED ([PERIODO_ID] ASC, [FECHA_EMISION] ASC, [TIPO] ASC, [NUMERO_FACTURA] ASC, [FACTURA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC3_POR_TIPO_Y_ID]
    ON [dbo].[Facturas_aux]([TIPO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Facturas_aux]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_FACTURAS_X_CLASIFICACION_IVA]
    ON [dbo].[Facturas_aux]([CLASIFICACION_IVA] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_X_NUMERO_INTIMACION]
    ON [dbo].[Facturas_aux]([NUMERO_INTIMACION] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_X_CLIENTE_SERVICIO_Y_PERIODO]
    ON [dbo].[Facturas_aux]([CLIENTE_SERVICIO_ID] ASC, [PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_FACTURAS_POR_PERIODO]
    ON [dbo].[Facturas_aux]([PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_FACTUTAS_X_PERIODO_ID]
    ON [dbo].[Facturas_aux]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_FACTURAS_X_IMPRESA_RUTA_ORDEN_ORDEN]
    ON [dbo].[Facturas_aux]([IMPRESO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_FACTURAS_POR_SERVICIOS]
    ON [dbo].[Facturas_aux]([SERVICIOS] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_X_TIPO_Y_ORDEN_IMPRESION_Y_PERIODO]
    ON [dbo].[Facturas_aux]([TIPO] ASC, [ORDEN_IMPRESION] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_X_CLIENTE_ID_Y_ID]
    ON [dbo].[Facturas_aux]([CLIENTE_ID] ASC, [FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_X_TIPO_Y_NUMERO_FACTURA_Y_PERIODO_ID]
    ON [dbo].[Facturas_aux]([TIPO] ASC, [NUMERO_FACTURA] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_X_CLIENTE_SERVICIO_ID_Y_ID]
    ON [dbo].[Facturas_aux]([CLIENTE_SERVICIO_ID] ASC, [FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_FACTURAS_X_CONTROL]
    ON [dbo].[Facturas_aux]([CONTROL] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_FACTURAS_POR_SERVICIOS_Y_FECHA]
    ON [dbo].[Facturas_aux]([SERVICIOS] ASC, [FECHA_EMISION] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC3_X_CLIENTE_ID]
    ON [dbo].[Facturas_aux]([CLIENTE_ID] ASC);
GO


## 130: facturas_cae.sql
CREATE TABLE [dbo].[facturas_cae] (
    [FACTURA_ID]       INT             NOT NULL,
    [CLIENTE_ID]       INT             NULL,
    [TIPO]             TINYINT         NULL,
    [NETO_ALICUOTA_1]  DECIMAL (11, 2) NULL,
    [NETO_ALICUOTA_2]  DECIMAL (11, 2) NULL,
    [IVA_ALICUOTA_1]   DECIMAL (11, 2) NULL,
    [IVA_ALICUOTA_2]   DECIMAL (11, 2) NULL,
    [TOTAL]            DECIMAL (11, 2) NULL,
    [QUEES]            VARCHAR (19)    NULL,
    [IB]               DECIMAL (9, 2)  NULL,
    [NUMERO]           INT             NULL,
    [CUIT]             VARCHAR (19)    NULL,
    [NRO_CAE]          VARCHAR (19)    NULL,
    [FECHA_FACTURA]    INT             NULL,
    [VTO_CAE]          INT             NULL,
    [TIPO_DOC_CLIENTE] TINYINT         NULL,
    [DOCNRO]           VARCHAR (19)    NULL,
    [PTO_VTA]          INT             NULL,
    [LETRA]            VARCHAR (1)     NULL,
    [ERROR_CAE]        TINYINT         NULL,
    [IVA_EXENTO]       DECIMAL (11, 2) NULL,
    [NETO_ALICUOTA_3]  DECIMAL (9, 2)  NULL,
    [IVA_ALICUOTA_3]   DECIMAL (9, 2)  NULL,
    PRIMARY KEY CLUSTERED ([FACTURA_ID] ASC)
);
GO


## 131: Facturas_items_agrupadas.sql
CREATE TABLE [dbo].[Facturas_items_agrupadas] (
    [FACTURAS_ITEMS_ID]                       INT             NOT NULL,
    [FACTURA_ID]                              INT             NULL,
    [NUMERO_FACTURA]                          VARCHAR (19)    NULL,
    [ITEM_FACTURACION_ID]                     INT             NULL,
    [ITEM_FACTURACION_DESCRIPCION]            VARCHAR (40)    NULL,
    [ITEM_EN_CLIENTE_SERVICIO_ID]             INT             NULL,
    [ITEM_EN_CLIENTE_SERVICIO_PARA_CORTE_ID]  INT             NULL,
    [ITEM_EN_CLIENTES_SERVICIOS_HISTORICO_ID] INT             NULL,
    [VALOR_UNITARIO]                          DECIMAL (13, 2) NULL,
    [TOTAL]                                   DECIMAL (13, 2) NULL,
    [IVA]                                     DECIMAL (11, 2) NULL,
    [COLUMNA_SUBDIARIO_FACTURACION]           TINYINT         NULL,
    [COLUMNA_SUBDIARIO_IVA]                   TINYINT         NULL,
    [ITEMS_ARCHIVOS_ID]                       INT             NULL,
    [ARTICULO_ID]                             INT             NULL,
    [CANTIDAD]                                DECIMAL (7, 2)  NULL,
    [PERIODO]                                 VARCHAR (10)    NULL,
    [SERVICIOS]                               VARCHAR (19)    NULL,
    [PERIODO_ID]                              INT             NULL,
    [EN_FACTURA]                              TINYINT         NULL,
    [IMPORTE_FACTURA]                         DECIMAL (13, 2) NULL,
    [TOTAL_CUOTAS]                            INT             NULL,
    [CUOTA_ACTUAL]                            INT             NULL,
    [PINTA]                                   TINYINT         NULL,
    [ITEMS_APLICACION_ID]                     INT             NULL,
    [QUE_ES]                                  VARCHAR (19)    NULL,
    [ORDEN]                                   INT             NULL,
    PRIMARY KEY CLUSTERED ([FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC, [FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_FACTURA] ASC, [FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([PERIODO_ID] ASC, [FACTURAS_ITEMS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC15_X_FACTURA]
    ON [dbo].[Facturas_items_agrupadas]([NUMERO_FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC15_X_FACTURA_ID_Y_ITEM_ID]
    ON [dbo].[Facturas_items_agrupadas]([FACTURA_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC15_POR_PERIODO_ID]
    ON [dbo].[Facturas_items_agrupadas]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC15_X_PERIODO]
    ON [dbo].[Facturas_items_agrupadas]([PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC15_X_FACTURA_ID]
    ON [dbo].[Facturas_items_agrupadas]([FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC15_X_ORDEN]
    ON [dbo].[Facturas_items_agrupadas]([FACTURA_ID] ASC, [ORDEN] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC15_X_ITEM_ID]
    ON [dbo].[Facturas_items_agrupadas]([ITEM_FACTURACION_ID] ASC);
GO


## 132: Facturas_items_aux.sql
CREATE TABLE [dbo].[Facturas_items_aux] (
    [FACTURAS_ITEMS_ID]                       INT             NOT NULL,
    [FACTURA_ID]                              INT             NULL,
    [NUMERO_FACTURA]                          VARCHAR (19)    NULL,
    [ITEM_FACTURACION_ID]                     INT             NULL,
    [ITEM_FACTURACION_DESCRIPCION]            VARCHAR (40)    NULL,
    [ITEM_EN_CLIENTE_SERVICIO_ID]             INT             NULL,
    [ITEM_EN_CLIENTE_SERVICIO_PARA_CORTE_ID]  INT             NULL,
    [ITEM_EN_CLIENTES_SERVICIOS_HISTORICO_ID] INT             NULL,
    [VALOR_UNITARIO]                          DECIMAL (13, 2) NULL,
    [TOTAL]                                   DECIMAL (13, 2) NULL,
    [IVA]                                     DECIMAL (11, 2) NULL,
    [COLUMNA_SUBDIARIO_FACTURACION]           TINYINT         NULL,
    [COLUMNA_SUBDIARIO_IVA]                   TINYINT         NULL,
    [ITEMS_ARCHIVOS_ID]                       INT             NULL,
    [ARTICULO_ID]                             INT             NULL,
    [CANTIDAD]                                DECIMAL (7, 2)  NULL,
    [PERIODO]                                 VARCHAR (10)    NULL,
    [SERVICIOS]                               VARCHAR (19)    NULL,
    [PERIODO_ID]                              INT             NULL,
    [EN_FACTURA]                              TINYINT         NULL,
    [IMPORTE_FACTURA]                         DECIMAL (13, 2) NULL,
    [TOTAL_CUOTAS]                            INT             NULL,
    [CUOTA_ACTUAL]                            INT             NULL,
    [PINTA]                                   TINYINT         NULL,
    [ITEMS_APLICACION_ID]                     INT             NULL,
    [QUE_ES]                                  VARCHAR (19)    NULL,
    PRIMARY KEY CLUSTERED ([FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC, [FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_FACTURA] ASC, [FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([PERIODO_ID] ASC, [FACTURAS_ITEMS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC13_X_FACTURA_ID_Y_ITEM_ID]
    ON [dbo].[Facturas_items_aux]([FACTURA_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC13_X_PERIODO]
    ON [dbo].[Facturas_items_aux]([PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC13_X_FACTURA]
    ON [dbo].[Facturas_items_aux]([NUMERO_FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC13_POR_PERIODO_ID]
    ON [dbo].[Facturas_items_aux]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC13_X_FACTURA_ID]
    ON [dbo].[Facturas_items_aux]([FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC13_X_ITEM_ID]
    ON [dbo].[Facturas_items_aux]([ITEM_FACTURACION_ID] ASC);
GO


## 133: Facturas_items.sql
CREATE TABLE [dbo].[Facturas_items] (
    [FACTURAS_ITEMS_ID]                       INT             NOT NULL,
    [FACTURA_ID]                              INT             NULL,
    [NUMERO_FACTURA]                          VARCHAR (19)    NULL,
    [ITEM_FACTURACION_ID]                     INT             NULL,
    [ITEM_FACTURACION_DESCRIPCION]            VARCHAR (40)    NULL,
    [VALOR_UNITARIO]                          DECIMAL (13, 2) NULL,
    [TOTAL]                                   DECIMAL (13, 2) NULL,
    [IVA]                                     DECIMAL (11, 2) NULL,
    [Columna_subdiario_iva]                   TINYINT         NULL,
    [ITEMS_ARCHIVOS_ID]                       INT             NULL,
    [ARTICULO_ID]                             INT             NULL,
    [CANTIDAD]                                DECIMAL (7, 2)  NULL,
    [PERIODO]                                 VARCHAR (10)    NULL,
    [SERVICIOS]                               VARCHAR (19)    NULL,
    [PERIODO_ID]                              INT             NULL,
    [EN_FACTURA]                              TINYINT         NULL,
    [IMPORTE_FACTURA]                         DECIMAL (13, 2) NULL,
    [TOTAL_CUOTAS]                            INT             NULL,
    [CUOTA_ACTUAL]                            INT             NULL,
    [PINTA]                                   TINYINT         NULL,
    [columna_subdiario_facturacion]           TINYINT         NULL,
    [item_en_cliente_servicio_id]             INT             NULL,
    [item_en_clientes_servicios_historico_id] INT             NULL,
    [items_aplicacion_id]                     INT             NULL,
    [ITEM_EN_CLIENTE_SERVICIO_PARA_CORTE_ID]  INT             NULL,
    [que_es]                                  VARCHAR (19)    NULL,
    [cliente_id]                              INT             NULL,
    [cliente_servicio_id]                     INT             NULL,
    [cliente]                                 VARCHAR (50)    NULL,
    [orden]                                   INT             NULL,
    PRIMARY KEY CLUSTERED ([FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC, [FACTURAS_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_FACTURA] ASC, [FACTURAS_ITEMS_ID] ASC),
    CONSTRAINT [IX_Facturas_items] UNIQUE NONCLUSTERED ([ITEM_FACTURACION_ID] ASC, [FACTURAS_ITEMS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [x_item_id]
    ON [dbo].[Facturas_items]([ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_factura_id_y_item_id]
    ON [dbo].[Facturas_items]([FACTURA_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC1_X_FACTURA_ID]
    ON [dbo].[Facturas_items]([FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_orden]
    ON [dbo].[Facturas_items]([FACTURA_ID] ASC, [orden] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC1_POR_PERIODO_ID]
    ON [dbo].[Facturas_items]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC1_X_FACTURA]
    ON [dbo].[Facturas_items]([NUMERO_FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [IX_Facturas_items_1]
    ON [dbo].[Facturas_items]([PERIODO_ID] ASC, [FACTURAS_ITEMS_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC1_X_PERIODO]
    ON [dbo].[Facturas_items]([PERIODO] ASC);
GO


## 134: Facturas_leyendas.sql
CREATE TABLE [dbo].[Facturas_leyendas] (
    [FACTURAS_LEYENDAS_ID] INT            NOT NULL,
    [FACTURA_ID]           INT            NULL,
    [LEYENDA]              VARCHAR (1000) NULL,
    PRIMARY KEY CLUSTERED ([FACTURAS_LEYENDAS_ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC, [FACTURAS_LEYENDAS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC12_X_FACTURA_ID]
    ON [dbo].[Facturas_leyendas]([FACTURA_ID] ASC);
GO


## 135: facturas_para_agrupar.sql
CREATE TABLE [dbo].[facturas_para_agrupar] (
    [FACTURA_ID]                    INT             NOT NULL,
    [QUE_ES]                        VARCHAR (19)    NULL,
    [TIPO]                          VARCHAR (1)     NULL,
    [NUMERO_FACTURA]                VARCHAR (19)    NULL,
    [SERVICIOS]                     VARCHAR (19)    NULL,
    [PERIODO]                       VARCHAR (10)    NULL,
    [PERIODO_ID]                    INT             NULL,
    [ANULADO]                       TINYINT         NULL,
    [IMPRESO]                       TINYINT         NULL,
    [ORDEN_IMPRESION]               INT             NULL,
    [CONTROL]                       TINYINT         NULL,
    [CLIENTE_ID]                    INT             NULL,
    [CLIENTE_SERVICIO_ID]           INT             NULL,
    [CLASIFICACION_IVA]             TINYINT         NULL,
    [IMPORTE]                       DECIMAL (15, 4) NULL,
    [SALDO]                         DECIMAL (15, 4) NULL,
    [PARA_INTERESES]                DECIMAL (15, 4) NULL,
    [FECHA_EMISION]                 DATETIME        NULL,
    [FECHA_VENCIMIENTO]             DATETIME        NULL,
    [Neto]                          DECIMAL (18, 2) NULL,
    [IVA_1]                         DECIMAL (18, 2) NULL,
    [IVA_2]                         DECIMAL (18, 2) NULL,
    [Exento]                        DECIMAL (18, 2) NULL,
    [IB]                            DECIMAL (18, 2) NULL,
    [Fecha_pago]                    DATETIME        NULL,
    [Neto_2]                        DECIMAL (18, 2) NULL,
    [Nota_de_credito]               VARCHAR (19)    NULL,
    [Puesto_id]                     INT             NULL,
    [Motivo]                        VARCHAR (20)    NULL,
    [Percepcion_id]                 INT             NULL,
    [periodo_calculo_id]            INT             NULL,
    [Debito_automatico]             INT             NULL,
    [desde]                         DATETIME        NULL,
    [hasta]                         DATETIME        NULL,
    [IVA_3]                         DECIMAL (18, 2) NULL,
    [IVA_4]                         DECIMAL (18, 2) NULL,
    [Interes]                       DECIMAL (9, 2)  NULL,
    [Iva_interes]                   DECIMAL (9, 2)  NULL,
    [fecha_intimacion]              DATETIME        NULL,
    [personal_neto]                 DECIMAL (18, 2) NULL,
    [personal_iva21]                DECIMAL (18, 2) NULL,
    [personal_iva27]                DECIMAL (18, 2) NULL,
    [personal_iva105]               DECIMAL (18, 2) NULL,
    [personal_iva135]               DECIMAL (18, 2) NULL,
    [movistar_neto]                 DECIMAL (18, 2) NULL,
    [movistar_iva21]                DECIMAL (18, 2) NULL,
    [movistar_iva27]                DECIMAL (18, 2) NULL,
    [movistar_iva105]               DECIMAL (18, 2) NULL,
    [movistar_iva135]               DECIMAL (18, 2) NULL,
    [intima]                        TINYINT         NULL,
    [recibida]                      TINYINT         NULL,
    [numero_intimacion]             INT             NULL,
    [fecha_suspension]              DATETIME        NULL,
    [cti_neto]                      DECIMAL (18, 2) NULL,
    [cti_iva21]                     DECIMAL (18, 2) NULL,
    [cti_iva27]                     DECIMAL (18, 2) NULL,
    [cti_iva105]                    DECIMAL (18, 2) NULL,
    [cti_iva135]                    DECIMAL (18, 2) NULL,
    [fecha_telecobranza]            DATETIME        NULL,
    [personal_pib]                  DECIMAL (18, 2) NULL,
    [movistar_pib]                  DECIMAL (18, 2) NULL,
    [cti_pib]                       DECIMAL (18, 2) NULL,
    [ruta]                          TINYINT         NULL,
    [item_opcional_neto]            DECIMAL (18, 2) NULL,
    [item_opcional_iva21]           DECIMAL (18, 2) NULL,
    [item_opcional_iva27]           DECIMAL (18, 2) NULL,
    [item_opcional_iva105]          DECIMAL (18, 2) NULL,
    [item_opcional_iva135]          DECIMAL (18, 2) NULL,
    [plan_de_pago]                  INT             NULL,
    [neto_plan_de_pago]             DECIMAL (18, 2) NULL,
    [caja_id]                       INT             NULL,
    [items_opcionales_pib]          DECIMAL (18, 2) NULL,
    [CAE]                           VARCHAR (50)    NULL,
    [fecha_vencimiento_cae]         VARCHAR (50)    NULL,
    [prejudicial]                   INT             NULL,
    [cantidad_ivr]                  TINYINT         NULL,
    [ivr]                           TINYINT         NULL,
    [usuario]                       VARCHAR (100)   NULL,
    [fecha_prejudicial]             DATETIME        NULL,
    [cuota_dvr]                     DECIMAL (18, 2) NULL,
    [lugar_pago1]                   VARBINARY (50)  NULL,
    [lugar_pago]                    VARCHAR (20)    NULL,
    [periodo_pago]                  VARCHAR (10)    NULL,
    [nextel_neto]                   DECIMAL (18, 2) NULL,
    [nextel_iva21]                  DECIMAL (18, 2) NULL,
    [nextel_iva105]                 DECIMAL (18, 2) NULL,
    [nextel_iva27]                  DECIMAL (18, 2) NULL,
    [nextel_iva135]                 DECIMAL (18, 2) NULL,
    [nextel_pib]                    DECIMAL (18, 2) NULL,
    [sub_caja_id]                   INT             NULL,
    [comprobante]                   VARCHAR (48)    NULL,
    [fecha_1er_intima]              INT             NULL,
    [fecha_2da_intima]              INT             NULL,
    [fecha_suspencion_gestion]      INT             NULL,
    [fecha_carta_doc]               INT             NULL,
    [fecha_aviso_corte]             INT             NULL,
    [fecha_corte_gestion]           INT             NULL,
    [orden_nuevo]                   INT             NULL,
    [factura_electronica]           INT             NULL,
    [mail_enviado]                  TINYINT         NULL,
    [fecha_pre_judicial_gestionado] INT             NOT NULL,
    [fecha_pre_judicial]            INT             NOT NULL,
    [fecha_vencimiento_city]        INT             NULL,
    [subdiario]                     VARCHAR (50)    NULL,
    [iva_negativo_city]             DECIMAL (18, 2) NULL,
    [Region]                        VARCHAR (50)    NULL,
    [MB_B]                          DECIMAL (18, 2) NULL,
    [MB_S]                          DECIMAL (18, 2) NULL,
    [tipo_tecnologia]               VARCHAR (50)    NULL,
    [categoria_telefonia]           VARCHAR (50)    NULL,
    [plan_comercial_id]             INT             NULL,
    [importe_enacom]                DECIMAL (18, 2) NULL,
    [domicilio_servicio]            VARCHAR (599)   NULL,
    [domicilio_postal]              VARCHAR (899)   NULL,
    [marca_devolver_interes]        TINYINT         NULL,
    [mail_primario]                 VARCHAR (120)   NULL,
    [mail_secundario]               VARCHAR (120)   NULL,
    [factura_de_credito]            TINYINT         NULL,
    [CIS]                           VARCHAR (15)    NULL,
    [cliente_servicio_agrupado_id]  INT             NULL,
    [facturado]                     TINYINT         NULL
);
GO


## 136: facturas_para_envios_1.sql
CREATE TABLE [dbo].[facturas_para_envios_1] (
    [ID]                    INT             NOT NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [MARCA]                 TINYINT         NULL,
    [MARCA_MAIL_SECUNDARIO] TINYINT         NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (19, 2) NULL,
    [PERIODO]               VARCHAR (19)    NOT NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [HORA_DE_ENVIO]         INT             NULL,
    [cliente]               VARCHAR (40)    NULL,
    [cis]                   VARCHAR (12)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC1_X_PERIODO]
    ON [dbo].[facturas_para_envios_1]([PERIODO] ASC);
GO


## 137: facturas_para_envios_1_suspension.sql
CREATE TABLE [dbo].[facturas_para_envios_1_suspension] (
    [ID]                    INT             NOT NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [CLIENTE]               VARCHAR (40)    NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [MARCA]                 TINYINT         NULL,
    [MARCA_MAIL_SECUNDARIO] TINYINT         NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (19, 2) NULL,
    [PERIODO]               VARCHAR (19)    NOT NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [HORA_DE_ENVIO]         INT             NULL,
    [CIS]                   VARCHAR (12)    NOT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CIS] ASC, [PERIODO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC1111_X_PERIODO]
    ON [dbo].[facturas_para_envios_1_suspension]([PERIODO] ASC);
GO


## 138: facturas_para_envios_aviso.sql
CREATE TABLE [dbo].[facturas_para_envios_aviso] (
    [ID]                    INT             NOT NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [CLIENTE]               VARCHAR (40)    NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [MARCA]                 TINYINT         NULL,
    [MARCA_MAIL_SECUNDARIO] TINYINT         NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (19, 2) NULL,
    [PERIODO]               VARCHAR (19)    NOT NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [HORA_DE_ENVIO]         INT             NULL,
    [CIS]                   VARCHAR (12)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC3_X_PERIODO]
    ON [dbo].[facturas_para_envios_aviso]([PERIODO] ASC);
GO


## 139: facturas_para_envios.sql
CREATE TABLE [dbo].[facturas_para_envios] (
    [ID]                    INT             NOT NULL,
    [MARCA]                 TINYINT         NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (39)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (13, 2) NULL,
    [PERIODO]               VARCHAR (19)    NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [email_1]               VARCHAR (59)    NULL,
    [marca_mail_secundario] TINYINT         NULL,
    [mail_secundario]       VARCHAR (59)    NULL,
    [hora_de_envio]         INT             NULL,
    [cliente]               VARCHAR (40)    NULL,
    [cis]                   VARCHAR (12)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC8_X_PERIODO]
    ON [dbo].[facturas_para_envios]([PERIODO] ASC);
GO


## 140: facturas_para_envios_suspension_guardado.sql
CREATE TABLE [dbo].[facturas_para_envios_suspension_guardado] (
    [ID]                    INT             NOT NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [CLIENTE]               VARCHAR (40)    NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [MARCA]                 TINYINT         NULL,
    [MARCA_MAIL_SECUNDARIO] TINYINT         NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (19, 2) NULL,
    [PERIODO]               VARCHAR (19)    NOT NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [HORA_DE_ENVIO]         INT             NULL,
    [CIS]                   VARCHAR (12)    NOT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CIS] ASC, [PERIODO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC311_X_PERIODO]
    ON [dbo].[facturas_para_envios_suspension_guardado]([PERIODO] ASC);
GO


## 141: facturas_para_envios_suspension.sql
CREATE TABLE [dbo].[facturas_para_envios_suspension] (
    [ID]                    INT             NOT NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [CLIENTE]               VARCHAR (40)    NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [MARCA]                 TINYINT         NULL,
    [MARCA_MAIL_SECUNDARIO] TINYINT         NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (19, 2) NULL,
    [PERIODO]               VARCHAR (19)    NOT NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [HORA_DE_ENVIO]         INT             NULL,
    [CIS]                   VARCHAR (12)    NOT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CIS] ASC, [PERIODO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC311_X_PERIODO]
    ON [dbo].[facturas_para_envios_suspension]([PERIODO] ASC);
GO


## 142: facturas_para_envios_vencimiento.sql
CREATE TABLE [dbo].[facturas_para_envios_vencimiento] (
    [ID]                    INT             NOT NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [CLIENTE]               VARCHAR (40)    NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [MARCA]                 TINYINT         NULL,
    [MARCA_MAIL_SECUNDARIO] TINYINT         NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (19, 2) NULL,
    [PERIODO]               VARCHAR (19)    NOT NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [HORA_DE_ENVIO]         INT             NULL,
    [CIS]                   VARCHAR (12)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC31_X_PERIODO]
    ON [dbo].[facturas_para_envios_vencimiento]([PERIODO] ASC);
GO


## 143: facturas_para_generar_avisos.sql
CREATE TABLE [dbo].[facturas_para_generar_avisos] (
    [ID]                    INT             NOT NULL,
    [FACTURA_ID]            INT             NULL,
    [CLIENTE_ID]            INT             NULL,
    [CLIENTE]               VARCHAR (40)    NULL,
    [SERVICIO_CUENTA]       INT             NULL,
    [TIPO_SERVICIO]         VARCHAR (19)    NULL,
    [MARCA]                 TINYINT         NULL,
    [MARCA_MAIL_SECUNDARIO] TINYINT         NULL,
    [EMAIL]                 VARCHAR (59)    NULL,
    [NUMERO_FACTURA]        VARCHAR (19)    NULL,
    [VENCIMIENTO]           INT             NULL,
    [IMPORTE]               DECIMAL (19, 2) NULL,
    [PERIODO]               VARCHAR (19)    NOT NULL,
    [DETALLE_1]             VARCHAR (39)    NULL,
    [DETALLE_2]             VARCHAR (39)    NULL,
    [FECHA_GENERACION_PDF]  INT             NULL,
    [FECHA_DE_ENVIO]        INT             NULL,
    [HORA_DE_ENVIO]         INT             NULL,
    [CIS]                   VARCHAR (12)    NOT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([CIS] ASC, [PERIODO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC1111_X_PERIODO]
    ON [dbo].[facturas_para_generar_avisos]([PERIODO] ASC);
GO


## 144: Facturas_plan_de_pago.sql
CREATE TABLE [dbo].[Facturas_plan_de_pago] (
    [FACTURA_ID]          INT             NOT NULL,
    [NUMERO_FACTURA]      VARCHAR (19)    NULL,
    [SERVICIOS]           VARCHAR (19)    NULL,
    [PERIODO]             VARCHAR (10)    NULL,
    [CLIENTE_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [IMPORTE]             DECIMAL (15, 4) NULL,
    [FECHA_VENCIMIENTO]   DATETIME        NULL,
    [INTERES]             DECIMAL (9, 2)  NULL,
    [IVA_INTERES]         DECIMAL (9, 2)  NULL,
    PRIMARY KEY CLUSTERED ([FACTURA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_FACTURA] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_FACTURA] ASC, [FACTURA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC6_FACTURAS_POR_SERVICIOS_Y_FECHA]
    ON [dbo].[Facturas_plan_de_pago]([SERVICIOS] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC6_X_CLIENTE_SERVICIO_Y_PERIODO]
    ON [dbo].[Facturas_plan_de_pago]([CLIENTE_SERVICIO_ID] ASC, [PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC6_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Facturas_plan_de_pago]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC6_X_CLIENTE_SERVICIO_ID_Y_ID]
    ON [dbo].[Facturas_plan_de_pago]([CLIENTE_SERVICIO_ID] ASC, [FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC6_FACTURAS_POR_SERVICIOS]
    ON [dbo].[Facturas_plan_de_pago]([SERVICIOS] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC6_X_TIPO_Y_NUMERO_FACTURA_Y_PERIODO_ID]
    ON [dbo].[Facturas_plan_de_pago]([NUMERO_FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC6_X_CLIENTE_SERVICIO_ID_Y_SERVICIO_Y_PERIODO_ID_Y_QUE_ES]
    ON [dbo].[Facturas_plan_de_pago]([CLIENTE_SERVICIO_ID] ASC, [SERVICIOS] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC6_X_CLIENTE_ID]
    ON [dbo].[Facturas_plan_de_pago]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC6_X_CLIENTE_ID_Y_ID]
    ON [dbo].[Facturas_plan_de_pago]([CLIENTE_ID] ASC, [FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC6_FACTURAS_POR_PERIODO]
    ON [dbo].[Facturas_plan_de_pago]([PERIODO] ASC);
GO


## 145: Facturas.sql
CREATE TABLE [dbo].[Facturas] (
    [FACTURA_ID]          INT             NOT NULL,
    [QUE_ES]              VARCHAR (19)    NULL,
    [TIPO]                VARCHAR (1)     NULL,
    [NUMERO_FACTURA]      VARCHAR (19)    NULL,
    [SERVICIOS]           VARCHAR (19)    NULL,
    [PERIODO]             VARCHAR (10)    NULL,
    [PERIODO_ID]          INT             NULL,
    [PERIODO_CALCULO_ID]  INT             NULL,
    [ANULADO]             TINYINT         NULL,
    [IMPRESO]             TINYINT         NULL,
    [ORDEN_IMPRESION]     INT             NULL,
    [NOTA_DE_CREDITO]     VARCHAR (19)    NULL,
    [MOTIVO]              VARCHAR (20)    NULL,
    [CONTROL]             TINYINT         NULL,
    [CLIENTE_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [CLASIFICACION_IVA]   TINYINT         NULL,
    [PERCEPCION_ID]       INT             NULL,
    [IMPORTE]             DECIMAL (15, 4) NULL,
    [SALDO]               DECIMAL (15, 4) NULL,
    [PARA_INTERESES]      DECIMAL (15, 4) NULL,
    [FECHA_EMISION]       DATETIME        NULL,
    [FECHA_VENCIMIENTO]   DATETIME        NULL,
    [FECHA_PAGO]          DATETIME        NULL,
    [NETO]                DECIMAL (11, 2) NULL,
    [NETO_2]              DECIMAL (11, 2) NULL,
    [IVA_1]               DECIMAL (11, 2) NULL,
    [IVA_2]               DECIMAL (11, 2) NULL,
    [EXENTO]              DECIMAL (11, 2) NULL,
    [IB]                  DECIMAL (11, 2) NULL,
    [PUESTO_ID]           INT             NULL,
    [DEBITO_AUTOMATICO]   TINYINT         NULL,
    [factura_de_credito]  TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([FACTURA_ID] ASC),
    UNIQUE NONCLUSTERED ([TIPO] ASC, [NUMERO_FACTURA] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [SERVICIOS] ASC, [PERIODO_ID] ASC, [QUE_ES] ASC),
    UNIQUE NONCLUSTERED ([PERIODO_ID] ASC, [FECHA_EMISION] ASC, [TIPO] ASC, [NUMERO_FACTURA] ASC, [FACTURA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_SERVICIO_Y_PERIODO]
    ON [dbo].[Facturas]([CLIENTE_SERVICIO_ID] ASC, [PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_ID_Y_ID]
    ON [dbo].[Facturas]([CLIENTE_ID] ASC, [FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_TIPO_Y_ORDEN_IMPRESION_Y_PERIODO]
    ON [dbo].[Facturas]([TIPO] ASC, [ORDEN_IMPRESION] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_POR_TIPO_Y_ID]
    ON [dbo].[Facturas]([TIPO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Facturas]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_POR_PERIODO]
    ON [dbo].[Facturas]([PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTUTAS_X_PERIODO_ID]
    ON [dbo].[Facturas]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_SERVICIO_ID_Y_ID]
    ON [dbo].[Facturas]([FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_X_CONTROL]
    ON [dbo].[Facturas]([CONTROL] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_X_CLASIFICACION_IVA]
    ON [dbo].[Facturas]([CLASIFICACION_IVA] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_POR_SERVICIOS]
    ON [dbo].[Facturas]([SERVICIOS] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_X_IMPRESA_RUTA_ORDEN_ORDEN]
    ON [dbo].[Facturas]([IMPRESO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_POR_SERVICIOS_Y_FECHA]
    ON [dbo].[Facturas]([SERVICIOS] ASC, [FECHA_EMISION] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_ID]
    ON [dbo].[Facturas]([CLIENTE_ID] ASC);
GO


## 146: Facturas_s.sql
CREATE TABLE [dbo].[Facturas_s] (
    [FACTURA_ID]                    INT             NOT NULL,
    [QUE_ES]                        VARCHAR (19)    NULL,
    [TIPO]                          VARCHAR (1)     NULL,
    [NUMERO_FACTURA]                VARCHAR (19)    NULL,
    [SERVICIOS]                     VARCHAR (19)    NULL,
    [PERIODO]                       VARCHAR (10)    NULL,
    [PERIODO_ID]                    INT             NULL,
    [ANULADO]                       TINYINT         NULL,
    [IMPRESO]                       TINYINT         NULL,
    [ORDEN_IMPRESION]               INT             NULL,
    [CONTROL]                       TINYINT         NULL,
    [CLIENTE_ID]                    INT             NULL,
    [CLIENTE_SERVICIO_ID]           INT             NULL,
    [CLASIFICACION_IVA]             TINYINT         NULL,
    [IMPORTE]                       DECIMAL (15, 4) NULL,
    [SALDO]                         DECIMAL (15, 4) NULL,
    [PARA_INTERESES]                DECIMAL (15, 4) NULL,
    [FECHA_EMISION]                 DATETIME        NULL,
    [FECHA_VENCIMIENTO]             DATETIME        NULL,
    [Neto]                          DECIMAL (18, 2) NULL,
    [IVA_1]                         DECIMAL (18, 2) NULL,
    [IVA_2]                         DECIMAL (18, 2) NULL,
    [Exento]                        DECIMAL (18, 2) NULL,
    [IB]                            DECIMAL (18, 2) NULL,
    [Fecha_pago]                    DATETIME        NULL,
    [Neto_2]                        DECIMAL (18, 2) NULL,
    [Nota_de_credito]               VARCHAR (19)    NULL,
    [Puesto_id]                     INT             NULL,
    [Motivo]                        VARCHAR (20)    NULL,
    [Percepcion_id]                 INT             NULL,
    [periodo_calculo_id]            INT             NULL,
    [Debito_automatico]             INT             NULL,
    [desde]                         DATETIME        NULL,
    [hasta]                         DATETIME        NULL,
    [IVA_3]                         DECIMAL (18, 2) NULL,
    [IVA_4]                         DECIMAL (18, 2) NULL,
    [Interes]                       DECIMAL (9, 2)  NULL,
    [Iva_interes]                   DECIMAL (9, 2)  NULL,
    [fecha_intimacion]              DATETIME        NULL,
    [personal_neto]                 DECIMAL (18, 2) NULL,
    [personal_iva21]                DECIMAL (18, 2) NULL,
    [personal_iva27]                DECIMAL (18, 2) NULL,
    [personal_iva105]               DECIMAL (18, 2) NULL,
    [personal_iva135]               DECIMAL (18, 2) NULL,
    [movistar_neto]                 DECIMAL (18, 2) NULL,
    [movistar_iva21]                DECIMAL (18, 2) NULL,
    [movistar_iva27]                DECIMAL (18, 2) NULL,
    [movistar_iva105]               DECIMAL (18, 2) NULL,
    [movistar_iva135]               DECIMAL (18, 2) NULL,
    [intima]                        TINYINT         NULL,
    [recibida]                      TINYINT         NULL,
    [numero_intimacion]             INT             NULL,
    [fecha_suspension]              DATETIME        NULL,
    [cti_neto]                      DECIMAL (18, 2) NULL,
    [cti_iva21]                     DECIMAL (18, 2) NULL,
    [cti_iva27]                     DECIMAL (18, 2) NULL,
    [cti_iva105]                    DECIMAL (18, 2) NULL,
    [cti_iva135]                    DECIMAL (18, 2) NULL,
    [fecha_telecobranza]            DATETIME        NULL,
    [personal_pib]                  DECIMAL (18, 2) NULL,
    [movistar_pib]                  DECIMAL (18, 2) NULL,
    [cti_pib]                       DECIMAL (18, 2) NULL,
    [ruta]                          TINYINT         NULL,
    [item_opcional_neto]            DECIMAL (18, 2) NULL,
    [item_opcional_iva21]           DECIMAL (18, 2) NULL,
    [item_opcional_iva27]           DECIMAL (18, 2) NULL,
    [item_opcional_iva105]          DECIMAL (18, 2) NULL,
    [item_opcional_iva135]          DECIMAL (18, 2) NULL,
    [plan_de_pago]                  INT             NULL,
    [neto_plan_de_pago]             DECIMAL (18, 2) NULL,
    [caja_id]                       INT             NULL,
    [items_opcionales_pib]          DECIMAL (18, 2) NULL,
    [CAE]                           VARCHAR (50)    NULL,
    [fecha_vencimiento_cae]         VARCHAR (50)    NULL,
    [prejudicial]                   INT             NULL,
    [cantidad_ivr]                  TINYINT         NULL,
    [ivr]                           TINYINT         NULL,
    [usuario]                       VARCHAR (100)   NULL,
    [fecha_prejudicial]             DATETIME        NULL,
    [cuota_dvr]                     DECIMAL (18, 2) NULL,
    [lugar_pago1]                   VARBINARY (50)  NULL,
    [lugar_pago]                    VARCHAR (20)    NULL,
    [periodo_pago]                  VARCHAR (10)    NULL,
    [nextel_neto]                   DECIMAL (18, 2) NULL,
    [nextel_iva21]                  DECIMAL (18, 2) NULL,
    [nextel_iva105]                 DECIMAL (18, 2) NULL,
    [nextel_iva27]                  DECIMAL (18, 2) NULL,
    [nextel_iva135]                 DECIMAL (18, 2) NULL,
    [nextel_pib]                    DECIMAL (18, 2) NULL,
    [sub_caja_id]                   INT             NULL,
    [comprobante]                   VARCHAR (48)    NULL,
    [fecha_1er_intima]              INT             NULL,
    [fecha_2da_intima]              INT             NULL,
    [fecha_suspencion_gestion]      INT             NULL,
    [fecha_carta_doc]               INT             NULL,
    [fecha_aviso_corte]             INT             NULL,
    [fecha_corte_gestion]           INT             NULL,
    [orden_nuevo]                   INT             NULL,
    [factura_electronica]           INT             NULL,
    [mail_enviado]                  TINYINT         NULL,
    [fecha_pre_judicial_gestionado] INT             DEFAULT ((0)) NOT NULL,
    [fecha_pre_judicial]            INT             DEFAULT ((0)) NOT NULL,
    [fecha_vencimiento_city]        INT             NULL,
    [subdiario]                     VARCHAR (50)    NULL,
    [iva_negativo_city]             DECIMAL (18, 2) NULL,
    [Region]                        VARCHAR (50)    NULL,
    [MB_B]                          DECIMAL (18, 2) NULL,
    [MB_S]                          DECIMAL (18, 2) NULL,
    [tipo_tecnologia]               VARCHAR (50)    NULL,
    [categoria_telefonia]           VARCHAR (50)    NULL,
    [plan_comercial_id]             INT             NULL,
    [importe_enacom]                DECIMAL (18, 2) NULL,
    [domicilio_servicio]            VARCHAR (599)   NULL,
    [domicilio_postal]              VARCHAR (899)   NULL,
    [marca_devolver_interes]        TINYINT         NULL,
    [mail_primario]                 VARCHAR (120)   NULL,
    [mail_secundario]               VARCHAR (120)   NULL,
    [factura_de_credito]            TINYINT         NULL,
    [CIS]                           VARCHAR (15)    NULL,
    [factura_agrupada]              TINYINT         NULL,
    [cliente_servicio_agrupado_id]  INT             NULL,
    [acerca_tv]                     INT             NULL,
    [primera_acerca_tv]             INT             NULL,
    [factura_paga_acerca_tv]        INT             NULL,
    [fecha_desde_ATV]               INT             NULL,
    [fecha_hasta_ATV]               INT             NULL,
    [base_acerca_tv]                DECIMAL (18, 2) NULL,
    [otros]                         DECIMAL (18, 2) NULL,
    [qr]                            VARCHAR (250)   NULL,
    CONSTRAINT [PK__Facturas__30AE302A] PRIMARY KEY CLUSTERED ([FACTURA_ID] ASC),
    CONSTRAINT [IX_Facturas_1] UNIQUE NONCLUSTERED ([PERIODO_ID] ASC, [FECHA_EMISION] ASC, [TIPO] ASC, [NUMERO_FACTURA] ASC, [FACTURA_ID] ASC),
    CONSTRAINT [UQ__Facturas__31A25463] UNIQUE NONCLUSTERED ([TIPO] ASC, [NUMERO_FACTURA] ASC, [QUE_ES] ASC)
);
GO
CREATE NONCLUSTERED INDEX [Facturas_por_servicios_y_fecha]
    ON [dbo].[Facturas_s]([SERVICIOS] ASC, [FECHA_EMISION] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_X_IMPRESA_RUTA_ORDEN_ORDEN]
    ON [dbo].[Facturas_s]([IMPRESO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_SERVICIO_Y_PERIODO]
    ON [dbo].[Facturas_s]([CLIENTE_SERVICIO_ID] ASC, [PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [IX_Facturas]
    ON [dbo].[Facturas_s]([FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_X_CLASIFICACION_IVA]
    ON [dbo].[Facturas_s]([CLASIFICACION_IVA] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_POR_PERIODO]
    ON [dbo].[Facturas_s]([PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [IX_Facturas_s]
    ON [dbo].[Facturas_s]([FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_X_CONTROL]
    ON [dbo].[Facturas_s]([CONTROL] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTURAS_POR_SERVICIOS]
    ON [dbo].[Facturas_s]([SERVICIOS] ASC);
GO
CREATE NONCLUSTERED INDEX [IX_Facturas_s_1]
    ON [dbo].[Facturas_s]([IMPRESO] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_FACTUTAS_X_PERIODO_ID]
    ON [dbo].[Facturas_s]([PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_ID_Y_ID]
    ON [dbo].[Facturas_s]([CLIENTE_ID] ASC, [FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_POR_TIPO_Y_ID]
    ON [dbo].[Facturas_s]([TIPO] ASC);
GO
CREATE NONCLUSTERED INDEX [x_tipo_y_numero_factura_y_periodo_id]
    ON [dbo].[Facturas_s]([TIPO] ASC, [NUMERO_FACTURA] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_SERVICIO_ID_Y_ID]
    ON [dbo].[Facturas_s]([FACTURA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [x_tipo_y_orden_impresion_y_periodo]
    ON [dbo].[Facturas_s]([TIPO] ASC, [ORDEN_IMPRESION] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [factura_x_num_solo]
    ON [dbo].[Facturas_s]([NUMERO_FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_ID]
    ON [dbo].[Facturas_s]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [FAC_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Facturas_s]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [UQ__Facturas__3296789C]
    ON [dbo].[Facturas_s]([CLIENTE_SERVICIO_ID] ASC, [SERVICIOS] ASC, [PERIODO_ID] ASC, [QUE_ES] ASC);
GO
CREATE NONCLUSTERED INDEX [x_numero_intimacion]
    ON [dbo].[Facturas_s]([numero_intimacion] ASC);
GO


## 147: fallas_tecnicas.sql
CREATE TABLE [dbo].[fallas_tecnicas] (
    [FALLAS_TECNICAS_ID] INT          NOT NULL,
    [DESCRIPCION]        VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([FALLAS_TECNICAS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FAL_X_DESCRIPCION]
    ON [dbo].[fallas_tecnicas]([DESCRIPCION] ASC);
GO


## 148: fecha_suspencion.sql
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


## 149: fecha_suspension_habilitacion.sql
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


## 150: feriados.sql
CREATE TABLE [dbo].[feriados] (
    [FERIADOS_ID] INT      NOT NULL,
    [DIA]         DATETIME NULL,
    PRIMARY KEY CLUSTERED ([FERIADOS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [FER_X_DIA]
    ON [dbo].[feriados]([DIA] ASC);
GO


## 151: Forma_de_entrega.sql
CREATE TABLE [dbo].[Forma_de_entrega] (
    [FORMA_DE_ENTREGA_ID] INT            NOT NULL,
    [TIPO]                VARCHAR (20)   NULL,
    [FORMA]               VARCHAR (20)   NULL,
    [CUOTAS]              TINYINT        NULL,
    [IMPORTE]             DECIMAL (7, 2) NULL,
    [ITEM_FACTURACION_ID] INT            NULL,
    [Servicio]            VARCHAR (10)   NULL,
    PRIMARY KEY CLUSTERED ([FORMA_DE_ENTREGA_ID] ASC)
);
GO


## 152: Generador_QR.sql
CREATE TABLE [dbo].[Generador_QR] (
    [NRO_FACTURA]       VARCHAR (15)  NOT NULL,
    [INTENCION_DE_PAGO] VARCHAR (259) NULL,
    [ESTADO]            TINYINT       NULL,
    [FECHA_CREACION]    DATETIME      NULL,
    [FECHA_UPDATE]      DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([NRO_FACTURA] ASC)
);
GO
CREATE TRIGGER [dbo].[TR_UPDATE_GENERADOR_QR_FECHA_UPDATE]
ON [dbo].[Generador_QR]
FOR UPDATE
AS
BEGIN
	UPDATE [dbo].[Generador_QR]
	SET FECHA_UPDATE = GETDATE()
	FROM inserted
	WHERE [dbo].[Generador_QR].NRO_FACTURA = inserted.NRO_FACTURA
END;
GO


## 153: Gerencias_solicitudes.sql
CREATE TABLE [dbo].[Gerencias_solicitudes] (
    [ID]       INT          NOT NULL,
    [GERENCIA] VARCHAR (44) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 154: gestion_personal.sql
CREATE TABLE [dbo].[gestion_personal] (
    [ID]                  INT             NOT NULL,
    [CLIENTE_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [TELEFONO]            VARCHAR (29)    NULL,
    [NUMERO_FACTURA]      VARCHAR (19)    NULL,
    [SALDO]               DECIMAL (15, 2) NULL,
    [VENCIMIENTO]         INT             NULL,
    [OPERADOR]            VARCHAR (40)    NULL,
    [FECHA]               DATETIME        NULL,
    [COMENTARIO]          VARCHAR (254)   NULL,
    [ATENDIDO]            TINYINT         NULL,
    [ESTADO]              TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [GES_X_CLIENTE_ID]
    ON [dbo].[gestion_personal]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [GES_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[gestion_personal]([CLIENTE_SERVICIO_ID] ASC);
GO


## 155: guia_telefonos.sql
CREATE TABLE [dbo].[guia_telefonos] (
    [guia_telefonos_id] INT           NOT NULL,
    [telefono]          INT           NOT NULL,
    [apellido_nombre]   VARCHAR (255) NOT NULL,
    [direccion]         VARCHAR (255) NULL,
    [compania]          TINYINT       NULL,
    CONSTRAINT [PK_guia_telefonos] PRIMARY KEY CLUSTERED ([guia_telefonos_id] ASC)
);
GO
CREATE NONCLUSTERED INDEX [x_telefono]
    ON [dbo].[guia_telefonos]([telefono] ASC);
GO
CREATE NONCLUSTERED INDEX [x_apellido_nombre]
    ON [dbo].[guia_telefonos]([apellido_nombre] ASC);
GO
CREATE NONCLUSTERED INDEX [x_compania]
    ON [dbo].[guia_telefonos]([compania] ASC);
GO


## 156: HACER_NOTA_DE_CREDITO.sql
CREATE TABLE [dbo].[HACER_NOTA_DE_CREDITO] (
    [PRE_HACER_NOTA_DE_CREDITO_ID] INT             NOT NULL,
    [CLIENTE_ID]                   INT             NULL,
    [NUMERO_FACTURA]               VARCHAR (15)    NULL,
    [NUMERO_NOTA_DE_CREDITO]       VARCHAR (15)    NULL,
    [PERIODO]                      VARCHAR (9)     NULL,
    [IMPORTE_FACTURA]              DECIMAL (9, 2)  NULL,
    [IMPORTE_CREDITO]              DECIMAL (9, 2)  NULL,
    [DIFERENCIA]                   DECIMAL (11, 2) NULL,
    [RECIBO]                       INT             NULL,
    [FECHA_RECIBO]                 INT             NULL,
    [FORMA_PAGO]                   VARCHAR (200)   NULL,
    [IMPRESA]                      TINYINT         NULL,
    [TESORERIA]                    TINYINT         NULL,
    [CUENTA]                       INT             NULL,
    [NOMBRE]                       VARCHAR (40)    NULL,
    [METROS]                       DECIMAL (9, 2)  NULL,
    [PREMIOS_Y_CASTIGOS_ID]        INT             NULL,
    PRIMARY KEY CLUSTERED ([PRE_HACER_NOTA_DE_CREDITO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [HAC5_HACER_NOTA_DE_CREDITO_X_RECIBO]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([RECIBO] ASC);
GO
CREATE NONCLUSTERED INDEX [HAC5_HACER_NOTA_DE_CREDITO_X_PERIODO]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [HAC5_HARCER_NOTA_DE_CREDITO_X_CUENTA_Y_PERIODO]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([CUENTA] ASC, [PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [HAC5_HACER_NOTA_DE_CREDITO_X_FACTURA]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([NUMERO_FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [HAC5_HACER_NOTA_DE_CREDITO_X_CUENTA]
    ON [dbo].[HACER_NOTA_DE_CREDITO]([CLIENTE_ID] ASC);
GO


## 157: historial_directv_publicidad.sql
CREATE TABLE [dbo].[historial_directv_publicidad] (
    [ID]          INT          NOT NULL,
    [CLIENTE_ID]  INT          NULL,
    [SERVICIO_ID] INT          NULL,
    [EMAIL]       VARCHAR (43) NULL,
    [FECHA]       DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 158: historial_electronico.sql
CREATE TABLE [dbo].[historial_electronico] (
    [ID_HISTORIAL]        INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [FACTURA_ELECTRONICA] TINYINT       NULL,
    [AVISO_ELECTRONICO]   TINYINT       NULL,
    [COMENTARIO]          VARCHAR (999) NULL,
    [USUARIO]             VARCHAR (49)  NULL,
    [PERIODO]             VARCHAR (49)  NULL,
    [FECHA]               DATETIME      NULL,
    [motivo]              VARCHAR (500) NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORIAL] ASC)
);
GO
CREATE NONCLUSTERED INDEX [HIS8_X_ID_Y_CLIENTE_SERVICIO]
    ON [dbo].[historial_electronico]([CLIENTE_SERVICIO_ID] ASC);
GO


## 159: historial_internet.sql
CREATE TABLE [dbo].[historial_internet] (
    [ID_HISTORIAL]        INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [COMENTARIO]          VARCHAR (249) NULL,
    [USUARIO]             VARCHAR (49)  NULL,
    [FECHA]               DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORIAL] ASC)
);
GO


## 160: historial_telefonia.sql
CREATE TABLE [dbo].[historial_telefonia] (
    [ID]                  INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [TELEFONO]            VARCHAR (49)  NULL,
    [COMENTARIO]          VARCHAR (119) NULL,
    [FECHA]               DATETIME      NULL,
    [cis]                 VARCHAR (90)  NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [HIS3_X_TELEFONO]
    ON [dbo].[historial_telefonia]([TELEFONO] ASC);
GO


## 161: historico_avisos_ivr.sql
CREATE TABLE [dbo].[historico_avisos_ivr] (
    [HISTORICO_IVR]  INT          NOT NULL,
    [CLIENTE_ID]     INT          NULL,
    [SERVICIO_ID]    INT          NULL,
    [SERVICIO]       VARCHAR (19) NULL,
    [NUMERO_FACTURA] VARCHAR (24) NULL,
    [PERIODO]        VARCHAR (19) NULL,
    [TIPO_DE_AVISO]  VARCHAR (19) NULL,
    [OPERADOR]       VARCHAR (19) NULL,
    [FECHA]          DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([HISTORICO_IVR] ASC)
);
GO


## 162: Historico_cambio_datos_serv.sql
CREATE TABLE [dbo].[Historico_cambio_datos_serv] (
    [HISTORICO_ID]        INT          NOT NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [FECHA]               DATETIME     NULL,
    [OPERADOR]            VARCHAR (43) NULL,
    [CODIGO_CALLE_P]      INT          NULL,
    [CALLE_POSTAL]        VARCHAR (59) NULL,
    [NUMERO_P]            INT          NULL,
    [SECTOR_P]            VARCHAR (19) NULL,
    [BLOCK_P]             INT          NULL,
    [TORRE_P]             VARCHAR (19) NULL,
    [PISO_P]              VARCHAR (19) NULL,
    [DTO_P]               VARCHAR (19) NULL,
    [CASA_P]              VARCHAR (19) NULL,
    [BARRIO_P]            VARCHAR (19) NULL,
    [LOCALIDAD_ID]        INT          NULL,
    [CODIGO_POSTAL]       VARCHAR (4)  NULL,
    PRIMARY KEY CLUSTERED ([HISTORICO_ID] ASC)
);
GO


## 163: historico_cambio_interes.sql
CREATE TABLE [dbo].[historico_cambio_interes] (
    [ID]      INT          NULL,
    [USUARIO] VARCHAR (49) NULL,
    [MOTIVO]  VARCHAR (59) NULL,
    [FECHA]   DATETIME     NULL
);
GO


## 164: Historico_cambio_posiciones.sql
CREATE TABLE [dbo].[Historico_cambio_posiciones] (
    [ID]                  INT          NOT NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [OPERADOR]            VARCHAR (49) NULL,
    [DESCRIPCION]         VARCHAR (89) NULL,
    [FECHA]               DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 165: historico_consulta_c.sql
CREATE TABLE [dbo].[historico_consulta_c] (
    [ID_HISTORICO]  INT           NOT NULL,
    [ID_CONSULTA_C] INT           NULL,
    [FECHA]         DATETIME      NULL,
    [USUARIO]       VARCHAR (29)  NULL,
    [COMENTARIO]    VARCHAR (119) NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);
GO


## 166: historico_equipos.sql
CREATE TABLE [dbo].[historico_equipos] (
    [HISTORICO_EQUIPO_ID] INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [MOD_ID]              INT           NULL,
    [OBSERVACIONES]       VARCHAR (199) NULL,
    [FECHA_BAJA]          DATETIME      NULL,
    [FECHA_MOD]           DATETIME      NULL,
    [modem_id]            INT           NULL,
    [cpe_id]              INT           NULL,
    [ata_id]              INT           NULL,
    [devuelve_m]          INT           NULL,
    [devuelve_c]          INT           NULL,
    [devuelve_a]          INT           NULL,
    UNIQUE NONCLUSTERED ([HISTORICO_EQUIPO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [HIS_X_MOD_ID]
    ON [dbo].[historico_equipos]([MOD_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HIS_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[historico_equipos]([CLIENTE_SERVICIO_ID] ASC);
GO


## 167: historico_forma_de_entrega.sql
CREATE TABLE [dbo].[historico_forma_de_entrega] (
    [ID]                 INT            NULL,
    [ID_FORMA]           INT            NULL,
    [TIPO]               VARCHAR (21)   NULL,
    [FORMA]              VARCHAR (20)   NULL,
    [SERVICIO]           VARCHAR (19)   NULL,
    [IMPORTE_VIEJO]      DECIMAL (7, 2) NULL,
    [IMPORTE_NUEVO]      DECIMAL (7, 2) NULL,
    [OPERADOR]           VARCHAR (142)  NULL,
    [FECHA_MODIFICACION] DATETIME       NULL
);
GO


## 168: historico_gestion.sql
CREATE TABLE [dbo].[historico_gestion] (
    [ID_HISTORICO]        INT          NOT NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [SERVICIO]            VARCHAR (19) NULL,
    [NUMERO_FACTURA]      VARCHAR (19) NULL,
    [PERIODO]             VARCHAR (29) NULL,
    [OPERADOR]            VARCHAR (49) NULL,
    [FECHA]               DATETIME     NULL,
    [COMENTARIO]          VARCHAR (89) NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);
GO


## 169: historico_llamado_rechazado.sql
CREATE TABLE [dbo].[historico_llamado_rechazado] (
    [HISTO_ID]            INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [OPERADOR_ID]         INT           NULL,
    [OPERADOR]            VARCHAR (39)  NULL,
    [FECHA]               DATETIME      NULL,
    [TIPO_RESPUESTA]      TINYINT       NULL,
    [RESPUESTA]           VARCHAR (19)  NULL,
    [COMENTARIO]          VARCHAR (599) NULL,
    [gas]                 TINYINT       NULL,
    [nombre_apellido]     VARCHAR (60)  NULL,
    [tel_contacto]        VARCHAR (30)  NULL,
    PRIMARY KEY CLUSTERED ([HISTO_ID] ASC)
);
GO


## 170: historico_mails.sql
CREATE TABLE [dbo].[historico_mails] (
    [ID_HISTO_MAIL]       INT           NOT NULL,
    [MAILS_ID]            INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [MAIL]                VARCHAR (100) NULL,
    [CUOTA]               INT           NULL,
    [FECHA_S]             DATETIME      NULL,
    [OBSERVACION]         VARCHAR (998) NULL,
    [OPERADOR_ID]         INT           NULL,
    [ITEM_HOSTING_ID]     INT           NULL,
    [ESTADO]              TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTO_MAIL] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MAI1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[historico_mails]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MAI1_X_MAIL_Y_ITEM_HOSTING_ID]
    ON [dbo].[historico_mails]([MAIL] ASC, [ITEM_HOSTING_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MAI1_X_MAIL_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[historico_mails]([MAILS_ID] ASC, [ID_HISTO_MAIL] ASC, [OPERADOR_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MAI1_X_ITEM_HOSTING_ID]
    ON [dbo].[historico_mails]([ITEM_HOSTING_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MAI1_X_MAILS_ID]
    ON [dbo].[historico_mails]([MAILS_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MAI1_X_MAIL]
    ON [dbo].[historico_mails]([MAIL] ASC);
GO
CREATE NONCLUSTERED INDEX [MAI1_KEY_OPERADOR_ID]
    ON [dbo].[historico_mails]([OPERADOR_ID] ASC);
GO


## 171: historico_movimiento_ip.sql
CREATE TABLE [dbo].[historico_movimiento_ip] (
    [ID_HISTORICO]        INT          NOT NULL,
    [ID_CLIENTE_SERVICIO] INT          NULL,
    [IP]                  VARCHAR (49) NULL,
    [MOTIVO]              VARCHAR (89) NULL,
    [FECHA_MODIIC]        DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);
GO


## 172: historico_mov_posiciones.sql
CREATE TABLE [dbo].[historico_mov_posiciones] (
    [ID_HISTORICO]     INT          NOT NULL,
    [CLIENTE_SERVICIO] INT          NULL,
    [CLIENTE_ID]       INT          NULL,
    [MOTIVO]           VARCHAR (64) NULL,
    [POS_ID]           INT          NULL,
    [FECHA]            DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);
GO


## 173: historico_pares.sql
CREATE TABLE [dbo].[historico_pares] (
    [ID]                  INT          NOT NULL,
    [PAR_ID]              INT          NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [MOTIVO]              VARCHAR (59) NULL,
    [FECHA]               DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [HIS4_X_PAR_ID]
    ON [dbo].[historico_pares]([PAR_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HIS4_X_CLIENTE_ID]
    ON [dbo].[historico_pares]([CLIENTE_ID] ASC);
GO


## 174: historico_puertos.sql
CREATE TABLE [dbo].[historico_puertos] (
    [ID]                  INT          NOT NULL,
    [PUERTO_ID]           INT          NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [MOTIVO]              VARCHAR (59) NULL,
    [FECHA]               DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [HIS5_X_PUERTO_ID]
    ON [dbo].[historico_puertos]([PUERTO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HIS5_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[historico_puertos]([CLIENTE_SERVICIO_ID] ASC);
GO


## 175: Historico_Reclamo.sql
CREATE TABLE [dbo].[Historico_Reclamo] (
    [HISTO_RECLAMO_ID]     INT           NOT NULL,
    [USUARIO_HISTORICO]    INT           NULL,
    [FECHA_HISTORICO]      DATETIME      NULL,
    [SERVICIO]             VARCHAR (40)  NULL,
    [MEDIO_ALTA_ID]        INT           NULL,
    [RECLAMOS_ID]          INT           NULL,
    [OPERADOR_ID]          INT           NULL,
    [CLIENTE_ID]           INT           NULL,
    [CLIENTE_SERVICIO_ID]  INT           NULL,
    [FECHA]                DATETIME      NULL,
    [FECHA_GUARDAR]        DATETIME      NULL,
    [TIPO_RECLAMO_ID]      INT           NULL,
    [DERIVAR_A]            INT           NULL,
    [OBSERVACIONES]        VARCHAR (999) NULL,
    [VENCE]                DATETIME      NULL,
    [SOLUCION_ID]          INT           NULL,
    [FECHA_SOLUCION]       DATETIME      NULL,
    [ESTADO]               INT           NULL,
    [ESTADO_POR]           INT           NULL,
    [PRIORIDAD]            INT           NULL,
    [ELIMINADO]            INT           NULL,
    [ELIMINADO_POR]        INT           NULL,
    [ESTADO_DERIVADO]      INT           NULL,
    [ESTADO_DERIVADO_POR]  INT           NULL,
    [AREA_SOLUCIONA]       INT           NULL,
    [OPERADOR_SOLUCIONA]   INT           NULL,
    [OBSERVACION_SOLUCION] VARCHAR (999) NULL,
    [observacion_operador] VARCHAR (999) NULL,
    [modif_tipo_reclamo]   TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([HISTO_RECLAMO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_TIPO_RECLAMO]
    ON [dbo].[Historico_Reclamo]([TIPO_RECLAMO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_HISTO_ESTADO_POR]
    ON [dbo].[Historico_Reclamo]([ESTADO_POR] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEYESTADO_RECLAMO]
    ON [dbo].[Historico_Reclamo]([ESTADO] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_MEDIO_ALTA_ID]
    ON [dbo].[Historico_Reclamo]([MEDIO_ALTA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_SOLUCION_ID]
    ON [dbo].[Historico_Reclamo]([SOLUCION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_OPERADOR_ID]
    ON [dbo].[Historico_Reclamo]([OPERADOR_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_OPERADOR_USUARIO]
    ON [dbo].[Historico_Reclamo]([USUARIO_HISTORICO] ASC, [OPERADOR_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEYPRIORIDAD]
    ON [dbo].[Historico_Reclamo]([PRIORIDAD] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_CLIENTE_ID]
    ON [dbo].[Historico_Reclamo]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_ELIMINADO_POR]
    ON [dbo].[Historico_Reclamo]([ELIMINADO_POR] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_CLIENTE_SERVICIO_ID]
    ON [dbo].[Historico_Reclamo]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_USUARIO_HISTORICO]
    ON [dbo].[Historico_Reclamo]([USUARIO_HISTORICO] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_HISTO_AREA_SOLUCIONA]
    ON [dbo].[Historico_Reclamo]([OPERADOR_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_RECLAMO]
    ON [dbo].[Historico_Reclamo]([RECLAMOS_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [HISTO_KEY_HISTO_RECLAMO]
    ON [dbo].[Historico_Reclamo]([RECLAMOS_ID] ASC, [HISTO_RECLAMO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [key_histo_id_y_reclamo_id]
    ON [dbo].[Historico_Reclamo]([HISTO_RECLAMO_ID] ASC, [RECLAMOS_ID] ASC);
GO


## 176: importe_servicios_rentas.sql
CREATE TABLE [dbo].[importe_servicios_rentas] (
    [ID]       INT             NOT NULL,
    [SERVICIO] VARCHAR (43)    NULL,
    [IMPORTE]  DECIMAL (13, 2) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [IMP_X_SER]
    ON [dbo].[importe_servicios_rentas]([SERVICIO] ASC);
GO


## 177: impresoras.sql
CREATE TABLE [dbo].[impresoras] (
    [ID_IMPRESORA] INT NOT NULL,
    [MODELO_ID]    INT NULL,
    [MARCA_ID]     INT NULL,
    PRIMARY KEY CLUSTERED ([ID_IMPRESORA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [IMP_KEY_MODELO_ID]
    ON [dbo].[impresoras]([MODELO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [IMP_KEY_MARCA_ID]
    ON [dbo].[impresoras]([MARCA_ID] ASC);
GO


## 178: inconsistencia_bajas_planes.sql
CREATE TABLE [dbo].[inconsistencia_bajas_planes] (
    [INCONSISTENCIA_BAJAS_PLANES_ID] INT          NOT NULL,
    [CLIENTE_ID]                     INT          NULL,
    [CLIENTE_SERVICIO_ID]            INT          NULL,
    [PLAN_INTERNET_ID]               INT          NULL,
    [PLAN_TELEFONIA_ID]              INT          NULL,
    [SERVICIO]                       VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([INCONSISTENCIA_BAJAS_PLANES_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [BAJ_X_PLAN_INTERNET_ID]
    ON [dbo].[inconsistencia_bajas_planes]([PLAN_INTERNET_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [BAJ_X_SERVICIO]
    ON [dbo].[inconsistencia_bajas_planes]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [BAJ_X_PLAN_TELEFONIA_ID]
    ON [dbo].[inconsistencia_bajas_planes]([PLAN_TELEFONIA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [BAJ_X_PLAN_TELEFONIA_E_INTERNET_ID]
    ON [dbo].[inconsistencia_bajas_planes]([PLAN_TELEFONIA_ID] ASC, [PLAN_INTERNET_ID] ASC);
GO


## 179: ingresos_brutos.sql
### Vacía. No contiene datos.
CREATE TABLE [dbo].[ingresos_brutos] (
    [INGRESOS_BRUTOS_ID] INT             NOT NULL,
    [PERIODO_ID]         INT             NULL,
    [SERVICIO]           VARCHAR (19)    NULL,
    [COMPROBANTE]        VARCHAR (19)    NULL,
    [TIPO]               VARCHAR (1)     NULL,
    [NUMERO_DE_FACTURA]  VARCHAR (19)    NULL,
    [NETO_IMPONIBLE]     DECIMAL (11, 2) NULL,
    [PERCEPCION]         DECIMAL (11, 2) NULL,
    [CUIT]               VARCHAR (13)    NULL,
    [FECHA]              DATETIME        NULL,
    PRIMARY KEY CLUSTERED ([INGRESOS_BRUTOS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ING_POR_SERVICIO_Y_POR_FECHA]
    ON [dbo].[ingresos_brutos]([SERVICIO] ASC, [FECHA] ASC);
GO
CREATE NONCLUSTERED INDEX [ING_INGRESOS_BRUTOS_X_PERIODO_ID]
    ON [dbo].[ingresos_brutos]([PERIODO_ID] ASC);
GO


## 180: ip_nodos.sql
CREATE TABLE [dbo].[ip_nodos] (
    [IP_ID]        INT          NOT NULL,
    [NUM_IP]       VARCHAR (19) NULL,
    [RANGO_INICIO] INT          NULL,
    [RANGO_FIN]    INT          NULL,
    [CLIENTE_ID]   INT          NULL,
    [RANGO]        INT          NULL,
    [IP_UTILIZADA] TINYINT      NULL,
    [NODO_ID]      INT          NULL,
    [P1]           INT          NULL,
    [P2]           INT          NULL,
    [P3]           VARCHAR (19) NULL,
    [P4]           VARCHAR (19) NULL,
    [motivo]       VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([IP_ID] ASC)
);
GO


## 181: irs_2.sql
CREATE TABLE [dbo].[irs_2] (
    [ID_IRS_2]       INT          NOT NULL,
    [PERIODO]        VARCHAR (29) NULL,
    [PROVINCIA]      VARCHAR (19) NULL,
    [PARTIDO_DEPTO]  VARCHAR (29) NULL,
    [LOCALIDAD]      VARCHAR (29) NULL,
    [TIPO_DE_ACCESO] VARCHAR (29) NULL,
    [TECNOLOGIA]     VARCHAR (19) NULL,
    [CUENTAS]        INT          NULL,
    [ANIO]           INT          NULL,
    PRIMARY KEY CLUSTERED ([ID_IRS_2] ASC)
);
GO
CREATE NONCLUSTERED INDEX [IRS_X_PERIODO]
    ON [dbo].[irs_2]([PERIODO] ASC);
GO


## 182: irs_3.sql
CREATE TABLE [dbo].[irs_3] (
    [ID_IRS_3]       INT             NOT NULL,
    [PERIODO]        VARCHAR (29)    NULL,
    [PROVINCIA]      VARCHAR (29)    NULL,
    [PARTIDO_DEPTO]  VARCHAR (29)    NULL,
    [LOCALIDAD]      VARCHAR (29)    NULL,
    [VELOCIDAD]      DECIMAL (13, 2) NULL,
    [CUENTAS]        INT             NULL,
    [INGRESOS]       DECIMAL (13, 2) NULL,
    [ANIO]           INT             NULL,
    [id_velocidades] VARCHAR (50)    NULL,
    PRIMARY KEY CLUSTERED ([ID_IRS_3] ASC)
);
GO
CREATE NONCLUSTERED INDEX [IRS1_X_VELOCIDAD]
    ON [dbo].[irs_3]([VELOCIDAD] ASC);
GO
CREATE NONCLUSTERED INDEX [IRS1_X_PERIODO]
    ON [dbo].[irs_3]([PERIODO] ASC);
GO


## 183: item_a_modificar_en_habilitacion.sql
CREATE TABLE [dbo].[item_a_modificar_en_habilitacion] (
    [ID]      INT     NOT NULL,
    [ITEM_ID] INT     NULL,
    [CARGAR]  TINYINT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE4_X_ITEM]
    ON [dbo].[item_a_modificar_en_habilitacion]([ITEM_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE4_X_CARGAR]
    ON [dbo].[item_a_modificar_en_habilitacion]([CARGAR] ASC);
GO


## 184: Items_clientes_servicios_en_archivo.sql
CREATE TABLE [dbo].[Items_clientes_servicios_en_archivo] (
    [ITEMS_CLIENTES_SERVICIOS_EN_ARCHIVO_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]                    INT             NULL,
    [DESCRIPCION]                            VARCHAR (40)    NULL,
    [CUOTA]                                  TINYINT         NULL,
    [CUOTAS]                                 TINYINT         NULL,
    [COLUMNA_SUBDIARIO]                      TINYINT         NULL,
    [SUSPENDIDO]                             TINYINT         NULL,
    [SERVICIOS]                              VARCHAR (19)    NULL,
    [FACTURA]                                VARCHAR (19)    NULL,
    [IMPORTE]                                DECIMAL (11, 2) NULL,
    [MARCA]                                  TINYINT         NULL,
    [PERIODO_ID]                             INT             NULL,
    [Item_facturacion_id]                    INT             NULL,
    [factura_que_lo_genero_id]               INT             NULL,
    [factura_que_lo_genero]                  VARCHAR (50)    NULL,
    CONSTRAINT [PK__Items_clientes_s__02E7657A] PRIMARY KEY CLUSTERED ([ITEMS_CLIENTES_SERVICIOS_EN_ARCHIVO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE112_ITEMS_DE_ARCHIVO_X_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_clientes_servicios_en_archivo]([ITEMS_CLIENTES_SERVICIOS_EN_ARCHIVO_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE112_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_clientes_servicios_en_archivo]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [por_factura_que_lo_genero]
    ON [dbo].[Items_clientes_servicios_en_archivo]([factura_que_lo_genero_id] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE112_ITEMS_DE_ARCHIVO_X_ID_Y_CLIENTE_ID]
    ON [dbo].[Items_clientes_servicios_en_archivo]([ITEMS_CLIENTES_SERVICIOS_EN_ARCHIVO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE112_POR_CABECERA_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_clientes_servicios_en_archivo]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [UQ__Items_clientes_s__03DB89B3]
    ON [dbo].[Items_clientes_servicios_en_archivo]([CLIENTE_SERVICIO_ID] ASC, [PERIODO_ID] ASC, [CUOTA] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE112_ITEMS_EN_ARCHIVOS_DETALLE_X_DESCRIPCION]
    ON [dbo].[Items_clientes_servicios_en_archivo]([DESCRIPCION] ASC);
GO


## 185: Items_en_clientes_servicios_acerca_tv.sql
CREATE TABLE [dbo].[Items_en_clientes_servicios_acerca_tv] (
    [ITEMS_EN_CLIENTE_SERVICIO_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]          INT             NULL,
    [PLAN_COMERCIAL_ID]            INT             NULL,
    [ITEM_FACTURACION_ID]          INT             NULL,
    [SUSPENDIDO]                   TINYINT         NULL,
    [VIGENCIA]                     DATETIME        NULL,
    [CANTIDAD_CUOTAS]              INT             NULL,
    [CUOTA_ACTUAL]                 INT             NULL,
    [ORDEN]                        INT             NULL,
    [VALOR]                        DECIMAL (19, 6) NULL,
    [PORCENTAJE_DESCUENTO]         DECIMAL (7, 2)  NULL,
    [ITEM_APLICACION_ID]           INT             NULL,
    [ITEM_FUERA_DE_PLAN]           TINYINT         NULL,
    [VER_EN_TECNICA]               TINYINT         NULL,
    [CANTIDAD_DE_ITEMS]            TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ORDEN] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE116_X_CLIENTE_SERVICIO_ID_Y_ITEM_FACTURACION_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE116_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE116_ITEMS_EN_CLIENTES_SERVICIOS_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE116_POR_PLAN_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([PLAN_COMERCIAL_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE116_X_ITEM_FACTURACION_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE116_POR_FECHA_VIGENCIA]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([VIGENCIA] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE116_POR_PLAN_ID_Y_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios_acerca_tv]([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO


## 186: Items_en_clientes_servicios_historico.sql
CREATE TABLE [dbo].[Items_en_clientes_servicios_historico] (
    [ITEMS_EN_CLIENTE_SERVICIO_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]          INT             NULL,
    [PLAN_COMERCIAL_ID]            INT             NULL,
    [ITEM_FACTURACION_ID]          INT             NULL,
    [SUSPENDIDO]                   TINYINT         NULL,
    [VIGENCIA]                     DATETIME        NULL,
    [CANTIDAD_CUOTAS]              INT             NULL,
    [CUOTA_ACTUAL]                 INT             NULL,
    [ORDEN]                        INT             NULL,
    [VALOR]                        DECIMAL (18, 6) NULL,
    [PORCENTAJE_DESCUENTO]         DECIMAL (7, 2)  NULL,
    [ITEM_APLICACION_ID]           INT             NULL,
    [ITEM_FUERA_DE_PLAN]           TINYINT         NULL,
    [NUMERO_FACTURA]               VARCHAR (19)    NULL,
    [TIPO_FACTURA]                 VARCHAR (1)     NULL,
    [cantidad_de_items]            TINYINT         NULL,
    [modificacion]                 VARCHAR (50)    NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [UQ__Items_en_cliente__758D6A5C] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ITEMS_EN_CLIENTE_SERVICIO_ID] ASC),
    CONSTRAINT [UQ__Items_en_cliente__76818E95] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ORDEN] ASC, [ITEMS_EN_CLIENTE_SERVICIO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE111_POR_PLAN_ID_Y_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios_historico]([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE111_ITEMS_EN_CLIENTES_SERVICIOS_X_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios_historico]([ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE111_POR_PLAN_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_historico]([PLAN_COMERCIAL_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE111_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_historico]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE111_POR_FECHA_VIGENCIA]
    ON [dbo].[Items_en_clientes_servicios_historico]([VIGENCIA] ASC);
GO
CREATE NONCLUSTERED INDEX [x_cliente_servicio_y_item]
    ON [dbo].[Items_en_clientes_servicios_historico]([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO


## 187: Items_en_clientes_servicios_modificaciones.sql
CREATE TABLE [dbo].[Items_en_clientes_servicios_modificaciones] (
    [ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]                         INT             NULL,
    [PLAN_COMERCIAL_ID]                           INT             NULL,
    [ITEM_FACTURACION_ID]                         INT             NULL,
    [SUSPENDIDO]                                  TINYINT         NULL,
    [VIGENCIA]                                    DATETIME        NULL,
    [CANTIDAD_CUOTAS]                             INT             NULL,
    [CUOTA_ACTUAL]                                INT             NULL,
    [ORDEN]                                       INT             NULL,
    [VALOR]                                       DECIMAL (18, 6) NULL,
    [PORCENTAJE_DESCUENTO]                        DECIMAL (7, 2)  NULL,
    [ITEM_APLICACION_ID]                          INT             NULL,
    [ITEM_FUERA_DE_PLAN]                          TINYINT         NULL,
    [ESTADO]                                      TINYINT         NULL,
    [ITEM_CLIENTE_SERVICIO_ID]                    INT             NULL,
    [PARA_BAJA]                                   TINYINT         NULL,
    [cantidad_de_items]                           TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ORDEN] ASC, [ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([ITEM_CLIENTE_SERVICIO_ID] ASC, [ESTADO] ASC, [PARA_BAJA] ASC, [ITEM_FACTURACION_ID] ASC, [ITEMS_EN_CLIENTE_SERVICIO_MODIFICACIONES_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE115_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE115_ITEMS_EN_CLIENTES_SERVICIOS_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE115_POR_FECHA_VIGENCIA]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([VIGENCIA] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE115_POR_PLAN_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([PLAN_COMERCIAL_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE115_POR_PLAN_ID_Y_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE115_X_ITEM_FACTURACION]
    ON [dbo].[Items_en_clientes_servicios_modificaciones]([ITEM_FACTURACION_ID] ASC);
GO


## 188: Items_en_clientes_servicios_opcionales.sql
CREATE TABLE [dbo].[Items_en_clientes_servicios_opcionales] (
    [ITEMS_EN_CLIENTE_SERVICIO_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]          INT             NULL,
    [PLAN_COMERCIAL_ID]            INT             NULL,
    [ITEM_FACTURACION_ID]          INT             NULL,
    [SUSPENDIDO]                   TINYINT         NULL,
    [VIGENCIA]                     DATETIME        NULL,
    [CANTIDAD_CUOTAS]              INT             NULL,
    [CUOTA_ACTUAL]                 INT             NULL,
    [ORDEN]                        INT             NULL,
    [VALOR]                        DECIMAL (18, 6) NULL,
    [PORCENTAJE_DESCUENTO]         DECIMAL (7, 2)  NULL,
    [ITEM_APLICACION_ID]           INT             NULL,
    [ITEM_FUERA_DE_PLAN]           TINYINT         NULL,
    [VER_EN_TECNICA]               TINYINT         NULL,
    [CANTIDAD_DE_ITEMS]            TINYINT         NULL,
    [ALICUOTA_1]                   INT             NULL,
    [ALICUOTA_2]                   INT             NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ORDEN] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE117_X_CLIENTE_SERVICIO_ID_Y_ITEM_FACTURACION_ID]
    ON [dbo].[Items_en_clientes_servicios_opcionales]([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE117_POR_FECHA_VIGENCIA]
    ON [dbo].[Items_en_clientes_servicios_opcionales]([VIGENCIA] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE117_POR_PLAN_ID_Y_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios_opcionales]([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE117_POR_PLAN_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_opcionales]([PLAN_COMERCIAL_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE117_ITEMS_EN_CLIENTES_SERVICIOS_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_opcionales]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE117_X_ITEM_FACTURACION_ID]
    ON [dbo].[Items_en_clientes_servicios_opcionales]([ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE117_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios_opcionales]([CLIENTE_SERVICIO_ID] ASC);
GO


## 189: Items_en_clientes_servicios_para_corte.sql
CREATE TABLE [dbo].[Items_en_clientes_servicios_para_corte] (
    [ITEMS_EN_CLIENTE_SERVICIO_PARA_CORTE_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]                     INT             NULL,
    [DESCRIPCION]                             VARCHAR (40)    NULL,
    [ITEM_FACTURACION_ID]                     INT             NULL,
    [VALOR]                                   DECIMAL (18, 6) NULL,
    [NUMERO_FACTURA]                          VARCHAR (20)    NULL,
    [DIAS_PARA_COBRAR_EN_BAJA]                INT             NULL,
    [por_dias]                                VARCHAR (2)     NULL,
    [factura]                                 TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_PARA_CORTE_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE113_ITEMS_EN_CLIENTES_SERVICIOS_PARA_CORTE_X_CS_ID]
    ON [dbo].[Items_en_clientes_servicios_para_corte]([CLIENTE_SERVICIO_ID] ASC);
GO


## 190: Items_en_clientes_servicios.sql
CREATE TABLE [dbo].[Items_en_clientes_servicios] (
    [ITEMS_EN_CLIENTE_SERVICIO_ID] INT             NOT NULL,
    [CLIENTE_SERVICIO_ID]          INT             NULL,
    [PLAN_COMERCIAL_ID]            INT             NULL,
    [ITEM_FACTURACION_ID]          INT             NULL,
    [SUSPENDIDO]                   TINYINT         NULL,
    [VIGENCIA]                     DATETIME        NULL,
    [CANTIDAD_CUOTAS]              INT             NULL,
    [CUOTA_ACTUAL]                 INT             NULL,
    [ORDEN]                        INT             NULL,
    [VALOR]                        DECIMAL (18, 6) NULL,
    [PORCENTAJE_DESCUENTO]         DECIMAL (7, 2)  NULL,
    [ITEM_APLICACION_ID]           INT             NULL,
    [Item_fuera_de_plan]           INT             NULL,
    [ver_en_tecnica]               INT             NULL,
    [cantidad_de_items]            TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_EN_CLIENTE_SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC, [ORDEN] ASC),
    CONSTRAINT [x_cliente_servicio_id_y_item_facturacion_id] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [ITEM_FACTURACION_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE11_POR_PLAN_ID_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios]([PLAN_COMERCIAL_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE11_POR_FECHA_VIGENCIA]
    ON [dbo].[Items_en_clientes_servicios]([VIGENCIA] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE11_POR_PLAN_ID_Y_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios]([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE UNIQUE NONCLUSTERED INDEX [UQ__Items_en_cliente__673F4B05]
    ON [dbo].[Items_en_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE11_ITEMS_DE_ARCHIVO_X_CLIENTES_SERVICIO_ID]
    ON [dbo].[Items_en_clientes_servicios]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE11_ITEMS_EN_CLIENTES_SERVICIOS_X_ITEM_ID]
    ON [dbo].[Items_en_clientes_servicios]([ITEM_FACTURACION_ID] ASC);
GO


## 191: Items_facturacion.sql
CREATE TABLE [dbo].[Items_facturacion] (
    [ITEM_FACTURACION_ID]                    INT             NOT NULL,
    [DESCRIPCION]                            VARCHAR (40)    NULL,
    [ORDEN]                                  INT             NULL,
    [SUBTOTAL]                               TINYINT         NULL,
    [SUSPENDIDO]                             TINYINT         NULL,
    [SERVICIOS]                              VARCHAR (19)    NULL,
    [EN_FACTURA]                             TINYINT         NULL,
    [PORRATEA]                               TINYINT         NULL,
    [CALCULA_INTERESES]                      TINYINT         NULL,
    [DESCRIPCION_FACTURA]                    VARCHAR (40)    NULL,
    [Columna_subdiario_iva]                  TINYINT         NULL,
    [TIPO_ITEM]                              VARCHAR (30)    NULL,
    [HASTA]                                  DATETIME        NULL,
    [ENTEROS]                                TINYINT         NULL,
    [DECIMALES]                              TINYINT         NULL,
    [VALOR]                                  DECIMAL (18, 6) NULL,
    [VALOR_CON_PICTURE]                      VARCHAR (20)    NULL,
    [PICTURE]                                VARCHAR (20)    NULL,
    [VIGENCIA]                               DATETIME        NULL,
    [DESCRIPCION_DE_VIGENCIA]                VARCHAR (40)    NULL,
    [CONTROL_MENSUAL]                        TINYINT         NULL,
    [CUOTAS]                                 INT             NULL,
    [TAG]                                    TINYINT         NULL,
    [ITEM_APLICACION_ID]                     INT             NULL,
    [PORCENTAJE_descuento]                   DECIMAL (5, 2)  NULL,
    [Item_fuera_de_plan]                     INT             NULL,
    [columna_subdiario_facturacion]          TINYINT         NULL,
    [item_en_cliente_servicio_id]            INT             NULL,
    [dias_para_cobrar_en_baja]               INT             NULL,
    [PARA_BAJA]                              TINYINT         NULL,
    [item_en_cliente_servicio_para_corte_id] INT             NULL,
    [tipo_id]                                INT             NULL,
    [ver_en_tecnica]                         INT             NULL,
    [no_calcular_en_baja]                    TINYINT         NULL,
    [item_obligatorio_id]                    INT             NULL,
    [control_facturacion]                    TINYINT         NULL,
    [control_consumos]                       TINYINT         NULL,
    [factura_en_suspencion]                  TINYINT         NULL,
    [dolar]                                  DECIMAL (18, 2) NULL,
    [cuentas_d]                              VARCHAR (20)    NULL,
    [cuentas_h]                              VARCHAR (20)    NULL,
    [factura]                                TINYINT         NULL,
    [suspension]                             TINYINT         NULL,
    [baja]                                   TINYINT         NULL,
    [corte]                                  TINYINT         NULL,
    [primer_mes]                             TINYINT         NULL,
    [en_uso]                                 INT             NULL,
    [orden_en_factura]                       INT             NULL,
    [no_levantar_interes]                    TINYINT         NULL,
    [no_usar_cambio_plan]                    TINYINT         NULL,
    [cuenta_contable_varios]                 VARCHAR (50)    NULL,
    [cuenta_contable_internet]               VARCHAR (50)    NULL,
    [cuenta_contable_telefonia]              VARCHAR (50)    NULL,
    [cuenta_contable]                        VARCHAR (50)    NULL,
    PRIMARY KEY CLUSTERED ([ITEM_FACTURACION_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC, [SERVICIOS] ASC),
    UNIQUE NONCLUSTERED ([ORDEN] ASC, [SERVICIOS] ASC),
    CONSTRAINT [IX_Items_facturacion] UNIQUE NONCLUSTERED ([ORDEN] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE_ITEMS_FACTURACION_X_SUBTOTAL]
    ON [dbo].[Items_facturacion]([SUBTOTAL] ASC);
GO


## 192: Items_planes_comerciales.sql
CREATE TABLE [dbo].[Items_planes_comerciales] (
    [ITEM_PLANE_COMERCIAL_ID] INT     NOT NULL,
    [PLAN_COMERCIAL_ID]       INT     NULL,
    [ITEM_FACTURACION_ID]     INT     NULL,
    [ORDEN]                   INT     NULL,
    [SUSPENDIDO]              TINYINT NULL,
    PRIMARY KEY CLUSTERED ([ITEM_PLANE_COMERCIAL_ID] ASC),
    UNIQUE NONCLUSTERED ([PLAN_COMERCIAL_ID] ASC, [ITEM_FACTURACION_ID] ASC),
    UNIQUE NONCLUSTERED ([ORDEN] ASC, [ITEM_FACTURACION_ID] ASC, [PLAN_COMERCIAL_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE1_ITEM_PLAN_COMERCIAL_X_PLAN_ID]
    ON [dbo].[Items_planes_comerciales]([PLAN_COMERCIAL_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [ITE1_ITEM_PLAN_COMERCIAL_X_ITEM_ID]
    ON [dbo].[Items_planes_comerciales]([ITEM_FACTURACION_ID] ASC);
GO


## 193: items_planes_de_pago.sql
CREATE TABLE [dbo].[items_planes_de_pago] (
    [ITEMS_PLANES_DE_PAGO_ID] INT           NOT NULL,
    [PLANES_DE_PAGO_ID]       INT           NULL,
    [DESCRIPCION]             VARCHAR (100) NULL,
    [PORCENTAJE_1]            INT           NULL,
    [PORCENTAJE_2]            INT           NULL,
    [CUOTAS_1]                TINYINT       NULL,
    [CUOTAS_2]                TINYINT       NULL,
    [ITEM_FACTURACION_ID]     INT           NULL,
    [DIAS]                    INT           NULL,
    [habilita]                TINYINT       NULL,
    [prejudicial]             TINYINT       NULL,
    [financiera]              TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_PLANES_DE_PAGO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ITE2_X_PLANES_DE_PAGO_ID]
    ON [dbo].[items_planes_de_pago]([PLANES_DE_PAGO_ID] ASC);
GO


## 194: items_reclamos.sql
CREATE TABLE [dbo].[items_reclamos] (
    [ITEMS_ID]     INT             NOT NULL,
    [NOMBRE_ITEMS] VARCHAR (59)    NULL,
    [SERVICIO]     VARCHAR (9)     NULL,
    [TIPO_RECLAMO] VARCHAR (99)    NULL,
    [PARAMETRO]    TINYINT         NULL,
    [DERIBA_A]     INT             NULL,
    [DERIBA_B]     INT             NULL,
    [ITEM_FINAL]   TINYINT         NULL,
    [VALOR]        DECIMAL (13, 2) NULL,
    [COMENTARIO]   VARCHAR (79)    NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_ID] ASC)
);
GO


## 195: iva_categorias_items_opcionales.sql
CREATE TABLE [dbo].[iva_categorias_items_opcionales] (
    [IVA_ID]              INT NOT NULL,
    [CATEGORIA_ID]        INT NULL,
    [ITEM_FACTURACION_ID] INT NULL,
    PRIMARY KEY CLUSTERED ([IVA_ID] ASC),
    UNIQUE NONCLUSTERED ([CATEGORIA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [IVA11_X_CATEGOIRA_ID_Y_ITEM_FACTURACION_ID]
    ON [dbo].[iva_categorias_items_opcionales]([CATEGORIA_ID] ASC, [ITEM_FACTURACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [IVA11_X_ITEM_FACTURACION_ID]
    ON [dbo].[iva_categorias_items_opcionales]([ITEM_FACTURACION_ID] ASC);
GO


## 196: iva_cpp.sql
CREATE TABLE [dbo].[iva_cpp] (
    [IVA_CPP_ID]             INT         NOT NULL,
    [IVA_ID]                 INT         NULL,
    [DESC_CORTA]             VARCHAR (4) NULL,
    [PRESTATARIA_CELULAR_ID] INT         NULL,
    [ITEM_FACTURACION_ID_1]  INT         NULL,
    [ITEM_FACTURACION_ID_2]  INT         NULL,
    [CLAVE_RENTAS]           TINYINT     NULL,
    [CLAVE_AFIP]             TINYINT     NULL,
    PRIMARY KEY CLUSTERED ([IVA_CPP_ID] ASC),
    UNIQUE NONCLUSTERED ([IVA_ID] ASC, [PRESTATARIA_CELULAR_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [IVA1_IVA_CPP_X_IVA_ID]
    ON [dbo].[iva_cpp]([IVA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [IVA1_IVA_CPP_X_PRESTATARIA_CELULAR]
    ON [dbo].[iva_cpp]([PRESTATARIA_CELULAR_ID] ASC);
GO


## 197: iva.sql
CREATE TABLE [dbo].[iva] (
    [IVA_ID]                  INT          NOT NULL,
    [DESCRIPCION]             VARCHAR (40) NULL,
    [PEDIR_CUIT]              TINYINT      NULL,
    [IB]                      TINYINT      NULL,
    [ALICUOTA_SOBRE_ALICUOTA] TINYINT      NULL,
    [A]                       TINYINT      NULL,
    [B]                       TINYINT      NULL,
    [C]                       TINYINT      NULL,
    [JURIDICA]                TINYINT      NULL,
    [desc_corta]              VARCHAR (4)  NULL,
    [Item_facturacion_id]     INT          NULL,
    [Item_facturacion_id_2]   INT          NULL,
    [Item_facturacion_id_3]   INT          NULL,
    [Item_facturacion_id_4]   INT          NULL,
    [clave_rentas]            TINYINT      NULL,
    [clave_afip]              TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([IVA_ID] ASC)
);
GO


## 198: lama_cpp.sql
CREATE TABLE [dbo].[lama_cpp] (
    [LAMA_ID]                INT              NOT NULL,
    [TASACION]               DECIMAL (19, 10) NULL,
    [NUMERO_ORIGEN]          INT              NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_LAMA]             DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [MINUTOS_A_DESCONTAR]    INT              NULL,
    [IMPORTE]                DECIMAL (11, 10) NULL,
    [DESTINO]                VARCHAR (40)     NULL,
    [REDUCIDO]               TINYINT          NULL,
    [ID]                     INT              NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    [PLAN_COMERCIAL_ID]      INT              NULL,
    [CLAVE]                  TINYINT          NULL,
    [TIPO]                   INT              NULL,
    [CODIGO]                 VARCHAR (6)      NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM12_X_TODO]
    ON [dbo].[lama_cpp]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM12_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[lama_cpp]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM12_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[lama_cpp]([CLIENTE_SERVICIO_ID] ASC, [FECHA_LAMA] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM12_X_NUMERO]
    ON [dbo].[lama_cpp]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM12_X_CODIGO_FECHA_HORA_Y_ID]
    ON [dbo].[lama_cpp]([CODIGO] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC);
GO


## 199: lama_historico_no_facturado.sql
CREATE TABLE [dbo].[lama_historico_no_facturado] (
    [LAMA_ID]                INT              NOT NULL,
    [TASACION]               DECIMAL (19, 10) NULL,
    [NUMERO_ORIGEN]          INT              NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_LAMA]             DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [MINUTOS_A_DESCONTAR]    INT              NULL,
    [IMPORTE]                DECIMAL (11, 2)  NULL,
    [DESTINO]                VARCHAR (40)     NULL,
    [REDUCIDO]               TINYINT          NULL,
    [ID]                     INT              NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    [PLAN_COMERCIAL_ID]      INT              NULL,
    [CLAVE]                  TINYINT          NULL,
    [TIPO]                   INT              NULL,
    [CODIGO]                 VARCHAR (6)      NULL,
    [CONCILIACION]           TINYINT          NULL,
    [PERIODO_ID]             INT              NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM11_X_NUMERO_Y_PERIODO]
    ON [dbo].[lama_historico_no_facturado]([NUMERO_ORIGEN] ASC, [PERIODO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM11_X_NUMERO]
    ON [dbo].[lama_historico_no_facturado]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM11_X_TODO]
    ON [dbo].[lama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM11_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[lama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC, [FECHA_LAMA] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM11_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[lama_historico_no_facturado]([CLIENTE_SERVICIO_ID] ASC);
GO


## 200: lama_historico.sql
CREATE TABLE [dbo].[lama_historico] (
    [LAMA_ID]                INT              NOT NULL,
    [NUMERO_ORIGEN]          INT              NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_LAMA]             DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [MINUTOS_A_DESCONTAR]    INT              NULL,
    [IMPORTE]                DECIMAL (11, 2)  NULL,
    [DESTINO]                VARCHAR (40)     NULL,
    [REDUCIDO]               TINYINT          NULL,
    [ID]                     INT              NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    [PLAN_COMERCIAL_ID]      INT              NULL,
    [CLAVE]                  TINYINT          NULL,
    [TIPO]                   INT              NULL,
    [CODIGO]                 VARCHAR (6)      NULL,
    [tasacion]               DECIMAL (18, 10) NULL,
    [seg]                    INT              NULL,
    [conciliacion]           TINYINT          NULL,
    [periodo_id]             INT              NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM1_X_NUMERO]
    ON [dbo].[lama_historico]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM1_X_TODO]
    ON [dbo].[lama_historico]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM1_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[lama_historico]([CLIENTE_SERVICIO_ID] ASC, [FECHA_LAMA] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[lama_historico]([CLIENTE_SERVICIO_ID] ASC);
GO


## 201: lamas_grabados.sql
CREATE TABLE [dbo].[lamas_grabados] (
    [LAMAS_GRABADOS_ID] INT NOT NULL,
    [NUMERO_LAMA]       INT NULL,
    PRIMARY KEY CLUSTERED ([LAMAS_GRABADOS_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_LAMA] ASC)
);
GO


## 202: lama.sql
CREATE TABLE [dbo].[lama] (
    [LAMA_ID]                INT              NOT NULL,
    [NUMERO_ORIGEN]          INT              NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_LAMA]             DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [MINUTOS_A_DESCONTAR]    INT              NULL,
    [IMPORTE]                DECIMAL (11, 10) NULL,
    [DESTINO]                VARCHAR (40)     NULL,
    [REDUCIDO]               TINYINT          NULL,
    [ID]                     INT              NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    [PLAN_COMERCIAL_ID]      INT              NULL,
    [CLAVE]                  TINYINT          NULL,
    [TIPO]                   INT              NULL,
    [CODIGO]                 VARCHAR (6)      NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM_X_TODO]
    ON [dbo].[lama]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM_X_NUMERO]
    ON [dbo].[lama]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[lama]([CLIENTE_SERVICIO_ID] ASC, [FECHA_LAMA] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM_PARA_CLAVE_UNICA]
    ON [dbo].[lama]([NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [SEGUNDOS] ASC, [IMPORTE] ASC, [CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [CLAVE] ASC, [TIPO] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[lama]([CLIENTE_SERVICIO_ID] ASC);
GO


## 203: lama_trans.sql
CREATE TABLE [dbo].[lama_trans] (
    [LAMA_ID]   INT          NOT NULL,
    [LAMA]      VARCHAR (68) NULL,
    [CALCULADO] TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC)
);
GO


## 204: LAMA_txt_almacenado.sql
CREATE TABLE [dbo].[LAMA_txt_almacenado] (
    [LAMA_ID]    INT           NOT NULL,
    [LINE]       VARCHAR (254) NULL,
    [PERIODO_ID] INT           NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM23_X_PERIODO_ID]
    ON [dbo].[LAMA_txt_almacenado]([PERIODO_ID] ASC);
GO


## 205: LDI_Borrados.sql
CREATE TABLE [dbo].[LDI_Borrados] (
    [LAMA_ID]                INT              NOT NULL,
    [NUMERO_ORIGEN]          INT              NULL,
    [CARACTERISTICA_DESTINO] INT              NULL,
    [NUMERO_DESTINO]         VARCHAR (19)     NULL,
    [FECHA_LAMA]             DATETIME         NULL,
    [HORA]                   VARCHAR (5)      NULL,
    [SEGUNDOS]               INT              NULL,
    [MINUTOS]                DECIMAL (9, 2)   NULL,
    [MINUTOS_A_DESCONTAR]    INT              NULL,
    [IMPORTE]                DECIMAL (11, 10) NULL,
    [DESTINO]                VARCHAR (40)     NULL,
    [REDUCIDO]               TINYINT          NULL,
    [ID]                     INT              NULL,
    [CLIENTE_SERVICIO_ID]    INT              NULL,
    [PLAN_COMERCIAL_ID]      INT              NULL,
    [CLAVE]                  TINYINT          NULL,
    [TIPO]                   INT              NULL,
    [CODIGO]                 VARCHAR (6)      NULL,
    [OPERADOR]               VARCHAR (49)     NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_ORIGEN] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [LAMA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LAM5_X_NUMERO]
    ON [dbo].[LDI_Borrados]([NUMERO_ORIGEN] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM5_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[LDI_Borrados]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM5_X_TODO]
    ON [dbo].[LDI_Borrados]([CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [DESTINO] ASC, [REDUCIDO] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM5_X_CLIENTE_SERVICIO_ID_Y_FECHA]
    ON [dbo].[LDI_Borrados]([CLIENTE_SERVICIO_ID] ASC, [FECHA_LAMA] ASC);
GO
CREATE NONCLUSTERED INDEX [LAM5_PARA_CLAVE_UNICA]
    ON [dbo].[LDI_Borrados]([NUMERO_ORIGEN] ASC, [NUMERO_DESTINO] ASC, [FECHA_LAMA] ASC, [HORA] ASC, [SEGUNDOS] ASC, [IMPORTE] ASC, [CLIENTE_SERVICIO_ID] ASC, [PLAN_COMERCIAL_ID] ASC, [CLAVE] ASC, [TIPO] ASC);
GO


## 206: leAuditCollectAlerts.sql
CREATE TABLE [dbo].[leAuditCollectAlerts] (
    [databaseid]     INT NULL,
    [alertid]        INT NOT NULL,
    [notificationid] INT NULL,
    FOREIGN KEY ([databaseid]) REFERENCES [dbo].[leAuditCollectDatabases] ([databaseid]),
    FOREIGN KEY ([notificationid]) REFERENCES [dbo].[leAuditCollectNotification] ([notificationid])
);
GO


## 207: leAuditCollectConfigVars.sql
CREATE TABLE [dbo].[leAuditCollectConfigVars] (
    [optionname] NVARCHAR (255) NULL,
    [value]      NVARCHAR (255) NULL
);
GO


## 208: leAuditCollectDatabases.sql
CREATE TABLE [dbo].[leAuditCollectDatabases] (
    [databaseid]            INT             IDENTITY (1, 1) NOT NULL,
    [databasename]          NVARCHAR (255)  NULL,
    [databaselogbackuppool] NVARCHAR (1024) NULL,
    [backupppid]            INT             NULL,
    [repositoryhostname]    NVARCHAR (1024) NULL,
    [repositoryhostport]    INT             NULL,
    [globalrepositoryname]  NVARCHAR (1024) NULL,
    [auditon]               CHAR (1)        NOT NULL,
    [opfilter]              NVARCHAR (255)  NULL,
    PRIMARY KEY CLUSTERED ([databaseid] ASC)
);
GO


## 209: leAuditCollectEventData.sql
CREATE TABLE [dbo].[leAuditCollectEventData] (
    [seqnum]               INT            IDENTITY (1, 1) NOT NULL,
    [eventtime]            DATETIME       NULL,
    [eventclass]           INT            NOT NULL,
    [alerttypeid]          INT            NULL,
    [eventsubclass]        INT            NULL,
    [starttime]            DATETIME       NULL,
    [endtime]              DATETIME       NULL,
    [textdata]             NTEXT          NULL,
    [success]              INT            NULL,
    [clienthostname]       NVARCHAR (128) NULL,
    [applicationname]      NVARCHAR (128) NULL,
    [ntusername]           NVARCHAR (128) NULL,
    [ntdomainname]         NVARCHAR (128) NULL,
    [sqlsecurityloginname] NVARCHAR (128) NULL,
    [spid]                 INT            NULL,
    [databaseid]           INT            NULL,
    [databasename]         NVARCHAR (128) NULL,
    [objectid]             INT            NULL,
    [objecttype]           INT            NULL,
    [objectname]           NVARCHAR (128) NULL,
    [objectowner]          NVARCHAR (128) NULL,
    [permissions]          INT            NULL,
    [targetrolename]       NVARCHAR (128) NULL,
    [targetloginname]      NVARCHAR (128) NULL,
    [targetusername]       NVARCHAR (128) NULL
);
GO
CREATE NONCLUSTERED INDEX [leEventDataIdx1]
    ON [dbo].[leAuditCollectEventData]([ntusername] ASC);
GO
CREATE NONCLUSTERED INDEX [leEventDataIdx6]
    ON [dbo].[leAuditCollectEventData]([starttime] ASC);
GO
CREATE NONCLUSTERED INDEX [leEventDataIdx3]
    ON [dbo].[leAuditCollectEventData]([applicationname] ASC);
GO
CREATE NONCLUSTERED INDEX [leEventDataIdx2]
    ON [dbo].[leAuditCollectEventData]([sqlsecurityloginname] ASC);
GO
CREATE NONCLUSTERED INDEX [leEventDataIdx8]
    ON [dbo].[leAuditCollectEventData]([spid] ASC);
GO
CREATE NONCLUSTERED INDEX [leEventDataIdx5]
    ON [dbo].[leAuditCollectEventData]([eventtime] ASC);
GO
CREATE NONCLUSTERED INDEX [leEventDataIdx7]
    ON [dbo].[leAuditCollectEventData]([endtime] ASC);
GO
CREATE NONCLUSTERED INDEX [leEventDataIdx4]
    ON [dbo].[leAuditCollectEventData]([clienthostname] ASC);
GO


## 210: leAuditCollectNotification.sql
CREATE TABLE [dbo].[leAuditCollectNotification] (
    [notificationid] INT            IDENTITY (1, 1) NOT NULL,
    [type]           INT            NOT NULL,
    [param1]         NVARCHAR (512) NULL,
    [param2]         NVARCHAR (512) NULL,
    PRIMARY KEY CLUSTERED ([notificationid] ASC)
);
GO


## 211: leyenda_telefonica.sql
CREATE TABLE [dbo].[leyenda_telefonica] (
    [LEYENDA_ID] INT          NOT NULL,
    [PEDIDO]     VARCHAR (10) NULL,
    [HEA]        VARCHAR (10) NULL,
    [FACTURA_ID] INT          NULL,
    [TICKET]     VARCHAR (39) NULL,
    [PERIODO_ID] INT          NULL,
    PRIMARY KEY CLUSTERED ([LEYENDA_ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LEY_X_PERIODO]
    ON [dbo].[leyenda_telefonica]([PERIODO_ID] ASC);
GO


## 212: listado_para_financiera.sql
CREATE TABLE [dbo].[listado_para_financiera] (
    [ID]                  INT            NOT NULL,
    [CLIENTE_ID]          INT            NULL,
    [CLIENTE_SERVICIO_ID] INT            NULL,
    [CLIENTE]             VARCHAR (149)  NULL,
    [DIRECCION]           VARCHAR (149)  NULL,
    [SERVICIO]            VARCHAR (49)   NULL,
    [IMPORTE]             DECIMAL (9, 2) NULL,
    [LISTADO_ID]          INT            NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LIS_X_SERVICIO]
    ON [dbo].[listado_para_financiera]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [LIS_X_LISTADO_ID]
    ON [dbo].[listado_para_financiera]([LISTADO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [LIS_X_LISTADO_Y_SERVICIO]
    ON [dbo].[listado_para_financiera]([LISTADO_ID] ASC, [SERVICIO] ASC);
GO


## 213: llamadas_IVR.sql
CREATE TABLE [dbo].[llamadas_IVR] (
    [ID]                INT           NOT NULL,
    [CLIENTE]           INT           NULL,
    [SERVICIO]          INT           NULL,
    [NOMBREYAPELLIDO]   VARCHAR (19)  NULL,
    [DIRECCION]         VARCHAR (40)  NULL,
    [NUMERO_TELEFONICO] VARCHAR (40)  NULL,
    [FACTURA]           VARCHAR (999) NULL,
    [IMPORTE]           VARCHAR (40)  NULL,
    [VENCIMIENTO]       VARCHAR (19)  NULL,
    [HORA_DE_LLAMADA]   VARCHAR (40)  NULL,
    [FECHA_DE_LLAMADA]  VARCHAR (40)  NULL,
    [SERVICIOS]         VARCHAR (40)  NULL,
    [TIPO]              VARCHAR (40)  NULL,
    [A14]               VARCHAR (19)  NULL,
    [A15]               VARCHAR (19)  NULL,
    [A16]               VARCHAR (40)  NULL,
    [A17]               VARCHAR (40)  NULL,
    [A18]               VARCHAR (40)  NULL,
    [A19]               VARCHAR (40)  NULL,
    [A20]               VARCHAR (40)  NULL,
    [A21]               VARCHAR (40)  NULL,
    [A22]               VARCHAR (40)  NULL,
    [A23]               VARCHAR (40)  NULL,
    [A24]               VARCHAR (40)  NULL,
    [A25]               VARCHAR (40)  NULL,
    [A26]               VARCHAR (40)  NULL,
    [A27]               VARCHAR (40)  NULL,
    [A28]               VARCHAR (40)  NULL,
    [A29]               VARCHAR (40)  NULL,
    [A30]               VARCHAR (40)  NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [AUX11111_X_SERVICIO]
    ON [dbo].[llamadas_IVR]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [AUX11111_X_CLIENTE]
    ON [dbo].[llamadas_IVR]([CLIENTE] ASC);
GO


## 214: llamados_efectuados_historico.sql
CREATE TABLE [dbo].[llamados_efectuados_historico] (
    [ID_HISTORICO]         INT             NOT NULL,
    [id_llamada]           INT             NULL,
    [CLIENTE]              VARCHAR (40)    NULL,
    [FACTURA]              VARCHAR (20)    NULL,
    [VENCIMIENTO]          VARCHAR (10)    NULL,
    [SALDO]                DECIMAL (15, 2) NULL,
    [INTENTOS]             INT             NULL,
    [result_code]          INT             NULL,
    [result_description]   VARCHAR (40)    NULL,
    [TELEFONO]             VARCHAR (30)    NULL,
    [FECHA]                VARCHAR (11)    NULL,
    [HORA]                 VARCHAR (8)     NULL,
    [descripcion_llamados] VARCHAR (150)   NULL,
    [f_vencimiento]        DATETIME        NULL,
    [fecha_llamados]       DATETIME        NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LLA1_KEY_]
    ON [dbo].[llamados_efectuados_historico]([id_llamada] ASC, [TELEFONO] ASC);
GO


## 215: llamados_efectuados.sql
CREATE TABLE [dbo].[llamados_efectuados] (
    [id_llamada]         INT             NOT NULL,
    [CLIENTE]            VARCHAR (40)    NULL,
    [FACTURA]            VARCHAR (20)    NULL,
    [VENCIMIENTO]        VARCHAR (10)    NULL,
    [SALDO]              DECIMAL (15, 2) NULL,
    [INTENTOS]           INT             NULL,
    [result_code]        VARCHAR (19)    NULL,
    [result_description] VARCHAR (40)    NULL,
    [TELEFONO]           VARCHAR (30)    NULL,
    [FECHA]              VARCHAR (29)    NULL,
    [HORA]               VARCHAR (8)     NULL,
    [FECHA_LLAMADA]      DATETIME        NULL,
    PRIMARY KEY CLUSTERED ([id_llamada] ASC),
    UNIQUE NONCLUSTERED ([id_llamada] ASC, [TELEFONO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LLA_X_CLIENTE_SERVICIO]
    ON [dbo].[llamados_efectuados]([CLIENTE] ASC);
GO


## 216: Localidades_habilitadas.sql
CREATE TABLE [dbo].[Localidades_habilitadas] (
    [ID]                       INT          NOT NULL,
    [EMPRESA]                  VARCHAR (40) NULL,
    [LOCALIDAD]                VARCHAR (30) NULL,
    [CP]                       VARCHAR (10) NULL,
    [DIRECCION]                VARCHAR (40) NULL,
    [HORARIO_ATENCION]         CHAR (40)    NULL,
    [LOGO]                     VARCHAR (20) NULL,
    [BASE]                     VARCHAR (20) NULL,
    [SERVIDOR]                 VARCHAR (20) NULL,
    [USUARIO]                  VARCHAR (20) NULL,
    [PASSWORD]                 VARCHAR (20) NULL,
    [FIRMA_INTIMACION]         VARCHAR (40) NULL,
    [CARGO_FIRMA_INTIMACION]   VARCHAR (40) NULL,
    [ARCHIVO_FIRMA_INTIMACION] VARCHAR (40) NULL,
    [FIRMA_CARTA_DOCUMENTO]    VARCHAR (40) NULL,
    [DNI_CARTA_DOCUMENTO]      INT          NULL,
    [CARGO_CARTA_DOCUMENTO]    VARCHAR (40) NULL,
    [FIRMA_ACUERDOS]           VARCHAR (40) NULL,
    [CARGO_FIRMA_ACUERDOS]     VARCHAR (40) NULL,
    [TE_EMERGENCIAS]           VARCHAR (19) NULL,
    [TE_ATENCION]              VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([LOCALIDAD] ASC)
);
GO


## 217: localidades.sql
CREATE TABLE [dbo].[localidades] (
    [LOCALIDAD_ID]  INT          NOT NULL,
    [LOCALIDAD]     VARCHAR (40) NULL,
    [PROVINCIA_ID]  INT          NULL,
    [CODIGO_POSTAL] VARCHAR (10) NULL,
    PRIMARY KEY CLUSTERED ([LOCALIDAD_ID] ASC),
    UNIQUE NONCLUSTERED ([LOCALIDAD] ASC, [PROVINCIA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LOC_X_LOCALIDAD_SOLA]
    ON [dbo].[localidades]([LOCALIDAD] ASC);
GO
CREATE NONCLUSTERED INDEX [LOC_X_PROVINCIA_ID]
    ON [dbo].[localidades]([PROVINCIA_ID] ASC);
GO


## 218: Mails_Clientes_servicios.sql
CREATE TABLE [dbo].[Mails_Clientes_servicios] (
    [ID_TABAL]            INT     NOT NULL,
    [EMAIL_ID]            INT     NULL,
    [CLIENTE_SERVICIO_ID] INT     NULL,
    [MAIL_SECUNDARIO]     TINYINT NULL,
    [cliente_id]          INT     NULL,
    [gas]                 TINYINT NULL,
    PRIMARY KEY CLUSTERED ([ID_TABAL] ASC)
);
GO


## 219: mails_clientes.sql
CREATE TABLE [dbo].[mails_clientes] (
    [MAIL_ID]              INT           NOT NULL,
    [EMAIL]                VARCHAR (89)  NULL,
    [HASH]                 VARCHAR (899) NULL,
    [FECHA_INGRESO]        DATETIME      NULL,
    [FECHA_VALIDACION]     DATETIME      NULL,
    [SECUNDARIO]           TINYINT       NULL,
    [VALIDADO]             TINYINT       NULL,
    [MAIL_SECUNDARIO]      VARCHAR (89)  NULL,
    [HASH_SECUNDARIO]      VARCHAR (899) NULL,
    [VALIDACION_SEC]       TINYINT       NULL,
    [FECHA_VALIDACION_SEC] DATETIME      NULL,
    [cliente_id]           INT           NULL,
    [baja]                 TINYINT       NULL,
    [marca_reenvio]        TINYINT       NULL,
    [cant_reenvios]        INT           NULL,
    [gas]                  TINYINT       NULL,
    [fecha_reenvio]        DATETIME      NULL,
    [cis]                  VARCHAR (50)  NULL,
    [telefono]             VARCHAR (50)  NULL,
    [fecha_validacion_web] DATETIME      NULL,
    [fecha_v_web_sec]      DATETIME      NULL,
    [comentario]           VARCHAR (100) NULL,
    CONSTRAINT [PK_mails_clientes] PRIMARY KEY CLUSTERED ([MAIL_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [x_cliente_id]
    ON [dbo].[mails_clientes]([cliente_id] ASC);
GO


## 220: mails_con_cis.sql
CREATE TABLE [dbo].[mails_con_cis] (
    [ID_TABLA]  INT          NOT NULL,
    [CIS]       CHAR (15)    NULL,
    [EMAIL]     VARCHAR (49) NULL,
    [TELEFONO]  CHAR (40)    NULL,
    [VALIDADO]  TINYINT      NULL,
    [GAS]       TINYINT      NULL,
    [FECHA]     DATETIME     NULL,
    [baja]      TINYINT      NULL,
    [procesado] TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([ID_TABLA] ASC)
);
GO


## 221: Mail_servicios.sql
CREATE TABLE [dbo].[Mail_servicios] (
    [ID]                  INT           IDENTITY (1, 1) NOT NULL,
    [CLIENTE_SERVICIO_ID] INT           NOT NULL,
    [EMAIL]               VARCHAR (100) NULL,
    [FECHA_ALTA]          DATETIME      NOT NULL,
    CONSTRAINT [PK_Mail_servicios] PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 222: mails.sql
CREATE TABLE [dbo].[mails] (
    [MAILS_ID]            INT           NOT NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [MAIL]                VARCHAR (100) NULL,
    [CUOTA]               INT           NULL,
    [ITEM_HOSTING_ID]     INT           NULL,
    [estado]              TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([MAILS_ID] ASC),
    CONSTRAINT [MAI_X_MAIL_Y_CLIENTE_SERVICIO_ID] UNIQUE NONCLUSTERED ([MAIL] ASC, [CLIENTE_SERVICIO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MAI_X_ITEM_HOSTING_ID]
    ON [dbo].[mails]([ITEM_HOSTING_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [UQ__mails__7F36D027]
    ON [dbo].[mails]([MAIL] ASC);
GO
CREATE NONCLUSTERED INDEX [MAI_X_MAIL_Y_ITEM_HOSTING_ID]
    ON [dbo].[mails]([MAIL] ASC, [ITEM_HOSTING_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MAI_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[mails]([CLIENTE_SERVICIO_ID] ASC);
GO


## 223: manzanas.sql
CREATE TABLE [dbo].[manzanas] (
    [MANZANA_ID]  INT          NOT NULL,
    [DESCRIPCION] VARCHAR (30) NULL,
    [MANZANA]     VARCHAR (6)  NULL,
    [FMC]         VARCHAR (8)  NULL,
    [SECCION]     VARCHAR (7)  NULL,
    [RADIO]       VARCHAR (5)  NULL,
    PRIMARY KEY CLUSTERED ([MANZANA_ID] ASC),
    UNIQUE NONCLUSTERED ([MANZANA] ASC, [MANZANA_ID] ASC),
    UNIQUE NONCLUSTERED ([RADIO] ASC, [MANZANA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MAN_MANZANA_X_SECCION]
    ON [dbo].[manzanas]([SECCION] ASC);
GO
CREATE NONCLUSTERED INDEX [xradio]
    ON [dbo].[manzanas]([RADIO] ASC);
GO


## 224: Marca_modems.sql
CREATE TABLE [dbo].[Marca_modems] (
    [MARCA_ID] INT          NOT NULL,
    [MARCA]    VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([MARCA_ID] ASC),
    UNIQUE NONCLUSTERED ([MARCA] ASC)
);
GO


## 225: marcas.sql
CREATE TABLE [dbo].[marcas] (
    [ID_MARCA] INT           NOT NULL,
    [MARCA]    VARCHAR (100) NULL,
    PRIMARY KEY CLUSTERED ([ID_MARCA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MAR_KEY_MARCA_ID_MARCA]
    ON [dbo].[marcas]([ID_MARCA] ASC, [MARCA] ASC);
GO


## 226: Marca_Telefonos.sql
CREATE TABLE [dbo].[Marca_Telefonos] (
    [MARCA_ID] INT          NOT NULL,
    [MARCA]    VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([MARCA_ID] ASC),
    UNIQUE NONCLUSTERED ([MARCA] ASC)
);
GO


## 227: Medio_Alta_Reclamo.sql
CREATE TABLE [dbo].[Medio_Alta_Reclamo] (
    [MEDIO_ID]   INT          NOT NULL,
    [MEDIO_ALTA] VARCHAR (60) NULL,
    PRIMARY KEY CLUSTERED ([MEDIO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MED_KEY_MEDIO_ALTA]
    ON [dbo].[Medio_Alta_Reclamo]([MEDIO_ALTA] ASC);
GO


## 228: Messages.sql
CREATE TABLE [dbo].[Messages] (
    [ID]           INT        NOT NULL,
    [Ranking]      INT        NULL,
    [DontAskAgain] TINYINT    NULL,
    [Mensaje]      CHAR (200) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([Mensaje] ASC, [ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [xRanking]
    ON [dbo].[Messages]([Ranking] ASC, [ID] ASC);
GO


## 229: Modelo_modems.sql
CREATE TABLE [dbo].[Modelo_modems] (
    [MODELO_ID] INT          NOT NULL,
    [MODELO]    VARCHAR (30) NULL,
    [MARCA_ID]  INT          NULL,
    [CONEXION]  VARCHAR (20) NULL,
    [TIPO]      VARCHAR (20) NULL,
    PRIMARY KEY CLUSTERED ([MODELO_ID] ASC),
    UNIQUE NONCLUSTERED ([MODELO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MOD11_MODELO_MODEMS_X_MARCA_ID]
    ON [dbo].[Modelo_modems]([MARCA_ID] ASC);
GO


## 230: modelos.sql
CREATE TABLE [dbo].[modelos] (
    [ID_MODELO] INT           NOT NULL,
    [MODELO]    VARCHAR (100) NULL,
    PRIMARY KEY CLUSTERED ([ID_MODELO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MOD_KEY_ID_MODELO_MODELO]
    ON [dbo].[modelos]([ID_MODELO] ASC, [MODELO] ASC);
GO


## 231: Modelo_telefonos.sql
CREATE TABLE [dbo].[Modelo_telefonos] (
    [MODELO_ID] INT          NOT NULL,
    [MODELO]    VARCHAR (30) NULL,
    [MARCA_ID]  INT          NULL,
    PRIMARY KEY CLUSTERED ([MODELO_ID] ASC),
    UNIQUE NONCLUSTERED ([MODELO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MOD111_MODELO_TELEFONOS_X_MARCA_ID]
    ON [dbo].[Modelo_telefonos]([MARCA_ID] ASC);
GO


## 232: modem_FTTH.sql
CREATE TABLE [dbo].[modem_FTTH] (
    [MODEM_ID]          INT          NOT NULL,
    [PUERTOS_LAN]       INT          NULL,
    [MARCA]             VARCHAR (59) NULL,
    [MODELO]            VARCHAR (89) NULL,
    [N_SERIE]           VARCHAR (49) NULL,
    [SERVICIO_INTERNET] INT          NULL,
    [SERVICIO_SIP_1]    INT          NULL,
    [UTILIZADO]         TINYINT      NULL,
    [SERVICIO_SIP_2]    INT          NULL,
    [INTERNET]          TINYINT      NULL,
    [PROVEEDOR_ID]      INT          NULL,
    [SIP]               TINYINT      NULL,
    [SIP_2]             TINYINT      NULL,
    [USUSARIO]          VARCHAR (50) NULL,
    [PASSWORD]          VARCHAR (30) NULL,
    [ESTADO]            TINYINT      NULL,
    [COMENTARIO]        VARCHAR (44) NULL,
    [STOCK_ID]          INT          NULL,
    [FECHA_COMPRA]      DATETIME     NULL,
    [cis]               VARCHAR (15) NULL,
    PRIMARY KEY CLUSTERED ([MODEM_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MOD3_X_N_SERIE_Y_ID]
    ON [dbo].[modem_FTTH]([N_SERIE] ASC, [MODEM_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MOD3_X_N_SERIE]
    ON [dbo].[modem_FTTH]([N_SERIE] ASC);
GO


## 233: modems.sql
CREATE TABLE [dbo].[modems] (
    [MODEM_ID]            INT           NOT NULL,
    [MARCA_ID]            INT           NULL,
    [MODELO_ID]           INT           NULL,
    [SERIE]               VARCHAR (50)  NULL,
    [UTILIZADO]           TINYINT       NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [USUARIO]             VARCHAR (30)  NULL,
    [PASSWORD]            VARCHAR (30)  NULL,
    [BAJA]                TINYINT       NULL,
    [stock_id]            INT           NULL,
    [id_proveedor]        INT           NULL,
    [motivo_baja]         VARCHAR (100) NULL,
    [estado_modem_id]     INT           NULL,
    [fecha_compra]        DATETIME      NULL,
    [comentario]          VARCHAR (250) NULL,
    [marca]               VARCHAR (50)  NULL,
    [modelo]              VARCHAR (50)  NULL,
    [otro]                INT           NULL,
    [tipo]                INT           NULL,
    [cis]                 VARCHAR (15)  NULL,
    CONSTRAINT [PK__modems__22951AFD] PRIMARY KEY CLUSTERED ([MODEM_ID] ASC),
    CONSTRAINT [UQ__modems__23893F36] UNIQUE NONCLUSTERED ([SERIE] ASC, [MODEM_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MOD_MODEM_X_MARCA_ID]
    ON [dbo].[modems]([MARCA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MOD_MODEM_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[modems]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MOD_MODEM_X_MODELO_ID]
    ON [dbo].[modems]([MODELO_ID] ASC);
GO


## 234: modif_es.sql
CREATE TABLE [dbo].[modif_es] (
    [MODIF_ID]             INT           NOT NULL,
    [CLIENTE_SERVICIO_ID]  INT           NULL,
    [ESTADO]               INT           NULL,
    [FECHA_MODIF]          DATETIME      NULL,
    [OBSERVACION]          VARCHAR (299) NULL,
    [USUARIO_ID]           INT           NULL,
    [TIPO_MODIFICACION_ID] INT           NULL,
    [usuario]              VARCHAR (50)  NULL,
    PRIMARY KEY CLUSTERED ([MODIF_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [EST2_MODIF_X_TIPO_ID]
    ON [dbo].[modif_es]([TIPO_MODIFICACION_ID] ASC);
GO


## 235: modif_telegestion.sql
CREATE TABLE [dbo].[modif_telegestion] (
    [ID_TELE]     INT           NOT NULL,
    [DESCRIPCION] VARCHAR (199) NULL,
    [OPERADOR]    VARCHAR (49)  NULL,
    [FECHA]       DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([ID_TELE] ASC)
);
GO


## 236: Motivos_corte_baja.sql
CREATE TABLE [dbo].[Motivos_corte_baja] (
    [MOTIVOS_CORTE_BAJA_ID] INT          NOT NULL,
    [DESCRIPCION]           VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([MOTIVOS_CORTE_BAJA_ID] ASC)
);
GO


## 237: movimientos_compras.sql
CREATE TABLE [dbo].[movimientos_compras] (
    [ID_MOV]              INT          NULL,
    [STOCK_ID]            INT          NULL,
    [ID_COMPRAS]          INT          NULL,
    [ARTICULO_ID]         INT          NULL,
    [FECHA]               DATETIME     NULL,
    [ESTADO]              VARCHAR (19) NULL,
    [SERIE]               VARCHAR (29) NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [cantidad]            INT          NULL,
    UNIQUE NONCLUSTERED ([ID_MOV] ASC),
    UNIQUE NONCLUSTERED ([ID_COMPRAS] ASC, [ID_MOV] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MOV_X_COMPRAS_ID]
    ON [dbo].[movimientos_compras]([ID_COMPRAS] ASC);
GO


## 238: Movimientos_pedidos_sistema.sql
CREATE TABLE [dbo].[Movimientos_pedidos_sistema] (
    [ID_TABLA]   INT           NOT NULL,
    [ID_PEDIDO]  INT           NULL,
    [ESTADO_ID]  INT           NULL,
    [ESTADO]     VARCHAR (89)  NULL,
    [COMENTARIO] VARCHAR (449) NULL,
    [FECHA]      DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([ID_TABLA] ASC)
);
GO


## 239: movimientos_reclamos.sql
CREATE TABLE [dbo].[movimientos_reclamos] (
    [ID]                   INT           NOT NULL,
    [RECLAMO_ID]           INT           NULL,
    [ITEM_ACTUAL]          INT           NULL,
    [NOMBRE_TIPO_RECLAMO]  VARCHAR (254) NULL,
    [DECISION]             CHAR (10)     NULL,
    [COMENTARIO]           VARCHAR (200) NULL,
    [VALOR]                VARCHAR (9)   NULL,
    [operador]             VARCHAR (40)  NULL,
    [fecha]                DATETIME      NULL,
    [nro_derivacion]       INT           NULL,
    [historico_reclamo_id] INT           NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([RECLAMO_ID] ASC, [ID] ASC)
);
GO


## 240: movimientos_reservas.sql
CREATE TABLE [dbo].[movimientos_reservas] (
    [MOV_ID]       INT           NOT NULL,
    [MOVIMIENTO]   DATETIME      NULL,
    [OPERADOR_ID]  INT           NULL,
    [DESCRIPCION]  VARCHAR (199) NULL,
    [NRO_TELEFONO] INT           NULL,
    PRIMARY KEY CLUSTERED ([MOV_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MOV_POR_NRO_TELEFONO]
    ON [dbo].[movimientos_reservas]([NRO_TELEFONO] ASC);
GO
CREATE NONCLUSTERED INDEX [MOV_POR_FECHA]
    ON [dbo].[movimientos_reservas]([MOVIMIENTO] ASC);
GO


## 241: nodos_fibra.sql
CREATE TABLE [dbo].[nodos_fibra] (
    [NODO_ID]      INT           NOT NULL,
    [IP_ID]        INT           NULL,
    [NUMERO]       INT           NULL,
    [DESCRIPCION]  VARCHAR (149) NULL,
    [CODIGO_CALLE] INT           NULL,
    [RANGO_INICIO] INT           NULL,
    [RANGO_FIN]    INT           NULL,
    [rack_fibra]   INT           NULL,
    PRIMARY KEY CLUSTERED ([NODO_ID] ASC)
);
GO


## 242: nodos.sql
CREATE TABLE [dbo].[nodos] (
    [NODO_ID]       INT          NOT NULL,
    [NUMERO]        INT          NULL,
    [DESCRIPCION]   VARCHAR (30) NULL,
    [CODIGO_CALLE]  INT          NULL,
    [ip_id]         INT          NULL,
    [rango_inicio]  INT          NULL,
    [rango_fin]     INT          NULL,
    [no_utiliza_ip] TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([NODO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [NOD_NODO_X_CODIGO_CALLE]
    ON [dbo].[nodos]([CODIGO_CALLE] ASC);
GO


## 243: nuevo_1.sql
CREATE TABLE [dbo].[nuevo_1] (
    [CLIENTE_ID] INT     NULL,
    [HIJO]       TINYINT NULL
);
GO
CREATE NONCLUSTERED INDEX [NUE_X_ID]
    ON [dbo].[nuevo_1]([CLIENTE_ID] ASC);
GO


## 244: numeracion_cae_prueba.sql
CREATE TABLE [dbo].[numeracion_cae_prueba] (
    [ID_NUMERACION] INT          NOT NULL,
    [QUE_ES]        VARCHAR (19) NULL,
    [TIPO]          VARCHAR (19) NULL,
    [NUMERACION]    INT          NULL,
    PRIMARY KEY CLUSTERED ([ID_NUMERACION] ASC)
);
GO


## 245: numeracion_empresa.sql
CREATE TABLE [dbo].[numeracion_empresa] (
    [NUMERACION_EMPRESA_ID] INT          NOT NULL,
    [NUMERO]                INT          NULL,
    [DESCRIPCION]           VARCHAR (49) NULL,
    PRIMARY KEY CLUSTERED ([NUMERACION_EMPRESA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [NUM3_X_NUMERO]
    ON [dbo].[numeracion_empresa]([NUMERO] ASC);
GO


## 246: numeracion_local.sql
CREATE TABLE [dbo].[numeracion_local] (
    [NUMERACION_LOCAL_ID] INT            NOT NULL,
    [DESDE]               INT            NULL,
    [HASTA]               INT            NULL,
    [DESTINO]             VARCHAR (50)   NULL,
    [IMPORTE]             DECIMAL (9, 2) NULL,
    [CODIGO]              INT            NULL,
    PRIMARY KEY CLUSTERED ([NUMERACION_LOCAL_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [NUM2_X_DESTINO]
    ON [dbo].[numeracion_local]([DESTINO] ASC);
GO


## 247: numerador_iva.sql
CREATE TABLE [dbo].[numerador_iva] (
    [NUMERADOR_ID]             INT NOT NULL,
    [VENTAS_INTERNET_P_INICIO] INT NULL,
    [VENTAS_INTERNET_P_FINAL]  INT NULL,
    PRIMARY KEY CLUSTERED ([NUMERADOR_ID] ASC)
);
GO


## 248: numeros_corporativo.sql
CREATE TABLE [dbo].[numeros_corporativo] (
    [NUMEROS_CORPORATIVO_ID] INT      NOT NULL,
    [CLIENTE_SERVICIO_ID]    INT      NULL,
    [NUMERO_TELEFONICO]      INT      NULL,
    [fecha_vigencia]         DATETIME NULL,
    [fecha_ingreso]          DATETIME NULL,
    [fecha_baja]             DATETIME NULL,
    [baja]                   TINYINT  NULL,
    CONSTRAINT [PK__numeros_corporat__21F5FC7F] PRIMARY KEY CLUSTERED ([NUMEROS_CORPORATIVO_ID] ASC),
    CONSTRAINT [UQ__numeros_corporat__22EA20B8] UNIQUE NONCLUSTERED ([CLIENTE_SERVICIO_ID] ASC, [NUMERO_TELEFONICO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [NUM1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[numeros_corporativo]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [NUM1_X_NUMERO_TELEFONICO]
    ON [dbo].[numeros_corporativo]([NUMERO_TELEFONICO] ASC);
GO


## 249: operadores.sql
CREATE TABLE [dbo].[operadores] (
    [OPERADOR_ID]     INT          NOT NULL,
    [NOMBRE_OPERADOR] VARCHAR (39) NULL,
    [CLAVE_OPERADOR]  VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([OPERADOR_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [OPE_POR_NOMBRE]
    ON [dbo].[operadores]([NOMBRE_OPERADOR] ASC);
GO


## 250: Operador.sql
CREATE TABLE [dbo].[Operador] (
    [OPERADOR_ID] INT           NOT NULL,
    [NOMOPERADOR] VARCHAR (100) NULL,
    PRIMARY KEY CLUSTERED ([OPERADOR_ID] ASC)
);
GO


## 251: ordenes_de_servicio_varias.sql
CREATE TABLE [dbo].[ordenes_de_servicio_varias] (
    [ORDEN_ID]                        INT             NOT NULL,
    [FINANCIERA]                      TINYINT         NULL,
    [PREJUDICIAL]                     TINYINT         NULL,
    [NOMBRE_FANTASIA]                 VARCHAR (55)    NULL,
    [CLIENTE_ID]                      INT             NULL,
    [CLIENTE_SERVICIO_ID]             INT             NULL,
    [NUMERADOR_HIJOS]                 INT             NULL,
    [CLASIFICACION_DE_CLIENTES_ID]    INT             NULL,
    [CODIGO_CALLE]                    INT             NULL,
    [NUMERO]                          INT             NULL,
    [SECTOR]                          VARCHAR (2)     NULL,
    [BLOCK]                           VARCHAR (2)     NULL,
    [TORRE]                           VARCHAR (3)     NULL,
    [PISO]                            TINYINT         NULL,
    [DTO]                             VARCHAR (3)     NULL,
    [CASA]                            INT             NULL,
    [BARRIO]                          VARCHAR (15)    NULL,
    [LOCALIDAD_ID]                    INT             NULL,
    [CODIGO_POSTAL]                   VARCHAR (10)    NULL,
    [ENTRE_CODIGO_CALLE_1]            INT             NULL,
    [ENTRE_CODIGO_CALLE_2]            INT             NULL,
    [SERVICIO]                        VARCHAR (19)    NULL,
    [NUMERO_TELEFONO]                 INT             NULL,
    [PARTIDA]                         INT             NULL,
    [METROS_CUADRADOS_VIVIENDA]       DECIMAL (7, 2)  NULL,
    [TIPO_DOC]                        VARCHAR (4)     NULL,
    [CLAVE]                           TINYINT         NULL,
    [NUMERO_DOC]                      VARCHAR (19)    NULL,
    [DIGITO_VERIFICADOR]              TINYINT         NULL,
    [DOCUMENTO]                       VARCHAR (20)    NULL,
    [CLASIFICACION_IVA_ID]            INT             NULL,
    [PIB]                             VARCHAR (2)     NULL,
    [PERCEPCION_ID]                   TINYINT         NULL,
    [IVA_MONTO_ACUMULADO_FACTURACION] DECIMAL (13, 2) NULL,
    [FECHA_PROXIMA_INCLUSION]         DATETIME        NULL,
    [FECHA_INSTALACION]               DATETIME        NULL,
    [FECHA_SOLICITUD]                 DATETIME        NULL,
    [FECHA_HABILITACION]              DATETIME        NULL,
    [FECHA_BAJA]                      DATETIME        NULL,
    [FECHA_INGRESO_AL_SISTEMA]        DATETIME        NULL,
    [FECHA_INTIMACION]                DATETIME        NULL,
    [FECHA_TELECOBRANZA]              DATETIME        NULL,
    [FECHA_SUSPENCION]                DATETIME        NULL,
    [FECHA_CAMBIO_NUMERO]             DATETIME        NULL,
    [PLAN_COMERCIAL]                  INT             NULL,
    [ESTADO]                          TINYINT         NULL,
    [NUMERO_SOLICITUD]                INT             NULL,
    [VENDEDOR]                        INT             NULL,
    [CUADRILLA]                       VARCHAR (20)    NULL,
    [OBSERVACIONES]                   VARCHAR (300)   NULL,
    [SOLUCION]                        VARCHAR (300)   NULL,
    [APELLIDO_Y_NOMBRE]               VARCHAR (49)    NULL,
    [CALLE]                           VARCHAR (99)    NULL,
    PRIMARY KEY CLUSTERED ([ORDEN_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CLI17_X_SERVICIO]
    ON [dbo].[ordenes_de_servicio_varias]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI17_CLIENTES_SERVICIOS_X_LOCALIDAD_ID]
    ON [dbo].[ordenes_de_servicio_varias]([LOCALIDAD_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI17_CLIENTES_SERVICIOS_X_CALLE_DOMICILIO]
    ON [dbo].[ordenes_de_servicio_varias]([CODIGO_CALLE] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI17_CLIENTES_X_ID]
    ON [dbo].[ordenes_de_servicio_varias]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [CLI17_CLIENTES_SERVICIO_X_ID]
    ON [dbo].[ordenes_de_servicio_varias]([CLIENTE_SERVICIO_ID] ASC);
GO


## 252: orden_facturacion.sql
CREATE TABLE [dbo].[orden_facturacion] (
    [ORDEN_ID] INT NOT NULL,
    [ORDEN]    INT NULL,
    PRIMARY KEY CLUSTERED ([ORDEN_ID] ASC)
);
GO


## 253: padron_rentas.sql
CREATE TABLE [dbo].[padron_rentas] (
    [CUIT]                 VARCHAR (11)   NOT NULL,
    [ALICUOTAS_PERCEPCION] DECIMAL (7, 2) NULL,
    [ALICUOTA_RETENCION]   DECIMAL (7, 2) NULL,
    [GRUPO_PERCEPCION]     TINYINT        NULL,
    [GRUPO_RETENCION]      TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([CUIT] ASC)
);
GO


## 254: parametros_agua.sql
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


## 255: Parametros_factura_web.sql
CREATE TABLE [dbo].[Parametros_factura_web] (
    [ID]                     INT NOT NULL,
    [PARAMETRO_ID_TELEFONIA] INT NULL,
    [PARAMETRO_ID_INTERNET]  INT NULL,
    [PUESTO_A_ID_TELEFONIA]  INT NULL,
    [PUESTO_B_ID_TELEFONIA]  INT NULL,
    [PUESTO_A_ID_INTERNET]   INT NULL,
    [PUESTO_B_ID_INTERNET]   INT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 256: parametros_gestion_deuda.sql
CREATE TABLE [dbo].[parametros_gestion_deuda] (
    [ID_PARAMETRO]               INT NOT NULL,
    [DIAS_1ER_INTIMA_I]          INT NULL,
    [DIAS_SUSP_I]                INT NULL,
    [DIAS_AVISO_CORTE_I]         INT NULL,
    [DIAS_CORTE_I]               INT NULL,
    [DIAS_1ER_INTIMA_T]          INT NULL,
    [DIAS_2DA_INTIMA_T]          INT NULL,
    [DIAS_SUSPENSIONES_T]        INT NULL,
    [DIAS_AVISO_CORTE_TELEFONIA] INT NULL,
    [DIAS_CORTE_TELEFONIA]       INT NULL,
    PRIMARY KEY CLUSTERED ([ID_PARAMETRO] ASC)
);
GO


## 257: parametros.sql
CREATE TABLE [dbo].[parametros] (
    [PARAMETROS_ID]                                        INT             NOT NULL,
    [IP_FIJA]                                              INT             NULL,
    [F_EN_GUIA]                                            INT             NULL,
    [fecha_gestion_de_deuda]                               DATETIME        NULL,
    [dias_intima]                                          INT             NULL,
    [dias_suspencion]                                      INT             NULL,
    [dias_corte]                                           INT             NULL,
    [fecha_gestion_de_deuda_telefonia]                     DATETIME        NULL,
    [dias_intima_telefonia_1]                              INT             NULL,
    [dias_intima_telefonia_2]                              INT             NULL,
    [dias_corte_telefonia]                                 INT             NULL,
    [dias_suspencion_telefonia]                            INT             NULL,
    [numero_intimacion]                                    INT             NULL,
    [item_bocas_adicionales_id]                            INT             NULL,
    [item_mantenimiento_bocas_adicionales_id]              INT             NULL,
    [item_bocas_adicionales_modificacion_id]               INT             NULL,
    [item_mantenimiento_bocas_adicionales_modificacion_id] INT             NULL,
    [item_ba_modificacion_2_id]                            INT             NULL,
    [item_mantenimiento_ba_modificacion_2_id]              INT             NULL,
    [plan_de_pago]                                         INT             NULL,
    [item_intereses_plan_de_pago_id]                       INT             NULL,
    [item_cuota_plan_de_pago_id]                           INT             NULL,
    [item_anticipo_id]                                     INT             NULL,
    [dolar]                                                DECIMAL (18, 2) NULL,
    [dias_numero_telefonico]                               TINYINT         NULL,
    [dias_mantencion_par]                                  TINYINT         NULL,
    [dias_mantencion_puerto]                               TINYINT         NULL,
    [fecha_gestion_de_planes_de_pago]                      DATETIME        NULL,
    [dias_plan_de_pago_internet]                           TINYINT         NULL,
    [dias_plan_de_pago_telefonia]                          TINYINT         NULL,
    [dias_prorroga_habilitacion_vencimiento]               TINYINT         NULL,
    [valor_ama_local]                                      DECIMAL (18, 9) NULL,
    [valor_ama_ld]                                         DECIMAL (18, 9) NULL,
    [valor_ama_cer]                                        DECIMAL (18, 9) NULL,
    [fecha_personal]                                       DATETIME        NULL,
    [fecha_movistar]                                       DATETIME        NULL,
    [fecha_claro]                                          DATETIME        NULL,
    [cer]                                                  DECIMAL (18, 4) NULL,
    [fecha_cer]                                            DATETIME        NULL,
    [prejudicial]                                          DECIMAL (18, 2) NULL,
    [mail_dvr]                                             VARCHAR (100)   NULL,
    [item_cuota_dvr_id]                                    INT             NULL,
    [cuenta_dvr_debe]                                      INT             NULL,
    [cuenta_dvr_haber]                                     INT             NULL,
    [item_cargo_telefonia]                                 INT             NULL,
    [item_cargo_internet]                                  INT             NULL,
    [item_cargo_telefonia_mas60]                           INT             NULL,
    [item_cargo_internet_mas60]                            INT             NULL,
    [fecha_nextel]                                         DATETIME        NULL,
    [importe_tierra]                                       DECIMAL (12, 8) NULL,
    [importe_aire]                                         DECIMAL (12, 8) NULL,
    [valor_min_para_ib]                                    DECIMAL (18, 2) NULL,
    [min_tasa]                                             DECIMAL (12, 3) NULL,
    [min_acerca]                                           DECIMAL (12, 3) NULL,
    CONSTRAINT [PK__parametros__4850AF91] PRIMARY KEY CLUSTERED ([PARAMETROS_ID] ASC)
);
GO


## 258: Pares_cables.sql
CREATE TABLE [dbo].[Pares_cables] (
    [PAR_ID]                     INT           NOT NULL,
    [PAR_CRUZADA_ID]             INT           NULL,
    [CABLES_ID]                  INT           NULL,
    [CABLES_CRUZADA_ID]          INT           NULL,
    [NUMERO_DE_PAR]              INT           NULL,
    [NUMERO_DE_PAR_CRUZADA]      INT           NULL,
    [CAJA_ID]                    INT           NULL,
    [ARMARIO_ID]                 INT           NULL,
    [ESTADO]                     VARCHAR (2)   NULL,
    [CLIENTE_ID]                 INT           NULL,
    [TAG]                        TINYINT       NULL,
    [TAG_1]                      TINYINT       NULL,
    [PRIMARIO_SECUNDARIO]        VARCHAR (1)   NULL,
    [falla1]                     VARCHAR (50)  NULL,
    [calle_numero]               VARCHAR (50)  NULL,
    [fecha_vencimiento]          DATETIME      NULL,
    [observaciones]              VARCHAR (100) NULL,
    [numerador_hijos]            TINYINT       NULL,
    [cliente_servicio_internet]  INT           NULL,
    [cliente_servicio_telefonia] INT           NULL,
    PRIMARY KEY CLUSTERED ([PAR_ID] ASC),
    UNIQUE NONCLUSTERED ([CAJA_ID] ASC, [PAR_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_DE_PAR] ASC, [CABLES_ID] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_DE_PAR] ASC, [PAR_ID] ASC),
    UNIQUE NONCLUSTERED ([PAR_ID] ASC, [CAJA_ID] ASC),
    UNIQUE NONCLUSTERED ([ARMARIO_ID] ASC, [PAR_ID] ASC, [NUMERO_DE_PAR] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_DE_PAR_CRUZADA] ASC, [CABLES_ID] ASC, [PAR_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_HIJOS_ID]
    ON [dbo].[Pares_cables]([PAR_CRUZADA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_CLIENTE_ID]
    ON [dbo].[Pares_cables]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_TAG_1]
    ON [dbo].[Pares_cables]([TAG_1] ASC);
GO
CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_CABLES_ID]
    ON [dbo].[Pares_cables]([CABLES_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_TAG]
    ON [dbo].[Pares_cables]([TAG] ASC);
GO
CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_CAJA_ID]
    ON [dbo].[Pares_cables]([CAJA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PAR_PARES_CABLES_X_CABLE_ID_Y_NUMERO_PAR]
    ON [dbo].[Pares_cables]([CABLES_ID] ASC, [NUMERO_DE_PAR] ASC, [ESTADO] ASC);
GO


## 259: pasar.sql
CREATE TABLE [dbo].[pasar] (
    [ID] INT              NOT NULL,
    [A]  VARCHAR (90)     NULL,
    [B]  VARCHAR (500)    NULL,
    [C]  VARCHAR (40)     NULL,
    [D]  VARCHAR (40)     NULL,
    [E]  VARCHAR (40)     NULL,
    [F]  VARCHAR (40)     NULL,
    [G]  VARCHAR (40)     NULL,
    [H]  VARCHAR (40)     NULL,
    [I]  VARCHAR (40)     NULL,
    [J]  VARCHAR (40)     NULL,
    [K]  VARCHAR (40)     NULL,
    [L]  VARCHAR (40)     NULL,
    [M]  VARCHAR (40)     NULL,
    [N]  VARCHAR (40)     NULL,
    [O]  VARCHAR (40)     NULL,
    [P]  VARCHAR (40)     NULL,
    [Q]  VARCHAR (40)     NULL,
    [R]  VARCHAR (40)     NULL,
    [S]  VARCHAR (40)     NULL,
    [T]  VARCHAR (40)     NULL,
    [U]  VARCHAR (40)     NULL,
    [V]  VARCHAR (40)     NULL,
    [W]  VARCHAR (40)     NULL,
    [X]  VARCHAR (40)     NULL,
    [a1] DECIMAL (18, 10) NULL,
    [b1] DECIMAL (18, 10) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 260: pasa.sql
CREATE TABLE [dbo].[pasa] (
    [id]       INT              NOT NULL,
    [latitud]  DECIMAL (18, 10) NULL,
    [longitud] DECIMAL (18, 10) NULL,
    CONSTRAINT [PK_pasa] PRIMARY KEY CLUSTERED ([id] ASC)
);
GO


## 261: pcs_puestos_facturacion.sql
CREATE TABLE [dbo].[pcs_puestos_facturacion] (
    [PCS_PUESTOS_FACTURACION_ID] INT          NOT NULL,
    [PUESTO_ID]                  INT          NULL,
    [PC]                         VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([PCS_PUESTOS_FACTURACION_ID] ASC),
    UNIQUE NONCLUSTERED ([PUESTO_ID] ASC, [PC] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PCS_X_PUESTO_ID]
    ON [dbo].[pcs_puestos_facturacion]([PUESTO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PCS_X_PC]
    ON [dbo].[pcs_puestos_facturacion]([PC] ASC);
GO


## 262: Percepciones_cpp.sql
CREATE TABLE [dbo].[Percepciones_cpp] (
    [PERCEPCION_CPP_ID]   INT NOT NULL,
    [PERCEPCION_ID]       INT NULL,
    [PRESTATARIA_CPP_ID]  INT NULL,
    [ITEM_FACTURACION_ID] INT NULL,
    PRIMARY KEY CLUSTERED ([PERCEPCION_CPP_ID] ASC),
    UNIQUE NONCLUSTERED ([PRESTATARIA_CPP_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PR11_X_PERCEPCION_ID]
    ON [dbo].[Percepciones_cpp]([PERCEPCION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PR11_X_PERCEPCION_IDD_Y_PRESTATARIA_CPP_ID]
    ON [dbo].[Percepciones_cpp]([PERCEPCION_ID] ASC, [PRESTATARIA_CPP_ID] ASC);
GO


## 263: Percepciones_escalas.sql
CREATE TABLE [dbo].[Percepciones_escalas] (
    [PERCEPCIONES_ESCALAS_ID] INT            NOT NULL,
    [PERCEPCION_ID]           INT            NULL,
    [POR_IMPORTE]             TINYINT        NULL,
    [POR_PORCENTAJE]          TINYINT        NULL,
    [DESDE]                   DECIMAL (9, 2) NULL,
    [HASTA]                   DECIMAL (9, 2) NULL,
    [RETENCION]               DECIMAL (5, 2) NULL,
    [FIJO]                    DECIMAL (9, 2) NULL,
    PRIMARY KEY CLUSTERED ([PERCEPCIONES_ESCALAS_ID] ASC),
    UNIQUE NONCLUSTERED ([PERCEPCION_ID] ASC, [PERCEPCIONES_ESCALAS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PR2_PERCEPCIONES_ESCALAS_X_PERCEPCION_ID]
    ON [dbo].[Percepciones_escalas]([PERCEPCION_ID] ASC);
GO


## 264: Percepciones_items_opcionales.sql
CREATE TABLE [dbo].[Percepciones_items_opcionales] (
    [PERCEPCION_ID]                     INT            NOT NULL,
    [DESCRIPCION]                       VARCHAR (30)   NULL,
    [COLUMNA_SUBDIARIO_IVA]             TINYINT        NULL,
    [DESCRIPCION_SUBDIARIO_IVA]         VARCHAR (8)    NULL,
    [COLUMNA_SUBDIARIO_FACTURACION]     TINYINT        NULL,
    [DESCRIPCION_SUBDIARIO_FACTURACION] VARCHAR (8)    NULL,
    [CUENTA]                            VARCHAR (30)   NULL,
    [LIBRO_IVA]                         TINYINT        NULL,
    [TIPO]                              VARCHAR (4)    NULL,
    [BASE_IMPONIBLE]                    DECIMAL (9, 2) NULL,
    [CODIGO_DE_IMPUESTO]                INT            NULL,
    [CODIGO_DE_REGIMEN]                 INT            NULL,
    [PORCENTAJE_DE_APLICACION]          DECIMAL (7, 2) NULL,
    [IMPORTE_DE_APLICACION]             DECIMAL (9, 2) NULL,
    [FECHA_BOLETIN]                     DATETIME       NULL,
    [POR_ESCALAS]                       TINYINT        NULL,
    [ITEM_FACTURACION_ID]               INT            NULL,
    PRIMARY KEY CLUSTERED ([PERCEPCION_ID] ASC)
);
GO


## 265: Percepciones.sql
CREATE TABLE [dbo].[Percepciones] (
    [PERCEPCION_ID]                     INT            NOT NULL,
    [DESCRIPCION]                       VARCHAR (30)   NULL,
    [COLUMNA_SUBDIARIO_IVA]             TINYINT        NULL,
    [DESCRIPCION_SUBDIARIO_IVA]         VARCHAR (8)    NULL,
    [COLUMNA_SUBDIARIO_FACTURACION]     TINYINT        NULL,
    [DESCRIPCION_SUBDIARIO_FACTURACION] VARCHAR (8)    NULL,
    [CUENTA]                            VARCHAR (30)   NULL,
    [LIBRO_IVA]                         TINYINT        NULL,
    [TIPO]                              VARCHAR (4)    NULL,
    [BASE_IMPONIBLE]                    DECIMAL (9, 2) NULL,
    [CODIGO_DE_IMPUESTO]                INT            NULL,
    [CODIGO_DE_REGIMEN]                 INT            NULL,
    [PORCENTAJE_DE_APLICACION]          DECIMAL (7, 2) NULL,
    [IMPORTE_DE_APLICACION]             DECIMAL (9, 2) NULL,
    [FECHA_BOLETIN]                     DATETIME       NULL,
    [POR_ESCALAS]                       TINYINT        NULL,
    [Item_facturacion_id]               INT            NULL,
    PRIMARY KEY CLUSTERED ([PERCEPCION_ID] ASC)
);
GO


## 266: Periodos_facturacion.sql
CREATE TABLE [dbo].[Periodos_facturacion] (
    [PERIODO_ID]                    INT            NOT NULL,
    [SERVICIOS]                     VARCHAR (19)   NULL,
    [A]                             INT            NULL,
    [M]                             TINYINT        NULL,
    [PERIODO]                       VARCHAR (10)   NULL,
    [LEYENDA]                       VARCHAR (2000) NULL,
    [CERRADO]                       TINYINT        NULL,
    [ORDEN_IMPRESION_A]             INT            NULL,
    [ORDEN_IMPRESION_B]             INT            NULL,
    [ORDEN_IMPRESION_S]             INT            NULL,
    [CLIENTES_HASTA]                DATETIME       NULL,
    [PERIODO_DESDE]                 DATETIME       NULL,
    [VENCIMIENTO]                   DATETIME       NULL,
    [PROXIMO_VENCIMIENTO]           DATETIME       NULL,
    [PERIODO_HASTA]                 DATETIME       NULL,
    [Ventas_internet_p_inicio]      INT            NULL,
    [Ventas_internet_p_final]       INT            NULL,
    [CLIENTES_DESDE]                DATETIME       NULL,
    [PERIODO_ADELANTADO_DESDE]      DATETIME       NULL,
    [consumo_desde]                 DATETIME       NULL,
    [consumo_hasta]                 DATETIME       NULL,
    [fecha_debito_auto]             DATETIME       NULL,
    [periodo_facturado]             TINYINT        NULL,
    [clientes_agrupados_facturados] TINYINT        NULL
);
GO


## 267: permisos_de_cobertura.sql
CREATE TABLE [dbo].[permisos_de_cobertura] (
    [COBERTURAS_DE_CAJAS_ID] INT           NOT NULL,
    [CAJAS_ID]               INT           NULL,
    [CODIGO_CALLE]           INT           NULL,
    [DESDE]                  INT           NULL,
    [HASTA]                  INT           NULL,
    [FUERA_DE_ZONA]          TINYINT       NULL,
    [OBSERVACION]            VARCHAR (199) NULL,
    PRIMARY KEY CLUSTERED ([COBERTURAS_DE_CAJAS_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_CALLE] ASC, [COBERTURAS_DE_CAJAS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [COB2_COBERTURAS_DE_CAJAS_X_CODIGO_CALLE]
    ON [dbo].[permisos_de_cobertura]([CODIGO_CALLE] ASC);
GO
CREATE NONCLUSTERED INDEX [COB2_COBERTURAS_DE_CAJAS_X_CAJA_ID]
    ON [dbo].[permisos_de_cobertura]([CAJAS_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [COB2_COBERTURAS_DE_CAJAS_X_CAJAS_ID_Y_ID]
    ON [dbo].[permisos_de_cobertura]([CAJAS_ID] ASC, [COBERTURAS_DE_CAJAS_ID] ASC);
GO


## 268: permisos.sql
CREATE TABLE [dbo].[permisos] (
    [PERMISO_ID] INT          NOT NULL,
    [PERMISO]    VARCHAR (49) NULL,
    PRIMARY KEY CLUSTERED ([PERMISO_ID] ASC)
);
GO


## 269: p_Facturas_items.sql
CREATE TABLE [dbo].[p_Facturas_items] (
    [FACTURAS_ITEMS_ID]                       INT             NOT NULL,
    [FACTURA_ID]                              INT             NULL,
    [NUMERO_FACTURA]                          VARCHAR (19)    NULL,
    [ITEM_FACTURACION_ID]                     INT             NULL,
    [ITEM_FACTURACION_DESCRIPCION]            VARCHAR (40)    NULL,
    [VALOR_UNITARIO]                          DECIMAL (13, 2) NULL,
    [TOTAL]                                   DECIMAL (13, 2) NULL,
    [IVA]                                     DECIMAL (11, 2) NULL,
    [Columna_subdiario_iva]                   TINYINT         NULL,
    [ITEMS_ARCHIVOS_ID]                       INT             NULL,
    [ARTICULO_ID]                             INT             NULL,
    [CANTIDAD]                                DECIMAL (7, 2)  NULL,
    [PERIODO]                                 VARCHAR (10)    NULL,
    [SERVICIOS]                               VARCHAR (19)    NULL,
    [PERIODO_ID]                              INT             NULL,
    [EN_FACTURA]                              TINYINT         NULL,
    [IMPORTE_FACTURA]                         DECIMAL (13, 2) NULL,
    [TOTAL_CUOTAS]                            INT             NULL,
    [CUOTA_ACTUAL]                            INT             NULL,
    [PINTA]                                   TINYINT         NULL,
    [columna_subdiario_facturacion]           TINYINT         NULL,
    [item_en_cliente_servicio_id]             INT             NULL,
    [item_en_clientes_servicios_historico_id] INT             NULL,
    [items_aplicacion_id]                     INT             NULL,
    [ITEM_EN_CLIENTE_SERVICIO_PARA_CORTE_ID]  INT             NULL,
    [que_es]                                  VARCHAR (19)    NULL,
    [cliente_id]                              INT             NULL,
    [cliente_servicio_id]                     INT             NULL,
    [cliente]                                 VARCHAR (50)    NULL,
    [orden]                                   INT             NULL
);
GO


## 270: p_Facturas_s.sql
CREATE TABLE [dbo].[p_Facturas_s] (
    [FACTURA_ID]                    INT             NOT NULL,
    [QUE_ES]                        VARCHAR (19)    NULL,
    [TIPO]                          VARCHAR (1)     NULL,
    [NUMERO_FACTURA]                VARCHAR (19)    NULL,
    [SERVICIOS]                     VARCHAR (19)    NULL,
    [PERIODO]                       VARCHAR (10)    NULL,
    [PERIODO_ID]                    INT             NULL,
    [ANULADO]                       TINYINT         NULL,
    [IMPRESO]                       TINYINT         NULL,
    [ORDEN_IMPRESION]               INT             NULL,
    [CONTROL]                       TINYINT         NULL,
    [CLIENTE_ID]                    INT             NULL,
    [CLIENTE_SERVICIO_ID]           INT             NULL,
    [CLASIFICACION_IVA]             TINYINT         NULL,
    [IMPORTE]                       DECIMAL (15, 4) NULL,
    [SALDO]                         DECIMAL (15, 4) NULL,
    [PARA_INTERESES]                DECIMAL (15, 4) NULL,
    [FECHA_EMISION]                 DATETIME        NULL,
    [FECHA_VENCIMIENTO]             DATETIME        NULL,
    [Neto]                          DECIMAL (18, 2) NULL,
    [IVA_1]                         DECIMAL (18, 2) NULL,
    [IVA_2]                         DECIMAL (18, 2) NULL,
    [Exento]                        DECIMAL (18, 2) NULL,
    [IB]                            DECIMAL (18, 2) NULL,
    [Fecha_pago]                    DATETIME        NULL,
    [Neto_2]                        DECIMAL (18, 2) NULL,
    [Nota_de_credito]               VARCHAR (19)    NULL,
    [Puesto_id]                     INT             NULL,
    [Motivo]                        VARCHAR (20)    NULL,
    [Percepcion_id]                 INT             NULL,
    [periodo_calculo_id]            INT             NULL,
    [Debito_automatico]             INT             NULL,
    [desde]                         DATETIME        NULL,
    [hasta]                         DATETIME        NULL,
    [IVA_3]                         DECIMAL (18, 2) NULL,
    [IVA_4]                         DECIMAL (18, 2) NULL,
    [Interes]                       DECIMAL (9, 2)  NULL,
    [Iva_interes]                   DECIMAL (9, 2)  NULL,
    [fecha_intimacion]              DATETIME        NULL,
    [personal_neto]                 DECIMAL (18, 2) NULL,
    [personal_iva21]                DECIMAL (18, 2) NULL,
    [personal_iva27]                DECIMAL (18, 2) NULL,
    [personal_iva105]               DECIMAL (18, 2) NULL,
    [personal_iva135]               DECIMAL (18, 2) NULL,
    [movistar_neto]                 DECIMAL (18, 2) NULL,
    [movistar_iva21]                DECIMAL (18, 2) NULL,
    [movistar_iva27]                DECIMAL (18, 2) NULL,
    [movistar_iva105]               DECIMAL (18, 2) NULL,
    [movistar_iva135]               DECIMAL (18, 2) NULL,
    [intima]                        TINYINT         NULL,
    [recibida]                      TINYINT         NULL,
    [numero_intimacion]             INT             NULL,
    [fecha_suspension]              DATETIME        NULL,
    [cti_neto]                      DECIMAL (18, 2) NULL,
    [cti_iva21]                     DECIMAL (18, 2) NULL,
    [cti_iva27]                     DECIMAL (18, 2) NULL,
    [cti_iva105]                    DECIMAL (18, 2) NULL,
    [cti_iva135]                    DECIMAL (18, 2) NULL,
    [fecha_telecobranza]            DATETIME        NULL,
    [personal_pib]                  DECIMAL (18, 2) NULL,
    [movistar_pib]                  DECIMAL (18, 2) NULL,
    [cti_pib]                       DECIMAL (18, 2) NULL,
    [ruta]                          TINYINT         NULL,
    [item_opcional_neto]            DECIMAL (18, 2) NULL,
    [item_opcional_iva21]           DECIMAL (18, 2) NULL,
    [item_opcional_iva27]           DECIMAL (18, 2) NULL,
    [item_opcional_iva105]          DECIMAL (18, 2) NULL,
    [item_opcional_iva135]          DECIMAL (18, 2) NULL,
    [plan_de_pago]                  INT             NULL,
    [neto_plan_de_pago]             DECIMAL (18, 2) NULL,
    [caja_id]                       INT             NULL,
    [items_opcionales_pib]          DECIMAL (18, 2) NULL,
    [CAE]                           VARCHAR (50)    NULL,
    [fecha_vencimiento_cae]         VARCHAR (50)    NULL,
    [prejudicial]                   INT             NULL,
    [cantidad_ivr]                  TINYINT         NULL,
    [ivr]                           TINYINT         NULL,
    [usuario]                       VARCHAR (100)   NULL,
    [fecha_prejudicial]             DATETIME        NULL,
    [cuota_dvr]                     DECIMAL (18, 2) NULL,
    [lugar_pago1]                   VARBINARY (50)  NULL,
    [lugar_pago]                    VARCHAR (20)    NULL,
    [periodo_pago]                  VARCHAR (10)    NULL,
    [nextel_neto]                   DECIMAL (18, 2) NULL,
    [nextel_iva21]                  DECIMAL (18, 2) NULL,
    [nextel_iva105]                 DECIMAL (18, 2) NULL,
    [nextel_iva27]                  DECIMAL (18, 2) NULL,
    [nextel_iva135]                 DECIMAL (18, 2) NULL,
    [nextel_pib]                    DECIMAL (18, 2) NULL,
    [sub_caja_id]                   INT             NULL,
    [comprobante]                   VARCHAR (48)    NULL,
    [fecha_1er_intima]              INT             NULL,
    [fecha_2da_intima]              INT             NULL,
    [fecha_suspencion_gestion]      INT             NULL,
    [fecha_carta_doc]               INT             NULL,
    [fecha_aviso_corte]             INT             NULL,
    [fecha_corte_gestion]           INT             NULL,
    [orden_nuevo]                   INT             NULL,
    [factura_electronica]           INT             NULL,
    [mail_enviado]                  TINYINT         NULL,
    [fecha_pre_judicial_gestionado] INT             NULL,
    [fecha_pre_judicial]            INT             NULL,
    [fecha_vencimiento_city]        INT             NULL,
    [subdiario]                     VARCHAR (50)    NULL,
    [iva_negativo_city]             DECIMAL (18, 2) NULL,
    [Region]                        VARCHAR (50)    NULL,
    [MB_B]                          DECIMAL (18, 2) NULL,
    [MB_S]                          DECIMAL (18, 2) NULL,
    [tipo_tecnologia]               VARCHAR (50)    NULL,
    [categoria_telefonia]           VARCHAR (50)    NULL,
    [plan_comercial_id]             INT             NULL,
    [importe_enacom]                DECIMAL (18, 2) NULL,
    [domicilio_servicio]            VARCHAR (599)   NULL,
    [domicilio_postal]              VARCHAR (899)   NULL,
    [marca_devolver_interes]        TINYINT         NULL,
    [mail_primario]                 VARCHAR (120)   NULL,
    [mail_secundario]               VARCHAR (120)   NULL,
    [factura_de_credito]            TINYINT         NULL,
    [CIS]                           VARCHAR (15)    NULL,
    [factura_agrupada]              TINYINT         NULL,
    [cliente_servicio_agrupado_id]  INT             NULL,
    [otros]                         DECIMAL (18, 2) NULL,
    [qr]                            VARCHAR (250)   NULL
);
GO


## 271: placa_fibra1.sql
CREATE TABLE [dbo].[placa_fibra1] (
    [PLACA_ID]             INT          NOT NULL,
    [POSICIONES_EQUIPO_ID] INT          NULL,
    [DESCRIPCION]          VARCHAR (89) NULL,
    [NUMERO_DE_PLACA]      CHAR (20)    NULL,
    [NUMERO_DE_POSICION]   INT          NULL,
    [CANTIDAD_DE_PUERTOS]  INT          NULL,
    [DATOS]                TINYINT      NULL,
    [VOZ]                  TINYINT      NULL,
    [VIDEO]                TINYINT      NULL,
    [HABILITADO]           TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([PLACA_ID] ASC)
);
GO


## 272: placa_fibra.sql
CREATE TABLE [dbo].[placa_fibra] (
    [PLACA_ID]             INT          NOT NULL,
    [POSICIONES_EQUIPO_ID] INT          NULL,
    [DESCRIPCION]          VARCHAR (89) NULL,
    [NUMERO_DE_PLACA]      CHAR (20)    NULL,
    [NUMERO_DE_POSICION]   INT          NULL,
    [CANTIDAD_DE_PUERTOS]  INT          NULL,
    [DATOS]                TINYINT      NULL,
    [VOZ]                  TINYINT      NULL,
    [VIDEO]                TINYINT      NULL,
    [HABILITADO]           TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([PLACA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PLA5_X_EQUIPO_ID]
    ON [dbo].[placa_fibra]([POSICIONES_EQUIPO_ID] ASC);
GO


## 273: Placas.sql
CREATE TABLE [dbo].[Placas] (
    [PLACA_ID]            INT          NOT NULL,
    [POSICION_EQUIPO_ID]  INT          NULL,
    [DESCRIPCION]         VARCHAR (30) NULL,
    [NUMERO_DE_PLACA]     VARCHAR (50) NULL,
    [NUMERO_DE_POSICION]  TINYINT      NULL,
    [CANTIDAD_DE_PUERTOS] INT          NULL,
    [DATOS]               TINYINT      NULL,
    [VOZ]                 TINYINT      NULL,
    [VIDEO]               TINYINT      NULL,
    [habilitada]          TINYINT      NULL,
    CONSTRAINT [PK__Placas__24B26D99] PRIMARY KEY CLUSTERED ([PLACA_ID] ASC),
    CONSTRAINT [UQ__Placas__25A691D2] UNIQUE NONCLUSTERED ([POSICION_EQUIPO_ID] ASC, [PLACA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PLA_PLACAS_X_EQUIPO_Y_NUMERO_DE_PLACA]
    ON [dbo].[Placas]([POSICION_EQUIPO_ID] ASC, [NUMERO_DE_PLACA] ASC);
GO
CREATE NONCLUSTERED INDEX [PLA_PLACAS_X_POSICION_EQUIPO_ID]
    ON [dbo].[Placas]([POSICION_EQUIPO_ID] ASC);
GO


## 274: plan_comercial.sql
CREATE TABLE [dbo].[plan_comercial] (
    [PLAN_COMERCIAL_ID]   INT             NOT NULL,
    [DESCRIPCION]         VARCHAR (40)    NULL,
    [SERVICIO]            VARCHAR (10)    NULL,
    [Bajada_minimo]       INT             NULL,
    [Bajada_maximo]       INT             NULL,
    [Subida_minimo]       INT             NULL,
    [Subida_maximo]       INT             NULL,
    [Importe_basico]      DECIMAL (18, 2) NULL,
    [suspendido]          INT             NULL,
    [cantidad_de_numeros] INT             NULL,
    [importe_comision]    DECIMAL (18, 2) NULL,
    [cantidad_de_DDN]     INT             NULL,
    [cantidad_de_DDI]     INT             NULL,
    [cantidad_de_mails]   INT             NULL,
    [cantidad_de_bocas]   INT             NULL,
    [tecnica]             TINYINT         NULL,
    [MB_B]                DECIMAL (18, 2) NULL,
    [MB_S]                DECIMAL (18, 2) NULL,
    [desactivado]         TINYINT         NULL,
    CONSTRAINT [PK__plan_comercial__7993056A] PRIMARY KEY CLUSTERED ([PLAN_COMERCIAL_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [UQ__plan_comercial__7A8729A3]
    ON [dbo].[plan_comercial]([DESCRIPCION] ASC);
GO


## 275: planes_de_pago.sql
CREATE TABLE [dbo].[planes_de_pago] (
    [PLANES_DE_PAGO_ID] INT            NOT NULL,
    [DESCRIPCION]       VARCHAR (100)  NULL,
    [DESDE]             DECIMAL (7, 2) NULL,
    [HASTA]             DECIMAL (7, 2) NULL,
    [SERVICIO]          VARCHAR (50)   NULL,
    PRIMARY KEY CLUSTERED ([PLANES_DE_PAGO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PLA4_X_DESDE]
    ON [dbo].[planes_de_pago]([DESDE] ASC);
GO
CREATE NONCLUSTERED INDEX [PLA4_X_DESDE_Y_HASTA]
    ON [dbo].[planes_de_pago]([DESDE] ASC, [HASTA] ASC);
GO
CREATE NONCLUSTERED INDEX [PLA4_X_SERVICIO]
    ON [dbo].[planes_de_pago]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [PLA4_X_HASTA]
    ON [dbo].[planes_de_pago]([HASTA] ASC);
GO


## 276: planes_dvr.sql
CREATE TABLE [dbo].[planes_dvr] (
    [PLANES_DVR]  INT            NOT NULL,
    [DESCRIPCION] VARCHAR (100)  NULL,
    [PORCENTAJE]  DECIMAL (7, 2) NULL,
    [CUOTAS]      INT            NULL,
    PRIMARY KEY CLUSTERED ([PLANES_DVR] ASC)
);
GO


## 277: planes_tarifas.sql
CREATE TABLE [dbo].[planes_tarifas] (
    [PLANES_TARIFAS_ID] INT          NOT NULL,
    [PLAN_COMERCIAL_ID] INT          NULL,
    [DESCRIPCION]       VARCHAR (19) NULL,
    [DESDE]             INT          NULL,
    [HASTA]             INT          NULL,
    [PORCENTAJE]        INT          NULL,
    [reducido]          TINYINT      NULL,
    [tipo]              TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([PLANES_TARIFAS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [x_plan_comercial_id_y_tipo]
    ON [dbo].[planes_tarifas]([PLAN_COMERCIAL_ID] ASC, [tipo] ASC);
GO
CREATE NONCLUSTERED INDEX [PLA3_X_PLAN_COMERCIAL_ID]
    ON [dbo].[planes_tarifas]([PLAN_COMERCIAL_ID] ASC);
GO


## 278: planes_telefonia_internet.sql
CREATE TABLE [dbo].[planes_telefonia_internet] (
    [PLANES_TELEFONIA_INTERNET_ID] INT NOT NULL,
    [PLAN_TELEFONIA_ID]            INT NULL,
    [PLAN_INTERNET_ID]             INT NULL,
    PRIMARY KEY CLUSTERED ([PLANES_TELEFONIA_INTERNET_ID] ASC),
    UNIQUE NONCLUSTERED ([PLAN_TELEFONIA_ID] ASC, [PLAN_INTERNET_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PLA2_X_PLAN_TELEFONIA]
    ON [dbo].[planes_telefonia_internet]([PLAN_TELEFONIA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PLA2_X_PLAN_INTERNET]
    ON [dbo].[planes_telefonia_internet]([PLAN_INTERNET_ID] ASC);
GO


## 279: Posiciones_equipos.sql
CREATE TABLE [dbo].[Posiciones_equipos] (
    [POSICION_EQUIPOS_ID] INT     NOT NULL,
    [EQUIPOS_ID]          INT     NULL,
    [OCUPADO]             TINYINT NULL,
    [PLACA_ID]            INT     NULL,
    [POSICION]            TINYINT NULL,
    PRIMARY KEY CLUSTERED ([POSICION_EQUIPOS_ID] ASC),
    UNIQUE NONCLUSTERED ([EQUIPOS_ID] ASC, [POSICION] ASC)
);
GO
CREATE NONCLUSTERED INDEX [POS1_POSICIONES_EQUIPOS_ID_Y_PLACA_ID]
    ON [dbo].[Posiciones_equipos]([EQUIPOS_ID] ASC, [PLACA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [POS1_POSICIONES_EQUIPOS_X_PLACA_ID]
    ON [dbo].[Posiciones_equipos]([PLACA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [POS1_POSICIONES_EQUIPOS_X_EQUIPOS_ID]
    ON [dbo].[Posiciones_equipos]([EQUIPOS_ID] ASC);
GO


## 280: posiciones_fibra1.sql
CREATE TABLE [dbo].[posiciones_fibra1] (
    [POSICIONES_ID]       INT          NOT NULL,
    [POSICION]            INT          NULL,
    [PUERTO_ID]           INT          NULL,
    [NUM_PUERTO]          INT          NULL,
    [PLACA_ID]            INT          NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [OCUPADO]             TINYINT      NULL,
    [FALLA]               TINYINT      NULL,
    [RESERVADO]           TINYINT      NULL,
    [CALLE]               VARCHAR (19) NULL,
    [NUMERO_CALLE]        INT          NULL,
    [RELACIONADO]         TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([POSICIONES_ID] ASC)
);
GO


## 281: posiciones_fibra.sql
CREATE TABLE [dbo].[posiciones_fibra] (
    [POSICIONES_ID]       INT          NOT NULL,
    [POSICION]            INT          NULL,
    [PUERTO_ID]           INT          NULL,
    [NUM_PUERTO]          INT          NULL,
    [PLACA_ID]            INT          NULL,
    [CLIENTE_ID]          INT          NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [OCUPADO]             TINYINT      NULL,
    [FALLA]               TINYINT      NULL,
    [RESERVADO]           TINYINT      NULL,
    [CALLE]               VARCHAR (19) NULL,
    [NUMERO_CALLE]        INT          NULL,
    [RELACIONADO]         TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([POSICIONES_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [POS2_X_PLACA_ID]
    ON [dbo].[posiciones_fibra]([PLACA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [POS2_X_PUERTO_ID]
    ON [dbo].[posiciones_fibra]([PUERTO_ID] ASC);
GO


## 282: Posiciones_racks.sql
CREATE TABLE [dbo].[Posiciones_racks] (
    [POSICIONES_RACKS_ID] INT     NOT NULL,
    [RACK_ID]             INT     NULL,
    [OCUPADO]             TINYINT NULL,
    [NUMERO]              TINYINT NULL,
    PRIMARY KEY CLUSTERED ([POSICIONES_RACKS_ID] ASC),
    UNIQUE NONCLUSTERED ([RACK_ID] ASC, [NUMERO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [POS_POSICIONES_RACKS_X_RACK_ID]
    ON [dbo].[Posiciones_racks]([RACK_ID] ASC);
GO


## 283: preguntas_llamados.sql
CREATE TABLE [dbo].[preguntas_llamados] (
    [ID_PREGUNTAS] INT           NOT NULL,
    [PREGUNTA]     VARCHAR (149) NULL,
    PRIMARY KEY CLUSTERED ([ID_PREGUNTAS] ASC)
);
GO


## 284: Premios_y_castigos.sql
CREATE TABLE [dbo].[Premios_y_castigos] (
    [PREMIOS_Y_CASTIGOS_ID]    INT              NOT NULL,
    [CLIENTE_ID]               INT              NULL,
    [CUENTA]                   INT              NULL,
    [NOMBRE]                   VARCHAR (40)     NULL,
    [QUEES]                    VARCHAR (1)      NULL,
    [CONSUMO_ORIGINAL]         DECIMAL (11, 2)  NULL,
    [CONSUMO_ACTUAL]           DECIMAL (11, 2)  NULL,
    [DIFERENCIA_CONSUMO]       DECIMAL (11, 2)  NULL,
    [PERIODO]                  VARCHAR (11)     NULL,
    [TEMPERATURA_BASE]         DECIMAL (7, 1)   NULL,
    [PERIODO_ACTUAL]           VARCHAR (14)     NULL,
    [TEMPERATURA_ACTUAL]       DECIMAL (7, 1)   NULL,
    [IMPORTE_METROS99]         DECIMAL (13, 10) NULL,
    [IMPORTE_METROS]           DECIMAL (7, 4)   NULL,
    [IMPORTE_METROS_1]         DECIMAL (7, 4)   NULL,
    [IMPORTE_METROS_2]         DECIMAL (7, 4)   NULL,
    [IMPORTE_METROS_3]         DECIMAL (7, 4)   NULL,
    [METROS_BASE]              DECIMAL (9, 2)   NULL,
    [METROS_ACTUAL]            DECIMAL (9, 2)   NULL,
    [IMPORTE]                  DECIMAL (7, 2)   NULL,
    [IMPORTE_CREDITO]          DECIMAL (11, 2)  NULL,
    [R]                        TINYINT          NULL,
    [VALOR_AJUSTE]             DECIMAL (9, 2)   NULL,
    [TIPO_SUMINISTRO]          VARCHAR (15)     NULL,
    [FACTURA]                  VARCHAR (15)     NULL,
    [CREDITO]                  VARCHAR (15)     NULL,
    [PRE_FACTURA]              VARCHAR (15)     NULL,
    [FACTURA_QUE_LO_GENERO]    VARCHAR (15)     NULL,
    [SALDO]                    DECIMAL (7, 2)   NULL,
    [DIAS]                     TINYINT          NULL,
    [DIAS_FACT]                TINYINT          NULL,
    [DIFERENCIA_TARIFAS]       DECIMAL (19, 6)  NULL,
    [DIFERENCIA_IMPORTE]       DECIMAL (11, 2)  NULL,
    [SALDO_DIFERENCIA_TARIFAS] DECIMAL (9, 2)   NULL,
    [FACTURA_AJUSTE]           VARCHAR (14)     NULL,
    PRIMARY KEY CLUSTERED ([PREMIOS_Y_CASTIGOS_ID] ASC),
    UNIQUE NONCLUSTERED ([CLIENTE_ID] ASC, [PREMIOS_Y_CASTIGOS_ID] ASC),
    UNIQUE NONCLUSTERED ([PERIODO] ASC, [PREMIOS_Y_CASTIGOS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PRE13_PREMIOS_Y_CASTIGOS_X_FACTURA_QUE_LO_GENERO]
    ON [dbo].[Premios_y_castigos]([FACTURA_QUE_LO_GENERO] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE13_PREMIOS_Y_CASTIGOS_X_FACTURA_AJUSTE]
    ON [dbo].[Premios_y_castigos]([FACTURA_AJUSTE] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE13_PREMIOS_Y_CASTIGOS_X_FACTURA]
    ON [dbo].[Premios_y_castigos]([FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE13_PREMIOS_CASTIGOS_X_CLIENTE_ID_SOLO]
    ON [dbo].[Premios_y_castigos]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE13_PREMIOS_Y_CASTIGOS_X_PRE_FACTURA]
    ON [dbo].[Premios_y_castigos]([PRE_FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE13_POR_PERIODO_ACTUAL]
    ON [dbo].[Premios_y_castigos]([PERIODO_ACTUAL] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE13_PREMIOS_Y_CASTIGOS_X_FACTURAS]
    ON [dbo].[Premios_y_castigos]([FACTURA_AJUSTE] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE13_POR_CUENTA_Y_PERIODO]
    ON [dbo].[Premios_y_castigos]([CUENTA] ASC, [PERIODO_ACTUAL] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE13_PREMIOS_CASTIGOS_X_PERIODO]
    ON [dbo].[Premios_y_castigos]([PERIODO] ASC);
GO


## 285: Prestatarias_celular.sql
CREATE TABLE [dbo].[Prestatarias_celular] (
    [PRESTATARIAS_CELULAR_ID] INT          NOT NULL,
    [PRESTATARIA]             VARCHAR (40) NULL,
    [ARCHIVO]                 CHAR (41)    NULL,
    [ITEM_FACTURACION_ID]     INT          NULL,
    PRIMARY KEY CLUSTERED ([PRESTATARIAS_CELULAR_ID] ASC),
    UNIQUE NONCLUSTERED ([PRESTATARIA] ASC)
);
GO


## 286: Prestatarias.sql
CREATE TABLE [dbo].[Prestatarias] (
    [PRESTATARIAS_ID]     INT          NOT NULL,
    [PRESTATARIA]         VARCHAR (40) NULL,
    [ARCHIVO]             CHAR (41)    NULL,
    [ITEM_FACTURACION_ID] INT          NULL,
    [INICIO_ARCHIVO]      INT          NULL,
    [FECHA_ARCHIVO]       DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([PRESTATARIAS_ID] ASC),
    UNIQUE NONCLUSTERED ([PRESTATARIA] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PRE1_PRESTATARIAS_X_ITEMS_FACTURACION_ID]
    ON [dbo].[Prestatarias]([ITEM_FACTURACION_ID] ASC);
GO


## 287: Prioridades.sql
CREATE TABLE [dbo].[Prioridades] (
    [PRIORIDAD_ID] INT          NOT NULL,
    [PRIORIDAD]    VARCHAR (40) NULL,
    PRIMARY KEY CLUSTERED ([PRIORIDAD_ID] ASC)
);
GO


## 288: proveedores.sql
CREATE TABLE [dbo].[proveedores] (
    [ID_PROVEEDOR] INT           NOT NULL,
    [PROVEEDOR]    VARCHAR (100) NULL,
    [TELEFONO]     VARCHAR (40)  NULL,
    [E_MAIL]       VARCHAR (40)  NULL,
    [DIRECCION]    VARCHAR (100) NULL,
    [estado]       TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([ID_PROVEEDOR] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PRO_KEY_ID_PROVEEDOR_NOMBRE]
    ON [dbo].[proveedores]([ID_PROVEEDOR] ASC, [PROVEEDOR] ASC);
GO


## 289: Provincias_5.sql
CREATE TABLE [dbo].[Provincias_5] (
    [PROVINCIA_ID] INT          NOT NULL,
    [PROVINCIA]    VARCHAR (40) NULL,
    PRIMARY KEY CLUSTERED ([PROVINCIA_ID] ASC),
    UNIQUE NONCLUSTERED ([PROVINCIA] ASC)
);
GO


## 290: prueba.sql
CREATE TABLE [dbo].[prueba] (
    [cliente_id] INT NULL,
    [servicio]   INT NULL
);
GO


## 291: puertos_fibra1.sql
CREATE TABLE [dbo].[puertos_fibra1] (
    [PUERTO_ID]            INT          NOT NULL,
    [PLACA_ID]             INT          NULL,
    [NUMERO_DE_PUERTO]     INT          NULL,
    [IP_FIJA]              TINYINT      NULL,
    [OCUPADO]              TINYINT      NULL,
    [EQUIPOS_DE_ACCESO_ID] INT          NULL,
    [POSICIONES]           INT          NULL,
    [FALLA]                VARCHAR (19) NULL,
    [CALLE_NUMERO]         VARCHAR (19) NULL,
    [OBSERVACIONES]        VARCHAR (19) NULL,
    [FECHA_VENCIMIENTO]    DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([PUERTO_ID] ASC)
);
GO


## 292: puertos_fibra.sql
CREATE TABLE [dbo].[puertos_fibra] (
    [PUERTO_ID]            INT          NOT NULL,
    [PLACA_ID]             INT          NULL,
    [NUMERO_DE_PUERTO]     INT          NULL,
    [IP_FIJA]              TINYINT      NULL,
    [OCUPADO]              TINYINT      NULL,
    [EQUIPOS_DE_ACCESO_ID] INT          NULL,
    [POSICIONES]           INT          NULL,
    [FALLA]                VARCHAR (19) NULL,
    [CALLE_NUMERO]         VARCHAR (19) NULL,
    [OBSERVACIONES]        VARCHAR (19) NULL,
    [FECHA_VENCIMIENTO]    DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([PUERTO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PUE1_X_PLACA_ID]
    ON [dbo].[puertos_fibra]([PLACA_ID] ASC);
GO


## 293: Puertos_ocupados.sql
CREATE TABLE [dbo].[Puertos_ocupados] (
    [PUERTO_ID]           INT           NOT NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [DIRECCION_IP]        VARCHAR (40)  NULL,
    [NRO_PUERTO]          VARCHAR (40)  NULL,
    [TIPO_PUERTO]         VARCHAR (40)  NULL,
    [APLICACION]          VARCHAR (100) NULL,
    [FECHA]               DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([PUERTO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PUE_KEY_NRO_PUERTO]
    ON [dbo].[Puertos_ocupados]([NRO_PUERTO] ASC);
GO
CREATE NONCLUSTERED INDEX [PUE_KEY_CLIENTE_SERVICIO_ID]
    ON [dbo].[Puertos_ocupados]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PUE_KEY_TIPO_PUERTO]
    ON [dbo].[Puertos_ocupados]([TIPO_PUERTO] ASC);
GO
CREATE NONCLUSTERED INDEX [PUE_KEY_PUERTO_CLIENTE_NRO_PUERTO]
    ON [dbo].[Puertos_ocupados]([PUERTO_ID] ASC, [CLIENTE_SERVICIO_ID] ASC, [NRO_PUERTO] ASC);
GO
CREATE NONCLUSTERED INDEX [PUE_KEY_APLICACION]
    ON [dbo].[Puertos_ocupados]([APLICACION] ASC);
GO
CREATE NONCLUSTERED INDEX [PUE_KEY_DIRECCION_IP]
    ON [dbo].[Puertos_ocupados]([DIRECCION_IP] ASC);
GO


## 294: Puertos.sql
CREATE TABLE [dbo].[Puertos] (
    [PUERTOS_ID]           INT           NOT NULL,
    [PLACA_ID]             INT           NULL,
    [NUMERO_DE_PUERTO]     INT           NULL,
    [IP_FIJA]              TINYINT       NULL,
    [OCUPADO]              TINYINT       NULL,
    [EQUIPOS_DE_ACCESO_ID] INT           NULL,
    [PAR_ID]               INT           NULL,
    [falla]                VARCHAR (50)  NULL,
    [calle_numero]         VARCHAR (50)  NULL,
    [observaciones]        VARCHAR (100) NULL,
    [fecha_vencimiento]    DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([PUERTOS_ID] ASC),
    UNIQUE NONCLUSTERED ([PLACA_ID] ASC, [PUERTOS_ID] ASC, [NUMERO_DE_PUERTO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PUE_PUERTOS_X_PAR_ID]
    ON [dbo].[Puertos]([PAR_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PUE_PUERTOS_X_PLACA_ID_X_PUERTO]
    ON [dbo].[Puertos]([PLACA_ID] ASC, [NUMERO_DE_PUERTO] ASC);
GO
CREATE NONCLUSTERED INDEX [PUE_PUERTOS_X_EQUIPOS_DE_ACCESO]
    ON [dbo].[Puertos]([EQUIPOS_DE_ACCESO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [PUE_PUERTOS_X_PLACA_ID]
    ON [dbo].[Puertos]([PLACA_ID] ASC);
GO


## 295: Puestos_facturacion.sql
CREATE TABLE [dbo].[Puestos_facturacion] (
    [PUESTO_ID]   INT          NOT NULL,
    [PUESTO]      INT          NULL,
    [TIPO]        VARCHAR (1)  NULL,
    [NUMERO]      INT          NULL,
    [codigo]      INT          NULL,
    [quees]       VARCHAR (50) NULL,
    [servicio]    VARCHAR (50) NULL,
    [comprobante] VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([PUESTO_ID] ASC),
    CONSTRAINT [UQ__Puestos_facturac__00FF1D08] UNIQUE NONCLUSTERED ([TIPO] ASC, [PUESTO] ASC, [comprobante] ASC)
);
GO


## 296: Puestos_pre_facturacion.sql
CREATE TABLE [dbo].[Puestos_pre_facturacion] (
    [PUESTO_ID] INT         NOT NULL,
    [PUESTO]    INT         NULL,
    [TIPO]      VARCHAR (1) NULL,
    [NUMERO]    INT         NULL,
    PRIMARY KEY CLUSTERED ([PUESTO_ID] ASC),
    UNIQUE NONCLUSTERED ([TIPO] ASC, [PUESTO] ASC)
);
GO


## 297: Pure_06.sql
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


## 298: Pure_07.sql
CREATE TABLE [dbo].[Pure_07] (
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
CREATE NONCLUSTERED INDEX [PRE11_PREMIOS_CASTIGOS_X_CUENTA]
    ON [dbo].[Pure_07]([CUENTA] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE11_X_CUENTA_Y_PERIODO]
    ON [dbo].[Pure_07]([CUENTA] ASC, [PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE11_PREMIOS_Y_CASTIGOS_X_PRE_FACTURA]
    ON [dbo].[Pure_07]([PRE_FACTURA] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE11_PREMIOS_CASTIGOS_X_PERIODO]
    ON [dbo].[Pure_07]([PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE11_PREMIOS_Y_CASTIGOS_X_FACTURA_QUE_LO_GENERO]
    ON [dbo].[Pure_07]([FACTURA_QUE_LO_GENERO] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE11_PREMIOS_Y_CASTIGOS_X_FACTURA]
    ON [dbo].[Pure_07]([FACTURA] ASC);
GO


## 299: pure_en_factura.sql
CREATE TABLE [dbo].[pure_en_factura] (
    [ID]      INT            NOT NULL,
    [FACTURA] VARCHAR (19)   NULL,
    [LEYENDA] VARCHAR (4999) NULL,
    [CUENTA]  INT            NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([FACTURA] ASC, [ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PUR_POR_FACTURA]
    ON [dbo].[pure_en_factura]([FACTURA] ASC);
GO


## 300: rack_fibra.sql
CREATE TABLE [dbo].[rack_fibra] (
    [RACK_ID]     INT          NOT NULL,
    [NODO_ID]     INT          NULL,
    [DESCRIPCION] VARCHAR (89) NULL,
    [POSICIONES]  TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([RACK_ID] ASC)
);
GO


## 301: racks.sql
CREATE TABLE [dbo].[racks] (
    [RACK_ID]     INT          NOT NULL,
    [NODO_ID]     INT          NULL,
    [DESCRIPCION] VARCHAR (30) NULL,
    [POSICIONES]  TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([RACK_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [RAC_RACK_X_NODO_ID]
    ON [dbo].[racks]([NODO_ID] ASC);
GO


## 302: radios.sql
CREATE TABLE [dbo].[radios] (
    [RADIO]       VARCHAR (5)  NOT NULL,
    [DESCRIPCION] VARCHAR (30) NULL,
    [SUBZONA]     VARCHAR (5)  NULL,
    PRIMARY KEY CLUSTERED ([RADIO] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);
GO
CREATE NONCLUSTERED INDEX [radxsubzona]
    ON [dbo].[radios]([SUBZONA] ASC);
GO


## 303: rechazo.sql
CREATE TABLE [dbo].[rechazo] (
    [RECHAZO_ID]  INT           NOT NULL,
    [DESCRIPCION] VARCHAR (255) NULL,
    PRIMARY KEY CLUSTERED ([RECHAZO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SOL_KEY_SERVICIO_DESCRIPCION]
    ON [dbo].[rechazo]([DESCRIPCION] ASC);
GO


## 304: reclamo.sql
CREATE TABLE [dbo].[reclamo] (
    [RECLAMOS_ID]            INT           NOT NULL,
    [MEDIO_ALTA_ID]          INT           NULL,
    [SERVICIO]               VARCHAR (40)  NULL,
    [OPERADOR_ID]            INT           NULL,
    [CLIENTE_ID]             INT           NULL,
    [CLIENTE_SERVICIO_ID]    INT           NULL,
    [FECHA]                  DATETIME      NULL,
    [FECHA_GUARDAR]          DATETIME      NULL,
    [TIPO_RECLAMO_ID]        INT           NULL,
    [DERIVAR_A]              INT           NULL,
    [OBSERVACIONES]          VARCHAR (999) NULL,
    [VENCE]                  DATETIME      NULL,
    [SOLUCION_ID]            INT           NULL,
    [FECHA_SOLUCION]         DATETIME      NULL,
    [PRIORIDAD]              INT           NULL,
    [ELIMINADO]              INT           NULL,
    [ELIMINADO_POR]          INT           NULL,
    [ESTADO]                 INT           NULL,
    [ESTADO_POR]             INT           NULL,
    [ESTADO_DERIVADO]        INT           NULL,
    [ESTADO_DERIVADO_POR]    INT           NULL,
    [AREA_SOLUCIONA]         INT           NULL,
    [OPERADOR_SOLUCIONA]     INT           NULL,
    [OBSERVACION_SOLUCION]   VARCHAR (999) NULL,
    [observacion_operador]   VARCHAR (999) NULL,
    [mes]                    INT           NULL,
    [id_agrupa_tipo_reclamo] INT           NULL,
    [periodo_reclamo]        VARCHAR (50)  NULL,
    [operador_alta]          INT           NULL,
    [wifi]                   TINYINT       NULL,
    [llamada]                TINYINT       CONSTRAINT [DF_reclamo_llamada] DEFAULT ((0)) NULL,
    [comentario]             NCHAR (999)   NULL,
    [fecha_llamada]          DATETIME      NULL,
    [comentarios]            VARCHAR (999) NULL,
    [hora_llamada]           VARCHAR (50)  NULL,
    [id_categoria_cnc]       TINYINT       NULL,
    [user_llamada_id]        INT           NULL,
    [respuesta_id]           TINYINT       CONSTRAINT [DF_reclamo_respuesta_id] DEFAULT ((1)) NULL,
    [impreso]                INT           NULL,
    [cuadrilla_soluciona_id] INT           NULL,
    [visita_tecnica]         TINYINT       NULL,
    [sip]                    TINYINT       NULL,
    [cuadrilla_solucion]     VARCHAR (90)  NULL,
    [problema_cliente]       TINYINT       NULL,
    [nodo]                   VARCHAR (50)  NULL,
    [calle_servicio]         VARCHAR (150) NULL,
    [nro_servicio]           INT           NULL,
    [numero_telefono]        VARCHAR (20)  NULL,
    [sector]                 VARCHAR (3)   NULL,
    [block]                  VARCHAR (3)   NULL,
    [torre]                  VARCHAR (4)   NULL,
    [piso]                   TINYINT       NULL,
    [dto]                    VARCHAR (4)   NULL,
    [casa]                   INT           NULL,
    [barrio]                 VARCHAR (16)  NULL,
    [tipo_rec]               VARCHAR (40)  NULL,
    [cantidad_movimientos]   INT           NULL,
    PRIMARY KEY CLUSTERED ([RECLAMOS_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_OPERADOR_RECLAMO]
    ON [dbo].[reclamo]([OPERADOR_ID] ASC, [RECLAMOS_ID] ASC, [CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_OPERADOR_ID]
    ON [dbo].[reclamo]([OPERADOR_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_TIPO_RECLAMO]
    ON [dbo].[reclamo]([TIPO_RECLAMO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEYESTADO_RECLAMO]
    ON [dbo].[reclamo]([ESTADO] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_ESTADO]
    ON [dbo].[reclamo]([ESTADO] ASC, [SERVICIO] ASC, [ESTADO_POR] ASC, [RECLAMOS_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_SERVICIO]
    ON [dbo].[reclamo]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_SOLUCION_ID]
    ON [dbo].[reclamo]([SOLUCION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEYPRIORIDAD]
    ON [dbo].[reclamo]([PRIORIDAD] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_SOLUCIONADOS]
    ON [dbo].[reclamo]([ESTADO] ASC, [RECLAMOS_ID] ASC, [FECHA] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_ELIMINADP_POR]
    ON [dbo].[reclamo]([ELIMINADO_POR] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_MEDIO_ALTA_ID]
    ON [dbo].[reclamo]([MEDIO_ALTA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_OPERADOR_SOLUCIONA]
    ON [dbo].[reclamo]([OPERADOR_SOLUCIONA] ASC, [AREA_SOLUCIONA] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_CLIENTE_ID]
    ON [dbo].[reclamo]([CLIENTE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_ESTADO_POR]
    ON [dbo].[reclamo]([ESTADO_POR] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_CLIENTE_SERVICIO_ID]
    ON [dbo].[reclamo]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_ADMINISTRAR_RECLAMOS]
    ON [dbo].[reclamo]([RECLAMOS_ID] ASC, [OPERADOR_ID] ASC, [SERVICIO] ASC, [ESTADO] ASC);
GO
CREATE NONCLUSTERED INDEX [REC_KEY_OBSERVACION_SOLUCION]
    ON [dbo].[reclamo]([OBSERVACION_SOLUCION] ASC);
GO


## 305: reconexiones_con_deudas.sql
CREATE TABLE [dbo].[reconexiones_con_deudas] (
    [ID]                    INT           NOT NULL,
    [CLIENTE_ID]            INT           NULL,
    [CLIENTE_SERVICIO_ID]   INT           NULL,
    [SERVICIO]              VARCHAR (49)  NULL,
    [USUARIO]               VARCHAR (79)  NULL,
    [OPERADOR]              VARCHAR (59)  NULL,
    [FECHA_DE_MODIFICACION] INT           NULL,
    [COMENTARIO]            VARCHAR (200) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 306: relacion_cables_posiciones1.sql
CREATE TABLE [dbo].[relacion_cables_posiciones1] (
    [RELACION_ID]  INT             NOT NULL,
    [CAJA_ID]      INT             NULL,
    [POS_ID]       INT             NULL,
    [CAPACITANCIA] DECIMAL (13, 2) NULL,
    [N_POS]        INT             NULL,
    [nodo]         VARCHAR (50)    NULL,
    [placa]        VARCHAR (50)    NULL,
    [puerto]       VARCHAR (50)    NULL,
    [equipo]       VARCHAR (50)    NULL,
    [rack]         VARCHAR (50)    NULL,
    [utilizado]    TINYINT         NULL,
    [orden]        INT             NULL,
    [numero_caja]  INT             NULL,
    [placa_id]     INT             NULL,
    PRIMARY KEY CLUSTERED ([RELACION_ID] ASC),
    UNIQUE NONCLUSTERED ([CAJA_ID] ASC, [RELACION_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [REL_X_CAJA]
    ON [dbo].[relacion_cables_posiciones1]([CAJA_ID] ASC);
GO


## 307: relacion_cables_posiciones.sql
CREATE TABLE [dbo].[relacion_cables_posiciones] (
    [RELACION_ID]  INT             NOT NULL,
    [CAJA_ID]      INT             NULL,
    [POS_ID]       INT             NULL,
    [CAPACITANCIA] DECIMAL (13, 2) NULL,
    [N_POS]        INT             NULL,
    [NODO]         VARCHAR (39)    NULL,
    [PLACA]        VARCHAR (39)    NULL,
    [PLACA_ID]     INT             NULL,
    [PUERTO]       VARCHAR (39)    NULL,
    [EQUIPO]       VARCHAR (39)    NULL,
    [RACK]         VARCHAR (39)    NULL,
    [UTILIZADO]    TINYINT         NULL,
    [ORDEN]        INT             NULL,
    [NUMERO_CAJA]  INT             NULL,
    PRIMARY KEY CLUSTERED ([RELACION_ID] ASC),
    UNIQUE NONCLUSTERED ([CAJA_ID] ASC, [RELACION_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [REL_X_CAJA]
    ON [dbo].[relacion_cables_posiciones]([CAJA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REL_X_CAJA_ID_Y_NUM]
    ON [dbo].[relacion_cables_posiciones]([CAJA_ID] ASC, [NUMERO_CAJA] ASC);
GO
CREATE NONCLUSTERED INDEX [REL_X_NUM_CAJA_Y_ID]
    ON [dbo].[relacion_cables_posiciones]([NUMERO_CAJA] ASC, [RELACION_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REL_X_POS_ID]
    ON [dbo].[relacion_cables_posiciones]([POS_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [REL_X_ORDEN]
    ON [dbo].[relacion_cables_posiciones]([ORDEN] ASC);
GO
CREATE NONCLUSTERED INDEX [REL_CAJA_ID_Y_ORDEN]
    ON [dbo].[relacion_cables_posiciones]([CAJA_ID] ASC, [ORDEN] ASC);
GO


## 308: relacion_cambio_titularidad.sql
CREATE TABLE [dbo].[relacion_cambio_titularidad] (
    [ID_TABLA]                 INT          NOT NULL,
    [SERVICIO_ID_ANTERIOR]     INT          NULL,
    [SERVICIO_ID_NUEVO]        INT          NULL,
    [RELACIONADO]              TINYINT      NULL,
    [NOMBRE_SERVICIO_ANTERIOR] VARCHAR (59) NULL,
    [NOMBRE_NUEVO]             VARCHAR (89) NULL,
    [FECHA]                    DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID_TABLA] ASC)
);
GO


## 309: relacion_servicios_ftth.sql
CREATE TABLE [dbo].[relacion_servicios_ftth] (
    [ID_RELACION]     INT     NOT NULL,
    [SER_INTERNET]    INT     NULL,
    [CLIENTE_ID]      INT     NULL,
    [SER_TELEFONIA_1] INT     NULL,
    [SER_TELEFONIA_2] INT     NULL,
    [MODEM_ID]        INT     NULL,
    [OCUPADO]         TINYINT NULL,
    PRIMARY KEY CLUSTERED ([ID_RELACION] ASC),
    UNIQUE NONCLUSTERED ([SER_INTERNET] ASC)
);
GO


## 310: reservas_telefonos.sql
CREATE TABLE [dbo].[reservas_telefonos] (
    [RESERVA_ID]        INT          NOT NULL,
    [NRO_TELEFONO]      INT          NULL,
    [APELLIDO]          VARCHAR (39) NULL,
    [NOMBRE]            VARCHAR (39) NULL,
    [MAIL]              VARCHAR (49) NULL,
    [COD_CALLE]         INT          NULL,
    [CALLE]             VARCHAR (29) NULL,
    [NRO_INMUEBLE]      INT          NULL,
    [DPTO_INMUEBLE]     VARCHAR (4)  NULL,
    [PISO_INMUEBLE]     VARCHAR (2)  NULL,
    [TELEFONO_CONTACTO] VARCHAR (19) NULL,
    [RESERVA]           DATETIME     NULL,
    [INSTALACION]       DATETIME     NULL,
    [HABILITACION]      DATETIME     NULL,
    [CODIGO_CLIENTE]    INT          NULL,
    [ORDEN_SERVICIO]    INT          NULL,
    [RESERVADO]         TINYINT      NULL,
    [OPERADOR_ID]       INT          NULL,
    [SIP]               TINYINT      NULL,
    [CLAVE]             VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([RESERVA_ID] ASC),
    UNIQUE NONCLUSTERED ([NRO_TELEFONO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [RES3_POR_APELLIDO_Y_NOMBRE]
    ON [dbo].[reservas_telefonos]([APELLIDO] ASC, [NOMBRE] ASC);
GO
CREATE NONCLUSTERED INDEX [RES3_POR_CALLE_Y_NRO]
    ON [dbo].[reservas_telefonos]([CALLE] ASC, [NRO_INMUEBLE] ASC);
GO


## 311: respuestas_llamados.sql
CREATE TABLE [dbo].[respuestas_llamados] (
    [ID_RESPUESTAS] INT           NOT NULL,
    [RESPUESTA]     VARCHAR (149) NULL,
    [ID_PREGUNTA]   INT           NULL,
    PRIMARY KEY CLUSTERED ([ID_RESPUESTAS] ASC)
);
GO


## 312: resultados_de_llamados.sql
CREATE TABLE [dbo].[resultados_de_llamados] (
    [ID_RESULTADOS_DE_LLAMADOS] INT          NOT NULL,
    [CLIENTES_SERVICIOS_ID]     INT          NULL,
    [CLIENTE]                   VARCHAR (49) NULL,
    [PREGUNTA_ID]               INT          NULL,
    [RESPUESTA_ID]              INT          NULL,
    [PREGUNTA]                  VARCHAR (89) NULL,
    [RESPUESTA]                 VARCHAR (89) NULL,
    [FECHA_RESULTADOS]          DATETIME     NULL,
    [estado_servicio]           VARCHAR (50) NULL,
    [estado_wifi]               TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([ID_RESULTADOS_DE_LLAMADOS] ASC)
);
GO


## 313: Rutas.sql
CREATE TABLE [dbo].[Rutas] (
    [RUTA_ID] INT          NOT NULL,
    [RUTA]    VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([RUTA_ID] ASC),
    UNIQUE NONCLUSTERED ([RUTA] ASC)
);
GO


## 314: Rutas_toma_estado.sql
CREATE TABLE [dbo].[Rutas_toma_estado] (
    [RUTAS_TOMA_ESTADO_ID] INT          NOT NULL,
    [AD]                   VARCHAR (3)  NULL,
    [CODIGO_CALLE]         INT          NULL,
    [RUTA_ID]              INT          NULL,
    [CROQUIS]              VARCHAR (10) NULL,
    [DESDE]                INT          NULL,
    [HASTA]                INT          NULL,
    [PIT]                  VARCHAR (1)  NULL,
    [ZONA]                 INT          NULL,
    PRIMARY KEY CLUSTERED ([RUTAS_TOMA_ESTADO_ID] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_CALLE] ASC, [RUTAS_TOMA_ESTADO_ID] ASC),
    UNIQUE NONCLUSTERED ([CROQUIS] ASC, [RUTA_ID] ASC),
    UNIQUE NONCLUSTERED ([CROQUIS] ASC, [RUTAS_TOMA_ESTADO_ID] ASC),
    UNIQUE NONCLUSTERED ([RUTA_ID] ASC, [RUTAS_TOMA_ESTADO_ID] ASC),
    UNIQUE NONCLUSTERED ([ZONA] ASC, [RUTA_ID] ASC, [RUTAS_TOMA_ESTADO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MOV2_MOV_TOMA_ESTADO_CALLE]
    ON [dbo].[Rutas_toma_estado]([CODIGO_CALLE] ASC);
GO
CREATE NONCLUSTERED INDEX [MOV2_RUTA_DE_TOMA_ESTADO_X_RUTA_ID]
    ON [dbo].[Rutas_toma_estado]([RUTA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [MOV2_MTC]
    ON [dbo].[Rutas_toma_estado]([CROQUIS] ASC);
GO
CREATE NONCLUSTERED INDEX [MOV2_MOV_TOMA_ESTADO_ZONA]
    ON [dbo].[Rutas_toma_estado]([ZONA] ASC);
GO
CREATE NONCLUSTERED INDEX [MOV2_MOV_TOMA_ESTADO_CODIGO]
    ON [dbo].[Rutas_toma_estado]([RUTA_ID] ASC);
GO


## 315: S_Ant_final.sql
### VACIA
CREATE TABLE [dbo].[S_Ant_final] (
    [ID_ANT_FINAL]     INT            NOT NULL,
    [ANO]              VARCHAR (4)    NULL,
    [MES]              VARCHAR (2)    NULL,
    [COD_EMPLEADO]     INT            NULL,
    [IMPORTE_ANTICIPO] DECIMAL (7, 2) NULL,
    PRIMARY KEY CLUSTERED ([ID_ANT_FINAL] ASC),
    UNIQUE NONCLUSTERED ([MES] ASC, [ANO] ASC, [COD_EMPLEADO] ASC)
);
GO


## 316: S_Anticipos.sql
### VACIA
CREATE TABLE [dbo].[S_Anticipos] (
    [ID_ANTICIPOS]     INT            NOT NULL,
    [CODIGO_EMPLEADO]  INT            NULL,
    [IMPORTE_ANTICIPO] DECIMAL (9, 2) NULL,
    [DETALLE]          VARCHAR (29)   NULL,
    [CTA_ANTICIPOS]    VARCHAR (20)   NULL,
    [FECHA]            INT            NULL,
    PRIMARY KEY CLUSTERED ([ID_ANTICIPOS] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_EMPLEADO] ASC, [ID_ANTICIPOS] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ANT1_ANTICIPO_X_COD_EMPLEADO]
    ON [dbo].[S_Anticipos]([CODIGO_EMPLEADO] ASC);
GO


## 317: S_antiguedad.sql
### VACIA
CREATE TABLE [dbo].[S_antiguedad] (
    [CODIGO] INT NOT NULL,
    [LEGAJO] INT NULL,
    [INICIO] INT NULL,
    [FINAL]  INT NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC),
    UNIQUE NONCLUSTERED ([LEGAJO] ASC, [INICIO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [ANT_ANTIGUEDAD_X_LEGAJO]
    ON [dbo].[S_antiguedad]([LEGAJO] ASC);
GO


## 318: S_Conceptos.sql
### VACIA
CREATE TABLE [dbo].[S_Conceptos] (
    [CODIGO]        INT            NOT NULL,
    [CANTIDAD]      VARCHAR (2)    NULL,
    [DESCRI]        VARCHAR (50)   NULL,
    [IMPUTA]        VARCHAR (18)   NULL,
    [CTA_ADM]       VARCHAR (20)   NULL,
    [IMPORTE]       DECIMAL (7, 2) NULL,
    [FORMA]         VARCHAR (10)   NULL,
    [FLAG]          TINYINT        NULL,
    [MES1]          TINYINT        NULL,
    [MES2]          TINYINT        NULL,
    [MES3]          TINYINT        NULL,
    [MES4]          TINYINT        NULL,
    [MES5]          TINYINT        NULL,
    [MES6]          TINYINT        NULL,
    [MES7]          TINYINT        NULL,
    [MES8]          TINYINT        NULL,
    [MES9]          TINYINT        NULL,
    [MES10]         TINYINT        NULL,
    [MES11]         TINYINT        NULL,
    [MES12]         TINYINT        NULL,
    [DESC_SOBRE]    VARCHAR (1)    NULL,
    [REMU_SOBRE]    VARCHAR (1)    NULL,
    [SOBRE]         VARCHAR (20)   NULL,
    [FORMULA]       VARCHAR (50)   NULL,
    [POR_UNICA_VEZ] TINYINT        NULL,
    [PRESENTISMO]   TINYINT        NULL,
    [POR_PERIODO]   TINYINT        NULL,
    [ANTIGUEDAD]    TINYINT        NULL,
    [PARA_EXTRAS]   TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [CON_PORDESCRI]
    ON [dbo].[S_Conceptos]([DESCRI] ASC);
GO
CREATE NONCLUSTERED INDEX [CON_PORFLAG]
    ON [dbo].[S_Conceptos]([FLAG] ASC);
GO


## 319: S_Conemple.sql
### VACIA
CREATE TABLE [dbo].[S_Conemple] (
    [CODIGO]          INT            NOT NULL,
    [IMPORTE]         DECIMAL (9, 2) NULL,
    [CONCEPTO]        INT            NOT NULL,
    [CANTIDAD]        DECIMAL (5, 2) NULL,
    [MES1]            TINYINT        NULL,
    [MES2]            TINYINT        NULL,
    [MES3]            TINYINT        NULL,
    [MES4]            TINYINT        NULL,
    [MES5]            TINYINT        NULL,
    [MES6]            TINYINT        NULL,
    [MES7]            TINYINT        NULL,
    [MES8]            TINYINT        NULL,
    [MES9]            TINYINT        NULL,
    [MES10]           TINYINT        NULL,
    [MES11]           TINYINT        NULL,
    [MES12]           TINYINT        NULL,
    [POR_UNICA_VEZ]   TINYINT        NULL,
    [CUENTA_CONTABLE] VARCHAR (19)   NULL,
    [PERIODO]         TINYINT        NULL,
    [PARA_EXTRAS]     TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([CONCEPTO] ASC, [CODIGO] ASC),
    UNIQUE NONCLUSTERED ([CODIGO] ASC, [CONCEPTO] ASC)
);
GO


## 320: scripts.sql
CREATE TABLE [dbo].[scripts] (
    [ID]          INT            NOT NULL,
    [SCRIPT]      VARCHAR (1000) NULL,
    [DESCRIPCION] VARCHAR (49)   NULL,
    [servicio]    INT            NULL,
    [motivo]      VARCHAR (80)   NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 321: S_Datos.sql
### VACIA
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


## 322: S_dias_trabajados.sql
### VACIA
CREATE TABLE [dbo].[S_dias_trabajados] (
    [ANO]    VARCHAR (4) NOT NULL,
    [MES]    VARCHAR (2) NOT NULL,
    [LEGAJO] INT         NOT NULL,
    [DIA_1]  VARCHAR (1) NULL,
    [DIA_2]  VARCHAR (1) NULL,
    [DIA_3]  VARCHAR (1) NULL,
    [DIA_4]  VARCHAR (1) NULL,
    [DIA_5]  VARCHAR (1) NULL,
    [DIA_6]  VARCHAR (1) NULL,
    [DIA_7]  VARCHAR (1) NULL,
    [DIA_8]  VARCHAR (1) NULL,
    [DIA_9]  VARCHAR (1) NULL,
    [DIA_10] VARCHAR (1) NULL,
    [DIA_11] VARCHAR (1) NULL,
    [DIA_12] VARCHAR (1) NULL,
    [DIA_13] VARCHAR (1) NULL,
    [DIA_14] VARCHAR (1) NULL,
    [DIA_15] VARCHAR (1) NULL,
    [DIA_16] VARCHAR (1) NULL,
    [DIA_17] VARCHAR (1) NULL,
    [DIA_18] VARCHAR (1) NULL,
    [DIA_19] VARCHAR (1) NULL,
    [DIA_20] VARCHAR (1) NULL,
    [DIA_21] VARCHAR (1) NULL,
    [DIA_22] VARCHAR (1) NULL,
    [DIA_23] VARCHAR (1) NULL,
    [DIA_24] VARCHAR (1) NULL,
    [DIA_25] VARCHAR (1) NULL,
    [DIA_26] VARCHAR (1) NULL,
    [DIA_27] VARCHAR (1) NULL,
    [DIA_28] VARCHAR (1) NULL,
    [DIA_29] VARCHAR (1) NULL,
    [DIA_30] VARCHAR (1) NULL,
    [DIA_31] VARCHAR (1) NULL,
    [DIA_32] VARCHAR (1) NULL,
    [DIA_33] VARCHAR (1) NULL,
    [DIA_34] VARCHAR (1) NULL,
    [DIA_35] VARCHAR (1) NULL,
    [DIA_36] VARCHAR (1) NULL,
    [DIA_37] VARCHAR (1) NULL,
    [DIA_38] VARCHAR (1) NULL,
    [DIA_39] VARCHAR (1) NULL,
    [DIA_40] VARCHAR (1) NULL,
    [DIA_41] VARCHAR (1) NULL,
    [DIA_42] VARCHAR (1) NULL,
    PRIMARY KEY CLUSTERED ([MES] ASC, [ANO] ASC, [LEGAJO] ASC)
);
GO


## 323: seccion.sql
CREATE TABLE [dbo].[seccion] (
    [SECCION] VARCHAR (7) NOT NULL,
    [CIRC]    VARCHAR (3) NULL,
    PRIMARY KEY CLUSTERED ([SECCION] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SEC_SECXCIRC]
    ON [dbo].[seccion]([CIRC] ASC);
GO


## 324: sectores_solicitudes.sql
CREATE TABLE [dbo].[sectores_solicitudes] (
    [ID_TABLA] INT          NOT NULL,
    [SECTOR]   VARCHAR (44) NULL,
    PRIMARY KEY CLUSTERED ([ID_TABLA] ASC)
);
GO


## 325: servicios_historico_llamado_rechazado.sql
CREATE TABLE [dbo].[servicios_historico_llamado_rechazado] (
    [HISTO_ID]            INT           NOT NULL,
    [CLIENTE_ID]          INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [OPERADOR_ID]         INT           NULL,
    [OPERADOR]            VARCHAR (39)  NULL,
    [FECHA]               DATETIME      NULL,
    [TIPO_RESPUESTA]      TINYINT       NULL,
    [RESPUESTA]           VARCHAR (19)  NULL,
    [COMENTARIO]          VARCHAR (599) NULL,
    PRIMARY KEY CLUSTERED ([HISTO_ID] ASC)
);
GO


## 326: servicio_solicitudes.sql
CREATE TABLE [dbo].[servicio_solicitudes] (
    [ID]       INT          NOT NULL,
    [SERVICIO] VARCHAR (44) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 327: Servicios.sql
CREATE TABLE [dbo].[Servicios] (
    [DESCRIPCION]        VARCHAR (19) NULL,
    [SERVICIO_ID]        INT          NOT NULL,
    [NUMERADOR_SERVICIO] INT          NULL,
    [NUMERADOR_A]        INT          NULL,
    [NUMERADOR_B]        INT          NULL,
    [CTA_ACTIVO_ID]      INT          NULL,
    [CTA_PASIVO_ID]      INT          NULL,
    PRIMARY KEY CLUSTERED ([SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);
GO


## 328: S_escala_remunera.sql
### VACIA
CREATE TABLE [dbo].[S_escala_remunera] (
    [CODIGO]       INT            NOT NULL,
    [DESDE]        DECIMAL (7, 2) NULL,
    [HASTA]        DECIMAL (9, 2) NULL,
    [IMPORTE]      DECIMAL (9, 2) NULL,
    [INCAPACITADO] DECIMAL (9, 2) NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC)
);
GO


## 329: S_Especiales.sql
### VACIA
CREATE TABLE [dbo].[S_Especiales] (
    [CODIGO_ESPECIAL] INT            NULL,
    [CODIGOEMP]       INT            NOT NULL,
    [CONCEPTOE]       VARCHAR (30)   NOT NULL,
    [CANTIDAD]        DECIMAL (5, 2) NULL,
    [MES1]            TINYINT        NULL,
    [MES2]            TINYINT        NULL,
    [MES3]            TINYINT        NULL,
    [MES4]            TINYINT        NULL,
    [MES5]            TINYINT        NULL,
    [MES6]            TINYINT        NULL,
    [MES7]            TINYINT        NULL,
    [MES8]            TINYINT        NULL,
    [MES9]            TINYINT        NULL,
    [MES10]           TINYINT        NULL,
    [MES11]           TINYINT        NULL,
    [MES12]           TINYINT        NULL,
    [POR_UNICA_VEZ]   TINYINT        NULL,
    [CTA_CONTABLE]    VARCHAR (20)   NULL,
    [IMPORTE]         DECIMAL (7, 2) NULL,
    PRIMARY KEY CLUSTERED ([CONCEPTOE] ASC, [CODIGOEMP] ASC),
    UNIQUE NONCLUSTERED ([CODIGO_ESPECIAL] ASC),
    UNIQUE NONCLUSTERED ([CODIGOEMP] ASC, [CODIGO_ESPECIAL] ASC),
    UNIQUE NONCLUSTERED ([CODIGOEMP] ASC, [CONCEPTOE] ASC)
);
GO


## 330: S_HIJOS.sql
### VACIA
CREATE TABLE [dbo].[S_HIJOS] (
    [CODIGO]       INT          NOT NULL,
    [LEGAJO]       INT          NULL,
    [NACIMIENTO]   INT          NULL,
    [NOMBRES]      VARCHAR (50) NULL,
    [TIPO_DOC]     VARCHAR (3)  NULL,
    [NRO_DOC]      DECIMAL (11) NULL,
    [DISCAPACIDAD] TINYINT      NULL,
    [ANOS]         INT          NULL,
    [ESCOLARIDAD]  TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC),
    UNIQUE NONCLUSTERED ([LEGAJO] ASC, [CODIGO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [HIJ_HIJOS_X_LEGAJO]
    ON [dbo].[S_HIJOS]([LEGAJO] ASC);
GO


## 331: S_Imp_para_promedio.sql
### VACIA
CREATE TABLE [dbo].[S_Imp_para_promedio] (
    [COD_LEGAJO]      INT            NOT NULL,
    [REMU_SIN_EXTRAS] DECIMAL (9, 2) NULL,
    [MES]             INT            NOT NULL,
    PRIMARY KEY CLUSTERED ([COD_LEGAJO] ASC, [MES] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MEJ1_POR_COD_LEGAJO]
    ON [dbo].[S_Imp_para_promedio]([COD_LEGAJO] ASC);
GO


## 332: S_Inactividad.sql
### VACIA
CREATE TABLE [dbo].[S_Inactividad] (
    [ANO]                 VARCHAR (4)  NOT NULL,
    [MES]                 VARCHAR (2)  NOT NULL,
    [COD_EMPLEADO]        INT          NOT NULL,
    [QUE_PASA]            VARCHAR (50) NOT NULL,
    [DIAS]                INT          NULL,
    [TOTAL_O_PRESENTISMO] VARCHAR (1)  NULL,
    PRIMARY KEY CLUSTERED ([MES] ASC, [ANO] ASC, [COD_EMPLEADO] ASC, [QUE_PASA] ASC),
    UNIQUE NONCLUSTERED ([ANO] ASC, [MES] ASC, [COD_EMPLEADO] ASC, [TOTAL_O_PRESENTISMO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [INA_X_ANO_MES_COD_EMPLEADO]
    ON [dbo].[S_Inactividad]([ANO] DESC, [MES] DESC, [COD_EMPLEADO] ASC);
GO


## 333: S_Liquidado.sql
### VACIA
CREATE TABLE [dbo].[S_Liquidado] (
    [ANO]                     VARCHAR (4)     NOT NULL,
    [MES]                     VARCHAR (2)     NOT NULL,
    [PERI]                    TINYINT         NOT NULL,
    [LEGAJO]                  INT             NOT NULL,
    [CONCEPTO]                INT             NOT NULL,
    [QUEES]                   VARCHAR (1)     NULL,
    [DESCRIPCION]             VARCHAR (50)    NULL,
    [CANTIDAD]                DECIMAL (5, 2)  NULL,
    [IMPORTE]                 DECIMAL (11, 2) NULL,
    [POR_UNICA_VEZ]           TINYINT         NULL,
    [C_E]                     VARCHAR (1)     NULL,
    [CODIGO_CUOTA_A_PAGAR]    INT             NULL,
    [BASE_PROMEDIO_SEMESTRAL] DECIMAL (9, 2)  NULL,
    PRIMARY KEY CLUSTERED ([ANO] ASC, [MES] ASC, [PERI] ASC, [LEGAJO] ASC, [CONCEPTO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [T_LIQ1_POR_ANO_MES_LEGAJO_LIQUIDADO]
    ON [dbo].[S_Liquidado]([ANO] ASC, [MES] ASC, [PERI] ASC, [LEGAJO] ASC);
GO


## 334: S_lugares.sql
### VACIA
CREATE TABLE [dbo].[S_lugares] (
    [LUGAR_ID] INT          NOT NULL,
    [SECCION]  VARCHAR (40) NULL,
    [FLAG]     TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([LUGAR_ID] ASC),
    UNIQUE NONCLUSTERED ([SECCION] ASC)
);
GO


## 335: S_mastromauro_directores_historico.sql
### VACIA
CREATE TABLE [dbo].[S_mastromauro_directores_historico] (
    [ID]                  INT            NOT NULL,
    [LEGAJO_ID]           INT            NULL,
    [FECHA_S]             DATETIME       NULL,
    [TOTAL]               DECIMAL (9, 2) NULL,
    [NETO_21]             DECIMAL (9, 2) NULL,
    [IVA_21]              DECIMAL (9, 2) NULL,
    [NETO_105]            DECIMAL (9, 2) NULL,
    [IVA_105]             DECIMAL (9, 2) NULL,
    [PERIODO_LIQUIDACION] VARCHAR (10)   NULL,
    [NRO_TARJETA]         INT            NULL,
    [IMP_A_DESCONTAR]     DECIMAL (9, 2) NULL,
    [NOMBRE]              VARCHAR (49)   NULL,
    [PERIODO]             VARCHAR (8)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 336: S_mastromauro_directores.sql
### VACIA
CREATE TABLE [dbo].[S_mastromauro_directores] (
    [ID]                  INT            NOT NULL,
    [LEGAJO_ID]           INT            NULL,
    [FECHA_S]             DATETIME       NULL,
    [TOTAL]               DECIMAL (9, 2) NULL,
    [NETO_21]             DECIMAL (9, 2) NULL,
    [IVA_21]              DECIMAL (9, 2) NULL,
    [NETO_105]            DECIMAL (9, 2) NULL,
    [IVA_105]             DECIMAL (9, 2) NULL,
    [PERIODO_LIQUIDACION] VARCHAR (10)   NULL,
    [NRO_TARJETA]         INT            NULL,
    [IMP_A_DESCONTAR]     DECIMAL (9, 2) NULL,
    [NOMBRE]              VARCHAR (49)   NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([NRO_TARJETA] ASC)
);
GO


## 337: S_mastromauro_historico.sql
### VACIA
CREATE TABLE [dbo].[S_mastromauro_historico] (
    [ID]                  INT            NOT NULL,
    [LEGAJO_ID]           INT            NULL,
    [FECHA_S]             DATETIME       NULL,
    [TOTAL]               DECIMAL (9, 2) NULL,
    [NETO_21]             DECIMAL (9, 2) NULL,
    [IVA_21]              DECIMAL (9, 2) NULL,
    [NETO_105]            DECIMAL (9, 2) NULL,
    [IVA_105]             DECIMAL (9, 2) NULL,
    [PERIODO_LIQUIDACION] VARCHAR (10)   NULL,
    [NRO_TARJETA]         INT            NULL,
    [IMP_A_DESCONTAR]     DECIMAL (9, 2) NULL,
    [NOMBRE]              VARCHAR (49)   NULL,
    [PERIODO]             VARCHAR (8)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([LEGAJO_ID] ASC, [ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [MAS1_POR_LEGAJO]
    ON [dbo].[S_mastromauro_historico]([LEGAJO_ID] ASC);
GO


## 338: S_mastromauro.sql
### VACIA
CREATE TABLE [dbo].[S_mastromauro] (
    [ID]                  INT            NOT NULL,
    [LEGAJO_ID]           INT            NULL,
    [FECHA_S]             DATETIME       NULL,
    [TOTAL]               DECIMAL (9, 2) NULL,
    [NETO_21]             DECIMAL (9, 2) NULL,
    [IVA_21]              DECIMAL (9, 2) NULL,
    [NETO_105]            DECIMAL (9, 2) NULL,
    [IVA_105]             DECIMAL (9, 2) NULL,
    [PERIODO_LIQUIDACION] VARCHAR (10)   NULL,
    [NRO_TARJETA]         INT            NULL,
    [IMP_A_DESCONTAR]     DECIMAL (9, 2) NULL,
    [NOMBRE]              VARCHAR (49)   NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([LEGAJO_ID] ASC),
    UNIQUE NONCLUSTERED ([LEGAJO_ID] ASC, [ID] ASC)
);
GO


## 339: S_Mejor.sql
### VACIA
CREATE TABLE [dbo].[S_Mejor] (
    [LEGAJO]        INT            NOT NULL,
    [REMU_ANTERIOR] DECIMAL (9, 2) NULL,
    [REMU]          DECIMAL (9, 2) NULL,
    [MES]           INT            NULL,
    [CUENTA]        INT            NULL,
    PRIMARY KEY CLUSTERED ([LEGAJO] ASC)
);
GO


## 340: solicitud_sistema.sql
CREATE TABLE [dbo].[solicitud_sistema] (
    [ID_TABLA]             INT           NOT NULL,
    [OPERADOR_ID]          INT           NULL,
    [OPERADOR]             VARCHAR (44)  NULL,
    [PEDIDO]               VARCHAR (999) NULL,
    [AREA]                 VARCHAR (19)  NULL,
    [PRIORIDAD]            TINYINT       NULL,
    [ESTADO]               TINYINT       NULL,
    [ESTADO_DESC]          VARCHAR (89)  NULL,
    [FECHA_INGRESO]        DATETIME      NULL,
    [FECHA_FINALIZADO]     DATETIME      NULL,
    [FECHA_DE_INICIO]      DATETIME      NULL,
    [GERENCIA_ID]          INT           NULL,
    [SECTOR_ID]            INT           NULL,
    [SECTOR]               VARCHAR (44)  NULL,
    [SERVICIO]             VARCHAR (44)  NULL,
    [OPERADOR_SOLUCION]    VARCHAR (44)  NULL,
    [OPERADOR_SOLUCION_ID] INT           NULL,
    [COMENTARIO_SOLUCION]  VARCHAR (454) NULL,
    [FECHA_ESTIMADA]       DATETIME      NULL,
    [FECHA_INICIO_TEST]    DATETIME      NULL,
    [FECHA_FIN_TEST]       DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([ID_TABLA] ASC)
);
GO


## 341: Solucion.sql
CREATE TABLE [dbo].[Solucion] (
    [SOLUCION_ID]        INT           NOT NULL,
    [SERVICIO]           VARCHAR (40)  NULL,
    [DESCRIPCION]        VARCHAR (255) NULL,
    [OPERADOR_ID]        INT           NULL,
    [id_agrupa_solucion] INT           NULL,
    [fuera_de_uso]       TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([SOLUCION_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SOL_KEY_DESCRIPCION]
    ON [dbo].[Solucion]([DESCRIPCION] ASC);
GO
CREATE NONCLUSTERED INDEX [SOL_KEY_SERVICIO]
    ON [dbo].[Solucion]([SERVICIO] ASC);
GO
CREATE NONCLUSTERED INDEX [SOL_KEY_OPERADOR_ID]
    ON [dbo].[Solucion]([OPERADOR_ID] ASC);
GO


## 342: S_para_sueldos.sql
### VACIA
CREATE TABLE [dbo].[S_para_sueldos] (
    [ID_PARAMETRO]       INT          NOT NULL,
    [CTA_PARA_ANTICIPOS] VARCHAR (20) NULL,
    [RECIBO_EN_LASER]    TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([ID_PARAMETRO] ASC)
);
GO
## 343: S_Periodos.sql
### VACIA
CREATE TABLE [dbo].[S_Periodos] (
    [PERIODO]   VARCHAR (10) NOT NULL,
    [LEGAJO]    INT          NOT NULL,
    [CONDICION] VARCHAR (1)  NULL,
    PRIMARY KEY CLUSTERED ([PERIODO] ASC, [LEGAJO] ASC)
);
GO


## 344: S_Preliq.sql
### VACIA
CREATE TABLE [dbo].[S_Preliq] (
    [ANO]               VARCHAR (4)     NULL,
    [MES]               VARCHAR (2)     NULL,
    [PERI]              TINYINT         NULL,
    [CODIGO]            INT             NULL,
    [LEGAJO]            VARCHAR (19)    NULL,
    [SECCION]           INT             NULL,
    [CODIGO_AUTO]       INT             NULL,
    [APELLIDO]          VARCHAR (50)    NULL,
    [DETALLE]           VARCHAR (2499)  NULL,
    [IMPORTER]          DECIMAL (13, 2) NULL,
    [IMPORTEE]          DECIMAL (11, 2) NULL,
    [IMPORTED]          DECIMAL (11, 2) NULL,
    [IMPORTET]          DECIMAL (11, 2) NULL,
    [IMPORTEA]          DECIMAL (11, 2) NULL,
    [IMPORTE_HS_EXTRAS] DECIMAL (11, 2) NULL,
    [IMPORTE_PROMEDIO]  DECIMAL (11, 2) NULL,
    [PESOS]             DECIMAL (11, 2) NULL,
    [BONOS]             DECIMAL (11, 2) NULL,
    UNIQUE NONCLUSTERED ([LEGAJO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [PRE_CODPRE]
    ON [dbo].[S_Preliq]([CODIGO] ASC);
GO
CREATE NONCLUSTERED INDEX [PRE_X_CODIGO_AUTO]
    ON [dbo].[S_Preliq]([CODIGO_AUTO] ASC);
GO


## 345: S_Promedia.sql
### VACIA - 1 solo registro vacío.
CREATE TABLE [dbo].[S_Promedia] (
    [ID_PROMEDIA] INT          NULL,
    [DESCRIPCION] VARCHAR (30) NULL,
    [MES1]        TINYINT      NULL,
    [MES2]        TINYINT      NULL,
    [MES3]        TINYINT      NULL,
    [MES4]        TINYINT      NULL,
    [MES5]        TINYINT      NULL,
    [MES6]        TINYINT      NULL,
    [MES7]        TINYINT      NULL,
    [MES8]        TINYINT      NULL,
    [MES9]        TINYINT      NULL,
    [MES10]       TINYINT      NULL,
    [MES11]       TINYINT      NULL,
    [MES12]       TINYINT      NULL,
    [ULTIMO_MES]  VARCHAR (2)  NULL,
    [ULTIMO_ANO]  VARCHAR (4)  NULL,
    UNIQUE NONCLUSTERED ([ID_PROMEDIA] ASC)
);
GO


## 346: sql1.sql
CREATE TABLE [dbo].[sql1] (
    [A1]  VARCHAR (19) NULL,
    [A2]  VARCHAR (19) NULL,
    [A3]  VARCHAR (19) NULL,
    [A4]  VARCHAR (19) NULL,
    [A5]  VARCHAR (19) NULL,
    [A6]  VARCHAR (19) NULL,
    [A7]  VARCHAR (19) NULL,
    [A8]  VARCHAR (19) NULL,
    [A9]  VARCHAR (19) NULL,
    [A10] VARCHAR (19) NULL,
    [A11] VARCHAR (19) NULL,
    [A12] VARCHAR (19) NULL,
    [A13] VARCHAR (19) NULL,
    [A14] VARCHAR (19) NULL,
    [A15] VARCHAR (19) NULL
);
GO


## 347: sql2.sql
CREATE TABLE [dbo].[sql2] (
    [A1]  VARCHAR (19) NULL,
    [A2]  VARCHAR (19) NULL,
    [A3]  VARCHAR (19) NULL,
    [A4]  VARCHAR (19) NULL,
    [A5]  VARCHAR (19) NULL,
    [A6]  VARCHAR (19) NULL,
    [A7]  VARCHAR (19) NULL,
    [A8]  VARCHAR (19) NULL,
    [A9]  VARCHAR (19) NULL,
    [A10] VARCHAR (19) NULL,
    [A11] VARCHAR (19) NULL,
    [A12] VARCHAR (19) NULL,
    [A13] VARCHAR (19) NULL,
    [A14] VARCHAR (19) NULL,
    [A15] VARCHAR (19) NULL
);
GO


## 348: sql.sql
CREATE TABLE [dbo].[sql] (
    [A1] VARCHAR (40) NULL,
    [A2] VARCHAR (40) NULL,
    [A3] VARCHAR (40) NULL,
    [A4] VARCHAR (40) NULL,
    [A5] VARCHAR (40) NULL,
    [A6] VARCHAR (40) NULL,
    [A7] VARCHAR (40) NULL,
    [A8] VARCHAR (40) NULL
);
GO


## 349: ss_access.sql
CREATE TABLE [dbo].[ss_access] (
    [USERNO]   INT     NOT NULL,
    [DOORNO]   INT     NOT NULL,
    [DENYFLAG] TINYINT NULL,
    PRIMARY KEY CLUSTERED ([USERNO] ASC, [DOORNO] ASC),
    UNIQUE NONCLUSTERED ([DOORNO] ASC, [USERNO] ASC)
);
GO


## 350: ss_call.sql
CREATE TABLE [dbo].[ss_call] (
    [DESCRIPTION]      VARCHAR (200) NULL,
    [NO]               INT           NOT NULL,
    [PROCNO]           INT           NULL,
    [REQUEST]          INT           NULL,
    [USERNO]           INT           NULL,
    [DATE]             INT           NULL,
    [TIME]             INT           NULL,
    [FILENO]           INT           NULL,
    [PRIMARYKEY]       INT           NULL,
    [ACCESSDENIED]     TINYINT       NULL,
    [REQUESTCANCELLED] TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SCALL__USERKEY]
    ON [dbo].[ss_call]([USERNO] ASC, [DATE] ASC, [TIME] ASC);
GO
CREATE NONCLUSTERED INDEX [SCALL__PROCREQKEY]
    ON [dbo].[ss_call]([PROCNO] ASC, [REQUEST] ASC, [DATE] ASC, [TIME] ASC);
GO
CREATE NONCLUSTERED INDEX [SCALL__FILEKEY]
    ON [dbo].[ss_call]([FILENO] ASC, [DATE] ASC, [TIME] ASC);
GO
CREATE NONCLUSTERED INDEX [SCALL__DATEKEY]
    ON [dbo].[ss_call]([DATE] ASC, [TIME] ASC);
GO
CREATE NONCLUSTERED INDEX [SCALL__PROCKEY]
    ON [dbo].[ss_call]([PROCNO] ASC, [DATE] ASC, [TIME] ASC);
GO


## 351: ss_DoorGroup.sql
CREATE TABLE [dbo].[ss_DoorGroup] (
    [NO]     INT          NOT NULL,
    [NAME]   VARCHAR (30) NULL,
    [FREEZE] TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([NAME] ASC)
);
GO


## 352: ss_DOOR.sql
CREATE TABLE [dbo].[ss_DOOR] (
    [NO]          INT          NOT NULL,
    [DGRPNO]      INT          NULL,
    [EQUATE]      VARCHAR (30) NULL,
    [DESCRIPTION] VARCHAR (60) NULL,
    [FREEZE]      TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([EQUATE] ASC),
    UNIQUE NONCLUSTERED ([DGRPNO] ASC, [DESCRIPTION] ASC)
);
GO


## 353: ss_Edit.sql
CREATE TABLE [dbo].[ss_Edit] (
    [NO]       INT          NOT NULL,
    [CALLNO]   INT          NULL,
    [FIELDNO]  INT          NULL,
    [OLDVALUE] VARCHAR (30) NULL,
    [NEWVALUE] VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SEDIT__CALLKEY]
    ON [dbo].[ss_Edit]([CALLNO] ASC);
GO
CREATE NONCLUSTERED INDEX [SEDIT__FIELDKEY]
    ON [dbo].[ss_Edit]([FIELDNO] ASC);
GO


## 354: ss_field.sql
CREATE TABLE [dbo].[ss_field] (
    [NO]     INT          NOT NULL,
    [FILENO] INT          NULL,
    [NAME]   VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SFIELD__FILEKEY]
    ON [dbo].[ss_field]([FILENO] ASC, [NAME] ASC);
GO


## 355: ss_File.sql
CREATE TABLE [dbo].[ss_File] (
    [NO]   INT          NOT NULL,
    [NAME] VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([NAME] ASC)
);
GO


## 356: ss_Procedimiento.sql
CREATE TABLE [dbo].[ss_Procedimiento] (
    [NO]              INT          NOT NULL,
    [PROGNO]          INT          NULL,
    [NAME]            VARCHAR (30) NULL,
    [GENERALDOORNO]   INT          NULL,
    [GENERALOVERRIDE] TINYINT      NULL,
    [INSERTDOORNO]    INT          NULL,
    [INSERTOVERRIDE]  TINYINT      NULL,
    [CHANGEDOORNO]    INT          NULL,
    [CHANGEOVERRIDE]  TINYINT      NULL,
    [DELETEDOORNO]    INT          NULL,
    [DELETEOVERRIDE]  TINYINT      NULL,
    [VIEWDOORNO]      INT          NULL,
    [VIEWOVERRIDE]    TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SPROC__PROGKEY]
    ON [dbo].[ss_Procedimiento]([PROGNO] ASC, [NAME] ASC);
GO


## 357: SS_Procedure.sql
CREATE TABLE [dbo].[SS_Procedure] (
    [NO]              INT       NOT NULL,
    [PROGNO]          INT       NULL,
    [NAME]            CHAR (30) NULL,
    [GENERALDOORNO]   INT       NULL,
    [GENERALOVERRIDE] TINYINT   NULL,
    [INSERTDOORNO]    INT       NULL,
    [INSERTOVERRIDE]  TINYINT   NULL,
    [CHANGEDOORNO]    INT       NULL,
    [CHANGEOVERRIDE]  TINYINT   NULL,
    [DELETEDOORNO]    INT       NULL,
    [DELETEOVERRIDE]  TINYINT   NULL,
    [VIEWDOORNO]      INT       NULL,
    [VIEWOVERRIDE]    TINYINT   NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SPROC__PROGKEY]
    ON [dbo].[SS_Procedure]([PROGNO] ASC, [NAME] ASC);
GO


## 358: ss_Program.sql
CREATE TABLE [dbo].[ss_Program] (
    [NO]   INT          NOT NULL,
    [NAME] VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([NAME] ASC)
);
GO


## 359: ss_PwdLog.sql
CREATE TABLE [dbo].[ss_PwdLog] (
    [NO]       INT          NOT NULL,
    [USERNO]   INT          NULL,
    [PASSWORD] VARCHAR (20) NULL,
    [DATE]     INT          NULL,
    [TIME]     INT          NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([USERNO] ASC, [DATE] ASC, [NO] ASC)
);
GO


## 360: S_Sueldos.sql
### VACIA
CREATE TABLE [dbo].[S_Sueldos] (
    [ANO]               VARCHAR (4)     NULL,
    [MES]               VARCHAR (2)     NULL,
    [PERI]              TINYINT         NULL,
    [CODIGO]            INT             NOT NULL,
    [LEGAJO]            VARCHAR (19)    NULL,
    [SECCION]           INT             NULL,
    [APELLIDO]          VARCHAR (50)    NULL,
    [DETALLE]           VARCHAR (2499)  NULL,
    [IMPORTER]          DECIMAL (11, 2) NULL,
    [IMPORTEE]          DECIMAL (11, 2) NULL,
    [IMPORTED]          DECIMAL (11, 2) NULL,
    [IMPORTET]          DECIMAL (11, 2) NULL,
    [IMPORTEA]          DECIMAL (11, 2) NULL,
    [IMPORTE_HS_EXTRAS] DECIMAL (11, 2) NULL,
    [IMPORTE_PROMEDIO]  DECIMAL (11, 2) NULL,
    [PERIODO]           VARCHAR (8)     NOT NULL,
    [FECHA]             INT             NULL,
    [MARCA]             TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([PERIODO] ASC, [CODIGO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SUE_SUELDOS_POR_LEGAJO]
    ON [dbo].[S_Sueldos]([LEGAJO] ASC);
GO
CREATE NONCLUSTERED INDEX [SUE_PORCODIGOAM]
    ON [dbo].[S_Sueldos]([CODIGO] ASC, [ANO] ASC, [MES] ASC);
GO
CREATE NONCLUSTERED INDEX [SUE_SUELDOS_POR_CODIGO]
    ON [dbo].[S_Sueldos]([CODIGO] ASC);
GO


## 361: ss_USERINGROUP.sql
CREATE TABLE [dbo].[ss_USERINGROUP] (
    [USERNO] INT NOT NULL,
    [UGRPNO] INT NOT NULL,
    PRIMARY KEY CLUSTERED ([USERNO] ASC, [UGRPNO] ASC),
    UNIQUE NONCLUSTERED ([UGRPNO] ASC, [USERNO] ASC)
);
GO


## 362: ss_user.sql
CREATE TABLE [dbo].[ss_user] (
    [NO]                  INT             NOT NULL,
    [GROUPFLAG]           TINYINT         NULL,
    [LASTNAME]            VARCHAR (25)    NULL,
    [FIRSTNAME]           VARCHAR (15)    NULL,
    [PASSWORD]            VARCHAR (20)    NULL,
    [LEVEL]               SMALLINT        NULL,
    [PASSWORDSIZE]        TINYINT         NULL,
    [PASSWORDMAXAGE]      SMALLINT        NULL,
    [PASSWORDDATE]        INT             NULL,
    [PASSWORDTIME]        INT             NULL,
    [LOGONDATE]           INT             NULL,
    [LOGONTIME]           INT             NULL,
    [FAILURES]            SMALLINT        NULL,
    [LOCKED]              TINYINT         NULL,
    [Maximo]              DECIMAL (18, 2) NULL,
    [Solicita]            INT             NULL,
    [Autoriza]            INT             NULL,
    [Codigo_autorizacion] INT             NULL,
    [email]               VARCHAR (50)    NULL,
    [baja]                INT             NULL,
    [area_id]             INT             NULL,
    PRIMARY KEY CLUSTERED ([NO] ASC),
    UNIQUE NONCLUSTERED ([LASTNAME] ASC, [FIRSTNAME] ASC),
    UNIQUE NONCLUSTERED ([GROUPFLAG] ASC, [LASTNAME] ASC, [FIRSTNAME] ASC)
);
GO
CREATE NONCLUSTERED INDEX [LastNameKey]
    ON [dbo].[ss_user]([LASTNAME] ASC);
GO
CREATE NONCLUSTERED INDEX [LastNam]
    ON [dbo].[ss_user]([NO] ASC);
GO


## 363: S_Tareas.sql
### VACIA
CREATE TABLE [dbo].[S_Tareas] (
    [CODIGO]          INT            NOT NULL,
    [TAREA]           VARCHAR (40)   NULL,
    [REMU]            DECIMAL (9, 2) NULL,
    [DESDEM]          INT            NULL,
    [HASTAM]          INT            NULL,
    [DESDET]          INT            NULL,
    [HASTAT]          INT            NULL,
    [CARGA]           DECIMAL (5)    NULL,
    [BASICO_CONVENIO] DECIMAL (9, 2) NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TAR_PORTAREA]
    ON [dbo].[S_Tareas]([TAREA] ASC);
GO


## 364: S_T_Liquida.sql
### VACIA
CREATE TABLE [dbo].[S_T_Liquida] (
    [ANO]                  VARCHAR (4)     NOT NULL,
    [MES]                  VARCHAR (2)     NOT NULL,
    [PERI]                 TINYINT         NOT NULL,
    [LEGAJO]               INT             NOT NULL,
    [CONCEPTO]             INT             NOT NULL,
    [QUEES]                VARCHAR (1)     NULL,
    [DESCRIPCION]          VARCHAR (50)    NULL,
    [CANTIDAD]             DECIMAL (5, 2)  NULL,
    [IMPORTE]              DECIMAL (11, 2) NULL,
    [POR_UNICA_VEZ]        TINYINT         NULL,
    [C_E]                  VARCHAR (1)     NULL,
    [CODIGO_CUOTA_A_PAGAR] INT             NULL,
    PRIMARY KEY CLUSTERED ([ANO] ASC, [MES] ASC, [PERI] ASC, [LEGAJO] ASC, [CONCEPTO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [T_LIQ_T_LIQUIDA_X_ANO_MES_LEGAJO]
    ON [dbo].[S_T_Liquida]([MES] ASC, [ANO] ASC, [PERI] ASC, [LEGAJO] ASC);
GO
CREATE NONCLUSTERED INDEX [T_LIQ_X_CONCEPTO]
    ON [dbo].[S_T_Liquida]([CONCEPTO] ASC);
GO
CREATE NONCLUSTERED INDEX [T_LIQ_X_LEGAJO]
    ON [dbo].[S_T_Liquida]([LEGAJO] ASC);
GO
CREATE NONCLUSTERED INDEX [T_LIQ_X_ANOYMES]
    ON [dbo].[S_T_Liquida]([ANO] ASC, [MES] ASC, [PERI] ASC);
GO


## 365: stock_cartuchos.sql
CREATE TABLE [dbo].[stock_cartuchos] (
    [ID_STOCK_CARTUCHO]   INT           NOT NULL,
    [CARTUCHO_ID]         INT           NULL,
    [NUMERO_MANUAL_UNICO] INT           NULL,
    [FECHA_INGRESO]       DATETIME      NULL,
    [FECHA_EGRESO]        DATETIME      NULL,
    [PRECIO_COMPRA]       FLOAT (53)    NULL,
    [GARANTIA]            VARCHAR (40)  NULL,
    [PROVEEDOR_ID]        INT           NULL,
    [OBSERVACION]         VARCHAR (200) NULL,
    [CANTIDAD_RECARGAS]   INT           NULL,
    PRIMARY KEY CLUSTERED ([ID_STOCK_CARTUCHO] ASC),
    UNIQUE NONCLUSTERED ([NUMERO_MANUAL_UNICO] ASC)
);
GO
CREATE NONCLUSTERED INDEX [STO2_KEY_PROVEEDOR_ID]
    ON [dbo].[stock_cartuchos]([PROVEEDOR_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [STO2_KEY_CANTIDAD_RECARGAS]
    ON [dbo].[stock_cartuchos]([CANTIDAD_RECARGAS] ASC);
GO
CREATE NONCLUSTERED INDEX [STO2_KEY_CARTUCHO_ID]
    ON [dbo].[stock_cartuchos]([CARTUCHO_ID] ASC);
GO


## 366: stock_historico.sql
CREATE TABLE [dbo].[stock_historico] (
    [ID]                  INT             NOT NULL,
    [STOCK_ID]            INT             NULL,
    [FECHA]               DATETIME        NULL,
    [CANTIDAD]            INT             NULL,
    [USUARIO_ID]          INT             NULL,
    [CLIENTE_SERVICIO_ID] INT             NULL,
    [IMPORTE]             DECIMAL (11, 2) NULL,
    [COMENTARIO]          VARCHAR (499)   NULL,
    [articulo_id]         INT             NULL,
    [proveedor_id]        INT             NULL,
    [cis]                 VARCHAR (15)    NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [STO1_X_STOCK_ID]
    ON [dbo].[stock_historico]([STOCK_ID] ASC);
GO


## 367: stock.sql
CREATE TABLE [dbo].[stock] (
    [ID]          INT          NOT NULL,
    [DESCRIPCION] VARCHAR (99) NULL,
    [MARCA]       VARCHAR (49) NULL,
    [MODELO]      VARCHAR (49) NULL,
    [STOCK]       INT          NULL,
    [stock_min]   INT          NULL,
    [material]    INT          NULL,
    [tipo]        INT          NULL,
    [internet]    TINYINT      NULL,
    [sip]         TINYINT      NULL,
    [sip2]        TINYINT      NULL,
    [puertos_lan] INT          NULL,
    [ftth]        TINYINT      NULL,
    [que_es]      VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);
GO


## 368: stock_virtual_para_borrar.sql
CREATE TABLE [dbo].[stock_virtual_para_borrar] (
    [STOCK_V_ID]  INT          NULL,
    [MODEM_ID]    INT          NULL,
    [CPE_ID]      INT          NULL,
    [TECNICO_ID]  INT          NULL,
    [FECHA]       DATETIME     NULL,
    [TELEFONO_ID] INT          NULL,
    [usado]       INT          NULL,
    [stock_id]    INT          NULL,
    [equipo_id]   INT          NULL,
    [marca]       VARCHAR (50) NULL,
    [modelo]      VARCHAR (50) NULL,
    [serie]       VARCHAR (50) NULL,
    [tipo]        INT          NULL,
    UNIQUE NONCLUSTERED ([STOCK_V_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [STO2_STOCK_V_X_CPE_ID]
    ON [dbo].[stock_virtual_para_borrar]([CPE_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [STO2_STOCK_V_X_TELEFONO_ID]
    ON [dbo].[stock_virtual_para_borrar]([TELEFONO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [STO2_STOCK_V_X_TECNICO_ID]
    ON [dbo].[stock_virtual_para_borrar]([TECNICO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [STO2_STOCK_V_X_MODEM_ID]
    ON [dbo].[stock_virtual_para_borrar]([MODEM_ID] ASC);
GO


## 369: stock_virtual.sql
CREATE TABLE [dbo].[stock_virtual] (
    [STOCK_V_ID]  INT          NOT NULL,
    [STOCK_ID]    INT          NULL,
    [USADO]       TINYINT      NULL,
    [MODEM_ID]    INT          NULL,
    [CPE_ID]      INT          NULL,
    [TECNICO_ID]  INT          NULL,
    [FECHA]       DATETIME     NULL,
    [TELEFONO_ID] INT          NULL,
    [EQUIPO_ID]   INT          NULL,
    [MARCA]       VARCHAR (49) NULL,
    [MODELO]      VARCHAR (49) NULL,
    [SERIE]       VARCHAR (49) NULL,
    [TIPO]        TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([STOCK_V_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [STO2_TECNICOS_ID]
    ON [dbo].[stock_virtual]([TECNICO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [STO2_MOD_ID]
    ON [dbo].[stock_virtual]([MODEM_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [STO2_TELEF_ID]
    ON [dbo].[stock_virtual]([TELEFONO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [STO2_X_STOCK_ID]
    ON [dbo].[stock_virtual]([STOCK_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [STO2_CPD_ID]
    ON [dbo].[stock_virtual]([CPE_ID] ASC);
GO


## 370: subtotales.sql
### 2 registros - IVA - NETO (Ambos internet)
CREATE TABLE [dbo].[subtotales] (
    [SUBTOTALES_ID] INT          NOT NULL,
    [DESCRIPCION]   VARCHAR (20) NULL,
    [SERVICIOS]     VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([SUBTOTALES_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC, [SERVICIOS] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SUB1_SUBTOTALES_X_SERVICIO]
    ON [dbo].[subtotales]([SERVICIOS] ASC);
GO


## 371: subzonas.sql
### VACIA
CREATE TABLE [dbo].[subzonas] (
    [ZONA]        INT          NULL,
    [SUBZONA]     VARCHAR (5)  NOT NULL,
    [DESCRIPCION] VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([SUBZONA] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);
GO
CREATE NONCLUSTERED INDEX [SUB_SUBZONA_X_ZONA]
    ON [dbo].[subzonas]([ZONA] ASC);
GO


## 372: tagsave.sql
### vacia
CREATE TABLE [dbo].[tagsave] (
    [TAGASAVE_ID] INT NOT NULL,
    [REGISTRO]    INT NULL,
    PRIMARY KEY CLUSTERED ([TAGASAVE_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TAG_X_REGISTRO]
    ON [dbo].[tagsave]([REGISTRO] ASC);
GO






## 375: tecnicos.sql
### listado de técnicos y una cosa rara para cuadrillas
CREATE TABLE [dbo].[tecnicos] (
    [TECNICO_ID] INT          NOT NULL,
    [NOMBRE]     VARCHAR (29) NULL,
    [nombre2]    VARCHAR (80) NULL,
    [grupal]     TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([TECNICO_ID] ASC)
);
GO


## 376: telefonos_aparatos.sql
### listado de "aparatos" equipos telefónicos - en desuso
CREATE TABLE [dbo].[telefonos_aparatos] (
    [TELEFONO_ID]         INT          NOT NULL,
    [MARCA_ID]            INT          NULL,
    [MODELO_ID]           INT          NULL,
    [SERIE]               VARCHAR (50) NULL,
    [UTILIZADO]           TINYINT      NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [BAJA]                TINYINT      NULL,
    [stock_id]            INT          NULL,
    [fecha_compra]        DATETIME     NULL,
    [proveedor_id]        INT          NULL,
    [estado_id]           INT          NULL,
    [marca]               VARCHAR (50) NULL,
    [modelo]              VARCHAR (50) NULL,
    [otro]                INT          NULL,
    [tipo]                INT          NULL,
    [cis]                 VARCHAR (15) NULL,
    CONSTRAINT [PK__telefonos_aparat__25077354] PRIMARY KEY CLUSTERED ([TELEFONO_ID] ASC),
    CONSTRAINT [UQ__telefonos_aparat__25FB978D] UNIQUE NONCLUSTERED ([SERIE] ASC),
    CONSTRAINT [UQ__telefonos_aparat__26EFBBC6] UNIQUE NONCLUSTERED ([SERIE] ASC, [TELEFONO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TELEF_TELEFONO_X_MODELO_ID]
    ON [dbo].[telefonos_aparatos]([MODELO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [TELEF_TELEFONO_X_MARCA_ID]
    ON [dbo].[telefonos_aparatos]([MARCA_ID] ASC);
GO


## 377: Tipo_de_debito_automatico.sql
### 2 registros, no creo que se use para nada
CREATE TABLE [dbo].[Tipo_de_debito_automatico] (
    [TIPO_DE_DEBITO_AUTOMATICO_ID] INT          NOT NULL,
    [TIPO_DE_DEBITO]               VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([TIPO_DE_DEBITO_AUTOMATICO_ID] ASC),
    UNIQUE NONCLUSTERED ([TIPO_DE_DEBITO] ASC)
);
GO


## 378: Tipo_de_puertos.sql
### TCP - UDP
CREATE TABLE [dbo].[Tipo_de_puertos] (
    [TIPO_PUERTO_ID] INT          NOT NULL,
    [NOMBRE]         VARCHAR (40) NULL,
    PRIMARY KEY CLUSTERED ([TIPO_PUERTO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TIP1_KEY_TIPO_ID_Y_NOMBRE]
    ON [dbo].[Tipo_de_puertos]([TIPO_PUERTO_ID] ASC, [NOMBRE] ASC);
GO
CREATE NONCLUSTERED INDEX [TIP1_KEY_NOMBRE_PUERTO]
    ON [dbo].[Tipo_de_puertos]([NOMBRE] ASC);
GO


## 379: tipo_mod.sql
### tipo de modificacion - raro 4 valores PLAN DE PAGO - NO INTIMA - CAMBIO DE ESTADO - FECHA DE INCLUSION
CREATE TABLE [dbo].[tipo_mod] (
    [TIPO_MODIFICACION_ID] INT           NOT NULL,
    [MODIFICACION]         VARCHAR (199) NULL,
    PRIMARY KEY CLUSTERED ([TIPO_MODIFICACION_ID] ASC)
);
GO


## 380: tipo_movi_impresora.sql
### vacia
CREATE TABLE [dbo].[tipo_movi_impresora] (
    [ID_TIPO_MOVI_IMPRE] INT           NOT NULL,
    [TIPO_MOVI_IMPRE]    VARCHAR (100) NULL,
    PRIMARY KEY CLUSTERED ([ID_TIPO_MOVI_IMPRE] ASC)
);
GO


## 381: Tipo_reclamo_items.sql
### Tipos por internet. FTTH - WIFI - ADSL
CREATE TABLE [dbo].[Tipo_reclamo_items] (
    [TIPO_RECLAMO_ID] INT           NOT NULL,
    [DESCRIPCION]     VARCHAR (254) NULL,
    [SERVICIO]        VARCHAR (9)   NULL,
    [item_inicio]     INT           NULL,
    PRIMARY KEY CLUSTERED ([TIPO_RECLAMO_ID] ASC)
);
GO


## 382: Tipo_Reclamo.sql
### Tipo de reclamo por servicio
CREATE TABLE [dbo].[Tipo_Reclamo] (
    [TIPO_RECLAMO_ID]        INT           NOT NULL,
    [SERVICIO]               VARCHAR (40)  NULL,
    [DESCRIPCION]            VARCHAR (255) NULL,
    [OBSERVACIONES]          VARCHAR (255) NULL,
    [DERIVAR_A]              INT           NULL,
    [VENCE]                  INT           NULL,
    [id_agrupa_tipo_reclamo] INT           NULL,
    [fuera_de_uso]           TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([TIPO_RECLAMO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TIP_KEY_DERIVAR_A]
    ON [dbo].[Tipo_Reclamo]([DERIVAR_A] ASC);
GO
CREATE NONCLUSTERED INDEX [TIP_KEY_SERVICIO]
    ON [dbo].[Tipo_Reclamo]([SERVICIO] ASC);
GO


## 383: Tipo_Respuesta.sql
### respuestas para alguna encuesta. CONFORME - NO CONFORME - NO SABE NO CONSTESTA
CREATE TABLE [dbo].[Tipo_Respuesta] (
    [TIPO_RESPUESTA_ID] INT           NOT NULL,
    [DESCRIPCION]       VARCHAR (255) NULL,
    PRIMARY KEY CLUSTERED ([TIPO_RESPUESTA_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TIP2_X_ID]
    ON [dbo].[Tipo_Respuesta]([TIPO_RESPUESTA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [TIP2_KEY_SERVICIO_DESCRIPCION_DERIVAR_A]
    ON [dbo].[Tipo_Respuesta]([DESCRIPCION] ASC);
GO
CREATE NONCLUSTERED INDEX [TIP2_KEY_SERVICIO_AGRUPA_TIPO]
    ON [dbo].[Tipo_Respuesta]([DESCRIPCION] ASC);
GO

## 385: toma_estados.sql
### VACIA
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


## 386: Tramites.sql
### VACIA
CREATE TABLE [dbo].[Tramites] (
    [Id]                               INT             NOT NULL,
    [Id_usuario]                       INT             NULL,
    [Numero_tramite]                   VARCHAR (29)    NULL,
    [Apellido_nombre_propietario]      VARCHAR (49)    NULL,
    [Condicion_impositiva_propietario] VARCHAR (24)    NULL,
    [Calle]                            VARCHAR (49)    NULL,
    [Numero]                           VARCHAR (14)    NULL,
    [Barrio]                           VARCHAR (29)    NULL,
    [Piso]                             VARCHAR (1)     NULL,
    [Dto]                              VARCHAR (3)     NULL,
    [Torre]                            VARCHAR (4)     NULL,
    [Casa]                             VARCHAR (4)     NULL,
    [Manzana]                          VARCHAR (4)     NULL,
    [Email_notificaciones]             VARCHAR (59)    NULL,
    [Tel_cel_propietario]              VARCHAR (29)    NULL,
    [Tipo_documento_propietario]       VARCHAR (14)    NULL,
    [Numero_documento_propietario]     VARCHAR (14)    NULL,
    [Localidad]                        VARCHAR (49)    NULL,
    [Localidad_propietario]            VARCHAR (49)    NULL,
    [provincia_propietario]            VARCHAR (29)    NULL,
    [Domicilio_propietario]            VARCHAR (99)    NULL,
    [Provincia]                        VARCHAR (29)    NULL,
    [Tipo_tramite]                     VARCHAR (49)    NULL,
    [Matriculado_id]                   INT             NULL,
    [Estado]                           INT             NULL,
    [Estado_descripcion]               VARCHAR (99)    NULL,
    [Entre_calle_1]                    VARCHAR (49)    NULL,
    [Entre_calle_2]                    VARCHAR (49)    NULL,
    [Distancia_esquina_izq]            DECIMAL (15, 2) NULL,
    [Distancia_esquina_der]            DECIMAL (15, 2) NULL,
    [Factibilidad]                     VARCHAR (14)    NULL,
    [Numero_partida_inmobiliaria]      VARCHAR (29)    NULL,
    [Cant_instalaciones]               INT             NULL,
    [Tomas_instalaciones]              INT             NULL,
    [Uso_instalaciones]                VARCHAR (14)    NULL,
    [Cantidad_usuarios_predio]         INT             NULL,
    [Cantidad_de_artefactos_insitu]    INT             NULL,
    [Proyectado_calle]                 VARCHAR (49)    NULL,
    [Proyectado_numero]                VARCHAR (5)     NULL,
    [Fecha_ingreso_solicitud]          DATETIME        NULL,
    [Estado_finca]                     VARCHAR (19)    NULL,
    [Total_consumo]                    DECIMAL (13, 2) NULL,
    [Tipo_canerias]                    VARCHAR (24)    NULL,
    [Fecha_ultimo_movimiento]          DATETIME        NULL,
    [Tipo_doc_afip]                    VARCHAR (6)     NULL,
    [Nro_doc_afip]                     VARCHAR (11)    NULL,
    PRIMARY KEY CLUSTERED ([Id] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TRA_INDICE_USUARIO]
    ON [dbo].[Tramites]([Id_usuario] ASC);
GO


## 387: trs2.sql
### Estadística por localidad por período - puede ser alguna presentación para Enacom
CREATE TABLE [dbo].[trs2] (
    [TRS2_ID]       INT          NOT NULL,
    [PERIODO]       VARCHAR (39) NULL,
    [PROVINCIA]     VARCHAR (39) NULL,
    [PARTIDO_DEPTO] VARCHAR (39) NULL,
    [LOCALIDAD]     VARCHAR (39) NULL,
    [AREA_LOCAL]    VARCHAR (39) NULL,
    [HOGARES]       INT          NULL,
    [COMERCIAL]     INT          NULL,
    [GOBIERNO]      INT          NULL,
    [OTROS]         INT          NULL,
    [ANIO]          INT          NULL,
    PRIMARY KEY CLUSTERED ([TRS2_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TRS_X_PERIODO]
    ON [dbo].[trs2]([PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [TRS_X_ANIO]
    ON [dbo].[trs2]([ANIO] ASC);
GO


## 388: trs3.sql
### Estadística por localidad por período - puede ser alguna presentación para Enacom
CREATE TABLE [dbo].[trs3] (
    [TRS3_ID]       INT             NOT NULL,
    [PERIODO]       VARCHAR (39)    NULL,
    [PROVINCIA]     VARCHAR (39)    NULL,
    [PARTIDO_DEPTO] VARCHAR (39)    NULL,
    [LOCALIDAD]     VARCHAR (39)    NULL,
    [AREA_LOCAL]    VARCHAR (39)    NULL,
    [HOGARES]       DECIMAL (13, 2) NULL,
    [COMERCIAL]     DECIMAL (13, 2) NULL,
    [GOBIERNO]      DECIMAL (13, 2) NULL,
    [OTROS]         DECIMAL (13, 2) NULL,
    [ANIO]          INT             NULL,
    PRIMARY KEY CLUSTERED ([TRS3_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [TRS1_X_PERIODO]
    ON [dbo].[trs3]([PERIODO] ASC);
GO
CREATE NONCLUSTERED INDEX [TRS1_X_ANIO]
    ON [dbo].[trs3]([ANIO] ASC);
GO


## 389: ubicaciones.sql
### vacia
CREATE TABLE [dbo].[ubicaciones] (
    [UBICACIONES_ID] INT          NOT NULL,
    [CODIGO_CALLE]   INT          NULL,
    [CROQUIS]        VARCHAR (10) NULL,
    [DESDE]          INT          NULL,
    [HASTA]          INT          NULL,
    [MANZANA_ID]     INT          NULL,
    [PARES_IMPARES]  VARCHAR (1)  NULL,
    [ZONA]           TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([UBICACIONES_ID] ASC),
    UNIQUE NONCLUSTERED ([CROQUIS] ASC),
    UNIQUE NONCLUSTERED ([MANZANA_ID] ASC, [CROQUIS] ASC)
);
GO
CREATE NONCLUSTERED INDEX [UBI_UBICACIONES_X_CODIGO_CALLE_Y_DESDE]
    ON [dbo].[ubicaciones]([CODIGO_CALLE] ASC, [DESDE] ASC);
GO
CREATE NONCLUSTERED INDEX [UBI_UBICACIONES_X_MANZANA_ID]
    ON [dbo].[ubicaciones]([MANZANA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [UBI_UBICACIONES_X_CODIGO_DE_CALLE]
    ON [dbo].[ubicaciones]([CODIGO_CALLE] ASC);
GO
CREATE NONCLUSTERED INDEX [UBI_UBICACIONES_X_ZONA]
    ON [dbo].[ubicaciones]([ZONA] ASC);
GO


## 390: Usuarios_localidades_habilitadas.sql
### VACIA
CREATE TABLE [dbo].[Usuarios_localidades_habilitadas] (
    [USUARIOS_LOCALIDADES_HABILITADAS_ID] INT NOT NULL,
    [USUARIO_ID]                          INT NULL,
    [LOCALIDAD_ID]                        INT NULL,
    PRIMARY KEY CLUSTERED ([USUARIOS_LOCALIDADES_HABILITADAS_ID] ASC),
    UNIQUE NONCLUSTERED ([LOCALIDAD_ID] ASC, [USUARIO_ID] ASC),
    UNIQUE NONCLUSTERED ([USUARIO_ID] ASC, [LOCALIDAD_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [USU_X_LOCALIDAD_SOLA]
    ON [dbo].[Usuarios_localidades_habilitadas]([LOCALIDAD_ID] ASC);
GO


## 391: usuarios_por_area.sql
### para permisos de módulos de sistema
CREATE TABLE [dbo].[usuarios_por_area] (
    [USUARIOS_POR_AREA_ID] INT NOT NULL,
    [USUARIO_ID]           INT NULL,
    [AREA_ID]              INT NULL,
    [PERMISO_VER_AREAS]    INT NULL,
    [ELIMINADO]            INT NULL,
    PRIMARY KEY CLUSTERED ([USUARIOS_POR_AREA_ID] ASC),
    UNIQUE NONCLUSTERED ([USUARIO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [USU_KEY_USUARIO_AREA]
    ON [dbo].[usuarios_por_area]([USUARIO_ID] ASC, [AREA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [USU_KEY_USUARIO_AREA_PENDIENTE]
    ON [dbo].[usuarios_por_area]([USUARIO_ID] ASC, [AREA_ID] ASC, [PERMISO_VER_AREAS] ASC);
GO
CREATE NONCLUSTERED INDEX [USU_KEY_PERMISO_VER_AREA]
    ON [dbo].[usuarios_por_area]([PERMISO_VER_AREAS] ASC);
GO
CREATE NONCLUSTERED INDEX [USU_KEY_AREA_ID]
    ON [dbo].[usuarios_por_area]([AREA_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [USU_KEY_USUARIO_PERMISO]
    ON [dbo].[usuarios_por_area]([USUARIO_ID] ASC, [PERMISO_VER_AREAS] ASC);
GO


## 392: vencimiento_servicio.sql
### tiene datos de 2009 a 2019 
CREATE TABLE [dbo].[vencimiento_servicio] (
    [VENCIMIENTO_SERVICIO_ID] INT      NOT NULL,
    [CLIENTE_SERVICIO_ID]     INT      NULL,
    [ATRIBUTO]                TINYINT  NULL,
    [FECHA_VENCIMIENTO]       DATETIME NULL,
    [ESTADO]                  TINYINT  NULL,
    [numero_telefono]         INT      NULL,
    PRIMARY KEY CLUSTERED ([VENCIMIENTO_SERVICIO_ID] ASC)
);
GO
CREATE NONCLUSTERED INDEX [VEN1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[vencimiento_servicio]([CLIENTE_SERVICIO_ID] ASC);
GO
CREATE NONCLUSTERED INDEX [VEN1_X_FECHA_VENCIMIENTO]
    ON [dbo].[vencimiento_servicio]([FECHA_VENCIMIENTO] ASC);
GO


## 393: vendedores.sql
### listado de vendedores asignados
CREATE TABLE [dbo].[vendedores] (
    [VENDEDOR_ID]       INT          NOT NULL,
    [APELLIDO_Y_NOMBRE] VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([VENDEDOR_ID] ASC),
    UNIQUE NONCLUSTERED ([APELLIDO_Y_NOMBRE] ASC)
);
GO


## 394: versiones_app.sql
### Versiones de las aplicaciones - ejecutables para no usar versiones viejas
CREATE TABLE [dbo].[versiones_app] (
    [VERSION_ID] INT          NOT NULL,
    [MODULO]     VARCHAR (49) NULL,
    [VERSION]    INT          NULL,
    PRIMARY KEY CLUSTERED ([VERSION_ID] ASC)
);
GO


## 395: zonas.sql
CREATE TABLE [dbo].[zonas] (
    [ZONA]        INT          NOT NULL,
    [DESCRIPCION] VARCHAR (30) NULL,
    PRIMARY KEY CLUSTERED ([ZONA] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);
GO


