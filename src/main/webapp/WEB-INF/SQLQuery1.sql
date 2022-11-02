create database BAN_HANG
go
use BAN_HANG
go
create table users(
id int primary key,
name varchar(45),
phone varchar(45),
username varchar(45),
password varchar(45),
about varchar(45),
role varchar(45),
favourites varchar(45),
avatar varchar(45),
)
select * from users where id=1