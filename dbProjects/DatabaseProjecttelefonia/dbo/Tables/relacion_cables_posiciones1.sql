CREATE TABLE [dbo].[relacion_cables_posiciones1] (
    [RELACION_ID]  INT             NOT NULL,
    [CAJA_ID]      INT             NULL,
    [POS_ID]       INT             NULL,
    [CAPACITANCIA] DECIMAL (13, 2) NULL,
    [N_POS]        INT             NULL,
    [nodo]         VARCHAR (50)    NULL,
    [placa]        VARCHAR (50)    NULL,
    [puerto]       VARCHAR (50)    NULL,
    [equipo]       VARCHAR (50)    NULL,
    [rack]         VARCHAR (50)    NULL,
    [utilizado]    TINYINT         NULL,
    [orden]        INT             NULL,
    [numero_caja]  INT             NULL,
    [placa_id]     INT             NULL,
    PRIMARY KEY CLUSTERED ([RELACION_ID] ASC),
    UNIQUE NONCLUSTERED ([CAJA_ID] ASC, [RELACION_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [REL_X_CAJA]
    ON [dbo].[relacion_cables_posiciones1]([CAJA_ID] ASC);


GO

