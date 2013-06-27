-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.10 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  8.0.0.4396
-- --------------------------------------------------------
-- 表 test.ironinfo 结构
DROP TABLE IF EXISTS `ironinfo`;
CREATE TABLE IF NOT EXISTS `ironinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `luci_index` int(11) NOT NULL,
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
  `ticl_query_condition` varchar(20) DEFAULT NULL,
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
  `flag` int(10) DEFAULT NULL,
  `yue` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1793 DEFAULT CHARSET=utf8;

-- 表 test.m_user 结构
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE IF NOT EXISTS `m_user` (
  `userID` varchar(100) NOT NULL DEFAULT '',
  `password` varchar(50) DEFAULT NULL,
  `authority` varchar(50) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 表 test.m_user 的数据
DELETE FROM `m_user`;
INSERT INTO `m_user` (`userID`, `password`, `authority`, `tel`, `email`) VALUES
	('admin', 'admin', '0', '8888', 'admin@jinda.com');