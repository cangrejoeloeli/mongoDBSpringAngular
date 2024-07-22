CREATE TABLE [dbo].[modif_telegestion] (
    [ID_TELE]     INT           NOT NULL,
    [DESCRIPCION] VARCHAR (199) NULL,
    [OPERADOR]    VARCHAR (49)  NULL,
    [FECHA]       DATETIME      NULL,
    PRIMARY KEY CLUSTERED ([ID_TELE] ASC)
);


GO

