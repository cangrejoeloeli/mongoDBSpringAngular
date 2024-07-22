CREATE TABLE [dbo].[cobrado] (
    [ID]             INT            NOT NULL,
    [IMPORTE]        DECIMAL (7, 2) NULL,
    [FECHA]          DATETIME       NULL,
    [RECIBO_ID]      INT            NULL,
    [NUMERO_FACTURA] VARCHAR (49)   NULL,
    [SERVICIO]       VARCHAR (19)   NULL,
    [SIN_CARGO]      TINYINT        NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [FAC1_X_RECIBO]
    ON [dbo].[cobrado]([RECIBO_ID] ASC);


GO

