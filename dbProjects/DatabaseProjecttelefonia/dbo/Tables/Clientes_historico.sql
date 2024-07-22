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

