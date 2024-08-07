CREATE TABLE [dbo].[cables] (
    [CABLES_ID]           INT          NOT NULL,
    [DESCRIPCION]         VARCHAR (30) NULL,
    [CANTIDAD_DE_PARES]   INT          NULL,
    [PRIMARIO_SECUNDARIO] VARCHAR (1)  NULL,
    [ARMARIO_ID]          INT          NULL,
    [NODO_ID]             INT          NULL,
    PRIMARY KEY CLUSTERED ([CABLES_ID] ASC),
    UNIQUE NONCLUSTERED ([DESCRIPCION] ASC),
    UNIQUE NONCLUSTERED ([ARMARIO_ID] ASC, [CABLES_ID] ASC),
    UNIQUE NONCLUSTERED ([ARMARIO_ID] ASC, [CABLES_ID] ASC),
    UNIQUE NONCLUSTERED ([NODO_ID] ASC, [CABLES_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [CAB_CABLES_X_ARMARIO_ID]
    ON [dbo].[cables]([ARMARIO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [CAB_CABLES_X_NODO_ID]
    ON [dbo].[cables]([NODO_ID] ASC);


GO

