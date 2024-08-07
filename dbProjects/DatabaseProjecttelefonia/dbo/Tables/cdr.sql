CREATE TABLE [dbo].[cdr] (
    [CDR_ID]              INT            NOT NULL,
    [CONTINUACION]        CHAR (2)       NULL,
    [FECHA]               DATETIME       NULL,
    [HORA]                VARCHAR (5)    NULL,
    [MONTO_DEBITADO]      DECIMAL (7, 2) NULL,
    [NUMERO_DESTINO]      INT            NULL,
    [TRONCAL_DESTINO]     CHAR (51)      NULL,
    [TIPO_DE_DESTINO]     TINYINT        NULL,
    [NUMERO_SRC]          INT            NULL,
    [NUMERO_DE_SECUENCIA] TINYINT        NULL,
    [TIPO_DE_SERVICIO]    TINYINT        NULL,
    [DURACION_DE_TICKET]  INT            NULL,
    PRIMARY KEY CLUSTERED ([CDR_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CDR_X_NUMERO_DESTINO]
    ON [dbo].[cdr]([NUMERO_DESTINO] ASC);


GO

CREATE NONCLUSTERED INDEX [CDR_X_FECHA]
    ON [dbo].[cdr]([FECHA] ASC);


GO

CREATE NONCLUSTERED INDEX [CDR_X_TIPO_DE_DESTINO]
    ON [dbo].[cdr]([TIPO_DE_DESTINO] ASC);


GO

CREATE NONCLUSTERED INDEX [CDR_X_NUMERO_DE_SECUENCIA]
    ON [dbo].[cdr]([NUMERO_DE_SECUENCIA] ASC);


GO

