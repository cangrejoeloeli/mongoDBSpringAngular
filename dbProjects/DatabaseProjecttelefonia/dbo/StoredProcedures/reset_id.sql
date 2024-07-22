CREATE PROCEDURE reset_id
 AS
BEGIN
  DBCC CHECKIDENT (clientes_a_llamar, RESEED,1);
END

GO

