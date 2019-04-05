CREATE DATABASE gjp;
USE gjp;
CREATE TABLE gjp_zhangwu(
	zwid INT PRIMARY KEY AUTO_INCREMENT,
	flname VARCHAR(200),
	money DOUBLE,
	zhanghu VARCHAR(100),
	createtime DATE,
	description VARCHAR(1000)
);

INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (1,'meal expenditure',247,'jiaotong bank','2016-03-02','home dinner');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (2,'wage income',12345,'cash','2016-03-15','again myincome');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (3,'clothes expenditure',1998,'cash','2016-04-02','buy clothes');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (4,'meal expenditure',325,'cash','2016-06-18','friends dinner');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (5,'market income',8000,'gongshang bank','2016-10-28','market up');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (6,'market income',5000,'gongshang bank','2016-10-28','again market up');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (7,'wage income',5000,'jiaotong bank','2016-10-28','again myincome');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (8,'present expenditure',5000,'cash','2016-10-28','friends marry');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (9,'other expenditure',1560,'cash','2016-10-29','lost money');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (10,'traffic expenditure',2300,'jiaotong bank','2016-10-29','oil up');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (11,'meal expenditure',1000,'gongshang bank','2016-10-29','again eat');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (12,'wage income',1000,'cash','2016-10-30','myincome');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (13,'traffic expenditure',2000,'cash','2016-10-30','plane ticket');
INSERT  INTO gjp_zhangwu(zwid,flname,money,zhanghu,createtime,description) VALUES (14,'wage income',5000,'cash','2016-10-30','again myincome');
