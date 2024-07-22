CREATE TABLE [dbo].[LAMA_txt_almacenado] (
    [LAMA_ID]    INT           NOT NULL,
    [LINE]       VARCHAR (254) NULL,
    [PERIODO_ID] INT           NULL,
    PRIMARY KEY CLUSTERED ([LAMA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LAM23_X_PERIODO_ID]
    ON [dbo].[LAMA_txt_almacenado]([PERIODO_ID] ASC);


GO

