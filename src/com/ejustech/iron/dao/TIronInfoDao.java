package com.ejustech.iron.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.ejustech.iron.common.Constant;
import com.ejustech.iron.common.ConstantSql;
import com.ejustech.iron.common.Output;
import com.ejustech.iron.common.Utility;
import com.ejustech.iron.common.db.BaseDao;
import com.ejustech.iron.databean.dao.TIronInfoDaoBean;
import com.ejustech.iron.databean.form.Result1FormBean;
import com.ejustech.iron.databean.form.Result2FormBean;
import com.ejustech.iron.databean.form.Result3FormBean;
import com.ejustech.iron.databean.form.Result4FormBean;
import com.ejustech.iron.databean.form.Result5FormBean;
import com.ejustech.iron.databean.form.Result6FormBean;
import com.ejustech.iron.databean.form.Result7FormBean;



/**
 * @author Administrator ironinfo表的数据访问对象
 */
public class TIronInfoDao extends BaseDao {

	public Boolean Insert(TIronInfoDaoBean daoBean) throws SQLException {
		//Open();

		PreparedStatement ps = null;
		try {
			ps = Conn().prepareStatement(ConstantSql.T_INRO_INFO_INSERT);

			ps.setString(Constant.T_IRON_INFO_COL_YearMonthDay, daoBean.getYearMonthDay());
			ps.setString(Constant.T_IRON_INFO_COL_QiHao, daoBean.getQiHao());
			ps.setString(Constant.T_IRON_INFO_COL_LuCi, daoBean.getLuCi());
			ps.setString(Constant.T_IRON_INFO_COL_JunPinFlg, daoBean.getJunPin());
			ps.setString(Constant.T_IRON_INFO_COL_GuiGe, daoBean.getGuiGe());
			ps.setString(Constant.T_IRON_INFO_COL_ShengChanLuHao, daoBean.getShengChanLuHao());
			ps.setString(Constant.T_IRON_INFO_COL_FanYingQiHao, daoBean.getFanYingQiHao());
			ps.setString(Constant.T_IRON_INFO_COL_ShiYongCiShu, daoBean.getShiYongCiShu());
			ps.setString(Constant.T_IRON_INFO_COL_Mg, daoBean.getMg());
			ps.setString(Constant.T_IRON_INFO_COL_TiCl4, daoBean.getTiCl4());
			ps.setString(Constant.T_IRON_INFO_COL_MaoZhong, daoBean.getMaoZhong());
			ps.setString(Constant.T_IRON_INFO_COL_JingZhong, daoBean.getJingZhong());
			ps.setString(Constant.T_IRON_INFO_COL_ChengPinLv, daoBean.getChengPinLv());
			ps.setString(Constant.T_IRON_INFO_COL_YuanSuFe, daoBean.getYuanSuFe());
			ps.setString(Constant.T_IRON_INFO_COL_YuanSuSi, daoBean.getYuanSuSi());
			ps.setString(Constant.T_IRON_INFO_COL_YuanSuCl, daoBean.getYuanSuCl());
			ps.setString(Constant.T_IRON_INFO_COL_YuanSuC, daoBean.getYuanSuC());
			ps.setString(Constant.T_IRON_INFO_COL_YuanSuN, daoBean.getYuanSuN());
			ps.setString(Constant.T_IRON_INFO_COL_YuanSuO, daoBean.getYuanSuO());
			ps.setString(Constant.T_IRON_INFO_COL_YuanSuH, daoBean.getYuanSuH());
			ps.setString(Constant.T_IRON_INFO_COL_YuanSuMn, daoBean.getYuanSuMn());
			ps.setString(Constant.T_IRON_INFO_COL_YuanSuHb, daoBean.getYuanSuHb());
			ps.setString(Constant.T_IRON_INFO_COL_DengJiHanMeng, daoBean.getDengJiHanMeng());
			ps.setString(Constant.T_IRON_INFO_COL_KaoHeDengJiChuMeng, daoBean.getKaoHeDengJiChuMeng());
			ps.setString(Constant.T_IRON_INFO_COL_GongYiTiaoZheng, daoBean.getGongYiTiaoZheng());
			ps.setString(Constant.T_IRON_INFO_COL_GongYiShiYan, daoBean.getGongYiShiYan());
			ps.setString(Constant.T_IRON_INFO_COL_DiPiKg, daoBean.getDiPiKg());
			ps.setString(Constant.T_IRON_INFO_COL_ShangMaoKg, daoBean.getShangMaoKg());
			ps.setString(Constant.T_IRON_INFO_COL_PaBiKg, daoBean.getPaBiKg());
			ps.setString(Constant.T_IRON_INFO_COL_FeiDiPiKg, daoBean.getFeiDiPiKg());
			ps.setString(Constant.T_IRON_INFO_COL_FeiShangMaoKg, daoBean.getFeiShangMaoKg());
			ps.setString(Constant.T_IRON_INFO_COL_FeiPaBiKg, daoBean.getFeiPaBiKg());
			ps.setString(Constant.T_IRON_INFO_COL_FeiTaiFenKg, daoBean.getFeiTaiFenKg());
			ps.setString(Constant.T_IRON_INFO_COL_CiYuanKg, daoBean.getCiYuanKg());
			ps.setString(Constant.T_IRON_INFO_COL_ShouXuanFeiLiaoKg, daoBean.getShouXuanFeiLiaoKg());
			ps.setString(Constant.T_IRON_INFO_COL_SunHaoKg, daoBean.getSunHaoKg());
			ps.setString(Constant.T_IRON_INFO_COL_ZongPaiMeiLiangKg, daoBean.getZongPaiMeiLiangKg());
			ps.setString(Constant.T_IRON_INFO_COL_ChuLuZhenKongDu, daoBean.getChuLuZhenKongDu());
			ps.setString(Constant.T_IRON_INFO_COL_YuanZuiGaoWenDu, daoBean.getYuanZuiGaoWenDu());
			ps.setString(Constant.T_IRON_INFO_COL_ZhengLiuGaoHengDian, daoBean.getZhengLiuGaoHengDian());
			ps.setString(Constant.T_IRON_INFO_COL_ZhuanZhengLiu, daoBean.getZhuanZhengLiu());
			ps.setString(Constant.T_IRON_INFO_COL_JiaShouCi, daoBean.getJiaShouCi());
			ps.setString(Constant.T_IRON_INFO_COL_JiaMoCi, daoBean.getJiaMoCi());
			ps.setString(Constant.T_IRON_INFO_COL_TongDao, daoBean.getTongDao());
			ps.setString(Constant.T_IRON_INFO_COL_ShengChanGuZhang, daoBean.getShengChanGuZhang());
			ps.setString(Constant.T_IRON_INFO_COL_BeiZhuShuoMing, daoBean.getBeiZhuShuoMing());
//			ps.setString(Constant.T_IRON_INFO_COL_JunPin, daoBean.getJunPin());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

		return true;

	}

	/**
	 * 
	 * @param daoBean
	 * @return
	 * @throws SQLException 
	 */
    public Boolean UpdateJunPinNotInput() throws SQLException {
        // Open();

        PreparedStatement ps = null;
        try {
            ps = Conn().prepareStatement(ConstantSql.T_INRO_INFO_UPDATE_JUNPIN_NOT_INPUT);
            
            ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw e;
        }

        return true;
    }
    
	public Boolean Update(TIronInfoDaoBean daoBean) throws SQLException {
		//Open();

		PreparedStatement ps = null;
		try {
			ps = Conn().prepareStatement(ConstantSql.T_INRO_INFO_UPDATE);

			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YearMonthDay, daoBean.getYearMonthDay());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_QiHao, daoBean.getQiHao());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_JunPinFlg, daoBean.getJunPin());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ShengChanLuHao, daoBean.getShengChanLuHao());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_FanYingQiHao, daoBean.getFanYingQiHao());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ShiYongCiShu, daoBean.getShiYongCiShu());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_Mg, daoBean.getMg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_TiCl4, daoBean.getTiCl4());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_MaoZhong, daoBean.getMaoZhong());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_JingZhong, daoBean.getJingZhong());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ChengPinLv, daoBean.getChengPinLv());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanSuFe, daoBean.getYuanSuFe());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanSuSi, daoBean.getYuanSuSi());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanSuCl, daoBean.getYuanSuCl());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanSuC, daoBean.getYuanSuC());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanSuN, daoBean.getYuanSuN());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanSuO, daoBean.getYuanSuO());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanSuH, daoBean.getYuanSuH());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanSuMn, daoBean.getYuanSuMn());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanSuHb, daoBean.getYuanSuHb());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_DengJiHanMeng, daoBean.getDengJiHanMeng());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_KaoHeDengJiChuMeng, daoBean.getKaoHeDengJiChuMeng());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_GongYiTiaoZheng, daoBean.getGongYiTiaoZheng());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_GongYiShiYan, daoBean.getGongYiShiYan());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_DiPiKg, daoBean.getDiPiKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ShangMaoKg, daoBean.getShangMaoKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_PaBiKg, daoBean.getPaBiKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_FeiDiPiKg, daoBean.getFeiDiPiKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_FeiShangMaoKg, daoBean.getFeiShangMaoKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_FeiPaBiKg, daoBean.getFeiPaBiKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_FeiTaiFenKg, daoBean.getFeiTaiFenKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_CiYuanKg, daoBean.getCiYuanKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ShouXuanFeiLiaoKg, daoBean.getShouXuanFeiLiaoKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_SunHaoKg, daoBean.getSunHaoKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ZongPaiMeiLiangKg, daoBean.getZongPaiMeiLiangKg());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ChuLuZhenKongDu, daoBean.getChuLuZhenKongDu());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_YuanZuiGaoWenDu, daoBean.getYuanZuiGaoWenDu());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ZhengLiuGaoHengDian, daoBean.getZhengLiuGaoHengDian());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ZhuanZhengLiu, daoBean.getZhuanZhengLiu());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_JiaShouCi, daoBean.getJiaShouCi());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_JiaMoCi, daoBean.getJiaMoCi());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_TongDao, daoBean.getTongDao());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_ShengChanGuZhang, daoBean.getShengChanGuZhang());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_BeiZhuShuoMing, daoBean.getBeiZhuShuoMing());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_LuCi, daoBean.getLuCi());
			ps.setString(Constant.T_IRON_INFO_COL_UPDATE_GuiGe, daoBean.getGuiGe());
