create database users;
create table employee(
    emp_id int primary key,
    name varchar(255) NOT NULL,
    salery int
);

-- type 1:primary key
insert into employee(emp_id,name,salery)
            values(1,"shubham",1000),
            (2,"sanket",1000),
            (3,"rohan",1000),
            (4,"ramchandra",13000),
            (5,"rajat",20000);

--  type 2 :primary key         
-- create table employee(
--     emp_id int,
--     name varchar(255) NOT NULL,
--     salery int,
--     primary key(emp_id)
-- );