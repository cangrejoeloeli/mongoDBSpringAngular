CREATE TABLE [dbo].[control_items] (
    [CONTROL_DE_ITEMS_ID] INT          NOT NULL,
    [ITEM_ID]             INT          NULL,
    [ITEM2_ID]            INT          NULL,
    [TIPO]                TINYINT      NULL,
    [CONTROL]             VARCHAR (49) NULL,
    PRIMARY KEY CLUSTERED ([CONTROL_DE_ITEMS_ID] ASC),
    UNIQUE NONCLUSTERED ([ITEM_ID] ASC, [ITEM2_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CON4_X_ITEM2]
    ON [dbo].[control_items]([ITEM2_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CON4_X_ITEM]
    ON [dbo].[control_items]([ITEM_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CON4_X_TIPO]
    ON [dbo].[control_items]([TIPO] ASC);


GO

CREATE NONCLUSTERED INDEX [CON4_X_CONTROL_Y_ITEM]
    ON [dbo].[control_items]([CONTROL] ASC, [ITEM_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CON4_X_CONTROL]
    ON [dbo].[control_items]([CONTROL] ASC);


GO

CREATE NONCLUSTERED INDEX [CON4_X_CONTROL_ITEM2]
    ON [dbo].[control_items]([CONTROL] ASC, [ITEM2_ID] ASC);


GO

