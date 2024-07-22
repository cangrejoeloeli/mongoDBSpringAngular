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

