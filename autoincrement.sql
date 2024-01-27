create table employees(
    emp_id int primary key AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    salery int
);

insert into employees(name,salery)
            values("shubham",1000),
            ("sanket",1000),
            ("rohan",1000),
            ("ramchandra",13000),
            ("rajat",20000);