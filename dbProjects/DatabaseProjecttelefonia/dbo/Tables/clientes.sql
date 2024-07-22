CREATE TABLE [dbo].[clientes] (
    [CLIENTE_ID]                    INT           NOT NULL,
    [NUMERADOR_HIJOS]               INT           NULL,
    [CODIGO_CALLE]                  INT           NULL,
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
    [TE_TITULAR]                    VARCHAR (15)  NULL,
    [CLASIFICACION_IVA_ID]          INT           NULL,
    [PIB]                           VARCHAR (2)   NULL,
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

