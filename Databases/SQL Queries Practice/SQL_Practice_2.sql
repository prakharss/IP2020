CREATE TABLE Employee  
(  
EmployeeID int NOT NULL,  
EmployeeName varchar(255),
DepartmentID int,
DesignationID int,
Salary int,
PRIMARY KEY(EmployeeID)
);  

CREATE TABLE Department  
(  
DepartmentID int NOT NULL,
DepartmentName varchar(255),
PRIMARY KEY(DepartmentID)
);  

CREATE TABLE Designation  
(  
DesignationID int NOT NULL,
DesignationName varchar(255),
PRIMARY KEY(DesignationID)
);  

INSERT into Designation values (1, 'Software Engineer');
INSERT into Designation values (2, 'Senior Software Engineer');
INSERT into Designation values (3, 'Quality Analyst');
INSERT into Designation values (4, 'Senior Quality Analyst');
INSERT into Designation values (5, 'Dummy Desg');

SELECT * FROM Designation;

INSERT into Department values (101, 'IT');
INSERT into Department values (102, 'SE');
INSERT into Department values (103, 'OPS');
INSERT into Department values (104, 'Dummy');

SELECT * FROM Department;

INSERT into Employee values (1, 'Aakanksha1', 102, 1, 10000);
INSERT into Employee values (2, 'Aakanksha2', 101, 3, 20000);
INSERT into Employee values (3, 'Aakanksha3', 103, 2, 40000);
INSERT into Employee values (4, 'Aakanksha4', 103, 4, 30000);
INSERT into Employee values (5, 'Aakanksha5', 103, 1, 15000);
INSERT into Employee values (6, 'Aakanksha6', 102, 3, 25000);
INSERT into Employee values (7, 'Aakanksha7', 102, 2, 35000);
INSERT into Employee values (8, 'Aakanksha8', 101, 4, 45000);

Select * FROM Employee;

--Count the number of employees, the total sum of salary, minimum salary, maximum salary, average salary
SELECT COUNT(*) empCnt, SUM(Salary) as sum, MIN(Salary) minSalary, MAX(Salary) maxSalary, AVG(Salary) avgSalary from Employee;

-- Select the employees having Designation Software Engineer
SELECT * from employee e join designation d on e.designationId = d.designationid where d.designationName = 'Software Engineer';

SELECT * from employee e, designation d where e.designationId = d.designationid and d.designationName = 'Software Engineer';

--Select the sum of salary for employees based on Designation
SELECT sum(e.salary), d.designationname from employee e, designation d where e.designationid = d.designationid group by d.designationname;
SELECT sum(e.salary), d.designationname from employee e join designation d on e.designationid = d.designationid group by d.designationname;

--Select the sum of salary for employees based on Department
SELECT sum(e.salary) sum, d.departmentname from employee e, department d where e.departmentid = d.departmentid group by d.departmentname order by sum desc;
SELECT sum(e.salary) sum, d.departmentname from employee e join department d on e.departmentid = d.departmentid group by d.departmentname order by sum desc;

--Select the department whose salary is greater than or equal to 70000
SELECT sum(e.salary) sum, d.departmentname from employee e join department d on e.departmentid = d.departmentid group by d.departmentname having sum(e.salary) >= 70000 order by sum desc;

--Select the department whose salary is greater than or equal to 70000
SELECT sum(e.salary) sum, d.departmentname from employee e join department d on e.departmentid = d.departmentid group by d.departmentname having sum(e.salary) >= 70000 order by sum desc;

--Show all employees and their departments and designations
SELECT * FROM employee e, designation d, department dpt where e.departmentid = dpt.departmentid and e.designationid = d.designationid order by e.employeeid;

SELECT * FROM employee e, designation d, department dpt order by e.employeeid; --Cross Join

SELECT * FROM employee a, employee b; --Self Join

SELECT * FROM department d left join employee e on e.departmentid = d.departmentid order by e.employeeid;

SELECT * FROM department d right join employee e on e.departmentid = d.departmentid order by e.employeeid;

SELECT * FROM department d full outer join employee e on e.departmentid = d.departmentid order by e.employeeid;

SELECT * FROM department d inner join employee e on e.departmentid = d.departmentid order by e.employeeid;

SELECT * FROM department d join employee e on e.departmentid = d.departmentid order by e.employeeid;

--EXISTS
SELECT EmployeeID, EmployeeName 
FROM Employee
WHERE EXISTS (SELECT * 
              FROM Department 
              WHERE Department.DepartmentID = Employee.DepartmentID);
			  
SELECT EmployeeID, EmployeeName 
FROM Employee
WHERE NOT EXISTS (SELECT * 
              FROM Department 
              WHERE Department.DepartmentID = Employee.DepartmentID);
			  
SELECT d.departmentname from employee e join department d on e.departmentid = d.departmentid group by d.departmentname
HAVING MAX(e.salary) > ALL (SELECT AVG(e.salary) From Employee e);

SELECT d.departmentname from employee e join department d on e.departmentid = d.departmentid group by d.departmentname
HAVING MAX(e.salary) > ANY (SELECT AVG(e.salary) From Employee e);
			  