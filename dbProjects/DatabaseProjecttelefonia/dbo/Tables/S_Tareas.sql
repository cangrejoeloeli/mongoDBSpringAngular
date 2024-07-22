CREATE TABLE [dbo].[S_Tareas] (
    [CODIGO]          INT            NOT NULL,
    [TAREA]           VARCHAR (40)   NULL,
    [REMU]            DECIMAL (9, 2) NULL,
    [DESDEM]          INT            NULL,
    [HASTAM]          INT            NULL,
    [DESDET]          INT            NULL,
    [HASTAT]          INT            NULL,
    [CARGA]           DECIMAL (5)    NULL,
    [BASICO_CONVENIO] DECIMAL (9, 2) NULL,
    PRIMARY KEY CLUSTERED ([CODIGO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [TAR_PORTAREA]
    ON [dbo].[S_Tareas]([TAREA] ASC);


GO

