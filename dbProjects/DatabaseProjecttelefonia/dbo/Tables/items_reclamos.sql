CREATE TABLE [dbo].[items_reclamos] (
    [ITEMS_ID]     INT             NOT NULL,
    [NOMBRE_ITEMS] VARCHAR (59)    NULL,
    [SERVICIO]     VARCHAR (9)     NULL,
    [TIPO_RECLAMO] VARCHAR (99)    NULL,
    [PARAMETRO]    TINYINT         NULL,
    [DERIBA_A]     INT             NULL,
    [DERIBA_B]     INT             NULL,
    [ITEM_FINAL]   TINYINT         NULL,
    [VALOR]        DECIMAL (13, 2) NULL,
    [COMENTARIO]   VARCHAR (79)    NULL,
    PRIMARY KEY CLUSTERED ([ITEMS_ID] ASC)
);


GO

