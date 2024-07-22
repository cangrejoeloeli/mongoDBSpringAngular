CREATE TABLE [dbo].[movimientos_reclamos] (
    [ID]                   INT           NOT NULL,
    [RECLAMO_ID]           INT           NULL,
    [ITEM_ACTUAL]          INT           NULL,
    [NOMBRE_TIPO_RECLAMO]  VARCHAR (254) NULL,
    [DECISION]             CHAR (10)     NULL,
    [COMENTARIO]           VARCHAR (200) NULL,
    [VALOR]                VARCHAR (9)   NULL,
    [operador]             VARCHAR (40)  NULL,
    [fecha]                DATETIME      NULL,
    [nro_derivacion]       INT           NULL,
    [historico_reclamo_id] INT           NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC),
    UNIQUE NONCLUSTERED ([RECLAMO_ID] ASC, [ID] ASC)
);


GO

