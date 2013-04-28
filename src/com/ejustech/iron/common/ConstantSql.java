package com.ejustech.iron.common;

/***
 * SQL常量
 * 
 */
public class ConstantSql {
	/***
	 * 根据用户名，在M_User表中检索，查看该用户是否存在的SQL
	 */
	public static final String GET_COUNTS_BY_USER_ID = "select count(userID) as userCounts from m_user where userID = ?";

	public static final String T_INRO_INFO_INSERT = "INSERT INTO ironinfo (`riqi`, `qihao`, `luci`, `junpin`, `guige`, `shengchanluhao`, `fanyingqihao`, `shiyongcishu`, `mg`, `ticl`, `maozhong`, `jingzhong`, `chengpinlv`, `fe`, `si`, `cl`, `c`, `n`, `o`, `h`, `mn`, `hb`, `dengji_hanmeng`, `kaohedengji_chumeng`, `gongyitiaozheng`, `gongyishiyan`, `dipi`, `shangmao`, `pabi`, `feidipi`, `feishangmao`, `feipabi`, `feitaifen`, `cixuan`, `shouxuanfeiliao`, `sunhao`, `zongpaimeiliang`, `chuluzhenkongdu`, `huanyuanzuigaowendu`, `zhengliugaoheng`, `zhuanzhengliu`, `jiashouci`, `jiamoci`, `tongdao`, `shengchanguzhang`, `beizhushuoming`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
}
