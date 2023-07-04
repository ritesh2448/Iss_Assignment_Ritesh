USE DBMS_ASSIGNMENT;

--Basic SELECT QUERIES
SELECT * FROM Employees;
SELECT * FROM Departments;
SELECT name FROM Employees;

--Distinct Queries
SELECT DISTINCT department_id, age FROM Employees;
SELECT DISTINCT department_id, (SELECT name FROM Departments WHERE id = department_id) AS department_name FROM Employees;


--WHERE QUERIES
SELECT * FROM Employees where department_id=2;
SELECT * FROM Employees WHERE age > 30;
SELECT * FROM Employees WHERE department_id <> 2;


--And/Or Queries
SELECT * FROM Employees WHERE name LIKE 'J%' AND department_id = 2;
SELECT * FROM Employees WHERE department_id = 1 OR age < 25;
SELECT * FROM Employees WHERE (department_id = 1 AND age > 30) OR (department_id = 2 AND age < 35);

--ORDERBY QUERIES
SELECT * FROM Employees ORDER BY name ASC;
SELECT * FROM Employees ORDER BY department_id ASC, age DESC;
SELECT name, age FROM Employees WHERE department_id = 1 ORDER BY age ASC;
SELECT DISTINCT department_id, (SELECT name FROM Departments WHERE id = department_id) AS department_name
FROM Employees
ORDER BY department_name DESC;

--INSERT INTO
INSERT INTO Employees (id, name, age, department_id)
VALUES
  (5, 'Robert Smith', 32, 1),
  (6, 'Emily Davis', 29, 2),
  (7, 'Michael Brown', 34, 1);


--UPDATE
UPDATE Employees
SET department_id = 3
WHERE age > 35;

--DELETE
DELETE FROM Employees
WHERE id = 7;

--SELECT TOP
SELECT TOP 5 * FROM Employees;

--LIKE,WILDCARD
SELECT * FROM Employees WHERE name LIKE 'J%';
SELECT * FROM Employees WHERE name LIKE '_a_';
SELECT * FROM Employees WHERE name LIKE 'J%';

--IN
SELECT * FROM Employees WHERE age IN (25, 30, 35);
SELECT * FROM Employees WHERE department_id IN (SELECT id FROM Departments WHERE name LIKE 'S%');

--BETWEEN
SELECT * FROM Employees WHERE age BETWEEN 25 AND 35;
SELECT * FROM Employees WHERE id BETWEEN 2 AND 5;

--Aliases
SELECT AVG(age) AS average_age
FROM Employees;

SELECT name AS employee_name, age
FROM Employees
WHERE age > 30;


