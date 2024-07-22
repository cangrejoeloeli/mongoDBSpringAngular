CREATE TABLE [dbo].[nodos_fibra] (
    [NODO_ID]      INT           NOT NULL,
    [IP_ID]        INT           NULL,
    [NUMERO]       INT           NULL,
    [DESCRIPCION]  VARCHAR (149) NULL,
    [CODIGO_CALLE] INT           NULL,
    [RANGO_INICIO] INT           NULL,
    [RANGO_FIN]    INT           NULL,
    [rack_fibra]   INT           NULL,
    PRIMARY KEY CLUSTERED ([NODO_ID] ASC)
);


GO

