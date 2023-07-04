
-- Stored Procedure
CREATE PROCEDURE GetCustomersByName
  @name VARCHAR(50)
AS
BEGIN
  SELECT *
  FROM Customers
  WHERE name = @name;
END;
GO

EXEC GetCustomersByName @name = 'John Smith';

