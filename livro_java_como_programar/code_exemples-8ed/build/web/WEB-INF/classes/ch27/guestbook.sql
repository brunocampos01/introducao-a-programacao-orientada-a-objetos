CREATE DATABASE IF NOT EXISTS guestbook
;

USE guestbook
;

DROP TABLE IF EXISTS guests
;

CREATE TABLE guests (
	firstName varchar (20) NOT NULL ,
        lastName varchar (20) NOT NULL ,
	email varchar (50) NOT NULL PRIMARY KEY
) TYPE=INNODB
;

