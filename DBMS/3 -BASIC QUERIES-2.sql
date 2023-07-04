CREATE DATABASE DBMS_ASSIGNMENT_2;
USE DBMS_ASSIGNMENT_2;

CREATE TABLE Customers (
  id INT PRIMARY KEY NOT NULL,
  name VARCHAR(100),
  email VARCHAR(100),
  address VARCHAR(100)
);

CREATE TABLE Orders (
  id INT PRIMARY KEY NOT NULL,
  customer_id INT NOT NULL,
  product VARCHAR(100) NOT NULL,
  quantity INT NOT NULL,
  price DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Payments (
  id INT PRIMARY KEY ,
  order_id INT NOT NULL,
  payment_method VARCHAR(100) NOT NULL,
  amount DECIMAL(10, 2) NOT NULL
);

INSERT INTO Customers (id, name, email, address)
VALUES
  (1, 'John Smith', 'john@example.com', '123 Main St'),
  (2, 'Jane Doe', 'jane@example.com', '456 Elm St'),
  (3, 'Michael Johnson', 'michael@example.com', '789 Oak St');

INSERT INTO Orders (id, customer_id, product, quantity, price)
VALUES
  (1, 1, 'Widget', 2, 10.00),
  (2, 2, 'Gadget', 1, 20.00),
  (3, 1, 'Thingamajig', 3, 15.00);

INSERT INTO Payments (id, order_id, payment_method, amount)
VALUES
  (1, 1, 'Credit Card', 20.00),
  (2, 2, 'PayPal', 20.00),
  (3, 3, 'Cash', 45.00);

SELECT * FROM Customers;
SELECT * FROM Orders;
SELECT * FROM Payments;
--SELECT INTO
SELECT id, name, email
INTO new_customers
FROM Customers
WHERE id > 1;

SELECT * FROM new_customers;

--JOIN QUERIES
SELECT Customers.name, Orders.product, Payments.payment_method
FROM Customers
INNER JOIN Orders ON Customers.id = Orders.customer_id
INNER JOIN Payments ON Orders.id = Payments.order_id;

SELECT Customers.name, Orders.product, Payments.payment_method
FROM Customers
RIGHT JOIN Orders ON Customers.id = Orders.customer_id
RIGHT JOIN Payments ON Orders.id = Payments.order_id;

SELECT Customers.name, Orders.product, Payments.payment_method
FROM Customers
LEFT JOIN Orders ON Customers.id = Orders.customer_id
LEFT JOIN Payments ON Orders.id = Payments.order_id;

SELECT Customers.name, Orders.product, Payments.payment_method
FROM Customers
FULL JOIN Orders ON Customers.id = Orders.customer_id
FULL JOIN Payments ON Orders.id = Payments.order_id;


--Constraints
ALTER TABLE Customers
ADD CONSTRAINT unique_email UNIQUE (email);

ALTER TABLE Orders
ADD CONSTRAINT check_positive_quantity CHECK (quantity > 0);

ALTER TABLE Payments
ADD CONSTRAINT check_positive_amount CHECK (amount > 0);

--Union
SELECT id, name, email, address
FROM Customers
UNION
SELECT customer_id, NULL, NULL, NULL
FROM Orders;



--INSERT INTO SELECT
INSERT INTO new_customers (id, name, email)
SELECT id, name, email
FROM Customers
WHERE id > 2;

--NOT NULL
SELECT *
FROM Customers
WHERE address IS NOT NULL;

SELECT *
FROM Customers
WHERE email IS NOT NULL AND address IS NOT NULL;

--UNIQUE KEY CONSTARINT
ALTER TABLE Customers
ADD CONSTRAINT unique_address
UNIQUE (address);

--PRIMARY KEY
--getting name of the primary key constraint associated with the "Customers" table
SELECT name
FROM sys.key_constraints
WHERE type = 'PK' AND OBJECT_NAME(parent_object_id) = 'Customers';

--Droping primary key
ALTER TABLE Customers
DROP CONSTRAINT PK__Customer__3213E83FA394BC7B;

--Adding primary key constraint on id
ALTER TABLE Customers
ADD CONSTRAINT pk_customers PRIMARY KEY (id);

--Foreign Key
ALTER TABLE Orders
ADD CONSTRAINT fk_customer
FOREIGN KEY (customer_id) REFERENCES Customers(id);

ALTER TABLE Orders
DROP CONSTRAINT fk_customer;

--CHECK
ALTER TABLE Orders
ADD CONSTRAINT check_quantity CHECK (quantity >= 1);

ALTER TABLE Orders
DROP CONSTRAINT check_quantity;

--DEFAULT
ALTER TABLE Customers
ADD CONSTRAINT DF_Customers_email DEFAULT 'example@example.com' FOR email;

ALTER TABLE Customers
DROP CONSTRAINT DF_Customers_email;

--INDEX
CREATE INDEX idx_customers_name
ON Customers (name);

CREATE UNIQUE INDEX idx_customers_email
ON Customers (email);

EXEC sp_helpindex 'Customers';

DROP INDEX idx_customers_email
ON Customers;

CREATE NONCLUSTERED INDEX idx_products_price
ON Orders (price);

--DROP,ALTER : Already used
--AUTO INCREMENT : Specipy IDENTITY(1,1) while creating columns of table

--VIEW
CREATE VIEW CustomerOrders AS
SELECT Customers.name, Orders.product, Orders.price
FROM Customers
INNER JOIN Orders ON Customers.id = Orders.customer_id;

UPDATE CustomerOrders
SET  price = 25
WHERE name = 'John Smith';

select * from CustomerOrders;

EXEC sp_rename CustomerOrders, OrdersCustomer;

select * from OrdersCustomer;

--NULL VALUES
INSERT INTO Customers (id, name, email)
VALUES
  (4, '	Steve Smith', 'steve@example.com');

SELECT * FROM Customers
WHERE address is  NUll;

UPDATE Customers SET address = 'abc steet' WHERE address IS NULL;

--GROUP BY,Having
SELECT customer_id, SUM(price) AS TotalOrderAmount
FROM Orders
GROUP BY customer_id;

SELECT customer_id, SUM(price) AS TotalOrderAmount
FROM Orders
GROUP BY customer_id
HAVING SUM(price) > 25;



