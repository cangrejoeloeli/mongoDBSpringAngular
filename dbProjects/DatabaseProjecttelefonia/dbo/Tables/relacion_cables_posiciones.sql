CREATE TABLE [dbo].[relacion_cables_posiciones] (
    [RELACION_ID]  INT             NOT NULL,
    [CAJA_ID]      INT             NULL,
    [POS_ID]       INT             NULL,
    [CAPACITANCIA] DECIMAL (13, 2) NULL,
    [N_POS]        INT             NULL,
    [NODO]         VARCHAR (39)    NULL,
    [PLACA]        VARCHAR (39)    NULL,
    [PLACA_ID]     INT             NULL,
    [PUERTO]       VARCHAR (39)    NULL,
    [EQUIPO]       VARCHAR (39)    NULL,
    [RACK]         VARCHAR (39)    NULL,
    [UTILIZADO]    TINYINT         NULL,
    [ORDEN]        INT             NULL,
    [NUMERO_CAJA]  INT             NULL,
    PRIMARY KEY CLUSTERED ([RELACION_ID] ASC),
    UNIQUE NONCLUSTERED ([CAJA_ID] ASC, [RELACION_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [REL_X_CAJA]
    ON [dbo].[relacion_cables_posiciones]([CAJA_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REL_X_CAJA_ID_Y_NUM]
    ON [dbo].[relacion_cables_posiciones]([CAJA_ID] ASC, [NUMERO_CAJA] ASC);


GO

CREATE NONCLUSTERED INDEX [REL_X_NUM_CAJA_Y_ID]
    ON [dbo].[relacion_cables_posiciones]([NUMERO_CAJA] ASC, [RELACION_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REL_X_POS_ID]
    ON [dbo].[relacion_cables_posiciones]([POS_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [REL_X_ORDEN]
    ON [dbo].[relacion_cables_posiciones]([ORDEN] ASC);


GO

CREATE NONCLUSTERED INDEX [REL_CAJA_ID_Y_ORDEN]
    ON [dbo].[relacion_cables_posiciones]([CAJA_ID] ASC, [ORDEN] ASC);


GO

