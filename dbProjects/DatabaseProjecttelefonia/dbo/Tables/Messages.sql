CREATE TABLE [dbo].[Messages] (
    [ID]           INT        NOT NULL,
    [Ranking]      INT        NULL,
    [DontAskAgain] TINYINT    NULL,
    [Mensaje]      CHAR (200) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([Mensaje] ASC, [ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [xRanking]
    ON [dbo].[Messages]([Ranking] ASC, [ID] ASC);


GO

