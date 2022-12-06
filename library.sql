/*
 Navicat MySQL Data Transfer

 Source Server         : localhost-mysql5
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : library

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 27/06/2021 22:10:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `user_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('12345678', '12345678');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1112 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (2, '荒野求生指南', '帮助你在野外生存，如果有这情况的话');
INSERT INTO `book` VALUES (1, '我的奋斗', '小胡子自转');
INSERT INTO `book` VALUES (3, '国家保护动物名录', '记得别吃锦绣龙虾');
INSERT INTO `book` VALUES (4, '他改变了中国', '学习好知识');

SET FOREIGN_KEY_CHECKS = 1;
