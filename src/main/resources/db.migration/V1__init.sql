create table shop(id int, name varchar(255), money int, primary key (id));
insert into shop(id, name, money) values (1, 'Medival', 3000);
insert into shop(id, name, money) values (2, 'Saloon', 3000);
insert into shop(id, name, money) values (3, 'Gun Shop', 3000);
insert into shop(id, name, money) values (4, 'Hero', 200);

create table item(id int, price int, name varchar(255), info varchar(255), primary key (id));
insert into item(id, price, name, info) values (1, 250, 'balta', 'xxx');
insert into item(id, price, name, info) values (2, 250, 'pok', 'xxx');
insert into item(id, price, name, info) values (3, 250, 'sor', 'xxx');
insert into item(id, price, name, info) values (4, 250, 'Triforce', 'xxx');

create table shopInventory(rowNumber int auto_increment, shopID int, itemID int, primary key(rowNumber));
insert into shopInventory(shopID, itemID) values (1,1);
insert into shopInventory(shopID, itemID) values (2,2);
insert into shopInventory(shopID, itemID) values (3,3);
insert into shopInventory(shopID, itemID) values (4,4);

create table heroeInventory(id int, name varchar(255), money int, info varchar(255), primary key (id));
insert into heroeInventory(id, name, money, info);
