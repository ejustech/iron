-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.10 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL version:             7.0.0.4053
-- Date/time:                    2013-04-28 15:05:03
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

-- Dumping database structure for test
DROP DATABASE IF EXISTS `test`;
CREATE DATABASE IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `test`;


-- Dumping structure for table test.ironinfo
DROP TABLE IF EXISTS `ironinfo`;
CREATE TABLE IF NOT EXISTS `ironinfo` (
  `riqi` date DEFAULT '0000-00-00',
  `qihao` varchar(2) DEFAULT NULL,
  `luci` varchar(20) NOT NULL,
  `junpin` varchar(10) DEFAULT NULL,
  `guige` varchar(20) NOT NULL,
  `shengchanluhao` varchar(20) DEFAULT NULL,
  `fanyingqihao` varchar(20) DEFAULT NULL,
  `shiyongcishu` varchar(20) DEFAULT NULL,
  `mg` varchar(20) DEFAULT NULL,
  `ticl` varchar(20) DEFAULT NULL,
  `maozhong` varchar(20) DEFAULT NULL,
  `jingzhong` varchar(20) DEFAULT NULL,
  `chengpinlv` varchar(500) DEFAULT NULL,
  `fe` varchar(20) DEFAULT NULL,
  `si` varchar(20) DEFAULT NULL,
  `cl` varchar(20) DEFAULT NULL,
  `c` varchar(20) DEFAULT NULL,
  `n` varchar(20) DEFAULT NULL,
  `o` varchar(20) DEFAULT NULL,
  `h` varchar(20) DEFAULT NULL,
  `mn` varchar(20) DEFAULT NULL,
  `hb` varchar(20) DEFAULT NULL,
  `dengji_hanmeng` varchar(20) DEFAULT NULL,
  `kaohedengji_chumeng` varchar(20) DEFAULT NULL,
  `gongyitiaozheng` varchar(20) DEFAULT NULL,
  `gongyishiyan` varchar(20) DEFAULT NULL,
  `dipi` varchar(20) DEFAULT NULL,
  `shangmao` varchar(20) DEFAULT NULL,
  `pabi` varchar(20) DEFAULT NULL,
  `feidipi` varchar(20) DEFAULT NULL,
  `feishangmao` varchar(20) DEFAULT NULL,
  `feipabi` varchar(20) DEFAULT NULL,
  `feitaifen` varchar(20) DEFAULT NULL,
  `cixuan` varchar(20) DEFAULT NULL,
  `shouxuanfeiliao` varchar(20) DEFAULT NULL,
  `sunhao` varchar(20) DEFAULT NULL,
  `zongpaimeiliang` varchar(20) DEFAULT NULL,
  `chuluzhenkongdu` varchar(20) DEFAULT NULL,
  `huanyuanzuigaowendu` varchar(20) DEFAULT NULL,
  `zhengliugaoheng` varchar(20) DEFAULT NULL,
  `zhuanzhengliu` varchar(20) DEFAULT NULL,
  `jiashouci` varchar(20) DEFAULT NULL,
  `jiamoci` varchar(20) DEFAULT NULL,
  `tongdao` varchar(20) DEFAULT NULL,
  `shengchanguzhang` varchar(20) DEFAULT NULL,
  `beizhushuoming` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`luci`,`guige`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table test.ironinfo: ~0 rows (approximately)
DELETE FROM `ironinfo`;
/*!40000 ALTER TABLE `ironinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `ironinfo` ENABLE KEYS */;
/*!40014 SET FOREIGN_KEY_CHECKS=1 */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
