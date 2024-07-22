CREATE TABLE [dbo].[stock_virtual] (
    [STOCK_V_ID]  INT          NOT NULL,
    [STOCK_ID]    INT          NULL,
    [USADO]       TINYINT      NULL,
    [MODEM_ID]    INT          NULL,
    [CPE_ID]      INT          NULL,
    [TECNICO_ID]  INT          NULL,
    [FECHA]       DATETIME     NULL,
    [TELEFONO_ID] INT          NULL,
    [EQUIPO_ID]   INT          NULL,
    [MARCA]       VARCHAR (49) NULL,
    [MODELO]      VARCHAR (49) NULL,
    [SERIE]       VARCHAR (49) NULL,
    [TIPO]        TINYINT      NULL,
    PRIMARY KEY CLUSTERED ([STOCK_V_ID] ASC)
);


GO

CREATE NONCLUSTERED INDEX [STO2_TECNICOS_ID]
    ON [dbo].[stock_virtual]([TECNICO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [STO2_MOD_ID]
    ON [dbo].[stock_virtual]([MODEM_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [STO2_TELEF_ID]
    ON [dbo].[stock_virtual]([TELEFONO_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [STO2_X_STOCK_ID]
    ON [dbo].[stock_virtual]([STOCK_ID] ASC);


GO

CREATE NONCLUSTERED INDEX [STO2_CPD_ID]
    ON [dbo].[stock_virtual]([CPE_ID] ASC);


GO

