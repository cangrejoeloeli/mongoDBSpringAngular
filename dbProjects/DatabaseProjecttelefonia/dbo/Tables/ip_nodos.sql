CREATE TABLE [dbo].[ip_nodos] (
    [IP_ID]        INT          NOT NULL,
    [NUM_IP]       VARCHAR (19) NULL,
    [RANGO_INICIO] INT          NULL,
    [RANGO_FIN]    INT          NULL,
    [CLIENTE_ID]   INT          NULL,
    [RANGO]        INT          NULL,
    [IP_UTILIZADA] TINYINT      NULL,
    [NODO_ID]      INT          NULL,
    [P1]           INT          NULL,
    [P2]           INT          NULL,
    [P3]           VARCHAR (19) NULL,
    [P4]           VARCHAR (19) NULL,
    [motivo]       VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([IP_ID] ASC)
);


GO

