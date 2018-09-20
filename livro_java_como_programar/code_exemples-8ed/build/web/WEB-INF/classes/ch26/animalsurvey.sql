CREATE DATABASE IF NOT EXISTS animalsurvey;

USE animalsurvey;

DROP TABLE IF EXISTS surveyresults;

CREATE TABLE surveyresults (
	id INT NOT NULL ,
	surveyoption varchar (20) NOT NULL ,
	votes INT NOT NULL ,
	PRIMARY KEY (id)
) TYPE=INNODB
;

insert into surveyresults (id,surveyoption,votes) values (1, 'Dog', 0)
;
insert into surveyresults (id,surveyoption,votes) values (2, 'Cat', 0)
;
insert into surveyresults (id,surveyoption,votes) values (3, 'Bird', 0)
;
insert into surveyresults (id,surveyoption,votes) values (4, 'Snake', 0)
;
insert into surveyresults (id,surveyoption,votes) values (5, 'None', 0)
;
