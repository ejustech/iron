-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.10 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  8.0.0.4396
-- --------------------------------------------------------
-- 存储过程 test.set_luci_index 结构
DROP PROCEDURE IF EXISTS `set_luci_index`;
DELIMITER //
CREATE DEFINER=`flyzz`@`%` PROCEDURE `set_luci_index`()
    MODIFIES SQL DATA
    COMMENT '导入数据后，进行炉次索引的设置'
BEGIN
-- DECLARE Done INT DEFAULT 0;

DECLARE CurrentID VARCHAR(30);

DECLARE CurrentLuCiIndex INT DEFAULT 0;

DECLARE CurrentLuCi VARCHAR(30);

DECLARE TempLuCi VARCHAR(30);

DECLARE TempLuCiIndex INT DEFAULT 0;

declare stopFlag INT DEFAULT 0;

/* 声明游标 */
DECLARE rs CURSOR FOR SELECT id, luci_index, luci FROM ironinfo order by id;
DECLARE CONTINUE HANDLER FOR NOT FOUND set stopFlag=1;

SET TempLuCi = '';
SET TempLuCiIndex = 0;
/* 打开游标 */
OPEN rs;

/* 逐个取出当前记录字段的值，进行炉次是否相同的判断，相同上次的值，不相同+1 */
FETCH NEXT FROM rs INTO CurrentID, CurrentLuCiIndex, CurrentLuCi;
/* 遍历数据表 */
REPEAT
	IF TempLuCi = CurrentLuCi THEN
		UPDATE ironinfo set luci_index = TempLuCiIndex where id = CurrentID;
	ELSE
		SET TempLuCi = CurrentLuCi;
		SET TempLuCiIndex = TempLuCiIndex + 1;
		UPDATE ironinfo set luci_index = TempLuCiIndex where id = CurrentID;
	END IF;

FETCH NEXT FROM rs INTO CurrentID, CurrentLuCiIndex, CurrentLuCi;
UNTIL stopFlag = 1 END REPEAT;

/* 关闭游标 */
CLOSE rs;
END//
DELIMITER ;