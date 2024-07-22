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

