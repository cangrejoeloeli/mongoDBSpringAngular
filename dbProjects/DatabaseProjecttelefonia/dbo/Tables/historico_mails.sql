CREATE TABLE [dbo].[historico_mails] (
    [ID_HISTO_MAIL]       INT           NOT NULL,
    [MAILS_ID]            INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [MAIL]                VARCHAR (100) NULL,
    [CUOTA]               INT           NULL,
    [FECHA_S]             DATETIME      NULL,
    [OBSERVACION]         VARCHAR (998) NULL,
    [OPERADOR_ID]         INT           NULL,
    [ITEM_HOSTING_ID]     INT           NULL,
    [ESTADO]              TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTO_MAIL] ASC)
);


GO

CREATE NONCLUSTERED INDEX [MAI1_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[historico_mails]([CLIENTE_SERVICIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [MAI1_X_MAIL_Y_ITEM_HOSTING_ID]
    ON [dbo].[historico_mails]([MAIL] ASC, [ITEM_HOSTING_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [MAI1_X_MAIL_Y_CLIENTE_SERVICIO_ID]
    ON [dbo].[historico_mails]([MAILS_ID] ASC, [ID_HISTO_MAIL] ASC, [OPERADOR_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [MAI1_X_ITEM_HOSTING_ID]
    ON [dbo].[historico_mails]([ITEM_HOSTING_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [MAI1_X_MAILS_ID]
    ON [dbo].[historico_mails]([MAILS_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [MAI1_X_MAIL]
    ON [dbo].[historico_mails]([MAIL] ASC);


GO

CREATE NONCLUSTERED INDEX [MAI1_KEY_OPERADOR_ID]
    ON [dbo].[historico_mails]([OPERADOR_ID] ASC);


GO

