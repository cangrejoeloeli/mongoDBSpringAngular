CREATE proc cargar_tabla

	@cod int = 0,
	@importe decimal(9,2) =0


as
declare c1 cursor for
SELECT     clnro,afacimponible
FROM         cotel.dbo.conceptosafacturar
WHERE     (coCodigo = 313) AND (hisfacOrden IS NOT NULL)



open c1
fetch next from c1
into @cod,@importe
While @@fetch_status = 0
begin
	        insert into telefonia.dbo.items_clientes_servicios_en_archivo(cliente_servicio_id,importe)			
		values(@cod,@importe)
	
fetch next from c1
into @cod,@importe

end
close c1
deallocate c1
print 'termino'

GO

