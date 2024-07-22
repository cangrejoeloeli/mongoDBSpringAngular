CREATE TABLE [dbo].[S_escala_remunera] (
    [CODIGO]       INT            NOT NULL,
    [DESDE]        DECIMAL (7, 2) NULL,
    [HASTA]        DECIMAL (9, 2) NULL,
    [IMPORTE]      DECIMAL (9, 2) NULL,
    [INCAPACITADO] DECIMAL (9, 2) NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC)
);


GO

