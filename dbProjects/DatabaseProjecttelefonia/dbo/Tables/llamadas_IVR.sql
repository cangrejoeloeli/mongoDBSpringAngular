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

