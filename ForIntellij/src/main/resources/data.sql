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