CREATE TABLE [dbo].[Servicios] (
    [DESCRIPCION]        VARCHAR (19) NULL,
    [SERVICIO_ID]        INT          NOT NULL,
    [NUMERADOR_SERVICIO] INT          NULL,
    [NUMERADOR_A]        INT          NULL,
    [NUMERADOR_B]        INT          NULL,
    [CTA_ACTIVO_ID]      INT          NULL,
    [CTA_PASIVO_ID]      INT          NULL,
    PRIMARY KEY CLUSTERED ([SERVICIO_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC)
);


GO

