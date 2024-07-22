CREATE TABLE [dbo].[plan_comercial] (
    [PLAN_COMERCIAL_ID]   INT             NOT NULL,
    [DESCRIPCION]         VARCHAR (40)    NULL,
    [SERVICIO]            VARCHAR (10)    NULL,
    [Bajada_minimo]       INT             NULL,
    [Bajada_maximo]       INT             NULL,
    [Subida_minimo]       INT             NULL,
    [Subida_maximo]       INT             NULL,
    [Importe_basico]      DECIMAL (18, 2) NULL,
    [suspendido]          INT             NULL,
    [cantidad_de_numeros] INT             NULL,
    [importe_comision]    DECIMAL (18, 2) NULL,
    [cantidad_de_DDN]     INT             NULL,
    [cantidad_de_DDI]     INT             NULL,
    [cantidad_de_mails]   INT             NULL,
    [cantidad_de_bocas]   INT             NULL,
    [tecnica]             TINYINT         NULL,
    [MB_B]                DECIMAL (18, 2) NULL,
    [MB_S]                DECIMAL (18, 2) NULL,
    [desactivado]         TINYINT         NULL,
    CONSTRAINT [PK__plan_comercial__7993056A] PRIMARY KEY CLUSTERED ([PLAN_COMERCIAL_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [UQ__plan_comercial__7A8729A3]
    ON [dbo].[plan_comercial]([DESCRIPCION] ASC);


GO

