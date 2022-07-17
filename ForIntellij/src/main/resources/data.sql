create table cars
(id int not null primary key auto_increment,
brand varchar(30),speed int);

insert into cars (brand, speed)
values
('Kia',220),
('Honda',300),
('Ford',400),
('Mercedes',444),
('Toyota',230),
('Hyundai',303),
('Tesla',300)
;