CREATE TABLE [dbo].[llamados_efectuados_historico] (
    [ID_HISTORICO]         INT             NOT NULL,
    [id_llamada]           INT             NULL,
    [CLIENTE]              VARCHAR (40)    NULL,
    [FACTURA]              VARCHAR (20)    NULL,
    [VENCIMIENTO]          VARCHAR (10)    NULL,
    [SALDO]                DECIMAL (15, 2) NULL,
    [INTENTOS]             INT             NULL,
    [result_code]          INT             NULL,
    [result_description]   VARCHAR (40)    NULL,
    [TELEFONO]             VARCHAR (30)    NULL,
    [FECHA]                VARCHAR (11)    NULL,
    [HORA]                 VARCHAR (8)     NULL,
    [descripcion_llamados] VARCHAR (150)   NULL,
    [f_vencimiento]        DATETIME        NULL,
    [fecha_llamados]       DATETIME        NULL,
    PRIMARY KEY CLUSTERED ([ID_HISTORICO] ASC)
);


GO

CREATE NONCLUSTERED INDEX [LLA1_KEY_]
    ON [dbo].[llamados_efectuados_historico]([id_llamada] ASC, [TELEFONO] ASC);


GO

