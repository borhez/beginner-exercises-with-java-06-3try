drop table if exists Product;

create table if not exists Product(
    id int generated by default as identity primary key,
    name varchar(128) not null,
    price int not null
);