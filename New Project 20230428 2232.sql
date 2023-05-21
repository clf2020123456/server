-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.40-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema fox_car
--

CREATE DATABASE IF NOT EXISTS fox_car;
USE fox_car;

--
-- Definition of table `t_admin`
--

DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_admin`
--

/*!40000 ALTER TABLE `t_admin` DISABLE KEYS */;
INSERT INTO `t_admin` (`id`,`username`,`password`) VALUES 
 (1,'admin','admin');
/*!40000 ALTER TABLE `t_admin` ENABLE KEYS */;


--
-- Definition of table `t_biotech`
--

DROP TABLE IF EXISTS `t_biotech`;
CREATE TABLE `t_biotech` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `author` varchar(45) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `image_url` varchar(45) DEFAULT NULL,
  `pubdate` varchar(45) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `status` int(10) unsigned DEFAULT NULL,
  `zan` int(10) unsigned DEFAULT NULL,
  `add_userid` int(10) unsigned DEFAULT '0',
  `get_userid` int(10) unsigned DEFAULT '0',
  `type2` varchar(200) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `longitude` varchar(45) DEFAULT NULL,
  `latitude` varchar(45) DEFAULT NULL,
  `ck_phone` varchar(45) DEFAULT NULL,
  `status2` int(10) unsigned DEFAULT '0',
  `order_no` varchar(45) DEFAULT NULL,
  `receiver` varchar(45) DEFAULT NULL,
  `sender` varchar(45) DEFAULT NULL,
  `from_address` varchar(45) DEFAULT NULL,
  `to_address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_biotech`
--

/*!40000 ALTER TABLE `t_biotech` DISABLE KEYS */;
INSERT INTO `t_biotech` (`id`,`author`,`content`,`image_url`,`pubdate`,`title`,`type`,`status`,`zan`,`add_userid`,`get_userid`,`type2`,`price`,`longitude`,`latitude`,`ck_phone`,`status2`,`order_no`,`receiver`,`sender`,`from_address`,`to_address`) VALUES 
 (1,'admin','寒风扑面，我心想天这么冷干脆打个车吧。早已占点拉客的出租车司机隔了老远招呼着，“后生，打车不？”我紧了紧羽绒服领口，走近一问方知不打表，一口价。我说现在还不到初一呢你们就急着涨价，不合适吧？老司机熟练地点起一支烟，红亮的烟头在沉沉暮霾里明暗变幻，仿佛穿透灵魂的危险信号。','upload\\1180444624.jpeg','2023-02-05 18:04','你支持过年期间出租车涨价吗？','1',1,0,0,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL),
 (2,'admin','租北京牌指标不如买京牌检测车，任何人都可以买的车，最近销量走高，京牌车的需求量也是越来越大。北京BJ40,大通G10,广汽传祺GS8,金杯，金龙，福田蒙派克，东风风行菱智M5,江淮瑞风M4等车型，2022年底火爆热销中......带京牌， 不用摇号，不用指标，不限行，可过户个人名下，对名下无登记车辆的购买后仍可参与摇号。 车号牌以京Q为主，并无特殊号段的困扰。13522570882（同微信）','upload\\1180546343.jpg','2023-02-05 18:04','北京京牌出租带京牌检测车是怎么回事？','1',4,0,0,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL),
 (3,'admin','为了确保市民乘坐出租车、网约车时的健康安全，2022年2月2日，西安市出租汽车行业发出通知，要求全体在岗出租车和网约车驾驶员主动接受乘客监督，严格落实隔天一次核酸检测、全程佩戴口罩、定期消毒消杀等疫情防控措施。乘客可要求驾驶员出示自己的核酸检测结果，驾驶员必须配合。','upload\\1180618049.png','2023-02-05 18:04','西安市出租汽车行业最新通知','1',1,0,0,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `t_biotech` ENABLE KEYS */;


--
-- Definition of table `t_comments`
--

DROP TABLE IF EXISTS `t_comments`;
CREATE TABLE `t_comments` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `cdate` varchar(45) DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  `luxianid` int(10) unsigned DEFAULT NULL,
  `userid` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_comments`
--

