CREATE TABLE [dbo].[item_a_modificar_en_habilitacion] (
    [ID]      INT     NOT NULL,
    [ITEM_ID] INT     NULL,
    [CARGAR]  TINYINT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [ITE4_X_ITEM]
    ON [dbo].[item_a_modificar_en_habilitacion]([ITEM_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [ITE4_X_CARGAR]
    ON [dbo].[item_a_modificar_en_habilitacion]([CARGAR] ASC);


GO

