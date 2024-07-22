CREATE TABLE [dbo].[consumos_celulares] (
    [CONSUMOS_ID]            INT             NOT NULL,
    [NUMERO_ORIGEN]          INT             NULL,
    [SERVICIO_ID]            INT             NULL,
    [CARACTERISTICA_DESTINO] INT             NULL,
    [NUMERO_DESTINO]         VARCHAR (19)    NULL,
    [FECHA]                  DATETIME        NULL,
    [HORA]                   VARCHAR (19)    NULL,
    [SEGUNDOS]               INT             NULL,
    [MINUTOS]                DECIMAL (7, 2)  NULL,
    [MINUTOS_A_DESCONTAR]    INT             NULL,
    [IMPORTE_TIERRA]         DECIMAL (13, 8) NULL,
    [DESTINO]                VARCHAR (40)    NULL,
    [MINUTOS_NACIONAL]       DECIMAL (13, 2) NULL,
    [SEGUNDOS_NACIONAL]      INT             NULL,
    [IMPORTE_AIRE]           DECIMAL (13, 8) NULL,
    PRIMARY KEY CLUSTERED ([CONSUMOS_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CON5_X_NUM_DESTINO]
    ON [dbo].[consumos_celulares]([NUMERO_DESTINO] ASC);


GO

CREATE NONCLUSTERED INDEX [CON5_X_SERVICIO_ID]
    ON [dbo].[consumos_celulares]([SERVICIO_ID] ASC);


GO