/*!40000 ALTER TABLE `t_comments` DISABLE KEYS */;
INSERT INTO `t_comments` (`id`,`username`,`cdate`,`content`,`luxianid`,`userid`) VALUES 
 (1,'cunche','2023-04-28 19:17','123',2,7),
 (2,'gaoqiqiang','2023-04-28 22:28','123',1,8);
/*!40000 ALTER TABLE `t_comments` ENABLE KEYS */;


--
-- Definition of table `t_cunche`
--

DROP TABLE IF EXISTS `t_cunche`;
CREATE TABLE `t_cunche` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userid` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `cunche_start_date` varchar(45) DEFAULT NULL,
  `cunche_end_date` varchar(45) DEFAULT NULL,
  `status` int(10) unsigned DEFAULT NULL,
  `money` float DEFAULT '0',
  `image_url` varchar(1000) DEFAULT NULL,
  `car_no` varchar(45) DEFAULT NULL,
  `days` int(10) unsigned DEFAULT NULL,
  `money2` float DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_cunche`
--

/*!40000 ALTER TABLE `t_cunche` DISABLE KEYS */;
INSERT INTO `t_cunche` (`id`,`userid`,`username`,`cunche_start_date`,`cunche_end_date`,`status`,`money`,`image_url`,`car_no`,`days`,`money2`) VALUES 
 (1,'1','zhangsan','2023-02-02 16:55:00','2023-02-09 16:55:00',3,70,'upload\\1165547058.jpg','粤A8888N',7,3000),
 (2,'4','cheshang','2023-02-04 18:14:00','2023-02-10 18:14:00',3,60,'upload\\1181437088.jpg','粤A00020',6,800),
 (4,'3','wangwu','2023-03-21 07:17:00','2023-03-24 07:17:00',3,30,'upload\\1071814029.jpg','鲁M29929',3,0),
 (5,'3','wangwu','2023-03-21 07:20:00','2023-03-23 07:20:00',3,20,'upload\\1072033163.jpg','鲁M1234',2,0),
 (6,'3','wangwu','2023-04-02 19:30:00','2023-04-09 19:30:00',3,70,'upload\\1193108529.jpg','鲁VM0010',7,0),
 (7,'3','wangwu','2023-04-02 19:31:00','2023-04-19 19:31:00',3,170,'upload\\1193153502.jpg','鲁JG0010',17,0),
 (8,'3','wangwu','2023-04-02 20:33:00','2023-04-30 20:33:00',3,280,'upload\\1203406805.jpg','鲁M1911N',28,0),
 (9,'7','cunche','2023-04-28 19:30:00','2023-05-05 19:31:00',3,70,'upload\\1193225720.jpg','粤Q00110',7,1000),
 (10,'8','gaoqiqiang','2023-04-28 22:28:00','2023-05-20 22:28:00',3,220,'upload\\1222824808.jpg','辽B1234',22,2600);
/*!40000 ALTER TABLE `t_cunche` ENABLE KEYS */;


--
-- Definition of table `t_folder`
--

DROP TABLE IF EXISTS `t_folder`;
CREATE TABLE `t_folder` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `duanziid` int(10) unsigned DEFAULT NULL,
  `userid` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_folder`
--

/*!40000 ALTER TABLE `t_folder` DISABLE KEYS */;
INSERT INTO `t_folder` (`id`,`duanziid`,`userid`) VALUES 
 (2,1,8);
/*!40000 ALTER TABLE `t_folder` ENABLE KEYS */;


--
-- Definition of table `t_guanzhu`
--

DROP TABLE IF EXISTS `t_guanzhu`;
CREATE TABLE `t_guanzhu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `luxian_id` int(10) unsigned DEFAULT NULL,
  `user_id` int(10) unsigned DEFAULT NULL,
  `guanzhu_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_guanzhu`
--

/*!40000 ALTER TABLE `t_guanzhu` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_guanzhu` ENABLE KEYS */;


--
-- Definition of table `t_message`
--

DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `commitdate` datetime DEFAULT NULL,
  `content` varchar(250) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `touserid` int(10) unsigned DEFAULT NULL,
  `userid` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_message`
--

/*!40000 ALTER TABLE `t_message` DISABLE KEYS */;
INSERT INTO `t_message` (`id`,`commitdate`,`content`,`username`,`touserid`,`userid`) VALUES 
 (1,'2023-04-28 21:28:58','hello','zuche',0,6),
 (2,'2023-04-28 22:30:54','ok','gaoqiqiang',0,8);
/*!40000 ALTER TABLE `t_message` ENABLE KEYS */;


--
-- Definition of table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `qqnum` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `zan` int(10) unsigned DEFAULT '0',
  `zan_` int(10) unsigned DEFAULT '0',
  `money` float DEFAULT '0',
  `status` int(10) unsigned DEFAULT '0',
  `car_status` int(10) unsigned DEFAULT '0',
  `image_url` varchar(45) DEFAULT NULL,
  `idenno` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_user`
--

/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` (`id`,`username`,`password`,`qqnum`,`phone`,`name`,`address`,`zan`,`zan_`,`money`,`status`,`car_status`,`image_url`,`idenno`) VALUES 
 (1,'zhangsan','111111','NS0001','13325240001','张三','东平路',0,0,16000,1,0,NULL,NULL),
 (2,'lisi','111111','粤A8888N','13325240002','李四','石海路',0,0,7000,2,22,'upload\\1170751307.jpg','202211199912011129'),
 (3,'wangwu','111111','粤A1234N','13325240003','王五','东升路',0,0,10000,0,25,'upload\\1133141038.jpg','203011199901002000'),
 (4,'cheshang','111111','NS0002','13325240004','车商','北京',0,0,10764,1,0,'upload\\1181514170.jpg',NULL),
 (6,'zuche','111111','粤A00001','13325240006','租车人','北京',0,0,8200,2,20,'upload\\1192935391.jpg',NULL),
 (7,'cunche','111111','粤Q00110','13325240007','存车人','北京',0,0,10960,0,20,'upload\\1190633465.jpg','320022010020002000'),
 (8,'gaoqiqiang','111111','辽B1234','13399992999','高启强','大连市',0,0,12458,0,30,'upload\\1222755545.jpeg','300299929991999'),
 (9,'gaoqisheng','111111','辽B','13399991234','高启盛','京海市',0,0,7400,2,7,'upload\\1222933669.jpg','4000100010000000');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;


--
-- Definition of table `t_zuche`
--

DROP TABLE IF EXISTS `t_zuche`;
CREATE TABLE `t_zuche` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userid` int(10) unsigned DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `zuche_start_date` datetime DEFAULT NULL,
  `zuche_end_date` datetime DEFAULT NULL,
  `status` int(10) unsigned DEFAULT NULL,
  `money` float DEFAULT '0',
  `image_url` varchar(1000) DEFAULT NULL,
  `car_no` varchar(45) DEFAULT NULL,
  `days` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_zuche`
--

/*!40000 ALTER TABLE `t_zuche` DISABLE KEYS */;
INSERT INTO `t_zuche` (`id`,`userid`,`username`,`zuche_start_date`,`zuche_end_date`,`status`,`money`,`image_url`,`car_no`,`days`) VALUES 
 (4,2,'lisi','2023-02-04 17:42:00','2023-02-09 17:42:00',2,1000,'upload\\1165547058.jpg','粤A8888N',5),
 (7,2,'lisi','2023-03-21 07:18:00','2023-03-23 07:18:00',2,400,'upload\\1071814029.jpg','鲁M29929',2),
 (8,2,'lisi','2023-03-21 07:20:00','2023-03-23 07:20:00',2,400,'upload\\1072033163.jpg','鲁M1234',2),
 (9,2,'lisi','2023-04-03 19:32:00','2023-04-07 19:32:00',2,800,'upload\\1193108529.jpg','鲁VM0010',4),
 (10,2,'lisi','2023-04-02 19:32:00','2023-04-11 19:32:00',2,1800,'upload\\1193153502.jpg','鲁JG0010',9),
 (11,2,'lisi','2023-04-04 20:34:00','2023-04-29 20:34:00',1,5000,'upload\\1203406805.jpg','鲁M1911N',25),
 (12,6,'zuche','2023-04-28 19:45:00','2023-05-03 19:45:00',2,1000,'upload\\1193225720.jpg','粤Q00110',5),
 (13,9,'gaoqisheng','2023-04-28 22:28:00','2023-05-11 22:29:00',2,2600,'upload\\1222824808.jpg','辽B1234',13);
/*!40000 ALTER TABLE `t_zuche` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
