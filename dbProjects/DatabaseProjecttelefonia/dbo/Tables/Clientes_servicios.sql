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

