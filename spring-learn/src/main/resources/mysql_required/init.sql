create database spring_learn;
use spring_learn;
create user 'vzodge'@'%' identified by 'password123';
GRANT ALL PRIVILEGES ON *.* TO 'vzodge'@'%'with grant option;
flush privileges;
CREATE TABLE students ( id smallint unsigned not null auto_increment, first_name varchar(20) not null,last_name varchar(20) not null, constraint pk_example primary key (id) );
INSERT INTO students ( id, first_name, last_name ) VALUES ( null, 'Vaibhav','Zodge' );