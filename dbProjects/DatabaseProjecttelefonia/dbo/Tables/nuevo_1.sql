CREATE TABLE [dbo].[nuevo_1] (
    [CLIENTE_ID] INT     NULL,
    [HIJO]       TINYINT NULL
);


GO

CREATE NONCLUSTERED INDEX [NUE_X_ID]
    ON [dbo].[nuevo_1]([CLIENTE_ID] ASC);


GO

