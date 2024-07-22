CREATE TABLE [dbo].[Localidades_habilitadas] (
    [ID]                       INT          NOT NULL,
    [EMPRESA]                  VARCHAR (40) NULL,
    [LOCALIDAD]                VARCHAR (30) NULL,
    [CP]                       VARCHAR (10) NULL,
    [DIRECCION]                VARCHAR (40) NULL,
    [HORARIO_ATENCION]         CHAR (40)    NULL,
    [LOGO]                     VARCHAR (20) NULL,
    [BASE]                     VARCHAR (20) NULL,
    [SERVIDOR]                 VARCHAR (20) NULL,
    [USUARIO]                  VARCHAR (20) NULL,
    [PASSWORD]                 VARCHAR (20) NULL,
    [FIRMA_INTIMACION]         VARCHAR (40) NULL,
    [CARGO_FIRMA_INTIMACION]   VARCHAR (40) NULL,
    [ARCHIVO_FIRMA_INTIMACION] VARCHAR (40) NULL,
    [FIRMA_CARTA_DOCUMENTO]    VARCHAR (40) NULL,
    [DNI_CARTA_DOCUMENTO]      INT          NULL,
    [CARGO_CARTA_DOCUMENTO]    VARCHAR (40) NULL,
    [FIRMA_ACUERDOS]           VARCHAR (40) NULL,
    [CARGO_FIRMA_ACUERDOS]     VARCHAR (40) NULL,
    [TE_EMERGENCIAS]           VARCHAR (19) NULL,
    [TE_ATENCION]              VARCHAR (19) NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([LOCALIDAD] ASC)
);


GO

