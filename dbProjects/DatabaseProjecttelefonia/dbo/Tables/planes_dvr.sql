CREATE TABLE [dbo].[planes_dvr] (
    [PLANES_DVR]  INT            NOT NULL,
    [DESCRIPCION] VARCHAR (100)  NULL,
    [PORCENTAJE]  DECIMAL (7, 2) NULL,
    [CUOTAS]      INT            NULL,
    PRIMARY KEY CLUSTERED ([PLANES_DVR] ASC)
);


GO

