CREATE DATABASE DBMS_ASSIGNMENT;

USE DBMS_ASSIGNMENT;

CREATE TABLE Employees (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  age INT,
  department_id INT
);


CREATE TABLE Departments (
  id INT PRIMARY KEY,
  name VARCHAR(50)
);

INSERT INTO Employees (id, name, age, department_id) VALUES
  (1, 'John Smith', 30, 1),
  (2, 'Jane Doe', 28, 2),
  (3, 'Michael Johnson', 35, 1),
  (4, 'Emily Williams', 32, 2);

INSERT INTO Departments (id, name) VALUES
  (1, 'Sales'),
  (2, 'Marketing');

