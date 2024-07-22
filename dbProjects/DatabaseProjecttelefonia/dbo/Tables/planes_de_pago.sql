CREATE TABLE [dbo].[planes_de_pago] (
    [PLANES_DE_PAGO_ID] INT            NOT NULL,
    [DESCRIPCION]       VARCHAR (100)  NULL,
    [DESDE]             DECIMAL (7, 2) NULL,
    [HASTA]             DECIMAL (7, 2) NULL,
    [SERVICIO]          VARCHAR (50)   NULL,
    PRIMARY KEY CLUSTERED ([PLANES_DE_PAGO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [PLA4_X_DESDE]
    ON [dbo].[planes_de_pago]([DESDE] ASC);


GO

CREATE NONCLUSTERED INDEX [PLA4_X_DESDE_Y_HASTA]
    ON [dbo].[planes_de_pago]([DESDE] ASC, [HASTA] ASC);


GO

CREATE NONCLUSTERED INDEX [PLA4_X_SERVICIO]
    ON [dbo].[planes_de_pago]([SERVICIO] ASC);


GO

CREATE NONCLUSTERED INDEX [PLA4_X_HASTA]
    ON [dbo].[planes_de_pago]([HASTA] ASC);


GO

