CREATE PROCEDURE [dbo].[registrar_llamado]
@p_id int,
@p_cliente varchar(40),
@p_factura varchar(20),
@p_vencimiento varchar(10),
@p_saldo decimal(12,2),
@p_intentos int,
@p_result_code int,
@p_result_description varchar(40),
@p_phone varchar(30),
@p_max_trie int

 AS

	declare  @conectado int,
		@ocupado int,
		@contestador_automatico int,
		@no_le_interesa int,
		@fecha_1 datetime

	set @conectado=8
	set @ocupado=9
	set @contestador_automatico=24
	set @no_le_interesa=29
	set @fecha_1= getdate()

	if (@p_result_code!=@conectado and (@p_result_code=@ocupado or @p_result_code=@contestador_automatico) and @p_result_code!=@no_le_interesa and @p_intentos<=@p_max_trie)  
	begin
		insert into clientes_a_llamar 
		(cliente,factura,vencimiento,saldo,intentos,respuesta,telefono,fecha) 
		values 
		(@p_cliente,@p_factura,@p_vencimiento,@p_saldo,@p_intentos+1,@p_result_code,@p_phone,@fecha_1)
	end
else
	begin
	             insert into llamados_efectuados
	              (id_llamada,cliente,factura,vencimiento,saldo,intentos,result_code,result_description,telefono,fecha,hora)
		values
             		 (@p_id,@p_cliente,@p_factura,@p_vencimiento,@p_saldo,@p_intentos+1,@p_result_code,@p_result_description,@p_phone,convert(varchar,@fecha_1,103),convert(varchar,@fecha_1,108));

		
		if @p_result_code=@conectado
		begin
                                 
			update Facturas_s set recibida=2, cantidad_ivr=cantidad_ivr+1, intima=2, fecha_telecobranza=@fecha_1+5  where  cliente_servicio_id=@p_cliente and intima=10 and saldo>0
			update Facturas_s set recibida=2, cantidad_ivr=cantidad_ivr+1, intima=5, fecha_telecobranza=@fecha_1+5  where  cliente_servicio_id=@p_cliente and intima=11 and saldo>0

			update Facturas_s set recibida=2, cantidad_ivr=cantidad_ivr+1, intima=2, fecha_telecobranza=@fecha_1+5  where  cliente_servicio_id=@p_cliente and intima=12 and saldo>0
			update Facturas_s set recibida=2, cantidad_ivr=cantidad_ivr+1, intima=4, fecha_telecobranza=@fecha_1+5  where  cliente_servicio_id=@p_cliente and intima=13 and saldo>0

			update clientes_servicios set cantidad_ivr=cantidad_ivr+1 where convert(varchar, cliente_servicio_id)=@p_cliente
		end
		else
		begin
			
			update Facturas_s set cantidad_ivr=cantidad_ivr+1, intima=0, fecha_telecobranza=null  where  cliente_servicio_id=@p_cliente and intima=10 and saldo>0
			update Facturas_s set cantidad_ivr=cantidad_ivr+1, intima=3, fecha_telecobranza=null  where  cliente_servicio_id=@p_cliente and intima=11 and saldo>0

			
		             update Facturas_s set cantidad_ivr=cantidad_ivr+1, intima=0, fecha_telecobranza=null  where  cliente_servicio_id=@p_cliente and intima=12 and saldo>0
			update Facturas_s set cantidad_ivr=cantidad_ivr+1, intima=2, fecha_telecobranza=null  where  cliente_servicio_id=@p_cliente and intima=13 and saldo>0
			
			update clientes_servicios set cantidad_ivr=cantidad_ivr+1 where convert(varchar, cliente_servicio_id)=@p_cliente	

		end
		
	end

GO

