CREATE TABLE [dbo].[numeracion_local] (
    [NUMERACION_LOCAL_ID] INT            NOT NULL,
    [DESDE]               INT            NULL,
    [HASTA]               INT            NULL,
    [DESTINO]             VARCHAR (50)   NULL,
    [IMPORTE]             DECIMAL (9, 2) NULL,
    [CODIGO]              INT            NULL,
    PRIMARY KEY CLUSTERED ([NUMERACION_LOCAL_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [NUM2_X_DESTINO]
    ON [dbo].[numeracion_local]([DESTINO] ASC);


GO

