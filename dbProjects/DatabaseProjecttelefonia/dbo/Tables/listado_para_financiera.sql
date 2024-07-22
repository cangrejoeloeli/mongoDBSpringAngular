CREATE TABLE [dbo].[listado_para_financiera] (
    [ID]                  INT            NOT NULL,
    [CLIENTE_ID]          INT            NULL,
    [CLIENTE_SERVICIO_ID] INT            NULL,
    [CLIENTE]             VARCHAR (149)  NULL,
    [DIRECCION]           VARCHAR (149)  NULL,
    [SERVICIO]            VARCHAR (49)   NULL,
    [IMPORTE]             DECIMAL (9, 2) NULL,
    [LISTADO_ID]          INT            NULL,
    PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LIS_X_SERVICIO]
    ON [dbo].[listado_para_financiera]([SERVICIO] ASC);


GO

CREATE NONCLUSTERED INDEX [LIS_X_LISTADO_ID]
    ON [dbo].[listado_para_financiera]([LISTADO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [LIS_X_LISTADO_Y_SERVICIO]
    ON [dbo].[listado_para_financiera]([LISTADO_ID] ASC, [SERVICIO] ASC);


GO

