SELECT * FROM BOARD;

DROP TABLE BOARD;

CREATE TABLE BOARD(
	BNUM INT PRIMARY KEY AUTO_INCREMENT,
	BTITLE VARCHAR(50) NOT NULL,
	BCONTENT VARCHAR(400) NOT NULL,
	BWRITER VARCHAR(50) NOT NULL,
	BDATE VARCHAR(20) NOT NULL,
	CNT INT DEFAULT 0,
	GCNT INT DEFAULT 0,
	BCNT INT DEFAULT 0
);

INSERT INTO BOARD VALUES(1, '안녕1', '내용1', '글쓴이1', '2023.01.02', 0, 0, 0);
INSERT INTO BOARD VALUES(2, '안녕2', '내용2', '글쓴이2', '2023.01.02', 0, 0, 0);
INSERT INTO BOARD VALUES(3, '안녕3', '내용3', '글쓴이3', '2023.01.02', 0, 0, 0);
INSERT INTO BOARD VALUES(4, '안녕4', '내용4', '글쓴이4', '2023.01.02', 0, 0, 0);
INSERT INTO BOARD VALUES(5, '안녕5', '내용5', '글쓴이5', '2023.01.02', 0, 0, 0);