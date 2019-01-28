/*
Navicat MySQL Data Transfer

Source Server         : 172.17.111.167
Source Server Version : 50505
Source Host           : 172.17.111.167:3306
Source Database       : anycloud

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-01-28 10:48:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `f_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `f_user_name` varchar(64) DEFAULT '',
  `f_age` tinyint(3) unsigned zerofill DEFAULT NULL,
  `f_address` varchar(255) DEFAULT NULL,
  `f_sex` enum('''男''，''女''') DEFAULT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
