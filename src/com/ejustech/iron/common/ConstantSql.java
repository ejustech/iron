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
	
	public static final String T_INRO_INFO_SELECT_NOT_UPDATE_OK = "SELECT COUNT(updateflg) FROM ironinfo WHERE updateflg = '0'";
	
	public static final String T_INRO_INFO_UPDATE_JUNPIN_NOT_INPUT = "UPDATE ironinfo AS junpinT,ironinfo AS notjunpinT SET junpinT.riqi = notjunpinT.riqi,junpinT.qihao = notjunpinT.qihao,junpinT.luci = notjunpinT.luci,junpinT.shengchanluhao = notjunpinT.shengchanluhao,junpinT.fanyingqihao = notjunpinT.fanyingqihao,junpinT.shiyongcishu = notjunpinT.shiyongcishu,junpinT.gongyishiyan = notjunpinT.gongyishiyan,junpinT.zongpaimeiliang = notjunpinT.zongpaimeiliang,junpinT.chuluzhenkongdu = notjunpinT.chuluzhenkongdu,junpinT.huanyuanzuigaowendu = notjunpinT.huanyuanzuigaowendu,junpinT.zhengliugaoheng = notjunpinT.zhengliugaoheng,junpinT.zhuanzhengliu = notjunpinT.zhuanzhengliu,junpinT.jiashouci = notjunpinT.jiashouci,junpinT.jiamoci = notjunpinT.jiamoci,junpinT.tongdao = notjunpinT.tongdao,junpinT.shengchanguzhang = notjunpinT.shengchanguzhang WHERE junpinT.luci = notjunpinT.luci";
}
