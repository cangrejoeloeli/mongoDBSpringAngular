CREATE TABLE [dbo].[importe_servicios_rentas] (
    [ID]       INT             NOT NULL,
    [SERVICIO] VARCHAR (43)    NULL,
    [IMPORTE]  DECIMAL (13, 2) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [IMP_X_SER]
    ON [dbo].[importe_servicios_rentas]([SERVICIO] ASC);


GO

