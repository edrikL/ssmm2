

CREATE TABLE TB_USER
(
  ID INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
  NAME VARCHAR(50) NOT NULL,
  PASSWORD VARCHAR(50) NOT NULL,
  REMARK VARCHAR(200),
  PRIMARY KEY(ID)
);

CREATE TABLE TB_USER_GROUP
(
  ID  INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
  NAME VARCHAR(200) NOT NULL,
  REMARK VARCHAR(400),
  PRIMARY KEY(ID)
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

