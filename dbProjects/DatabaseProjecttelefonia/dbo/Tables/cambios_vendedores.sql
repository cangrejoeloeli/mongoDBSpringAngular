CREATE TABLE [dbo].[cambios_vendedores] (
    [ID]                   INT          NOT NULL,
    [VENDEDOR_ANTERIOR_ID] INT          NULL,
    [VENDEDOR_NUEVO]       INT          NULL,
    [OPERADOR]             VARCHAR (54) NULL,
    [MOTIVO]               VARCHAR (90) NULL,
    [FECHA]                DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

