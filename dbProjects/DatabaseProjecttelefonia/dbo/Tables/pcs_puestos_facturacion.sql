CREATE TABLE [dbo].[pcs_puestos_facturacion] (
    [PCS_PUESTOS_FACTURACION_ID] INT          NOT NULL,
    [PUESTO_ID]                  INT          NULL,
    [PC]                         VARCHAR (50) NULL,
    PRIMARY KEY CLUSTERED ([PCS_PUESTOS_FACTURACION_ID] ASC),
    UNIQUE NONCLUSTERED ([PUESTO_ID] ASC, [PC] ASC)
);


GO

CREATE NONCLUSTERED INDEX [PCS_X_PUESTO_ID]
    ON [dbo].[pcs_puestos_facturacion]([PUESTO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [PCS_X_PC]
    ON [dbo].[pcs_puestos_facturacion]([PC] ASC);


GO

