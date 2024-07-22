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

