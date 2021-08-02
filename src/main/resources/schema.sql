CREATE TABLE COURSE (
	COURSE_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	NAME VARCHAR(16) NOT NULL,
	HOURS INT NOT NULL
);

CREATE TABLE STUDENT(
	STUDENT_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	FIRST_NAME VARCHAR(50),
	LAST_NAME VARCHAR(50),
	EMAIL_ADDRESS VARCHAR(50),
	PHONE_NUMBER VARCHAR(50)
);

CREATE TABLE ENROLLMENT(
  ENROLLMENT_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  COURSE_ID BIGINT NOT NULL,
  STUDENT_ID BIGINT NOT NULL,
  GRADE CHAR(2) NOT NULL
);

ALTER TABLE ENROLLMENT ADD FOREIGN KEY (COURSE_ID) REFERENCES COURSE(COURSE_ID);
ALTER TABLE ENROLLMENT ADD FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(STUDENT_ID);
CREATE INDEX IDX_COURSE_ID_GRADE ON ENROLLMENT(COURSE_ID,GRADE);