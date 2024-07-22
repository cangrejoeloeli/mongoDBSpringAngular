CREATE TABLE [dbo].[cambios_planes] (
    [CAMBIO_ID]         INT          NOT NULL,
    [PLAN_COMERCIAL_ID] INT          NULL,
    [PLAN]              VARCHAR (79) NULL,
    [CAMBIO]            VARCHAR (98) NULL,
    [OPERADOR]          VARCHAR (43) NULL,
    [FECHA]             DATETIME     NULL,
    PRIMARY KEY CLUSTERED ([CAMBIO_ID] ASC)
);


GO

