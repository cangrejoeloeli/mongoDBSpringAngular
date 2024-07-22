CREATE TABLE [dbo].[historico_equipos] (
    [HISTORICO_EQUIPO_ID] INT           NULL,
    [CLIENTE_SERVICIO_ID] INT           NULL,
    [MOD_ID]              INT           NULL,
    [OBSERVACIONES]       VARCHAR (199) NULL,
    [FECHA_BAJA]          DATETIME      NULL,
    [FECHA_MOD]           DATETIME      NULL,
    [modem_id]            INT           NULL,
    [cpe_id]              INT           NULL,
    [ata_id]              INT           NULL,
    [devuelve_m]          INT           NULL,
    [devuelve_c]          INT           NULL,
    [devuelve_a]          INT           NULL,
    UNIQUE NONCLUSTERED ([HISTORICO_EQUIPO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [HIS_X_MOD_ID]
    ON [dbo].[historico_equipos]([MOD_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [HIS_X_CLIENTE_SERVICIO_ID]
    ON [dbo].[historico_equipos]([CLIENTE_SERVICIO_ID] ASC);


GO

