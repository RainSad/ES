/*
Navicat MySQL Data Transfer

Source Server         : jfinal
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : es

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2017-08-14 21:09:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL COMMENT '用户id',
  `user_name` varchar(20) default NULL COMMENT '用户名',
  `pass_word` varchar(20) default NULL COMMENT '用户密码',
  `nick_name` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('37c0c52095164aa4981f4aafd6a83543', 'sunwx2', '123', '木头2');
INSERT INTO `user` VALUES ('37c0c52095164aa4981f4aafd6a8354b', 'sunwx', '123', '木头');
INSERT INTO `user` VALUES ('37c0c52095164aa4981f4aafd6a8354f', 'sunwx4', '123', '木头4');
INSERT INTO `user` VALUES ('37c0c52095164aa4981f4aafd6a8354v', 'sunwx3', '123', '木头3');

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` varchar(32) NOT NULL COMMENT '用户id',
  `nick_name` varchar(20) default NULL COMMENT '昵称',
  `sex` varchar(2) default NULL COMMENT '性别',
  `birthday` varchar(10) default NULL COMMENT '生日',
  `qq` varchar(15) default NULL COMMENT 'QQ',
  `wechat` varchar(20) default NULL COMMENT '微信',
  `weibo` varchar(20) default NULL COMMENT '微博',
  `score` varchar(10) default NULL COMMENT '活跃度',
  `reg_time` varchar(10) default NULL COMMENT '注册时间',
  `status` varchar(2) default NULL COMMENT '用户状态',
  `discription` varchar(1000) default NULL COMMENT '个人描述',
  `reg_ip` varchar(15) default NULL,
  `user_name` varchar(20) default NULL COMMENT '用户名',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('37c0c52095164aa4981f4aafd6a8354b', '木头', '男', '1994-03-22', '979362142', '979362142', '15629121821', '100', '2017-8-13', '1', '22222222222222222', null, 'sunwx');

-- ----------------------------
-- Table structure for `user_log`
-- ----------------------------
DROP TABLE IF EXISTS `user_log`;
CREATE TABLE `user_log` (
  `id` varchar(32) NOT NULL,
  `user_id` varchar(32) default NULL,
  `login_time` varchar(19) default NULL,
  `login_ip` varchar(15) default NULL,
  `login_addr` varchar(20) default NULL,
  `end_time` varchar(19) default NULL,
  `browser` varchar(50) default NULL COMMENT '登陆浏览器类型，包括版本型号',
  `os` varchar(30) default NULL COMMENT '登陆的平台，比如windows或者mac',
  `user_name` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_log
-- ----------------------------
INSERT INTO `user_log` VALUES ('0a7baf46e2ec4d4e878773026ca887ce', null, '2017-08-13 23:39:13', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('201c6756a6e94362ab5015b768b5eb54', null, '2017-08-13 23:30:57', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('5ca2ca0a652941bc873b13936236a071', null, '2017-08-13 23:21:29', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('7e5ac0516d104303922bf24fd672955e', null, '2017-08-13', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('c533d2dec20a4477810727e8291d7dcd', null, '2017-08-13 23:27:39', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('cab4bd2ebd4541219bd0f5bb507b78b5', null, '2017-08-13 23:35:59', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('cc4d2b1c44ca4d0eb775244910a4c503', null, '2017-08-13 23:37:54', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('d572a8cc846344258d45158559f3da50', null, '2017-08-13 23:24:16', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('e2d9999ee55242928aacacb777abfd97', null, '2017-08-13 23:21:55', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('e3398a2b83eb4b18b3c7fa15b0c778e0', null, '2017-08-13 23:33:06', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('e6fa7a20fa2c499e9fe7bc5b349576ab', null, '2017-08-13 23:22:53', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('ea3fc6fa33d543ac9d1c9dd40958e6ce', null, '2017-08-13 23:23:35', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('f8cc363e742d4003b648e449e31099b9', null, '2017-08-13 23:34:20', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);
INSERT INTO `user_log` VALUES ('fabb7686b37d4c80a0741293888b3d41', null, '2017-08-13 23:21:02', '119.79.149.180', '湖北省武汉市 长城宽带', null, 'Google Chrome 60.0.3112.90', 'Windows NT', null);

-- ----------------------------
-- Table structure for `user_operation`
-- ----------------------------
DROP TABLE IF EXISTS `user_operation`;
CREATE TABLE `user_operation` (
  `id` varchar(32) NOT NULL default '',
  `controller_method` varchar(20) default NULL,
  `click_time` varchar(10) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_operation
-- ----------------------------
