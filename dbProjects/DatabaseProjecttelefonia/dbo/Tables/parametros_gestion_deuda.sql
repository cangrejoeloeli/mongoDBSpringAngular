CREATE TABLE [dbo].[parametros_gestion_deuda] (
    [ID_PARAMETRO]               INT NOT NULL,
    [DIAS_1ER_INTIMA_I]          INT NULL,
    [DIAS_SUSP_I]                INT NULL,
    [DIAS_AVISO_CORTE_I]         INT NULL,
    [DIAS_CORTE_I]               INT NULL,
    [DIAS_1ER_INTIMA_T]          INT NULL,
    [DIAS_2DA_INTIMA_T]          INT NULL,
    [DIAS_SUSPENSIONES_T]        INT NULL,
    [DIAS_AVISO_CORTE_TELEFONIA] INT NULL,
    [DIAS_CORTE_TELEFONIA]       INT NULL,
    PRIMARY KEY CLUSTERED ([ID_PARAMETRO] ASC)
);


GO

