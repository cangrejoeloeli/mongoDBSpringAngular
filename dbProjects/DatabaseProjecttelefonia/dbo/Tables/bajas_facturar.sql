CREATE TABLE [dbo].[bajas_facturar] (
    [Id]            INT             IDENTITY (1, 1) NOT NULL,
    [IdTransaccion] INT             NOT NULL,
    [Renglon]       INT             NOT NULL,
    [FechaAlta]     DATETIME        NULL,
    [IdServicio]    SMALLINT        NULL,
    [IdEvento]      SMALLINT        NULL,
    [CIS]           VARCHAR (100)   NULL,
    [Marca]         VARCHAR (100)   NULL,
    [Modelo]        VARCHAR (100)   NULL,
    [Serie]         VARCHAR (100)   NULL,
    [Cantidad]      SMALLINT        NULL,
    [BajaCorte]     VARCHAR (10)    NULL,
    [IdStatus]      TINYINT         NULL,
    [FACTURA_ID]    INT             NULL,
    [Error]         TINYINT         NULL,
    [ErrorMensaje]  TEXT            NULL,
    [Descripcion]   VARCHAR (150)   NULL,
    [Importe]       DECIMAL (15, 2) NULL,
    [Modo]          TINYINT         NULL,
    [Legales]       TINYINT         NULL,
    PRIMARY KEY CLUSTERED ([Id] ASC)
);


GO

