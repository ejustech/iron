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
	
	public static final String T_INRO_INFO_UPDATE_JUNPIN_NOT_INPUT = "UPDATE ironinfo AS junpinT,ironinfo AS notjunpinT SET junpinT.qihao = notjunpinT.qihao,junpinT.luci = notjunpinT.luci,junpinT.shengchanluhao = notjunpinT.shengchanluhao,junpinT.fanyingqihao = notjunpinT.fanyingqihao,junpinT.shiyongcishu = notjunpinT.shiyongcishu,junpinT.gongyishiyan = notjunpinT.gongyishiyan,junpinT.zongpaimeiliang = notjunpinT.zongpaimeiliang,junpinT.chuluzhenkongdu = notjunpinT.chuluzhenkongdu,junpinT.huanyuanzuigaowendu = notjunpinT.huanyuanzuigaowendu,junpinT.zhengliugaoheng = notjunpinT.zhengliugaoheng,junpinT.zhuanzhengliu = notjunpinT.zhuanzhengliu,junpinT.jiashouci = notjunpinT.jiashouci,junpinT.jiamoci = notjunpinT.jiamoci,junpinT.tongdao = notjunpinT.tongdao,junpinT.chengpinlv = notjunpinT.chengpinlv,junpinT.shengchanguzhang = notjunpinT.shengchanguzhang,junpinT.mg = notjunpinT.mg,junpinT.ticl = notjunpinT.ticl,junpinT.maozhong = notjunpinT.maozhong,junpinT.gongyitiaozheng = notjunpinT.gongyitiaozheng,junpinT.dipi = notjunpinT.dipi,junpinT.shangmao = notjunpinT.shangmao,junpinT.pabi = notjunpinT.pabi,junpinT.feidipi = notjunpinT.feidipi,junpinT.feishangmao = notjunpinT.feishangmao,junpinT.feipabi = notjunpinT.feipabi,junpinT.feitaifen = notjunpinT.feitaifen,junpinT.cixuan = notjunpinT.cixuan,junpinT.shouxuanfeiliao = notjunpinT.shouxuanfeiliao,junpinT.sunhao = notjunpinT.sunhao WHERE junpinT.luci = notjunpinT.luci";
	
	public static final String T_INRO_INFO_SELECT_ALL = "SELECT riqi, qihao, luci, junpin, guige, shengchanluhao, fanyingqihao, shiyongcishu, mg, ticl, maozhong, jingzhong, chengpinlv, fe, si, cl, c, n, o, h, mn, hb, dengji_hanmeng, kaohedengji_chumeng, gongyitiaozheng, gongyishiyan, dipi, shangmao, pabi, feidipi, feishangmao, feipabi, feitaifen, cixuan, shouxuanfeiliao, sunhao, zongpaimeiliang, chuluzhenkongdu, huanyuanzuigaowendu, zhengliugaoheng, zhuanzhengliu, jiashouci, jiamoci, tongdao, shengchanguzhang, beizhushuoming FROM ironinfo where flag is null order by luci, guige, junpin";
	
	public static final String T_INRO_INFO_UPDATE = "Update ironinfo set `riqi` = ?, `qihao` = ?, `junpin` = ?, `shengchanluhao` = ?, `fanyingqihao` = ?, `shiyongcishu` = ?, `mg` = ?, `ticl` = ?, `maozhong` = ?, `jingzhong` = ?, `chengpinlv` = ?, `fe` = ?, `si` = ?, `cl` = ?, `c` = ?, `n` = ?, `o` = ?, `h` = ?, `mn` = ?, `hb` = ?, `dengji_hanmeng` = ?, `kaohedengji_chumeng` = ?, `gongyitiaozheng` = ?, `gongyishiyan` = ?, `dipi` = ?, `shangmao` = ?, `pabi` = ?, `feidipi` = ?, `feishangmao` = ?, `feipabi` = ?, `feitaifen` = ?, `cixuan` = ?, `shouxuanfeiliao` = ?, `sunhao` = ?, `zongpaimeiliang` = ?, `chuluzhenkongdu` = ?, `huanyuanzuigaowendu` = ?, `zhengliugaoheng` = ?, `zhuanzhengliu` = ?, `jiashouci` = ?, `jiamoci` = ?, `tongdao` = ?, `shengchanguzhang` = ?, `beizhushuoming` = ? where `luci` = ? and `guige` = ?";
	
	public static final String T_INRO_INFO_UPDATE_YUE = "update ironinfo set yue = MONTH(riqi)";
	
	public static final String T_INRO_INFO_UPDATE_FLG_INSER = "UPDATE ironinfo SET flag = '1' WHERE `riqi` <> '' AND `qihao` <> '' AND `luci` <> '' AND `guige` <> '' AND `shengchanluhao` <> '' AND `fanyingqihao` <> '' AND `shiyongcishu` <> '' AND `mg` <> '' AND `ticl` <> '' AND `maozhong` <> '' AND `jingzhong` <> '' AND `chengpinlv` <> '' AND `fe` <> '' AND `si` <> '' AND `cl` <> '' AND `c` <> '' AND `n` <> '' AND `o` <> '' AND `h` <> '' AND `mn` <> '' AND `hb` <> '' AND `dengji_hanmeng` <> '' AND `kaohedengji_chumeng` <> '' AND `dipi` <> '' AND `shangmao` <> '' AND `pabi` <> '' AND `feidipi` <> '' AND `feishangmao` <> '' AND `feipabi` <> '' AND `feitaifen` <> '' AND `cixuan` <> '' AND `shouxuanfeiliao` <> '' AND `sunhao` <> ''";
	
	public static final String T_INRO_INFO_KEY_LUCI = "select count(luci) as cnt from ironinfo where luci = ?";
}
