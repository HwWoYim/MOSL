CREATE TABLE MEMBER(
	MID VARCHAR(50) PRIMARY KEY,
	MPW VARCHAR(50) NOT NULL,
	MNAME VARCHAR(20) NOT NULL,
	MBITRH VARCHAR(50) NOT NULL,
	MEMAIL VARCHAR(50) NOT NULL,
	MPHONE VARCHAR(20) NOT NULL,
	MADD VARCHAR(50) NOT NULL,
	MROLE VARCHAR(20) NOT NULL
);
DROP TABLE MEMBER;
SELECT * FROM MEMBER;