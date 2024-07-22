CREATE TABLE [dbo].[coordenadas_cajas] (
    [caja_id] INT             NOT NULL,
    [x]       DECIMAL (18, 7) NULL,
    [y]       DECIMAL (18, 7) NULL,
    CONSTRAINT [PK_coordenadas_cajas] PRIMARY KEY CLUSTERED ([caja_id] ASC)
);


GO

