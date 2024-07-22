CREATE PROCEDURE importar_datos
@p_cliente varchar(40),
@p_phone varchar(30),
@p_factura varchar(20),
@p_vencimiento varchar(10),
@p_saldo decimal(15,2)

as

BEGIN
        insert into clientes_a_llamar
                (cliente,telefono,factura,vencimiento,saldo,intentos,respuesta)
        values
                (@p_cliente,@p_phone,@p_factura,@p_vencimiento,@p_saldo,0,0);
END

GO

