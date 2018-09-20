CREATE DATABASE IF NOT EXISTS addressbook
;

USE addressbook
;

DROP TABLE IF EXISTS guests
;

CREATE TABLE guests (
	firstName varchar (20) NOT NULL ,
   	lastName varchar (20) NOT NULL ,
	address varchar (100) NOT NULL
) TYPE=INNODB
;

