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

