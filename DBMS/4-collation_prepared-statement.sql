use DBMS_ASSIGNMENT_2;

--Collation Statement:
--perform a case-insensitive search for customers whose names start with "J" in the "Customers" table.
SELECT *
FROM Customers
WHERE Name COLLATE SQL_Latin1_General_CP1_CI_AI = 'john';



--Prepared Statement:
--retrieve customer information based on a dynamic parameter value using a prepared statement.
DECLARE @id INT;
SET @id = 1;

DECLARE @Query NVARCHAR(1000);
SET @Query = 'SELECT * FROM Customers WHERE id = @id';

EXEC sp_executesql @Query, N'@id INT', @id;



-
