CREATE proc cajas_sp
	
	@caja_cod int = 0,
	@caja_descr varchar(50) = '',
	@cantidad_pares int = 0	,
	@aux1 int = 0,
	@cantidad_pares_utilizados int = 0,
	@aux2 int = 0,
	@aux3 int = 0,
	@armario_id int = 0


as
set nocount on
declare c1 cursor for
SELECT     cajcodigo,cajparhasta, cajpardesde,arcodigo, cajpareslibres
FROM         cotel.dbo.cajas

open c1
fetch next from c1
into @caja_cod,@aux1,@aux2,@armario_id, @aux3
While @@fetch_status = 0
begin
	             set @caja_descr = 'Caja ' 
		set @cantidad_pares = @aux1 - @aux2 + 1
		set @cantidad_pares_utilizados = @cantidad_pares - @aux3
			
		insert into telefonia.dbo.cajas(cajas_id, numero_de_caja,descripcion, codigo_calle, numero, lugar,
						cantidad_de_pares, cantidad_de_pares_utilizados, lugar_ingreso, armario_id,
						porc_internet, porc_telefonia)			
		values(@caja_cod, @caja_cod,@caja_descr ,0,0,'',@cantidad_pares,@cantidad_pares_utilizados,'',@armario_id,100,100)
	
fetch next from c1
into @caja_cod,@aux1,@aux2,@armario_id, @aux3

end
close c1
deallocate c1
print 'termino'

GO

