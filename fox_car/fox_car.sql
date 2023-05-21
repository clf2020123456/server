/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : localhost:3306
 Source Schema         : fox_car

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 20/05/2023 19:46:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES (1, 'admin', 'admin');

-- ----------------------------
-- Table structure for t_biotech
-- ----------------------------
DROP TABLE IF EXISTS `t_biotech`;
CREATE TABLE `t_biotech`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `author` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `image_url` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pubdate` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(10) UNSIGNED NULL DEFAULT NULL,
  `zan` int(10) UNSIGNED NULL DEFAULT NULL,
  `add_userid` int(10) UNSIGNED NULL DEFAULT 0,
  `get_userid` int(10) UNSIGNED NULL DEFAULT 0,
  `type2` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `longitude` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `latitude` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ck_phone` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status2` int(10) UNSIGNED NULL DEFAULT 0,
  `order_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `receiver` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sender` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `from_address` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `to_address` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_biotech
-- ----------------------------
INSERT INTO `t_biotech` VALUES (1, 'admin', '寒风扑面，我心想天这么冷干脆打个车吧。早已占点拉客的出租车司机隔了老远招呼着，“后生，打车不？”我紧了紧羽绒服领口，走近一问方知不打表，一口价。我说现在还不到初一呢你们就急着涨价，不合适吧？老司机熟练地点起一支烟，红亮的烟头在沉沉暮霾里明暗变幻，仿佛穿透灵魂的危险信号。', 'upload\\1180444624.jpeg', '2023-02-05 18:04', '你支持过年期间出租车涨价吗？', '1', 1, 0, 0, 0, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_biotech` VALUES (2, 'admin', '租北京牌指标不如买京牌检测车，任何人都可以买的车，最近销量走高，京牌车的需求量也是越来越大。北京BJ40,大通G10,广汽传祺GS8,金杯，金龙，福田蒙派克，东风风行菱智M5,江淮瑞风M4等车型，2022年底火爆热销中......带京牌， 不用摇号，不用指标，不限行，可过户个人名下，对名下无登记车辆的购买后仍可参与摇号。 车号牌以京Q为主，并无特殊号段的困扰。13522570882（同微信）', 'upload\\1180546343.jpg', '2023-02-05 18:04', '北京京牌出租带京牌检测车是怎么回事？', '1', 4, 0, 0, 0, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_biotech` VALUES (3, 'admin', '为了确保市民乘坐出租车、网约车时的健康安全，2022年2月2日，西安市出租汽车行业发出通知，要求全体在岗出租车和网约车驾驶员主动接受乘客监督，严格落实隔天一次核酸检测、全程佩戴口罩、定期消毒消杀等疫情防控措施。乘客可要求驾驶员出示自己的核酸检测结果，驾驶员必须配合。', 'upload\\1180618049.png', '2023-02-05 18:04', '西安市出租汽车行业最新通知', '1', 1, 0, 0, 0, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_car_type
-- ----------------------------
DROP TABLE IF EXISTS `t_car_type`;
CREATE TABLE `t_car_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `pinpai` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `daxiao` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_car_type
-- ----------------------------
INSERT INTO `t_car_type` VALUES (3, '油车', '宝马', '紧凑型车');
INSERT INTO `t_car_type` VALUES (4, '新能源', '比亚迪', '大型车');
INSERT INTO `t_car_type` VALUES (5, '油车', '萨达撒', '紧凑型车');

-- ----------------------------
-- Table structure for t_comments
-- ----------------------------
DROP TABLE IF EXISTS `t_comments`;
CREATE TABLE `t_comments`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cdate` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `luxianid` int(10) UNSIGNED NULL DEFAULT NULL,
  `userid` int(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_comments
-- ----------------------------
INSERT INTO `t_comments` VALUES (1, 'cunche', '2023-04-28 19:17', '123', 2, 7);
INSERT INTO `t_comments` VALUES (2, 'gaoqiqiang', '2023-04-28 22:28', '123', 1, 8);

-- ----------------------------
-- Table structure for t_cunche
-- ----------------------------
DROP TABLE IF EXISTS `t_cunche`;
CREATE TABLE `t_cunche`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `userid` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cunche_start_date` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cunche_end_date` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(10) UNSIGNED NULL DEFAULT NULL,
  `money` float NULL DEFAULT 0,
  `image_url` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `car_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `car_pinpai` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `days` int(10) UNSIGNED NULL DEFAULT NULL,
  `money2` float NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_cunche
-- ----------------------------
INSERT INTO `t_cunche` VALUES (1, '1', 'zhangsan', '2023-05-20 16:55:00', '2023-07-09 16:55:00', 1, 70, 'upload\\1165547058.jpg', '粤A8888N', '宝马', 7, 3000);
INSERT INTO `t_cunche` VALUES (2, '4', 'cheshang', '2023-05-20 18:14:00', '2023-02-10 18:14:00', 3, 60, 'upload\\1181437088.jpg', '粤A00020', '宝马', 6, 800);
INSERT INTO `t_cunche` VALUES (4, '3', 'wangwu', '2023-03-21 07:17:00', '2023-03-24 07:17:00', 3, 30, 'upload\\1071814029.jpg', '鲁M29929', NULL, 3, 0);
INSERT INTO `t_cunche` VALUES (5, '3', 'wangwu', '2023-03-21 07:20:00', '2023-03-23 07:20:00', 3, 20, 'upload\\1072033163.jpg', '鲁M1234', NULL, 2, 0);
INSERT INTO `t_cunche` VALUES (6, '3', 'wangwu', '2023-04-02 19:30:00', '2023-04-09 19:30:00', 3, 70, 'upload\\1193108529.jpg', '鲁VM0010', NULL, 7, 0);
INSERT INTO `t_cunche` VALUES (7, '3', 'wangwu', '2023-05-20 19:31:00', '2023-04-19 19:31:00', 3, 170, 'upload\\1193153502.jpg', '鲁JG0010', '比亚迪', 17, 0);
INSERT INTO `t_cunche` VALUES (8, '3', 'wangwu', '2023-04-02 20:33:00', '2023-04-30 20:33:00', 3, 280, 'upload\\1203406805.jpg', '鲁M1911N', NULL, 28, 0);
INSERT INTO `t_cunche` VALUES (9, '7', 'cunche', '2023-04-28 19:30:00', '2023-05-05 19:31:00', 3, 70, 'upload\\1193225720.jpg', '粤Q00110', NULL, 7, 1000);
INSERT INTO `t_cunche` VALUES (10, '8', 'gaoqiqiang', '2023-05-20 22:28:00', '2023-05-20 22:28:00', 0, 220, 'upload\\1222824808.jpg', '辽B1234', '比亚迪', 22, 2600);

-- ----------------------------
-- Table structure for t_day_analysis
-- ----------------------------
DROP TABLE IF EXISTS `t_day_analysis`;
CREATE TABLE `t_day_analysis`  (
  `date` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '时间',
  `man_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '男客户人数',
  `woman_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '女客户人数',
  `car_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '车辆能源类型',
  `car_daxiao` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '车辆类型',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类型：存车、租车'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_day_analysis
-- ----------------------------
INSERT INTO `t_day_analysis` VALUES ('最近一天租车', '李四-粤A8888N', '高启盛-辽B1234', '新能源1辆-油车1辆', '小型车0辆-紧凑型车0辆-中型车0辆-大型车0辆', '租车');
INSERT INTO `t_day_analysis` VALUES ('最近一天存车', '张三-粤A8888N、车商-粤A00020、王五-鲁JG0010', '高启强-辽B1234', '新能源2辆-油车2辆', '小型车0辆-紧凑型车2辆-中型车0辆-大型车2辆', '存车');

-- ----------------------------
-- Table structure for t_folder
-- ----------------------------
DROP TABLE IF EXISTS `t_folder`;
CREATE TABLE `t_folder`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `duanziid` int(10) UNSIGNED NULL DEFAULT NULL,
  `userid` int(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_folder
-- ----------------------------
INSERT INTO `t_folder` VALUES (2, 1, 8);

-- ----------------------------
-- Table structure for t_guanzhu
-- ----------------------------
DROP TABLE IF EXISTS `t_guanzhu`;
CREATE TABLE `t_guanzhu`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `luxian_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `user_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `guanzhu_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_guanzhu
-- ----------------------------

-- ----------------------------
-- Table structure for t_message
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `commitdate` datetime(0) NULL DEFAULT NULL,
  `content` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `touserid` int(10) UNSIGNED NULL DEFAULT NULL,
  `userid` int(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_message
-- ----------------------------
INSERT INTO `t_message` VALUES (1, '2023-04-28 21:28:58', 'hello', 'zuche', 0, 6);
INSERT INTO `t_message` VALUES (2, '2023-04-28 22:30:54', 'ok', 'gaoqiqiang', 0, 8);
INSERT INTO `t_message` VALUES (3, '2023-05-19 19:52:56', 'dddffff', 'lisi', 0, 2);

-- ----------------------------
-- Table structure for t_month_analysis
-- ----------------------------
DROP TABLE IF EXISTS `t_month_analysis`;
CREATE TABLE `t_month_analysis`  (
  `date` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '时间',
  `man_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '男客户人数',
  `woman_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '女客户人数',
  `car_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '车辆能源类型',
  `car_daxiao` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '车辆类型',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类型：存车、租车'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_month_analysis
-- ----------------------------
INSERT INTO `t_month_analysis` VALUES ('最近三十天租车', '李四-粤A8888N、李四-粤A8888N1', '租车人-粤Q00110、高启盛-辽B1234', '新能源1辆-油车1辆', '小型车0辆-紧凑型车0辆-中型车0辆-大型车0辆', '租车');
INSERT INTO `t_month_analysis` VALUES ('最近三十天存车', '张三-粤A8888N、车商-粤A00020、王五-鲁JG0010', '存车人-粤Q00110、高启强-辽B1234', '新能源2辆-油车2辆', '小型车0辆-紧凑型车2辆-中型车0辆-大型车2辆', '存车');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qqnum` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zan` int(10) UNSIGNED NULL DEFAULT 0,
  `zan_` int(10) UNSIGNED NULL DEFAULT 0,
  `money` float NULL DEFAULT 0,
  `status` int(10) UNSIGNED NULL DEFAULT 0,
  `car_status` int(10) UNSIGNED NULL DEFAULT 0,
  `image_url` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `idenno` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `car_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'zhangsan', '111111', 'NS0001', '13325240001', '张三', '东平路', 0, 0, 16000, 1, 0, NULL, NULL, '大众', '男');
INSERT INTO `t_user` VALUES (2, 'lisi', '111111', '粤A8888N', '13325240002', '李四', '石海路', 0, 0, 8111, 2, 22, 'upload\\1170751307.jpg', '202211199912011129', '宝马', '男');
INSERT INTO `t_user` VALUES (3, 'wangwu', '111111', '粤A1234N', '13325240003', '王五', '东升路', 0, 0, 10000, 0, 25, 'upload\\1133141038.jpg', '203011199901002000', '奔驰', '男');
INSERT INTO `t_user` VALUES (4, 'cheshang', '111111', 'NS0002', '13325240004', '车商', '北京', 0, 0, 10764, 1, 0, 'upload\\1181514170.jpg', NULL, '路虎', '男');
INSERT INTO `t_user` VALUES (6, 'zuche', '111111', '粤A00001', '13325240006', '租车人', '北京', 0, 0, 8200, 2, 20, 'upload\\1192935391.jpg', NULL, '红旗', '女');
INSERT INTO `t_user` VALUES (7, 'cunche', '111111', '粤Q00110', '13325240007', '存车人', '北京', 0, 0, 10960, 0, 20, 'upload\\1190633465.jpg', '320022010020002000', '领克', '女');
INSERT INTO `t_user` VALUES (8, 'gaoqiqiang', '111111', '辽B1234', '13399992999', '高启强', '大连市', 0, 0, 12458, 0, 30, 'upload\\1222755545.jpeg', '300299929991999', '本田', '女');
INSERT INTO `t_user` VALUES (9, 'gaoqisheng', '111111', '辽B', '13399991234', '高启盛', '京海市', 0, 0, 7400, 2, 7, 'upload\\1222933669.jpg', '4000100010000000', '本田', '女');
INSERT INTO `t_user` VALUES (10, '1', '111111', 'Syyttt', '15662558852', 'ee. ffddd', 'ddddd', 0, 0, 0, 2, 4, NULL, 'esss', NULL, NULL);
INSERT INTO `t_user` VALUES (11, 's', '111111', 'ee', '15698725625', 'rrr', 'rrr', 0, 0, 0, 2, 1, NULL, 'eedd', NULL, NULL);
INSERT INTO `t_user` VALUES (12, 'ddd', '111', 'ss', '15557586931', 'ww', 'ww', 0, 0, 0, 2, 4, NULL, 'wwss', NULL, NULL);
INSERT INTO `t_user` VALUES (13, 'ddd', '111', 'ss', '15557586931', 'ww', 'ww', 0, 0, 0, 2, 4, NULL, 'wwss', NULL, NULL);
INSERT INTO `t_user` VALUES (14, 'rrr', '2', 'ddd', '14569547895user.sex=男', 'rrrr', 'gggg', 0, 0, 0, 2, 5, NULL, 'ee', NULL, NULL);
INSERT INTO `t_user` VALUES (15, 'e', '1', 'e', '14596525569', 'r', 'r', 0, 0, 0, 2, 2, NULL, 'r', NULL, '男');
INSERT INTO `t_user` VALUES (16, 'rttt', '1', '11', '15245698523', '1', '1', 0, 0, 0, 2, 1, NULL, '11', NULL, '男');

-- ----------------------------
-- Table structure for t_week_analysis
-- ----------------------------
DROP TABLE IF EXISTS `t_week_analysis`;
CREATE TABLE `t_week_analysis`  (
  `date` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '时间',
  `man_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '男客户人数',
  `woman_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '女客户人数',
  `car_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '车辆能源类型',
  `car_daxiao` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '车辆类型',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类型：存车、租车'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_week_analysis
-- ----------------------------
INSERT INTO `t_week_analysis` VALUES ('最近七天租车', '李四-粤A8888N、李四-粤A8888N1', '高启盛-辽B1234', '新能源1辆-油车1辆', '小型车0辆-紧凑型车0辆-中型车0辆-大型车0辆', '租车');
INSERT INTO `t_week_analysis` VALUES ('最近七天存车', '张三-粤A8888N、车商-粤A00020、王五-鲁JG0010', '高启强-辽B1234', '新能源2辆-油车2辆', '小型车0辆-紧凑型车2辆-中型车0辆-大型车2辆', '存车');

-- ----------------------------
-- Table structure for t_zuche
-- ----------------------------
DROP TABLE IF EXISTS `t_zuche`;
CREATE TABLE `t_zuche`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `userid` int(10) UNSIGNED NULL DEFAULT NULL,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zuche_start_date` datetime(0) NULL DEFAULT NULL,
  `zuche_end_date` datetime(0) NULL DEFAULT NULL,
  `status` int(10) UNSIGNED NULL DEFAULT NULL,
  `money` float NULL DEFAULT 0,
  `image_url` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `car_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `car_pinpai` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌',
  `days` int(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_zuche
-- ----------------------------
INSERT INTO `t_zuche` VALUES (4, 2, 'lisi', '2023-05-20 17:42:05', '2023-05-28 17:42:00', 2, 1000, 'upload\\1165547058.jpg', '粤A8888N', '宝马', 5);
INSERT INTO `t_zuche` VALUES (7, 2, 'lisi', '2023-05-21 07:18:00', '2023-03-23 07:18:00', 2, 400, 'upload\\1071814029.jpg', '鲁M29929', '宝马', 2);
INSERT INTO `t_zuche` VALUES (8, 2, 'lisi', '2023-03-21 07:20:00', '2023-03-23 07:20:00', 2, 400, 'upload\\1072033163.jpg', '鲁M1234', '宝马', 2);
INSERT INTO `t_zuche` VALUES (9, 2, 'lisi', '2023-04-03 19:32:00', '2023-04-07 19:32:00', 2, 800, 'upload\\1193108529.jpg', '鲁VM0010', '宝马', 4);
INSERT INTO `t_zuche` VALUES (10, 2, 'lisi', '2023-04-02 19:32:00', '2023-04-11 19:32:00', 2, 1800, 'upload\\1193153502.jpg', '鲁JG0010', '宝马', 9);
INSERT INTO `t_zuche` VALUES (11, 2, 'lisi', '2023-04-04 20:34:00', '2023-04-29 20:34:00', 2, 5000, 'upload\\1203406805.jpg', '鲁M1911N', '奔驰', 25);
INSERT INTO `t_zuche` VALUES (12, 6, 'zuche', '2023-04-28 19:45:00', '2023-05-03 19:45:00', 2, 1000, 'upload\\1193225720.jpg', '粤Q00110', '奔驰', 5);
INSERT INTO `t_zuche` VALUES (13, 9, 'gaoqisheng', '2023-05-20 22:28:00', '2023-05-11 22:29:00', 2, 2600, 'upload\\1222824808.jpg', '辽B1234', '比亚迪', 13);
INSERT INTO `t_zuche` VALUES (14, 2, 'lisi', '2023-05-19 11:10:00', '2023-05-19 11:11:00', 2, 0, 'upload\\1165547058.jpg', '粤A8888N1', '奔驰', 0);
INSERT INTO `t_zuche` VALUES (15, 2, 'lisi', '2023-05-21 11:07:00', '2023-05-22 11:07:00', 0, 200, 'upload\\1165547058.jpg', '粤A8888N', NULL, 1);

SET FOREIGN_KEY_CHECKS = 1;
