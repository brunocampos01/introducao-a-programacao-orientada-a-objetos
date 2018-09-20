CREATE DATABASE IF NOT EXISTS faq
;
USE faq
;

DROP TABLE IF EXISTS faq
;

DROP TABLE IF EXISTS topics
;

create table topics (
	topicID int NOT NULL,
	topicName varchar (20) NOT NULL,
	PRIMARY KEY (topicID)
) TYPE=INNODB
;

create table faq (
	topicID int NOT NULL,
	question varchar (250) NOT NULL,
	answer varchar (250) NOT NULL,
	INDEX (topicID),
	FOREIGN KEY (topicID) REFERENCES topics(topicID)
) TYPE=INNODB
;

insert into Topics (topicID, topicName) values (1, 'Soccer')
;
insert into Topics (topicID, topicName) values (2, 'Baseball')
;
insert into Topics (topicID, topicName) values (3, 'Hockey')
;

insert into FAQ (topicID, question, answer) values (1, 'When was soccer first played?', '1863, although an unpollished earlier version of the game was played by Romans and Greeks two thousand years ago.')
;
insert into FAQ (topicID, question, answer) values (1, 'Where can I go for more information?', 'www.fifa.com')
;
insert into FAQ (topicID, question, answer) values (1, 'Is it true that soccer is the most popular professional sport in the world?', 'Yes, soccer is played professionaly in more than 203 countries.')
;

insert into FAQ (topicID, question, answer) values (2, 'How many games does each team play on average each season in the American and National professional leagues?', '162')
;
insert into FAQ (topicID, question, answer) values (2, 'Where can I go for more information?', 'www.mlb.com')
;
insert into FAQ (topicID, question, answer) values (2, 'Which was the first team in baseball history?', 'New York Knickerbockers Base Ball Club (1845)')
;

insert into FAQ (topicID, question, answer) values (3, 'Where can I go for more information?', 'www.nhl.com')
;
insert into FAQ (topicID, question, answer) values (3, 'When was hockey first played?', 'Nobody really knows for certain when hockey was first played. A form of hockey was played in Northern Europe five hundred years ago. It is thought that from this summer sport the ice version of hockey originated.')
;
insert into FAQ (topicID, question, answer) values (3, 'How old is the Stanley Cup?', 'The original Stanley Cup was purchased by Lord Stanley in 1893.')
;
