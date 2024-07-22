CREATE TABLE [dbo].[numeracion_empresa] (
    [NUMERACION_EMPRESA_ID] INT          NOT NULL,
    [NUMERO]                INT          NULL,
    [DESCRIPCION]           VARCHAR (49) NULL,
    PRIMARY KEY CLUSTERED ([NUMERACION_EMPRESA_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [NUM3_X_NUMERO]
    ON [dbo].[numeracion_empresa]([NUMERO] ASC);


GO

