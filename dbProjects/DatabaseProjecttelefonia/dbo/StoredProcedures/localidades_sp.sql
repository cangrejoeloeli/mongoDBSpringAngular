CREATE proc localidades_sp

	@cod int = 0,
	@nombre varchar(50) = '',
	@postal int=0,	
	@provincia int = 0	


as
declare c1 cursor for
SELECT       loCodigo,loNombre,loCP,prCodigo
FROM         cotel.dbo.localidades

open c1
fetch next from c1
into @cod,@nombre,@postal,@provincia
While @@fetch_status = 0
begin
	        insert into telefonia.dbo.localidades(localidad_id,localidad,provincia_id,codigo_postal)			
		values(@cod,@nombre,@provincia,@postal)
	
fetch next from c1
into @cod,@nombre,@postal,@provincia

end
close c1
deallocate c1
print 'termino'

GO

