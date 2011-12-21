
DROP TABLE TB_MEMBERSHIP;
DROP TABLE TB_USER;
DROP TABLE TB_GROUP;


CREATE TABLE TB_USER
(
  USER_ID INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
  USER_NAME VARCHAR(50) NOT NULL,
  USER_PASS VARCHAR(50) NOT NULL,
  USER_EMAIL    VARCHAR(200),
  USER_REMARK VARCHAR(200),
  PRIMARY KEY(ID)
);

CREATE TABLE TB_GROUP
(
  GROUP_ID  INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
  GROUP_NAME VARCHAR(200) NOT NULL,
  GROUP_REMARK VARCHAR(400),
  PRIMARY KEY(ID)
);

CREATE TABLE TB_GROUP_LEVEL
(
 HIGHER_GROUP_ID INT NOT NULL,
 LOWER_GROUP_ID INT NOT NULL,
 PRIMARY KEY(LOWER_GROUP_ID,HIGHER_GROUP_ID)
);

CREATE TABLE TB_MEMBERSHIP
(
    USER_ID INT  NOT NULL,
    GROUP_ID INT NOT NULL,
    PRIMARY KEY(USER_ID,GROUP_ID)
);



ALTER TABLE TB_MEMBERSHIP ADD 
	CONSTRAINT FK_USER_GROUP_SHIP FOREIGN KEY(GROUP_ID) REFERENCES TB_USER_GROUP;
ALTER TABLE TB_MEMBERSHIP ADD
	CONSTRAINT FK_USER_SHIP  FOREIGN KEY(USER_ID) REFERENCES TB_USER;
ALTER TABLE TB_USER_GROUP_LEVEL
	CONSTRAINT FK_USER_GROUP_LEVEL  FOREIGN KEY(HIGHER_GROUP_ID) REFERENCES TB_USER_GROUP;
ALTER TABLE TB_USER_GROUP_LEVEL
	CONSTRAINT FK_USER_GROUP_LEVEL  FOREIGN KEY(LOWER_GROUP_ID) REFERENCES TB_USER_GROUP;


