CREATE proc calles_sp

	@cod int = 0,
	@nombre varchar(50) = '',
	@numero int = 0	


as
declare c1 cursor for
SELECT     cod_calle, nombre
FROM         cotel.dbo.calles_catastro

open c1
fetch next from c1
into @cod,@nombre
While @@fetch_status = 0
begin
	       set @numero  = @cod
			
		insert into telefonia.dbo.calles(codigo_calle, numero, nombre)			
		values(@cod,@numero,@nombre )
	
fetch next from c1
into @cod,@nombre

end
close c1
deallocate c1
print 'termino'

GO

