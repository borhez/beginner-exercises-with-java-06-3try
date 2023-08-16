drop table if exists Product;

create table if not exists Product(
      id bigint primary key not null,
      name varchar(256) not null,
      price int not null
);