CREATE TABLE [dbo].[telefonos_aparatos] (
    [TELEFONO_ID]         INT          NOT NULL,
    [MARCA_ID]            INT          NULL,
    [MODELO_ID]           INT          NULL,
    [SERIE]               VARCHAR (50) NULL,
    [UTILIZADO]           TINYINT      NULL,
    [CLIENTE_SERVICIO_ID] INT          NULL,
    [BAJA]                TINYINT      NULL,
    [stock_id]            INT          NULL,
    [fecha_compra]        DATETIME     NULL,
    [proveedor_id]        INT          NULL,
    [estado_id]           INT          NULL,
    [marca]               VARCHAR (50) NULL,
    [modelo]              VARCHAR (50) NULL,
    [otro]                INT          NULL,
    [tipo]                INT          NULL,
    [cis]                 VARCHAR (15) NULL,
    CONSTRAINT [PK__telefonos_aparat__25077354] PRIMARY KEY CLUSTERED ([TELEFONO_ID] ASC),
    CONSTRAINT [UQ__telefonos_aparat__25FB978D] UNIQUE NONCLUSTERED ([SERIE] ASC),
    CONSTRAINT [UQ__telefonos_aparat__26EFBBC6] UNIQUE NONCLUSTERED ([SERIE] ASC, [TELEFONO_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [TELEF_TELEFONO_X_MODELO_ID]
    ON [dbo].[telefonos_aparatos]([MODELO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [TELEF_TELEFONO_X_MARCA_ID]
    ON [dbo].[telefonos_aparatos]([MARCA_ID] ASC);


GO

