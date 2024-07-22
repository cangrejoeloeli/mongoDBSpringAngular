CREATE TABLE [dbo].[clientes_a_llamar] (
    [CLIENTE]     VARCHAR (40)   NOT NULL,
    [FACTURA]     VARCHAR (20)   NOT NULL,
    [VENCIMIENTO] VARCHAR (10)   NOT NULL,
    [SALDO]       DECIMAL (9, 2) NOT NULL,
    [INTENTOS]    INT            NOT NULL,
    [RESPUESTA]   INT            NOT NULL,
    [TELEFONO]    VARCHAR (30)   NOT NULL,
    [FECHA]       DATETIME       NOT NULL,
    [id_llamada]  INT            IDENTITY (1, 1) NOT NULL,
    CONSTRAINT [PK_clientes_a_llamar] PRIMARY KEY CLUSTERED ([id_llamada] ASC)
);


GO

CREATE NONCLUSTERED INDEX [_WA_Sys_saldo_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([SALDO] ASC);


GO

CREATE NONCLUSTERED INDEX [_WA_Sys_respuesta_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([RESPUESTA] ASC);


GO

CREATE NONCLUSTERED INDEX [_WA_Sys_factura_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([FACTURA] ASC);


GO

CREATE NONCLUSTERED INDEX [_WA_Sys_fecha_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([FECHA] ASC);


GO

CREATE NONCLUSTERED INDEX [_WA_Sys_intentos_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([INTENTOS] ASC);


GO

CREATE NONCLUSTERED INDEX [_WA_Sys_cliente_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([CLIENTE] ASC);


GO

CREATE NONCLUSTERED INDEX [_WA_Sys_vencimiento_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([VENCIMIENTO] ASC);


GO

CREATE NONCLUSTERED INDEX [_WA_Sys_telefono_72F0F4D3]
    ON [dbo].[clientes_a_llamar]([TELEFONO] ASC);


GO

