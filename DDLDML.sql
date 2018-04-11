CREATE TABLE HitTupple (
    id int NOT NULL AUTO_INCREMENT,
    fileName varchar(255),
    hitRatioRun1 varchar(255),
    hitRatioRun2 varchar(255),
    hitRun1 varchar(255),
	hitRun2 varchar(255),
	arrivalTime Date,
	PRIMARY KEY (id)
);

insert into HitTupple values(1,'APRIL_TUES_10.txt','10','20','5','10','2008-7-04');
insert into HitTupple values(2,'APRIL_WED_11.txt','10','20','5','10','2008-7-04');
insert into HitTupple values(3,'APRIL_THU_12.txt','10','20','5','10','2008-7-04');