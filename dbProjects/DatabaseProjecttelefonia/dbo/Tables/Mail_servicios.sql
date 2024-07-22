CREATE TABLE [dbo].[Mail_servicios] (
    [ID]                  INT           IDENTITY (1, 1) NOT NULL,
    [CLIENTE_SERVICIO_ID] INT           NOT NULL,
    [EMAIL]               VARCHAR (100) NULL,
    [FECHA_ALTA]          DATETIME      NOT NULL,
    CONSTRAINT [PK_Mail_servicios] PRIMARY KEY CLUSTERED ([ID] ASC)
);


GO

