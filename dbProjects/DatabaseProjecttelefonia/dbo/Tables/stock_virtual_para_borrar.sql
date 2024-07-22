CREATE TABLE [dbo].[stock_virtual_para_borrar] (
    [STOCK_V_ID]  INT          NULL,
    [MODEM_ID]    INT          NULL,
    [CPE_ID]      INT          NULL,
    [TECNICO_ID]  INT          NULL,
    [FECHA]       DATETIME     NULL,
    [TELEFONO_ID] INT          NULL,
    [usado]       INT          NULL,
    [stock_id]    INT          NULL,
    [equipo_id]   INT          NULL,
    [marca]       VARCHAR (50) NULL,
    [modelo]      VARCHAR (50) NULL,
    [serie]       VARCHAR (50) NULL,
    [tipo]        INT          NULL,
    UNIQUE NONCLUSTERED ([STOCK_V_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [STO2_STOCK_V_X_CPE_ID]
    ON [dbo].[stock_virtual_para_borrar]([CPE_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [STO2_STOCK_V_X_TELEFONO_ID]
    ON [dbo].[stock_virtual_para_borrar]([TELEFONO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [STO2_STOCK_V_X_TECNICO_ID]
    ON [dbo].[stock_virtual_para_borrar]([TECNICO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [STO2_STOCK_V_X_MODEM_ID]
    ON [dbo].[stock_virtual_para_borrar]([MODEM_ID] ASC);


GO

