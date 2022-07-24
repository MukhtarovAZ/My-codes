create table cars
(id int not null primary key auto_increment,
brand varchar(30),speed int,made_date date,email varchar(40));

insert into cars (brand, speed,made_date)
values

('Kia',220,'2000-05-06'),
('Honda',300,'2000-05-06'),
('Ford',400,'2000-05-06'),
('Mercedes',444,'2000-05-06'),
('Toyota',230,'2000-05-06'),
('Hyundai',303,'2000-05-06'),
('Tesla',300,'2000-05-06')
;


create table users
(username varchar(30) not null primary key,
password varchar(100) not null,
enabled int );

insert into users (username, password, enabled)
values ('rufet','{bcrypt}1',1),
       ('elbrus','{noop}1',1),
       ('nihad','{noop}1',1),
       ('resad','{noop}1',1);

create table authorities
(username varchar(30) not null ,
 authority varchar(100) not null);

insert into authorities(username, authority)
 VALUES ( 'rufet','abc' ),
        ( 'elbrus','abc' ),
        ( 'elbrus','list:cars' ),
        ( 'elbrus','open:save:car'),
        ( 'elbrus','save:car' ),
        ( 'resad','open:edit:car'),
        ( 'resad','list:cars' ),
        ( 'nihad','list:cars'),
        ( 'nihad','delete:car' ),
        ( 'nihad','abc' );