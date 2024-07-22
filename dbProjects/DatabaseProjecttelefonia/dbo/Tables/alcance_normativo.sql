CREATE TABLE [dbo].[alcance_normativo] (
    [CODIGO]            INT           NOT NULL,
    [NORMATIVA]         VARCHAR (25)  NULL,
    [DESCRIPCION]       VARCHAR (100) NULL,
    [ALCANCE]           VARCHAR (20)  NULL,
    [RENUNCIA_SUBSIDIO] TINYINT       NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC)
);


GO

