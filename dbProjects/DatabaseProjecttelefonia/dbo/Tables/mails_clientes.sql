CREATE TABLE [dbo].[mails_clientes] (
    [MAIL_ID]              INT           NOT NULL,
    [EMAIL]                VARCHAR (89)  NULL,
    [HASH]                 VARCHAR (899) NULL,
    [FECHA_INGRESO]        DATETIME      NULL,
    [FECHA_VALIDACION]     DATETIME      NULL,
    [SECUNDARIO]           TINYINT       NULL,
    [VALIDADO]             TINYINT       NULL,
    [MAIL_SECUNDARIO]      VARCHAR (89)  NULL,
    [HASH_SECUNDARIO]      VARCHAR (899) NULL,
    [VALIDACION_SEC]       TINYINT       NULL,
    [FECHA_VALIDACION_SEC] DATETIME      NULL,
    [cliente_id]           INT           NULL,
    [baja]                 TINYINT       NULL,
    [marca_reenvio]        TINYINT       NULL,
    [cant_reenvios]        INT           NULL,
    [gas]                  TINYINT       NULL,
    [fecha_reenvio]        DATETIME      NULL,
    [cis]                  VARCHAR (50)  NULL,
    [telefono]             VARCHAR (50)  NULL,
    [fecha_validacion_web] DATETIME      NULL,
    [fecha_v_web_sec]      DATETIME      NULL,
    [comentario]           VARCHAR (100) NULL,
    CONSTRAINT [PK_mails_clientes] PRIMARY KEY CLUSTERED ([MAIL_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [x_cliente_id]
    ON [dbo].[mails_clientes]([cliente_id] ASC);


GO

