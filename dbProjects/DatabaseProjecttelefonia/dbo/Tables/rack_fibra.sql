CREATE TABLE [dbo].[rack_fibra] (
    [RACK_ID]     INT          NOT NULL,
    [NODO_ID]     INT          NULL,
    [DESCRIPCION] VARCHAR (89) NULL,
    [POSICIONES]  TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([RACK_ID] ASC)
);


GO

