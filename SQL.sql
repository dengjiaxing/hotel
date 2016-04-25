create schema hotel;

create table admin(
adminid int auto_increment primary key,
username varchar(50) default null,
password varchar(50) default null
);



create table  h_order(
userid int default null,
roomid int default null,
orderid int auto_increment primary key
);

create table room(
roomid int not null auto_increment primary key,
name varchar(50) default null,
price double(8,0) default null,
category varchar(50) default null,
status int(11) default null
);

create table user(
userid int not null auto_increment primary key,
username varchar(50) default null,
password varchar(50) default null,
mobile varchar(15) default null,
email varchar(50) default null
);
insert into admin(username,password) values('Tom',123);

