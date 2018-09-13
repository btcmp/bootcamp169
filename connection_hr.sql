select 'hello world database' from dual;

-- SHOW DATA ON TABLE
select * from employees;
SELECT * from departments;
select * from locations;
select * from countries;
select * from regions;

-- selection
select * from employees;
select 
  FIRST_NAME,
  LAST_NAME,
  SALARY
from employees;

-- alias and concate name
select 
--  FIRST_NAME as nama_depan, /*namaDepan*/
--  LAST_NAME nama_belakang, /*namaBelakang*/
--  SALARY gaji,
  first_name || ' ' || last_name as nama_lengkap,
  'nama  :' || first_name || ', contact : ' || PHONE_NUMBER || ', salary : ' || SALARY  as info
from employees;  

-- function internal
-- UPPER and LOWER
select 
  UPPER(first_name || ' ' || last_name) as nama_besar,
  LOWER(first_name || ' ' || last_name) as nama_kecil
from employees;

-- get date
select current_date from dual;
select
  first_name,
  current_date,
  hire_date,
  to_date('3-JUN-03') -  hire_date as lama_bekerja,
  to_char(current_date, 'YYYY-MM-DD')
from employees;

-- Math Operation
select 1 * 10 as perkalian from dual;
select 2 + 10 * 2 from dual;

select 
  first_name, 
  salary,
  salary + 1000
from employees;

-- Condition
--- data tunggal -- karena employee_id dianggap sebagai key / memiliki nilai uniq
select * from employees
where employee_id = 101;

--- data jamak
select * from employees
where job_id = 'IT_PROG';

select * from employees
where lower(first_name) = lower('David');

-- condition (IN)
select * from employees 
where 
  employee_id = 101 OR employee_id = 107 OR employee_id = 109;
  
select * from employees 
where 
  employee_id in(101, 107, 109);

-- condition (LIKE)
select * from employees where first_name like 'D%';
select * from employees where first_name like '%el';
select * from employees where first_name like '%ma%';

-- JOIN TABLE
--- INNER JOIN
select * from employees;
select * from departments;

select
 emp.employee_id,
 emp.first_name as nama_depan,
 emp.salary as gaji,
 emp.department_id,
 dept.DEPARTMENT_NAME,
 dept.manager_id,
 mng.first_name as nama_manager_department,
 dept.LOCATION_ID,
 loc.STREET_ADDRESS,
 emp.FIRST_NAME as manager_employee
from employees emp 
inner join departments dept
on emp.department_id = dept.department_id
join employees mng
on dept.MANAGER_ID = mng.EMPLOYEE_ID
join locations loc
on dept.LOCATION_ID = loc.LOCATION_ID
join employees mng_emp
on emp.manager_id = mng_emp.employee_id;

select * from employees;
-- emp.department_id -> foreign key
-- dept.department_id -> primary key

-- Location vs Country
select * from locations;
select * from countries;
select
  loc.city,
  con.COUNTRY_NAME
from locations loc
join countries con
on loc.country_id = con.COUNTRY_ID;

--- OUTER 
select * from employees;
select * from departments;

-- LEFT OUTER JOIN
-- inner (106)
select * 
from employees emp --left (107)
left join departments dept --right (27)
on emp.department_id = dept.DEPARTMENT_ID;

-- RIGTH OUTER JOIN
select * 
from employees emp --left (107)
right join departments dept --right (27)
on emp.department_id = dept.DEPARTMENT_ID;

-- distict
select first_name, job_id from employees;
select distinct(job_id) from employees;

-- single function
select current_date from dual;
select UPPER('xsis MiTra UtamA') from dual;
select LOWER('GIMANA bro..') from dual;
select UPPER(first_name), LOWER(last_name) from employees;
select salary * 2 from employees;

-- GROUP FUNCTION
-- 1. max -> untuk mengetahui nilai tertinggi data
-- 2. min -> untuk mengetahui nilai terendah data
-- 3. sum -> untuk mengetahui nilai total data
-- 4. avg -> untuk mengetahui nilai rata2 data
-- 5. count -> untuk mengetahui nilai jumlah data

-- example group function
select * from employees;
select  max(salary), min(salary), avg(salary), count(*) from employees;
select * from employees where salary = 24000;
select * from departments where department_id = 90;

-- GROUP BY
select job_id, round(avg(salary), 2) from employees
group by job_id;

select first_name from employees where employee_id = 100;

select dept.DEPARTMENT_NAME, round(avg(salary), 2)
from employees emp
join DEPARTMENTS dept
on dept.department_id = emp.DEPARTMENT_ID 
group by dept.DEPARTMENT_NAME
having avg(salary) >= (select avg(salary) from employees); --subquery

-- VIEW
create or replace view v_emp_hr 
as
select
 emp.employee_id,
 emp.first_name as nama_depan,
 emp.salary as gaji,
 emp.department_id,
 dept.DEPARTMENT_NAME,
 dept.manager_id,
 mng.first_name as nama_manager_department,
 dept.LOCATION_ID,
 loc.STREET_ADDRESS,
 emp.FIRST_NAME as manager_employee
from employees emp 
inner join departments dept
on emp.department_id = dept.department_id
join employees mng
on dept.MANAGER_ID = mng.EMPLOYEE_ID
join locations loc
on dept.LOCATION_ID = loc.LOCATION_ID
join employees mng_emp
on emp.manager_id = mng_emp.employee_id;

 
select * from v_emp_hr;

--- INSERT, UPDATE, DELETE / DATA MANUPULATION ----
--- DDL VS DML
---- DATA DEFINITION LANGUAGE (DDL) -> contoh membuat table
-- 1. create
  create table employee_a(
   emp_id int primary key,
   first_name varchar(144),
   last_name varchar(144),
   email varchar(144)
  );
-- 2. desc
-- 3. alter
-- 4. drop
drop table employee_a;
---- DATA MANUPULATION LANGUAGE (DML) -> contoh memasukkan data dalam table
-- 1. insert
insert into employee_b(id, first_name, email) values (1,'doni', 'donita@gmail.com');
insert into employee_b(id, first_name, email) values (2,'doni2', 'donita2@gmail.com');
commit;
-- 2. update
-- 3. select
select * from employee_b;
select * from employee_b emp
join department_b dept
on emp.DEPARTMENT_ID = dept.ID 
-- 4. delete
delete from employee_b;
