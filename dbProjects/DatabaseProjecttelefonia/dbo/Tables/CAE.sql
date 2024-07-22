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

