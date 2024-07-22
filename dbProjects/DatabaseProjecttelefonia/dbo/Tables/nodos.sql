CREATE TABLE [dbo].[nodos] (
    [NODO_ID]       INT          NOT NULL,
    [NUMERO]        INT          NULL,
    [DESCRIPCION]   VARCHAR (30) NULL,
    [CODIGO_CALLE]  INT          NULL,
    [ip_id]         INT          NULL,
    [rango_inicio]  INT          NULL,
    [rango_fin]     INT          NULL,
    [no_utiliza_ip] TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([NODO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [NOD_NODO_X_CODIGO_CALLE]
    ON [dbo].[nodos]([CODIGO_CALLE] ASC);


GO

