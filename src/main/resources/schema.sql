create table printedProduct
(
    id int auto_increment,
    name varchar(255) not null,
    type varchar(255)  not null,
    dater date not null,
    author varchar(255)  not null,
    publishingHouse varchar(255)  not null,
    primary key(id)
);

ALTER TABLE printedProduct
  add constraint TEST_CONST
    check (type = 'MAGAZINE' or type = 'BOOK' or type = 'NEWSPAPER')