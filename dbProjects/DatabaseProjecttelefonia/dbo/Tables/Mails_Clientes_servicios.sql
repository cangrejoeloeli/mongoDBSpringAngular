CREATE TABLE [dbo].[Mails_Clientes_servicios] (
    [ID_TABAL]            INT     NOT NULL,
    [EMAIL_ID]            INT     NULL,
    [CLIENTE_SERVICIO_ID] INT     NULL,
    [MAIL_SECUNDARIO]     TINYINT NULL,
    [cliente_id]          INT     NULL,
    [gas]                 TINYINT NULL,
    PRIMARY KEY CLUSTERED ([ID_TABAL] ASC)
);


GO