//			ps.setString(Constant.T_IRON_INFO_COL_JunPin, daoBean.getJunPin());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

		return true;

	}
	
	/**
	 * @param request
	 * @param sqlCondition
	 *            检索条件
	 * @return 全部信息输出表
	 * @throws Exception
	 */
	public ArrayList<Result1FormBean> getAllInfoList(HttpServletRequest request, String sqlCondition) throws Exception {

		ArrayList<Result1FormBean> allInfoList = new ArrayList<Result1FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();

		sqlBuffer.append(" SELECT");
		sqlBuffer.append(" *");
		sqlBuffer.append(" FROM");
		sqlBuffer.append(" ironinfo");

		String sql = sqlBuffer.append(sqlCondition).toString();
		System.out.println("sql=" + sql);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				Result1FormBean result1FormBean = new Result1FormBean();
				// String index = String.valueOf(resultSet.getRow());
				result1FormBean.setIndex(resultSet.getString("luci") + "~" + resultSet.getString("guige"));
				result1FormBean.setRiqi(resultSet.getString("riqi"));
				result1FormBean.setQihao(resultSet.getString("qihao"));
				result1FormBean.setLuci(resultSet.getString("luci"));
				if (!resultSet.getString("junpin").equals("")) {
					result1FormBean.setJunpin("(" + resultSet.getString("junpin") + ")");
				} else {
					result1FormBean.setJunpin(resultSet.getString("junpin"));
				}
				result1FormBean.setGuige(resultSet.getString("guige"));
				result1FormBean.setShengchanluhao(resultSet.getString("shengchanluhao"));
				result1FormBean.setFanyingqihao(resultSet.getString("fanyingqihao"));
				result1FormBean.setShiyongcishu(resultSet.getString("shiyongcishu"));
				result1FormBean.setMg(resultSet.getString("mg"));
				result1FormBean.setTicl(resultSet.getString("ticl"));
				result1FormBean.setMaozhong(resultSet.getString("maozhong"));
				result1FormBean.setJingzhong(resultSet.getString("jingzhong"));
				if (resultSet.getString("chengpinlv") != null)
					result1FormBean.setChengpinlv(resultSet.getString("chengpinlv"));
					//result1FormBean.setChengpinlv(Output.getPValue(resultSet.getString("chengpinlv")));
				result1FormBean.setFe(resultSet.getString("fe"));
				result1FormBean.setSi(resultSet.getString("si"));
				result1FormBean.setCl(resultSet.getString("cl"));
				result1FormBean.setC(resultSet.getString("c"));
				result1FormBean.setO(resultSet.getString("n"));
				result1FormBean.setN(resultSet.getString("o"));
				result1FormBean.setH(resultSet.getString("h"));
				result1FormBean.setMn(resultSet.getString("mn"));
				result1FormBean.setHb(resultSet.getString("hb"));
				result1FormBean.setDengji_hanmeng(resultSet.getString("dengji_hanmeng"));
				result1FormBean.setKaohedengji_chumeng(resultSet.getString("kaohedengji_chumeng"));
				result1FormBean.setGongyitiaozheng(resultSet.getString("gongyitiaozheng"));
				result1FormBean.setGongyishiyan(resultSet.getString("gongyishiyan"));
				result1FormBean.setDipi(resultSet.getString("dipi"));
				result1FormBean.setShangmao(resultSet.getString("shangmao"));
				result1FormBean.setPabi(resultSet.getString("pabi"));
				result1FormBean.setFeidipi(resultSet.getString("feidipi"));
				result1FormBean.setFeishangmao(resultSet.getString("feishangmao"));
				result1FormBean.setFeipabi(resultSet.getString("feipabi"));
				result1FormBean.setFeitaifen(resultSet.getString("feitaifen"));
				result1FormBean.setCixuan(resultSet.getString("cixuan"));
				result1FormBean.setShouxuanfeiliao(resultSet.getString("shouxuanfeiliao"));
				result1FormBean.setSunhao(resultSet.getString("sunhao"));
				result1FormBean.setZongpaimeiliang(resultSet.getString("zongpaimeiliang"));
				result1FormBean.setChuluzhenkongdu(resultSet.getString("chuluzhenkongdu"));
				result1FormBean.setHuanyuanzuigaowendu(resultSet.getString("huanyuanzuigaowendu"));
				result1FormBean.setZhengliugaoheng(resultSet.getString("zhengliugaoheng"));
				result1FormBean.setZhuanzhengliu(resultSet.getString("zhuanzhengliu"));
				result1FormBean.setJiashouci(resultSet.getString("jiashouci"));
				result1FormBean.setJiamoci(resultSet.getString("jiamoci"));
				result1FormBean.setTongdao(resultSet.getString("tongdao"));
				result1FormBean.setShengchanguzhang(resultSet.getString("shengchanguzhang"));
				result1FormBean.setBeizhushuoming(resultSet.getString("beizhushuoming"));

				allInfoList.add(result1FormBean);
			}
			return allInfoList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	/**
	 * @param request
	 * @param sqlCondition
	 *            检索条件
	 * @return 月生产数据统计表-含锰
	 * @throws Exception
	 */
	public ArrayList<Result2FormBean> getHanmengList(HttpServletRequest request, String sqlCondition, String monthFlag) throws Exception {

		ArrayList<Result2FormBean> hanmengList = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList1 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList2 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList3 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList4 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList5 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList6 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList7 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList8 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList9 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList10 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList11 = new ArrayList<Result2FormBean>();
		ArrayList<Result2FormBean> hanmengList12 = new ArrayList<Result2FormBean>();

		Result2FormBean result2FormBean = new Result2FormBean();

		StringBuffer sql1 = new StringBuffer();
		StringBuffer sql2 = new StringBuffer();
		StringBuffer sql3 = new StringBuffer();
		StringBuffer sql4 = new StringBuffer();
		StringBuffer sql5 = new StringBuffer();
		StringBuffer sql6 = new StringBuffer();
		StringBuffer sql7 = new StringBuffer();
		StringBuffer sql8 = new StringBuffer();
		StringBuffer sql9 = new StringBuffer();
		StringBuffer sql10 = new StringBuffer();
		StringBuffer sql11 = new StringBuffer();
		StringBuffer sql12 = new StringBuffer();

		StringBuffer sql1s = new StringBuffer();
		StringBuffer sql2s = new StringBuffer();
		StringBuffer sql3s = new StringBuffer();
		StringBuffer sql4s = new StringBuffer();
		StringBuffer sql5s = new StringBuffer();
		StringBuffer sql6s = new StringBuffer();
		StringBuffer sql7s = new StringBuffer();
		StringBuffer sql8s = new StringBuffer();
		StringBuffer sql9s = new StringBuffer();
		StringBuffer sql10s = new StringBuffer();
		StringBuffer sql11s = new StringBuffer();
		StringBuffer sql12s = new StringBuffer();

		StringBuffer sql1ys = new StringBuffer();
		StringBuffer sql2ys = new StringBuffer();
		StringBuffer sql3ys = new StringBuffer();
		StringBuffer sql4ys = new StringBuffer();
		StringBuffer sql5ys = new StringBuffer();
		StringBuffer sql6ys = new StringBuffer();
		StringBuffer sql7ys = new StringBuffer();
		StringBuffer sql8ys = new StringBuffer();
		StringBuffer sql9ys = new StringBuffer();
		StringBuffer sql10ys = new StringBuffer();
		StringBuffer sql11ys = new StringBuffer();
		StringBuffer sql12ys = new StringBuffer();

		StringBuffer sqlBuffer1 = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sql1.append("SELECT qihao FROM ironinfo GROUP BY qihao");
		sql2.append("SELECT qihao,count(guige) AS zonglushu FROM ironinfo WHERE guige ='0.83-25.4'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql3.append(
				"SELECT qihao,SUM(jingzhong*fe)/SUM(jingzhong) AS fe,SUM(jingzhong*cl)/SUM(jingzhong) AS cl,SUM(jingzhong*n)/SUM(jingzhong) AS n,SUM(jingzhong*o)/SUM(jingzhong) AS o,SUM(jingzhong*hb)/SUM(jingzhong) AS hb ,SUM(maozhong) AS zongmaozhong,SUM(mg) AS mgzongliang,SUM(ticl) AS ticl4zongliang,SUM(jingzhong) AS zongjingzhong,SUM(jingzhong)/SUM(maozhong) AS junhuishoulv FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao");
		sql4.append("SELECT qihao,SUM(jingzhong) AS 0Aji FROM ironinfo WHERE dengji_hanmeng = '0A'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql5.append("SELECT qihao,SUM(jingzhong) AS 0ji FROM ironinfo WHERE dengji_hanmeng = '0'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql6.append("SELECT qihao,SUM(jingzhong) AS 1ji FROM ironinfo WHERE dengji_hanmeng = '1'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql7.append("SELECT qihao,SUM(jingzhong) AS 2ji FROM ironinfo WHERE dengji_hanmeng = '2'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql8.append("SELECT qihao,SUM(jingzhong) AS 3ji FROM ironinfo WHERE dengji_hanmeng = '3'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql9.append("SELECT qihao,SUM(jingzhong) AS 4ji FROM ironinfo WHERE dengji_hanmeng = '4'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql10.append("SELECT qihao,SUM(jingzhong) AS 5ji FROM ironinfo WHERE dengji_hanmeng = '5'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql11.append("SELECT qihao,SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE dengji_hanmeng IN (2,3,4,5)").append(sqlBuffer2)
				.append(" GROUP BY qihao");
		sql12.append("SELECT qihao,SUM(jingzhong) AS 0jiyishang FROM ironinfo WHERE dengji_hanmeng IN ('0','0A')").append(sqlBuffer2)
				.append(" GROUP BY qihao");
		// 合计部分
		sql1s.append("SELECT '总计' AS qihao FROM ironinfo");
		sql2s.append("SELECT qihao,count(guige) AS zonglushu FROM ironinfo WHERE guige ='0.83-25.4'").append(sqlBuffer2);
		sql3s.append(
				"SELECT qihao,SUM(jingzhong*fe)/SUM(jingzhong) AS fe,SUM(jingzhong*cl)/SUM(jingzhong) AS cl,SUM(jingzhong*n)/SUM(jingzhong) AS n,SUM(jingzhong*o)/SUM(jingzhong) AS o,SUM(jingzhong*hb)/SUM(jingzhong) AS hb ,SUM(maozhong) AS zongmaozhong,SUM(mg) AS mgzongliang,SUM(ticl) AS ticl4zongliang,SUM(jingzhong) AS zongjingzhong,SUM(jingzhong)/SUM(maozhong) AS junhuishoulv FROM ironinfo")
				.append(sqlBuffer1);
		sql4s.append("SELECT qihao,SUM(jingzhong) AS 0Aji FROM ironinfo WHERE dengji_hanmeng = '0A'").append(sqlBuffer2);
		sql5s.append("SELECT qihao,SUM(jingzhong) AS 0ji FROM ironinfo WHERE dengji_hanmeng = '0'").append(sqlBuffer2);
		sql6s.append("SELECT qihao,SUM(jingzhong) AS 1ji FROM ironinfo WHERE dengji_hanmeng = '1'").append(sqlBuffer2);
		sql7s.append("SELECT qihao,SUM(jingzhong) AS 2ji FROM ironinfo WHERE dengji_hanmeng = '2'").append(sqlBuffer2);
		sql8s.append("SELECT qihao,SUM(jingzhong) AS 3ji FROM ironinfo WHERE dengji_hanmeng = '3'").append(sqlBuffer2);
		sql9s.append("SELECT qihao,SUM(jingzhong) AS 4ji FROM ironinfo WHERE dengji_hanmeng = '4'").append(sqlBuffer2);
		sql10s.append("SELECT qihao,SUM(jingzhong) AS 5ji FROM ironinfo WHERE dengji_hanmeng = '5'").append(sqlBuffer2);
		sql11s.append("SELECT qihao,SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE dengji_hanmeng IN (2,3,4,5)").append(sqlBuffer2);
		sql12s.append("SELECT qihao,SUM(jingzhong) AS 0jiyishang FROM ironinfo WHERE dengji_hanmeng IN ('0','0A')").append(sqlBuffer2);
		// 年度累计部分
		sql1ys.append("SELECT '年度累计' AS qihao FROM ironinfo");
		sql2ys.append("SELECT qihao,count(guige) AS zonglushu FROM ironinfo WHERE guige ='0.83-25.4'");
		sql3ys.append("SELECT qihao,SUM(jingzhong*fe)/SUM(jingzhong) AS fe,SUM(jingzhong*cl)/SUM(jingzhong) AS cl,SUM(jingzhong*n)/SUM(jingzhong) AS n,SUM(jingzhong*o)/SUM(jingzhong) AS o,SUM(jingzhong*hb)/SUM(jingzhong) AS hb ,SUM(maozhong) AS zongmaozhong,SUM(mg) AS mgzongliang,SUM(ticl) AS ticl4zongliang,SUM(jingzhong) AS zongjingzhong,SUM(jingzhong)/SUM(maozhong) AS junhuishoulv FROM ironinfo");
		sql4ys.append("SELECT qihao,SUM(jingzhong) AS 0Aji FROM ironinfo WHERE dengji_hanmeng = '0A'");
		sql5ys.append("SELECT qihao,SUM(jingzhong) AS 0ji FROM ironinfo WHERE dengji_hanmeng = '0'");
		sql6ys.append("SELECT qihao,SUM(jingzhong) AS 1ji FROM ironinfo WHERE dengji_hanmeng = '1'");
		sql7ys.append("SELECT qihao,SUM(jingzhong) AS 2ji FROM ironinfo WHERE dengji_hanmeng = '2'");
		sql8ys.append("SELECT qihao,SUM(jingzhong) AS 3ji FROM ironinfo WHERE dengji_hanmeng = '3'");
		sql9ys.append("SELECT qihao,SUM(jingzhong) AS 4ji FROM ironinfo WHERE dengji_hanmeng = '4'");
		sql10ys.append("SELECT qihao,SUM(jingzhong) AS 5ji FROM ironinfo WHERE dengji_hanmeng = '5'");
		sql11ys.append("SELECT qihao,SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE dengji_hanmeng IN (2,3,4,5)");
		sql12ys.append("SELECT qihao,SUM(jingzhong) AS 0jiyishang FROM ironinfo WHERE dengji_hanmeng IN ('0','0A')");

		ResultSet resultSet1 = null;
		ResultSet resultSet2 = null;
		ResultSet resultSet3 = null;
		ResultSet resultSet4 = null;
		ResultSet resultSet5 = null;
		ResultSet resultSet6 = null;
		ResultSet resultSet7 = null;
		ResultSet resultSet8 = null;
		ResultSet resultSet9 = null;
		ResultSet resultSet10 = null;
		ResultSet resultSet11 = null;
		ResultSet resultSet12 = null;

		ResultSet resultSet1s = null;
		ResultSet resultSet2s = null;
		ResultSet resultSet3s = null;
		ResultSet resultSet4s = null;
		ResultSet resultSet5s = null;
		ResultSet resultSet6s = null;
		ResultSet resultSet7s = null;
		ResultSet resultSet8s = null;
		ResultSet resultSet9s = null;
		ResultSet resultSet10s = null;
		ResultSet resultSet11s = null;
		ResultSet resultSet12s = null;

		ResultSet resultSet1ys = null;
		ResultSet resultSet2ys = null;
		ResultSet resultSet3ys = null;
		ResultSet resultSet4ys = null;
		ResultSet resultSet5ys = null;
		ResultSet resultSet6ys = null;
		ResultSet resultSet7ys = null;
		ResultSet resultSet8ys = null;
		ResultSet resultSet9ys = null;
		ResultSet resultSet10ys = null;
		ResultSet resultSet11ys = null;
		ResultSet resultSet12ys = null;

		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();

			resultSet1 = statement.executeQuery(sql1.toString());
			System.out.println("sql1=" + sql1);
			while (resultSet1.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet1.getString("qihao"));
				hanmengList1.add(result2FormBean);
			}

			resultSet2 = statement.executeQuery(sql2.toString());
			System.out.println("sql2=" + sql2);
			while (resultSet2.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet2.getString("qihao"));
				result2FormBean.setZonglushu(resultSet2.getString("zonglushu"));
				hanmengList2.add(result2FormBean);
			}
			// 横向合并list2到list1
			hanmengList = Utility.getList2ByHashMap(hanmengList1, hanmengList2, 2);

			resultSet3 = statement.executeQuery(sql3.toString());
			System.out.println("sql3=" + sql3);
			while (resultSet3.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet3.getString("qihao"));
				result2FormBean.setFe(Output.getSubValue(resultSet3.getString("fe"), 4));
				result2FormBean.setCl(Output.getSubValue(resultSet3.getString("cl"), 4));
				result2FormBean.setN(Output.getSubValue(resultSet3.getString("n"), 4));
				result2FormBean.setO(Output.getSubValue(resultSet3.getString("o"), 4));
				result2FormBean.setHb(Output.getSubValue(resultSet3.getString("hb"), 0));
				result2FormBean.setZongmaozhong(Output.getSubValue(resultSet3.getString("zongmaozhong"), 0));
				result2FormBean.setMgzongliang(resultSet3.getString("mgzongliang"));
				result2FormBean.setTicl4zongliang(resultSet3.getString("ticl4zongliang"));
				if (resultSet3.getString("junhuishoulv") != null)
					result2FormBean.setJunhuishoulv(Output.getPValue(resultSet3.getString("junhuishoulv")));
				result2FormBean.setZongjingzhong(Output.getSubValue(resultSet3.getString("zongjingzhong"), 0));
				hanmengList3.add(result2FormBean);
			}

			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList3, 3);

			resultSet4 = statement.executeQuery(sql4.toString());
			System.out.println("sql4=" + sql4);
			while (resultSet4.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet4.getString("qihao"));
				result2FormBean.setJ0Aji(resultSet4.getString("0Aji"));
				hanmengList4.add(result2FormBean);
			}

			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList4, 4);

			resultSet5 = statement.executeQuery(sql5.toString());
			System.out.println("sql5=" + sql5);
			while (resultSet5.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet5.getString("qihao"));
				result2FormBean.setJ0ji(resultSet5.getString("0ji"));
				hanmengList5.add(result2FormBean);
			}

			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList5, 5);

			resultSet6 = statement.executeQuery(sql6.toString());
			System.out.println("sql6=" + sql6);
			while (resultSet6.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet6.getString("qihao"));
				result2FormBean.setJ1ji(resultSet6.getString("1ji"));
				hanmengList6.add(result2FormBean);
			}

			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList6, 6);

			resultSet7 = statement.executeQuery(sql7.toString());
			System.out.println("sql7=" + sql7);
			while (resultSet7.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet7.getString("qihao"));
				result2FormBean.setJ2ji(resultSet7.getString("2ji"));
				hanmengList7.add(result2FormBean);
			}

			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList7, 7);

			resultSet8 = statement.executeQuery(sql8.toString());
			System.out.println("sql8=" + sql8);
			while (resultSet8.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet8.getString("qihao"));
				result2FormBean.setJ3ji(resultSet8.getString("3ji"));
				hanmengList8.add(result2FormBean);
			}
			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList8, 8);

			resultSet9 = statement.executeQuery(sql9.toString());
			System.out.println("sql9=" + sql9);
			while (resultSet9.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet9.getString("qihao"));
				result2FormBean.setJ4ji(resultSet9.getString("4ji"));
				hanmengList9.add(result2FormBean);
			}
			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList9, 9);

			resultSet10 = statement.executeQuery(sql10.toString());
			System.out.println("sql10=" + sql10);
			while (resultSet10.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet10.getString("qihao"));
				result2FormBean.setJ5ji(resultSet10.getString("5ji"));
				hanmengList10.add(result2FormBean);
			}
			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList10, 10);

			resultSet11 = statement.executeQuery(sql11.toString());
			System.out.println("sql11=" + sql11);
			while (resultSet11.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet11.getString("qihao"));
				result2FormBean.setJ2jijiyixia(resultSet11.getString("2jijiyixia"));
				hanmengList11.add(result2FormBean);
			}
			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList11, 11);

			resultSet12 = statement.executeQuery(sql12.toString());
			System.out.println("sql12=" + sql12);
			while (resultSet12.next()) {
				result2FormBean = new Result2FormBean();
				result2FormBean.setQihao(resultSet12.getString("qihao"));
				result2FormBean.setJ0jiyishang(resultSet12.getString("0jiyishang"));
				hanmengList12.add(result2FormBean);
			}
			hanmengList = Utility.getList2ByHashMap(hanmengList, hanmengList12, 12);

			// 合计部分
			result2FormBean = new Result2FormBean();
			resultSet1s = statement.executeQuery(sql1s.toString());
			System.out.println("sql1s=" + sql1s);
			while (resultSet1s.next()) {
				result2FormBean.setQihao(resultSet1s.getString("qihao"));
			}

			resultSet2s = statement.executeQuery(sql2s.toString());
			System.out.println("sql2s=" + sql2s);
			while (resultSet2s.next()) {
				result2FormBean.setZonglushu(resultSet2s.getString("zonglushu"));
			}

			resultSet3s = statement.executeQuery(sql3s.toString());
			System.out.println("sql3s=" + sql3s);
			while (resultSet3s.next()) {
				result2FormBean.setFe(Output.getSubValue(resultSet3s.getString("fe"), 4));
				result2FormBean.setCl(Output.getSubValue(resultSet3s.getString("cl"), 4));
				result2FormBean.setN(Output.getSubValue(resultSet3s.getString("n"), 4));
				result2FormBean.setO(Output.getSubValue(resultSet3s.getString("o"), 4));
				result2FormBean.setHb(Output.getSubValue(resultSet3s.getString("hb"), 0));
				result2FormBean.setZongmaozhong(Output.getSubValue(resultSet3s.getString("zongmaozhong"), 0));
				result2FormBean.setMgzongliang(resultSet3s.getString("mgzongliang"));
				result2FormBean.setTicl4zongliang(resultSet3s.getString("ticl4zongliang"));
				if (resultSet3s.getString("junhuishoulv") != null)
					result2FormBean.setJunhuishoulv(Output.getPValue(resultSet3s.getString("junhuishoulv")));
				result2FormBean.setZongjingzhong(Output.getSubValue(resultSet3s.getString("zongjingzhong"), 0));
				if (resultSet3s.getString("zongmaozhong") != null)
					result2FormBean.setJunmaozhong(Output.getAValue(resultSet3s.getString("zongmaozhong"), result2FormBean.getZonglushu(), 0));
				if (resultSet3s.getString("zongjingzhong") != null)
					result2FormBean.setJunjingzhong(Output.getAValue(resultSet3s.getString("zongjingzhong"), result2FormBean.getZonglushu(), 0));
				if (resultSet3s.getString("mgzongliang") != null)
					result2FormBean.setJunmgdanhao(Output.getAkgValue(resultSet3s.getString("mgzongliang"), result2FormBean.getZongmaozhong(), 3));
				if (resultSet3s.getString("ticl4zongliang") != null)
					result2FormBean.setTicl4danhao(Output.getAkgValue(resultSet3s.getString("ticl4zongliang"), result2FormBean.getZongmaozhong(), 3));
			}

			resultSet4s = statement.executeQuery(sql4s.toString());
			System.out.println("sql4s=" + sql4s);
			while (resultSet4s.next()) {
				result2FormBean.setJ0Aji(resultSet4s.getString("0Aji"));
				if (resultSet4s.getString("0Aji") != null)
					result2FormBean.setJ0Ajilv(Output.getPValue(resultSet4s.getString("0Aji"), result2FormBean.getZongmaozhong()));
			}

			resultSet5s = statement.executeQuery(sql5s.toString());
			System.out.println("sql5s=" + sql5s);
			while (resultSet5s.next()) {
				result2FormBean.setJ0ji(resultSet5s.getString("0ji"));
				if (resultSet5s.getString("0ji") != null)
					result2FormBean.setJ0jilv(Output.getPValue(resultSet5s.getString("0ji"), result2FormBean.getZongmaozhong()));
			}

			resultSet6s = statement.executeQuery(sql6s.toString());
			System.out.println("sql6s=" + sql6s);
			while (resultSet6s.next()) {
				result2FormBean.setJ1ji(resultSet6s.getString("1ji"));
				if (resultSet6s.getString("1ji") != null)
					result2FormBean.setJ1jilv(Output.getPValue(resultSet6s.getString("1ji"), result2FormBean.getZongmaozhong()));
			}

			resultSet7s = statement.executeQuery(sql7s.toString());
			System.out.println("sql7s=" + sql7s);
			while (resultSet7s.next()) {
				result2FormBean.setJ2ji(resultSet7s.getString("2ji"));
			}

			resultSet8s = statement.executeQuery(sql8s.toString());
			System.out.println("sql8s=" + sql8s);
			while (resultSet8s.next()) {
				result2FormBean.setJ3ji(resultSet8s.getString("3ji"));
			}

			resultSet9s = statement.executeQuery(sql9s.toString());
			System.out.println("sql9s=" + sql9s);
			while (resultSet9s.next()) {
				result2FormBean.setJ4ji(resultSet9s.getString("4ji"));
			}

			resultSet10s = statement.executeQuery(sql10s.toString());
			System.out.println("sql10s=" + sql10s);
			while (resultSet10s.next()) {
				result2FormBean.setJ5ji(resultSet10s.getString("5ji"));
			}

			resultSet11s = statement.executeQuery(sql11s.toString());
			System.out.println("sql11s=" + sql11s);
			while (resultSet11s.next()) {
				result2FormBean.setJ2jijiyixia(resultSet11s.getString("2jijiyixia"));
				if (resultSet11s.getString("2jijiyixia") != null)
					result2FormBean.setJ2jijiyixialv(Output.getPValue(resultSet11s.getString("2jijiyixia"), result2FormBean.getZongmaozhong()));
			}

			resultSet12s = statement.executeQuery(sql12s.toString());
			System.out.println("sql12s=" + sql12s);
			while (resultSet12s.next()) {
				result2FormBean.setJ0jiyishang(resultSet12s.getString("0jiyishang"));
				if (resultSet12s.getString("0jiyishang") != null)
					result2FormBean.setJ0jiyishanglv(Output.getPValue(resultSet12s.getString("0jiyishang"), result2FormBean.getZongmaozhong()));
			}

			hanmengList.add(result2FormBean);
			if (monthFlag.equals("")) {
				// 年度累计部分
				result2FormBean = new Result2FormBean();
				resultSet1ys = statement.executeQuery(sql1ys.toString());
				System.out.println("sql1ys=" + sql1ys);
				while (resultSet1ys.next()) {
					result2FormBean.setQihao(resultSet1ys.getString("qihao"));
				}

				resultSet2ys = statement.executeQuery(sql2ys.toString());
				System.out.println("sql2ys=" + sql2ys);
				while (resultSet2ys.next()) {
					result2FormBean.setZonglushu(resultSet2ys.getString("zonglushu"));
				}

				resultSet3ys = statement.executeQuery(sql3ys.toString());
				System.out.println("sql3ys=" + sql3ys);
				while (resultSet3ys.next()) {
					result2FormBean.setFe(Output.getSubValue(resultSet3ys.getString("fe"), 4));
					result2FormBean.setCl(Output.getSubValue(resultSet3ys.getString("cl"), 4));
					result2FormBean.setN(Output.getSubValue(resultSet3ys.getString("n"), 4));
					result2FormBean.setO(Output.getSubValue(resultSet3ys.getString("o"), 4));
					result2FormBean.setHb(Output.getSubValue(resultSet3ys.getString("hb"), 0));
					result2FormBean.setZongmaozhong(Output.getSubValue(resultSet3ys.getString("zongmaozhong"), 0));
					result2FormBean.setMgzongliang(resultSet3ys.getString("mgzongliang"));
					result2FormBean.setTicl4zongliang(resultSet3ys.getString("ticl4zongliang"));
					if (resultSet3ys.getString("junhuishoulv") != null)
						result2FormBean.setJunhuishoulv(Output.getPValue(resultSet3ys.getString("junhuishoulv")));
					result2FormBean.setZongjingzhong(Output.getSubValue(resultSet3ys.getString("zongjingzhong"), 0));
					if (resultSet3ys.getString("zongmaozhong") != null)
						result2FormBean.setJunmaozhong(Output.getAValue(resultSet3ys.getString("zongmaozhong"), result2FormBean.getZonglushu(), 0));
					if (resultSet3ys.getString("zongjingzhong") != null)
						result2FormBean.setJunjingzhong(Output.getAValue(resultSet3ys.getString("zongjingzhong"), result2FormBean.getZonglushu(), 0));
					if (resultSet3ys.getString("mgzongliang") != null)
						result2FormBean
								.setJunmgdanhao(Output.getAkgValue(resultSet3ys.getString("mgzongliang"), result2FormBean.getZongmaozhong(), 3));
					if (resultSet3ys.getString("ticl4zongliang") != null)
						result2FormBean.setTicl4danhao(Output.getAkgValue(resultSet3ys.getString("ticl4zongliang"),
								result2FormBean.getZongmaozhong(), 3));
				}

				resultSet4ys = statement.executeQuery(sql4ys.toString());
				System.out.println("sql4ys=" + sql4ys);
				while (resultSet4ys.next()) {
					result2FormBean.setJ0Aji(resultSet4ys.getString("0Aji"));
					if (resultSet4ys.getString("0Aji") != null)
						result2FormBean.setJ0Ajilv(Output.getPValue(resultSet4ys.getString("0Aji"), result2FormBean.getZongmaozhong()));
				}

				resultSet5ys = statement.executeQuery(sql5ys.toString());
				System.out.println("sql5ys=" + sql5ys);
				while (resultSet5ys.next()) {
					result2FormBean.setJ0ji(resultSet5ys.getString("0ji"));
					if (resultSet5ys.getString("0ji") != null)
						result2FormBean.setJ0jilv(Output.getPValue(resultSet5ys.getString("0ji"), result2FormBean.getZongmaozhong()));
				}

				resultSet6ys = statement.executeQuery(sql6ys.toString());
				System.out.println("sql6ys=" + sql6ys);
				while (resultSet6ys.next()) {
					result2FormBean.setJ1ji(resultSet6ys.getString("1ji"));
					if (resultSet6ys.getString("1ji") != null)
						result2FormBean.setJ1jilv(Output.getPValue(resultSet6ys.getString("1ji"), result2FormBean.getZongmaozhong()));
				}

				resultSet7ys = statement.executeQuery(sql7ys.toString());
				System.out.println("sql7ys=" + sql7ys);
				while (resultSet7ys.next()) {
					result2FormBean.setJ2ji(resultSet7ys.getString("2ji"));
				}

				resultSet8ys = statement.executeQuery(sql8ys.toString());
				System.out.println("sql8ys=" + sql8ys);
				while (resultSet8ys.next()) {
					result2FormBean.setJ3ji(resultSet8ys.getString("3ji"));
				}

				resultSet9ys = statement.executeQuery(sql9ys.toString());
				System.out.println("sql9ys=" + sql9ys);
				while (resultSet9ys.next()) {
					result2FormBean.setJ4ji(resultSet9ys.getString("4ji"));
				}

				resultSet10ys = statement.executeQuery(sql10ys.toString());
				System.out.println("sql10ys=" + sql10ys);
				while (resultSet10ys.next()) {
					result2FormBean.setJ5ji(resultSet10ys.getString("5ji"));
				}

				resultSet11ys = statement.executeQuery(sql11ys.toString());
				System.out.println("sql11ys=" + sql11ys);
				while (resultSet11ys.next()) {
					result2FormBean.setJ2jijiyixia(resultSet11ys.getString("2jijiyixia"));
					if (resultSet11ys.getString("2jijiyixia") != null)
						result2FormBean.setJ2jijiyixialv(Output.getPValue(resultSet11ys.getString("2jijiyixia"), result2FormBean.getZongmaozhong()));
				}

				resultSet12ys = statement.executeQuery(sql12ys.toString());
				System.out.println("sql12ys=" + sql12ys);
				while (resultSet12ys.next()) {
					result2FormBean.setJ0jiyishang(resultSet12ys.getString("0jiyishang"));
					if (resultSet12ys.getString("0jiyishang") != null)
						result2FormBean.setJ0jiyishanglv(Output.getPValue(resultSet12ys.getString("0jiyishang"), result2FormBean.getZongmaozhong()));
				}

				hanmengList.add(result2FormBean);
			}
			return hanmengList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	/**
	 * @param request
	 * @param sqlCondition
	 *            检索条件
	 * @return 月生产数据统计表-除锰
	 * @throws Exception
	 */
	public ArrayList<Result3FormBean> getChumengList(HttpServletRequest request, String sqlCondition, String monthFlag) throws Exception {

		ArrayList<Result3FormBean> chumengList = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList1 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList2 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList3 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList4 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList5 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList6 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList7 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList8 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList9 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList10 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList11 = new ArrayList<Result3FormBean>();
		ArrayList<Result3FormBean> chumengList12 = new ArrayList<Result3FormBean>();

		Result3FormBean result3FormBean = new Result3FormBean();

		StringBuffer sql1 = new StringBuffer();
		StringBuffer sql2 = new StringBuffer();
		StringBuffer sql3 = new StringBuffer();
		StringBuffer sql4 = new StringBuffer();
		StringBuffer sql5 = new StringBuffer();
		StringBuffer sql6 = new StringBuffer();
		StringBuffer sql7 = new StringBuffer();
		StringBuffer sql8 = new StringBuffer();
		StringBuffer sql9 = new StringBuffer();
		StringBuffer sql10 = new StringBuffer();
		StringBuffer sql11 = new StringBuffer();
		StringBuffer sql12 = new StringBuffer();

		StringBuffer sql1s = new StringBuffer();
		StringBuffer sql2s = new StringBuffer();
		StringBuffer sql3s = new StringBuffer();
		StringBuffer sql4s = new StringBuffer();
		StringBuffer sql5s = new StringBuffer();
		StringBuffer sql6s = new StringBuffer();
		StringBuffer sql7s = new StringBuffer();
		StringBuffer sql8s = new StringBuffer();
		StringBuffer sql9s = new StringBuffer();
		StringBuffer sql10s = new StringBuffer();
		StringBuffer sql11s = new StringBuffer();
		StringBuffer sql12s = new StringBuffer();

		StringBuffer sql1ys = new StringBuffer();
		StringBuffer sql2ys = new StringBuffer();
		StringBuffer sql3ys = new StringBuffer();
		StringBuffer sql4ys = new StringBuffer();
		StringBuffer sql5ys = new StringBuffer();
		StringBuffer sql6ys = new StringBuffer();
		StringBuffer sql7ys = new StringBuffer();
		StringBuffer sql8ys = new StringBuffer();
		StringBuffer sql9ys = new StringBuffer();
		StringBuffer sql10ys = new StringBuffer();
		StringBuffer sql11ys = new StringBuffer();
		StringBuffer sql12ys = new StringBuffer();

		StringBuffer sqlBuffer1 = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sql1.append("SELECT qihao FROM ironinfo GROUP BY qihao");
		sql2.append("SELECT qihao,count(guige) AS zonglushu FROM ironinfo WHERE guige ='0.83-25.4'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql3.append(
				"SELECT qihao,SUM(jingzhong*fe)/SUM(jingzhong) AS fe,SUM(jingzhong*cl)/SUM(jingzhong) AS cl,SUM(jingzhong*n)/SUM(jingzhong) AS n,SUM(jingzhong*o)/SUM(jingzhong) AS o,SUM(jingzhong*hb)/SUM(jingzhong) AS hb ,SUM(maozhong) AS zongmaozhong,SUM(mg) AS mgzongliang,SUM(ticl) AS ticl4zongliang,SUM(jingzhong) AS zongjingzhong,SUM(jingzhong)/SUM(maozhong) AS junhuishoulv FROM ironinfo")
				.append(sqlBuffer1).append(" GROUP BY qihao");
		sql4.append("SELECT qihao,SUM(jingzhong) AS 0Aji FROM ironinfo WHERE kaohedengji_chumeng = '0A'").append(sqlBuffer2)
				.append(" GROUP BY qihao");
		sql5.append("SELECT qihao,SUM(jingzhong) AS 0ji FROM ironinfo WHERE kaohedengji_chumeng = '0'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql6.append("SELECT qihao,SUM(jingzhong) AS 1ji FROM ironinfo WHERE kaohedengji_chumeng = '1'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql7.append("SELECT qihao,SUM(jingzhong) AS 2ji FROM ironinfo WHERE kaohedengji_chumeng = '2'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql8.append("SELECT qihao,SUM(jingzhong) AS 3ji FROM ironinfo WHERE kaohedengji_chumeng = '3'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql9.append("SELECT qihao,SUM(jingzhong) AS 4ji FROM ironinfo WHERE kaohedengji_chumeng = '4'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql10.append("SELECT qihao,SUM(jingzhong) AS 5ji FROM ironinfo WHERE kaohedengji_chumeng = '5'").append(sqlBuffer2).append(" GROUP BY qihao");
		sql11.append("SELECT qihao,SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng IN (2,3,4,5)").append(sqlBuffer2)
				.append(" GROUP BY qihao");
		sql12.append("SELECT qihao,SUM(jingzhong) AS 0jiyishang FROM ironinfo WHERE kaohedengji_chumeng IN ('0','0A')").append(sqlBuffer2)
				.append(" GROUP BY qihao");
		// 合计部分
		sql1s.append("SELECT '总计' AS qihao FROM ironinfo");
		sql2s.append("SELECT qihao,count(guige) AS zonglushu FROM ironinfo WHERE guige ='0.83-25.4'").append(sqlBuffer2);
		sql3s.append(
				"SELECT qihao,SUM(jingzhong*fe)/SUM(jingzhong) AS fe,SUM(jingzhong*cl)/SUM(jingzhong) AS cl,SUM(jingzhong*n)/SUM(jingzhong) AS n,SUM(jingzhong*o)/SUM(jingzhong) AS o,SUM(jingzhong*hb)/SUM(jingzhong) AS hb ,SUM(maozhong) AS zongmaozhong,SUM(mg) AS mgzongliang,SUM(ticl) AS ticl4zongliang,SUM(jingzhong) AS zongjingzhong,SUM(jingzhong)/SUM(maozhong) AS junhuishoulv FROM ironinfo")
				.append(sqlBuffer1);
		sql4s.append("SELECT qihao,SUM(jingzhong) AS 0Aji FROM ironinfo WHERE kaohedengji_chumeng = '0A'").append(sqlBuffer2);
		sql5s.append("SELECT qihao,SUM(jingzhong) AS 0ji FROM ironinfo WHERE kaohedengji_chumeng = '0'").append(sqlBuffer2);
		sql6s.append("SELECT qihao,SUM(jingzhong) AS 1ji FROM ironinfo WHERE kaohedengji_chumeng = '1'").append(sqlBuffer2);
		sql7s.append("SELECT qihao,SUM(jingzhong) AS 2ji FROM ironinfo WHERE kaohedengji_chumeng = '2'").append(sqlBuffer2);
		sql8s.append("SELECT qihao,SUM(jingzhong) AS 3ji FROM ironinfo WHERE kaohedengji_chumeng = '3'").append(sqlBuffer2);
		sql9s.append("SELECT qihao,SUM(jingzhong) AS 4ji FROM ironinfo WHERE kaohedengji_chumeng = '4'").append(sqlBuffer2);
		sql10s.append("SELECT qihao,SUM(jingzhong) AS 5ji FROM ironinfo WHERE kaohedengji_chumeng = '5'").append(sqlBuffer2);
		sql11s.append("SELECT qihao,SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng IN (2,3,4,5)").append(sqlBuffer2);
		sql12s.append("SELECT qihao,SUM(jingzhong) AS 0jiyishang FROM ironinfo WHERE kaohedengji_chumeng IN ('0','0A')").append(sqlBuffer2);
		// 年度累计部分
		sql1ys.append("SELECT '年度累计' AS qihao FROM ironinfo");
		sql2ys.append("SELECT qihao,count(guige) AS zonglushu FROM ironinfo WHERE guige ='0.83-25.4'");
		sql3ys.append("SELECT qihao,SUM(jingzhong*fe)/SUM(jingzhong) AS fe,SUM(jingzhong*cl)/SUM(jingzhong) AS cl,SUM(jingzhong*n)/SUM(jingzhong) AS n,SUM(jingzhong*o)/SUM(jingzhong) AS o,SUM(jingzhong*hb)/SUM(jingzhong) AS hb ,SUM(maozhong) AS zongmaozhong,SUM(mg) AS mgzongliang,SUM(ticl) AS ticl4zongliang,SUM(jingzhong) AS zongjingzhong,SUM(jingzhong)/SUM(maozhong) AS junhuishoulv FROM ironinfo");
		sql4ys.append("SELECT qihao,SUM(jingzhong) AS 0Aji FROM ironinfo WHERE kaohedengji_chumeng = '0A'");
		sql5ys.append("SELECT qihao,SUM(jingzhong) AS 0ji FROM ironinfo WHERE kaohedengji_chumeng = '0'");
		sql6ys.append("SELECT qihao,SUM(jingzhong) AS 1ji FROM ironinfo WHERE kaohedengji_chumeng = '1'");
		sql7ys.append("SELECT qihao,SUM(jingzhong) AS 2ji FROM ironinfo WHERE kaohedengji_chumeng = '2'");
		sql8ys.append("SELECT qihao,SUM(jingzhong) AS 3ji FROM ironinfo WHERE kaohedengji_chumeng = '3'");
		sql9ys.append("SELECT qihao,SUM(jingzhong) AS 4ji FROM ironinfo WHERE kaohedengji_chumeng = '4'");
		sql10ys.append("SELECT qihao,SUM(jingzhong) AS 5ji FROM ironinfo WHERE kaohedengji_chumeng = '5'");
		sql11ys.append("SELECT qihao,SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng IN (2,3,4,5)");
		sql12ys.append("SELECT qihao,SUM(jingzhong) AS 0jiyishang FROM ironinfo WHERE kaohedengji_chumeng IN ('0','0A')");

		ResultSet resultSet1 = null;
		ResultSet resultSet2 = null;
		ResultSet resultSet3 = null;
		ResultSet resultSet4 = null;
		ResultSet resultSet5 = null;
		ResultSet resultSet6 = null;
		ResultSet resultSet7 = null;
		ResultSet resultSet8 = null;
		ResultSet resultSet9 = null;
		ResultSet resultSet10 = null;
		ResultSet resultSet11 = null;
		ResultSet resultSet12 = null;

		ResultSet resultSet1s = null;
		ResultSet resultSet2s = null;
		ResultSet resultSet3s = null;
		ResultSet resultSet4s = null;
		ResultSet resultSet5s = null;
		ResultSet resultSet6s = null;
		ResultSet resultSet7s = null;
		ResultSet resultSet8s = null;
		ResultSet resultSet9s = null;
		ResultSet resultSet10s = null;
		ResultSet resultSet11s = null;
		ResultSet resultSet12s = null;

		ResultSet resultSet1ys = null;
		ResultSet resultSet2ys = null;
		ResultSet resultSet3ys = null;
		ResultSet resultSet4ys = null;
		ResultSet resultSet5ys = null;
		ResultSet resultSet6ys = null;
		ResultSet resultSet7ys = null;
		ResultSet resultSet8ys = null;
		ResultSet resultSet9ys = null;
		ResultSet resultSet10ys = null;
		ResultSet resultSet11ys = null;
		ResultSet resultSet12ys = null;

		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();

			resultSet1 = statement.executeQuery(sql1.toString());
			System.out.println("sql1=" + sql1);
			while (resultSet1.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet1.getString("qihao"));
				chumengList1.add(result3FormBean);
			}

			resultSet2 = statement.executeQuery(sql2.toString());
			System.out.println("sql2=" + sql2);
			while (resultSet2.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet2.getString("qihao"));
				result3FormBean.setZonglushu(resultSet2.getString("zonglushu"));
				chumengList2.add(result3FormBean);
			}
			// 横向合并list2到list1
			chumengList = Utility.getList3ByHashMap(chumengList1, chumengList2, 2);

			resultSet3 = statement.executeQuery(sql3.toString());
			System.out.println("sql3=" + sql3);
			while (resultSet3.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet3.getString("qihao"));
				result3FormBean.setFe(Output.getSubValue(resultSet3.getString("fe"), 4));
				result3FormBean.setCl(Output.getSubValue(resultSet3.getString("cl"), 4));
				result3FormBean.setN(Output.getSubValue(resultSet3.getString("n"), 4));
				result3FormBean.setO(Output.getSubValue(resultSet3.getString("o"), 4));
				result3FormBean.setHb(Output.getSubValue(resultSet3.getString("hb"), 0));
				result3FormBean.setZongmaozhong(Output.getSubValue(resultSet3.getString("zongmaozhong"), 0));
				result3FormBean.setMgzongliang(resultSet3.getString("mgzongliang"));
				result3FormBean.setTicl4zongliang(resultSet3.getString("ticl4zongliang"));
				if (resultSet3.getString("junhuishoulv") != null)
					result3FormBean.setJunhuishoulv(Output.getPValue(resultSet3.getString("junhuishoulv")));
				result3FormBean.setZongjingzhong(Output.getSubValue(resultSet3.getString("zongjingzhong"), 0));
				chumengList3.add(result3FormBean);
			}

			chumengList = Utility.getList3ByHashMap(chumengList, chumengList3, 3);

			resultSet4 = statement.executeQuery(sql4.toString());
			System.out.println("sql4=" + sql4);
			while (resultSet4.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet4.getString("qihao"));
				result3FormBean.setJ0Aji(resultSet4.getString("0Aji"));
				chumengList4.add(result3FormBean);
			}

			chumengList = Utility.getList3ByHashMap(chumengList, chumengList4, 4);

			resultSet5 = statement.executeQuery(sql5.toString());
			System.out.println("sql5=" + sql5);
			while (resultSet5.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet5.getString("qihao"));
				result3FormBean.setJ0ji(resultSet5.getString("0ji"));
				chumengList5.add(result3FormBean);
			}

			chumengList = Utility.getList3ByHashMap(chumengList, chumengList5, 5);

			resultSet6 = statement.executeQuery(sql6.toString());
			System.out.println("sql6=" + sql6);
			while (resultSet6.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet6.getString("qihao"));
				result3FormBean.setJ1ji(resultSet6.getString("1ji"));
				chumengList6.add(result3FormBean);
			}

			chumengList = Utility.getList3ByHashMap(chumengList, chumengList6, 6);

			resultSet7 = statement.executeQuery(sql7.toString());
			System.out.println("sql7=" + sql7);
			while (resultSet7.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet7.getString("qihao"));
				result3FormBean.setJ2ji(resultSet7.getString("2ji"));
				chumengList7.add(result3FormBean);
			}

			chumengList = Utility.getList3ByHashMap(chumengList, chumengList7, 7);

			resultSet8 = statement.executeQuery(sql8.toString());
			System.out.println("sql8=" + sql8);
			while (resultSet8.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet8.getString("qihao"));
				result3FormBean.setJ3ji(resultSet8.getString("3ji"));
				chumengList8.add(result3FormBean);
			}
			chumengList = Utility.getList3ByHashMap(chumengList, chumengList8, 8);

			resultSet9 = statement.executeQuery(sql9.toString());
			System.out.println("sql9=" + sql9);
			while (resultSet9.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet9.getString("qihao"));
				result3FormBean.setJ4ji(resultSet9.getString("4ji"));
				chumengList9.add(result3FormBean);
			}
			chumengList = Utility.getList3ByHashMap(chumengList, chumengList9, 9);

			resultSet10 = statement.executeQuery(sql10.toString());
			System.out.println("sql10=" + sql10);
			while (resultSet10.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet10.getString("qihao"));
				result3FormBean.setJ5ji(resultSet10.getString("5ji"));
				chumengList10.add(result3FormBean);
			}
			chumengList = Utility.getList3ByHashMap(chumengList, chumengList10, 10);

			resultSet11 = statement.executeQuery(sql11.toString());
			System.out.println("sql11=" + sql11);
			while (resultSet11.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet11.getString("qihao"));
				result3FormBean.setJ2jijiyixia(resultSet11.getString("2jijiyixia"));
				chumengList11.add(result3FormBean);
			}
			chumengList = Utility.getList3ByHashMap(chumengList, chumengList11, 11);

			resultSet12 = statement.executeQuery(sql12.toString());
			System.out.println("sql12=" + sql12);
			while (resultSet12.next()) {
				result3FormBean = new Result3FormBean();
				result3FormBean.setQihao(resultSet12.getString("qihao"));
				result3FormBean.setJ0jiyishang(resultSet12.getString("0jiyishang"));
				chumengList12.add(result3FormBean);
			}
			chumengList = Utility.getList3ByHashMap(chumengList, chumengList12, 12);

			// 合计部分
			result3FormBean = new Result3FormBean();
			resultSet1s = statement.executeQuery(sql1s.toString());
			System.out.println("sql1s=" + sql1s);
			while (resultSet1s.next()) {
				result3FormBean.setQihao(resultSet1s.getString("qihao"));
			}

			resultSet2s = statement.executeQuery(sql2s.toString());
			System.out.println("sql2s=" + sql2s);
			while (resultSet2s.next()) {
				result3FormBean.setZonglushu(resultSet2s.getString("zonglushu"));
			}

			resultSet3s = statement.executeQuery(sql3s.toString());
			System.out.println("sql3s=" + sql3s);
			while (resultSet3s.next()) {
				result3FormBean.setFe(Output.getSubValue(resultSet3s.getString("fe"), 4));
				result3FormBean.setCl(Output.getSubValue(resultSet3s.getString("cl"), 4));
				result3FormBean.setN(Output.getSubValue(resultSet3s.getString("n"), 4));
				result3FormBean.setO(Output.getSubValue(resultSet3s.getString("o"), 4));
				result3FormBean.setHb(Output.getSubValue(resultSet3s.getString("hb"), 0));
				result3FormBean.setZongmaozhong(Output.getSubValue(resultSet3s.getString("zongmaozhong"), 0));
				result3FormBean.setMgzongliang(resultSet3s.getString("mgzongliang"));
				result3FormBean.setTicl4zongliang(resultSet3s.getString("ticl4zongliang"));
				if (resultSet3s.getString("junhuishoulv") != null)
					result3FormBean.setJunhuishoulv(Output.getPValue(resultSet3s.getString("junhuishoulv")));
				result3FormBean.setZongjingzhong(Output.getSubValue(resultSet3s.getString("zongjingzhong"), 0));
				if (resultSet3s.getString("zongmaozhong") != null)
					result3FormBean.setJunmaozhong(Output.getAValue(resultSet3s.getString("zongmaozhong"), result3FormBean.getZonglushu(), 0));
				if (resultSet3s.getString("zongjingzhong") != null)
					result3FormBean.setJunjingzhong(Output.getAValue(resultSet3s.getString("zongjingzhong"), result3FormBean.getZonglushu(), 0));
				if (resultSet3s.getString("mgzongliang") != null)
					result3FormBean.setJunmgdanhao(Output.getAkgValue(resultSet3s.getString("mgzongliang"), result3FormBean.getZongmaozhong(), 3));
				if (resultSet3s.getString("ticl4zongliang") != null)
					result3FormBean.setTicl4danhao(Output.getAkgValue(resultSet3s.getString("ticl4zongliang"), result3FormBean.getZongmaozhong(), 3));
			}

			resultSet4s = statement.executeQuery(sql4s.toString());
			System.out.println("sql4s=" + sql4s);
			while (resultSet4s.next()) {
				result3FormBean.setJ0Aji(resultSet4s.getString("0Aji"));
				if (resultSet4s.getString("0Aji") != null)
					result3FormBean.setJ0Ajilv(Output.getPValue(resultSet4s.getString("0Aji"), result3FormBean.getZongmaozhong()));
			}

			resultSet5s = statement.executeQuery(sql5s.toString());
			System.out.println("sql5s=" + sql5s);
			while (resultSet5s.next()) {
				result3FormBean.setJ0ji(resultSet5s.getString("0ji"));
				if (resultSet5s.getString("0ji") != null)
					result3FormBean.setJ0jilv(Output.getPValue(resultSet5s.getString("0ji"), result3FormBean.getZongmaozhong()));
			}

			resultSet6s = statement.executeQuery(sql6s.toString());
			System.out.println("sql6s=" + sql6s);
			while (resultSet6s.next()) {
				result3FormBean.setJ1ji(resultSet6s.getString("1ji"));
				if (resultSet6s.getString("1ji") != null)
					result3FormBean.setJ1jilv(Output.getPValue(resultSet6s.getString("1ji"), result3FormBean.getZongmaozhong()));
			}

			resultSet7s = statement.executeQuery(sql7s.toString());
			System.out.println("sql7s=" + sql7s);
			while (resultSet7s.next()) {
				result3FormBean.setJ2ji(resultSet7s.getString("2ji"));
			}

			resultSet8s = statement.executeQuery(sql8s.toString());
			System.out.println("sql8s=" + sql8s);
			while (resultSet8s.next()) {
				result3FormBean.setJ3ji(resultSet8s.getString("3ji"));
			}

			resultSet9s = statement.executeQuery(sql9s.toString());
			System.out.println("sql9s=" + sql9s);
			while (resultSet9s.next()) {
				result3FormBean.setJ4ji(resultSet9s.getString("4ji"));
			}

			resultSet10s = statement.executeQuery(sql10s.toString());
			System.out.println("sql10s=" + sql10s);
			while (resultSet10s.next()) {
				result3FormBean.setJ5ji(resultSet10s.getString("5ji"));
			}

			resultSet11s = statement.executeQuery(sql11s.toString());
			System.out.println("sql11s=" + sql11s);
			while (resultSet11s.next()) {
				result3FormBean.setJ2jijiyixia(resultSet11s.getString("2jijiyixia"));
				if (resultSet11s.getString("2jijiyixia") != null)
					result3FormBean.setJ2jijiyixialv(Output.getPValue(resultSet11s.getString("2jijiyixia"), result3FormBean.getZongmaozhong()));
			}

			resultSet12s = statement.executeQuery(sql12s.toString());
			System.out.println("sql12s=" + sql12s);
			while (resultSet12s.next()) {
				result3FormBean.setJ0jiyishang(resultSet12s.getString("0jiyishang"));
				if (resultSet12s.getString("0jiyishang") != null)
					result3FormBean.setJ0jiyishanglv(Output.getPValue(resultSet12s.getString("0jiyishang"), result3FormBean.getZongmaozhong()));
			}

			chumengList.add(result3FormBean);
			if (monthFlag.equals("")) {
				// 年度累计部分
				result3FormBean = new Result3FormBean();
				resultSet1ys = statement.executeQuery(sql1ys.toString());
				System.out.println("sql1ys=" + sql1ys);
				while (resultSet1ys.next()) {
					result3FormBean.setQihao(resultSet1ys.getString("qihao"));
				}

				resultSet2ys = statement.executeQuery(sql2ys.toString());
				System.out.println("sql2ys=" + sql2ys);
				while (resultSet2ys.next()) {
					result3FormBean.setZonglushu(resultSet2ys.getString("zonglushu"));
				}

				resultSet3ys = statement.executeQuery(sql3ys.toString());
				System.out.println("sql3ys=" + sql3ys);
				while (resultSet3ys.next()) {
					result3FormBean.setFe(Output.getSubValue(resultSet3ys.getString("fe"), 4));
					result3FormBean.setCl(Output.getSubValue(resultSet3ys.getString("cl"), 4));
					result3FormBean.setN(Output.getSubValue(resultSet3ys.getString("n"), 4));
					result3FormBean.setO(Output.getSubValue(resultSet3ys.getString("o"), 4));
					result3FormBean.setHb(Output.getSubValue(resultSet3ys.getString("hb"), 0));
					result3FormBean.setZongmaozhong(Output.getSubValue(resultSet3ys.getString("zongmaozhong"), 0));
					result3FormBean.setMgzongliang(resultSet3ys.getString("mgzongliang"));
					result3FormBean.setTicl4zongliang(resultSet3ys.getString("ticl4zongliang"));
					if (resultSet3ys.getString("junhuishoulv") != null)
						result3FormBean.setJunhuishoulv(Output.getPValue(resultSet3ys.getString("junhuishoulv")));
					result3FormBean.setZongjingzhong(Output.getSubValue(resultSet3ys.getString("zongjingzhong"), 0));
					if (resultSet3ys.getString("zongmaozhong") != null)
						result3FormBean.setJunmaozhong(Output.getAValue(resultSet3ys.getString("zongmaozhong"), result3FormBean.getZonglushu(), 0));
					if (resultSet3ys.getString("zongjingzhong") != null)
						result3FormBean.setJunjingzhong(Output.getAValue(resultSet3ys.getString("zongjingzhong"), result3FormBean.getZonglushu(), 0));
					if (resultSet3ys.getString("mgzongliang") != null)
						result3FormBean
								.setJunmgdanhao(Output.getAkgValue(resultSet3ys.getString("mgzongliang"), result3FormBean.getZongmaozhong(), 3));
					if (resultSet3ys.getString("ticl4zongliang") != null)
						result3FormBean.setTicl4danhao(Output.getAkgValue(resultSet3ys.getString("ticl4zongliang"),
								result3FormBean.getZongmaozhong(), 3));
				}

				resultSet4ys = statement.executeQuery(sql4ys.toString());
				System.out.println("sql4ys=" + sql4ys);
				while (resultSet4ys.next()) {
					result3FormBean.setJ0Aji(resultSet4ys.getString("0Aji"));
					if (resultSet4ys.getString("0Aji") != null)
						result3FormBean.setJ0Ajilv(Output.getPValue(resultSet4ys.getString("0Aji"), result3FormBean.getZongmaozhong()));
				}

				resultSet5ys = statement.executeQuery(sql5ys.toString());
				System.out.println("sql5ys=" + sql5ys);
				while (resultSet5ys.next()) {
					result3FormBean.setJ0ji(resultSet5ys.getString("0ji"));
					if (resultSet5ys.getString("0ji") != null)
						result3FormBean.setJ0jilv(Output.getPValue(resultSet5ys.getString("0ji"), result3FormBean.getZongmaozhong()));
				}

				resultSet6ys = statement.executeQuery(sql6ys.toString());
				System.out.println("sql6ys=" + sql6ys);
				while (resultSet6ys.next()) {
					result3FormBean.setJ1ji(resultSet6ys.getString("1ji"));
					if (resultSet6ys.getString("1ji") != null)
						result3FormBean.setJ1jilv(Output.getPValue(resultSet6ys.getString("1ji"), result3FormBean.getZongmaozhong()));
				}

				resultSet7ys = statement.executeQuery(sql7ys.toString());
				System.out.println("sql7ys=" + sql7ys);
				while (resultSet7ys.next()) {
					result3FormBean.setJ2ji(resultSet7ys.getString("2ji"));
				}

				resultSet8ys = statement.executeQuery(sql8ys.toString());
				System.out.println("sql8ys=" + sql8ys);
				while (resultSet8ys.next()) {
					result3FormBean.setJ3ji(resultSet8ys.getString("3ji"));
				}

				resultSet9ys = statement.executeQuery(sql9ys.toString());
				System.out.println("sql9ys=" + sql9ys);
				while (resultSet9ys.next()) {
					result3FormBean.setJ4ji(resultSet9ys.getString("4ji"));
				}

				resultSet10ys = statement.executeQuery(sql10ys.toString());
				System.out.println("sql10ys=" + sql10ys);
				while (resultSet10ys.next()) {
					result3FormBean.setJ5ji(resultSet10ys.getString("5ji"));
				}

				resultSet11ys = statement.executeQuery(sql11ys.toString());
				System.out.println("sql11ys=" + sql11ys);
				while (resultSet11ys.next()) {
					result3FormBean.setJ2jijiyixia(resultSet11ys.getString("2jijiyixia"));
					if (resultSet11ys.getString("2jijiyixia") != null)
						result3FormBean.setJ2jijiyixialv(Output.getPValue(resultSet11ys.getString("2jijiyixia"), result3FormBean.getZongmaozhong()));
				}

				resultSet12ys = statement.executeQuery(sql12ys.toString());
				System.out.println("sql12ys=" + sql12ys);
				while (resultSet12ys.next()) {
					result3FormBean.setJ0jiyishang(resultSet12ys.getString("0jiyishang"));
					if (resultSet12ys.getString("0jiyishang") != null)
						result3FormBean.setJ0jiyishanglv(Output.getPValue(resultSet12ys.getString("0jiyishang"), result3FormBean.getZongmaozhong()));
				}

				chumengList.add(result3FormBean);
			}
			return chumengList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	/**
	 * @param request
	 * @param sqlCondition
	 *            检索条件
	 * @return 月等外钛统计表
	 * @throws Exception
	 */
	public ArrayList<Result4FormBean> getWaitaiList(HttpServletRequest request, String sqlCondition) throws Exception {

		ArrayList<Result4FormBean> waitaiList = new ArrayList<Result4FormBean>();

		StringBuffer sqlBuffer = new StringBuffer();
		StringBuffer sqlBuffer1 = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sqlBuffer.append("SELECT ");
		sqlBuffer.append("t1.qihao, ");
		sqlBuffer.append("t1.zonglushu, ");
		sqlBuffer.append("t2.zongmaozhong/t1.zonglushu AS junmaozhong, ");
		sqlBuffer.append("t2.zongjingzhong/t1.zonglushu AS junjingzhong, ");
		sqlBuffer.append("t2.zongjingzhong/t2.zongmaozhong AS junhuishoulv, ");
		sqlBuffer.append("t2.dipi/t1.zonglushu AS dipi, ");
		sqlBuffer.append("t2.shangmao/t1.zonglushu AS shangmao, ");
		sqlBuffer.append("t2.pabi/t1.zonglushu AS pabi, ");
		sqlBuffer.append("t2.feidipi/t1.zonglushu AS feidipi, ");
		sqlBuffer.append("t2.feidipi/t2.zongmaozhong AS feidipibili, ");
		sqlBuffer.append("t2.feishangmao/t1.zonglushu AS feishangmao, ");
		sqlBuffer.append("t2.feishangmao/t2.zongmaozhong AS feishangmaobili, ");
		sqlBuffer.append("t2.feipabi/t1.zonglushu AS feipabi, ");
		sqlBuffer.append("t2.feipabi/t2.zongmaozhong AS feipabibili, ");
		sqlBuffer.append("t2.shaixuanfeiliao/t1.zonglushu AS shaixuanfeiliao, ");
		sqlBuffer.append("t2.cixuanfeiliao/t1.zonglushu AS cixuanfeiliao, ");
		sqlBuffer.append("t2.shouxuanfeiliao/t1.zonglushu AS shouxuanfeiliao, ");
		sqlBuffer.append("t2.sunhao/t1.zonglushu AS sunhao ");
		sqlBuffer.append("FROM ");
		sqlBuffer.append("(SELECT qihao,count(guige) AS zonglushu FROM ironinfo WHERE guige ='0.83-25.4'").append(sqlBuffer2)
				.append(" GROUP BY qihao)t1, ");
		sqlBuffer.append("(SELECT  ");
		sqlBuffer.append("qihao,sum(maozhong) AS zongmaozhong, ");
		sqlBuffer.append("sum(jingzhong) AS zongjingzhong, ");
		sqlBuffer.append("SUM(dipi) AS dipi, ");
		sqlBuffer.append("SUM(shangmao) AS shangmao, ");
		sqlBuffer.append("SUM(pabi) AS pabi, ");
		sqlBuffer.append("SUM(feidipi) AS feidipi, ");
		sqlBuffer.append("SUM(feishangmao) AS feishangmao, ");
		sqlBuffer.append("SUM(feipabi) AS feipabi, ");
		sqlBuffer.append("SUM(feitaifen) AS shaixuanfeiliao, ");
		sqlBuffer.append("SUM(cixuan) AS cixuanfeiliao, ");
		sqlBuffer.append("SUM(shouxuanfeiliao) AS shouxuanfeiliao, ");
		sqlBuffer.append("SUM(sunhao) AS sunhao   ");
		sqlBuffer.append("FROM ironinfo ").append(sqlBuffer1).append(" GROUP BY qihao)t2 ");
		sqlBuffer.append("WHERE ");
		sqlBuffer.append("t1.qihao = t2.qihao ");
		sqlBuffer.append("GROUP BY ");
		sqlBuffer.append("t1.qihao ");

		System.out.println("sql=" + sqlBuffer);

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();
			resultSet = statement.executeQuery(sqlBuffer.toString());

			while (resultSet.next()) {

				Result4FormBean result4FormBean = new Result4FormBean();

				result4FormBean.setQihao(resultSet.getString("qihao"));
				result4FormBean.setZonglushu(resultSet.getString("zonglushu"));
				result4FormBean.setJunmaozhong(Output.getSubValue(resultSet.getString("junmaozhong"), 0));
				result4FormBean.setJunjingzhong(Output.getSubValue(resultSet.getString("junjingzhong"), 0));
				if (resultSet.getString("junhuishoulv") != null)
					result4FormBean.setJunhuishoulv(Output.getPValue(resultSet.getString("junhuishoulv")));
				result4FormBean.setDipi(Output.getSubValue(resultSet.getString("dipi"), 2));
				result4FormBean.setShangmao(Output.getSubValue(resultSet.getString("shangmao"), 2));
				result4FormBean.setPabi(Output.getSubValue(resultSet.getString("pabi"), 2));
				result4FormBean.setFeidipi(Output.getSubValue(resultSet.getString("feidipi"), 2));
				if (resultSet.getString("feidipibili") != null)
					result4FormBean.setFeidipibili(Output.getPValue(resultSet.getString("feidipibili")));
				result4FormBean.setFeishangmao(Output.getSubValue(resultSet.getString("feishangmao"), 2));
				if (resultSet.getString("feishangmaobili") != null)
					result4FormBean.setFeishangmaobili(Output.getPValue(resultSet.getString("feishangmaobili")));
				result4FormBean.setFeipabi(Output.getSubValue(resultSet.getString("feipabi"), 2));
				if (resultSet.getString("feipabibili") != null)
					result4FormBean.setFeipabibili(Output.getPValue(resultSet.getString("feipabibili")));
				result4FormBean.setShaixuanfeiliao(Output.getSubValue(resultSet.getString("shaixuanfeiliao"), 2));
				result4FormBean.setCixuanfeiliao(Output.getSubValue(resultSet.getString("cixuanfeiliao"), 1));
				result4FormBean.setShouxuanfeiliao(Output.getSubValue(resultSet.getString("shouxuanfeiliao"), 2));
				result4FormBean.setSunhao(Output.getSubValue(resultSet.getString("sunhao"), 2));

				waitaiList.add(result4FormBean);
			}
			return waitaiList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	/**
	 * @param request
	 * @param sqlCondition
	 *            检索条件
	 * @return 月指标统计表
	 * @throws Exception
	 */
	public ArrayList<Result5FormBean> getZhibiaoList(HttpServletRequest request, String sqlCondition) throws Exception {

		ArrayList<Result5FormBean> zhibiaoList = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList1 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList2 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList3 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList4 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList5 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList6 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList7 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList8 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList9 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList10 = new ArrayList<Result5FormBean>();
		ArrayList<Result5FormBean> zhibiaoList11 = new ArrayList<Result5FormBean>();

		Result5FormBean result5FormBean = new Result5FormBean();

		StringBuffer sql1 = new StringBuffer();
		StringBuffer sql2 = new StringBuffer();
		StringBuffer sql3 = new StringBuffer();
		StringBuffer sql4 = new StringBuffer();
		StringBuffer sql5 = new StringBuffer();
		StringBuffer sql6 = new StringBuffer();
		StringBuffer sql7 = new StringBuffer();
		StringBuffer sql8 = new StringBuffer();
		StringBuffer sql9 = new StringBuffer();
		StringBuffer sql10 = new StringBuffer();
		StringBuffer sql11 = new StringBuffer();

		StringBuffer sql1s = new StringBuffer();
		StringBuffer sql2s = new StringBuffer();
		StringBuffer sql3s = new StringBuffer();
		StringBuffer sql4s = new StringBuffer();
		StringBuffer sql5s = new StringBuffer();
		StringBuffer sql6s = new StringBuffer();
		StringBuffer sql7s = new StringBuffer();
		StringBuffer sql8s = new StringBuffer();
		StringBuffer sql9s = new StringBuffer();
		StringBuffer sql10s = new StringBuffer();
		StringBuffer sql11s = new StringBuffer();

		StringBuffer sqlBuffer1 = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sql1.append("SELECT qihao FROM ironinfo GROUP BY qihao");
		sql2.append("SELECT qihao, SUM(maozhong) AS zongmaozhong, SUM(jingzhong) AS zongjingzhong FROM ironinfo").append(sqlBuffer1)
				.append(" GROUP BY qihao");
		sql3.append("SELECT qihao, SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng IN (2,3,4,5)").append(sqlBuffer2)
				.append(" GROUP BY qihao");
		sql4.append("SELECT qihao, SUM(jingzhong) AS fe008 FROM ironinfo WHERE fe > 0.08").append(sqlBuffer2).append(" GROUP BY qihao");
		sql5.append("SELECT qihao, SUM(jingzhong) AS fe005 FROM ironinfo WHERE fe > 0.05").append(sqlBuffer2).append(" GROUP BY qihao");
		sql6.append("SELECT qihao, SUM(jingzhong) AS cl008 FROM ironinfo WHERE cl > 0.08").append(sqlBuffer2).append(" GROUP BY qihao");
		sql7.append("SELECT qihao, SUM(jingzhong) AS cl006 FROM ironinfo WHERE cl > 0.06").append(sqlBuffer2).append(" GROUP BY qihao");
		sql8.append("SELECT qihao, SUM(jingzhong) AS o008 FROM ironinfo WHERE o > 0.08").append(sqlBuffer2).append(" GROUP BY qihao");
		sql9.append("SELECT qihao, SUM(jingzhong) AS o005 FROM ironinfo WHERE o > 0.05").append(sqlBuffer2).append(" GROUP BY qihao");
		sql10.append("SELECT qihao, SUM(jingzhong) AS n001 FROM ironinfo WHERE n > 0.01").append(sqlBuffer2).append(" GROUP BY qihao");
		sql11.append("SELECT qihao, SUM(jingzhong) AS fecl008 FROM ironinfo WHERE fe > 0.08 and cl >0.08").append(sqlBuffer2)
				.append(" GROUP BY qihao");
		// 合计部分
		sql1s.append("SELECT '总计' AS qihao FROM ironinfo");
		sql2s.append("SELECT qihao, SUM(maozhong) AS zongmaozhong, SUM(jingzhong) AS zongjingzhong FROM ironinfo").append(sqlBuffer1);
		sql3s.append("SELECT qihao, SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng IN (2,3,4,5)").append(sqlBuffer2);
		sql4s.append("SELECT qihao, SUM(jingzhong) AS fe008 FROM ironinfo WHERE fe > 0.08").append(sqlBuffer2);
		sql5s.append("SELECT qihao, SUM(jingzhong) AS fe005 FROM ironinfo WHERE fe > 0.05").append(sqlBuffer2);
		sql6s.append("SELECT qihao, SUM(jingzhong) AS cl008 FROM ironinfo WHERE cl > 0.08").append(sqlBuffer2);
		sql7s.append("SELECT qihao, SUM(jingzhong) AS cl006 FROM ironinfo WHERE cl > 0.06").append(sqlBuffer2);
		sql8s.append("SELECT qihao, SUM(jingzhong) AS o008 FROM ironinfo WHERE o > 0.08").append(sqlBuffer2);
		sql9s.append("SELECT qihao, SUM(jingzhong) AS o005 FROM ironinfo WHERE o > 0.05").append(sqlBuffer2);
		sql10s.append("SELECT qihao, SUM(jingzhong) AS n001 FROM ironinfo WHERE n > 0.01").append(sqlBuffer2);
		sql11s.append("SELECT qihao, SUM(jingzhong) AS fecl008 FROM ironinfo WHERE fe > 0.08 and cl >0.08").append(sqlBuffer2);

		ResultSet resultSet1 = null;
		ResultSet resultSet2 = null;
		ResultSet resultSet3 = null;
		ResultSet resultSet4 = null;
		ResultSet resultSet5 = null;
		ResultSet resultSet6 = null;
		ResultSet resultSet7 = null;
		ResultSet resultSet8 = null;
		ResultSet resultSet9 = null;
		ResultSet resultSet10 = null;
		ResultSet resultSet11 = null;

		ResultSet resultSet1s = null;
		ResultSet resultSet2s = null;
		ResultSet resultSet3s = null;
		ResultSet resultSet4s = null;
		ResultSet resultSet5s = null;
		ResultSet resultSet6s = null;
		ResultSet resultSet7s = null;
		ResultSet resultSet8s = null;
		ResultSet resultSet9s = null;
		ResultSet resultSet10s = null;
		ResultSet resultSet11s = null;

		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();

			resultSet1 = statement.executeQuery(sql1.toString());
			System.out.println("sql1=" + sql1);
			while (resultSet1.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet1.getString("qihao"));
				zhibiaoList1.add(result5FormBean);
			}

			resultSet2 = statement.executeQuery(sql2.toString());
			System.out.println("sql2=" + sql2);
			while (resultSet2.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet2.getString("qihao"));
				result5FormBean.setZongmaozhong(resultSet2.getString("zongmaozhong"));
				result5FormBean.setZongjingzhong(resultSet2.getString("zongjingzhong"));
				zhibiaoList2.add(result5FormBean);
			}
			// 横向合并list2到list1
			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList1, zhibiaoList2, 2);

			resultSet3 = statement.executeQuery(sql3.toString());
			System.out.println("sql3=" + sql3);
			while (resultSet3.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet3.getString("qihao"));
				result5FormBean.setJ2jijiyixia(resultSet3.getString("2jijiyixia"));
				zhibiaoList3.add(result5FormBean);
			}

			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList, zhibiaoList3, 3);

			resultSet4 = statement.executeQuery(sql4.toString());
			System.out.println("sql4=" + sql4);
			while (resultSet4.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet4.getString("qihao"));
				result5FormBean.setFe008(resultSet4.getString("fe008"));
				zhibiaoList4.add(result5FormBean);
			}

			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList, zhibiaoList4, 4);

			resultSet5 = statement.executeQuery(sql5.toString());
			System.out.println("sql5=" + sql5);
			while (resultSet5.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet5.getString("qihao"));
				result5FormBean.setFe005(resultSet5.getString("fe005"));
				zhibiaoList5.add(result5FormBean);
			}

			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList, zhibiaoList5, 5);

			resultSet6 = statement.executeQuery(sql6.toString());
			System.out.println("sql6=" + sql6);
			while (resultSet6.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet6.getString("qihao"));
				result5FormBean.setCl008(resultSet6.getString("cl008"));
				zhibiaoList6.add(result5FormBean);
			}

			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList, zhibiaoList6, 6);

			resultSet7 = statement.executeQuery(sql7.toString());
			System.out.println("sql7=" + sql7);
			while (resultSet7.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet7.getString("qihao"));
				result5FormBean.setCl006(resultSet7.getString("cl006"));
				zhibiaoList7.add(result5FormBean);
			}

			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList, zhibiaoList7, 7);

			resultSet8 = statement.executeQuery(sql8.toString());
			System.out.println("sql8=" + sql8);
			while (resultSet8.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet8.getString("qihao"));
				result5FormBean.setO008(resultSet8.getString("o008"));
				zhibiaoList8.add(result5FormBean);
			}

			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList, zhibiaoList8, 8);

			resultSet9 = statement.executeQuery(sql9.toString());
			System.out.println("sql9=" + sql9);
			while (resultSet9.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet9.getString("qihao"));
				result5FormBean.setO005(resultSet9.getString("o005"));
				zhibiaoList9.add(result5FormBean);
			}

			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList, zhibiaoList9, 9);

			resultSet10 = statement.executeQuery(sql10.toString());
			System.out.println("sql10=" + sql10);
			while (resultSet10.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet10.getString("qihao"));
				result5FormBean.setN001(resultSet10.getString("n001"));
				zhibiaoList10.add(result5FormBean);
			}

			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList, zhibiaoList10, 10);

			resultSet11 = statement.executeQuery(sql11.toString());
			System.out.println("sql11=" + sql11);
			while (resultSet11.next()) {
				result5FormBean = new Result5FormBean();
				result5FormBean.setQihao(resultSet11.getString("qihao"));
				result5FormBean.setFecl008(resultSet11.getString("fecl008"));
				zhibiaoList11.add(result5FormBean);
			}

			zhibiaoList = Utility.getList5ByHashMap(zhibiaoList, zhibiaoList11, 11);

			// 合计部分
			result5FormBean = new Result5FormBean();
			resultSet1s = statement.executeQuery(sql1s.toString());
			while (resultSet1s.next()) {
				result5FormBean.setQihao(resultSet1s.getString("qihao"));
			}

			resultSet2s = statement.executeQuery(sql2s.toString());
			while (resultSet2s.next()) {
				result5FormBean.setZongmaozhong(resultSet2s.getString("zongmaozhong"));
				result5FormBean.setZongjingzhong(resultSet2s.getString("zongjingzhong"));
			}

			resultSet3s = statement.executeQuery(sql3s.toString());
			while (resultSet3s.next()) {
				if (resultSet3s.getString("2jijiyixia") != null)
					result5FormBean.setJ2jijiyixialv(Output.getPValue(resultSet3s.getString("2jijiyixia"), result5FormBean.getZongmaozhong()));

			}

			resultSet4s = statement.executeQuery(sql4s.toString());
			while (resultSet4s.next()) {
				result5FormBean.setFe008(resultSet4s.getString("fe008"));
				if (resultSet4s.getString("fe008") != null)
					result5FormBean.setFe008bili(Output.getPValue(resultSet4s.getString("fe008"), result5FormBean.getZongmaozhong()));
			}

			resultSet5s = statement.executeQuery(sql5s.toString());
			while (resultSet5s.next()) {
				result5FormBean.setFe005(resultSet5s.getString("fe005"));
				if (resultSet5s.getString("fe005") != null)
					result5FormBean.setFe005bili(Output.getPValue(resultSet5s.getString("fe005"), result5FormBean.getZongmaozhong()));
			}

			resultSet6s = statement.executeQuery(sql6s.toString());
			while (resultSet6s.next()) {
				result5FormBean.setCl008(resultSet6s.getString("cl008"));
				if (resultSet6s.getString("cl008") != null)
					result5FormBean.setCl008bili(Output.getPValue(resultSet6s.getString("cl008"), result5FormBean.getZongmaozhong()));
			}

			resultSet7s = statement.executeQuery(sql7s.toString());
			while (resultSet7s.next()) {
				result5FormBean.setCl006(resultSet7s.getString("cl006"));
				if (resultSet7s.getString("cl006") != null)
					result5FormBean.setCl006bili(Output.getPValue(resultSet7s.getString("cl006"), result5FormBean.getZongmaozhong()));
			}

			resultSet8s = statement.executeQuery(sql8s.toString());
			while (resultSet8s.next()) {
				result5FormBean.setO008(resultSet8s.getString("o008"));
				if (resultSet8s.getString("O008") != null)
					result5FormBean.setO008bili(Output.getPValue(resultSet8s.getString("O008"), result5FormBean.getZongmaozhong()));
			}

			resultSet9s = statement.executeQuery(sql9s.toString());
			while (resultSet9s.next()) {
				result5FormBean.setO005(resultSet9s.getString("o005"));
				if (resultSet9s.getString("O005") != null)
					result5FormBean.setO005bili(Output.getPValue(resultSet9s.getString("O005"), result5FormBean.getZongmaozhong()));
			}

			resultSet10s = statement.executeQuery(sql10s.toString());
			while (resultSet10s.next()) {
				result5FormBean.setN001(resultSet10s.getString("n001"));
				if (resultSet10s.getString("n001") != null)
					result5FormBean.setN001bili(Output.getPValue(resultSet10s.getString("n001"), result5FormBean.getZongmaozhong()));
			}

			resultSet11s = statement.executeQuery(sql11s.toString());
			while (resultSet11s.next()) {
				result5FormBean.setFecl008(resultSet11s.getString("fecl008"));
				if (resultSet11s.getString("fecl008") != null)
					result5FormBean.setFecl008bili(Output.getPValue(resultSet11s.getString("fecl008"), result5FormBean.getZongmaozhong()));
			}
			zhibiaoList.add(result5FormBean);

			return zhibiaoList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	/**
	 * @param request
	 * @param sqlCondition
	 *            检索条件
	 * @return 单炉生产数据统计表
	 * @throws Exception
	 */
	public ArrayList<Result6FormBean> getDanluList(HttpServletRequest request, String sqlCondition) throws Exception {

		ArrayList<Result6FormBean> danluList = new ArrayList<Result6FormBean>();
		ArrayList<Result6FormBean> danluList0 = new ArrayList<Result6FormBean>();
		ArrayList<Result6FormBean> danluList1 = new ArrayList<Result6FormBean>();
		ArrayList<Result6FormBean> danluList2 = new ArrayList<Result6FormBean>();
		ArrayList<Result6FormBean> danluList3 = new ArrayList<Result6FormBean>();
		ArrayList<Result6FormBean> danluList4 = new ArrayList<Result6FormBean>();
		ArrayList<Result6FormBean> danluList5 = new ArrayList<Result6FormBean>();
		ArrayList<Result6FormBean> danluList6 = new ArrayList<Result6FormBean>();

		Result6FormBean result6FormBean = new Result6FormBean();

		StringBuffer sql1 = new StringBuffer();
		StringBuffer sql2 = new StringBuffer();
		StringBuffer sql3 = new StringBuffer();
		StringBuffer sql4 = new StringBuffer();
		StringBuffer sql5 = new StringBuffer();
		StringBuffer sql6 = new StringBuffer();

		StringBuffer sqlBuffer1 = new StringBuffer();

		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sql1.append("SELECT ");
		sql1.append("shengchanluhao,");
		sql1.append("SUM(maozhong) AS zongmaozhong, ");
		sql1.append("SUM(jingzhong)AS zongjingzhong, ");
		sql1.append("SUM(jingzhong)/SUM(maozhong) AS chengpinlv, ");
		sql1.append("SUM(mg)/SUM(maozhong)*1000 AS mgdanhao, ");
		sql1.append("SUM(jingzhong*fe)/SUM(jingzhong) AS fe, ");
		sql1.append("SUM(jingzhong*cl)/SUM(jingzhong) AS cl, ");
		sql1.append("SUM(jingzhong*n)/SUM(jingzhong) AS n, ");
		sql1.append("SUM(jingzhong*o)/SUM(jingzhong) AS o ");
		sql1.append("FROM ironinfo").append(sqlBuffer1).append(" GROUP BY shengchanluhao ");

		sql2.append("SELECT shengchanluhao, SUM(jingzhong) AS 0Aji FROM ironinfo WHERE kaohedengji_chumeng = '0A'").append(sqlBuffer2)
				.append(" GROUP BY shengchanluhao");
		sql3.append("SELECT shengchanluhao, SUM(jingzhong) AS 0ji FROM ironinfo WHERE kaohedengji_chumeng = '0'").append(sqlBuffer2)
				.append(" GROUP BY shengchanluhao");
		sql4.append("SELECT shengchanluhao, SUM(jingzhong) AS 1ji FROM ironinfo WHERE kaohedengji_chumeng = '1'").append(sqlBuffer2)
				.append(" GROUP BY shengchanluhao");
		sql5.append("SELECT shengchanluhao, SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng IN (2,3,4,5)").append(sqlBuffer2)
				.append(" GROUP BY shengchanluhao");

		sql6.append("SELECT ");
		sql6.append("shengchanluhao, COUNT(guige) AS zonglucishu, ");
		sql6.append("SUM(dipi)/COUNT(guige) AS dipi, ");
		sql6.append("SUM(shangmao)/COUNT(guige) AS shangmao, ");
		sql6.append("SUM(pabi)/COUNT(guige) AS pabi, ");
		sql6.append("SUM(feidipi)/COUNT(guige) AS feidipi, ");
		sql6.append("SUM(feishangmao)/COUNT(guige) AS feishangmao, ");
		sql6.append("SUM(feipabi)/COUNT(guige) AS feipabi, ");
		sql6.append("SUM(feitaifen)/COUNT(guige) AS feitaifen, ");
		sql6.append("SUM(cixuan)/COUNT(guige) AS cixuanfeiliao, ");
		sql6.append("SUM(shouxuanfeiliao)/COUNT(guige) AS shouxuanfeiliao, ");
		sql6.append("SUM(sunhao)/COUNT(guige) AS sunhao ");
		sql6.append("FROM ironinfo WHERE guige ='0.83-25.4'").append(sqlBuffer2).append(" GROUP BY shengchanluhao ");

		ResultSet resultSet1 = null;
		ResultSet resultSet2 = null;
		ResultSet resultSet3 = null;
		ResultSet resultSet4 = null;
		ResultSet resultSet5 = null;
		ResultSet resultSet6 = null;

		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();

			for (int i = 1; i < 17; i++) {
				result6FormBean = new Result6FormBean();
				result6FormBean.setShengchanluhao(String.valueOf(i));
				danluList0.add(result6FormBean);
			}

			resultSet1 = statement.executeQuery(sql1.toString());
			System.out.println("sql1=" + sql1);
			while (resultSet1.next()) {
				result6FormBean = new Result6FormBean();
				result6FormBean.setShengchanluhao(resultSet1.getString("shengchanluhao"));
				result6FormBean.setZongmaozhong(resultSet1.getString("zongmaozhong"));
				result6FormBean.setZongjingzhong(resultSet1.getString("zongjingzhong"));
				result6FormBean.setChengpinlv(resultSet1.getString("chengpinlv"));
				result6FormBean.setMgdanhao(resultSet1.getString("mgdanhao"));
				result6FormBean.setFe(resultSet1.getString("fe"));
				result6FormBean.setCl(resultSet1.getString("cl"));
				result6FormBean.setN(resultSet1.getString("n"));
				result6FormBean.setO(resultSet1.getString("o"));
				danluList1.add(result6FormBean);
			}
			// 横向合并list2到list1
			danluList = Utility.getList6ByHashMap(danluList0, danluList1, 1);

			resultSet2 = statement.executeQuery(sql2.toString());
			System.out.println("sql2=" + sql2);
			while (resultSet2.next()) {
				result6FormBean = new Result6FormBean();
				result6FormBean.setShengchanluhao(resultSet2.getString("shengchanluhao"));
				result6FormBean.setJ0Aji(resultSet2.getString("0Aji"));
				danluList2.add(result6FormBean);
			}
			// 横向合并list2到list1
			danluList = Utility.getList6ByHashMap(danluList, danluList2, 2);

			resultSet3 = statement.executeQuery(sql3.toString());
			System.out.println("sql3=" + sql3);
			while (resultSet3.next()) {
				result6FormBean = new Result6FormBean();
				result6FormBean.setShengchanluhao(resultSet3.getString("shengchanluhao"));
				result6FormBean.setJ0ji(resultSet3.getString("0ji"));
				danluList3.add(result6FormBean);
			}

			danluList = Utility.getList6ByHashMap(danluList, danluList3, 3);

			resultSet4 = statement.executeQuery(sql4.toString());
			System.out.println("sql4=" + sql4);
			while (resultSet4.next()) {
				result6FormBean = new Result6FormBean();
				result6FormBean.setShengchanluhao(resultSet4.getString("shengchanluhao"));
				result6FormBean.setJ1ji(resultSet4.getString("1ji"));
				danluList4.add(result6FormBean);
			}

			danluList = Utility.getList6ByHashMap(danluList, danluList4, 4);

			resultSet5 = statement.executeQuery(sql5.toString());
			System.out.println("sql5=" + sql5);
			while (resultSet5.next()) {
				result6FormBean = new Result6FormBean();
				result6FormBean.setShengchanluhao(resultSet5.getString("shengchanluhao"));
				result6FormBean.setJ2jijiyixia(resultSet5.getString("2jijiyixia"));
				danluList5.add(result6FormBean);
			}

			danluList = Utility.getList6ByHashMap(danluList, danluList5, 5);

			resultSet6 = statement.executeQuery(sql6.toString());
			System.out.println("sql6=" + sql6);
			while (resultSet6.next()) {
				result6FormBean = new Result6FormBean();
				result6FormBean.setShengchanluhao(resultSet6.getString("shengchanluhao"));
				result6FormBean.setZonglucishu(resultSet6.getString("zonglucishu"));
				result6FormBean.setDipi(resultSet6.getString("dipi"));
				result6FormBean.setShangmao(resultSet6.getString("shangmao"));
				result6FormBean.setPabi(resultSet6.getString("pabi"));
				result6FormBean.setFeidipi(resultSet6.getString("feidipi"));
				result6FormBean.setFeishangmao(resultSet6.getString("feishangmao"));
				result6FormBean.setFeipabi(resultSet6.getString("feipabi"));
				result6FormBean.setFeitaifen(resultSet6.getString("feitaifen"));
				result6FormBean.setCixuanfeiliao(resultSet6.getString("cixuanfeiliao"));
				result6FormBean.setShouxuanfeiliao(resultSet6.getString("shouxuanfeiliao"));
				result6FormBean.setSunhao(resultSet6.getString("sunhao"));
				danluList6.add(result6FormBean);
			}

			danluList = Utility.getList6ByHashMap(danluList, danluList6, 6);

			return danluList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	/**
	 * @param request
	 * @param sqlCondition
	 *            检索条件
	 * @return 月还渗炉次生产数据汇总表
	 * @throws Exception
	 */
	public ArrayList<Result7FormBean> getYueluList(HttpServletRequest request, String sqlCondition) throws Exception {

		ArrayList<Result7FormBean> yueluList = new ArrayList<Result7FormBean>();
		ArrayList<Result7FormBean> yueluList0 = new ArrayList<Result7FormBean>();
		ArrayList<Result7FormBean> yueluList1 = new ArrayList<Result7FormBean>();
		ArrayList<Result7FormBean> yueluList2 = new ArrayList<Result7FormBean>();
		ArrayList<Result7FormBean> yueluList3 = new ArrayList<Result7FormBean>();
		ArrayList<Result7FormBean> yueluList4 = new ArrayList<Result7FormBean>();
		ArrayList<Result7FormBean> yueluList5 = new ArrayList<Result7FormBean>();
		ArrayList<Result7FormBean> yueluList6 = new ArrayList<Result7FormBean>();

		Result7FormBean result7FormBean = new Result7FormBean();

		StringBuffer sql1 = new StringBuffer();
		StringBuffer sql2 = new StringBuffer();
		StringBuffer sql3 = new StringBuffer();
		StringBuffer sql4 = new StringBuffer();
		StringBuffer sql5 = new StringBuffer();
		StringBuffer sql6 = new StringBuffer();

		StringBuffer sql1s = new StringBuffer();
		StringBuffer sql2s = new StringBuffer();
		StringBuffer sql3s = new StringBuffer();
		StringBuffer sql4s = new StringBuffer();
		StringBuffer sql5s = new StringBuffer();
		StringBuffer sql6s = new StringBuffer();

		StringBuffer sqlBuffer1 = new StringBuffer();
		StringBuffer sqlBuffer2 = new StringBuffer();
		if (!sqlCondition.equals("")) {
			sqlBuffer1 = sqlBuffer1.append(" WHERE" + sqlCondition);
			sqlBuffer2 = sqlBuffer2.append(" AND" + sqlCondition);
		}

		sql1.append("SELECT ");
		sql1.append("yue,");
		sql1.append("SUM(maozhong) AS zongmaozhong, ");
		sql1.append("SUM(jingzhong)AS zongjingzhong, ");
		sql1.append("SUM(jingzhong)/SUM(maozhong) AS chengpinlv, ");
		sql1.append("SUM(mg)/SUM(maozhong)*1000 AS mgdanhao, ");
		sql1.append("SUM(jingzhong*fe)/SUM(jingzhong) AS fe, ");
		sql1.append("SUM(jingzhong*cl)/SUM(jingzhong) AS cl, ");
		sql1.append("SUM(jingzhong*n)/SUM(jingzhong) AS n, ");
		sql1.append("SUM(jingzhong*o)/SUM(jingzhong) AS o ");
		sql1.append("FROM ironinfo").append(sqlBuffer1).append(" GROUP BY yue ");

		sql2.append("SELECT yue, SUM(jingzhong) AS 0Aji FROM ironinfo WHERE kaohedengji_chumeng = '0A'").append(sqlBuffer2).append(" GROUP BY yue");
		sql3.append("SELECT yue, SUM(jingzhong) AS 0ji FROM ironinfo WHERE kaohedengji_chumeng = '0'").append(sqlBuffer2).append(" GROUP BY yue");
		sql4.append("SELECT yue, SUM(jingzhong) AS 1ji FROM ironinfo WHERE kaohedengji_chumeng = '1'").append(sqlBuffer2).append(" GROUP BY yue");
		sql5.append("SELECT yue, SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng IN (2,3,4,5)").append(sqlBuffer2)
				.append(" GROUP BY yue");

		sql6.append("SELECT ");
		sql6.append("yue, COUNT(guige) AS zonglucishu, ");
		sql6.append("SUM(dipi)/COUNT(guige) AS dipi, ");
		sql6.append("SUM(shangmao)/COUNT(guige) AS shangmao, ");
		sql6.append("SUM(pabi)/COUNT(guige) AS pabi, ");
		sql6.append("SUM(feidipi)/COUNT(guige) AS feidipi, ");
		sql6.append("SUM(feishangmao)/COUNT(guige) AS feishangmao, ");
		sql6.append("SUM(feipabi)/COUNT(guige) AS feipabi, ");
		sql6.append("SUM(feitaifen)/COUNT(guige) AS feitaifen, ");
		sql6.append("SUM(cixuan)/COUNT(guige) AS cixuanfeiliao, ");
		sql6.append("SUM(shouxuanfeiliao)/COUNT(guige) AS shouxuanfeiliao, ");
		sql6.append("SUM(sunhao)/COUNT(guige) AS sunhao ");
		sql6.append("FROM ironinfo WHERE guige ='0.83-25.4'").append(sqlBuffer2).append(" GROUP BY yue ");
		// 合计部分
		sql1s.append("SELECT ");
		sql1s.append("'累计' AS yue,");
		sql1s.append("SUM(maozhong) AS zongmaozhong, ");
		sql1s.append("SUM(jingzhong)AS zongjingzhong, ");
		sql1s.append("SUM(jingzhong)/SUM(maozhong) AS chengpinlv, ");
		sql1s.append("SUM(mg)/SUM(maozhong)*1000 AS mgdanhao, ");
		sql1s.append("SUM(jingzhong*fe)/SUM(jingzhong) AS fe, ");
		sql1s.append("SUM(jingzhong*cl)/SUM(jingzhong) AS cl, ");
		sql1s.append("SUM(jingzhong*n)/SUM(jingzhong) AS n, ");
		sql1s.append("SUM(jingzhong*o)/SUM(jingzhong) AS o ");
		sql1s.append("FROM ironinfo").append(sqlBuffer1);

		sql2s.append("SELECT SUM(jingzhong) AS 0Aji FROM ironinfo WHERE kaohedengji_chumeng = '0A'").append(sqlBuffer2);
		sql3s.append("SELECT SUM(jingzhong) AS 0ji FROM ironinfo WHERE kaohedengji_chumeng = '0'").append(sqlBuffer2);
		sql4s.append("SELECT SUM(jingzhong) AS 1ji FROM ironinfo WHERE kaohedengji_chumeng = '1'").append(sqlBuffer2);
		sql5s.append("SELECT SUM(jingzhong) AS 2jijiyixia FROM ironinfo WHERE kaohedengji_chumeng IN (2,3,4,5)").append(sqlBuffer2);

		sql6s.append("SELECT ");
		sql6s.append("COUNT(guige) AS zonglucishu, ");
		sql6s.append("SUM(dipi)/COUNT(guige) AS dipi, ");
		sql6s.append("SUM(shangmao)/COUNT(guige) AS shangmao, ");
		sql6s.append("SUM(pabi)/COUNT(guige) AS pabi, ");
		sql6s.append("SUM(feidipi)/COUNT(guige) AS feidipi, ");
		sql6s.append("SUM(feishangmao)/COUNT(guige) AS feishangmao, ");
		sql6s.append("SUM(feipabi)/COUNT(guige) AS feipabi, ");
		sql6s.append("SUM(feitaifen)/COUNT(guige) AS feitaifen, ");
		sql6s.append("SUM(cixuan)/COUNT(guige) AS cixuanfeiliao, ");
		sql6s.append("SUM(shouxuanfeiliao)/COUNT(guige) AS shouxuanfeiliao, ");
		sql6s.append("SUM(sunhao)/COUNT(guige) AS sunhao ");
		sql6s.append("FROM ironinfo WHERE guige ='0.83-25.4'").append(sqlBuffer2);

		ResultSet resultSet1 = null;
		ResultSet resultSet2 = null;
		ResultSet resultSet3 = null;
		ResultSet resultSet4 = null;
		ResultSet resultSet5 = null;
		ResultSet resultSet6 = null;

		ResultSet resultSet1s = null;
		ResultSet resultSet2s = null;
		ResultSet resultSet3s = null;
		ResultSet resultSet4s = null;
		ResultSet resultSet5s = null;
		ResultSet resultSet6s = null;

		Statement statement = null;

		try {
			super.Open();
			statement = super.Conn().createStatement();

			for (int i = 1; i < 13; i++) {
				result7FormBean = new Result7FormBean();
				result7FormBean.setYue(String.valueOf(i));
				yueluList0.add(result7FormBean);
			}

			resultSet1 = statement.executeQuery(sql1.toString());
			System.out.println("sql1=" + sql1);
			while (resultSet1.next()) {
				result7FormBean = new Result7FormBean();
				result7FormBean.setYue(resultSet1.getString("yue"));
				result7FormBean.setZongmaozhong(resultSet1.getString("zongmaozhong"));
				result7FormBean.setZongjingzhong(resultSet1.getString("zongjingzhong"));
				result7FormBean.setChengpinlv(resultSet1.getString("chengpinlv"));
				result7FormBean.setMgdanhao(resultSet1.getString("mgdanhao"));
				result7FormBean.setFe(resultSet1.getString("fe"));
				result7FormBean.setCl(resultSet1.getString("cl"));
				result7FormBean.setN(resultSet1.getString("n"));
				result7FormBean.setO(resultSet1.getString("o"));
				yueluList1.add(result7FormBean);
			}
			// 横向合并list2到list1
			yueluList = Utility.getList7ByHashMap(yueluList0, yueluList1, 1);

			resultSet2 = statement.executeQuery(sql2.toString());
			System.out.println("sql2=" + sql2);
			while (resultSet2.next()) {
				result7FormBean = new Result7FormBean();
				result7FormBean.setYue(resultSet2.getString("yue"));
				result7FormBean.setJ0Aji(resultSet2.getString("0Aji"));
				yueluList2.add(result7FormBean);
			}
			// 横向合并list2到list1
			yueluList = Utility.getList7ByHashMap(yueluList, yueluList2, 2);

			resultSet3 = statement.executeQuery(sql3.toString());
			System.out.println("sql3=" + sql3);
			while (resultSet3.next()) {
				result7FormBean = new Result7FormBean();
				result7FormBean.setYue(resultSet3.getString("yue"));
				result7FormBean.setJ0ji(resultSet3.getString("0ji"));
				yueluList3.add(result7FormBean);
			}

			yueluList = Utility.getList7ByHashMap(yueluList, yueluList3, 3);

			resultSet4 = statement.executeQuery(sql4.toString());
			System.out.println("sql4=" + sql4);
			while (resultSet4.next()) {
				result7FormBean = new Result7FormBean();
				result7FormBean.setYue(resultSet4.getString("yue"));
				result7FormBean.setJ1ji(resultSet4.getString("1ji"));
				yueluList4.add(result7FormBean);
			}

			yueluList = Utility.getList7ByHashMap(yueluList, yueluList4, 4);

			resultSet5 = statement.executeQuery(sql5.toString());
			System.out.println("sql5=" + sql5);
			while (resultSet5.next()) {
				result7FormBean = new Result7FormBean();
				result7FormBean.setYue(resultSet5.getString("yue"));
				result7FormBean.setJ2jijiyixia(resultSet5.getString("2jijiyixia"));
				yueluList5.add(result7FormBean);
			}

			yueluList = Utility.getList7ByHashMap(yueluList, yueluList5, 5);

			resultSet6 = statement.executeQuery(sql6.toString());
			System.out.println("sql6=" + sql6);
			while (resultSet6.next()) {
				result7FormBean = new Result7FormBean();
				result7FormBean.setYue(resultSet6.getString("yue"));
				result7FormBean.setZonglucishu(resultSet6.getString("zonglucishu"));
				result7FormBean.setDipi(resultSet6.getString("dipi"));
				result7FormBean.setShangmao(resultSet6.getString("shangmao"));
				result7FormBean.setPabi(resultSet6.getString("pabi"));
				result7FormBean.setFeidipi(resultSet6.getString("feidipi"));
				result7FormBean.setFeishangmao(resultSet6.getString("feishangmao"));
				result7FormBean.setFeipabi(resultSet6.getString("feipabi"));
				result7FormBean.setFeitaifen(resultSet6.getString("feitaifen"));
				result7FormBean.setCixuanfeiliao(resultSet6.getString("cixuanfeiliao"));
				result7FormBean.setShouxuanfeiliao(resultSet6.getString("shouxuanfeiliao"));
				result7FormBean.setSunhao(resultSet6.getString("sunhao"));
				yueluList6.add(result7FormBean);
			}

			yueluList = Utility.getList7ByHashMap(yueluList, yueluList6, 6);

			// 合计部分
			result7FormBean = new Result7FormBean();
			resultSet1s = statement.executeQuery(sql1s.toString());
			System.out.println("sql1s=" + sql1s);
			while (resultSet1s.next()) {
				result7FormBean = new Result7FormBean();
				result7FormBean.setYue(resultSet1s.getString("yue"));
				result7FormBean.setZongmaozhong(resultSet1s.getString("zongmaozhong"));
				result7FormBean.setZongjingzhong(resultSet1s.getString("zongjingzhong"));
				result7FormBean.setChengpinlv(Output.getPValue(resultSet1s.getString("chengpinlv")));
				result7FormBean.setMgdanhao(Output.getSubValue(resultSet1s.getString("mgdanhao"), 3));
				result7FormBean.setFe(Output.getSubValue(resultSet1s.getString("fe"), 4));
				result7FormBean.setCl(Output.getSubValue(resultSet1s.getString("cl"), 4));
				result7FormBean.setN(Output.getSubValue(resultSet1s.getString("n"), 4));
				result7FormBean.setO(Output.getSubValue(resultSet1s.getString("o"), 4));
			}

			resultSet2s = statement.executeQuery(sql2s.toString());
			System.out.println("sql2s=" + sql2s);
			while (resultSet2s.next()) {
				result7FormBean.setJ0Aji(resultSet2s.getString("0Aji"));
				if (resultSet2s.getString("0Aji") != null)
					result7FormBean.setJ0Ajilv(Output.getPValue(resultSet2s.getString("0Aji"), result7FormBean.getZongmaozhong()));
			}

			resultSet3s = statement.executeQuery(sql3s.toString());
			System.out.println("sql3s=" + sql3s);
			while (resultSet3s.next()) {
				result7FormBean.setJ0ji(resultSet3s.getString("0ji"));
				if (resultSet3s.getString("0ji") != null)
					result7FormBean.setJ0jilv(Output.getPValue(resultSet3s.getString("0ji"), result7FormBean.getZongmaozhong()));
			}

			resultSet4s = statement.executeQuery(sql4s.toString());
			System.out.println("sql4s=" + sql4s);
			while (resultSet4s.next()) {
				result7FormBean.setJ1ji(resultSet4s.getString("1ji"));
				if (resultSet4s.getString("1ji") != null)
					result7FormBean.setJ1jilv(Output.getPValue(resultSet4s.getString("1ji"), result7FormBean.getZongmaozhong()));
			}

			resultSet5s = statement.executeQuery(sql5s.toString());
			System.out.println("sql5s=" + sql5s);
			while (resultSet5s.next()) {
				result7FormBean.setJ2jijiyixia(resultSet5s.getString("2jijiyixia"));
				if (resultSet5s.getString("2jijiyixia") != null)
					result7FormBean.setJ2jijiyixialv(Output.getPValue(resultSet5s.getString("2jijiyixia"), result7FormBean.getZongmaozhong()));
			}

			resultSet6s = statement.executeQuery(sql6s.toString());
			System.out.println("sql6s=" + sql6s);
			while (resultSet6s.next()) {
				result7FormBean.setZonglucishu(Output.getSubValue(resultSet6s.getString("zonglucishu"), 0));
				result7FormBean.setDipi(Output.getSubValue(resultSet6s.getString("dipi"), 0));
				result7FormBean.setShangmao(Output.getSubValue(resultSet6s.getString("shangmao"), 0));
				result7FormBean.setPabi(Output.getSubValue(resultSet6s.getString("pabi"), 0));
				result7FormBean.setFeidipi(Output.getSubValue(resultSet6s.getString("feidipi"), 0));
				result7FormBean.setFeishangmao(Output.getSubValue(resultSet6s.getString("feishangmao"), 0));
				result7FormBean.setFeipabi(Output.getSubValue(resultSet6s.getString("feipabi"), 0));
				result7FormBean.setFeitaifen(Output.getSubValue(resultSet6s.getString("feitaifen"), 1));
				result7FormBean.setCixuanfeiliao(Output.getSubValue(resultSet6s.getString("cixuanfeiliao"), 1));
				result7FormBean.setShouxuanfeiliao(Output.getSubValue(resultSet6s.getString("shouxuanfeiliao"), 1));
				result7FormBean.setSunhao(Output.getSubValue(resultSet6s.getString("sunhao"), 1));
			}

			yueluList.add(result7FormBean);
			return yueluList;

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}
	}

	
	/**
	 * 删除全部信息表删除操作
	 * 
	 * @param luci
	 * @param guige
	 * @throws Exception
	 */
	public void delAllInfoList(String luci, String guige) throws Exception {

		StringBuffer sqlBuffer = new StringBuffer();
		int rs = 0;

		sqlBuffer.append("DELETE ");
		sqlBuffer.append("FROM ");
		sqlBuffer.append("ironinfo ");
		sqlBuffer.append("WHERE ");
		sqlBuffer.append("luci = ");
		sqlBuffer.append(luci);
		sqlBuffer.append(" AND ");
		sqlBuffer.append("guige = ");
		sqlBuffer.append(guige);

		String sql = sqlBuffer.toString();
		System.out.println("sql=" + sql);

		Statement statement = null;
		try {
			super.Open();
			statement = super.Conn().createStatement();
			rs = statement.executeUpdate(sql);

		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			super.Close();
		}

	}
	
	public ArrayList<TIronInfoDaoBean> GetAllIronInfo() throws Exception {

		ArrayList<TIronInfoDaoBean> allInfoList = new ArrayList<TIronInfoDaoBean>();

		try {
			Open();
			Statement statement = Conn().createStatement();
			ResultSet resultSet = statement.executeQuery(ConstantSql.T_INRO_INFO_SELECT_ALL);

			TIronInfoDaoBean ironInfoDaoBean = new TIronInfoDaoBean();
			
			while (resultSet.next()) {

				ironInfoDaoBean = new TIronInfoDaoBean();

				//ironInfoDaoBean.setIndex(resultSet.getString("luci") + "~" + resultSet.getString("guige"));
				ironInfoDaoBean.setYearMonthDay(resultSet.getString("riqi"));
				ironInfoDaoBean.setQiHao(resultSet.getString("qihao"));
				ironInfoDaoBean.setLuCi(resultSet.getString("luci"));
//				if (!"".equals(resultSet.getString("junpin"))) {
//					ironInfoDaoBean.setJunPin("(" + resultSet.getString("junpin") + ")");
//				} else {
//					ironInfoDaoBean.setGuiGe(resultSet.getString("junpin"));
//				}
				ironInfoDaoBean.setGuiGe(resultSet.getString("guige"));
				ironInfoDaoBean.setShengChanLuHao(resultSet.getString("shengchanluhao"));
				ironInfoDaoBean.setFanYingQiHao(resultSet.getString("fanyingqihao"));
				ironInfoDaoBean.setShiYongCiShu(resultSet.getString("shiyongcishu"));
				ironInfoDaoBean.setMg(resultSet.getString("mg"));
				ironInfoDaoBean.setTiCl4(resultSet.getString("ticl"));
				ironInfoDaoBean.setMaoZhong(resultSet.getString("maozhong"));
				ironInfoDaoBean.setJingZhong(resultSet.getString("jingzhong"));
				if (resultSet.getString("chengpinlv") != null)
					ironInfoDaoBean.setChengPinLv(resultSet.getString("chengpinlv"));
					//ironInfoDaoBean.setChengPinLv(Output.getPValue(resultSet.getString("chengpinlv")));
				ironInfoDaoBean.setYuanSuFe(resultSet.getString("fe"));
				ironInfoDaoBean.setYuanSuSi(resultSet.getString("si"));
				ironInfoDaoBean.setYuanSuCl(resultSet.getString("cl"));
				ironInfoDaoBean.setYuanSuC(resultSet.getString("c"));
				ironInfoDaoBean.setYuanSuC(resultSet.getString("n"));
				ironInfoDaoBean.setYuanSuO(resultSet.getString("o"));
				ironInfoDaoBean.setYuanSuH(resultSet.getString("h"));
				ironInfoDaoBean.setYuanSuMn(resultSet.getString("mn"));
				ironInfoDaoBean.setYuanSuHb(resultSet.getString("hb"));
				ironInfoDaoBean.setDengJiHanMeng(resultSet.getString("dengji_hanmeng"));
				ironInfoDaoBean.setKaoHeDengJiChuMeng(resultSet.getString("kaohedengji_chumeng"));
				ironInfoDaoBean.setGongYiTiaoZheng(resultSet.getString("gongyitiaozheng"));
				ironInfoDaoBean.setGongYiShiYan(resultSet.getString("gongyishiyan"));
				ironInfoDaoBean.setDiPiKg(resultSet.getString("dipi"));
				ironInfoDaoBean.setShangMaoKg(resultSet.getString("shangmao"));
				ironInfoDaoBean.setPaBiKg(resultSet.getString("pabi"));
				ironInfoDaoBean.setFeiDiPiKg(resultSet.getString("feidipi"));
				ironInfoDaoBean.setFeiShangMaoKg(resultSet.getString("feishangmao"));
				ironInfoDaoBean.setFeiPaBiKg(resultSet.getString("feipabi"));
				ironInfoDaoBean.setFeiTaiFenKg(resultSet.getString("feitaifen"));
				ironInfoDaoBean.setCiYuanKg(resultSet.getString("cixuan"));
				ironInfoDaoBean.setShouXuanFeiLiaoKg(resultSet.getString("shouxuanfeiliao"));
				ironInfoDaoBean.setSunHaoKg(resultSet.getString("sunhao"));
				ironInfoDaoBean.setZongPaiMeiLiangKg(resultSet.getString("zongpaimeiliang"));
				ironInfoDaoBean.setChuLuZhenKongDu(resultSet.getString("chuluzhenkongdu"));
				ironInfoDaoBean.setYuanZuiGaoWenDu(resultSet.getString("huanyuanzuigaowendu"));
				ironInfoDaoBean.setZhengLiuGaoHengDian(resultSet.getString("zhengliugaoheng"));
				ironInfoDaoBean.setZhuanZhengLiu(resultSet.getString("zhuanzhengliu"));
				ironInfoDaoBean.setJiaShouCi(resultSet.getString("jiashouci"));
				ironInfoDaoBean.setJiaMoCi(resultSet.getString("jiamoci"));
				ironInfoDaoBean.setTongDao(resultSet.getString("tongdao"));
				ironInfoDaoBean.setShengChanGuZhang(resultSet.getString("shengchanguzhang"));
				ironInfoDaoBean.setBeiZhuShuoMing(resultSet.getString("beizhushuoming"));

				allInfoList.add(ironInfoDaoBean);
			}
			Close();
			return allInfoList;
		} catch (Exception exception) {
			throw new Exception("SQLException: " + exception.getMessage());
		} finally {
			Close();
		}
	}

}
