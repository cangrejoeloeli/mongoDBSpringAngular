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

