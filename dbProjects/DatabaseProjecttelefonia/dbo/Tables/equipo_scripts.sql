CREATE TABLE [dbo].[equipo_scripts] (
    [ID]        INT NOT NULL,
    [ID_EQUIPO] INT NULL,
    [ID_SCRIPT] INT NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([ID_EQUIPO] ASC, [ID_SCRIPT] ASC)
);


GO
