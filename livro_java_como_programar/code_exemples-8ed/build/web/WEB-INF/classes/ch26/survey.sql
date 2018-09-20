CREATE DATABASE IF NOT EXISTS survey
;
USE survey
;
DROP TABLE IF EXISTS surveyResult
;
DROP TABLE IF EXISTS surveyCategory
;

CREATE TABLE surveyCategory (
	id int NOT NULL,
	name varchar (20) NOT NULL,
	question varchar (50) NOT NULL,
	PRIMARY KEY (id)
)  TYPE=INNODB
;

CREATE TABLE surveyResult (
	id int NOT NULL,
	surveyOption varchar (20) NOT NULL,
	voteCount int NOT NULL,
	INDEX (id),
	FOREIGN KEY (id) REFERENCES surveyCategory(id)
)  TYPE=INNODB
;

insert into surveyCategory (id,name,question) values (1, "Animals", "What is your favorite animal?")
;
insert into surveyCategory (id,name,question) values (2, "Fruits", "What is your favorite fruit?")
;
insert into surveyCategory (id,name,question) values (3, "Sports", "What is your favorite sports?")
;

insert into surveyResult (id,surveyOption,voteCount) values (1, 'Dog', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (1, 'Cat', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (1, 'Bird', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (1, 'Snake', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (1, 'None', 0)
;

insert into surveyResult (id,surveyOption,voteCount) values (2, 'Apple', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (2, 'Orange', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (2, 'Banana', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (2, 'Cherry', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (2, 'Peach', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (2, 'Grape', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (2, 'Watermelon', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (2, 'None', 0)
;

insert into surveyResult (id,surveyOption,voteCount) values (3, 'Ski', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (3, 'Swim', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (3, 'Snowboard', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (3, 'Tennis', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (3, 'Hockey', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (3, 'Soccer', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (3, 'Baseball', 0)
;
insert into surveyResult (id,surveyOption,voteCount) values (3, 'None', 0)
;