CREATE proc planes_sp
	
	@plan_id int = 0,
	@descripcion varchar(50) = '',
	@plan_cod int = 0


as
set nocount on
declare c1 cursor for
SELECT     tariCodigo,tariDescripcion 
FROM cotel.dbo.tarifas
where taricodigo >= 120

open c1
fetch next from c1
into @plan_id, @descripcion
While @@fetch_status = 0
begin
	        
		set @plan_cod = @plan_cod + 1
		update telefonia.dbo.clientes_servicios
		set plan_comercial = @plan_cod
		where plan_comercial = @plan_id			
		insert into telefonia.dbo.plan_comercial(PLAN_COMERCIAL_ID, DESCRIPCION, SERVICIO)			
		values(@plan_cod, @descripcion,'Internet')
	
fetch next from c1
into @plan_id, @descripcion

end
close c1
deallocate c1
print 'termino'

GO

