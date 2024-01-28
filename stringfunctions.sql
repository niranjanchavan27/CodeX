-- create table books(
--     book_id int primary key AUTO_INCREMENT,
--     title varchar(255),
--     author_fname varchar(255),
--     author_lname varchar(255),
--     publish_year varchar(255),
--     qty int,
--     pages int
-- );

-- insert into books(title,
--             author_fname,
--             author_lname,
--             publish_year,
--             qty,
--             pages
--             )values
--             ("agnipankh","abdul","kalam","1999",400,200),
--             ("chhava","shivaji","sawant","2005",500,800),
--             ("mrutunjay","shivaji","sawant","2006",1000,900),
--             ("geeta","krushna","yadav","1000",1000,1000);

-- concat 
-- select title , concat(author_fname," ",author_lname) as fullname from books;

-- char_length
-- select char_length(title) as title_length,title from books;

-- replace
-- select replace("akash", 'a','@');

-- upper
-- select upper("codegen");

-- lower
-- select lower('CODEGEN');
-- select lower("CodegeN");

-- trim
-- select trim('      CODEGEN');

-- left
-- select left('CODEGEN',3);
-- output COD

-- right
-- select right('CODEGEN',3);
-- output GEN

-- reverse
-- select reverse('CODEGEN');

-- repeat
-- select repeat('CODEGEN',2);
-- output CODEGENCODEGEN

-- task1 replace 'a' to '@' in title column
-- select replace(title,'a','@') as new_title from books;