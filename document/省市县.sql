/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-02-07 16:52:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chinaareainfo
-- ----------------------------
DROP TABLE IF EXISTS `chinaareainfo`;
CREATE TABLE `chinaareainfo` (
  `AreaID` varchar(15) NOT NULL,
  `Name` varchar(50) DEFAULT NULL COMMENT '名称',
  `ParentId` varchar(15) DEFAULT NULL COMMENT '父级id',
  `ShortName` varchar(50) DEFAULT NULL COMMENT '简称',
  `LevelType` int(11) DEFAULT NULL COMMENT '层级',
  `CityCode` varchar(50) DEFAULT NULL COMMENT '城市代码',
  `ZipCode` varchar(15) DEFAULT NULL COMMENT '邮编',
  `MergerName` varchar(50) DEFAULT NULL COMMENT '完整地区名称',
  `lng` varchar(20) DEFAULT NULL COMMENT '经度',
  `Lat` varchar(20) DEFAULT NULL COMMENT '纬度',
  `Pinyin` varchar(50) DEFAULT NULL COMMENT '拼音',
  PRIMARY KEY (`AreaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='全国地理位置信息表';
